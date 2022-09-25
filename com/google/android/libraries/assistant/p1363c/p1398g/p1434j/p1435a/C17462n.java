package com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a.C17333a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1434j.C17448a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.android.libraries.search.assistant.p2498ac.p2499a.p2500a.C32432a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.c.g.j.a.n */
/* compiled from: PG */
public final class C17462n {

    /* renamed from: a */
    public static final C59071e f50422a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.j.a.n");

    /* renamed from: b */
    public final Executor f50423b;

    /* renamed from: c */
    public final C32432a f50424c;

    /* renamed from: d */
    public final C58881cr f50425d;

    /* renamed from: e */
    public final C17477am f50426e;

    /* renamed from: f */
    public final C17333a f50427f = new C17333a();

    /* renamed from: g */
    private final AtomicBoolean f50428g = new AtomicBoolean(false);

    public C17462n(C17522y yVar, C17477am amVar, Executor executor, C32432a aVar, C17456h hVar) {
        this.f50423b = executor;
        this.f50424c = aVar;
        this.f50426e = amVar;
        this.f50425d = C58886cw.m90973a(new C17458j(this, hVar, yVar));
    }

    /* renamed from: a */
    public final void mo23370a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f50428g.compareAndSet(false, true)) {
            ((C17448a) this.f50425d.mo6453a()).mo23362b();
            this.f50423b.execute(C47810es.m84977q(new C17457i(this)));
        }
    }
}
