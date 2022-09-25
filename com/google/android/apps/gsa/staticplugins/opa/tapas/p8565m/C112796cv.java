package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b.C111790b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
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
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.cv */
/* compiled from: PG */
final class C112796cv implements C113342cm {

    /* renamed from: a */
    private final C111790b f312631a;

    public C112796cv(C111790b bVar) {
        this.f312631a = bVar;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.geo_chip;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 97539;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112795cu(view);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C111790b bVar = this.f312631a;
        String L = ezVar.mo100199L();
        acz acz = (acz) ada.f134865f.createBuilder();
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar2 = (C51055es) C51058ev.f132941o.createBuilder();
        esVar2.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar2.instance;
        evVar.f132943a |= 1;
        evVar.f132944b = "com.google.android.apps.maps";
        esVar2.copyOnWrite();
        C51058ev evVar2 = (C51058ev) esVar2.instance;
        evVar2.f132943a |= 32;
        evVar2.f132949g = "geo:0,0?q=".concat(String.valueOf(L));
        ggVar.copyOnWrite();
        C51098gh ghVar2 = (C51098gh) ggVar.instance;
        C51058ev evVar3 = (C51058ev) esVar2.build();
        evVar3.getClass();
        ghVar2.f133013c = evVar3;
        ghVar2.f133012b = 1;
        acz.copyOnWrite();
        ada ada = (ada) acz.instance;
        C51098gh ghVar3 = (C51098gh) ggVar.build();
        ghVar3.getClass();
        ada.f134868b = ghVar3;
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
        bVar.mo99229a(C58485gu.m89846n((C51809dy) dxVar.build()));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo99717g(C113415ez ezVar, View view) {
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        int i = C112795cu.f312629b;
        ((C112795cu) ghVar).f312630a.setText(ezVar.mo100199L());
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
