package com.google.android.apps.gsa.nga.engine.grammar;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.understanding.p6237d.C79049b;

/* renamed from: com.google.android.apps.gsa.nga.engine.grammar.h */
/* compiled from: PG */
public final class C76130h extends C76129g {

    /* renamed from: a */
    private final String f211075a;

    public C76130h(String str) {
        this.f211075a = str;
    }

    /* renamed from: a */
    public final String mo72075a(C76143u uVar) {
        String str = (String) ((C79049b) uVar).f217378a.get(this.f211075a);
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public final String toString() {
        String str = this.f211075a;
        return "Var(" + str + ")";
    }
}
