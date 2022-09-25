package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.phenotype.client.C31676o;
import com.google.android.libraries.phenotype.client.stable.C31747n;
import com.google.protobuf.C63088z;
import java.util.Set;
import p5462h.C69788q;
import p5462h.p5463a.C69498ao;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ej */
/* compiled from: PG */
final class C47025ej extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C47023ei f122579a;

    /* renamed from: b */
    final /* synthetic */ String f122580b;

    /* renamed from: c */
    final /* synthetic */ String f122581c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47025ej(C47023ei eiVar, String str, String str2) {
        super(1);
        this.f122579a = eiVar;
        this.f122580b = str;
        this.f122581c = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C63088z zVar = (C63088z) obj;
        C69664n.m101061g(zVar, "tokens");
        C47023ei eiVar = this.f122579a;
        C31747n nVar = eiVar.f122573d;
        Set set = (Set) eiVar.f122574e.get(C31676o.m59020b(this.f122580b));
        if (set == null) {
            set = C69498ao.f185920a;
        }
        nVar.mo37359f(zVar, set, this.f122581c, this.f122580b);
        return C69788q.f186170a;
    }
}
