package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.assistant.p3897e.p3913g.p3914a.C51223a;
import com.google.assistant.p3897e.p3913g.p3914a.C51225c;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protos.p4985f.p5030q.C65177ek;
import com.google.protos.p4985f.p5030q.C65178el;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65191ey;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.ci */
/* compiled from: PG */
public final class C123042ci {
    /* renamed from: a */
    public static void m202375a(C65185es esVar, C122419bk bkVar) {
        String str = bkVar.f339395b;
        esVar.copyOnWrite();
        C65191ey eyVar = C65191ey.f176424p;
        str.getClass();
        ((C65191ey) esVar.instance).f176432g = str;
        int i = bkVar.f339394a;
        esVar.copyOnWrite();
        ((C65191ey) esVar.instance).f176433h = i;
        C52091ex exVar = bkVar.f339396c;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        esVar.copyOnWrite();
        exVar.getClass();
        ((C65191ey) esVar.instance).f176435j = exVar;
        boolean z = bkVar.f339401h;
        esVar.copyOnWrite();
        C65191ey eyVar2 = (C65191ey) esVar.instance;
        eyVar2.f176426a |= 4;
        eyVar2.f176439n = z;
        C51225c cVar = bkVar.f339402i;
        if (cVar == null) {
            cVar = C51225c.f133369c;
        }
        esVar.copyOnWrite();
        C65191ey eyVar3 = (C65191ey) esVar.instance;
        cVar.getClass();
        eyVar3.f176440o = cVar;
        eyVar3.f176426a |= 8;
        if (bkVar.f339399f) {
            C65177ek ekVar = (C65177ek) C65178el.f176383b.createBuilder();
            ekVar.copyOnWrite();
            ((C65178el) ekVar.instance).f176385a = true;
            esVar.copyOnWrite();
            C65178el elVar = (C65178el) ekVar.build();
            elVar.getClass();
            ((C65191ey) esVar.instance).f176436k = elVar;
        }
    }

    /* renamed from: b */
    public static void m202376b(C65185es esVar, int i) {
        C51223a aVar = (C51223a) C51225c.f133369c.createBuilder();
        aVar.copyOnWrite();
        C51225c cVar = (C51225c) aVar.instance;
        cVar.f133372b = i - 1;
        cVar.f133371a |= 1;
        C51225c cVar2 = (C51225c) aVar.build();
        esVar.copyOnWrite();
        C65191ey eyVar = (C65191ey) esVar.instance;
        C65191ey eyVar2 = C65191ey.f176424p;
        cVar2.getClass();
        eyVar.f176440o = cVar2;
        eyVar.f176426a |= 8;
        C51225c cVar3 = ((C65191ey) esVar.instance).f176440o;
        if (cVar3 == null) {
            cVar3 = C51225c.f133369c;
        }
        int i2 = cVar3.f133372b;
    }
}
