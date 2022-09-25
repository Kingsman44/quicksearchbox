package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125533a;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69759h;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.cq */
/* compiled from: PG */
final /* synthetic */ class C125605cq extends C69663m implements C69626l {
    public C125605cq(Object obj) {
        super(1, obj, C125599ck.class, "matchAddItems", "matchAddItems(Ljava/lang/String;)Lcom/google/android/apps/search/assistant/surfaces/dictation/service/fulfillment/nlu/hardcoded/AddItems;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List a;
        String str;
        List a2;
        String str2 = (String) obj;
        C69664n.m101061g(str2, "p0");
        C125599ck ckVar = (C125599ck) this.f186034c;
        C69759h c = ((C69762k) C125608ct.f346249k.mo5768a()).mo61435c(str2);
        if (c == null || (a = c.mo61432a()) == null || (str = (String) a.get(1)) == null || (a2 = C125608ct.f346252n.mo61433a(str, 0)) == null) {
            return null;
        }
        return new C125533a(a2);
    }
}
