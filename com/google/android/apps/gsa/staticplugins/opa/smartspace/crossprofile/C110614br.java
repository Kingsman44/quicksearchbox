package com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.crossprofile.br */
/* compiled from: PG */
public final class C110614br implements C110615bs {

    /* renamed from: a */
    private final C142557aq f308286a;

    public C110614br(C142557aq aqVar) {
        aqVar.getClass();
        this.f308286a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo98810a(C83741am amVar) {
        C110613bq bqVar = C110613bq.f308283a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110613bq.f308284b.mo86971c(bundle, "newCard", amVar, BundlerType.m231188a("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo"));
        C142568e eVar = new C142568e(C110613bq.f308284b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f308286a.mo117175b().mo117153e(-6570574682266572963L, 1, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: b */
    public final C60870cx mo98811b(C83741am amVar, Bitmap bitmap) {
        C110613bq bqVar = C110613bq.f308283a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110613bq.f308284b.mo86971c(bundle, "newCard", amVar, BundlerType.m231188a("com.google.android.apps.gsa.opa.smartspace.SmartspaceUpdateInfoProto.SmartspaceUpdateInfo"));
        C110613bq.f308284b.mo86971c(bundle, "newCardIcon", bitmap, BundlerType.m231188a("android.graphics.Bitmap"));
        C142568e eVar = new C142568e(C110613bq.f308284b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f308286a.mo117175b().mo117153e(-6570574682266572963L, 0, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: c */
    public final C60870cx mo98812c() {
        C110613bq bqVar = C110613bq.f308283a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C142568e eVar = new C142568e(C110613bq.f308284b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f308286a.mo117175b().mo117153e(-6570574682266572963L, 2, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: d */
    public final C60870cx mo98813d() {
        C110613bq bqVar = C110613bq.f308283a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C142568e eVar = new C142568e(C110613bq.f308284b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f308286a.mo117175b().mo117153e(-6570574682266572963L, 3, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: e */
    public final C60870cx mo98814e(Intent intent) {
        C110613bq bqVar = C110613bq.f308283a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C110613bq.f308284b.mo86971c(bundle, "intent", intent, BundlerType.m231188a("android.content.Intent"));
        C142568e eVar = new C142568e(C110613bq.f308284b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f308286a.mo117175b().mo117153e(-6570574682266572963L, 4, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }

    /* renamed from: f */
    public final C60870cx mo98815f() {
        C110613bq bqVar = C110613bq.f308283a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C142568e eVar = new C142568e(C110613bq.f308284b, BundlerType.m231188a("com.google.android.apps.gsa.taskgraph.Done"));
        this.f308286a.mo117175b().mo117153e(-6570574682266572963L, 5, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
