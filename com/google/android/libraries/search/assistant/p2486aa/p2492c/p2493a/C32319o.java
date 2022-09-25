package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2486aa.p2490b.C32260b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.o */
/* compiled from: PG */
final class C32319o implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C32324t f86597a;

    /* renamed from: b */
    final /* synthetic */ C32849cq f86598b;

    /* renamed from: c */
    final /* synthetic */ C32796ar f86599c;

    /* renamed from: d */
    final /* synthetic */ C69648ae f86600d;

    public C32319o(C32324t tVar, C32849cq cqVar, C32796ar arVar, C69648ae aeVar) {
        this.f86597a = tVar;
        this.f86598b = cqVar;
        this.f86599c = arVar;
        this.f86600d = aeVar;
    }

    public final /* synthetic */ void accept(Object obj) {
        Integer num = (Integer) obj;
        C69664n.m101061g(num, "it");
        C32260b bVar = this.f86597a.f86625b;
        C32849cq cqVar = this.f86598b;
        int intValue = num.intValue();
        C32796ar arVar = this.f86599c;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(arVar, "contextKey");
        bVar.mo38022c(C37176a.f97140ft.mo40816j("context_key", C32602g.m60429b(arVar)), cqVar, intValue, (Throwable) this.f86600d.f186027a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
