package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a;

import android.media.session.PlaybackState;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.e.a.a */
/* compiled from: PG */
public final class C12109a extends C12110b {

    /* renamed from: a */
    private final PlaybackState f38713a;

    /* renamed from: b */
    private final String f38714b;

    /* renamed from: c */
    private final String f38715c;

    /* renamed from: d */
    private final String f38716d;

    /* renamed from: e */
    private final String f38717e;

    /* renamed from: f */
    private final String f38718f;

    /* renamed from: g */
    private final long f38719g;

    /* renamed from: h */
    private final int f38720h;

    /* renamed from: i */
    private final long f38721i;

    /* renamed from: j */
    private final long f38722j;

    /* renamed from: k */
    private final long f38723k;

    public C12109a(PlaybackState playbackState, String str, String str2, String str3, String str4, String str5, long j, int i, long j2, long j3, long j4) {
        this.f38713a = playbackState;
        this.f38714b = str;
        this.f38715c = str2;
        this.f38716d = str3;
        this.f38717e = str4;
        this.f38718f = str5;
        this.f38719g = j;
        this.f38720h = i;
        this.f38721i = j2;
        this.f38722j = j3;
        this.f38723k = j4;
    }

    /* renamed from: a */
    public final int mo20410a() {
        return this.f38720h;
    }

    /* renamed from: b */
    public final long mo20411b() {
        return this.f38721i;
    }

    /* renamed from: c */
    public final long mo20412c() {
        return this.f38722j;
    }

    /* renamed from: d */
    public final long mo20413d() {
        return this.f38723k;
    }

    /* renamed from: e */
    public final long mo20414e() {
        return this.f38719g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r7.f38715c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r7.f38716d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r7.f38717e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r1 = r7.f38718f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f38714b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a.C12110b
            r2 = 0
            if (r1 == 0) goto L_0x00b2
            com.google.android.libraries.assistant.auto.tng.assistant.c.a.e.a.b r8 = (com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a.C12110b) r8
            android.media.session.PlaybackState r1 = r7.f38713a
            android.media.session.PlaybackState r3 = r8.mo20416f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = r7.f38714b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r8.mo20418h()
            if (r1 != 0) goto L_0x00b2
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r8.mo20418h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
        L_0x002c:
            java.lang.String r1 = r7.f38715c
            if (r1 != 0) goto L_0x0037
            java.lang.String r1 = r8.mo20422k()
            if (r1 != 0) goto L_0x00b2
            goto L_0x0041
        L_0x0037:
            java.lang.String r3 = r8.mo20422k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
        L_0x0041:
            java.lang.String r1 = r7.f38716d
            if (r1 != 0) goto L_0x004c
            java.lang.String r1 = r8.mo20417g()
            if (r1 != 0) goto L_0x00b2
            goto L_0x0056
        L_0x004c:
            java.lang.String r3 = r8.mo20417g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
        L_0x0056:
            java.lang.String r1 = r7.f38717e
            if (r1 != 0) goto L_0x0061
            java.lang.String r1 = r8.mo20420i()
            if (r1 != 0) goto L_0x00b2
            goto L_0x006b
        L_0x0061:
            java.lang.String r3 = r8.mo20420i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
        L_0x006b:
            java.lang.String r1 = r7.f38718f
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = r8.mo20421j()
            if (r1 != 0) goto L_0x00b2
            goto L_0x0081
        L_0x0076:
            java.lang.String r3 = r8.mo20421j()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0081
            goto L_0x00b2
        L_0x0081:
            long r3 = r7.f38719g
            long r5 = r8.mo20414e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b2
            int r1 = r7.f38720h
            int r3 = r8.mo20410a()
            if (r1 != r3) goto L_0x00b2
            long r3 = r7.f38721i
            long r5 = r8.mo20411b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b2
            long r3 = r7.f38722j
            long r5 = r8.mo20412c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b2
            long r3 = r7.f38723k
            long r5 = r8.mo20413d()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x00b2
            return r0
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a.C12109a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final PlaybackState mo20416f() {
        return this.f38713a;
    }

    /* renamed from: g */
    public final String mo20417g() {
        return this.f38716d;
    }

    /* renamed from: h */
    public final String mo20418h() {
        return this.f38714b;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.f38713a.hashCode() ^ 1000003) * 1000003;
        String str = this.f38714b;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = (hashCode ^ i) * 1000003;
        String str2 = this.f38715c;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        String str3 = this.f38716d;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        String str4 = this.f38717e;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        String str5 = this.f38718f;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        long j = this.f38719g;
        int i10 = this.f38720h;
        long j2 = this.f38721i;
        long j3 = this.f38722j;
        long j4 = this.f38723k;
        return ((((((((((i9 ^ i5) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i10) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4));
    }

    /* renamed from: i */
    public final String mo20420i() {
        return this.f38717e;
    }

    /* renamed from: j */
    public final String mo20421j() {
        return this.f38718f;
    }

    /* renamed from: k */
    public final String mo20422k() {
        return this.f38715c;
    }

    public final String toString() {
        String obj = this.f38713a.toString();
        String str = this.f38714b;
        String str2 = this.f38715c;
        String str3 = this.f38716d;
        String str4 = this.f38717e;
        String str5 = this.f38718f;
        long j = this.f38719g;
        int i = this.f38720h;
        long j2 = this.f38721i;
        long j3 = this.f38722j;
        return "MediaPlaybackStatus{playbackState=" + obj + ", artist=" + str + ", trackTitle=" + str2 + ", albumTitle=" + str3 + ", description=" + str4 + ", playerAppPackage=" + str5 + ", transportControlFlags=" + j + ", ratingStyle=" + i + ", contentLengthMs=" + j2 + ", currentPositionMs=" + j3 + ", mediaSessionId=" + this.f38723k + "}";
    }
}
