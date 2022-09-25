package com.google.android.libraries.elements.p1729h;

import android.text.TextUtils;
import com.google.android.libraries.elements.interfaces.C21252av;
import com.google.android.libraries.elements.interfaces.C21290cf;
import com.google.android.libraries.elements.interfaces.C21305l;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40369aa;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.elements.h.i */
/* compiled from: PG */
public final class C21211i implements C21252av {

    /* renamed from: b */
    public static final AtomicBoolean f59526b = new AtomicBoolean(true);

    /* renamed from: c */
    public final C21203af f59527c;

    /* renamed from: d */
    public final Executor f59528d;

    /* renamed from: e */
    public String f59529e;

    /* renamed from: f */
    public final C40369aa f59530f;

    /* renamed from: g */
    public final C21219q f59531g;

    public C21211i(C40369aa aaVar, C21203af afVar, Executor executor) {
        C21214l lVar = C21214l.f59534b;
        this.f59530f = aaVar;
        this.f59527c = afVar;
        this.f59531g = new C21219q(afVar, executor);
        this.f59528d = executor;
    }

    /* renamed from: a */
    public final int mo26265a() {
        return this.f59527c.mo26242a();
    }

    /* renamed from: b */
    public final C21305l mo26266b() {
        if (TextUtils.isEmpty(this.f59529e)) {
            mo26268d();
        }
        return new C21210h(this);
    }

    /* renamed from: c */
    public final C21290cf mo26267c(int i) {
        if (TextUtils.isEmpty(this.f59529e)) {
            mo26268d();
        }
        return new C21209g(this, i);
    }

    /* renamed from: d */
    public final void mo26268d() {
        String b = this.f59527c.mo26243b();
        this.f59529e = b;
        this.f59527c.mo26244c(b);
    }
}
