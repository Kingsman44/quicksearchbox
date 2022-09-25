package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125693z;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.co */
/* compiled from: PG */
final /* synthetic */ class C125603co extends C69663m implements C69626l {
    public C125603co(Object obj) {
        super(1, obj, C125599ck.class, "matchSetField", "matchSetField(Ljava/lang/String;)Lcom/google/android/apps/search/assistant/surfaces/dictation/service/fulfillment/nlu/hardcoded/HardcodedUnderstandingResult;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "p0");
        C125599ck ckVar = (C125599ck) this.f186034c;
        C125693z a = C125599ck.m205600a(str, (C69762k) C125608ct.f346243e.mo5768a(), true);
        if (a != null) {
            return a;
        }
        C125693z a2 = C125599ck.m205600a(str, (C69762k) C125608ct.f346244f.mo5768a(), false);
        if (a2 != null) {
            return a2;
        }
        C125693z a3 = C125599ck.m205600a(str, (C69762k) C125608ct.f346245g.mo5768a(), true);
        return a3 == null ? C125599ck.m205600a(str, (C69762k) C125608ct.f346246h.mo5768a(), true) : a3;
    }
}
