package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52639ze;
import com.google.assistant.p3897e.p3921j.C52640zf;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.at */
/* compiled from: PG */
public final /* synthetic */ class C14680at implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C14680at f44337a = new C14680at();

    private /* synthetic */ C14680at() {
    }

    public final Object apply(Object obj) {
        aco aco = (aco) obj;
        C52639ze zeVar = (C52639ze) C52640zf.f138212e.createBuilder();
        aco.getClass();
        zeVar.copyOnWrite();
        C52640zf zfVar = (C52640zf) zeVar.instance;
        zfVar.f138215b = aco;
        zfVar.f138214a |= 1;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MessageNotificationReplyParam";
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
}
