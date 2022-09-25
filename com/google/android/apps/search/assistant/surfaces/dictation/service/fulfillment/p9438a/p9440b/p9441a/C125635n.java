package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125671d;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69759h;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.n */
/* compiled from: PG */
final /* synthetic */ class C125635n extends C69663m implements C69626l {
    public C125635n(Object obj) {
        super(1, obj, C125633l.class, "matchCheckItems", "matchCheckItems(Ljava/lang/String;)Lcom/google/android/apps/search/assistant/surfaces/dictation/service/fulfillment/nlu/hardcoded/CheckItems;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List a;
        String str;
        List a2;
        String str2 = (String) obj;
        C69664n.m101061g(str2, "p0");
        C125633l lVar = (C125633l) this.f186034c;
        ArrayList arrayList = new ArrayList();
        for (C69762k c : (List) C125645x.f346306l.mo5768a()) {
            C69759h c2 = c.mo61435c(str2);
            C125671d dVar = null;
            if (!(c2 == null || (a = c2.mo61432a()) == null || (str = (String) a.get(1)) == null || (a2 = C125645x.f346310p.mo61433a(str, 0)) == null)) {
                dVar = new C125671d(a2);
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return (C125671d) C69540x.m100821C(arrayList);
    }
}
