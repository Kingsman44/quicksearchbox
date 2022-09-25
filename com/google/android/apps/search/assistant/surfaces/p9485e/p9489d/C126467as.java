package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9488c.C126436e;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126535at;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126557bo;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$6", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {146})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.as */
/* compiled from: PG */
final class C126467as extends C69572j implements C69630p {

    /* renamed from: a */
    int f348297a;

    /* renamed from: b */
    final /* synthetic */ C126473ay f348298b;

    /* renamed from: c */
    final /* synthetic */ C71553dc f348299c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126467as(C126473ay ayVar, C71553dc dcVar, C69577g gVar) {
        super(2, gVar);
        this.f348298b = ayVar;
        this.f348299c = dcVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126467as) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348297a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126557bo boVar = this.f348298b.f348327k;
            C71587n a = C71498bb.m104325a(this.f348299c, new C126466ar((C69577g) null));
            C126436e eVar = this.f348298b.f348321e;
            this.f348297a = 1;
            Object a2 = C71423ax.m104196a(new C126535at(boVar, a, eVar, (C69577g) null), this);
            if (a2 != C69554a.COROUTINE_SUSPENDED) {
                a2 = C69788q.f186170a;
            }
            if (a2 == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126467as(this.f348298b, this.f348299c, gVar);
    }
}
