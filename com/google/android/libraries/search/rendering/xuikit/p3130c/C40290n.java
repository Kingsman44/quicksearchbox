package com.google.android.libraries.search.rendering.xuikit.p3130c;

import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.n */
/* compiled from: PG */
final class C40290n {

    /* renamed from: a */
    public final long f105838a;

    /* renamed from: b */
    public final Duration f105839b;

    public C40290n(long j, Duration duration) {
        this.f105838a = j;
        this.f105839b = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40290n)) {
            return false;
        }
        C40290n nVar = (C40290n) obj;
        return this.f105838a == nVar.f105838a && C69664n.m101066l(this.f105839b, nVar.f105839b);
    }

    public final int hashCode() {
        long j = this.f105838a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Duration duration = this.f105839b;
        return i + (duration == null ? 0 : duration.hashCode());
    }

    public final String toString() {
        long j = this.f105838a;
        Duration duration = this.f105839b;
        return "FileMetaData(length=" + j + ", age=" + duration + ")";
    }
}
