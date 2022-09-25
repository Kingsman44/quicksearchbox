package com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e;

import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.assistant.p3897e.p3921j.C52641zg;
import com.google.assistant.p3897e.p3921j.C52642zh;
import com.google.assistant.p3897e.p3921j.acj;
import com.google.assistant.p3897e.p3921j.acn;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.e.i */
/* compiled from: PG */
public final class C33231i {
    /* renamed from: a */
    public static String m61624a(aco aco) {
        if (m61625b(aco)) {
            return aco.f134832j;
        }
        acn acn = aco.f134826d;
        if (acn == null) {
            acn = acn.f134817c;
        }
        return acn.f134820b;
    }

    /* renamed from: b */
    public static boolean m61625b(aco aco) {
        int a = acj.m86280a(aco.f134831i);
        return a != 0 && a == 3;
    }

    /* renamed from: c */
    public static C51805du m61626c(int i, int i2, C52236kg kgVar) {
        C52641zg zgVar = (C52641zg) C52642zh.f138218e.createBuilder();
        zgVar.copyOnWrite();
        C52642zh zhVar = (C52642zh) zgVar.instance;
        zhVar.f138220a |= 1;
        zhVar.f138221b = (long) i;
        zgVar.copyOnWrite();
        C52642zh zhVar2 = (C52642zh) zgVar.instance;
        zhVar2.f138222c = i2 - 1;
        zhVar2.f138220a |= 2;
        if (kgVar != null) {
            zgVar.copyOnWrite();
            C52642zh zhVar3 = (C52642zh) zgVar.instance;
            zhVar3.f138223d = kgVar;
            zhVar3.f138220a |= 4;
        }
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        dsVar.copyOnWrite();
        C51805du duVar = (C51805du) dsVar.instance;
        duVar.f135926a |= 1;
        duVar.f135927b = "message_notification.TAP";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_input.MessageNotificationTapParam";
        C63088z byteString = ((C52642zh) zgVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        dsVar.mo53729a("message_notification_input", (C52230ka) jzVar.build());
        return (C51805du) dsVar.build();
    }
}
