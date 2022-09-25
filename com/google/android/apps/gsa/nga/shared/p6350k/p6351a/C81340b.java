package com.google.android.apps.gsa.nga.shared.p6350k.p6351a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.nga.api.C74690an;
import com.google.android.apps.gsa.nga.shared.p6350k.C81343c;
import com.google.android.libraries.assistant.p1484g.p1502d.C18174k;
import com.google.android.libraries.assistant.p1484g.p1502d.C18175l;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.shared.k.a.b */
/* compiled from: PG */
final class C81340b extends C74690an {

    /* renamed from: a */
    final /* synthetic */ C2164c f222627a;

    public C81340b(C2164c cVar) {
        this.f222627a = cVar;
    }

    /* renamed from: e */
    public final void mo75006e(String str, String str2) {
        this.f222627a.mo5439d(new C18175l(C18174k.m35382b(str2), str, (Throwable) null));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75007f(java.lang.String r8) {
        /*
            r7 = this;
            androidx.d.a.c r0 = r7.f222627a
            int r1 = r8.hashCode()
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -913743850: goto L_0x0041;
                case -268910185: goto L_0x0037;
                case 294208580: goto L_0x002d;
                case 433141802: goto L_0x0023;
                case 622639033: goto L_0x0019;
                case 1787197481: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x004b
        L_0x000f:
            java.lang.String r1 = "NO_INFORMATION_ABOUT_SUPPORTED_ACTIONS"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x004b
            r8 = 4
            goto L_0x004c
        L_0x0019:
            java.lang.String r1 = "ACTION_NOT_SUPPORTED"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x004b
            r8 = 1
            goto L_0x004c
        L_0x0023:
            java.lang.String r1 = "UNKNOWN"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x004b
            r8 = 0
            goto L_0x004c
        L_0x002d:
            java.lang.String r1 = "APP_NOT_SUPPORTED"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x004b
            r8 = 2
            goto L_0x004c
        L_0x0037:
            java.lang.String r1 = "ONBOARDING_UNSUCCESSFUL"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x004b
            r8 = 5
            goto L_0x004c
        L_0x0041:
            java.lang.String r1 = "FETCHING_ACTIONS_FAILED"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x004b
            r8 = 3
            goto L_0x004c
        L_0x004b:
            r8 = -1
        L_0x004c:
            if (r8 == 0) goto L_0x0066
            if (r8 == r6) goto L_0x0064
            if (r8 == r5) goto L_0x0062
            if (r8 == r4) goto L_0x0060
            if (r8 == r3) goto L_0x0067
            if (r8 != r2) goto L_0x005a
            r2 = 6
            goto L_0x0067
        L_0x005a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L_0x0060:
            r2 = 4
            goto L_0x0067
        L_0x0062:
            r2 = 3
            goto L_0x0067
        L_0x0064:
            r2 = 2
            goto L_0x0067
        L_0x0066:
            r2 = 1
        L_0x0067:
            com.google.android.apps.gsa.nga.shared.k.a r8 = com.google.android.apps.gsa.nga.shared.p6350k.C81338a.m129378a(r2)
            r0.mo5439d(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6350k.p6351a.C81340b.mo75007f(java.lang.String):void");
    }

    /* renamed from: g */
    public final void mo75008g(boolean z, boolean z2) {
        C81343c cVar;
        C2164c cVar2 = this.f222627a;
        Duration duration = C81341c.f222628a;
        if (z2) {
            cVar = C81343c.ACTION_ONBOARDING_FAILED_TO_FINISH;
        } else {
            cVar = C81343c.m129385a(z);
        }
        cVar2.mo5437b(cVar);
    }

    /* renamed from: h */
    public final void mo75009h(String str) {
        this.f222627a.mo5439d(new IllegalArgumentException(str));
    }

    /* renamed from: i */
    public final void mo75010i(String str) {
        this.f222627a.mo5439d(new Exception(str));
    }
}
