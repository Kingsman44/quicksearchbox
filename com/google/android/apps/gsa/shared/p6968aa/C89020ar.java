package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.plugins.p6468a.C84054a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91010j;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59839hc;
import com.google.common.p4552o.C59842hf;
import java.net.URL;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.aa.ar */
/* compiled from: PG */
public final class C89020ar implements C91010j {

    /* renamed from: a */
    public static final C59071e f241252a = C59071e.m91332i("com.google.android.apps.gsa.shared.aa.ar");

    /* renamed from: b */
    public static final C58528ij f241253b = C58528ij.m90013M("GET", "HEAD", "POST", "PUT");

    /* renamed from: c */
    public static final C58528ij f241254c = C58528ij.m90012L("GET", "HEAD", "PUT");

    /* renamed from: d */
    public static final C58528ij f241255d = C58528ij.m90015O("Authorization".toLowerCase(Locale.US), "Cookie".toLowerCase(Locale.US), "From".toLowerCase(Locale.US), "If-Modified-Since".toLowerCase(Locale.US), "If-Range".toLowerCase(Locale.US), "If-Unmodified-Since".toLowerCase(Locale.US), "Max-Forwards".toLowerCase(Locale.US), "Proxy-Authorization".toLowerCase(Locale.US), "Referer".toLowerCase(Locale.US), "User-Agent".toLowerCase(Locale.US));

    /* renamed from: e */
    public static final C58528ij f241256e = C58528ij.m90014N("Range".toLowerCase(Locale.US), "User-Agent".toLowerCase(Locale.US), "Accept-Encoding".toLowerCase(Locale.US), "Content-Type".toLowerCase(Locale.US), "Icy-MetaData".toLowerCase(Locale.US));

    /* renamed from: f */
    public final URL f241257f;

    /* renamed from: g */
    public final String f241258g;

    /* renamed from: h */
    public final String f241259h;

    /* renamed from: i */
    public final C58485gu f241260i;

    /* renamed from: j */
    public final boolean f241261j;

    /* renamed from: k */
    public final boolean f241262k;

    /* renamed from: l */
    public final boolean f241263l;

    /* renamed from: m */
    public final boolean f241264m;

    /* renamed from: n */
    public final boolean f241265n;

    /* renamed from: o */
    public final boolean f241266o;

    /* renamed from: p */
    public final int f241267p;

    /* renamed from: q */
    public final int f241268q;

    /* renamed from: r */
    public final int f241269r;

    /* renamed from: s */
    public final int f241270s;

    /* renamed from: t */
    public final int f241271t;

    /* renamed from: u */
    public final boolean f241272u;

    /* renamed from: v */
    public final C89042bm f241273v;

    /* renamed from: w */
    public final StackTraceElement[] f241274w;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89020ar(com.google.android.apps.gsa.shared.p6968aa.C89019aq r11) {
        /*
            r10 = this;
            r10.<init>()
            java.net.URL r0 = r11.f241236b
            r0.getClass()
            r10.f241257f = r0
            com.google.common.b.ij r0 = f241253b
            java.lang.String r1 = r11.f241235a
            boolean r0 = r0.contains(r1)
            com.google.common.base.C58838bb.m90868c(r0)
            java.lang.String r0 = r11.f241235a
            r0.getClass()
            r10.f241258g = r0
            java.lang.String r0 = r11.f241237c
            r10.f241259h = r0
            java.util.List r0 = r11.f241238d
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89842j(r0)
            r10.f241260i = r0
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0030:
            r6 = 1
            if (r3 >= r1) goto L_0x0066
            java.lang.Object r7 = r0.get(r3)
            com.google.android.apps.gsa.shared.aa.al r7 = (com.google.android.apps.gsa.shared.p6968aa.C89014al) r7
            java.lang.String r8 = r7.f241218a
            java.lang.String r9 = "Cache-Control"
            boolean r8 = r8.equalsIgnoreCase(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.String r8 = r7.f241219b
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r8 = r8.toLowerCase(r9)
            java.lang.String r9 = "no-cache"
            boolean r8 = r8.contains(r9)
            r4 = r4 | r8
            java.lang.String r7 = r7.f241219b
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.String r8 = "no-store"
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x0063
            r5 = 1
        L_0x0063:
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0066:
            if (r4 == 0) goto L_0x006d
            if (r5 != 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r0 = 0
            goto L_0x006e
        L_0x006d:
            r0 = 1
        L_0x006e:
            r10.f241272u = r0
            boolean r0 = r11.f241244j
            r10.f241261j = r0
            boolean r0 = r11.f241239e
            r10.f241262k = r0
            boolean r0 = r11.f241240f
            r10.f241263l = r0
            boolean r0 = r11.f241241g
            r10.f241264m = r0
            boolean r0 = r11.f241242h
            r10.f241265n = r0
            boolean r0 = r11.f241243i
            r10.f241266o = r0
            int r0 = r11.f241245k
            r1 = -1
            if (r0 == r1) goto L_0x008f
            r0 = 1
            goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            com.google.common.base.C58838bb.m90868c(r0)
            int r0 = r11.f241245k
            r10.f241267p = r0
            int r0 = r11.f241246l
            m144761h(r0)
            r10.f241268q = r0
            int r3 = r11.f241247m
            m144761h(r3)
            r10.f241269r = r3
            int r4 = r11.f241248n
            m144761h(r4)
            if (r4 == r1) goto L_0x00b7
            if (r0 == r1) goto L_0x00b7
            if (r0 <= 0) goto L_0x00b3
            r0 = 0
            r4 = 0
            goto L_0x00b8
        L_0x00b3:
            r0 = 0
            r4 = 0
            r5 = 0
            goto L_0x00b9
        L_0x00b7:
            r0 = r4
        L_0x00b8:
            r5 = 1
        L_0x00b9:
            java.lang.String r7 = "Invalid timeout value: %s."
            com.google.common.base.C58838bb.m90871f(r5, r7, r4)
            if (r4 == r1) goto L_0x00c4
            if (r3 == r1) goto L_0x00c4
            if (r3 <= 0) goto L_0x00c5
        L_0x00c4:
            r2 = 1
        L_0x00c5:
            com.google.common.base.C58838bb.m90871f(r2, r7, r4)
            r10.f241270s = r0
            int r0 = r11.f241249o
            r10.f241271t = r0
            com.google.android.apps.gsa.shared.aa.bm r0 = r11.f241250p
            r0.getClass()
            r10.f241273v = r0
            java.lang.StackTraceElement[] r11 = r11.f241251q
            if (r11 != 0) goto L_0x00e5
            java.lang.Throwable r11 = new java.lang.Throwable
            r11.<init>()
            java.lang.StackTraceElement[] r11 = r11.getStackTrace()
            r10.f241274w = r11
            return
        L_0x00e5:
            r10.f241274w = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p6968aa.C89020ar.<init>(com.google.android.apps.gsa.shared.aa.aq):void");
    }

    /* renamed from: a */
    public static C89019aq m144756a() {
        C89019aq aqVar = new C89019aq();
        aqVar.mo82992d("GET");
        aqVar.f241244j = true;
        return aqVar;
    }

    /* renamed from: b */
    public static C89019aq m144757b() {
        C89019aq aqVar = new C89019aq();
        aqVar.mo82992d("HEAD");
        aqVar.f241244j = true;
        return aqVar;
    }

    /* renamed from: c */
    public static C89019aq m144758c() {
        C89019aq aqVar = new C89019aq();
        aqVar.mo82992d("GET");
        aqVar.mo82993e("Cache-Control", "no-cache, no-store");
        aqVar.f241244j = true;
        return aqVar;
    }

    /* renamed from: d */
    public static C89019aq m144759d() {
        C89019aq aqVar = new C89019aq();
        aqVar.mo82992d("POST");
        aqVar.f241239e = false;
        aqVar.mo82993e("Cache-Control", "no-cache, no-store");
        aqVar.f241244j = true;
        return aqVar;
    }

    /* renamed from: e */
    public static C89019aq m144760e() {
        C89019aq aqVar = new C89019aq();
        aqVar.mo82992d("PUT");
        aqVar.f241239e = false;
        aqVar.mo82993e("Cache-Control", "no-cache, no-store");
        aqVar.f241244j = true;
        return aqVar;
    }

    /* renamed from: h */
    public static void m144761h(int i) {
        boolean z = true;
        if (i <= 0) {
            if (i == -1) {
                i = -1;
            } else {
                z = false;
            }
        }
        C58838bb.m90871f(z, "Invalid timeout value: %s.", i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo82996f(C59839hc hcVar) {
        boolean z = this.f241272u;
        hcVar.copyOnWrite();
        C59842hf hfVar = (C59842hf) hcVar.instance;
        C59842hf hfVar2 = C59842hf.f161717k;
        hfVar.f161719a |= 16;
        hfVar.f161721c = z;
        boolean z2 = this.f241262k;
        hcVar.copyOnWrite();
        C59842hf hfVar3 = (C59842hf) hcVar.instance;
        hfVar3.f161719a |= 64;
        hfVar3.f161722d = z2;
        int i = this.f241268q;
        hcVar.copyOnWrite();
        C59842hf hfVar4 = (C59842hf) hcVar.instance;
        hfVar4.f161719a |= 128;
        hfVar4.f161723e = i;
        int i2 = this.f241269r;
        hcVar.copyOnWrite();
        C59842hf hfVar5 = (C59842hf) hcVar.instance;
        hfVar5.f161719a |= 256;
        hfVar5.f161724f = i2;
        int i3 = this.f241270s;
        hcVar.copyOnWrite();
        C59842hf hfVar6 = (C59842hf) hcVar.instance;
        hfVar6.f161719a |= 512;
        hfVar6.f161725g = i3;
    }

    /* renamed from: g */
    public final void mo27451g(C91005e eVar) {
        eVar.mo85277b("%s request to ", C90752i.m148229c(this.f241258g));
        C89024av.m144774a(eVar, this.f241257f);
        C90752i[] iVarArr = new C90752i[7];
        iVarArr[0] = C90752i.m148229c(C84054a.m133949a(this.f241267p));
        iVarArr[1] = C90752i.m148228b(Boolean.valueOf(this.f241272u));
        iVarArr[2] = C90752i.m148229c(true != this.f241262k ? "no-follow" : "follow");
        iVarArr[3] = C90752i.m148229c(true != this.f241266o ? "no-rewrite" : "rewrite");
        iVarArr[4] = C90752i.m148230d(Integer.valueOf(this.f241268q));
        iVarArr[5] = C90752i.m148230d(Integer.valueOf(this.f241269r));
        iVarArr[6] = C90752i.m148230d(Integer.valueOf(this.f241270s));
        eVar.mo85277b("[tag: %s, cache: %b, %s, %s, timeout: %d+%d", iVarArr);
        if (this.f241265n) {
            eVar.mo85277b(", retry", new C90752i[0]);
        }
        String str = this.f241259h;
        if (str != null) {
            eVar.mo85277b(", userAgent: %s", C90752i.m148229c(str));
        }
        eVar.mo85277b("] ", new C90752i[0]);
        C89014al.m144738a(eVar, this.f241260i);
    }
}
