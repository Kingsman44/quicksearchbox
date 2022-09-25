package com.google.android.libraries.gsa.conversation.clientop.p1841b;

import com.google.assistant.p3897e.p3921j.C51810dz;
import com.google.assistant.p3897e.p3921j.C52068ea;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52233kd;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.b.a */
/* compiled from: PG */
public final class C22402a {

    /* renamed from: a */
    public static final C52070ec f61893a;

    /* renamed from: b */
    public static final C52070ec f61894b;

    static {
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        f61893a = (C52070ec) dzVar.build();
        C51810dz dzVar2 = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar2 = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar2 = C52235kf.IGNORE;
        kdVar2.copyOnWrite();
        C52236kg kgVar3 = (C52236kg) kdVar2.instance;
        kgVar3.f137092b = kfVar2.f137088t;
        kgVar3.f137091a |= 1;
        dzVar2.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar2.instance;
        C52236kg kgVar4 = (C52236kg) kdVar2.build();
        kgVar4.getClass();
        ecVar2.f136654b = kgVar4;
        ecVar2.f136653a |= 1;
        f61894b = (C52070ec) dzVar2.build();
    }

    /* renamed from: a */
    public static C52070ec m41821a(String str, String str2, MessageLite messageLite) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = str2;
        C63088z byteString = messageLite.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        C52235kf kfVar = C52235kf.OK;
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar2 = (C52236kg) kdVar.build();
        kgVar2.getClass();
        ecVar.f136654b = kgVar2;
        ecVar.f136653a |= 1;
        C52068ea eaVar = (C52068ea) C52069eb.f136648b.createBuilder();
        eaVar.mo53780b((C52232kc) kbVar.build());
        C52069eb ebVar = (C52069eb) eaVar.build();
        dzVar.copyOnWrite();
        C52070ec ecVar2 = (C52070ec) dzVar.instance;
        ebVar.getClass();
        ecVar2.f136655c = ebVar;
        ecVar2.f136653a |= 2;
        return (C52070ec) dzVar.build();
    }

    /* renamed from: b */
    public static C52070ec m41822b(C52235kf kfVar, String str) {
        C52233kd kdVar = (C52233kd) C52236kg.f137089d.createBuilder();
        kdVar.copyOnWrite();
        C52236kg kgVar = (C52236kg) kdVar.instance;
        kgVar.f137092b = kfVar.f137088t;
        kgVar.f137091a |= 1;
        if (str != null) {
            kdVar.copyOnWrite();
            C52236kg kgVar2 = (C52236kg) kdVar.instance;
            kgVar2.f137091a |= 2;
            kgVar2.f137093c = str;
        }
        C51810dz dzVar = (C51810dz) C52070ec.f136651d.createBuilder();
        dzVar.copyOnWrite();
        C52070ec ecVar = (C52070ec) dzVar.instance;
        C52236kg kgVar3 = (C52236kg) kdVar.build();
        kgVar3.getClass();
        ecVar.f136654b = kgVar3;
        ecVar.f136653a |= 1;
        return (C52070ec) dzVar.build();
    }
}
