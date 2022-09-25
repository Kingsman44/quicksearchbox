package androidx.work.impl;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.work.impl.m */
/* compiled from: PG */
public final class C4557m extends C3937a {

    /* renamed from: c */
    public static final C4557m f14386c = new C4557m();

    private C4557m() {
        super(8, 9);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        ((C4035d) dVar).f12902a.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
