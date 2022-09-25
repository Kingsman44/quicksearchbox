package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import java.util.List;
import java.util.NoSuchElementException;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.VoicePlateClassicConnectionImpl$createRollingAverageSpeechConfidenceFlow$2", mo61344c = "VoicePlateClassicConnectionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bm */
/* compiled from: PG */
final class C128731bm extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f353863a;

    /* renamed from: b */
    /* synthetic */ float f353864b;

    public C128731bm(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        C128731bm bmVar = new C128731bm((C69577g) obj3);
        bmVar.f353863a = (List) obj;
        bmVar.f353864b = floatValue;
        return bmVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        ? r4 = this.f353863a;
        float f = this.f353864b;
        if (r4.size() > 2) {
            C69664n.m101061g(r4, "<this>");
            if (!r4.isEmpty()) {
                r4.remove(0);
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        }
        r4.add(new Float(f));
        return r4;
    }
}
