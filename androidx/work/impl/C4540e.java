package androidx.work.impl;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.work.impl.e */
/* compiled from: PG */
public final class C4540e extends C3937a {

    /* renamed from: c */
    public static final C4540e f14351c = new C4540e();

    private C4540e() {
        super(11, 12);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        ((C4035d) dVar).f12902a.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
