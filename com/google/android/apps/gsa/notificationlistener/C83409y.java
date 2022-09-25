package com.google.android.apps.gsa.notificationlistener;

import com.google.android.apps.gsa.shared.bisto.p7029b.C89631b;

/* renamed from: com.google.android.apps.gsa.notificationlistener.y */
/* compiled from: PG */
final class C83409y implements C89631b {

    /* renamed from: a */
    final /* synthetic */ String f227302a;

    /* renamed from: b */
    final /* synthetic */ C83410z f227303b;

    public C83409y(C83410z zVar, String str) {
        this.f227303b = zVar;
        this.f227302a = str;
    }

    /* renamed from: a */
    public final void mo76701a() {
        this.f227303b.mo76710h(this.f227302a, false, "Send reply cancelled");
    }

    /* renamed from: b */
    public final void mo76702b() {
        this.f227303b.mo76710h(this.f227302a, false, "Failed to send reply");
    }

    /* renamed from: c */
    public final void mo76703c() {
        this.f227303b.mo76710h(this.f227302a, true, (String) null);
    }
}
