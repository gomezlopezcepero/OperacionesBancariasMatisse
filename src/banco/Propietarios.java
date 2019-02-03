/*
 * Propietarios.java
 *
 * Generated with Matisse Schema Definition Language 9.1.10
 * Generation date: Wed Apr 04 13:39:47 2018
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package banco;

import com.matisse.reflect.*;

/**
 * <code>Propietarios</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Propietarios extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.10
     * Generation Date: Wed Apr 04 13:39:47 2018
     */

    /*
     * Class variables and methods
     */

    /** Class <code>Propietarios</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("banco.Propietarios"));

    /**
     * Gets the <code>Propietarios</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public Propietarios(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Propietarios(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Propietarios.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Propietarios.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(Propietarios.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Propietarios.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'Id_Propietario' */

    /** Attribute <code>Id_Propietario</code> cache ID */
    private static int id_PropietarioCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Id_Propietario",CID));

    /**
     * Gets the <code>Id_Propietario</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getId_PropietarioAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(id_PropietarioCID);
    }


    /**
     * Gets the <code>Id_Propietario</code> attribute value.
     * @return the value
     *
     * @see #setId_Propietario
     * @see #removeId_Propietario
     */
    public final int getId_Propietario() {
        return getInteger(getId_PropietarioAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Id_Propietario</code> attribute value.
     * @param val the new value
     *
     * @see #getId_Propietario
     * @see #removeId_Propietario
     */
    public final void setId_Propietario(int val) {
        setInteger(getId_PropietarioAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Id_Propietario</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getId_Propietario
     * @see #setId_Propietario
     */
    public final void removeId_Propietario() {
        removeValue(getId_PropietarioAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getId_Propietario
     * @see #setId_Propietario
     */
    public final boolean isId_PropietarioDefaultValue() {
        return isDefaultValue(getId_PropietarioAttribute(getMtDatabase()));
    }


    /* Attribute 'DNI' */

    /** Attribute <code>DNI</code> cache ID */
    private static int dNICID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("DNI",CID));

    /**
     * Gets the <code>DNI</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getDNIAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(dNICID);
    }


    /**
     * Gets the <code>DNI</code> attribute value.
     * @return the value
     *
     * @see #setDNI
     * @see #removeDNI
     */
    public final String getDNI() {
        return getString(getDNIAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>DNI</code> attribute value.
     * @param val the new value
     *
     * @see #getDNI
     * @see #removeDNI
     */
    public final void setDNI(String val) {
        setString(getDNIAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>DNI</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDNI
     * @see #setDNI
     */
    public final void removeDNI() {
        removeValue(getDNIAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDNI
     * @see #setDNI
     */
    public final boolean isDNIDefaultValue() {
        return isDefaultValue(getDNIAttribute(getMtDatabase()));
    }


    /* Attribute 'Usuario' */

    /** Attribute <code>Usuario</code> cache ID */
    private static int usuarioCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Usuario",CID));

    /**
     * Gets the <code>Usuario</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getUsuarioAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(usuarioCID);
    }


    /**
     * Gets the <code>Usuario</code> attribute value.
     * @return the value
     *
     * @see #setUsuario
     * @see #removeUsuario
     */
    public final String getUsuario() {
        return getString(getUsuarioAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Usuario</code> attribute value.
     * @param val the new value
     *
     * @see #getUsuario
     * @see #removeUsuario
     */
    public final void setUsuario(String val) {
        setString(getUsuarioAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Usuario</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getUsuario
     * @see #setUsuario
     */
    public final void removeUsuario() {
        removeValue(getUsuarioAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getUsuario
     * @see #setUsuario
     */
    public final boolean isUsuarioDefaultValue() {
        return isDefaultValue(getUsuarioAttribute(getMtDatabase()));
    }


    /* Attribute 'Nombre' */

    /** Attribute <code>Nombre</code> cache ID */
    private static int nombreCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Nombre",CID));

    /**
     * Gets the <code>Nombre</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getNombreAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(nombreCID);
    }


    /**
     * Gets the <code>Nombre</code> attribute value.
     * @return the value
     *
     * @see #setNombre
     * @see #removeNombre
     */
    public final String getNombre() {
        return getString(getNombreAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Nombre</code> attribute value.
     * @param val the new value
     *
     * @see #getNombre
     * @see #removeNombre
     */
    public final void setNombre(String val) {
        setString(getNombreAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Nombre</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getNombre
     * @see #setNombre
     */
    public final void removeNombre() {
        removeValue(getNombreAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getNombre
     * @see #setNombre
     */
    public final boolean isNombreDefaultValue() {
        return isDefaultValue(getNombreAttribute(getMtDatabase()));
    }


    /* Attribute 'Primer_Apellido' */

    /** Attribute <code>Primer_Apellido</code> cache ID */
    private static int primer_ApellidoCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Primer_Apellido",CID));

    /**
     * Gets the <code>Primer_Apellido</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getPrimer_ApellidoAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(primer_ApellidoCID);
    }


    /**
     * Gets the <code>Primer_Apellido</code> attribute value.
     * @return the value
     *
     * @see #setPrimer_Apellido
     * @see #removePrimer_Apellido
     */
    public final String getPrimer_Apellido() {
        return getString(getPrimer_ApellidoAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Primer_Apellido</code> attribute value.
     * @param val the new value
     *
     * @see #getPrimer_Apellido
     * @see #removePrimer_Apellido
     */
    public final void setPrimer_Apellido(String val) {
        setString(getPrimer_ApellidoAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Primer_Apellido</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getPrimer_Apellido
     * @see #setPrimer_Apellido
     */
    public final void removePrimer_Apellido() {
        removeValue(getPrimer_ApellidoAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getPrimer_Apellido
     * @see #setPrimer_Apellido
     */
    public final boolean isPrimer_ApellidoDefaultValue() {
        return isDefaultValue(getPrimer_ApellidoAttribute(getMtDatabase()));
    }


    /* Attribute 'Segundo_Apellido' */

    /** Attribute <code>Segundo_Apellido</code> cache ID */
    private static int segundo_ApellidoCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Segundo_Apellido",CID));

    /**
     * Gets the <code>Segundo_Apellido</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getSegundo_ApellidoAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(segundo_ApellidoCID);
    }


    /**
     * Gets the <code>Segundo_Apellido</code> attribute value.
     * @return the value
     *
     * @see #setSegundo_Apellido
     * @see #removeSegundo_Apellido
     */
    public final String getSegundo_Apellido() {
        return getString(getSegundo_ApellidoAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Segundo_Apellido</code> attribute value.
     * @param val the new value
     *
     * @see #getSegundo_Apellido
     * @see #removeSegundo_Apellido
     */
    public final void setSegundo_Apellido(String val) {
        setString(getSegundo_ApellidoAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Segundo_Apellido</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getSegundo_Apellido
     * @see #setSegundo_Apellido
     */
    public final void removeSegundo_Apellido() {
        removeValue(getSegundo_ApellidoAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getSegundo_Apellido
     * @see #setSegundo_Apellido
     */
    public final boolean isSegundo_ApellidoDefaultValue() {
        return isDefaultValue(getSegundo_ApellidoAttribute(getMtDatabase()));
    }


    /* Attribute 'Numero_Secreto' */

    /** Attribute <code>Numero_Secreto</code> cache ID */
    private static int numero_SecretoCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Numero_Secreto",CID));

    /**
     * Gets the <code>Numero_Secreto</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getNumero_SecretoAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(numero_SecretoCID);
    }


    /**
     * Gets the <code>Numero_Secreto</code> attribute value.
     * @return the value
     *
     * @see #setNumero_Secreto
     * @see #removeNumero_Secreto
     */
    public final String getNumero_Secreto() {
        return getString(getNumero_SecretoAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Numero_Secreto</code> attribute value.
     * @param val the new value
     *
     * @see #getNumero_Secreto
     * @see #removeNumero_Secreto
     */
    public final void setNumero_Secreto(String val) {
        setString(getNumero_SecretoAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Numero_Secreto</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getNumero_Secreto
     * @see #setNumero_Secreto
     */
    public final void removeNumero_Secreto() {
        removeValue(getNumero_SecretoAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getNumero_Secreto
     * @see #setNumero_Secreto
     */
    public final boolean isNumero_SecretoDefaultValue() {
        return isDefaultValue(getNumero_SecretoAttribute(getMtDatabase()));
    }


    /*
     * Index access methods
     */

    /* Index 'id_prop' */

    /** Index <code>id_prop</code> cache ID */
    private static int id_propIndexCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtIndex.Loader("banco.id_prop"));

    /**
     * Gets the <code>id_prop</code> index descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return an index descriptor object
     */
    public static com.matisse.reflect.MtIndex getId_propIndex(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtIndex)db.getCachedObject(id_propIndexCID);
    }

    /**
     * Finds one <code>Propietarios</code> object in index <code>id_prop</code>.
     * @param db a database
     * @param id_Propietario search parameter
     * @return the matching <code>Propietarios</code> object or <code>null</code> if none was found
     */
    public static Propietarios lookupId_prop(com.matisse.MtDatabase db, int id_Propietario) {
        return (Propietarios)getId_propIndex(db).lookup(new Object[] {new Integer(id_Propietario)}, getClass(db));
    }

    /**
     * Finds <code>Propietarios</code> objects in index <code>id_prop</code>.
     * @param db a database
     * @param id_Propietario search parameter
     * @return the matching <code>Propietarios</code> objects or an empty array if none was found
     */
    public static Propietarios[] lookupObjectsId_prop(com.matisse.MtDatabase db, int id_Propietario) {
        return (Propietarios[])getId_propIndex(db).lookupObjects(new Object[] {new Integer(id_Propietario)}, getClass(db), Propietarios.class);
    }

    /**
     * Opens an iterator on index <code>id_prop</code> for class <code>Propietarios</code>.
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromId_Propietario search parameter
     * @param toId_Propietario search parameter
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> id_propIterator(com.matisse.MtDatabase db, int fromId_Propietario, int toId_Propietario) {
        return getId_propIndex(db).<E>iterator(new Object[] {new Integer(fromId_Propietario)}, new Object[] {new Integer(toId_Propietario)}, getClass(db), com.matisse.reflect.MtIndex.DIRECT, com.matisse.MtDatabase.MAX_PREFETCHING, Propietarios.class);
    }

    /**
     * Opens an iterator on index <code>id_prop</code> for class <code>Propietarios</code>. 
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromId_Propietario search parameter
     * @param toId_Propietario search parameter
     * @param filterClass a subclass; use <code>null</code> not to restrict iterator to a subclass
     * @param direction MtIndex.DIRECT or MtIndex.REVERSE
     * @param numObjPerBuffer maximum number of objects to be retrieved in each request to server
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> id_propIterator(com.matisse.MtDatabase db, int fromId_Propietario, int toId_Propietario, com.matisse.reflect.MtClass filterClass, int direction, int numObjPerBuffer) {
        return getId_propIndex(db).iterator(new Object[] {new Integer(fromId_Propietario)}, new Object[] {new Integer(toId_Propietario)}, filterClass, direction, numObjPerBuffer, Propietarios.class);
    }

    /* Index 'dn2' */

    /** Index <code>dn2</code> cache ID */
    private static int dn2IndexCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtIndex.Loader("banco.dn2"));

    /**
     * Gets the <code>dn2</code> index descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return an index descriptor object
     */
    public static com.matisse.reflect.MtIndex getDn2Index(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtIndex)db.getCachedObject(dn2IndexCID);
    }

    /**
     * Finds one <code>Propietarios</code> object in index <code>dn2</code>.
     * @param db a database
     * @param dNI search parameter
     * @return the matching <code>Propietarios</code> object or <code>null</code> if none was found
     */
    public static Propietarios lookupDn2(com.matisse.MtDatabase db, String dNI) {
        return (Propietarios)getDn2Index(db).lookup(new Object[] {dNI}, getClass(db));
    }

    /**
     * Finds <code>Propietarios</code> objects in index <code>dn2</code>.
     * @param db a database
     * @param dNI search parameter
     * @return the matching <code>Propietarios</code> objects or an empty array if none was found
     */
    public static Propietarios[] lookupObjectsDn2(com.matisse.MtDatabase db, String dNI) {
        return (Propietarios[])getDn2Index(db).lookupObjects(new Object[] {dNI}, getClass(db), Propietarios.class);
    }

    /**
     * Opens an iterator on index <code>dn2</code> for class <code>Propietarios</code>.
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromDNI search parameter
     * @param toDNI search parameter
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> dn2Iterator(com.matisse.MtDatabase db, String fromDNI, String toDNI) {
        return getDn2Index(db).<E>iterator(new Object[] {fromDNI}, new Object[] {toDNI}, getClass(db), com.matisse.reflect.MtIndex.DIRECT, com.matisse.MtDatabase.MAX_PREFETCHING, Propietarios.class);
    }

    /**
     * Opens an iterator on index <code>dn2</code> for class <code>Propietarios</code>. 
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromDNI search parameter
     * @param toDNI search parameter
     * @param filterClass a subclass; use <code>null</code> not to restrict iterator to a subclass
     * @param direction MtIndex.DIRECT or MtIndex.REVERSE
     * @param numObjPerBuffer maximum number of objects to be retrieved in each request to server
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> dn2Iterator(com.matisse.MtDatabase db, String fromDNI, String toDNI, com.matisse.reflect.MtClass filterClass, int direction, int numObjPerBuffer) {
        return getDn2Index(db).iterator(new Object[] {fromDNI}, new Object[] {toDNI}, filterClass, direction, numObjPerBuffer, Propietarios.class);
    }

    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public Propietarios(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Propietarios]";
    }
}