package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.AccountId;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.fd */
/* compiled from: PG */
final class C47046fd extends C69665o implements C69631q {

    /* renamed from: a */
    final /* synthetic */ C47023ei f122625a;

    /* renamed from: b */
    final /* synthetic */ AccountId f122626b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47046fd(C47023ei eiVar, AccountId accountId) {
        super(3);
        this.f122625a = eiVar;
        this.f122626b = accountId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        C69664n.m101061g(str, "configPackages");
        return this.f122625a.mo50981d(this.f122626b, str, (String) obj2, (C63088z) obj3);
    }
}
