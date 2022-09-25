package com.google.android.libraries.assistant.hotword;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.assistant.hotword.s */
/* compiled from: PG */
public final class C18382s {

    /* renamed from: a */
    public final int f52175a;

    /* renamed from: b */
    public int f52176b;

    /* renamed from: c */
    public volatile long f52177c;

    /* renamed from: d */
    private final int f52178d;

    /* renamed from: e */
    private final int f52179e;

    /* renamed from: f */
    private final int f52180f;

    /* renamed from: g */
    private final byte[] f52181g;

    /* renamed from: h */
    private C18381r f52182h;

    /* renamed from: i */
    private int f52183i;

    public C18382s(int i, int i2, int i3, int i4) {
        boolean z = true;
        C58838bb.m90868c(i > 0);
        C58838bb.m90868c(i4 > 0);
        C58838bb.m90868c(i3 > 0);
        C58838bb.m90869d(i2 < i ? false : z, "The requested audio buffer size must be at least the read size.");
        this.f52178d = i3;
        this.f52179e = i;
        this.f52180f = i2;
        this.f52175a = i4;
        this.f52181g = new byte[(i2 + (i - i3))];
    }

    /* renamed from: f */
    private final C18381r m35799f(int i, int i2) {
        C18381r rVar = this.f52182h;
        if (rVar == null) {
            this.f52182h = new C18381r(i, i2);
        } else {
            rVar.f52173a = i;
            rVar.f52174b = i2;
        }
        return this.f52182h;
    }

    /* renamed from: b */
    public final synchronized void mo23888b() {
        this.f52177c = System.currentTimeMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized byte[] mo23889c() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f52183i     // Catch:{ all -> 0x002b }
            r1 = 0
            if (r0 != 0) goto L_0x0010
            int r0 = r5.f52176b     // Catch:{ all -> 0x002b }
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x002b }
            byte[] r3 = r5.f52181g     // Catch:{ all -> 0x002b }
            java.lang.System.arraycopy(r3, r1, r2, r1, r0)     // Catch:{ all -> 0x002b }
            goto L_0x0022
        L_0x0010:
            int r2 = r5.f52180f     // Catch:{ all -> 0x002b }
            byte[] r3 = new byte[r2]     // Catch:{ all -> 0x002b }
            int r4 = r5.f52176b     // Catch:{ all -> 0x002b }
            int r2 = r2 - r4
            byte[] r4 = r5.f52181g     // Catch:{ all -> 0x002b }
            int r0 = r0 - r2
            java.lang.System.arraycopy(r4, r0, r3, r1, r2)     // Catch:{ all -> 0x002b }
            int r0 = r5.f52176b     // Catch:{ all -> 0x002b }
            if (r0 > 0) goto L_0x0024
            r2 = r3
        L_0x0022:
            monitor-exit(r5)
            return r2
        L_0x0024:
            byte[] r4 = r5.f52181g     // Catch:{ all -> 0x002b }
            java.lang.System.arraycopy(r4, r1, r3, r2, r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r5)
            return r3
        L_0x002b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18382s.mo23889c():byte[]");
    }

    /* renamed from: d */
    public final synchronized byte[] mo23890d() {
        return this.f52181g;
    }

    /* renamed from: e */
    public final synchronized byte[] mo23891e(int i, int i2) {
        byte[] bArr;
        int length = mo23889c().length - (this.f52179e - i2);
        int min = Math.min(length, (i * SimpleSnackbar.LENGTH_SHORT) / 1000);
        bArr = new byte[min];
        System.arraycopy(mo23889c(), length - min, bArr, 0, min);
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return m35799f(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        throw new java.io.IOException("Audio stream not multiple of sample size.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if ((r2 % r7.f52178d) != 0) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.libraries.assistant.hotword.C18381r mo23887a(java.io.InputStream r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r8.getClass()
            int r0 = r7.f52176b     // Catch:{ all -> 0x0045 }
            r1 = 0
            r2 = 0
        L_0x0008:
            int r3 = r7.f52179e     // Catch:{ all -> 0x0045 }
            if (r2 >= r3) goto L_0x003f
            byte[] r4 = r7.f52181g     // Catch:{ all -> 0x0045 }
            int r5 = r7.f52176b     // Catch:{ all -> 0x0045 }
            int r3 = r3 - r2
            int r3 = r8.read(r4, r5, r3)     // Catch:{ all -> 0x0045 }
            r4 = -1
            if (r3 != r4) goto L_0x002c
            int r8 = r7.f52178d     // Catch:{ all -> 0x0045 }
            int r8 = r2 % r8
            if (r8 != 0) goto L_0x0024
            com.google.android.libraries.assistant.hotword.r r8 = r7.m35799f(r0, r2)     // Catch:{ all -> 0x0045 }
            monitor-exit(r7)
            return r8
        L_0x0024:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "Audio stream not multiple of sample size."
            r8.<init>(r0)     // Catch:{ all -> 0x0045 }
            throw r8     // Catch:{ all -> 0x0045 }
        L_0x002c:
            int r4 = r7.f52176b     // Catch:{ all -> 0x0045 }
            int r4 = r4 + r3
            r7.f52176b = r4     // Catch:{ all -> 0x0045 }
            int r5 = r7.f52179e     // Catch:{ all -> 0x0045 }
            int r5 = r5 + r4
            byte[] r6 = r7.f52181g     // Catch:{ all -> 0x0045 }
            int r6 = r6.length     // Catch:{ all -> 0x0045 }
            if (r5 <= r6) goto L_0x003d
            r7.f52183i = r4     // Catch:{ all -> 0x0045 }
            r7.f52176b = r1     // Catch:{ all -> 0x0045 }
        L_0x003d:
            int r2 = r2 + r3
            goto L_0x0008
        L_0x003f:
            com.google.android.libraries.assistant.hotword.r r8 = r7.m35799f(r0, r3)     // Catch:{ all -> 0x0045 }
            monitor-exit(r7)
            return r8
        L_0x0045:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x0049
        L_0x0048:
            throw r8
        L_0x0049:
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18382s.mo23887a(java.io.InputStream):com.google.android.libraries.assistant.hotword.r");
    }
}
