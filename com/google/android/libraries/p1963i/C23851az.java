package com.google.android.libraries.p1963i;

import android.os.Process;
import java.util.concurrent.atomic.AtomicInteger;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.i.az */
/* compiled from: PG */
public final class C23851az {

    /* renamed from: a */
    public final Thread f65295a;

    /* renamed from: b */
    public final int f65296b;

    /* renamed from: c */
    public final boolean f65297c;

    /* renamed from: d */
    public boolean f65298d;

    /* renamed from: e */
    public final AtomicInteger f65299e;

    public /* synthetic */ C23851az(Thread thread, int i, int i2, int i3) {
        i = (i3 & 2) != 0 ? -1 : i;
        i2 = (i3 & 8) != 0 ? -21 : i2;
        boolean z = (i3 & 16) != 0;
        C69664n.m101061g(thread, "thread");
        this.f65295a = thread;
        this.f65296b = i;
        this.f65297c = z;
        this.f65299e = new AtomicInteger(C23860ba.m44417a(true, false, i2, -21, -21));
    }

    /* renamed from: e */
    private final void m44402e(int i) {
        int i2;
        do {
            i2 = this.f65299e.get();
            int a = C23850ay.m44397a(i2);
            if (!C23850ay.m44399c(i2)) {
                throw new IllegalStateException("Check failed.");
            } else if (!C23850ay.m44400d(i2)) {
                int a2 = C23915s.m44502a(a);
                if (a2 != C23915s.m44502a(i)) {
                    this.f65295a.setPriority(a2);
                }
            } else if (a != i) {
                Process.setThreadPriority(this.f65296b, a);
                i = a;
            }
        } while (!this.f65299e.compareAndSet(i2, C23850ay.m44401e(i2, false, 0, 0, 29)));
    }

    /* renamed from: a */
    public final int mo29225a(int i) {
        int i2;
        if (this.f65297c) {
            while (true) {
                i2 = this.f65299e.get();
                if ((!C23850ay.m44399c(i2) && C23850ay.m44397a(i2) != C23850ay.m44397a(C23850ay.m44401e(i2, false, i, 0, 23))) || !this.f65299e.compareAndSet(i2, C23850ay.m44401e(i2, false, i, 0, 23))) {
                    if (this.f65299e.compareAndSet(i2, C23850ay.m44401e(C23850ay.m44401e(i2, false, i, 0, 23), true, 0, 0, 29))) {
                        m44402e(C23850ay.m44397a(i2));
                        break;
                    }
                } else {
                    break;
                }
            }
            return C23850ay.m44398b(i2, 1);
        }
        throw new IllegalStateException("Cannot override priority of non-boostable thread");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r1 == com.google.android.libraries.p1963i.C23850ay.m44397a(com.google.android.libraries.p1963i.C23850ay.m44401e(r0, false, 0, r7, 15))) goto L_0x0031;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29226b(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.f65297c
            if (r0 == 0) goto L_0x0073
        L_0x0004:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f65299e
            int r0 = r0.get()
            boolean r1 = com.google.android.libraries.p1963i.C23850ay.m44399c(r0)
            r2 = 15
            r3 = -21
            r4 = 0
            if (r1 != 0) goto L_0x0031
            int r1 = com.google.android.libraries.p1963i.C23850ay.m44397a(r0)
            int r5 = com.google.android.libraries.p1963i.C23850ay.m44398b(r0, r4)
            if (r5 == r3) goto L_0x0027
            int r5 = com.google.android.libraries.p1963i.C23850ay.m44398b(r0, r4)
            if (r5 <= r7) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            return
        L_0x0027:
            int r5 = com.google.android.libraries.p1963i.C23850ay.m44401e(r0, r4, r4, r7, r2)
            int r5 = com.google.android.libraries.p1963i.C23850ay.m44397a(r5)
            if (r1 != r5) goto L_0x004b
        L_0x0031:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.f65299e
            int r5 = com.google.android.libraries.p1963i.C23850ay.m44398b(r0, r4)
            if (r5 == r3) goto L_0x0041
            int r5 = com.google.android.libraries.p1963i.C23850ay.m44398b(r0, r4)
            if (r5 <= r7) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            return
        L_0x0041:
            int r5 = com.google.android.libraries.p1963i.C23850ay.m44401e(r0, r4, r4, r7, r2)
            boolean r1 = r1.compareAndSet(r0, r5)
            if (r1 != 0) goto L_0x0073
        L_0x004b:
            java.util.concurrent.atomic.AtomicInteger r1 = r6.f65299e
            int r5 = com.google.android.libraries.p1963i.C23850ay.m44398b(r0, r4)
            if (r5 == r3) goto L_0x005b
            int r3 = com.google.android.libraries.p1963i.C23850ay.m44398b(r0, r4)
            if (r3 <= r7) goto L_0x005a
            goto L_0x005b
        L_0x005a:
            return
        L_0x005b:
            int r2 = com.google.android.libraries.p1963i.C23850ay.m44401e(r0, r4, r4, r7, r2)
            r3 = 1
            r5 = 29
            int r2 = com.google.android.libraries.p1963i.C23850ay.m44401e(r2, r3, r4, r4, r5)
            boolean r1 = r1.compareAndSet(r0, r2)
            if (r1 == 0) goto L_0x0004
            int r7 = com.google.android.libraries.p1963i.C23850ay.m44397a(r0)
            r6.m44402e(r7)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1963i.C23851az.mo29226b(int):void");
    }

    /* renamed from: c */
    public final void mo29227c() {
        int i;
        do {
            i = this.f65299e.get();
            if ((C23850ay.m44399c(i) || C23850ay.m44397a(i) == C23850ay.m44397a(C23850ay.m44401e(i, false, 0, -21, 15))) && this.f65299e.compareAndSet(i, C23850ay.m44401e(i, false, 0, -21, 15))) {
                return;
            }
        } while (!this.f65299e.compareAndSet(i, C23850ay.m44401e(C23850ay.m44401e(i, false, 0, -21, 15), true, 0, 0, 29)));
        m44402e(C23850ay.m44397a(i));
    }

    /* renamed from: d */
    public final void mo29228d() {
        if (this.f65298d) {
            this.f65298d = false;
            return;
        }
        throw new IllegalStateException("Cannot release lock that was not acquired.");
    }
}
