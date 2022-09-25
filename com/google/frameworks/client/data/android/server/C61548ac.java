package com.google.frameworks.client.data.android.server;

import com.google.common.base.C58852bp;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.ac */
/* compiled from: PG */
final class C61548ac extends C70703eh implements C60845bz {

    /* renamed from: a */
    public final C70704ei f166347a;

    /* renamed from: b */
    public final C60870cx f166348b;

    /* renamed from: c */
    final /* synthetic */ C61550ae f166349c;

    /* renamed from: d */
    private final List f166350d = new ArrayList();

    /* renamed from: e */
    private C70703eh f166351e;

    /* renamed from: f */
    private boolean f166352f;

    /* renamed from: g */
    private boolean f166353g;

    public C61548ac(C61550ae aeVar, C70704ei eiVar, C60870cx cxVar) {
        this.f166349c = aeVar;
        this.f166347a = eiVar;
        this.f166348b = cxVar;
    }

    /* renamed from: h */
    private final void m94286h(C70703eh ehVar) {
        if (!this.f166353g) {
            this.f166353g = true;
            for (int i = 0; i < this.f166350d.size(); i++) {
                ((C58852bp) this.f166350d.get(i)).mo40846a(ehVar);
            }
            this.f166350d.clear();
            this.f166353g = false;
        }
    }

    /* renamed from: i */
    private final void m94287i(C58852bp bpVar) {
        this.f166350d.add(bpVar);
        C70703eh ehVar = this.f166351e;
        if (ehVar != null) {
            m94286h(ehVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo51551a() {
        if (!this.f166352f) {
            this.f166352f = true;
            m94287i(C61618z.f166489a);
            this.f166348b.cancel(true);
        }
    }

    /* renamed from: b */
    public final synchronized void mo51552b() {
        m94287i(C61615w.f166486a);
    }

    /* renamed from: c */
    public final synchronized void mo51553c() {
        m94287i(C61617y.f166488a);
    }

    /* renamed from: d */
    public final synchronized void mo51554d(Object obj) {
        m94287i(new C61616x(obj));
    }

    /* renamed from: e */
    public final synchronized void mo51555e() {
        m94287i(C61546aa.f166343a);
    }

    /* renamed from: gl */
    public final synchronized void mo17910gl(Throwable th) {
        this.f166347a.mo39476a(Status.m102100d(th), new C70334de());
    }

    /* renamed from: f */
    public final synchronized C70703eh mo58115f(C61549ad adVar, C70704ei eiVar, C70334de deVar, Object obj) {
        if (this.f166352f) {
            return C61551af.m94300a(eiVar, Status.f186904b.withDescription("call cancelled before instance resolved"));
        }
        return adVar.mo58117b(eiVar, deVar, obj);
    }

    /* renamed from: g */
    public final synchronized void mo17911gm(C70703eh ehVar) {
        ehVar.getClass();
        m94286h(ehVar);
        this.f166351e = ehVar;
    }
}
