package com.google.android.apps.gsa.staticplugins.save.p8694a;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.a.ac */
/* compiled from: PG */
public final class C116372ac {

    /* renamed from: a */
    public final C86338r f322702a;

    /* renamed from: b */
    private Set f322703b;

    /* renamed from: c */
    private String f322704c;

    public C116372ac(C86338r rVar) {
        this.f322702a = rVar;
    }

    /* renamed from: a */
    public final int mo102663a(String str) {
        return mo102664b(str).size();
    }

    /* renamed from: b */
    public final Set mo102664b(String str) {
        if (!str.equals(this.f322704c)) {
            this.f322703b = null;
            this.f322704c = str;
        }
        if (this.f322703b == null) {
            this.f322703b = Collections.synchronizedSet(new HashSet(this.f322702a.getStringSet("save_prefs:".concat(str), new HashSet())));
        }
        return this.f322703b;
    }

    /* renamed from: c */
    public final void mo102665c(String str, Set set) {
        C86337q b = this.f322702a.mo80076b();
        b.mo80074i("save_prefs:".concat(str), set);
        b.apply();
        this.f322703b = set;
    }
}
