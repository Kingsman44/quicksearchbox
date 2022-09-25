package com.google.android.libraries.gsa.p1934s3.lib;

import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.io.InputStream;
import java.util.Arrays;

@ProguardMustNotDelete
/* renamed from: com.google.android.libraries.gsa.s3.lib.Tee */
/* compiled from: PG */
public class Tee {

    /* renamed from: a */
    public static final C59071e f63850a = C59071e.m91332i("com.google.android.libraries.gsa.s3.lib.Tee");

    /* renamed from: b */
    public final InputStream f63851b;

    /* renamed from: c */
    public final int f63852c;

    /* renamed from: d */
    public final int f63853d;

    /* renamed from: e */
    public final InputStream f63854e;

    /* renamed from: f */
    public int f63855f = Integer.MAX_VALUE;

    /* renamed from: g */
    public final byte[] f63856g;

    /* renamed from: h */
    public int f63857h;

    /* renamed from: i */
    public int f63858i;

    /* renamed from: j */
    public boolean f63859j;

    /* renamed from: k */
    public C90457d f63860k;

    /* renamed from: l */
    public final int[] f63861l;

    /* renamed from: m */
    public boolean f63862m;

    /* renamed from: n */
    private final boolean f63863n;

    public Tee(InputStream inputStream, int i, int i2, int i3, int i4, boolean z) {
        C58838bb.m90868c(i2 < i3);
        this.f63851b = inputStream;
        this.f63856g = new byte[(i3 * i)];
        this.f63853d = i2 * i;
        this.f63857h = 0;
        this.f63858i = 0;
        this.f63859j = false;
        this.f63852c = i;
        int[] iArr = new int[i4];
        this.f63861l = iArr;
        Arrays.fill(iArr, Integer.MAX_VALUE);
        this.f63863n = z;
        this.f63854e = new C23329e(this);
        iArr[0] = 0;
    }

    /* renamed from: b */
    public final void mo28824b(int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.f63856g;
        int length = bArr2.length;
        if (i + i3 <= length) {
            System.arraycopy(bArr2, i, bArr, i2, i3);
        } else if (i >= length) {
            System.arraycopy(bArr2, i - length, bArr, i2, i3);
        } else {
            int i4 = length - i;
            System.arraycopy(bArr2, i, bArr, i2, i4);
            System.arraycopy(bArr2, 0, bArr, i2 + i4, i3 - i4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo28825c(int i) {
        this.f63861l[i] = Integer.MAX_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e A[SYNTHETIC, Splitter:B:30:0x007e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.libraries.gsa.p1934s3.lib.C23325a mo28823a() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f63862m     // Catch:{ all -> 0x0089 }
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            if (r0 == 0) goto L_0x0056
            boolean r0 = r5.f63863n     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x004b
            int r0 = r5.f63855f     // Catch:{ all -> 0x0089 }
            if (r0 == r1) goto L_0x004b
            int r3 = r5.f63858i     // Catch:{ all -> 0x0089 }
            if (r0 > r3) goto L_0x001a
            int r3 = r5.f63857h     // Catch:{ all -> 0x0089 }
            if (r0 < r3) goto L_0x001a
            goto L_0x0056
        L_0x001a:
            com.google.common.f.e r1 = f63850a     // Catch:{ all -> 0x0089 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0089 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0089 }
            r2 = 48646(0xbe06, float:6.8168E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0089 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "Incorrect start position: startPosition: %d, bufferBegin: %d, bufferEnd: %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0089 }
            int r3 = r5.f63857h     // Catch:{ all -> 0x0089 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0089 }
            int r4 = r5.f63858i     // Catch:{ all -> 0x0089 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0089 }
            r1.mo56359L(r2, r0, r3, r4)     // Catch:{ all -> 0x0089 }
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "No splits possible, buffers rewound."
            r2 = 393241(0x60019, float:5.51048E-40)
            r0.<init>((java.lang.String) r1, (int) r2)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x004b:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "No splits possible, buffers rewound."
            r2 = 393240(0x60018, float:5.51047E-40)
            r0.<init>((java.lang.String) r1, (int) r2)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0056:
            int[] r0 = r5.f63861l     // Catch:{ all -> 0x0089 }
            int r3 = r0.length     // Catch:{ all -> 0x0089 }
            if (r2 == r3) goto L_0x0062
            r0 = r0[r2]     // Catch:{ all -> 0x0089 }
            if (r0 == r1) goto L_0x0062
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0062:
            if (r2 == r3) goto L_0x007e
            com.google.android.libraries.gsa.s3.lib.f r0 = new com.google.android.libraries.gsa.s3.lib.f     // Catch:{ all -> 0x0089 }
            r0.<init>(r5, r2)     // Catch:{ all -> 0x0089 }
            int r3 = r5.f63855f     // Catch:{ all -> 0x0089 }
            if (r3 != r1) goto L_0x0073
            int[] r1 = r5.f63861l     // Catch:{ all -> 0x0089 }
            r3 = 0
            r1[r2] = r3     // Catch:{ all -> 0x0089 }
            goto L_0x0077
        L_0x0073:
            int[] r1 = r5.f63861l     // Catch:{ all -> 0x0089 }
            r1[r2] = r3     // Catch:{ all -> 0x0089 }
        L_0x0077:
            com.google.android.libraries.gsa.s3.lib.a r1 = new com.google.android.libraries.gsa.s3.lib.a     // Catch:{ all -> 0x0089 }
            r1.<init>(r0)     // Catch:{ all -> 0x0089 }
            monitor-exit(r5)
            return r1
        L_0x007e:
            com.google.android.apps.gsa.shared.q.d r0 = new com.google.android.apps.gsa.shared.q.d     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "No splits possible, too many siblings."
            r2 = 393242(0x6001a, float:5.5105E-40)
            r0.<init>((java.lang.String) r1, (int) r2)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x008d
        L_0x008c:
            throw r0
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1934s3.lib.Tee.mo28823a():com.google.android.libraries.gsa.s3.lib.a");
    }
}
