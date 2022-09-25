package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.p956b;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52639ze;
import com.google.assistant.p3897e.p3921j.C52640zf;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.a.b.a */
/* compiled from: PG */
public final class C13372a {
    /* renamed from: a */
    public static final C51805du m29629a(aco aco, boolean z) {
        C69664n.m101061g(aco, "messageNotification");
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MessageNotificationReplyParam";
        C52639ze zeVar = (C52639ze) C52640zf.f138212e.createBuilder();
        zeVar.copyOnWrite();
        C52640zf zfVar = (C52640zf) zeVar.instance;
        aco.getClass();
        zfVar.f138215b = aco;
        zfVar.f138214a |= 1;
        zeVar.copyOnWrite();
        C52640zf zfVar2 = (C52640zf) zeVar.instance;
        zfVar2.f138214a |= 8;
        zfVar2.f138217d = z;
        C63088z byteString = ((C52640zf) zeVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C62942bv build = jzVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…       )\n        .build()");
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "message_notification.REPLY";
        dsVar.mo53729a("message_notification_reply_param", (C52230ka) build);
        C62942bv build2 = dsVar.build();
        C69664n.m101060f(build2, "newBuilder()\n      .setC…mProtobuf)\n      .build()");
        return (C51805du) build2;
    }
}
