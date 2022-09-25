package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.p955a;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13067m;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13068n;
import com.google.android.libraries.assistant.auto.tng.common.p926m.p927a.C13293a;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.C13371b;
import com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.p956b.C13372a;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52637zc;
import com.google.assistant.p3897e.p3921j.C52638zd;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.a.a.b */
/* compiled from: PG */
public final class C13370b implements C13371b {

    /* renamed from: a */
    public final C69464a f41124a;

    /* renamed from: b */
    public final C69464a f41125b;

    /* renamed from: c */
    public final C69464a f41126c;

    /* renamed from: d */
    public final C69464a f41127d;

    /* renamed from: e */
    public final Context f41128e;

    /* renamed from: f */
    public final C13293a f41129f;

    /* renamed from: g */
    private final C71422aw f41130g;

    public C13370b(C69464a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C13293a aVar5, C71422aw awVar, Context context) {
        C69664n.m101061g(aVar2, "enableImmersives");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(context, "context");
        this.f41124a = aVar;
        this.f41125b = aVar2;
        this.f41126c = aVar3;
        this.f41127d = aVar4;
        this.f41129f = aVar5;
        this.f41130g = awVar;
        this.f41128e = context;
    }

    /* renamed from: b */
    public static final Optional m29626b(aco aco, C13068n nVar, C52091ex exVar, boolean z) {
        C51805du duVar;
        C58976aa aaVar = C58975e.f156826a;
        int a = C13067m.m29250a(nVar.f40561d);
        if (a != 0 && a == 2) {
            C69664n.m101061g(aco, "messageNotification");
            C52637zc zcVar = (C52637zc) C52638zd.f138205f.createBuilder();
            zcVar.copyOnWrite();
            C52638zd zdVar = (C52638zd) zcVar.instance;
            aco.getClass();
            zdVar.f138208b = aco;
            zdVar.f138207a |= 1;
            zcVar.copyOnWrite();
            C52638zd zdVar2 = (C52638zd) zcVar.instance;
            zdVar2.f138207a |= 2;
            zdVar2.f138209c = false;
            zcVar.copyOnWrite();
            C52638zd zdVar3 = (C52638zd) zcVar.instance;
            zdVar3.f138207a |= 8;
            zdVar3.f138211e = z;
            C63088z byteString = ((C52638zd) zcVar.build()).toByteString();
            C69664n.m101060f(byteString, "newBuilder()\n        .se…)\n        .toByteString()");
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_input.MessageNotificationReadParam";
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            C62942bv build = jzVar.build();
            C69664n.m101060f(build, "newBuilder()\n        .se…adParam)\n        .build()");
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar2 = (C51805du) dsVar.instance;
            duVar2.f135926a |= 1;
            duVar2.f135927b = "message_notification.READ";
            dsVar.mo53729a("message_notification_read_param", (C52230ka) build);
            C62942bv build2 = dsVar.build();
            C69664n.m101060f(build2, "newBuilder()\n      .setC…mProtobuf)\n      .build()");
            duVar = (C51805du) build2;
        } else {
            C69664n.m101061g(aco, "messageNotification");
            duVar = C13372a.m29629a(aco, false);
        }
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar.getClass();
        ekVar.f136675c = duVar;
        ekVar.f136674b = 5;
        C62942bv build3 = ejVar.build();
        C69664n.m101060f(build3, "newBuilder().setClientIn…ssageClientInput).build()");
        C52078ek ekVar2 = (C52078ek) build3;
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        exVar.getClass();
        enVar.f136685e = exVar;
        enVar.f136681a |= 16;
        C52082eo eoVar = (C52082eo) C52083ep.f136689f.createBuilder();
        eoVar.copyOnWrite();
        C52083ep epVar = (C52083ep) eoVar.instance;
        ekVar2.getClass();
        epVar.f136693c = ekVar2;
        epVar.f136692b = 3;
        elVar.mo53786c((C52083ep) eoVar.build());
        Optional of = Optional.m71637of(elVar.build());
        C69664n.m101060f(of, "of(\n      ConversationDe…))\n        .build()\n    )");
        return of;
    }

    /* renamed from: a */
    public final C60870cx mo21052a(Optional optional, C13068n nVar, C52091ex exVar, String str, boolean z) {
        C69664n.m101061g(optional, "messageNotification");
        C69664n.m101061g(nVar, "messageInputParams");
        C69664n.m101061g(exVar, "conversationParams");
        C69664n.m101061g(str, "locale");
        C58976aa aaVar = C58975e.f156826a;
        return C71663i.m104688a(C71803m.m105042c(this.f41130g, (C69585o) null, (C71424ay) null, new C13369a(this, optional, nVar, z, str, exVar, (C69577g) null), 3));
    }
}
