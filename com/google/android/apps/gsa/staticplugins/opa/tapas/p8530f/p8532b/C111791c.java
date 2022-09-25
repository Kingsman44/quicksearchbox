package com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b;

import android.content.Intent;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.acz;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.f.b.c */
/* compiled from: PG */
public final class C111791c {
    /* renamed from: a */
    public static C51809dy m185631a(Intent intent) {
        Optional ofNullable = Optional.ofNullable(intent.getPackage());
        Optional of = Optional.m71637of(intent);
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        if (ofNullable.isPresent()) {
            String str = (String) ofNullable.get();
            esVar.copyOnWrite();
            C51058ev evVar = (C51058ev) esVar.instance;
            str.getClass();
            evVar.f132943a |= 1;
            evVar.f132944b = str;
        }
        if (of.isPresent()) {
            String uri = ((Intent) of.get()).toUri(1);
            esVar.copyOnWrite();
            C51058ev evVar2 = (C51058ev) esVar.instance;
            uri.getClass();
            evVar2.f132943a |= 32;
            evVar2.f132949g = uri;
        }
        acz acz = (acz) ada.f134865f.createBuilder();
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51058ev evVar3 = (C51058ev) esVar.build();
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        evVar3.getClass();
        ghVar.f133013c = evVar3;
        ghVar.f133012b = 1;
        acz.copyOnWrite();
        ada ada = (ada) acz.instance;
        C51098gh ghVar2 = (C51098gh) ggVar.build();
        ghVar2.getClass();
        ada.f134868b = ghVar2;
        ada.f134867a |= 1;
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "provider.OPEN";
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "open_provider_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a = 1 | kaVar.f137059a;
        kaVar.f137060b = "assistant.api.client_op.OpenProviderArgs";
        C63088z byteString = ((ada) acz.build()).toByteString();
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
        dvVar.mo53732b(kbVar);
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return (C51809dy) dxVar.build();
    }
}
