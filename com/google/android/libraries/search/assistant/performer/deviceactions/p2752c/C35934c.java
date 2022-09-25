package com.google.android.libraries.search.assistant.performer.deviceactions.p2752c;

import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.net.p4726a.p4727a.C62722b;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71132s;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.c.c */
/* compiled from: PG */
public final class C35934c {

    /* renamed from: a */
    public final String f94090a;

    /* renamed from: b */
    private final C37215b f94091b;

    public C35934c(C37215b bVar, String str) {
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f94091b = bVar;
        this.f94090a = str;
    }

    /* renamed from: a */
    public final void mo39893a(C37252a aVar, String str, String str2, C62722b bVar) {
        C37215b bVar2 = this.f94091b;
        aVar.mo40781e(bVar);
        C37253b bVar3 = (C37253b) aVar;
        bVar3.mo40795s("settingsPerformerTNG", str2);
        bVar3.mo40792p(C71132s.f189750d, C35933b.m64319a(str));
        bVar2.mo19974a(aVar);
    }

    /* renamed from: b */
    public final void mo39894b(String str, C62722b bVar) {
        C69664n.m101061g(str, "settingId");
        C69664n.m101061g(bVar, "code");
        mo39893a(C37176a.f96835aF.mo40779c(), str, this.f94090a, bVar);
    }

    /* renamed from: c */
    public final void mo39895c(String str, C62722b bVar) {
        C69664n.m101061g(str, "settingType");
        C69664n.m101061g(bVar, "code");
        C37215b bVar2 = this.f94091b;
        C37252a c = C37176a.f96831aB.mo40805c(bVar);
        C37253b bVar3 = (C37253b) c;
        bVar3.mo40795s("settingsPerformerTNG", this.f94090a);
        bVar3.mo40792p(C71132s.f189750d, C35933b.m64319a(str));
        bVar2.mo19974a(c);
    }

    /* renamed from: d */
    public final void mo39896d(String str, C62722b bVar) {
        C69664n.m101061g(str, "settingId");
        C69664n.m101061g(bVar, "code");
        mo39893a(C37176a.f96837aH.mo40779c(), str, this.f94090a, bVar);
    }

    /* renamed from: e */
    public final void mo39897e(String str, C62722b bVar) {
        C69664n.m101061g(str, "settingId");
        C69664n.m101061g(bVar, "code");
        mo39893a(C37176a.f96833aD.mo40779c(), str, this.f94090a, bVar);
    }

    /* renamed from: f */
    public final void mo39898f(String str, C62722b bVar) {
        C69664n.m101061g(str, "settingType");
        C69664n.m101061g(bVar, "code");
        mo39893a(C37176a.f96830aA.mo40779c(), str, this.f94090a, bVar);
    }
}
