(ns fujin.core)

(defmacro deftable [entity & [associations]]
  (let [table-name (name entity)]
    `(defn ~(symbol table-name) [& [command#]]
       (let [i-am-a-select# (nil? command#)
             command# (or command# select)]
         (if i-am-a-select#
           (command# ~table-name)
           (fn [attributes#] (command# ~table-name attributes#)))))))

(defn where [command]
  :id)

(defn values [command attributes]
  (command attributes))

(defn select [table] (format "SELECT * FROM %s" table))

(defn delete [table attributes]
  (format "DELETE FROM %s WHERE %s" table attributes))

(defn insert [table attributes]
  (format "INSERT INTO %s VALUES [%s]" table attributes))

(defn limit [])

(defn belongs-to [entity])

(defn has-one [entity])