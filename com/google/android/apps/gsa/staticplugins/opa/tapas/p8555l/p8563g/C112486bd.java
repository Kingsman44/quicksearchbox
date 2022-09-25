package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.common.p4522b.C58490gz;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.bd */
/* compiled from: PG */
public final /* synthetic */ class C112486bd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C112519cj f312014a;

    /* renamed from: b */
    public final /* synthetic */ C58490gz f312015b;

    public /* synthetic */ C112486bd(C112519cj cjVar, C58490gz gzVar) {
        this.f312014a = cjVar;
        this.f312015b = gzVar;
    }

    public final void run() {
        C112519cj cjVar = this.f312014a;
        C58490gz gzVar = this.f312015b;
        for (Map.Entry entry : cjVar.f312071d.entrySet()) {
            ((C112518ci) entry.getValue()).mo99559a();
            gzVar.mo55429h((C48634bw) entry.getKey(), new C112518ci(cjVar, (C48634bw) entry.getKey(), ((C112518ci) entry.getValue()).f312062b));
        }
        cjVar.f312071d.clear();
        cjVar.f312071d.putAll(gzVar.mo55427f(false));
        cjVar.f312085r = Optional.empty();
    }
}
