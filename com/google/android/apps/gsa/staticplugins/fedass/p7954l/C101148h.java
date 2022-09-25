package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.Bundle;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100721ad;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132817y;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5228m.C67337cn;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.h */
/* compiled from: PG */
public final /* synthetic */ class C101148h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101166z f282369a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f282370b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f282371c;

    /* renamed from: d */
    public final /* synthetic */ c f282372d;

    public /* synthetic */ C101148h(C101166z zVar, C60870cx cxVar, C60870cx cxVar2, c cVar) {
        this.f282369a = zVar;
        this.f282370b = cxVar;
        this.f282371c = cxVar2;
        this.f282372d = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        boolean z;
        boolean z2;
        C101166z zVar = this.f282369a;
        C60870cx cxVar = this.f282370b;
        C60870cx cxVar2 = this.f282371c;
        c cVar = this.f282372d;
        C132800h hVar = (C132800h) C60856cj.m92909r(cxVar);
        C67337cn cnVar = (C67337cn) C60856cj.m92909r(cxVar2);
        ((C59052c) ((C59052c) C101166z.f282396a.mo56224b()).mo56372aa(19821)).mo56386p("getDebugConfigValues");
        boolean isEmpty = hVar.f362334b.isEmpty();
        C132818z zVar2 = hVar.f362336d;
        if (zVar2 == null) {
            zVar2 = C132818z.f362393h;
        }
        C132817y yVar = zVar2.f362396b;
        if (yVar == null) {
            yVar = C132817y.f362388d;
        }
        boolean z3 = yVar.f362391b;
        C132818z zVar3 = hVar.f362336d;
        if (zVar3 == null) {
            zVar3 = C132818z.f362393h;
        }
        boolean z4 = zVar3.f362398d;
        boolean c = zVar.f282403h.mo92028c(hVar);
        boolean b = C100721ad.m166921b(hVar);
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        boolean z5 = fVar.f362318b;
        C132798f fVar2 = hVar.f362335c;
        if (fVar2 == null) {
            fVar2 = C132798f.f362315o;
        }
        boolean z6 = fVar2.f362320d;
        int a = (int) zVar.f282402g.mo79743a(C89978aq.f246619r);
        boolean e = zVar.f282402g.mo79746e(C89978aq.f246605d);
        boolean e2 = zVar.f282402g.mo79746e(C89978aq.f246621t);
        boolean e3 = zVar.f282402g.mo79746e(C89978aq.f246625x);
        boolean e4 = zVar.f282402g.mo79746e(C89978aq.f246599D);
        c cVar2 = cVar;
        boolean e5 = zVar.f282402g.mo79746e(C89978aq.f246597B);
        if (!((Optional) zVar.f282401f.mo27525b()).isPresent() || !((C74713bn) ((Optional) zVar.f282401f.mo27525b()).get()).mo71077b()) {
            z = e5;
            z2 = false;
        } else {
            z = e5;
            z2 = true;
        }
        boolean s = zVar.f282400e.mo87245s();
        boolean z7 = e3;
        boolean w = zVar.f282400e.mo87249w();
        boolean z8 = e4;
        boolean e6 = zVar.f282402g.mo79746e(C90082eg.f249929as);
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_nga", z2);
        bundle.putBoolean("is_hotword_enabled", s);
        bundle.putBoolean("is_hotword_enrolled", w);
        bundle.putBoolean("is_soda_in_interactor", e6);
        bundle.putBoolean("is_empty_account", isEmpty);
        bundle.putBoolean("is_ekho_enabled", z3);
        bundle.putBoolean("is_training_enabled", z4);
        bundle.putBoolean("is_setting_enabled", c);
        bundle.putBoolean("is_setting_enabled_with_dogfood", b);
        bundle.putBoolean("is_setting_enabled_with_toggle", z5);
        bundle.putBoolean("account_allows_training", z6);
        bundle.putBoolean("user_labeling_enabled", e);
        bundle.putInt("max_examples_to_surface", a);
        bundle.putInt("ekho_policy_config", cnVar.f183027b);
        bundle.putBoolean("is_sheldon_caching_enabled", e2);
        bundle.putBoolean("is_sheldon_training_enabled", z8);
        bundle.putBoolean("is_sheldon_inference_enabled", z7);
        bundle.putBoolean("is_sheldon_settings_enabled", z);
        cVar2.e(bundle);
        return C60866ct.f164955a;
    }
}
