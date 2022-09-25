package com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d;

import android.content.Context;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.util.List;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.d.j */
/* compiled from: PG */
public final class C40124j {

    /* renamed from: a */
    public final C40125k f105377a;

    /* renamed from: b */
    private final Context f105378b;

    /* renamed from: c */
    private final C69464a f105379c;

    /* renamed from: d */
    private final C46459k f105380d;

    /* renamed from: e */
    private C58485gu f105381e;

    public C40124j(Context context, C69464a aVar, C40125k kVar, C46459k kVar2) {
        this.f105378b = context;
        this.f105379c = aVar;
        this.f105377a = kVar;
        this.f105380d = kVar2;
    }

    /* renamed from: b */
    private static Object m69687b(List list, Object obj) {
        C58838bb.m90868c(!list.isEmpty());
        Object obj2 = list.get(0);
        Objects.requireNonNull(obj2);
        return C58557jl.m90137r(list, new C40123i(obj2)) ? obj2 : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0172, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42214a(com.google.common.p4522b.C58485gu r8) {
        /*
            r7 = this;
            com.google.common.b.gu r0 = r7.f105381e
            boolean r0 = com.google.common.p4522b.C58597ky.m90218i(r8, r0)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            r7.f105381e = r8
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0012
            return
        L_0x0012:
            int r0 = r8.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x004d
            java.lang.Object r8 = r8.get(r1)
            com.google.android.libraries.search.rendering.xuikit.bubbles.d.d r8 = (com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40118d) r8
            g.a.a r0 = r7.f105379c
            java.lang.Object r0 = r0.mo17428b()
            com.google.android.libraries.search.rendering.xuikit.bubbles.d.f r0 = (com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40120f) r0
            java.lang.String r1 = r8.mo42205b()
            r0.mo42213c(r1)
            java.lang.String r1 = r8.mo42206c()
            com.google.common.base.cr r2 = r0.f105373a
            java.lang.Object r2 = r2.mo6453a()
            androidx.core.app.z r2 = (androidx.core.app.C1839z) r2
            java.lang.CharSequence r1 = androidx.core.app.C1839z.m5037c(r1)
            r2.f5686f = r1
            int r8 = r8.mo42204a()
            r0.mo42212b(r8)
            android.app.Notification r8 = r0.mo42211a()
            goto L_0x00b1
        L_0x004d:
            androidx.core.app.ac r0 = new androidx.core.app.ac
            r0.<init>()
            int r2 = r8.size()
        L_0x0056:
            if (r1 >= r2) goto L_0x0068
            java.lang.Object r3 = r8.get(r1)
            com.google.android.libraries.search.rendering.xuikit.bubbles.d.d r3 = (com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40118d) r3
            java.lang.String r3 = r3.mo42205b()
            r0.mo4992g(r3)
            int r1 = r1 + 1
            goto L_0x0056
        L_0x0068:
            g.a.a r1 = r7.f105379c
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.search.rendering.xuikit.bubbles.d.f r1 = (com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40120f) r1
            com.google.android.libraries.search.rendering.xuikit.bubbles.d.h r2 = com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40122h.f105375a
            java.util.List r2 = com.google.common.p4522b.C58597ky.m90217h(r8, r2)
            android.content.Context r3 = r7.f105378b
            r4 = 2132085502(0x7f150afe, float:1.9811205E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.Object r2 = m69687b(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            r1.mo42213c(r2)
            com.google.android.libraries.search.rendering.xuikit.bubbles.d.g r2 = com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40121g.f105374a
            java.util.List r8 = com.google.common.p4522b.C58597ky.m90217h(r8, r2)
            r2 = 2131234208(0x7f080da0, float:1.8084575E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r8 = m69687b(r8, r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.mo42212b(r8)
            com.google.common.base.cr r8 = r1.f105373a
            java.lang.Object r8 = r8.mo6453a()
            androidx.core.app.z r8 = (androidx.core.app.C1839z) r8
            r8.mo5022k(r0)
            android.app.Notification r8 = r1.mo42211a()
        L_0x00b1:
            com.google.apps.tiktok.concurrent.k r0 = r7.f105380d
            com.google.android.libraries.search.rendering.xuikit.bubbles.d.k r1 = r7.f105377a
            java.lang.Object r2 = r1.f105382a
            monitor-enter(r2)
            com.google.common.util.concurrent.SettableFuture r1 = r1.f105384c     // Catch:{ all -> 0x0179 }
            monitor-exit(r2)     // Catch:{ all -> 0x0179 }
            com.google.apps.tiktok.concurrent.x r0 = r0.f121568e
            java.lang.String r2 = "A notification is required to use a foreground service"
            com.google.common.base.C58838bb.m90866a(r8, r2)
            java.lang.Class<com.google.apps.tiktok.concurrent.InternalForegroundService> r2 = com.google.apps.tiktok.concurrent.InternalForegroundService.class
            r0.f121611h = r2
            boolean r2 = r1.isDone()
            if (r2 == 0) goto L_0x00cd
            return
        L_0x00cd:
            android.app.NotificationManager r2 = r0.f121609f
            boolean r2 = r2.areNotificationsEnabled()
            if (r2 != 0) goto L_0x00e3
            com.google.common.f.e r2 = com.google.apps.tiktok.concurrent.C46472x.f121604a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "User disabled notifications for app"
            r4 = 54729(0xd5c9, float:7.6692E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x00e3:
            android.app.NotificationManager r2 = r0.f121609f
            java.lang.String r3 = r8.getChannelId()
            android.app.NotificationChannel r2 = r2.getNotificationChannel(r3)
            int r3 = r2.getImportance()
            int r2 = r2.getImportance()
            r4 = 2
            if (r2 >= r4) goto L_0x0106
            com.google.common.f.e r2 = com.google.apps.tiktok.concurrent.C46472x.f121604a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r5 = "User blocked notification channel"
            r6 = 54728(0xd5c8, float:7.669E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r5)
        L_0x0106:
            java.lang.String r2 = "service"
            r8.category = r2
            int r2 = r8.flags
            r2 = r2 | 256(0x100, float:3.59E-43)
            r8.flags = r2
            int r2 = r8.flags
            r2 = r2 | 34
            r8.flags = r2
            com.google.apps.tiktok.concurrent.v r2 = new com.google.apps.tiktok.concurrent.v
            java.lang.String r5 = com.google.apps.tiktok.tracing.C47831fm.m85015j()
            r2.<init>(r8, r3, r5)
            java.lang.Object r8 = r0.f121608e
            monitor-enter(r8)
            java.util.IdentityHashMap r3 = r0.f121610g     // Catch:{ all -> 0x0176 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0176 }
            com.google.apps.tiktok.concurrent.v r3 = (com.google.apps.tiktok.concurrent.C46470v) r3     // Catch:{ all -> 0x0176 }
            if (r3 != 0) goto L_0x0137
            com.google.apps.tiktok.concurrent.t r3 = new com.google.apps.tiktok.concurrent.t     // Catch:{ all -> 0x0176 }
            r3.<init>(r0, r1)     // Catch:{ all -> 0x0176 }
            java.util.concurrent.Executor r5 = r0.f121606c     // Catch:{ all -> 0x0176 }
            r1.mo4106b(r3, r5)     // Catch:{ all -> 0x0176 }
            goto L_0x013f
        L_0x0137:
            int r3 = r3.f121598b     // Catch:{ all -> 0x0176 }
            int r5 = r2.f121598b     // Catch:{ all -> 0x0176 }
            if (r3 <= r5) goto L_0x013f
            monitor-exit(r8)     // Catch:{ all -> 0x0176 }
            return
        L_0x013f:
            java.util.IdentityHashMap r3 = r0.f121610g     // Catch:{ all -> 0x0176 }
            r3.put(r1, r2)     // Catch:{ all -> 0x0176 }
            com.google.apps.tiktok.concurrent.n r1 = r0.f121607d     // Catch:{ all -> 0x0176 }
            java.lang.Runnable r3 = r0.f121605b     // Catch:{ all -> 0x0176 }
            java.lang.Object r5 = r1.f121586a     // Catch:{ all -> 0x0176 }
            monitor-enter(r5)     // Catch:{ all -> 0x0176 }
            java.util.Set r1 = r1.f121587b     // Catch:{ all -> 0x0173 }
            r1.add(r3)     // Catch:{ all -> 0x0173 }
            monitor-exit(r5)     // Catch:{ all -> 0x0173 }
            com.google.apps.tiktok.concurrent.n r1 = r0.f121607d     // Catch:{ all -> 0x0176 }
            boolean r1 = r1.mo50467b()     // Catch:{ all -> 0x0176 }
            if (r1 != 0) goto L_0x0171
            com.google.apps.tiktok.concurrent.w r1 = com.google.apps.tiktok.concurrent.C46471w.STOPPED     // Catch:{ all -> 0x0176 }
            com.google.apps.tiktok.concurrent.w r1 = r0.f121613j     // Catch:{ all -> 0x0176 }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x0176 }
            if (r1 == 0) goto L_0x016c
            if (r1 == r4) goto L_0x0166
            goto L_0x0171
        L_0x0166:
            com.google.apps.tiktok.concurrent.v r1 = r0.f121615l     // Catch:{ all -> 0x0176 }
            r0.mo50476d(r1)     // Catch:{ all -> 0x0176 }
            goto L_0x0171
        L_0x016c:
            android.app.Notification r1 = r2.f121597a     // Catch:{ all -> 0x0176 }
            r0.mo50474b(r1)     // Catch:{ all -> 0x0176 }
        L_0x0171:
            monitor-exit(r8)     // Catch:{ all -> 0x0176 }
            return
        L_0x0173:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0173 }
            throw r0     // Catch:{ all -> 0x0176 }
        L_0x0176:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0176 }
            throw r0
        L_0x0179:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0179 }
            goto L_0x017d
        L_0x017c:
            throw r8
        L_0x017d:
            goto L_0x017c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.bubbles.p3122d.C40124j.mo42214a(com.google.common.b.gu):void");
    }
}
