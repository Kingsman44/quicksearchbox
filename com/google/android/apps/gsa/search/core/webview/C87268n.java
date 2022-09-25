package com.google.android.apps.gsa.search.core.webview;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100022u;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.webview.n */
/* compiled from: PG */
public final class C87268n {

    /* renamed from: a */
    private View f235713a = null;

    /* renamed from: b */
    private final Set f235714b = new HashSet();

    /* renamed from: c */
    private boolean f235715c = false;

    /* renamed from: d */
    private int f235716d = 0;

    /* renamed from: e */
    private int f235717e = 0;

    /* renamed from: a */
    public final synchronized int mo80908a() {
        return this.f235717e;
    }

    /* renamed from: b */
    public final synchronized int mo80909b() {
        return this.f235716d;
    }

    /* renamed from: c */
    public final synchronized View mo80910c() {
        return this.f235713a;
    }

    /* renamed from: d */
    public final synchronized void mo80911d(int i, int i2) {
        this.f235716d = i;
        this.f235717e = i2;
    }

    /* renamed from: e */
    public final synchronized void mo80912e(boolean z) {
        this.f235715c = z;
        for (C100022u a : this.f235714b) {
            a.mo91714a(this);
        }
    }

    /* renamed from: f */
    public final synchronized void mo80913f(View view) {
        this.f235713a = view;
        for (C100022u b : this.f235714b) {
            b.mo91715b(this);
        }
    }

    /* renamed from: g */
    public final synchronized boolean mo80914g() {
        return this.f235715c;
    }

    /* renamed from: h */
    public final synchronized void mo80915h(C100022u uVar) {
        this.f235714b.add(uVar);
    }
}
