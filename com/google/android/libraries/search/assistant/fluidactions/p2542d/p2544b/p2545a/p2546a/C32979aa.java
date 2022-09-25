package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C32979aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32985ag f88351a;

    /* renamed from: b */
    public final /* synthetic */ Optional f88352b;

    /* renamed from: c */
    public final /* synthetic */ C52623yp f88353c;

    /* renamed from: d */
    public final /* synthetic */ Set f88354d;

    public /* synthetic */ C32979aa(C32985ag agVar, Optional optional, C52623yp ypVar, Set set) {
        this.f88351a = agVar;
        this.f88352b = optional;
        this.f88353c = ypVar;
        this.f88354d = set;
    }

    public final C60870cx apply(Object obj) {
        C32985ag agVar = this.f88351a;
        Optional optional = this.f88352b;
        C52623yp ypVar = this.f88353c;
        Set set = this.f88354d;
        Optional optional2 = (Optional) obj;
        if (!optional2.isPresent()) {
            return agVar.mo38440h(ypVar, C32985ag.m61065b(optional, Optional.empty(), set));
        }
        if (optional.isPresent() && ((String) optional2.get()).equals(optional.get())) {
            return agVar.mo38437e(ypVar);
        }
        agVar.f88372c.mo38465J((String) optional2.get());
        if (((String) optional2.get()).equals("com.google.android.apps.tachyon")) {
            return agVar.mo38437e(ypVar);
        }
        return agVar.mo38435c(ypVar, (String) optional2.get());
    }
}
