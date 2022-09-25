package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bn */
/* compiled from: PG */
public final class C6826bn extends Exception {

    /* renamed from: a */
    public final int f21632a;

    /* renamed from: b */
    public final String f21633b;

    /* renamed from: c */
    public final int f21634c;

    /* renamed from: d */
    public final C6864cy f21635d;

    /* renamed from: e */
    public final int f21636e;

    /* renamed from: f */
    public final int f21637f;

    /* renamed from: g */
    public final long f21638g;

    /* renamed from: h */
    public final C7321tw f21639h;

    /* renamed from: i */
    final boolean f21640i;

    /* renamed from: j */
    private final Throwable f21641j;

    private C6826bn(int i, Throwable th) {
        this(i, th, (String) null, -1, (C6864cy) null, 4, 0, false);
    }

    /* renamed from: a */
    public static C6826bn m19780a(IOException iOException) {
        return new C6826bn(0, iOException);
    }

    /* renamed from: b */
    public static C6826bn m19781b(Exception exc, String str, int i, C6864cy cyVar, int i2, boolean z) {
        return new C6826bn(1, exc, str, i, cyVar, cyVar == null ? 4 : i2, 0, z);
    }

    /* renamed from: c */
    public static C6826bn m19782c(RuntimeException runtimeException) {
        return new C6826bn(2, runtimeException);
    }

    /* renamed from: d */
    public static C6826bn m19783d(OutOfMemoryError outOfMemoryError) {
        return new C6826bn(4, outOfMemoryError);
    }

    /* renamed from: e */
    public static C6826bn m19784e(TimeoutException timeoutException, int i) {
        return new C6826bn(5, timeoutException, (String) null, -1, (C6864cy) null, 4, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C6826bn mo15547f(C7321tw twVar) {
        return new C6826bn(getMessage(), this.f21641j, this.f21632a, this.f21633b, this.f21634c, this.f21635d, this.f21636e, twVar, this.f21637f, this.f21638g, this.f21640i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C6826bn(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, com.google.ads.interactivemedia.p367v3.internal.C6864cy r18, int r19, int r20, boolean r21) {
        /*
            r13 = this;
            r3 = r14
            r7 = r19
            if (r3 == 0) goto L_0x0086
            r0 = 4
            r1 = 3
            r2 = 1
            if (r3 == r2) goto L_0x0022
            if (r3 == r1) goto L_0x001a
            if (r3 == r0) goto L_0x0017
            r0 = 5
            if (r3 == r0) goto L_0x0014
            java.lang.String r0 = "Unexpected runtime error"
            goto L_0x001c
        L_0x0014:
            java.lang.String r0 = "Timeout error"
            goto L_0x001c
        L_0x0017:
            java.lang.String r0 = "Out of memory error"
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = "Remote error"
        L_0x001c:
            r6 = r16
            r8 = r17
            goto L_0x008c
        L_0x0022:
            java.lang.String r4 = java.lang.String.valueOf(r18)
            if (r7 == 0) goto L_0x0043
            if (r7 == r2) goto L_0x0040
            r2 = 2
            if (r7 == r2) goto L_0x003d
            if (r7 == r1) goto L_0x003a
            if (r7 != r0) goto L_0x0034
            java.lang.String r0 = "YES"
            goto L_0x0045
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x003a:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x0045
        L_0x003d:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L_0x0045
        L_0x0040:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L_0x0045
        L_0x0043:
            java.lang.String r0 = "NO"
        L_0x0045:
            java.lang.String r1 = java.lang.String.valueOf(r16)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r4)
            int r2 = r2.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r1 = r1 + 53
            int r1 = r1 + r2
            int r2 = r0.length()
            int r1 = r1 + r2
            r5.<init>(r1)
            r6 = r16
            r5.append(r6)
            java.lang.String r1 = " error, index="
            r5.append(r1)
            r8 = r17
            r5.append(r8)
            java.lang.String r1 = ", format="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = ", format_supported="
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            goto L_0x008c
        L_0x0086:
            r6 = r16
            r8 = r17
            java.lang.String r0 = "Source error"
        L_0x008c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0099
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L_0x0099:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r9
            r9 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C6826bn.<init>(int, java.lang.Throwable, java.lang.String, int, com.google.ads.interactivemedia.v3.internal.cy, int, int, boolean):void");
    }

    private C6826bn(String str, Throwable th, int i, String str2, int i2, C6864cy cyVar, int i3, C7321tw twVar, int i4, long j, boolean z) {
        super(str, th);
        this.f21632a = i;
        this.f21641j = th;
        this.f21633b = str2;
        this.f21634c = i2;
        this.f21635d = cyVar;
        this.f21636e = i3;
        this.f21639h = twVar;
        this.f21637f = i4;
        this.f21638g = j;
        this.f21640i = z;
    }
}
