package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.e;
import com.google.android.apps.search.assistant.platform.appintegration.p8990b.C119516b;
import com.google.android.libraries.assistant.p1467d.p1471b.C17830p;
import com.google.android.libraries.assistant.p1467d.p1471b.C17835u;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17900bc;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17903e;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17905g;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17906h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17908j;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.j */
/* compiled from: PG */
public final class C107340j implements e {

    /* renamed from: a */
    private static final C59071e f298726a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.j");

    /* renamed from: b */
    private final C58833ax f298727b;

    public C107340j(C58833ax axVar) {
        this.f298727b = axVar;
    }

    /* renamed from: a */
    public final void mo95918a(Context context, boolean z) {
        ((C59052c) ((C59052c) f298726a.mo56224b()).mo56372aa(23665)).mo56386p("onPause");
        C17903e eVar = (C17903e) C17905g.f51296c.createBuilder();
        eVar.copyOnWrite();
        C17905g gVar = (C17905g) eVar.instance;
        int i = 2;
        gVar.f51299b = 2;
        gVar.f51298a |= 1;
        C17905g gVar2 = (C17905g) eVar.build();
        C17830p pVar = (C17830p) C17835u.f51168i.createBuilder();
        pVar.copyOnWrite();
        C17835u uVar = (C17835u) pVar.instance;
        uVar.f51171b = 3;
        uVar.f51170a |= 1;
        if (true == z) {
            i = 3;
        }
        pVar.copyOnWrite();
        C17835u uVar2 = (C17835u) pVar.instance;
        uVar2.f51176g = i - 1;
        uVar2.f51170a |= 32;
        C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
        C17908j jVar = C17908j.VOICE_PLATE_STATE_CHANGED;
        hVar.copyOnWrite();
        C17909k kVar = (C17909k) hVar.instance;
        kVar.f51317b = jVar.f51313l;
        kVar.f51316a |= 1;
        hVar.mo58885m(C17900bc.f51289a, (C17835u) pVar.build());
        mo95920c(context, gVar2, (C17909k) hVar.build());
    }

    /* renamed from: b */
    public final void mo95919b(Context context, C58833ax axVar, boolean z) {
        ((C59052c) ((C59052c) f298726a.mo56224b()).mo56372aa(23666)).mo56386p("onResume");
        C17903e eVar = (C17903e) C17905g.f51296c.createBuilder();
        eVar.copyOnWrite();
        C17905g gVar = (C17905g) eVar.instance;
        gVar.f51299b = 1;
        gVar.f51298a |= 1;
        C17905g gVar2 = (C17905g) eVar.build();
        C17830p pVar = (C17830p) C17835u.f51168i.createBuilder();
        pVar.copyOnWrite();
        C17835u uVar = (C17835u) pVar.instance;
        uVar.f51171b = 1;
        uVar.f51170a |= 1;
        int i = true != z ? 2 : 3;
        pVar.copyOnWrite();
        C17835u uVar2 = (C17835u) pVar.instance;
        uVar2.f51176g = i - 1;
        uVar2.f51170a |= 32;
        if (axVar.mo56113h()) {
            String str = (String) axVar.mo56107c();
            pVar.copyOnWrite();
            C17835u uVar3 = (C17835u) pVar.instance;
            str.getClass();
            uVar3.f51170a |= 4;
            uVar3.f51173d = str;
        }
        C17906h hVar = (C17906h) C17909k.f51314c.createBuilder();
        C17908j jVar = C17908j.VOICE_PLATE_STATE_CHANGED;
        hVar.copyOnWrite();
        C17909k kVar = (C17909k) hVar.instance;
        kVar.f51317b = jVar.f51313l;
        kVar.f51316a |= 1;
        hVar.mo58885m(C17900bc.f51289a, (C17835u) pVar.build());
        mo95920c(context, gVar2, (C17909k) hVar.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo95920c(Context context, C17905g gVar, C17909k kVar) {
        ((C59052c) ((C59052c) f298726a.mo56224b()).mo56372aa(23667)).mo56389s("updateAssistantIntegrationService: %s", kVar);
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.appintegration.service.AppIntegrationService");
        intent.putExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_DATA", gVar.toByteArray());
        intent.putExtra("com.google.android.apps.gsa.opa.EXTRA_CALLBACK_EVENT", kVar.toByteArray());
        context.startService(intent);
        if (this.f298727b.mo56113h()) {
            ((C119516b) this.f298727b.mo56107c()).mo104415b(kVar);
        }
    }
}
