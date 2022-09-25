package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125666as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125670c;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69759h;
import p5462h.p5483m.C69762k;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.ak */
/* compiled from: PG */
final /* synthetic */ class C125545ak extends C69663m implements C69626l {
    public C125545ak(Object obj) {
        super(1, obj, C125540af.class, "matchAppendToField", "matchAppendToField(Ljava/lang/String;)Lcom/google/android/apps/search/assistant/surfaces/dictation/service/fulfillment/nlu/hardcoded/HardcodedUnderstandingResult;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        C69664n.m101061g(str3, "p0");
        C125540af afVar = (C125540af) this.f186034c;
        C69759h c = ((C69762k) C125548an.f346164g.mo5768a()).mo61435c(str3);
        List a = c != null ? c.mo61432a() : null;
        C125666as asVar = (a == null || (str2 = (String) a.get(2)) == null) ? null : (C125666as) C125548an.f346165h.get(str2);
        String obj2 = (a == null || (str = (String) a.get(1)) == null) ? null : C69764m.m101197q(str).toString();
        if (asVar == null || obj2 == null) {
            return null;
        }
        return new C125670c(asVar, obj2);
    }
}
