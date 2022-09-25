package com.google.android.apps.gsa.nga.engine.grammar;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.e */
/* compiled from: PG */
public final class C76127e extends C76129g {

    /* renamed from: a */
    private final C76129g f211072a;

    public C76127e(C76129g gVar) {
        this.f211072a = gVar;
    }

    /* renamed from: a */
    public final String mo72075a(C76143u uVar) {
        return true != this.f211072a.mo72075a(uVar).isEmpty() ? BuildConfig.FLAVOR : "true";
    }

    public final String toString() {
        String obj = this.f211072a.toString();
        return "Not(" + obj + ")";
    }
}
