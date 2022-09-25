package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21655a;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21677g;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52465st;
import com.google.assistant.p3897e.p3921j.C52518us;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.assistant.p3897e.p3921j.p3926e.C51812a;
import com.google.assistant.p3897e.p3921j.p3926e.C51839b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.t */
/* compiled from: PG */
public final /* synthetic */ class C92971t implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C92977z f259337a;

    /* renamed from: b */
    public final /* synthetic */ C52465st f259338b;

    /* renamed from: c */
    public final /* synthetic */ C51809dy f259339c;

    /* renamed from: d */
    public final /* synthetic */ C22434e f259340d;

    public /* synthetic */ C92971t(C92977z zVar, C52465st stVar, C51809dy dyVar, C22434e eVar) {
        this.f259337a = zVar;
        this.f259338b = stVar;
        this.f259339c = dyVar;
        this.f259340d = eVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C92977z zVar = this.f259337a;
        C52465st stVar = this.f259338b;
        C51809dy dyVar = this.f259339c;
        C22434e eVar = this.f259340d;
        C21677g gVar = (C21677g) obj;
        int a = gVar.mo27069b().mo27066a();
        if (a == 1 || a == 3) {
            return C60856cj.m92900i(C92977z.m153018c(stVar));
        }
        C58976aa aaVar = C58975e.f156826a;
        C21655a a2 = gVar.mo27068a();
        C52518us usVar = (C52518us) C52522uw.f137864j.createBuilder();
        C63088z A = C63088z.m96139A(a2.mo27046b());
        usVar.copyOnWrite();
        C52522uw uwVar = (C52522uw) usVar.instance;
        uwVar.f137866a |= 32;
        uwVar.f137872g = A;
        int a3 = a2.mo27045a();
        usVar.copyOnWrite();
        C52522uw uwVar2 = (C52522uw) usVar.instance;
        uwVar2.f137866a |= 64;
        uwVar2.f137873h = a3;
        String str = stVar.f137726c;
        usVar.copyOnWrite();
        C52522uw uwVar3 = (C52522uw) usVar.instance;
        str.getClass();
        uwVar3.f137866a |= 16;
        uwVar3.f137871f = str;
        String str2 = stVar.f137725b;
        usVar.copyOnWrite();
        C52522uw uwVar4 = (C52522uw) usVar.instance;
        str2.getClass();
        uwVar4.f137866a |= 8;
        uwVar4.f137870e = str2;
        long j = stVar.f137727d;
        usVar.copyOnWrite();
        C52522uw uwVar5 = (C52522uw) usVar.instance;
        uwVar5.f137866a |= 4;
        uwVar5.f137869d = j;
        C52522uw uwVar6 = (C52522uw) usVar.build();
        C51812a aVar = (C51812a) C51839b.f135990c.createBuilder();
        aVar.copyOnWrite();
        C51839b bVar = (C51839b) aVar.instance;
        uwVar6.getClass();
        bVar.f135993b = uwVar6;
        bVar.f135992a |= 1;
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "carrier_consent_intent_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a = 1 | kaVar.f137059a;
        kaVar.f137060b = "assistant.api.client_op.ui.CarrierConsentIntentArgs";
        C63088z byteString = ((C51839b) aVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C52232kc kcVar3 = (C52232kc) kbVar.build();
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        C51806dv dvVar = (C51806dv) dwVar.toBuilder();
        dvVar.mo53733c(kcVar3);
        C51808dx dxVar = (C51808dx) dyVar.toBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar2 = (C51807dw) dvVar.build();
        dwVar2.getClass();
        dyVar2.f135938d = dwVar2;
        dyVar2.f135935a |= 4;
        return zVar.f259353e.mo27814b((C51809dy) dxVar.build(), C58833ax.m90833j(eVar));
    }
}
