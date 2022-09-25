package com.google.android.libraries.p10923ac.p10925b.p10943j;

import android.accounts.Account;
import com.google.protos.p4895aw.p4902b.C64054dj;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;

/* renamed from: com.google.android.libraries.ac.b.j.a */
/* compiled from: PG */
public final class C147104a extends C147112i {

    /* renamed from: a */
    public final String f397165a;

    /* renamed from: b */
    public final Account f397166b;

    /* renamed from: c */
    public final C64098p f397167c;

    /* renamed from: d */
    public final C64054dj f397168d;

    /* renamed from: e */
    public final C64095m f397169e;

    /* renamed from: f */
    private final long f397170f;

    /* renamed from: g */
    private final int f397171g;

    /* renamed from: h */
    private final long f397172h;

    public C147104a(String str, Account account, C64098p pVar, C64054dj djVar, C64095m mVar, long j, int i, long j2) {
        if (str != null) {
            this.f397165a = str;
            if (account != null) {
                this.f397166b = account;
                if (pVar != null) {
                    this.f397167c = pVar;
                    this.f397168d = djVar;
                    this.f397169e = mVar;
                    this.f397170f = j;
                    this.f397171g = i;
                    this.f397172h = j2;
                    return;
                }
                throw new NullPointerException("Null channelId");
            }
            throw new NullPointerException("Null account");
        }
        throw new NullPointerException("Null appId");
    }

    /* renamed from: a */
    public final int mo123922a() {
        return this.f397171g;
    }

    /* renamed from: b */
    public final long mo123923b() {
        return this.f397172h;
    }

    /* renamed from: c */
    public final long mo123924c() {
        return this.f397170f;
    }

    /* renamed from: d */
    public final Account mo123925d() {
        return this.f397166b;
    }

    /* renamed from: e */
    public final C64095m mo123926e() {
        return this.f397169e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r1 = r7.f397168d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r1 = r7.f397169e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i
            r2 = 0
            if (r1 == 0) goto L_0x0077
            com.google.android.libraries.ac.b.j.i r8 = (com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i) r8
            java.lang.String r1 = r7.f397165a
            java.lang.String r3 = r8.mo123930h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
            android.accounts.Account r1 = r7.f397166b
            android.accounts.Account r3 = r8.mo123925d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
            com.google.protos.aw.b.p r1 = r7.f397167c
            com.google.protos.aw.b.p r3 = r8.mo123928f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
            com.google.protos.aw.b.dj r1 = r7.f397168d
            if (r1 != 0) goto L_0x003a
            com.google.protos.aw.b.dj r1 = r8.mo123929g()
            if (r1 != 0) goto L_0x0077
            goto L_0x0044
        L_0x003a:
            com.google.protos.aw.b.dj r3 = r8.mo123929g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
        L_0x0044:
            com.google.protos.aw.b.m r1 = r7.f397169e
            if (r1 != 0) goto L_0x004f
            com.google.protos.aw.b.m r1 = r8.mo123926e()
            if (r1 != 0) goto L_0x0077
            goto L_0x005a
        L_0x004f:
            com.google.protos.aw.b.m r3 = r8.mo123926e()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x005a
            goto L_0x0077
        L_0x005a:
            long r3 = r7.f397170f
            long r5 = r8.mo123924c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0077
            int r1 = r7.f397171g
            int r3 = r8.mo123922a()
            if (r1 != r3) goto L_0x0077
            long r3 = r7.f397172h
            long r5 = r8.mo123923b()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0077
            return r0
        L_0x0077:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10943j.C147104a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C64098p mo123928f() {
        return this.f397167c;
    }

    /* renamed from: g */
    public final C64054dj mo123929g() {
        return this.f397168d;
    }

    /* renamed from: h */
    public final String mo123930h() {
        return this.f397165a;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f397165a.hashCode() ^ 1000003) * 1000003) ^ this.f397166b.hashCode()) * 1000003) ^ this.f397167c.hashCode()) * 1000003;
        C64054dj djVar = this.f397168d;
        int i2 = 0;
        if (djVar == null) {
            i = 0;
        } else {
            i = djVar.hashCode();
        }
        int i3 = (hashCode ^ i) * 1000003;
        C64095m mVar = this.f397169e;
        if (mVar != null) {
            i2 = mVar.hashCode();
        }
        long j = this.f397170f;
        int i4 = this.f397171g;
        long j2 = this.f397172h;
        return ((((((i3 ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i4) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.f397165a;
        String obj = this.f397166b.toString();
        String obj2 = this.f397167c.toString();
        String valueOf = String.valueOf(this.f397168d);
        String valueOf2 = String.valueOf(this.f397169e);
        long j = this.f397170f;
        int i = this.f397171g;
        long j2 = this.f397172h;
        return "Subscription{appId=" + str + ", account=" + obj + ", channelId=" + obj2 + ", syncPolicy=" + valueOf + ", channelFilter=" + valueOf2 + ", elapsedRealtime=" + j + ", bootCount=" + i + ", currentTimeMillis=" + j2 + "}";
    }
}
