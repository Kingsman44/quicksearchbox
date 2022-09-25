package com.google.apps.tiktok.contrib.p3629c;

import android.os.Bundle;
import androidx.navigation.C3840bh;
import androidx.navigation.C3864ce;

/* renamed from: com.google.apps.tiktok.contrib.c.m */
/* compiled from: PG */
final class C46492m extends C46504y {

    /* renamed from: a */
    private final int f121642a;

    /* renamed from: b */
    private final Bundle f121643b;

    /* renamed from: c */
    private final C46495p f121644c;

    /* renamed from: d */
    private final C3840bh f121645d;

    public C46492m(int i, Bundle bundle, C46495p pVar, C3840bh bhVar) {
        this.f121642a = i;
        this.f121643b = bundle;
        this.f121644c = pVar;
        this.f121645d = bhVar;
    }

    /* renamed from: a */
    public final int mo50496a() {
        return this.f121642a;
    }

    /* renamed from: b */
    public final Bundle mo50497b() {
        return this.f121643b;
    }

    /* renamed from: c */
    public final C3840bh mo50498c() {
        return this.f121645d;
    }

    /* renamed from: d */
    public final C3864ce mo50499d() {
        return null;
    }

    /* renamed from: e */
    public final C46495p mo50500e() {
        return this.f121644c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f121644c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r1 = r4.f121645d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f121643b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.apps.tiktok.contrib.p3629c.C46504y
            r2 = 0
            if (r1 == 0) goto L_0x005a
            com.google.apps.tiktok.contrib.c.y r5 = (com.google.apps.tiktok.contrib.p3629c.C46504y) r5
            int r1 = r4.f121642a
            int r3 = r5.mo50496a()
            if (r1 != r3) goto L_0x005a
            android.os.Bundle r1 = r4.f121643b
            if (r1 != 0) goto L_0x001e
            android.os.Bundle r1 = r5.mo50497b()
            if (r1 != 0) goto L_0x005a
            goto L_0x0028
        L_0x001e:
            android.os.Bundle r3 = r5.mo50497b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005a
        L_0x0028:
            com.google.apps.tiktok.contrib.c.p r1 = r4.f121644c
            if (r1 != 0) goto L_0x0033
            com.google.apps.tiktok.contrib.c.p r1 = r5.mo50500e()
            if (r1 != 0) goto L_0x005a
            goto L_0x003d
        L_0x0033:
            com.google.apps.tiktok.contrib.c.p r3 = r5.mo50500e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005a
        L_0x003d:
            androidx.navigation.bh r1 = r4.f121645d
            if (r1 != 0) goto L_0x0048
            androidx.navigation.bh r1 = r5.mo50498c()
            if (r1 != 0) goto L_0x005a
            goto L_0x0053
        L_0x0048:
            androidx.navigation.bh r3 = r5.mo50498c()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0053
            goto L_0x005a
        L_0x0053:
            androidx.navigation.ce r5 = r5.mo50499d()
            if (r5 != 0) goto L_0x005a
            return r0
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.contrib.p3629c.C46492m.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = this.f121642a;
        String valueOf = String.valueOf(this.f121643b);
        String valueOf2 = String.valueOf(this.f121644c);
        String valueOf3 = String.valueOf(this.f121645d);
        return "TikTokNavDestination{action=" + i + ", args=" + valueOf + ", tikTokArgument=" + valueOf2 + ", navOptions=" + valueOf3 + ", navigatorExtras=null}";
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f121642a ^ 1000003) * 1000003;
        Bundle bundle = this.f121643b;
        int i3 = 0;
        if (bundle == null) {
            i = 0;
        } else {
            i = bundle.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        C46495p pVar = this.f121644c;
        int hashCode = (i4 ^ (pVar == null ? 0 : pVar.hashCode())) * 1000003;
        C3840bh bhVar = this.f121645d;
        if (bhVar != null) {
            i3 = bhVar.hashCode();
        }
        return (hashCode ^ i3) * 1000003;
    }
}
