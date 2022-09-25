package androidx.work.impl;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.work.impl.l */
/* compiled from: PG */
public final class C4556l extends C3937a {

    /* renamed from: c */
    public static final C4556l f14385c = new C4556l();

    private C4556l() {
        super(7, 8);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        ((C4035d) dVar).f12902a.execSQL("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
