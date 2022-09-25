package com.google.android.apps.gsa.nga.engine.p6096p;

import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.p.m */
/* compiled from: PG */
public final /* synthetic */ class C77456m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C77467x f213480a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f213481b;

    /* renamed from: c */
    public final /* synthetic */ MessageLite f213482c;

    public /* synthetic */ C77456m(C77467x xVar, C65753ak akVar, MessageLite messageLite) {
        this.f213480a = xVar;
        this.f213481b = akVar;
        this.f213482c = messageLite;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C77467x xVar = this.f213480a;
        C65753ak akVar = this.f213481b;
        MessageLite messageLite = this.f213482c;
        Optional d = xVar.f213497d.mo72021b().mo72038d();
        if (d.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        return xVar.f213495b.a((String) d.get(), akVar, (String) null, C63662ac.f172144a, messageLite);
    }
}
