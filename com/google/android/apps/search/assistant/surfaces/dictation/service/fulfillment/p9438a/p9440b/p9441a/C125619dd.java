package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.p9441a;

import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b.C125660am;
import java.util.List;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69759h;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.a.dd */
/* compiled from: PG */
final /* synthetic */ class C125619dd extends C69663m implements C69626l {
    public C125619dd(Object obj) {
        super(1, obj, C125618dc.class, "matchSelectNth", "matchSelectNth(Ljava/lang/String;)Lcom/google/android/apps/search/assistant/surfaces/dictation/service/fulfillment/nlu/hardcoded/SelectNth;", 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List a;
        String str;
        Integer num;
        String str2 = (String) obj;
        C69664n.m101061g(str2, "p0");
        C125618dc dcVar = (C125618dc) this.f186034c;
        C69759h c = ((C69762k) C125625dj.f346267b.mo5768a()).mo61435c(str2);
        if (c == null || (a = c.mo61432a()) == null || (str = (String) a.get(1)) == null || (num = (Integer) C125625dj.f346272g.get(str)) == null) {
            return null;
        }
        return new C125660am(num.intValue());
    }
}
