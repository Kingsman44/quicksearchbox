package com.google.android.libraries.search.assistant.notification.p2712c;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52637zc;
import com.google.assistant.p3897e.p3921j.C52638zd;
import com.google.assistant.p3897e.p3921j.C52639ze;
import com.google.assistant.p3897e.p3921j.C52640zf;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.notification.c.b */
/* compiled from: PG */
public final class C34868b {
    /* renamed from: a */
    public static C51805du m63632a(aco aco) {
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
        C63088z byteString = ((C52640zf) zeVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "message_notification.REPLY";
        dsVar.mo53729a("message_notification_reply_param", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }

    /* renamed from: b */
    public static C51805du m63633b(aco aco, boolean z) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MessageNotificationReadParam";
        C52637zc zcVar = (C52637zc) C52638zd.f138205f.createBuilder();
        zcVar.copyOnWrite();
        C52638zd zdVar = (C52638zd) zcVar.instance;
        aco.getClass();
        zdVar.f138208b = aco;
        zdVar.f138207a |= 1;
        zcVar.copyOnWrite();
        C52638zd zdVar2 = (C52638zd) zcVar.instance;
        zdVar2.f138207a |= 2;
        zdVar2.f138209c = z;
        C63088z byteString = ((C52638zd) zcVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "message_notification.READ";
        dsVar.mo53729a("message_notification_read_param", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
