package com.google.android.apps.gsa.staticplugins.feedback;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.staticplugins.feedback.service.C101254c;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.b */
/* compiled from: PG */
final class C101231b implements C101254c {

    /* renamed from: a */
    final /* synthetic */ Context f282515a;

    /* renamed from: b */
    final /* synthetic */ C90461c f282516b;

    /* renamed from: c */
    final /* synthetic */ C101235d f282517c;

    public C101231b(C101235d dVar, Context context, C90461c cVar) {
        this.f282517c = dVar;
        this.f282515a = context;
        this.f282516b = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b9, code lost:
        if (new com.google.android.apps.gsa.shared.p7129r.C90474p(r0.f282540A, r0, r0.f282543D, r7, true, r9).mo84223a() == false) goto L_0x00bb;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92183a(com.google.android.apps.gsa.staticplugins.feedback.service.C101255d r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.staticplugins.feedback.d r0 = r12.f282517c
            android.content.Context r1 = r12.f282515a
            com.google.android.apps.gsa.shared.r.c r2 = r12.f282516b
            com.google.android.apps.gsa.staticplugins.feedback.o r0 = r0.mo92184d(r1, r13, r2)
            android.accounts.AccountManager r1 = r0.f282544E
            java.lang.String r7 = com.google.android.apps.gsa.shared.util.C90718ab.m148168a(r1)
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0022
            com.google.android.apps.gsa.shared.r.h r3 = r0.f282543D
            java.lang.String r3 = r3.mo84211a()
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0022
            r10 = 1
            goto L_0x0023
        L_0x0022:
            r10 = 0
        L_0x0023:
            r3 = 0
            if (r7 == 0) goto L_0x004a
            r0.f282542C = r2
            com.google.common.o.uf r4 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.common.o.tz r4 = (com.google.common.p4552o.C60548tz) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.common.o.uf r5 = (com.google.common.p4552o.C60555uf) r5
            int r6 = r5.f164093a
            r6 = r6 | 2
            r5.f164093a = r6
            r6 = 450(0x1c2, float:6.3E-43)
            r5.f164258m = r6
            com.google.protobuf.bv r4 = r4.build()
            com.google.common.o.uf r4 = (com.google.common.p4552o.C60555uf) r4
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r4, r3, r3, r3)
        L_0x004a:
            com.google.android.apps.gsa.shared.s.a.a r4 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00d2 }
            android.content.Context r5 = r0.f282540A     // Catch:{ all -> 0x00d2 }
            java.io.File r5 = r5.getCacheDir()     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = "shake_nonredacted_state_dump"
            r4.<init>(r5, r6)     // Catch:{ all -> 0x00d2 }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x007d
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x00d2 }
            r5.<init>()     // Catch:{ all -> 0x00d2 }
            long r5 = r5.getTime()     // Catch:{ all -> 0x00d2 }
            long r8 = r4.lastModified()     // Catch:{ all -> 0x00d2 }
            long r5 = r5 - r8
            long r8 = com.google.android.apps.gsa.staticplugins.feedback.C101246o.f252724Zo     // Catch:{ all -> 0x00d2 }
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0074
            goto L_0x007d
        L_0x0074:
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00d2 }
            long r4 = r4.lastModified()     // Catch:{ all -> 0x00d2 }
            r3.<init>(r4)     // Catch:{ all -> 0x00d2 }
        L_0x007d:
            r9 = r3
            boolean r3 = r0.f252700l
            if (r3 != 0) goto L_0x0092
            com.google.android.apps.gsa.shared.r.h r3 = r0.f282543D
            boolean r3 = r3.mo84215e()
            if (r3 != 0) goto L_0x0092
            if (r7 == 0) goto L_0x008e
            if (r10 == 0) goto L_0x0092
        L_0x008e:
            if (r9 != 0) goto L_0x0092
            r3 = 0
            goto L_0x0093
        L_0x0092:
            r3 = 1
        L_0x0093:
            boolean r4 = r0.f282545F
            if (r4 == 0) goto L_0x00bb
            if (r3 == 0) goto L_0x00bb
            dagger.a r3 = r0.f282549J
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.util.v.g r3 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r3
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251064bk
            boolean r3 = r3.mo85405j(r4)
            if (r3 != 0) goto L_0x00bb
            com.google.android.apps.gsa.shared.r.p r11 = new com.google.android.apps.gsa.shared.r.p
            android.content.Context r4 = r0.f282540A
            com.google.android.apps.gsa.shared.r.h r6 = r0.f282543D
            r8 = 1
            r3 = r11
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r3 = r11.mo84223a()
            if (r3 != 0) goto L_0x00ce
        L_0x00bb:
            if (r10 == 0) goto L_0x00c6
            com.google.android.apps.gsa.shared.r.h r3 = r0.f282543D
            boolean r3 = r3.mo84214d()
            if (r3 == 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            com.google.android.apps.gsa.shared.util.debug.FeedbackData r1 = r0.mo92188f(r2, r1)
            r0.mo92191i(r1, r2, r2)
        L_0x00ce:
            r13.mo92199h()
            return
        L_0x00d2:
            r13 = move-exception
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.feedback.C101231b.mo92183a(com.google.android.apps.gsa.staticplugins.feedback.service.d):void");
    }
}
