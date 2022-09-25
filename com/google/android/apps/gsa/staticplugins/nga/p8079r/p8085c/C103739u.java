package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80529z;
import com.google.android.libraries.geller.portable.C21992s;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.u */
/* compiled from: PG */
public final /* synthetic */ class C103739u implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C80529z f288898a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f288899b;

    /* renamed from: c */
    public final /* synthetic */ String f288900c;

    /* renamed from: d */
    public final /* synthetic */ long f288901d;

    public /* synthetic */ C103739u(C80529z zVar, C65753ak akVar, String str, long j) {
        this.f288898a = zVar;
        this.f288899b = akVar;
        this.f288900c = str;
        this.f288901d = j;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80529z zVar = this.f288898a;
        C65753ak akVar = this.f288899b;
        String str = this.f288900c;
        long j = this.f288901d;
        Geller geller = (Geller) obj;
        String str2 = zVar.f221067b;
        C58838bb.m90884s(!geller.f60382d, "incrementElementUsed() not allowed if Geller is read-only");
        C21992s sVar = new C21992s(geller, str2, akVar, str, j);
        return C60856cj.m92905n(C47810es.m84965e(sVar), geller.f60380b);
    }
}
