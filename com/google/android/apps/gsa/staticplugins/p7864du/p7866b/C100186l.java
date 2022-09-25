package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.l */
/* compiled from: PG */
public final class C100186l extends SQLiteOpenHelper {

    /* renamed from: b */
    private static final C59071e f280208b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.du.b.l");

    /* renamed from: a */
    public boolean f280209a;

    /* renamed from: c */
    private final C100190p f280210c;

    public C100186l(Context context, String str, C100190p pVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 12);
        this.f280210c = pVar;
    }

    /* renamed from: a */
    private static String[] m166022a() {
        return new String[]{"CREATE TABLE blob_table (_ID INTEGER PRIMARY KEY, blob_key TEXT NOT NULL, blob BLOB, size_b INT, expire INT NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS blob_table_key_index ON blob_table (blob_key)", "CREATE INDEX IF NOT EXISTS blob_table_expire_index ON blob_table (expire)", "CREATE TABLE attribute_table (_ID INTEGER PRIMARY KEY, blob_id INT NOT NULL, attribute_id INT NOT NULL, text_attribute_value TEXT, long_attribute_value INT, real_attribute_value REAL,FOREIGN KEY (blob_id) REFERENCES blob_table ON DELETE CASCADE)", "CREATE INDEX IF NOT EXISTS attribute_table_id_index ON attribute_table (blob_id)", "CREATE UNIQUE INDEX IF NOT EXISTS attribute_table_blob_attribute_index ON attribute_table (blob_id, attribute_id)", "CREATE INDEX IF NOT EXISTS attribute_table_index ON attribute_table (attribute_id, text_attribute_value, long_attribute_value, real_attribute_value, blob_id)", "ALTER TABLE attribute_table ADD COLUMN boolean_attribute_value INT", "DROP INDEX IF EXISTS attribute_table_index", "CREATE INDEX IF NOT EXISTS attribute_table_index ON attribute_table (attribute_id, text_attribute_value, long_attribute_value, real_attribute_value, boolean_attribute_value, blob_id)", "ALTER TABLE blob_table ADD COLUMN blob_path TEXT", "CREATE INDEX IF NOT EXISTS blob_table_blob_path_index ON blob_table (blob_path)"};
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        Long l = (Long) this.f280210c.f280216d.mo6453a();
        if (l == null || l.longValue() < 512 || l.longValue() > 65536 || Long.lowestOneBit(l.longValue()) != l.longValue()) {
            l = null;
        }
        if (l != null) {
            sQLiteDatabase.setPageSize(l.longValue());
        }
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        if (sQLiteDatabase.enableWriteAheadLogging()) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA wal_autocheckpoint=10", (String[]) null);
            try {
                rawQuery.moveToFirst();
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Throwable th) {
                C100185k.m166021a(th, th);
            }
        }
        int i = this.f280210c.f280214b;
        Cursor rawQuery2 = sQLiteDatabase.rawQuery("PRAGMA cache_size=2000", (String[]) null);
        try {
            rawQuery2.moveToFirst();
            if (rawQuery2 != null) {
                rawQuery2.close();
            }
            long j = this.f280210c.f280215c;
            Cursor rawQuery3 = sQLiteDatabase.rawQuery("PRAGMA soft_heap_limit=10485760", (String[]) null);
            try {
                rawQuery3.moveToFirst();
                if (rawQuery3 != null) {
                    rawQuery3.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                C100185k.m166021a(th, th2);
            }
        } catch (Throwable th3) {
            C100185k.m166021a(th, th3);
        }
        throw th;
        throw th;
        throw th;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        onUpgrade(sQLiteDatabase, 0, 12);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((C59052c) ((C59052c) f280208b.mo56225c()).mo56372aa(33196)).mo56393w("ContentStore downgraded; oldVersion: %d, newVersion: %d", i, i2);
        this.f280209a = true;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C58838bb.m90868c(i >= 0);
        C58838bb.m90868c(i < i2);
        C58838bb.m90883r(i2 == 12);
        String[] a = m166022a();
        while (i < i2) {
            sQLiteDatabase.execSQL(a[i]);
            i++;
        }
        ArrayList<String> arrayList = new ArrayList<>(((C58724pq) C100125ad.f279967c).f156474d + ((C58724pq) C100125ad.f279968d).f156474d);
        arrayList.addAll(C100125ad.f279967c);
        arrayList.addAll(C100125ad.f279968d);
        try {
            HashSet g = C58758qx.m90649g(((C58724pq) C100125ad.f279967c).f156474d + ((C58724pq) C100125ad.f279968d).f156474d);
            Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA index_list(blob_table)", new String[0]);
            while (rawQuery.moveToNext()) {
                g.add(rawQuery.getString(1).toLowerCase(Locale.getDefault()));
            }
            rawQuery.close();
            Cursor rawQuery2 = sQLiteDatabase.rawQuery("PRAGMA index_list(attribute_table)", new String[0]);
            while (rawQuery2.moveToNext()) {
                g.add(rawQuery2.getString(1).toLowerCase(Locale.getDefault()));
            }
            rawQuery2.close();
            String[] a2 = m166022a();
            for (String lowerCase : arrayList) {
                String lowerCase2 = lowerCase.toLowerCase(Locale.getDefault());
                if (!g.contains(lowerCase2)) {
                    for (int i3 = 0; i3 < 12; i3++) {
                        String lowerCase3 = a2[i3].toLowerCase(Locale.getDefault());
                        if ((lowerCase3.startsWith("drop index") || lowerCase3.startsWith("create index") || lowerCase3.startsWith("create unique index")) && lowerCase3.contains(lowerCase2)) {
                            sQLiteDatabase.execSQL(a2[i3]);
                        }
                    }
                }
            }
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f280208b.mo56225c()).mo56382g(e)).mo56372aa(33195)).mo56386p("Cannot ensure that indices exist");
        }
    }
}
