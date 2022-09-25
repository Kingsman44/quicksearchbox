package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.e */
/* compiled from: PG */
public final class C101765e extends C101778r {

    /* renamed from: a */
    public Intent f283865a;

    /* renamed from: b */
    private int f283866b;

    /* renamed from: c */
    private byte f283867c;

    /* renamed from: a */
    public final C101779s mo92561a() {
        if (this.f283867c == 1) {
            return new C101766f(this.f283866b, this.f283865a);
        }
        throw new IllegalStateException("Missing required properties: enrollmentResult");
    }

    /* renamed from: b */
    public final void mo92562b(int i) {
        this.f283866b = i;
        this.f283867c = 1;
    }
}
