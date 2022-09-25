package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58832aw;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.social.populous.storage.d */
/* compiled from: PG */
public final class C42680d {

    /* renamed from: a */
    public final long f111892a;

    /* renamed from: b */
    public final long f111893b;

    /* renamed from: c */
    public final long f111894c;

    /* renamed from: d */
    public final C57883f f111895d;

    public C42680d(long j, long j2, long j3, C57883f fVar) {
        this.f111892a = j;
        this.f111893b = j2;
        this.f111894c = j3;
        this.f111895d = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42680d) {
            C42680d dVar = (C42680d) obj;
            return this.f111892a == dVar.f111892a && this.f111893b == dVar.f111893b && this.f111894c == dVar.f111894c && C58832aw.m90831a(this.f111895d, dVar.f111895d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f111892a), Long.valueOf(this.f111893b), Long.valueOf(this.f111894c), this.f111895d});
    }
}
