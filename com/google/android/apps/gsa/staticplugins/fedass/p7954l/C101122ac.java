package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.Bundle;
import com.google.android.apps.gsa.i.a.c;
import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100721ad;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132817y;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5228m.C67337cn;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.ac */
/* compiled from: PG */
public final /* synthetic */ class C101122ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101128ai f282318a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f282319b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f282320c;

    /* renamed from: d */
    public final /* synthetic */ c f282321d;

    public /* synthetic */ C101122ac(C101128ai aiVar, C60870cx cxVar, c cVar, Bundle bundle) {
        this.f282318a = aiVar;
        this.f282319b = cxVar;
        this.f282321d = cVar;
        this.f282320c = bundle;
    }

    public final C60870cx apply(Object obj) {
        C101128ai aiVar = this.f282318a;
        C60870cx cxVar = this.f282319b;
        c cVar = this.f282321d;
        Bundle bundle = this.f282320c;
        C132800h hVar = (C132800h) obj;
        C67337cn cnVar = (C67337cn) C60856cj.m92909r(cxVar);
        boolean z = ((Optional) aiVar.f282336f.mo27525b()).isPresent() && ((C74713bn) ((Optional) aiVar.f282336f.mo27525b()).get()).mo71077b();
        boolean s = aiVar.f282338h.mo87245s();
        boolean w = aiVar.f282338h.mo87249w();
        boolean e = aiVar.f282337g.mo79746e(C90082eg.f249929as);
        boolean isEmpty = hVar.f362334b.isEmpty();
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132817y yVar = zVar.f362396b;
        if (yVar == null) {
            yVar = C132817y.f362388d;
        }
        boolean z2 = yVar.f362391b;
        C132818z zVar2 = hVar.f362336d;
        if (zVar2 == null) {
            zVar2 = C132818z.f362393h;
        }
        boolean z3 = zVar2.f362398d;
        boolean c = aiVar.f282335e.mo92028c(hVar);
        Bundle bundle2 = bundle;
        ((C59052c) ((C59052c) C101128ai.f282331a.mo56224b()).mo56372aa(19838)).mo56389s("FedAssConfig; fedHotSettingEnabled = %b", Boolean.valueOf(c));
        boolean b = C100721ad.m166921b(hVar);
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        boolean z4 = fVar.f362318b;
        C132798f fVar2 = hVar.f362335c;
        if (fVar2 == null) {
            fVar2 = C132798f.f362315o;
        }
        boolean z5 = fVar2.f362320d;
        C132800h hVar2 = hVar;
        boolean e2 = aiVar.f282337g.mo79746e(C89978aq.f246605d);
        C101128ai aiVar2 = aiVar;
        C67337cn cnVar2 = cnVar;
        long a = aiVar.f282337g.mo79743a(C89978aq.f246619r);
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("is_nga", z);
        bundle3.putBoolean("is_hotword_enabled", s);
        bundle3.putBoolean("is_hotword_enrolled", w);
        bundle3.putBoolean("is_soda_in_interactor", e);
        bundle3.putBoolean("is_empty_account", isEmpty);
        bundle3.putBoolean("is_ekho_enabled", z2);
        bundle3.putBoolean("is_training_enabled", z3);
        bundle3.putBoolean("is_setting_enabled", c);
        bundle3.putBoolean("is_setting_enabled_with_dogfood", b);
        bundle3.putBoolean("is_setting_enabled_with_toggle", z4);
        bundle3.putBoolean("account_allows_training", z5);
        bundle3.putBoolean("user_labeling_enabled", e2);
        bundle3.putInt("ekho_policy_config", cnVar2.f183027b);
        bundle3.putInt("max_examples_to_surface", (int) a);
        c cVar2 = cVar;
        cVar2.e(bundle3);
        C132800h hVar3 = hVar2;
        if (hVar3.f362334b.isEmpty()) {
            cVar2.f(false, "User is not signed in.");
        } else {
            C132818z zVar3 = hVar3.f362336d;
            C132817y yVar2 = (zVar3 == null ? C132818z.f362393h : zVar3).f362396b;
            if (yVar2 == null) {
                yVar2 = C132817y.f362388d;
            }
            if (!yVar2.f362391b) {
                cVar2.f(false, "GCL flag not ON.");
            } else {
                if (zVar3 == null) {
                    zVar3 = C132818z.f362393h;
                }
                if (!zVar3.f362398d) {
                    cVar2.f(false, "Federated training is not enabled.");
                } else {
                    C101128ai aiVar3 = aiVar2;
                    if (!aiVar3.f282335e.mo92028c(hVar3)) {
                        cVar2.f(false, "Federated setting is OFF.");
                    } else {
                        C132798f fVar3 = hVar3.f362335c;
                        if (fVar3 == null) {
                            fVar3 = C132798f.f362315o;
                        }
                        if (!fVar3.f362320d) {
                            cVar2.f(false, "Account doesn't allow learning.");
                        } else if (!aiVar3.f282337g.mo79746e(C90082eg.f249929as)) {
                            cVar2.f(false, "Soda disabled in interactor");
                        } else {
                            Bundle bundle4 = bundle2;
                            C100742h a2 = C100742h.m166943a(new C101124ae(aiVar3, hVar3, bundle4.getString("collection"), bundle4.getByteArray("criteria"), bundle4.getByteArray("resumption_token")));
                            a2.mo92038i(new C101125af(cVar2));
                            a2.mo92035e(new C101126ag(cVar2)).mo92038i(new C101127ah(cVar2));
                            return C60866ct.f164955a;
                        }
                    }
                }
            }
        }
        ((C59052c) ((C59052c) C101128ai.f282331a.mo56226d()).mo56372aa(19839)).mo56386p("FedHot materialization is not possible");
        return C60866ct.f164955a;
    }
}
