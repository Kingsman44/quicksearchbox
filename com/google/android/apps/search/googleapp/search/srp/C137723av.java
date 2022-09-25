package com.google.android.apps.search.googleapp.search.srp;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.libraries.web.contrib.p3360c.C43403a;
import com.google.android.libraries.web.contrib.p3384g.C43582c;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.av */
/* compiled from: PG */
public final class C137723av {

    /* renamed from: a */
    public final int f374624a;

    /* renamed from: b */
    public final int f374625b;

    /* renamed from: c */
    public final int f374626c;

    /* renamed from: d */
    private final Fragment f374627d;

    /* renamed from: e */
    private final C136832c f374628e;

    /* renamed from: f */
    private final C43403a f374629f;

    /* renamed from: g */
    private final C43582c f374630g;

    /* renamed from: a */
    public final void mo113925a() {
        if (!this.f374627d.isStateSaved()) {
            this.f374629f.mo46502a(this.f374628e.mo113405k().path("gen_204").build().toString());
        }
    }

    /* renamed from: b */
    public final void mo113926b() {
        if (this.f374627d.getChildFragmentManager().f634a.mo671c("WEB_FRAGMENT") == null) {
            this.f374630g.mo46627a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C137723av(java.lang.String r7, java.lang.String r8, long r9, com.google.android.libraries.web.contrib.p3360c.C43403a r11, com.google.android.libraries.web.contrib.p3384g.C43582c r12, android.support.p031v4.app.Fragment r13, com.google.android.apps.search.googleapp.p10369o.C136832c r14) {
        /*
            r6 = this;
            r6.<init>()
            int r0 = r7.hashCode()
            r1 = -987688940(0xffffffffc5211014, float:-2577.005)
            r2 = -1
            r3 = 0
            r4 = 1
            r5 = 2
            if (r0 == r1) goto L_0x002f
            r1 = -348377138(0xffffffffeb3c2fce, float:-2.275038E26)
            if (r0 == r1) goto L_0x0025
            r1 = 1203955247(0x47c2e62f, float:99788.37)
            if (r0 == r1) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r0 = "PRELOAD_AFTER_SUGGESTION_SHOWN"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0039
            r7 = 2
            goto L_0x003a
        L_0x0025:
            java.lang.String r0 = "PRELOAD_NONE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0039
            r7 = 0
            goto L_0x003a
        L_0x002f:
            java.lang.String r0 = "PRELOAD_ON_EDIT"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0039
            r7 = 1
            goto L_0x003a
        L_0x0039:
            r7 = -1
        L_0x003a:
            r0 = 3
            if (r7 == 0) goto L_0x004b
            if (r7 == r4) goto L_0x0049
            if (r7 != r5) goto L_0x0043
            r7 = 3
            goto L_0x004c
        L_0x0043:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L_0x0049:
            r7 = 2
            goto L_0x004c
        L_0x004b:
            r7 = 1
        L_0x004c:
            r6.f374624a = r7
            r6.f374627d = r13
            r6.f374628e = r14
            int r7 = r8.hashCode()
            r13 = 780275087(0x2e820d8f, float:5.914124E-11)
            if (r7 == r13) goto L_0x007a
            r13 = 1201616304(0x479f35b0, float:81515.375)
            if (r7 == r13) goto L_0x0070
            r13 = 1722447717(0x66aa7765, float:4.0250237E23)
            if (r7 == r13) goto L_0x0066
            goto L_0x0083
        L_0x0066:
            java.lang.String r7 = "PREWARM_ON_CREATE"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0083
            r2 = 1
            goto L_0x0083
        L_0x0070:
            java.lang.String r7 = "PREWARM_AFTER_SUGGESTION_SHOWN"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0083
            r2 = 2
            goto L_0x0083
        L_0x007a:
            java.lang.String r7 = "PREWARM_NONE"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0083
            r2 = 0
        L_0x0083:
            if (r2 == 0) goto L_0x0093
            if (r2 == r4) goto L_0x0091
            if (r2 != r5) goto L_0x008b
            r7 = 3
            goto L_0x0094
        L_0x008b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L_0x0091:
            r7 = 2
            goto L_0x0094
        L_0x0093:
            r7 = 1
        L_0x0094:
            r6.f374625b = r7
            int r7 = (int) r9
            if (r7 == 0) goto L_0x00a6
            if (r7 == r4) goto L_0x00a4
            if (r7 == r5) goto L_0x00a2
            if (r7 == r0) goto L_0x00a0
            goto L_0x00a7
        L_0x00a0:
            r3 = 5
            goto L_0x00a7
        L_0x00a2:
            r3 = 4
            goto L_0x00a7
        L_0x00a4:
            r3 = 3
            goto L_0x00a7
        L_0x00a6:
            r3 = 2
        L_0x00a7:
            r6.f374626c = r3
            r6.f374629f = r11
            r6.f374630g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.C137723av.<init>(java.lang.String, java.lang.String, long, com.google.android.libraries.web.contrib.c.a, com.google.android.libraries.web.contrib.g.c, android.support.v4.app.Fragment, com.google.android.apps.search.googleapp.o.c):void");
    }
}
