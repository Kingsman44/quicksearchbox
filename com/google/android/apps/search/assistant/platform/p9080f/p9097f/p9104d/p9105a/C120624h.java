package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.util.concurrent.C60870cx;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.fulfillment.ondevice.impl.OnDeviceContextConversationParamsFetcher$fetchParams$1$1", mo61344c = "OnDeviceContextConversationParamsFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {28})
/* renamed from: com.google.android.apps.search.assistant.platform.f.f.d.a.h */
/* compiled from: PG */
final class C120624h extends C69572j implements C69630p {

    /* renamed from: a */
    int f335523a;

    /* renamed from: b */
    final /* synthetic */ C120626j f335524b;

    /* renamed from: c */
    final /* synthetic */ String f335525c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120624h(C120626j jVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f335524b = jVar;
        this.f335525c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120624h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C32806ba baVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335523a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119935d dVar = this.f335524b.f335528a;
            C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
            String str = this.f335525c;
            ajVar.copyOnWrite();
            C32796ar arVar = (C32796ar) ajVar.instance;
            arVar.f87975a = 1;
            arVar.f87976b = str;
            C60870cx a = dVar.mo104562a((C32796ar) ajVar.build(), false);
            C69664n.m101060f(a, "contextProvider\n        …rver = */ false\n        )");
            this.f335523a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C32801aw awVar = (C32801aw) obj;
        if (awVar == null) {
            return null;
        }
        if (awVar.f87980a == 1) {
            baVar = (C32806ba) awVar.f87981b;
        } else {
            baVar = C32806ba.f87988c;
        }
        if (baVar == null) {
            return null;
        }
        C52230ka kaVar = baVar.f87991b;
        return kaVar == null ? C52230ka.f137057d : kaVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120624h(this.f335524b, this.f335525c, gVar);
    }
}
