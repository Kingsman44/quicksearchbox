package com.google.android.libraries.componentview.services.application;

/* renamed from: com.google.android.libraries.componentview.services.application.h */
/* compiled from: PG */
public final class C20617h extends C20608ch {

    /* renamed from: a */
    public Long f57836a;

    /* renamed from: b */
    private boolean f57837b;

    /* renamed from: c */
    private byte f57838c;

    /* renamed from: a */
    public final NavigationParams mo25555a() {
        if (this.f57838c == 1) {
            return new AutoValue_NavigationParams(this.f57837b, this.f57836a);
        }
        throw new IllegalStateException("Missing required properties: query");
    }

    /* renamed from: b */
    public final void mo25556b(boolean z) {
        this.f57837b = z;
        this.f57838c = 1;
    }
}
