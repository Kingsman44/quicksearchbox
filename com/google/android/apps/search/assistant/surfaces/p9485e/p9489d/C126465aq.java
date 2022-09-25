package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c.C126512t;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126517ab;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126518ac;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126571p;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126574s;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126577v;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126578w;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126581z;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;
import p5488io.grpc.p5533i.C70862aj;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$5", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {137})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.aq */
/* compiled from: PG */
final class C126465aq extends C69572j implements C69630p {

    /* renamed from: a */
    int f348291a;

    /* renamed from: b */
    final /* synthetic */ C126473ay f348292b;

    /* renamed from: c */
    final /* synthetic */ C71553dc f348293c;

    /* renamed from: d */
    final /* synthetic */ C71604be f348294d;

    /* renamed from: e */
    final /* synthetic */ C71604be f348295e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126465aq(C126473ay ayVar, C71553dc dcVar, C71604be beVar, C71604be beVar2, C69577g gVar) {
        super(2, gVar);
        this.f348292b = ayVar;
        this.f348293c = dcVar;
        this.f348294d = beVar;
        this.f348295e = beVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126465aq) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348291a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126518ac acVar = this.f348292b.f348325i;
            C71587n a = C71498bb.m104325a(this.f348293c, new C126464ap((C69577g) null));
            C71604be beVar = this.f348294d;
            C71604be beVar2 = this.f348295e;
            C126473ay ayVar = this.f348292b;
            C70862aj ajVar = ayVar.f348320d;
            C126436e eVar = ayVar.f348321e;
            this.f348291a = 1;
            C69644aa aaVar = new C69644aa();
            C69644aa aaVar2 = new C69644aa();
            C69644aa aaVar3 = new C69644aa();
            Object mp = new C126577v(C71498bb.m104325a(new C71552db(new C126512t(C71536cm.m104384b(new C126574s(new C126571p(a)), new C126517ab(aaVar, ajVar, eVar, (C69577g) null)), acVar.f348436b, (C69577g) null)), new C126578w(aaVar3, (C69577g) null)), beVar).mo38165mp(new C126581z(ajVar, eVar, aaVar2, aaVar3, acVar, beVar2), this);
            if (mp != C69554a.COROUTINE_SUSPENDED) {
                mp = C69788q.f186170a;
            }
            if (mp == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126465aq(this.f348292b, this.f348293c, this.f348294d, this.f348295e, gVar);
    }
}
