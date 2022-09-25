package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126534as;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$finalRecognitionAsync$1", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {98})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.av */
/* compiled from: PG */
final class C126470av extends C69572j implements C69630p {

    /* renamed from: a */
    int f348303a;

    /* renamed from: b */
    final /* synthetic */ C126473ay f348304b;

    /* renamed from: c */
    final /* synthetic */ C71553dc f348305c;

    /* renamed from: d */
    final /* synthetic */ C71604be f348306d;

    /* renamed from: e */
    private /* synthetic */ Object f348307e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126470av(C126473ay ayVar, C71553dc dcVar, C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348304b = ayVar;
        this.f348305c = dcVar;
        this.f348306d = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126470av) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348303a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126534as asVar = this.f348304b.f348326j;
            C71587n a = C71498bb.m104325a(this.f348305c, new C126468at((C69577g) null));
            C71604be c = C71803m.m105042c((C71422aw) this.f348307e, (C69585o) null, (C71424ay) null, new C126469au(this.f348306d, (C69577g) null), 3);
            C126473ay ayVar = this.f348304b;
            C70862aj ajVar = ayVar.f348320d;
            C126436e eVar = ayVar.f348321e;
            this.f348303a = 1;
            obj = asVar.mo107626a(a, c, ajVar, eVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126470av avVar = new C126470av(this.f348304b, this.f348305c, this.f348306d, gVar);
        avVar.f348307e = obj;
        return avVar;
    }
}
