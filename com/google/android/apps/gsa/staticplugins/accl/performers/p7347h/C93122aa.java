package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.accl.p7331c.p7332a.C92762n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62731b;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62733d;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62734e;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.aa */
/* compiled from: PG */
public final /* synthetic */ class C93122aa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259756a;

    /* renamed from: b */
    public final /* synthetic */ MessageNotification f259757b;

    public /* synthetic */ C93122aa(C93150bb bbVar, MessageNotification messageNotification) {
        this.f259756a = bbVar;
        this.f259757b = messageNotification;
    }

    public final C60870cx apply(Object obj) {
        C93150bb bbVar = this.f259756a;
        MessageNotification messageNotification = this.f259757b;
        C22871g gVar = bbVar.f259802c;
        C92762n nVar = bbVar.f259807h;
        C62731b bVar = (C62731b) C62734e.f169440g.createBuilder();
        String str = messageNotification.f252581b;
        bVar.copyOnWrite();
        C62734e eVar = (C62734e) bVar.instance;
        eVar.f169442a |= 1;
        eVar.f169443b = str;
        C62733d dVar = C62733d.DEFAULT;
        bVar.copyOnWrite();
        C62734e eVar2 = (C62734e) bVar.instance;
        eVar2.f169446e = dVar.f169439c;
        eVar2.f169442a |= 4;
        C58976aa aaVar = C58975e.f156826a;
        bbVar.mo87558i(bVar, messageNotification, (String) obj);
        CharSequence charSequence = messageNotification.f252541r;
        if (charSequence != null) {
            String obj2 = charSequence.toString();
            bVar.copyOnWrite();
            C62734e eVar3 = (C62734e) bVar.instance;
            obj2.getClass();
            eVar3.f169442a |= 2;
            eVar3.f169444c = obj2;
        }
        if (bbVar.f259806g.mo79746e(C90014bt.f247503iQ)) {
            C62733d dVar2 = C62733d.CHRONOLOGICAL;
            bVar.copyOnWrite();
            C62734e eVar4 = (C62734e) bVar.instance;
            eVar4.f169446e = dVar2.f169439c;
            eVar4.f169442a |= 4;
        }
        return gVar.mo28210j(nVar.mo87455b(bbVar.mo87556g(bVar)), "Tts", new C93126ae(bbVar));
    }
}
