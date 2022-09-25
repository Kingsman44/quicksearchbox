package com.google.android.apps.gsa.staticplugins.opa.errorui.p8362a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83877ak;
import com.google.android.apps.gsa.opaonboarding.C83881ao;
import com.google.android.apps.gsa.opaonboarding.C83882ap;
import com.google.android.apps.gsa.opaonboarding.C83942i;
import com.google.android.apps.gsa.opaonboarding.HotwordTrainingConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108849bf;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108854bk;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108858bo;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108859bp;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108905dh;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108906di;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108907dj;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108908dk;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108934ej;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108938en;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108941eq;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108942er;
import com.google.android.apps.gsa.staticplugins.opa.errorui.StartupConfig;
import com.google.android.apps.gsa.staticplugins.opa.util.C113760ac;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.a.a */
/* compiled from: PG */
public final class C108816a {
    /* renamed from: a */
    public static C83882ap m181007a(C108859bp bpVar) {
        C113760ac acVar = (C113760ac) bpVar.f302689a.mo17428b();
        acVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) bpVar.f302690b.mo17428b();
        sharedPreferences.getClass();
        C86124t tVar = (C86124t) bpVar.f302691c.mo17428b();
        tVar.getClass();
        C58833ax axVar = (C58833ax) bpVar.f302692d.mo17428b();
        axVar.getClass();
        Context context = (Context) bpVar.f302693e.mo17428b();
        context.getClass();
        C68214a a = C68219e.m98518a(((C68226l) bpVar.f302694f).f184585a);
        a.getClass();
        C58881cr crVar = (C58881cr) bpVar.f302695g.mo17428b();
        crVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) bpVar.f302696h).f184585a);
        a2.getClass();
        C108849bf bfVar = (C108849bf) bpVar.f302697i.mo17428b();
        bfVar.getClass();
        C108934ej ejVar = (C108934ej) bpVar.f302698j.mo17428b();
        ejVar.getClass();
        C108858bo boVar = new C108858bo(acVar, sharedPreferences, tVar, axVar, context, a, crVar, a2, bfVar, ejVar);
        C83881ao c = C83882ap.m133571c();
        C83942i iVar = (C83942i) c;
        iVar.f228630a = boVar;
        iVar.f228631b = boVar;
        return c.mo77241a();
    }

    /* renamed from: b */
    public static C83882ap m181008b(C108854bk bkVar) {
        C83877ak d = HotwordTrainingConfig.m133502d();
        d.mo77218b(50);
        d.mo77220d(true);
        d.mo77219c(2);
        return C83882ap.m133572d(bkVar.mo97230a(d.mo77217a()));
    }

    /* renamed from: c */
    public static C83882ap m181009c(C108854bk bkVar) {
        C83877ak d = HotwordTrainingConfig.m133502d();
        d.mo77218b(66);
        d.mo77220d(true);
        d.mo77219c(2);
        return C83882ap.m133572d(bkVar.mo97230a(d.mo77217a()));
    }

    /* renamed from: d */
    public static C83882ap m181010d(C108906di diVar, Bundle bundle) {
        StartupConfig startupConfig = (StartupConfig) bundle.getParcelable("opa_onboarding_seq:config");
        startupConfig.getClass();
        C108934ej ejVar = (C108934ej) diVar.f302805a.mo17428b();
        ejVar.getClass();
        C108938en enVar = (C108938en) diVar.f302806b.mo17428b();
        enVar.getClass();
        Context context = (Context) diVar.f302807c.mo17428b();
        context.getClass();
        C68214a a = C68219e.m98518a(((C68226l) diVar.f302808d).f184585a);
        a.getClass();
        ((C90479a) diVar.f302809e.mo17428b()).getClass();
        C58833ax axVar = (C58833ax) diVar.f302810f.mo17428b();
        axVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) diVar.f302811g).f184585a);
        a2.getClass();
        C113787bc bcVar = (C113787bc) diVar.f302812h.mo17428b();
        bcVar.getClass();
        C86124t tVar = (C86124t) diVar.f302813i.mo17428b();
        tVar.getClass();
        C108905dh dhVar = new C108905dh(startupConfig, ejVar, enVar, context, a, axVar, a2, bcVar, tVar);
        C83881ao c = C83882ap.m133571c();
        C83942i iVar = (C83942i) c;
        iVar.f228630a = dhVar;
        iVar.f228631b = dhVar;
        return c.mo77241a();
    }

    /* renamed from: e */
    public static C83882ap m181011e(C108908dk dkVar, Bundle bundle) {
        StartupConfig startupConfig = (StartupConfig) bundle.getParcelable("opa_startup_seq:config");
        startupConfig.getClass();
        C108934ej ejVar = (C108934ej) dkVar.f302824a.mo17428b();
        ejVar.getClass();
        C108938en enVar = (C108938en) dkVar.f302825b.mo17428b();
        enVar.getClass();
        Context context = (Context) dkVar.f302826c.mo17428b();
        context.getClass();
        C68214a a = C68219e.m98518a(((C68226l) dkVar.f302827d).f184585a);
        a.getClass();
        ((C90479a) dkVar.f302828e.mo17428b()).getClass();
        C58833ax axVar = (C58833ax) dkVar.f302829f.mo17428b();
        axVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) dkVar.f302830g).f184585a);
        a2.getClass();
        ((C113787bc) dkVar.f302831h.mo17428b()).getClass();
        C86124t tVar = (C86124t) dkVar.f302832i.mo17428b();
        tVar.getClass();
        C58881cr crVar = (C58881cr) dkVar.f302833j.mo17428b();
        crVar.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) dkVar.f302834k).f184585a);
        a3.getClass();
        C108907dj djVar = new C108907dj(startupConfig, ejVar, enVar, context, a, axVar, a2, tVar, crVar, a3);
        C83881ao c = C83882ap.m133571c();
        C83942i iVar = (C83942i) c;
        iVar.f228630a = djVar;
        iVar.f228631b = djVar;
        return c.mo77241a();
    }

    /* renamed from: f */
    public static C83882ap m181012f(C108942er erVar, Bundle bundle) {
        StartupConfig startupConfig = (StartupConfig) bundle.getParcelable("error_checker_seq:config");
        startupConfig.getClass();
        C108934ej ejVar = (C108934ej) erVar.f302957a.mo17428b();
        ejVar.getClass();
        C108938en enVar = (C108938en) erVar.f302958b.mo17428b();
        enVar.getClass();
        Context context = (Context) erVar.f302959c.mo17428b();
        context.getClass();
        C68214a a = C68219e.m98518a(((C68226l) erVar.f302960d).f184585a);
        a.getClass();
        ((C90479a) erVar.f302961e.mo17428b()).getClass();
        C58833ax axVar = (C58833ax) erVar.f302962f.mo17428b();
        axVar.getClass();
        C58833ax axVar2 = (C58833ax) erVar.f302963g.mo17428b();
        axVar2.getClass();
        C58833ax axVar3 = (C58833ax) erVar.f302964h.mo17428b();
        axVar3.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) erVar.f302965i).f184585a);
        a2.getClass();
        C113787bc bcVar = (C113787bc) erVar.f302966j.mo17428b();
        bcVar.getClass();
        C86124t tVar = (C86124t) erVar.f302967k.mo17428b();
        tVar.getClass();
        C58881cr crVar = (C58881cr) erVar.f302968l.mo17428b();
        crVar.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) erVar.f302969m).f184585a);
        a3.getClass();
        C108941eq eqVar = new C108941eq(startupConfig, ejVar, enVar, context, a, axVar, axVar2, axVar3, a2, bcVar, tVar, crVar, a3);
        C83881ao c = C83882ap.m133571c();
        C83942i iVar = (C83942i) c;
        iVar.f228630a = eqVar;
        iVar.f228631b = eqVar;
        return c.mo77241a();
    }
}
