package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125662ao;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125666as;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125693z;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69759h;
import p5462h.p5483m.C69762k;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.bd */
/* compiled from: PG */
final /* synthetic */ class C125565bd extends C69663m implements C69626l {
    public C125565bd(Object obj) {
        super(1, obj, C125560az.class, "matchSetField", "matchSetField(Ljava/lang/String;)Lcom/google/android/apps/search/assistant/surfaces/dictation/service/fulfillment/nlu/hardcoded/HardcodedUnderstandingResult;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        String str;
        String str2;
        String str3 = (String) obj;
        C69664n.m101061g(str3, "p0");
        C125560az azVar = (C125560az) this.f186034c;
        C125693z a = C125560az.m205560a(str3, (C69762k) C125571bj.f346191d.mo5768a());
        if (a != null) {
            return a;
        }
        C125693z a2 = C125560az.m205560a(str3, (C69762k) C125571bj.f346192e.mo5768a());
        if (a2 != null) {
            return a2;
        }
        C125693z a3 = C125560az.m205560a(str3, (C69762k) C125571bj.f346193f.mo5768a());
        if (a3 != null) {
            return a3;
        }
        C69759h c = ((C69762k) C125571bj.f346194g.mo5768a()).mo61435c(str3);
        List a4 = c != null ? c.mo61432a() : null;
        C125666as asVar = (a4 == null || (str2 = (String) a4.get(2)) == null) ? null : (C125666as) C125571bj.f346195h.get(str2);
        String obj2 = (a4 == null || (str = (String) a4.get(1)) == null) ? null : C69764m.m101197q(str).toString();
        if (asVar == null || obj2 == null) {
            return null;
        }
        return new C125662ao(asVar, obj2);
    }
}
