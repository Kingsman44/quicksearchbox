package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52637zc;
import com.google.assistant.p3897e.p3921j.C52638zd;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ax */
/* compiled from: PG */
public final /* synthetic */ class C14684ax implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f44341a;

    /* renamed from: b */
    public final /* synthetic */ boolean f44342b;

    public /* synthetic */ C14684ax(boolean z, boolean z2) {
        this.f44341a = z;
        this.f44342b = z2;
    }

    public final Object apply(Object obj) {
        boolean z = this.f44341a;
        boolean z2 = this.f44342b;
        aco aco = (aco) obj;
        C52637zc zcVar = (C52637zc) C52638zd.f138205f.createBuilder();
        aco.getClass();
        zcVar.copyOnWrite();
        C52638zd zdVar = (C52638zd) zcVar.instance;
        zdVar.f138208b = aco;
        zdVar.f138207a |= 1;
        zcVar.copyOnWrite();
        C52638zd zdVar2 = (C52638zd) zcVar.instance;
        zdVar2.f138207a |= 2;
        zdVar2.f138209c = z;
        int i = true != z2 ? 3 : 2;
        zcVar.copyOnWrite();
        C52638zd zdVar3 = (C52638zd) zcVar.instance;
        zdVar3.f138210d = i - 1;
        zdVar3.f138207a |= 4;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MessageNotificationReadParam";
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
