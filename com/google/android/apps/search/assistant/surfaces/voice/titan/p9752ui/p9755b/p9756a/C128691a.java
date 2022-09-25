package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128094bp;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128095bq;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128101bw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.ClassicOAuthHandler$Companion$createIsOAuthErrorActiveFlow$1", mo61344c = "ClassicOAuthHandler.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.a */
/* compiled from: PG */
final class C128691a extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f353770a;

    /* renamed from: b */
    /* synthetic */ boolean f353771b;

    public C128691a(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C128691a aVar = new C128691a((C69577g) obj3);
        aVar.f353770a = (C128101bw) obj;
        aVar.f353771b = booleanValue;
        return aVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C128095bq bqVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f353770a;
        boolean z = this.f353771b;
        C128101bw bwVar = (C128101bw) obj2;
        boolean z2 = true;
        if (bwVar.f352470b == 1) {
            bqVar = (C128095bq) bwVar.f352471c;
        } else {
            bqVar = C128095bq.f352444d;
        }
        int a = C128094bp.m209213a(bqVar.f352447b);
        if (a == 0 || a != 3 || z) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
