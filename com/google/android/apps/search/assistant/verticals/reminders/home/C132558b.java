package com.google.android.apps.search.assistant.verticals.reminders.home;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.home.b */
/* compiled from: PG */
class C132558b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f361753j = false;

    /* renamed from: k */
    private volatile C68314a f361754k;

    /* renamed from: l */
    private final Object f361755l = new Object();

    public C132558b() {
        this.f2705f.mo3343a(new C132557a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110806v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo110806v() {
        if (this.f361754k == null) {
            synchronized (this.f361755l) {
                if (this.f361754k == null) {
                    this.f361754k = mo110805w();
                }
            }
        }
        return this.f361754k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo110805w() {
        throw null;
    }
}
