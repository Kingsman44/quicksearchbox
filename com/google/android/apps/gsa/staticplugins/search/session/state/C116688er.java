package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.er */
/* compiled from: PG */
public final /* synthetic */ class C116688er implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116703ff f323613a;

    /* renamed from: b */
    public final /* synthetic */ String f323614b;

    public /* synthetic */ C116688er(C116703ff ffVar, String str) {
        this.f323613a = ffVar;
        this.f323614b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116703ff ffVar = this.f323613a;
        String str = this.f323614b;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            ffVar.f323638f.mo28212l("incrementCounter", new C116699fb(ffVar, str));
            ffVar.f323634b.mo78582f(str, (String) optional.get(), 300);
        } else {
            ffVar.f323638f.mo28212l("logEvent", new C116689es(ffVar));
        }
        return C118826c.f331422a;
    }
}
