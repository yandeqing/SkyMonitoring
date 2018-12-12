package com.logstacksdk.storage.db.bean;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TC_NOTE".
*/
public class TcNoteDao extends AbstractDao<TcNote, Long> {

    public static final String TABLENAME = "TC_NOTE";

    /**
     * Properties of entity TcNote.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property FirstCloumn = new Property(1, String.class, "firstCloumn", false, "FIRST_CLOUMN");
        public final static Property SecondCloumn = new Property(2, String.class, "secondCloumn", false, "SECOND_CLOUMN");
        public final static Property ThirdCloumn = new Property(3, String.class, "thirdCloumn", false, "THIRD_CLOUMN");
        public final static Property FourCloumn = new Property(4, String.class, "fourCloumn", false, "FOUR_CLOUMN");
        public final static Property Status = new Property(5, Integer.class, "status", false, "STATUS");
    }


    public TcNoteDao(DaoConfig config) {
        super(config);
    }
    
    public TcNoteDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TC_NOTE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"FIRST_CLOUMN\" TEXT," + // 1: firstCloumn
                "\"SECOND_CLOUMN\" TEXT," + // 2: secondCloumn
                "\"THIRD_CLOUMN\" TEXT," + // 3: thirdCloumn
                "\"FOUR_CLOUMN\" TEXT," + // 4: fourCloumn
                "\"STATUS\" INTEGER);"); // 5: status
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TC_NOTE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TcNote entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String firstCloumn = entity.getFirstCloumn();
        if (firstCloumn != null) {
            stmt.bindString(2, firstCloumn);
        }
 
        String secondCloumn = entity.getSecondCloumn();
        if (secondCloumn != null) {
            stmt.bindString(3, secondCloumn);
        }
 
        String thirdCloumn = entity.getThirdCloumn();
        if (thirdCloumn != null) {
            stmt.bindString(4, thirdCloumn);
        }
 
        String fourCloumn = entity.getFourCloumn();
        if (fourCloumn != null) {
            stmt.bindString(5, fourCloumn);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(6, status);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TcNote entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String firstCloumn = entity.getFirstCloumn();
        if (firstCloumn != null) {
            stmt.bindString(2, firstCloumn);
        }
 
        String secondCloumn = entity.getSecondCloumn();
        if (secondCloumn != null) {
            stmt.bindString(3, secondCloumn);
        }
 
        String thirdCloumn = entity.getThirdCloumn();
        if (thirdCloumn != null) {
            stmt.bindString(4, thirdCloumn);
        }
 
        String fourCloumn = entity.getFourCloumn();
        if (fourCloumn != null) {
            stmt.bindString(5, fourCloumn);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(6, status);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TcNote readEntity(Cursor cursor, int offset) {
        TcNote entity = new TcNote( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // firstCloumn
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // secondCloumn
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // thirdCloumn
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // fourCloumn
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5) // status
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TcNote entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setFirstCloumn(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSecondCloumn(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setThirdCloumn(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFourCloumn(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setStatus(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TcNote entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TcNote entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TcNote entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
