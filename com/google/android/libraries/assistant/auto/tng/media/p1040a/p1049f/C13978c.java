package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f;

import com.google.assistant.p3897e.p3917i.p3918a.C51443hx;
import com.google.assistant.p3897e.p3917i.p3918a.C51444hy;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.f.c */
/* compiled from: PG */
public final /* synthetic */ class C13978c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f42558a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f42559b;

    public /* synthetic */ C13978c(C60870cx cxVar, C60870cx cxVar2) {
        this.f42558a = cxVar;
        this.f42559b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f42558a;
        C60870cx cxVar2 = this.f42559b;
        Optional optional = (Optional) C60856cj.m92909r(cxVar);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar2);
        if (!optional.isPresent() && !optional2.isPresent()) {
            return Optional.empty();
        }
        C51444hy hyVar = (C51444hy) C51450id.f133992h.createBuilder();
        if (optional.isPresent()) {
            hyVar.mo53618c((C51447ia) optional.get());
        }
        if (optional2.isPresent()) {
            C51443hx hxVar = (C51443hx) optional2.get();
            hyVar.copyOnWrite();
            C51450id idVar = (C51450id) hyVar.instance;
            hxVar.getClass();
            idVar.f133996c = hxVar;
            idVar.f133994a |= 1;
        }
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "media";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.MediaParams";
        C63088z byteString = ((C51450id) hyVar.build()).toByteString();
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
        return Optional.m71637of((C52232kc) kbVar.build());
    }
}
