package com.google.android.apps.search.googleapp.activity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.googleapp.activity.ax */
/* compiled from: PG */
class C133400ax extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f363496j = false;

    /* renamed from: k */
    private volatile C68314a f363497k;

    /* renamed from: l */
    private final Object f363498l = new Object();

    public C133400ax() {
        this.f2705f.mo3343a(new C133399aw(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo111128y().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo111106w() {
        throw null;
    }

    /* renamed from: y */
    public final C68314a mo111128y() {
        if (this.f363497k == null) {
            synchronized (this.f363498l) {
                if (this.f363497k == null) {
                    this.f363497k = mo111106w();
                }
            }
        }
        return this.f363497k;
    }
}
