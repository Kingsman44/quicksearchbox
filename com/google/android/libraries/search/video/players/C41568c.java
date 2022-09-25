package com.google.android.libraries.search.video.players;

import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.video.players.c */
/* compiled from: PG */
final class C41568c extends C41566ar {

    /* renamed from: a */
    public final String f108672a;

    /* renamed from: b */
    public final Duration f108673b;

    /* renamed from: c */
    public final boolean f108674c;

    /* renamed from: d */
    public final Optional f108675d;

    public C41568c(String str, Duration duration, boolean z, Optional optional) {
        if (str != null) {
            this.f108672a = str;
            if (duration != null) {
                this.f108673b = duration;
                this.f108674c = z;
                if (optional != null) {
                    this.f108675d = optional;
                    return;
                }
                throw new NullPointerException("Null adVideoConfig");
            }
            throw new NullPointerException("Null startTime");
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final Duration mo44108a() {
        return this.f108673b;
    }

    /* renamed from: b */
    public final Optional mo44109b() {
        return this.f108675d;
    }

    /* renamed from: c */
    public final String mo44110c() {
        return this.f108672a;
    }

    /* renamed from: d */
    public final boolean mo44111d() {
        return this.f108674c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C41566ar) {
            C41566ar arVar = (C41566ar) obj;
            return this.f108672a.equals(arVar.mo44110c()) && this.f108673b.equals(arVar.mo44108a()) && this.f108674c == arVar.mo44111d() && this.f108675d.equals(arVar.mo44109b());
        }
    }

    public final int hashCode() {
        return ((((((this.f108672a.hashCode() ^ 1000003) * 1000003) ^ this.f108673b.hashCode()) * 1000003) ^ (true != this.f108674c ? 1237 : 1231)) * 1000003) ^ this.f108675d.hashCode();
    }

    public final String toString() {
        String str = this.f108672a;
        String obj = this.f108673b.toString();
        boolean z = this.f108674c;
        String obj2 = this.f108675d.toString();
        return "YouTubeWrapperVideo{id=" + str + ", startTime=" + obj + ", autoplayMuted=" + z + ", adVideoConfig=" + obj2 + "}";
    }
}
