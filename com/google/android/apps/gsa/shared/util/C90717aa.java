package com.google.android.apps.gsa.shared.util;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;
import org.json.JSONArray;

/* renamed from: com.google.android.apps.gsa.shared.util.aa */
/* compiled from: PG */
public class C90717aa {

    /* renamed from: a */
    public static final C59071e f253772a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.aa");

    /* renamed from: b */
    public long f253773b;

    /* renamed from: c */
    public final int[] f253774c;

    /* renamed from: d */
    public int f253775d;

    /* renamed from: e */
    private final C21370a f253776e;

    /* renamed from: f */
    private final long f253777f;

    public C90717aa(C21370a aVar, long j, long j2) {
        this.f253776e = aVar;
        this.f253777f = j2;
        this.f253774c = new int[((int) (j / j2))];
    }

    /* renamed from: a */
    public final synchronized int mo85077a() {
        mo85079c();
        return this.f253775d;
    }

    /* renamed from: b */
    public final synchronized String mo85078b() {
        if (this.f253775d == 0) {
            return BuildConfig.FLAVOR;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.f253773b);
        for (int put : this.f253774c) {
            jSONArray.put(put);
        }
        return jSONArray.toString();
    }

    /* renamed from: c */
    public final void mo85079c() {
        long b = this.f253776e.mo26870b() / this.f253777f;
        long j = this.f253773b;
        if (b > j) {
            this.f253775d = 0;
            long j2 = b - j;
            int length = this.f253774c.length;
            while (true) {
                length--;
                if (length >= 0) {
                    long j3 = ((long) length) - j2;
                    if (j3 < 0) {
                        this.f253774c[length] = 0;
                    } else {
                        int[] iArr = this.f253774c;
                        int i = iArr[(int) j3];
                        iArr[length] = i;
                        this.f253775d += i;
                    }
                } else {
                    this.f253773b = b;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public synchronized void mo85080d() {
        mo85081e(this.f253776e.mo26870b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo85081e(long r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.mo85079c()     // Catch:{ all -> 0x0029 }
            long r0 = r4.f253773b     // Catch:{ all -> 0x0029 }
            long r2 = r4.f253777f     // Catch:{ all -> 0x0029 }
            long r5 = r5 / r2
            long r0 = r0 - r5
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0027
            int[] r5 = r4.f253774c     // Catch:{ all -> 0x0029 }
            int r6 = r5.length     // Catch:{ all -> 0x0029 }
            long r2 = (long) r6     // Catch:{ all -> 0x0029 }
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0027
            int r6 = (int) r0     // Catch:{ all -> 0x0029 }
            r0 = r5[r6]     // Catch:{ all -> 0x0029 }
            int r0 = r0 + 1
            r5[r6] = r0     // Catch:{ all -> 0x0029 }
            int r5 = r4.f253775d     // Catch:{ all -> 0x0029 }
            int r5 = r5 + 1
            r4.f253775d = r5     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)
            return
        L_0x0027:
            monitor-exit(r4)
            return
        L_0x0029:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.util.C90717aa.mo85081e(long):void");
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f253774c);
        return "ExpiringSum[" + arrays + "]";
    }
}
