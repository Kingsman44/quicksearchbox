package com.google.android.apps.gsa.nga.engine.p6056o;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.g */
/* compiled from: PG */
public final class C77374g extends C77429w {

    /* renamed from: a */
    public Optional f213381a = Optional.empty();

    /* renamed from: b */
    public Optional f213382b = Optional.empty();

    /* renamed from: c */
    public Optional f213383c = Optional.empty();

    /* renamed from: d */
    public Optional f213384d = Optional.empty();

    /* renamed from: e */
    public Optional f213385e = Optional.empty();

    /* renamed from: f */
    public Optional f213386f = Optional.empty();

    /* renamed from: g */
    private long f213387g;

    /* renamed from: h */
    private byte f213388h;

    /* renamed from: a */
    public final C77430x mo72534a() {
        if (this.f213388h == 1) {
            return new C77414h(this.f213381a, this.f213382b, this.f213383c, this.f213384d, this.f213385e, this.f213386f, this.f213387g);
        }
        throw new IllegalStateException("Missing required properties: timestamp");
    }

    /* renamed from: b */
    public final void mo72535b(long j) {
        this.f213387g = j;
        this.f213388h = 1;
    }
}
