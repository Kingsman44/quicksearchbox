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

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ar */
/* compiled from: PG */
final class C46924ar extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C46925as f122404a;

    /* renamed from: b */
    final /* synthetic */ String f122405b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46924ar(C46925as asVar, String str) {
        super(1);
        this.f122404a = asVar;
        this.f122405b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C63088z zVar = (C63088z) obj;
        C69664n.m101061g(zVar, "tokens");
        C46925as asVar = this.f122404a;
        C31747n nVar = asVar.f122406a;
        Set set = (Set) asVar.f122407b.get(C31676o.m59020b(this.f122405b));
        if (set == null) {
            set = C69498ao.f185920a;
        }
        nVar.mo37360g(zVar, set, this.f122405b);
        return C69788q.f186170a;
    }
}
