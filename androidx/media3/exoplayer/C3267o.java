package androidx.media3.exoplayer;

import androidx.media3.common.C2594au;
import androidx.media3.common.C2639ba;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.o */
/* compiled from: PG */
public final class C3267o extends C2639ba {

    /* renamed from: c */
    public final int f9812c;

    /* renamed from: d */
    public final String f9813d;

    /* renamed from: e */
    public final int f9814e;

    /* renamed from: f */
    public final C2680x f9815f;

    /* renamed from: g */
    public final int f9816g;

    /* renamed from: h */
    public final C2594au f9817h;

    /* renamed from: i */
    final boolean f9818i;

    public C3267o(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (C2680x) null, 4, false);
    }

    /* renamed from: b */
    public static C3267o m9504b(RuntimeException runtimeException, int i) {
        return new C3267o(2, runtimeException, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3267o mo7257a(C2594au auVar) {
        String message = getMessage();
        int i = C2612ak.f7249a;
        return new C3267o(message, getCause(), this.f7310a, this.f9812c, this.f9813d, this.f9814e, this.f9815f, this.f9816g, auVar, this.f7311b, this.f9818i);
    }

    /* renamed from: c */
    public final IOException mo7258c() {
        C2601a.m6832d(this.f9812c == 0);
        Throwable cause = getCause();
        cause.getClass();
        return (IOException) cause;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3267o(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, androidx.media3.common.C2680x r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            if (r4 == 0) goto L_0x0044
            r0 = 1
            if (r4 == r0) goto L_0x0013
            r0 = 3
            if (r4 == r0) goto L_0x000c
            java.lang.String r0 = "Unexpected runtime error"
            goto L_0x000e
        L_0x000c:
            java.lang.String r0 = "Remote error"
        L_0x000e:
            r5 = r18
            r6 = r19
            goto L_0x004a
        L_0x0013:
            java.lang.String r0 = java.lang.String.valueOf(r20)
            java.lang.String r1 = androidx.media3.common.p136b.C2612ak.m6934Q(r21)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", format_supported="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            goto L_0x004a
        L_0x0044:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L_0x004a:
            boolean r1 = android.text.TextUtils.isEmpty(r16)
            if (r1 != 0) goto L_0x0066
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0066:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C3267o.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, androidx.media3.common.x, int, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C3267o(String str, Throwable th, int i, int i2, String str2, int i3, C2680x xVar, int i4, C2594au auVar, long j, boolean z) {
        super(str, th, i, j);
        boolean z2;
        int i5;
        boolean z3 = z;
        boolean z4 = false;
        if (z3) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
            } else {
                z2 = false;
                C2601a.m6830b(z2);
                C2601a.m6830b((th != null || i5 == 3) ? true : z4);
                this.f9812c = i5;
                this.f9813d = str2;
                this.f9814e = i3;
                this.f9815f = xVar;
                this.f9816g = i4;
                this.f9817h = auVar;
                this.f9818i = z3;
            }
        } else {
            i5 = i2;
        }
        z2 = true;
        C2601a.m6830b(z2);
        C2601a.m6830b((th != null || i5 == 3) ? true : z4);
        this.f9812c = i5;
        this.f9813d = str2;
        this.f9814e = i3;
        this.f9815f = xVar;
        this.f9816g = i4;
        this.f9817h = auVar;
        this.f9818i = z3;
    }
}
