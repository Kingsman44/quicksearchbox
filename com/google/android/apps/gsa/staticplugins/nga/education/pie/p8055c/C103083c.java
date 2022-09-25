package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.c */
/* compiled from: PG */
public final class C103083c extends C103095m {

    /* renamed from: a */
    private final Optional f287720a = Optional.empty();

    /* renamed from: b */
    private final Optional f287721b = Optional.empty();

    /* renamed from: c */
    private boolean f287722c;

    /* renamed from: d */
    private byte f287723d;

    /* renamed from: a */
    public final C103096n mo93604a() {
        if (this.f287723d == 1) {
            return new C103086d(this.f287720a, this.f287721b, this.f287722c);
        }
        throw new IllegalStateException("Missing required properties: turnUsecaseOff");
    }

    /* renamed from: b */
    public final void mo93605b(boolean z) {
        this.f287722c = z;
        this.f287723d = 1;
    }
}
