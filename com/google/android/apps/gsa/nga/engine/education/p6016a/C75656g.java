package com.google.android.apps.gsa.nga.engine.education.p6016a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.a.g */
/* compiled from: PG */
final class C75656g extends C75645ad {

    /* renamed from: a */
    private boolean f210017a;

    /* renamed from: b */
    private Optional f210018b = Optional.empty();

    /* renamed from: c */
    private byte f210019c;

    /* renamed from: a */
    public final C75646ae mo71791a() {
        if (this.f210019c == 1) {
            return new C75657h(this.f210017a, this.f210018b);
        }
        throw new IllegalStateException("Missing required properties: setShowDisclosure");
    }

    /* renamed from: b */
    public final void mo71792b(Optional optional) {
        if (optional != null) {
            this.f210018b = optional;
            return;
        }
        throw new NullPointerException("Null setDisclosureLink");
    }

    /* renamed from: c */
    public final void mo71793c(boolean z) {
        this.f210017a = z;
        this.f210019c = 1;
    }
}
