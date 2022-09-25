package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import java.util.List;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateClassicConnectionImpl$createResponsePlateVisibilityTrackerFlow$2", mo61344c = "VoicePlateClassicConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bf */
/* compiled from: PG */
final class C128724bf extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f353851a;

    /* renamed from: b */
    /* synthetic */ Object f353852b;

    public C128724bf(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C128724bf bfVar = new C128724bf((C69577g) obj3);
        bfVar.f353851a = (List) obj;
        bfVar.f353852b = (C69685i) obj2;
        return bfVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        ? r3 = this.f353851a;
        C69685i iVar = (C69685i) this.f353852b;
        boolean booleanValue = ((Boolean) iVar.f186052a).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar.f186053b).booleanValue();
        if (booleanValue) {
            r3.clear();
        }
        if (booleanValue2) {
            r3.add(true);
        }
        return r3;
    }
}
