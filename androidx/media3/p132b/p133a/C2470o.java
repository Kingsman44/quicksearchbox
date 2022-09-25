package androidx.media3.p132b.p133a;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import androidx.media3.p131a.C2450a;
import androidx.media3.p131a.C2452c;
import androidx.media3.p131a.C2453d;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.media3.b.a.o */
/* compiled from: PG */
final class C2470o implements C2472q {

    /* renamed from: a */
    public static final String[] f6795a = {"id", "key", "metadata"};

    /* renamed from: b */
    public final SparseArray f6796b = new SparseArray();

    /* renamed from: c */
    public String f6797c;

    /* renamed from: d */
    public String f6798d;

    /* renamed from: e */
    public final C2452c f6799e;

    public C2470o(C2452c cVar) {
        this.f6799e = cVar;
    }

    /* renamed from: e */
    private final void m6505e(SQLiteDatabase sQLiteDatabase, C2469n nVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C2476u uVar = nVar.f6794e;
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        Set<Map.Entry> entrySet = uVar.f6811b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(nVar.f6790a));
        contentValues.put("key", nVar.f6791b);
        contentValues.put("metadata", byteArray);
        String str = this.f6798d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, (String) null, contentValues);
    }

    /* renamed from: a */
    public final void mo5897a(SQLiteDatabase sQLiteDatabase) {
        String str = this.f6797c;
        str.getClass();
        C2453d.m6471b(sQLiteDatabase, 1, str);
        String str2 = this.f6798d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        String str3 = this.f6798d;
        sQLiteDatabase.execSQL("CREATE TABLE " + str3 + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* renamed from: b */
    public final void mo5898b(C2469n nVar) {
        this.f6796b.put(nVar.f6790a, nVar);
    }

    /* renamed from: c */
    public final void mo5899c(HashMap hashMap) {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f6799e.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            mo5897a(writableDatabase);
            for (C2469n e : hashMap.values()) {
                m6505e(writableDatabase, e);
            }
            writableDatabase.setTransactionSuccessful();
            this.f6796b.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e2) {
            throw new C2450a(e2);
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo5900d() {
        SQLiteDatabase writableDatabase;
        if (this.f6796b.size() != 0) {
            try {
                writableDatabase = this.f6799e.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < this.f6796b.size(); i++) {
                    C2469n nVar = (C2469n) this.f6796b.valueAt(i);
                    if (nVar == null) {
                        int keyAt = this.f6796b.keyAt(i);
                        String str = this.f6798d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        m6505e(writableDatabase, nVar);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f6796b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new C2450a(e);
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }
    }
}
