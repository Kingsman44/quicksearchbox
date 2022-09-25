package com.google.android.apps.gsa.staticplugins.opa.p8348c.p8349a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4671b.C61817j;
import com.google.knowledge.p4671b.C61818k;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.c.a.b */
/* compiled from: PG */
public final class C108117b {

    /* renamed from: a */
    public static final C59071e f300727a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.c.a.b");

    /* renamed from: a */
    public static void m179484a(C61817j jVar, String str, String str2, MessageLite messageLite) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
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
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C52091ex exVar = ((C61818k) jVar.instance).f167015o;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        C52090ew ewVar = (C52090ew) exVar.toBuilder();
        ewVar.mo53791d(kbVar);
        jVar.copyOnWrite();
        C61818k kVar = (C61818k) jVar.instance;
        C52091ex exVar2 = (C52091ex) ewVar.build();
        exVar2.getClass();
        kVar.f167015o = exVar2;
        kVar.f167001a |= C89885b.HTTP_VALUE;
    }
}
