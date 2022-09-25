package com.google.android.libraries.social.populous.storage;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.common.base.C58872ci;

/* renamed from: com.google.android.libraries.social.populous.storage.aa */
/* compiled from: PG */
final class C42600aa extends C3937a {

    /* renamed from: c */
    final /* synthetic */ C42604ae f111791c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42600aa(C42604ae aeVar) {
        super(7, 8);
        this.f111791c = aeVar;
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C42591z zVar = this.f111791c.f111794a;
        C58872ci b = zVar == null ? null : zVar.mo45632b();
        ((C4035d) dVar).f12902a.execSQL("ALTER TABLE CacheInfo ADD COLUMN num_contacts INTEGER NOT NULL DEFAULT 0");
        Cursor b2 = dVar.mo8242b("SELECT COUNT(*) FROM Contacts");
        try {
            if (b2.moveToFirst()) {
                long j = b2.getLong(0);
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("num_contacts", Long.valueOf(j));
                dVar.mo8255n("CacheInfo", 4, contentValues, "rowid = 1", new String[0]);
            }
            if (b2 != null) {
                b2.close();
            }
            C42591z zVar2 = this.f111791c.f111794a;
            if (zVar2 != null && b != null) {
                zVar2.mo45638h(64, b, C42576k.f111734a);
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
