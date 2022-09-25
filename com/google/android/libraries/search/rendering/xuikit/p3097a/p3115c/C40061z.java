package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.elements.interfaces.C21266bi;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.z */
/* compiled from: PG */
public final class C40061z implements C21266bi {

    /* renamed from: a */
    public final Object f105270a = new Object();

    /* renamed from: b */
    public final Set f105271b = new HashSet();

    /* renamed from: c */
    public final Set f105272c = new HashSet();

    /* renamed from: d */
    public Optional f105273d;

    /* renamed from: e */
    public boolean f105274e;

    /* renamed from: f */
    private final C68214a f105275f;

    public C40061z(C68214a aVar) {
        this.f105275f = aVar;
        this.f105273d = Optional.empty();
    }

    /* renamed from: g */
    private final void m69574g() {
        if (!this.f105274e && this.f105273d.isPresent() && this.f105272c.containsAll(this.f105271b)) {
            ((C89859i) this.f105275f.mo27525b()).mo74236a((C89857g) this.f105273d.get());
            this.f105274e = true;
        }
    }

    /* renamed from: a */
    public final void mo26752a(int i) {
        synchronized (this.f105270a) {
            this.f105271b.remove(Integer.valueOf(i));
            m69574g();
        }
    }

    /* renamed from: b */
    public final void mo26753b(int i) {
        synchronized (this.f105270a) {
            this.f105271b.remove(Integer.valueOf(i));
            m69574g();
        }
    }

    /* renamed from: c */
    public final void mo26754c(int i) {
    }

    /* renamed from: d */
    public final void mo26755d(int i) {
    }

    /* renamed from: e */
    public final void mo26756e(int i) {
        synchronized (this.f105270a) {
            this.f105272c.add(Integer.valueOf(i));
            m69574g();
        }
    }

    /* renamed from: f */
    public final void mo26757f(int i) {
        synchronized (this.f105270a) {
            this.f105271b.add(Integer.valueOf(i));
        }
    }
}
