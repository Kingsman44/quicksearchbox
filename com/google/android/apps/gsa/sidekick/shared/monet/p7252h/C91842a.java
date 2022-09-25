package com.google.android.apps.gsa.sidekick.shared.monet.p7252h;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.h.a */
/* compiled from: PG */
final class C91842a extends C91844c {

    /* renamed from: a */
    private final long f256127a;

    /* renamed from: b */
    private final long f256128b;

    /* renamed from: c */
    private final boolean f256129c;

    /* renamed from: d */
    private final int f256130d;

    /* renamed from: e */
    private final int f256131e;

    /* renamed from: f */
    private final int f256132f;

    /* renamed from: g */
    private final int f256133g;

    /* renamed from: h */
    private final C58485gu f256134h;

    /* renamed from: i */
    private final int f256135i;

    /* renamed from: j */
    private final int f256136j;

    /* renamed from: k */
    private final String f256137k;

    public C91842a(long j, long j2, boolean z, int i, int i2, int i3, int i4, C58485gu guVar, int i5, int i6, String str) {
        this.f256127a = j;
        this.f256128b = j2;
        this.f256129c = z;
        this.f256130d = i;
        this.f256131e = i2;
        this.f256132f = i3;
        this.f256133g = i4;
        if (guVar != null) {
            this.f256134h = guVar;
            this.f256135i = i5;
            this.f256136j = i6;
            this.f256137k = str;
            return;
        }
        throw new NullPointerException("Null cardTopIndices");
    }

    /* renamed from: a */
    public final int mo86312a() {
        return this.f256131e;
    }

    /* renamed from: b */
    public final int mo86313b() {
        return this.f256132f;
    }

    /* renamed from: c */
    public final int mo86314c() {
        return this.f256130d;
    }

    /* renamed from: d */
    public final int mo86315d() {
        return this.f256133g;
    }

    /* renamed from: e */
    public final int mo86316e() {
        return this.f256135i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91844c) {
            C91844c cVar = (C91844c) obj;
            return this.f256127a == cVar.mo86323j() && this.f256128b == cVar.mo86322i() && this.f256129c == cVar.mo86326m() && this.f256130d == cVar.mo86314c() && this.f256131e == cVar.mo86312a() && this.f256132f == cVar.mo86313b() && this.f256133g == cVar.mo86315d() && C58597ky.m90218i(this.f256134h, cVar.mo86324k()) && cVar.mo86320h() == 0 && this.f256135i == cVar.mo86316e() && cVar.mo86318f() == 0 && this.f256136j == cVar.mo86319g() && this.f256137k.equals(cVar.mo86325l());
        }
    }

    /* renamed from: f */
    public final int mo86318f() {
        return 0;
    }

    /* renamed from: g */
    public final int mo86319g() {
        return this.f256136j;
    }

    /* renamed from: h */
    public final int mo86320h() {
        return 0;
    }

    public final int hashCode() {
        long j = this.f256127a;
        long j2 = this.f256128b;
        return this.f256137k.hashCode() ^ ((((((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (true != this.f256129c ? 1237 : 1231)) * 1000003) ^ this.f256130d) * 1000003) ^ this.f256131e) * 1000003) ^ this.f256132f) * 1000003) ^ this.f256133g) * 1000003) ^ this.f256134h.hashCode()) * -721379959) ^ this.f256135i) * -721379959) ^ this.f256136j) * 1000003);
    }

    /* renamed from: i */
    public final long mo86322i() {
        return this.f256128b;
    }

    /* renamed from: j */
    public final long mo86323j() {
        return this.f256127a;
    }

    /* renamed from: k */
    public final C58485gu mo86324k() {
        return this.f256134h;
    }

    /* renamed from: l */
    public final String mo86325l() {
        return this.f256137k;
    }

    /* renamed from: m */
    public final boolean mo86326m() {
        return this.f256129c;
    }

    public final String toString() {
        long j = this.f256127a;
        long j2 = this.f256128b;
        boolean z = this.f256129c;
        int i = this.f256130d;
        int i2 = this.f256131e;
        int i3 = this.f256132f;
        int i4 = this.f256133g;
        String obj = this.f256134h.toString();
        int i5 = this.f256135i;
        int i6 = this.f256136j;
        String str = this.f256137k;
        return "ViewRecordingEvent{timestampMs=" + j + ", executionTimeMs=" + j2 + ", portrait=" + z + ", cardTopPixels=" + i + ", cardHeightPixels=" + i2 + ", cardLeftPixels=" + i3 + ", cardWidthPixels=" + i4 + ", cardTopIndices=" + obj + ", viewportTopPixels=0, viewportBottomPixels=" + i5 + ", viewportLeftPixels=0, viewportRightPixels=" + i6 + ", source=" + str + "}";
    }
}
