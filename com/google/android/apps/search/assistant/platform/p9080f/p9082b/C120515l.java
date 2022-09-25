package com.google.android.apps.search.assistant.platform.p9080f.p9082b;

import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.l */
/* compiled from: PG */
public final class C120515l {

    /* renamed from: a */
    private C120481c f335158a;

    /* renamed from: b */
    private C120420b f335159b;

    /* renamed from: c */
    private int f335160c;

    /* renamed from: d */
    private Duration f335161d;

    /* renamed from: e */
    private byte f335162e;

    /* renamed from: a */
    public final C120507d mo104789a() {
        C120481c cVar;
        C120420b bVar;
        Duration duration;
        if (this.f335162e == 1 && (cVar = this.f335158a) != null && (bVar = this.f335159b) != null && (duration = this.f335161d) != null) {
            return new C120516m(cVar, bVar, this.f335160c, duration);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f335158a == null) {
            sb.append(" encoding");
        }
        if (this.f335159b == null) {
            sb.append(" channelConfig");
        }
        if (this.f335162e == 0) {
            sb.append(" sampleRate");
        }
        if (this.f335161d == null) {
            sb.append(" statsUpdateDuration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo104790b(C120420b bVar) {
        if (bVar != null) {
            this.f335159b = bVar;
            return;
        }
        throw new NullPointerException("Null channelConfig");
    }

    /* renamed from: c */
    public final void mo104791c(C120481c cVar) {
        if (cVar != null) {
            this.f335158a = cVar;
            return;
        }
        throw new NullPointerException("Null encoding");
    }

    /* renamed from: d */
    public final void mo104792d(int i) {
        this.f335160c = i;
        this.f335162e = 1;
    }

    /* renamed from: e */
    public final void mo104793e(Duration duration) {
        if (duration != null) {
            this.f335161d = duration;
            return;
        }
        throw new NullPointerException("Null statsUpdateDuration");
    }
}
