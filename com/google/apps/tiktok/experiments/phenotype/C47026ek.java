package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ek */
/* compiled from: PG */
final class C47026ek extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C47023ei f122582a;

    /* renamed from: b */
    final /* synthetic */ String f122583b;

    /* renamed from: c */
    final /* synthetic */ C63088z f122584c;

    /* renamed from: d */
    final /* synthetic */ String f122585d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47026ek(C47023ei eiVar, String str, C63088z zVar, String str2) {
        super(1);
        this.f122582a = eiVar;
        this.f122583b = str;
        this.f122584c = zVar;
        this.f122585d = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C47023ei eiVar = this.f122582a;
        String str = this.f122583b;
        C63088z zVar = this.f122584c;
        String str2 = ((C46108a) obj).mo50210b().f121161f;
        C69664n.m101060f(str2, "account.info().displayId");
        return eiVar.mo50978a(str, zVar, str2, this.f122585d);
    }
}
