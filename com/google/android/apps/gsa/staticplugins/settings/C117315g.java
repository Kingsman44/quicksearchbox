package com.google.android.apps.gsa.staticplugins.settings;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.g */
/* compiled from: PG */
public final /* synthetic */ class C117315g implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C117316h f325659a;

    /* renamed from: b */
    public final /* synthetic */ NgaState f325660b;

    public /* synthetic */ C117315g(C117316h hVar, NgaState ngaState) {
        this.f325659a = hVar;
        this.f325660b = ngaState;
    }

    public final void run() {
        C117316h hVar = this.f325659a;
        if (this.f325660b.b()) {
            hVar.f325661a.registerOnSharedPreferenceChangeListener(hVar);
        } else {
            hVar.f325661a.unregisterOnSharedPreferenceChangeListener(hVar);
        }
    }
}
