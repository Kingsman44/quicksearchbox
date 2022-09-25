package com.google.android.apps.search.assistant.platform.p9080f.p9082b;

import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.m */
/* compiled from: PG */
public final class C120516m extends C120507d {

    /* renamed from: a */
    public final C120481c f335163a;

    /* renamed from: b */
    public final C120420b f335164b;

    /* renamed from: c */
    public final int f335165c;

    /* renamed from: d */
    private final Duration f335166d;

    public C120516m(C120481c cVar, C120420b bVar, int i, Duration duration) {
        this.f335163a = cVar;
        this.f335164b = bVar;
        this.f335165c = i;
        this.f335166d = duration;
    }

    /* renamed from: b */
    public final int mo104781b() {
        return this.f335165c;
    }

    /* renamed from: c */
    public final C120420b mo104782c() {
        return this.f335164b;
    }

    /* renamed from: d */
    public final C120481c mo104783d() {
        return this.f335163a;
    }

    /* renamed from: e */
    public final Duration mo104784e() {
        return this.f335166d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C120507d) {
            C120507d dVar = (C120507d) obj;
            return this.f335163a.equals(dVar.mo104783d()) && this.f335164b.equals(dVar.mo104782c()) && this.f335165c == dVar.mo104781b() && this.f335166d.equals(dVar.mo104784e());
        }
    }

    public final int hashCode() {
        return ((((((this.f335163a.hashCode() ^ 1000003) * 1000003) ^ this.f335164b.hashCode()) * 1000003) ^ this.f335165c) * 1000003) ^ this.f335166d.hashCode();
    }

    public final String toString() {
        String obj = this.f335163a.toString();
        String obj2 = this.f335164b.toString();
        int i = this.f335165c;
        String obj3 = this.f335166d.toString();
        return "AudioConfig{encoding=" + obj + ", channelConfig=" + obj2 + ", sampleRate=" + i + ", statsUpdateDuration=" + obj3 + "}";
    }
}
