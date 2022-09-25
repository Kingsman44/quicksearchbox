package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c.C122762b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122982ac;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.C123181b;
import com.google.android.apps.search.assistant.platform.ondevice.p9263b.C122135p;
import com.google.android.apps.search.assistant.platform.ondevice.p9263b.C122136q;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.n */
/* compiled from: PG */
public final /* synthetic */ class C123124n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C123089ac f340781a;

    /* renamed from: b */
    public final /* synthetic */ C122135p f340782b;

    /* renamed from: c */
    public final /* synthetic */ C122985af f340783c;

    /* renamed from: d */
    public final /* synthetic */ C123099am f340784d;

    public /* synthetic */ C123124n(C123089ac acVar, C122135p pVar, C123099am amVar, C122985af afVar) {
        this.f340781a = acVar;
        this.f340782b = pVar;
        this.f340784d = amVar;
        this.f340783c = afVar;
    }

    public final Object apply(Object obj) {
        C123089ac acVar = this.f340781a;
        C122135p pVar = this.f340782b;
        C123099am amVar = this.f340784d;
        C122985af afVar = this.f340783c;
        PortableAssistant portableAssistant = (PortableAssistant) obj;
        C46459k.m82829b(acVar.f340695l.mo105890a((GalliumIpc) portableAssistant.mo24262h().get(), portableAssistant.mo24256b()), "Realization failure during GenX warm-up call.", new Object[0]);
        C123098al alVar = acVar.f340686c;
        C122136q qVar = acVar.f340685b;
        boolean z = acVar.f340692i;
        qVar.getClass();
        portableAssistant.getClass();
        C123181b bVar = (C123181b) alVar.f340716a.mo17428b();
        bVar.getClass();
        C123181b bVar2 = (C123181b) alVar.f340717b.mo17428b();
        bVar2.getClass();
        C123097ak akVar = new C123097ak(qVar, pVar, portableAssistant, amVar, z, bVar, bVar2);
        C123117g gVar = acVar.f340687d;
        portableAssistant.getClass();
        C122762b bVar3 = (C122762b) gVar.f340760a.mo17428b();
        bVar3.getClass();
        afVar.mo105812a(new C122982ac(new C123116f(portableAssistant, bVar3), C60826bg.f164896a));
        acVar.f340693j.mo19974a(C37176a.f96969ch.mo40805c(C62722b.OK));
        return akVar;
    }
}
