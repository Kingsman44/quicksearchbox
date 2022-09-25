package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.os.Bundle;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83809y;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58714pg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.ai */
/* compiled from: PG */
public final class C110576ai implements C110577aj {

    /* renamed from: a */
    private final C142557aq f308250a;

    public C110576ai(C142557aq aqVar) {
        aqVar.getClass();
        this.f308250a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo98776a(C58528ij ijVar) {
        C110575ah ahVar = C110575ah.f308247a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110575ah.f308248b.mo86971c(bundle, "calendarIds", ijVar, BundlerType.m231189b("com.google.common.collect.ImmutableSet", BundlerType.m231188a("java.lang.Long")));
        C142568e eVar = new C142568e(C110575ah.f308248b, BundlerType.m231189b("java.util.Set", BundlerType.m231188a("com.google.android.apps.gsa.shared.calendar.Calendar.CalendarInfo")));
        this.f308250a.mo117175b().mo117153e(5367002715227671530L, 1, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: b */
    public final C60870cx mo98777b() {
        C110575ah ahVar = C110575ah.f308247a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C142568e eVar = new C142568e(C110575ah.f308248b, BundlerType.m231189b("java.util.List", BundlerType.m231188a("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo")));
        this.f308250a.mo117175b().mo117153e(5367002715227671530L, 2, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: c */
    public final C60870cx mo98778c(C58714pg pgVar, C58528ij ijVar) {
        C110575ah ahVar = C110575ah.f308247a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110575ah.f308248b.mo86971c(bundle, "startTimeMillisRange", pgVar, BundlerType.m231189b("com.google.common.collect.Range", BundlerType.m231188a("java.lang.Long")));
        C110575ah.f308248b.mo86971c(bundle, "providerIds", ijVar, BundlerType.m231189b("com.google.common.collect.ImmutableSet", BundlerType.m231188a("java.lang.Long")));
        C142568e eVar = new C142568e(C110575ah.f308248b, BundlerType.m231189b("java.util.Map", BundlerType.m231188a("java.lang.Long"), BundlerType.m231189b("com.google.common.collect.ImmutableSet", BundlerType.m231188a("java.lang.String"))));
        this.f308250a.mo117175b().mo117153e(5367002715227671530L, 4, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: d */
    public final C60870cx mo98779d(String str) {
        C110575ah ahVar = C110575ah.f308247a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110575ah.f308248b.mo86971c(bundle, "id", str, BundlerType.m231188a("java.lang.String"));
        C142568e eVar = new C142568e(C110575ah.f308248b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f308250a.mo117175b().mo117153e(5367002715227671530L, 5, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: e */
    public final C60870cx mo98780e(String str, C83809y yVar, long j) {
        C110575ah ahVar = C110575ah.f308247a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110575ah.f308248b.mo86971c(bundle, "id", str, BundlerType.m231188a("java.lang.String"));
        C110575ah.f308248b.mo86971c(bundle, "dismissalMetadata", yVar, BundlerType.m231188a("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.DismissalMetadata"));
        BundlerType.m231188a("long");
        bundle.putLong("ttl", j);
        C142568e eVar = new C142568e(C110575ah.f308248b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f308250a.mo117175b().mo117153e(5367002715227671530L, 6, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: f */
    public final C60870cx mo98781f(String str, C83741am amVar, C50794cr crVar) {
        C110575ah ahVar = C110575ah.f308247a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110575ah.f308248b.mo86971c(bundle, "id", str, BundlerType.m231188a("java.lang.String"));
        C110575ah.f308248b.mo86971c(bundle, "smartspaceUpdateInfo", amVar, BundlerType.m231188a("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo"));
        C110575ah.f308248b.mo86971c(bundle, "cardType", crVar, BundlerType.m231188a("com.google.assistant.ambient.SmartspaceProto.SmartspaceUpdate.SmartspaceCard.CardType"));
        C142568e eVar = new C142568e(C110575ah.f308248b, BundlerType.m231188a("java.lang.String"));
        this.f308250a.mo117175b().mo117153e(5367002715227671530L, 7, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
