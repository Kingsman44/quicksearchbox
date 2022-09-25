package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.fulfillment.ondevice.impl.OnDeviceContextGenericContextFetcher$fetchGenericContext$1$1", mo61344c = "OnDeviceContextGenericContextFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.q */
/* compiled from: PG */
final class C120633q extends C69572j implements C69630p {

    /* renamed from: a */
    int f335546a;

    /* renamed from: b */
    final /* synthetic */ C120635s f335547b;

    /* renamed from: c */
    final /* synthetic */ int f335548c;

    /* renamed from: d */
    final /* synthetic */ C62917ay f335549d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120633q(C120635s sVar, int i, C62917ay ayVar, C69577g gVar) {
        super(2, gVar);
        this.f335547b = sVar;
        this.f335548c = i;
        this.f335549d = ayVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120633q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C32814bi biVar;
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335546a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119935d dVar = this.f335547b.f335553a;
            C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
            int i = this.f335548c;
            ajVar.copyOnWrite();
            C32796ar arVar = (C32796ar) ajVar.instance;
            arVar.f87975a = 3;
            arVar.f87976b = Integer.valueOf(i);
            C60870cx a = dVar.mo104562a((C32796ar) ajVar.build(), false);
            C69664n.m101060f(a, "contextProvider\n        …er = */ false\n          )");
            this.f335546a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C32801aw awVar = (C32801aw) obj;
        if (awVar == null) {
            return null;
        }
        if (awVar.f87980a == 3) {
            biVar = (C32814bi) awVar.f87981b;
        } else {
            biVar = C32814bi.f87999a;
        }
        if (biVar == null) {
            return null;
        }
        C62940bt r0 = C62942bv.checkIsLite(this.f335549d);
        biVar.mo58887l(r0);
        Object l = biVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj2 = r0.f169969b;
        } else {
            obj2 = r0.mo58889c(l);
        }
        return (MessageLite) obj2;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120633q(this.f335547b, this.f335548c, this.f335549d, gVar);
    }
}
