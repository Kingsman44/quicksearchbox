package com.google.android.apps.gsa.nga.engine.grammar;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.d */
/* compiled from: PG */
public final class C76126d extends C76129g {

    /* renamed from: a */
    private final C76129g f211070a;

    /* renamed from: b */
    private final C76129g f211071b;

    public C76126d(C76129g gVar, C76129g gVar2) {
        this.f211070a = gVar;
        this.f211071b = gVar2;
    }

    /* renamed from: a */
    public final String mo72075a(C76143u uVar) {
        return true != this.f211070a.mo72075a(uVar).equals(this.f211071b.mo72075a(uVar)) ? BuildConfig.FLAVOR : "true";
    }

    public final String toString() {
        String obj = this.f211070a.toString();
        String obj2 = this.f211071b.toString();
        return "Equal(" + obj + "," + obj2 + ")";
    }
}
