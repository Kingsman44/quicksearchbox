package androidx.work.impl;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.work.impl.i */
/* compiled from: PG */
public final class C4553i extends C3937a {

    /* renamed from: c */
    public static final C4553i f14382c = new C4553i();

    private C4553i() {
        super(3, 4);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        ((C4035d) dVar).f12902a.execSQL("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
