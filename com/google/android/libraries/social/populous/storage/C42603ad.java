package com.google.android.libraries.social.populous.storage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.util.Log;
import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.common.base.C58872ci;
import com.google.p4181bi.C55847i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.social.populous.storage.ad */
/* compiled from: PG */
final class C42603ad extends C3937a {

    /* renamed from: c */
    final /* synthetic */ C42604ae f111793c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42603ad(C42604ae aeVar) {
        super(9, 10);
        this.f111793c = aeVar;
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        ContentValues contentValues;
        Cursor b;
        C42591z zVar = this.f111793c.f111794a;
        C58872ci b2 = zVar == null ? null : zVar.mo45632b();
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("ALTER TABLE `Contacts` ADD COLUMN `type` TEXT NOT NULL DEFAULT 'PERSON'");
        dVar2.f12902a.execSQL("CREATE INDEX IF NOT EXISTS `index_Contacts_type` ON `Contacts` (`type`)");
        HashMap hashMap = new HashMap();
        try {
            b = dVar.mo8242b("SELECT * FROM Contacts");
            int columnIndexOrThrow = b.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = b.getColumnIndexOrThrow("proto_bytes");
            while (b.moveToNext()) {
                if (!b.isNull(columnIndexOrThrow2)) {
                    long j = b.getLong(columnIndexOrThrow);
                    C55847i iVar = (C55847i) C62942bv.parseFrom((C62942bv) C55847i.f147358c, b.getBlob(columnIndexOrThrow2), C62921ba.m95368a());
                    if (iVar.f147360a == 2) {
                        hashMap.put(String.valueOf(j), C42309ch.m74493b(iVar));
                    }
                }
            }
            if (b != null) {
                b.close();
            }
        } catch (C62974ct e) {
            hashMap.clear();
            Log.e("DatabaseMigrations", "Error parsing contact proto bytes.", e);
            C42591z zVar2 = this.f111793c.f111794a;
            if (zVar2 != null) {
                C42579n a = zVar2.mo45631a(C42576k.f111734a);
                a.mo45673h(14);
                a.mo45674i(21);
                a.mo45670e(e);
                a.mo45666a();
            }
            dVar2.f12902a.execSQL("DELETE FROM CacheInfo");
            dVar2.f12902a.execSQL("DELETE FROM Contacts");
            dVar2.f12902a.execSQL("DELETE FROM Tokens");
        } catch (Throwable th) {
            C42602ac.m75263a(th, th);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("type", ((C42309ch) entry.getValue()).name());
            dVar.mo8255n("Contacts", 4, contentValues2, "id = ?", new String[]{(String) entry.getKey()});
        }
        Cursor b3 = dVar.mo8242b("SELECT * FROM CacheInfo");
        try {
            if (b3.moveToFirst()) {
                contentValues = new ContentValues(b3.getColumnCount());
                DatabaseUtils.cursorRowToContentValues(b3, contentValues);
            } else {
                contentValues = null;
            }
            if (b3 != null) {
                b3.close();
            }
            dVar2.f12902a.execSQL("DROP TABLE IF EXISTS `CacheInfo`");
            dVar2.f12902a.execSQL("CREATE TABLE IF NOT EXISTS `CacheInfo` (`rowid` INTEGER NOT NULL, `last_updated` INTEGER NOT NULL, `num_contacts` INTEGER NOT NULL DEFAULT 0, `affinity_response_context` BLOB, PRIMARY KEY(`rowid`))");
            if (contentValues != null) {
                dVar2.f12902a.insertWithOnConflict("CacheInfo", (String) null, contentValues, 5);
            }
            C42591z zVar3 = this.f111793c.f111794a;
            if (zVar3 != null && b2 != null) {
                zVar3.mo45638h(64, b2, C42576k.f111734a);
                return;
            }
            return;
        } catch (Throwable th2) {
            C42602ac.m75263a(th, th2);
        }
        throw th;
        throw th;
    }
}
