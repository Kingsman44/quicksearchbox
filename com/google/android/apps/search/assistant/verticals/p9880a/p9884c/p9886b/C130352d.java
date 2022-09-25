package com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9886b;

import android.app.DirectAction;
import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.ComponentName;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3917i.p3918a.C51554m;
import com.google.assistant.p3897e.p3917i.p3918a.C51581n;
import com.google.assistant.p3897e.p3917i.p3918a.C51608o;
import com.google.assistant.p3897e.p3917i.p3918a.C51626p;
import com.google.assistant.p3897e.p3917i.p3918a.C51627q;
import com.google.assistant.p3897e.p3917i.p3918a.C51628r;
import com.google.assistant.p3897e.p3917i.p3918a.C51629s;
import com.google.assistant.p3897e.p3917i.p3918a.C51630t;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52801c;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.b.d */
/* compiled from: PG */
public final class C130352d {

    /* renamed from: a */
    public static final C32836cd f357258a;

    /* renamed from: b */
    public static final C32836cd f357259b;

    /* renamed from: c */
    public static final C58528ij f357260c = C58528ij.m90013M("com.google.android.gm", "com.google.android.keep", "com.google.android.apps.messaging", "com.google.android.apps.docs.editors.docs");

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = false;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 1;
        arVar.f87976b = "app_actions_context_params";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f357258a = (C32836cd) ccVar.build();
        C32835cc ccVar2 = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar2.copyOnWrite();
        C32836cd cdVar3 = (C32836cd) ccVar2.instance;
        cdVar3.f88042a |= 2;
        cdVar3.f88044c = true;
        C32788aj ajVar2 = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar2.copyOnWrite();
        C32796ar arVar3 = (C32796ar) ajVar2.instance;
        arVar3.f87975a = 1;
        arVar3.f87976b = "background_app_actions_context_params";
        ccVar2.copyOnWrite();
        C32836cd cdVar4 = (C32836cd) ccVar2.instance;
        C32796ar arVar4 = (C32796ar) ajVar2.build();
        arVar4.getClass();
        cdVar4.f88043b = arVar4;
        cdVar4.f88042a |= 1;
        f357259b = (C32836cd) ccVar2.build();
    }

    /* renamed from: a */
    public static C32801aw m212804a(C130348b bVar) {
        C33476a aVar = new C33476a("assistant.api.params.AppActionsContextParams", C51581n.f134439b);
        C51554m mVar = (C51554m) C51581n.f134439b.createBuilder();
        C51608o oVar = (C51608o) C51626p.f134543e.createBuilder();
        C51629s sVar = (C51629s) C51630t.f134552d.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        String str = (String) bVar.mo109680d().orElse(BuildConfig.FLAVOR);
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        str.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = str;
        sVar.copyOnWrite();
        C51630t tVar = (C51630t) sVar.instance;
        C51058ev evVar2 = (C51058ev) esVar.build();
        evVar2.getClass();
        tVar.f134555b = evVar2;
        tVar.f134554a |= 1;
        String str2 = (String) bVar.mo109679c().orElse(BuildConfig.FLAVOR);
        sVar.copyOnWrite();
        C51630t tVar2 = (C51630t) sVar.instance;
        str2.getClass();
        tVar2.f134554a |= 2;
        tVar2.f134556c = str2;
        oVar.copyOnWrite();
        C51626p pVar = (C51626p) oVar.instance;
        C51630t tVar3 = (C51630t) sVar.build();
        tVar3.getClass();
        pVar.f134546b = tVar3;
        pVar.f134545a |= 1;
        C51627q qVar = (C51627q) C51628r.f134549b.createBuilder();
        qVar.mo53666a(bVar.mo109678b().f138613a);
        oVar.copyOnWrite();
        C51626p pVar2 = (C51626p) oVar.instance;
        C51628r rVar = (C51628r) qVar.build();
        rVar.getClass();
        pVar2.f134547c = rVar;
        pVar2.f134545a |= 2;
        mVar.mo53635a(oVar);
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52230ka a = aVar.mo38879a((C51581n) mVar.build());
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
        a.getClass();
        baVar.f87991b = a;
        baVar.f87990a |= 1;
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32806ba baVar2 = (C32806ba) azVar.build();
        baVar2.getClass();
        awVar.f87981b = baVar2;
        awVar.f87980a = 1;
        return (C32801aw) auVar.build();
    }

    /* renamed from: b */
    public static Optional m212805b(DirectAction directAction) {
        Bundle extras = directAction.getExtras();
        if (extras == null) {
            return Optional.empty();
        }
        Bundle bundle = extras.getBundle("metadata");
        if (bundle == null) {
            return Optional.empty();
        }
        try {
            return Optional.m71637of((C52829f) C52801c.m86708a(bundle, "app_action_metadata", C52829f.f138611c));
        } catch (C52802d unused) {
            return Optional.empty();
        }
    }

    /* renamed from: c */
    public static Optional m212806c(C58485gu guVar, String str) {
        return Collection.EL.stream(guVar).filter(new C130349a(str)).findFirst();
    }

    /* renamed from: d */
    public static Optional m212807d(DirectAction directAction) {
        if (!"foreground_app".equals(directAction.getId())) {
            return Optional.empty();
        }
        Bundle extras = directAction.getExtras();
        if (extras == null) {
            return Optional.empty();
        }
        return Optional.ofNullable((ComponentName) extras.getParcelable("component_name"));
    }

    /* renamed from: e */
    public static Optional m212808e(AssistStructure assistStructure, AssistContent assistContent) {
        Optional map = Optional.ofNullable(assistStructure).map(C130350b.f357256a);
        if (!map.isEmpty()) {
            return map;
        }
        if (assistContent == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(assistContent.getIntent()).map(C130351c.f357257a);
    }
}
