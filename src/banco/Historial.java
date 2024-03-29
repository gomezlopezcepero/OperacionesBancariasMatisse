/*
 * Historial.java
 *
 * Generated with Matisse Schema Definition Language 9.1.10
 * Generation date: Wed Apr 04 13:39:47 2018
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package banco;

import com.matisse.reflect.*;

/**
 * <code>Historial</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class Historial extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.10
     * Generation Date: Wed Apr 04 13:39:47 2018
     */

    /*
     * Class variables and methods
     */

    /** Class <code>Historial</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("banco.Historial"));

    /**
     * Gets the <code>Historial</code> class descriptor.
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
    public Historial(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected Historial(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(Historial.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, Historial.class);
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
        return getClass(db).<E>ownInstanceIterator(Historial.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, Historial.class);
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

    /* Attribute 'Id_Historial' */

    /** Attribute <code>Id_Historial</code> cache ID */
    private static int id_HistorialCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Id_Historial",CID));

    /**
     * Gets the <code>Id_Historial</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getId_HistorialAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(id_HistorialCID);
    }


    /**
     * Gets the <code>Id_Historial</code> attribute value.
     * @return the value
     *
     * @see #setId_Historial
     * @see #removeId_Historial
     */
    public final int getId_Historial() {
        return getInteger(getId_HistorialAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Id_Historial</code> attribute value.
     * @param val the new value
     *
     * @see #getId_Historial
     * @see #removeId_Historial
     */
    public final void setId_Historial(int val) {
        setInteger(getId_HistorialAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Id_Historial</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getId_Historial
     * @see #setId_Historial
     */
    public final void removeId_Historial() {
        removeValue(getId_HistorialAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getId_Historial
     * @see #setId_Historial
     */
    public final boolean isId_HistorialDefaultValue() {
        return isDefaultValue(getId_HistorialAttribute(getMtDatabase()));
    }


    /* Attribute 'Tipo_Evento' */

    /** Attribute <code>Tipo_Evento</code> cache ID */
    private static int tipo_EventoCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Tipo_Evento",CID));

    /**
     * Gets the <code>Tipo_Evento</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getTipo_EventoAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(tipo_EventoCID);
    }


    /**
     * Gets the <code>Tipo_Evento</code> attribute value.
     * @return the value
     *
     * @see #setTipo_Evento
     * @see #removeTipo_Evento
     */
    public final String getTipo_Evento() {
        return getString(getTipo_EventoAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Tipo_Evento</code> attribute value.
     * @param val the new value
     *
     * @see #getTipo_Evento
     * @see #removeTipo_Evento
     */
    public final void setTipo_Evento(String val) {
        setString(getTipo_EventoAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Tipo_Evento</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getTipo_Evento
     * @see #setTipo_Evento
     */
    public final void removeTipo_Evento() {
        removeValue(getTipo_EventoAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getTipo_Evento
     * @see #setTipo_Evento
     */
    public final boolean isTipo_EventoDefaultValue() {
        return isDefaultValue(getTipo_EventoAttribute(getMtDatabase()));
    }


    /* Attribute 'Fecha_Hora' */

    /** Attribute <code>Fecha_Hora</code> cache ID */
    private static int fecha_HoraCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Fecha_Hora",CID));

    /**
     * Gets the <code>Fecha_Hora</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getFecha_HoraAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(fecha_HoraCID);
    }


    /**
     * Gets the <code>Fecha_Hora</code> attribute value.
     * @return the value
     *
     * @see #setFecha_Hora
     * @see #removeFecha_Hora
     */
    public final String getFecha_Hora() {
        return getString(getFecha_HoraAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Fecha_Hora</code> attribute value.
     * @param val the new value
     *
     * @see #getFecha_Hora
     * @see #removeFecha_Hora
     */
    public final void setFecha_Hora(String val) {
        setString(getFecha_HoraAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Fecha_Hora</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getFecha_Hora
     * @see #setFecha_Hora
     */
    public final void removeFecha_Hora() {
        removeValue(getFecha_HoraAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getFecha_Hora
     * @see #setFecha_Hora
     */
    public final boolean isFecha_HoraDefaultValue() {
        return isDefaultValue(getFecha_HoraAttribute(getMtDatabase()));
    }


    /* Attribute 'Numero_Cuenta' */

    /** Attribute <code>Numero_Cuenta</code> cache ID */
    private static int numero_CuentaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("Numero_Cuenta",CID));

    /**
     * Gets the <code>Numero_Cuenta</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getNumero_CuentaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(numero_CuentaCID);
    }


    /**
     * Gets the <code>Numero_Cuenta</code> attribute value.
     * @return the value
     *
     * @see #setNumero_Cuenta
     * @see #removeNumero_Cuenta
     */
    public final String getNumero_Cuenta() {
        return getString(getNumero_CuentaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>Numero_Cuenta</code> attribute value.
     * @param val the new value
     *
     * @see #getNumero_Cuenta
     * @see #removeNumero_Cuenta
     */
    public final void setNumero_Cuenta(String val) {
        setString(getNumero_CuentaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>Numero_Cuenta</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getNumero_Cuenta
     * @see #setNumero_Cuenta
     */
    public final void removeNumero_Cuenta() {
        removeValue(getNumero_CuentaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getNumero_Cuenta
     * @see #setNumero_Cuenta
     */
    public final boolean isNumero_CuentaDefaultValue() {
        return isDefaultValue(getNumero_CuentaAttribute(getMtDatabase()));
    }


    /*
     * Index access methods
     */

    /* Index 'prim' */

    /** Index <code>prim</code> cache ID */
    private static int primIndexCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtIndex.Loader("banco.prim"));

    /**
     * Gets the <code>prim</code> index descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return an index descriptor object
     */
    public static com.matisse.reflect.MtIndex getPrimIndex(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtIndex)db.getCachedObject(primIndexCID);
    }

    /**
     * Finds one <code>Historial</code> object in index <code>prim</code>.
     * @param db a database
     * @param id_Historial search parameter
     * @return the matching <code>Historial</code> object or <code>null</code> if none was found
     */
    public static Historial lookupPrim(com.matisse.MtDatabase db, int id_Historial) {
        return (Historial)getPrimIndex(db).lookup(new Object[] {new Integer(id_Historial)}, getClass(db));
    }

    /**
     * Finds <code>Historial</code> objects in index <code>prim</code>.
     * @param db a database
     * @param id_Historial search parameter
     * @return the matching <code>Historial</code> objects or an empty array if none was found
     */
    public static Historial[] lookupObjectsPrim(com.matisse.MtDatabase db, int id_Historial) {
        return (Historial[])getPrimIndex(db).lookupObjects(new Object[] {new Integer(id_Historial)}, getClass(db), Historial.class);
    }

    /**
     * Opens an iterator on index <code>prim</code> for class <code>Historial</code>.
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromId_Historial search parameter
     * @param toId_Historial search parameter
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> primIterator(com.matisse.MtDatabase db, int fromId_Historial, int toId_Historial) {
        return getPrimIndex(db).<E>iterator(new Object[] {new Integer(fromId_Historial)}, new Object[] {new Integer(toId_Historial)}, getClass(db), com.matisse.reflect.MtIndex.DIRECT, com.matisse.MtDatabase.MAX_PREFETCHING, Historial.class);
    }

    /**
     * Opens an iterator on index <code>prim</code> for class <code>Historial</code>. 
     * Each indexed attribute has a pair of "from" and "to" parameters which
     * define the search range for that attribute.  With strings, you may use
     * <code>null</code> to start "from" at the beginning or extend "to" to the end.
     * @param <E> a MtObject class     * @param db a database
     * @param fromId_Historial search parameter
     * @param toId_Historial search parameter
     * @param filterClass a subclass; use <code>null</code> not to restrict iterator to a subclass
     * @param direction MtIndex.DIRECT or MtIndex.REVERSE
     * @param numObjPerBuffer maximum number of objects to be retrieved in each request to server
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> primIterator(com.matisse.MtDatabase db, int fromId_Historial, int toId_Historial, com.matisse.reflect.MtClass filterClass, int direction, int numObjPerBuffer) {
        return getPrimIndex(db).iterator(new Object[] {new Integer(fromId_Historial)}, new Object[] {new Integer(toId_Historial)}, filterClass, direction, numObjPerBuffer, Historial.class);
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
    public Historial(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[Historial]";
    }
}
