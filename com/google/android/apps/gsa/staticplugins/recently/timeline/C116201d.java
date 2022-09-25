package com.google.android.apps.gsa.staticplugins.recently.timeline;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.gsa.p1875j.C22845p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.timeline.d */
/* compiled from: PG */
public final class C116201d {

    /* renamed from: a */
    public String f322182a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f322183b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f322184c = 0;

    /* renamed from: d */
    public int f322185d = 0;

    /* renamed from: e */
    public final List f322186e = new ArrayList();

    /* renamed from: f */
    public boolean f322187f = true;

    /* renamed from: g */
    public boolean f322188g = false;

    /* renamed from: h */
    public boolean f322189h = false;

    /* renamed from: a */
    public final int mo102557a() {
        return this.f322186e.size();
    }

    /* renamed from: b */
    public final C22845p mo102558b(int i) {
        return (C22845p) this.f322186e.get(i);
    }

    /* renamed from: c */
    public final void mo102559c(C22845p pVar) {
        this.f322186e.add(pVar);
    }
}
