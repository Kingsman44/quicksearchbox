package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.internal.C142579d;
import com.google.android.enterprise.connectedapps.internal.C142580e;
import com.google.android.enterprise.connectedapps.p10715b.C142562c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.aa */
/* compiled from: PG */
public final class C125320aa implements C125346x {

    /* renamed from: a */
    private final C142549ai f345695a;

    /* renamed from: b */
    private final Bundler f345696b;

    public C125320aa(C142549ai aiVar, Bundler bundler) {
        aiVar.getClass();
        this.f345695a = aiVar;
        this.f345696b = bundler;
    }

    /* renamed from: a */
    public final void mo106912a(String str) {
        try {
            C142579d dVar = new C142579d(this.f345695a, 0);
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            this.f345696b.mo86971c(bundle, "activityId", str, BundlerType.m231188a("java.lang.String"));
            dVar.makeBundleCall(bundle);
        } catch (Exception e) {
            try {
                C142562c cVar = new C142562c("Error when writing callback result", e);
                Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
                bundle2.putSerializable("throwable", cVar);
                new C142580e(this.f345695a).makeBundleCall(bundle2);
            } catch (C142562c unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo106913b(String str) {
        try {
            C142579d dVar = new C142579d(this.f345695a, 1);
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            this.f345696b.mo86971c(bundle, "errorMessage", str, BundlerType.m231188a("java.lang.String"));
            dVar.makeBundleCall(bundle);
        } catch (Exception e) {
            try {
                C142562c cVar = new C142562c("Error when writing callback result", e);
                Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
                bundle2.putSerializable("throwable", cVar);
                new C142580e(this.f345695a).makeBundleCall(bundle2);
            } catch (C142562c unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo106914c() {
        try {
            new C142579d(this.f345695a, 2).makeBundleCall(new Bundle(Bundler.class.getClassLoader()));
        } catch (Exception e) {
            try {
                C142562c cVar = new C142562c("Error when writing callback result", e);
                Bundle bundle = new Bundle(Bundler.class.getClassLoader());
                bundle.putSerializable("throwable", cVar);
                new C142580e(this.f345695a).makeBundleCall(bundle);
            } catch (C142562c unused) {
            }
        }
    }
}
