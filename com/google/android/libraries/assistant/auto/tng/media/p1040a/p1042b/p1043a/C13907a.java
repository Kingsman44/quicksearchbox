package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.p1043a;

import android.support.p031v4.media.session.C0320v;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13920d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13907a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C13917k f42348a;

    /* renamed from: b */
    public final /* synthetic */ String f42349b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f42350c;

    /* renamed from: d */
    public final /* synthetic */ Optional f42351d;

    /* renamed from: e */
    public final /* synthetic */ C13920d f42352e;

    public /* synthetic */ C13907a(C13917k kVar, String str, C0320v vVar, Optional optional, C13920d dVar) {
        this.f42348a = kVar;
        this.f42349b = str;
        this.f42350c = vVar;
        this.f42351d = optional;
        this.f42352e = dVar;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.google.android.libraries.assistant.auto.tng.media.a.b.b] */
    /* JADX WARNING: type inference failed for: r0v23, types: [com.google.android.libraries.assistant.auto.tng.media.a.b.a.i] */
    /* JADX WARNING: type inference failed for: r0v24, types: [com.google.android.libraries.assistant.auto.tng.media.a.b.a.d] */
    /* JADX WARNING: type inference failed for: r0v25, types: [com.google.android.libraries.assistant.auto.tng.media.a.b.a.e] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3781a(androidx.p104d.p105a.C2164c r12) {
        /*
            r11 = this;
            com.google.android.libraries.assistant.auto.tng.media.a.b.a.k r6 = r11.f42348a
            java.lang.String r5 = r11.f42349b
            android.support.v4.media.session.v r7 = r11.f42350c
            j$.util.Optional r4 = r11.f42351d
            com.google.android.libraries.assistant.auto.tng.media.a.b.d r8 = r11.f42352e
            dagger.a r0 = r6.f42383c
            java.lang.Object r0 = r0.mo27525b()
            r9 = r0
            com.google.android.libraries.assistant.auto.tng.media.a.b.c r9 = (com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.C13919c) r9
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1431171252: goto L_0x003c;
                case -1355740809: goto L_0x0032;
                case -26624189: goto L_0x0028;
                case 1893603276: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0046
        L_0x001e:
            java.lang.String r0 = "media.STOP"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0028:
            java.lang.String r0 = "media.PLAY_MEDIA"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 2
            goto L_0x0047
        L_0x0032:
            java.lang.String r0 = "media.RESUME"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 3
            goto L_0x0047
        L_0x003c:
            java.lang.String r0 = "media.PAUSE"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 0
            goto L_0x0047
        L_0x0046:
            r0 = -1
        L_0x0047:
            if (r0 == 0) goto L_0x0063
            if (r0 == r3) goto L_0x0063
            if (r0 == r2) goto L_0x0059
            if (r0 == r1) goto L_0x0059
            com.google.android.libraries.assistant.auto.tng.media.a.b.a.e r10 = new com.google.android.libraries.assistant.auto.tng.media.a.b.a.e
            r0 = r10
            r1 = r6
            r2 = r12
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x006c
        L_0x0059:
            com.google.android.libraries.assistant.auto.tng.media.a.b.a.d r10 = new com.google.android.libraries.assistant.auto.tng.media.a.b.a.d
            r0 = r10
            r1 = r6
            r2 = r12
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x006c
        L_0x0063:
            com.google.android.libraries.assistant.auto.tng.media.a.b.a.i r10 = new com.google.android.libraries.assistant.auto.tng.media.a.b.a.i
            r0 = r10
            r1 = r6
            r2 = r12
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x006c:
            r9.f42393d = r10
            com.google.android.libraries.assistant.auto.tng.media.a.b.a.c r12 = new com.google.android.libraries.assistant.auto.tng.media.a.b.a.c
            r12.<init>(r6, r7)
            java.util.concurrent.ScheduledExecutorService r0 = r6.f42382b
            java.lang.Runnable r12 = com.google.apps.tiktok.tracing.C47810es.m84977q(r12)
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92903l(r12, r0)
            com.google.android.libraries.assistant.auto.tng.media.a.b.a.g r0 = new com.google.android.libraries.assistant.auto.tng.media.a.b.a.g
            r0.<init>(r8, r7)
            java.util.concurrent.ScheduledExecutorService r1 = r6.f42382b
            com.google.common.util.concurrent.bz r0 = com.google.apps.tiktok.tracing.C47810es.m84974n(r0)
            com.google.common.util.concurrent.C60856cj.m92911t(r12, r0, r1)
            java.lang.String r12 = "[Media][Executor] executeMediaOperation"
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.media.p1040a.p1042b.p1043a.C13907a.mo3781a(androidx.d.a.c):java.lang.Object");
    }
}
