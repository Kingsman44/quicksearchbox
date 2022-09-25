package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.accl.p7331c.p7332a.C92762n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62731b;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62733d;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62734e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.an */
/* compiled from: PG */
public final /* synthetic */ class C93135an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259777a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f259778b;

    public /* synthetic */ C93135an(C93150bb bbVar, C58833ax axVar) {
        this.f259777a = bbVar;
        this.f259778b = axVar;
    }

    public final C60870cx apply(Object obj) {
        C93150bb bbVar = this.f259777a;
        C58833ax axVar = this.f259778b;
        List list = (List) obj;
        bbVar.f259812m.mo19974a(C37176a.f96805C.mo40815i(C62722b.OK));
        C22871g gVar = bbVar.f259802c;
        C92762n nVar = bbVar.f259807h;
        BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) axVar.mo56107c();
        C62731b bVar = (C62731b) C62734e.f169440g.createBuilder();
        String g = bundledMessageNotification.mo84117g();
        bVar.copyOnWrite();
        C62734e eVar = (C62734e) bVar.instance;
        eVar.f169442a |= 1;
        eVar.f169443b = g;
        C62733d dVar = C62733d.DEFAULT;
        bVar.copyOnWrite();
        C62734e eVar2 = (C62734e) bVar.instance;
        eVar2.f169446e = dVar.f169439c;
        eVar2.f169442a |= 4;
        C58485gu d = bundledMessageNotification.mo84113d();
        int size = d.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C58976aa aaVar = C58975e.f156826a;
            bbVar.mo87558i(bVar, (MessageNotification) d.get(i), (String) list.get(i2));
            i++;
            i2++;
        }
        CharSequence e = bundledMessageNotification.mo84115e();
        if (e != null) {
            String obj2 = e.toString();
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
        return gVar.mo28210j(nVar.mo87455b(bbVar.mo87556g(bVar)), "Tts", new C93124ac(bbVar));
    }
}
