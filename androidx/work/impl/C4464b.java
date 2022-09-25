package androidx.work.impl;

import androidx.p182p.C3920ac;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.work.impl.b */
/* compiled from: PG */
public final class C4464b extends C3920ac {

    /* renamed from: a */
    public static final C4464b f14201a = new C4464b();

    private C4464b() {
    }

    /* renamed from: a */
    public final void mo8162a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.beginTransaction();
        try {
            ((C4035d) dVar).f12902a.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + (System.currentTimeMillis() - C4628z.f14542a) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ((C4035d) dVar).f12902a.setTransactionSuccessful();
        } finally {
            dVar2.f12902a.endTransaction();
        }
    }
}
