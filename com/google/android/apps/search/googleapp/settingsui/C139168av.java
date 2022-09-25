package com.google.android.apps.search.googleapp.settingsui;

import android.support.p033v7.widget.C0642fd;
import android.support.p033v7.widget.RecyclerView;
import androidx.preference.C3990ap;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.av */
/* compiled from: PG */
final class C139168av extends C0642fd {

    /* renamed from: a */
    private final C3990ap f378490a;

    /* renamed from: b */
    private final RecyclerView f378491b;

    /* renamed from: c */
    private final String f378492c;

    public C139168av(C3990ap apVar, RecyclerView recyclerView, String str) {
        C69664n.m101061g(apVar, "adapter");
        C69664n.m101061g(recyclerView, "list");
        C69664n.m101061g(str, "key");
        this.f378490a = apVar;
        this.f378491b = recyclerView;
        this.f378492c = str;
    }

    /* renamed from: h */
    private final void m226099h() {
        int c = this.f378490a.mo8425c(this.f378492c);
        if (c != -1) {
            this.f378491b.smoothScrollToPosition(c);
            this.f378490a.mObservable.unregisterObserver(this);
        }
    }

    /* renamed from: a */
    public final void mo2831a() {
        m226099h();
    }

    /* renamed from: b */
    public final void mo2832b(int i, int i2) {
        m226099h();
    }

    /* renamed from: c */
    public final void mo2833c(int i, int i2, Object obj) {
        m226099h();
    }

    /* renamed from: d */
    public final void mo2834d(int i, int i2) {
        m226099h();
    }

    /* renamed from: e */
    public final void mo2835e(int i, int i2) {
        m226099h();
    }

    /* renamed from: g */
    public final void mo2837g(int i, int i2) {
        m226099h();
    }
}
