package androidx.work.impl;

import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.p188a.C4035d;

/* renamed from: androidx.work.impl.f */
/* compiled from: PG */
public final class C4541f extends C3937a {

    /* renamed from: c */
    public static final C4541f f14352c = new C4541f();

    private C4541f() {
        super(12, 13);
    }

    /* renamed from: a */
    public final void mo8220a(C4049d dVar) {
        C4035d dVar2 = (C4035d) dVar;
        dVar2.f12902a.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        dVar2.f12902a.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
