package com.google.android.libraries.search.location;

import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.location.a */
/* compiled from: PG */
public final class C38570a extends C38725y {

    /* renamed from: a */
    public C39226b f101953a;

    /* renamed from: b */
    public int f101954b;

    /* renamed from: c */
    private Duration f101955c;

    /* renamed from: a */
    public final C38726z mo41492a() {
        int i;
        Duration duration;
        C39226b bVar = this.f101953a;
        if (bVar != null && (i = this.f101954b) != 0 && (duration = this.f101955c) != null) {
            return new C38696b(bVar, i, duration);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f101953a == null) {
            sb.append(" attributionId");
        }
        if (this.f101954b == 0) {
            sb.append(" requestType");
        }
        if (this.f101955c == null) {
            sb.append(" maxAge");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo41493b(Duration duration) {
        if (duration != null) {
            this.f101955c = duration;
            return;
        }
        throw new NullPointerException("Null maxAge");
    }
}
