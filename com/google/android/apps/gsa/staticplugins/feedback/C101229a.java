package com.google.android.apps.gsa.staticplugins.feedback;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.staticplugins.feedback.service.C101254c;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.a */
/* compiled from: PG */
final class C101229a implements C101254c {

    /* renamed from: a */
    final /* synthetic */ Context f282510a;

    /* renamed from: b */
    final /* synthetic */ C90461c f282511b;

    /* renamed from: c */
    final /* synthetic */ C101235d f282512c;

    public C101229a(C101235d dVar, Context context, C90461c cVar) {
        this.f282512c = dVar;
        this.f282510a = context;
        this.f282511b = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c5 A[Catch:{ IllegalStateException -> 0x021b }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01fd A[Catch:{ IllegalStateException -> 0x021b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92183a(com.google.android.apps.gsa.staticplugins.feedback.service.C101255d r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Failed to close the writer."
            java.lang.String r1 = "SendGoogleFeedback"
            com.google.android.apps.gsa.staticplugins.feedback.d r2 = r13.f282512c
            android.content.Context r3 = r13.f282510a
            com.google.android.apps.gsa.shared.r.c r4 = r13.f282511b
            com.google.android.apps.gsa.staticplugins.feedback.o r2 = r2.mo92184d(r3, r14, r4)
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            android.accounts.AccountManager r3 = r2.f282544E
            java.lang.String r3 = com.google.android.apps.gsa.shared.util.C90718ab.m148168a(r3)
            com.google.android.apps.gsa.shared.r.h r4 = r2.f282543D
            java.lang.String r4 = r4.mo84211a()
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x002f
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x002f
            com.google.android.apps.gsa.shared.r.h r3 = r2.f282543D
            boolean r3 = r3.mo84214d()
            if (r3 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            com.google.android.apps.gsa.shared.r.h r3 = r2.f282543D
            boolean r3 = r3.mo84216f()
            if (r3 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            com.google.android.apps.gsa.shared.util.debug.FeedbackData r3 = r2.mo92188f(r5, r6)
            android.app.Activity r4 = r2.f282541B
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x005b
            int r0 = r2.f252707s
            android.net.Uri r1 = r2.f252692d
            boolean r3 = r2.f252706r
            java.lang.String r4 = r2.f252690b
            android.content.Intent r0 = com.google.android.apps.gsa.search.core.p6513aj.C84556p.m135246a(r0, r1, r3, r4, r5)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
            android.content.Context r1 = r2.f282540A
            r1.startActivity(r0)
            goto L_0x023f
        L_0x005b:
            java.lang.String r4 = r2.f252690b
            if (r4 != 0) goto L_0x0061
            java.lang.String r4 = "now_cards"
        L_0x0061:
            android.accounts.Account r7 = r2.mo92187e()
            com.google.android.apps.gsa.shared.s.a.a r8 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a
            com.google.android.libraries.gcoreclient.o.a.d r8 = new com.google.android.libraries.gcoreclient.o.a.d     // Catch:{ IllegalStateException -> 0x021b }
            r8.<init>(r4)     // Catch:{ IllegalStateException -> 0x021b }
            g.a.a r4 = r2.f282547H     // Catch:{ IllegalStateException -> 0x021b }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.libraries.gcoreclient.k.a.d r4 = (com.google.android.libraries.gcoreclient.p1774k.p1775a.C21569d) r4     // Catch:{ IllegalStateException -> 0x021b }
            g.a.a r9 = r2.f282548I     // Catch:{ IllegalStateException -> 0x021b }
            java.lang.Object r9 = r9.mo17428b()     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.libraries.gcoreclient.k.a.h r9 = (com.google.android.libraries.gcoreclient.p1774k.p1775a.C21573h) r9     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.feedback.l r10 = r4.f59956a     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.feedback.ThemeSettings r9 = r9.f59959a     // Catch:{ IllegalStateException -> 0x021b }
            r10.f390626e = r9     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.apps.gsa.staticplugins.feedback.n r9 = new com.google.android.apps.gsa.staticplugins.feedback.n     // Catch:{ IllegalStateException -> 0x021b }
            r9.<init>(r3)     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.libraries.gcoreclient.k.a.c r11 = new com.google.android.libraries.gcoreclient.k.a.c     // Catch:{ IllegalStateException -> 0x021b }
            r11.<init>(r9)     // Catch:{ IllegalStateException -> 0x021b }
            r10.mo119742b(r6)     // Catch:{ IllegalStateException -> 0x021b }
            r10.f390628g = r11     // Catch:{ IllegalStateException -> 0x021b }
            android.graphics.Bitmap r9 = r3.f254178d     // Catch:{ IllegalStateException -> 0x021b }
            if (r9 == 0) goto L_0x009a
            com.google.android.gms.feedback.l r10 = r4.f59956a     // Catch:{ IllegalStateException -> 0x021b }
            r10.mo119744d(r9)     // Catch:{ IllegalStateException -> 0x021b }
        L_0x009a:
            if (r7 == 0) goto L_0x00a2
            java.lang.String r9 = r7.name     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.feedback.l r10 = r4.f59956a     // Catch:{ IllegalStateException -> 0x021b }
            r10.f390622a = r9     // Catch:{ IllegalStateException -> 0x021b }
        L_0x00a2:
            java.lang.String r9 = r3.f254177c     // Catch:{ IllegalStateException -> 0x021b }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ IllegalStateException -> 0x021b }
            if (r10 != 0) goto L_0x00ae
            com.google.android.gms.feedback.l r10 = r4.f59956a     // Catch:{ IllegalStateException -> 0x021b }
            r10.f390624c = r9     // Catch:{ IllegalStateException -> 0x021b }
        L_0x00ae:
            java.lang.String r3 = r3.f254180f     // Catch:{ IllegalStateException -> 0x021b }
            boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x021b }
            if (r9 != 0) goto L_0x00ba
            com.google.android.gms.feedback.l r9 = r4.f59956a     // Catch:{ IllegalStateException -> 0x021b }
            r9.f390623b = r3     // Catch:{ IllegalStateException -> 0x021b }
        L_0x00ba:
            com.google.android.libraries.gcoreclient.k.a.e r3 = new com.google.android.libraries.gcoreclient.k.a.e     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.feedback.l r4 = r4.f59956a     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.feedback.FeedbackOptions r4 = r4.mo119741a()     // Catch:{ IllegalStateException -> 0x021b }
            r3.<init>(r4)     // Catch:{ IllegalStateException -> 0x021b }
            android.content.Context r4 = r2.f282540A     // Catch:{ IllegalStateException -> 0x021b }
            java.io.File r4 = r4.getCacheDir()     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.googlehelp.GoogleHelp r9 = r8.f59965a     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.feedback.FeedbackOptions r3 = r3.f59957a     // Catch:{ IllegalStateException -> 0x021b }
            r9.mo119807b(r3, r4)     // Catch:{ IllegalStateException -> 0x021b }
            g.a.a r3 = r2.f282548I     // Catch:{ IllegalStateException -> 0x021b }
            java.lang.Object r3 = r3.mo17428b()     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.libraries.gcoreclient.k.a.h r3 = (com.google.android.libraries.gcoreclient.p1774k.p1775a.C21573h) r3     // Catch:{ IllegalStateException -> 0x021b }
            r8.mo27019a(r3)     // Catch:{ IllegalStateException -> 0x021b }
            if (r7 == 0) goto L_0x00e3
            com.google.android.gms.googlehelp.GoogleHelp r3 = r8.f59965a     // Catch:{ IllegalStateException -> 0x021b }
            r3.f390753c = r7     // Catch:{ IllegalStateException -> 0x021b }
        L_0x00e3:
            android.net.Uri r3 = r2.f252692d     // Catch:{ IllegalStateException -> 0x021b }
            if (r3 == 0) goto L_0x00eb
            com.google.android.gms.googlehelp.GoogleHelp r4 = r8.f59965a     // Catch:{ IllegalStateException -> 0x021b }
            r4.f390767q = r3     // Catch:{ IllegalStateException -> 0x021b }
        L_0x00eb:
            com.google.android.apps.gsa.staticplugins.feedback.l r3 = new com.google.android.apps.gsa.staticplugins.feedback.l     // Catch:{ IllegalStateException -> 0x021b }
            r3.<init>(r2)     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.libraries.gcoreclient.o.a.c r4 = new com.google.android.libraries.gcoreclient.o.a.c     // Catch:{ IllegalStateException -> 0x021b }
            r4.<init>(r3)     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.googlehelp.GoogleHelp r3 = r8.f59965a     // Catch:{ IllegalStateException -> 0x021b }
            r3.f390749L = r4     // Catch:{ IllegalStateException -> 0x021b }
            boolean r3 = r2.f252706r     // Catch:{ IllegalStateException -> 0x021b }
            if (r3 == 0) goto L_0x01f3
            android.content.Context r3 = r2.f282540A     // Catch:{ IllegalStateException -> 0x021b }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ IllegalStateException -> 0x021b }
            r4 = 2132017469(0x7f14013d, float:1.9673217E38)
            java.io.InputStream r3 = r3.openRawResource(r4)     // Catch:{ IllegalStateException -> 0x021b }
            if (r3 != 0) goto L_0x010e
            goto L_0x0192
        L_0x010e:
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ IllegalStateException -> 0x021b }
            r4.<init>()     // Catch:{ IllegalStateException -> 0x021b }
            r7 = 1024(0x400, float:1.435E-42)
            char[] r7 = new char[r7]     // Catch:{ IllegalStateException -> 0x021b }
            r9 = 0
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0159 }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0159 }
            java.lang.String r12 = "UTF-8"
            r11.<init>(r3, r12)     // Catch:{ IOException -> 0x0159 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x0159 }
        L_0x0124:
            int r3 = r10.read(r7)     // Catch:{ IOException -> 0x0153, all -> 0x014f }
            r9 = -1
            if (r3 == r9) goto L_0x012f
            r4.write(r7, r6, r3)     // Catch:{ IOException -> 0x0153, all -> 0x014f }
            goto L_0x0124
        L_0x012f:
            r4.flush()     // Catch:{ IOException -> 0x0153, all -> 0x014f }
            java.lang.String r5 = r4.toString()     // Catch:{ IOException -> 0x0153, all -> 0x014f }
            com.google.common.p4541l.C59337t.m92222b(r10)     // Catch:{ IllegalStateException -> 0x021b }
            r4.close()     // Catch:{ IOException -> 0x013d }
            goto L_0x0192
        L_0x013d:
            r3 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.feedback.C101246o.f282539z     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalStateException -> 0x021b }
            r4.mo56378ag(r7, r1)     // Catch:{ IllegalStateException -> 0x021b }
            r7 = 19919(0x4dcf, float:2.7912E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r7)).mo56386p(r0)     // Catch:{ IllegalStateException -> 0x021b }
            goto L_0x0192
        L_0x014f:
            r3 = move-exception
            r9 = r10
            goto L_0x01da
        L_0x0153:
            r3 = move-exception
            r9 = r10
            goto L_0x015a
        L_0x0156:
            r3 = move-exception
            goto L_0x01da
        L_0x0159:
            r3 = move-exception
        L_0x015a:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.feedback.C101246o.f282539z     // Catch:{ all -> 0x0156 }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ all -> 0x0156 }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0156 }
            r7.mo56378ag(r10, r1)     // Catch:{ all -> 0x0156 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x0156 }
            com.google.common.f.x r3 = r7.mo56382g(r3)     // Catch:{ all -> 0x0156 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0156 }
            r7 = 19920(0x4dd0, float:2.7914E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r7)     // Catch:{ all -> 0x0156 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0156 }
            java.lang.String r7 = "Failed to read the input stream."
            r3.mo56386p(r7)     // Catch:{ all -> 0x0156 }
            com.google.common.p4541l.C59337t.m92222b(r9)     // Catch:{ IllegalStateException -> 0x021b }
            r4.close()     // Catch:{ IOException -> 0x0181 }
            goto L_0x0192
        L_0x0181:
            r3 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.feedback.C101246o.f282539z     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalStateException -> 0x021b }
            r4.mo56378ag(r7, r1)     // Catch:{ IllegalStateException -> 0x021b }
            r7 = 19921(0x4dd1, float:2.7915E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r7)).mo56386p(r0)     // Catch:{ IllegalStateException -> 0x021b }
        L_0x0192:
            android.app.Activity r0 = r2.f282541B     // Catch:{ IllegalStateException -> 0x021b }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalStateException -> 0x021b }
            r3 = 2132090275(0x7f151da3, float:1.9820885E38)
            java.lang.String r0 = r0.getString(r3)     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.libraries.gcoreclient.o.a.g r3 = new com.google.android.libraries.gcoreclient.o.a.g     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.googlehelp.OfflineSuggestion r4 = new com.google.android.gms.googlehelp.OfflineSuggestion     // Catch:{ IllegalStateException -> 0x021b }
            java.lang.String r7 = "7384753"
            java.lang.String r9 = "https://support.google.com/websearch/answer/7384753"
            r4.<init>(r7, r0, r9, r5)     // Catch:{ IllegalStateException -> 0x021b }
            r3.<init>(r4)     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89846n(r3)     // Catch:{ IllegalStateException -> 0x021b }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IllegalStateException -> 0x021b }
            r4 = r0
            com.google.common.b.pq r4 = (com.google.common.p4522b.C58724pq) r4     // Catch:{ IllegalStateException -> 0x021b }
            int r4 = r4.f156474d     // Catch:{ IllegalStateException -> 0x021b }
            r3.<init>(r4)     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.b.sm r0 = r0.listIterator(r6)     // Catch:{ IllegalStateException -> 0x021b }
        L_0x01bf:
            boolean r4 = r0.hasNext()     // Catch:{ IllegalStateException -> 0x021b }
            if (r4 == 0) goto L_0x01d5
            java.lang.Object r4 = r0.next()     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.libraries.gcoreclient.o.a.g r4 = (com.google.android.libraries.gcoreclient.p1782o.p1783a.C21595g) r4     // Catch:{ IllegalStateException -> 0x021b }
            boolean r5 = r4 instanceof com.google.android.libraries.gcoreclient.p1782o.p1783a.C21595g     // Catch:{ IllegalStateException -> 0x021b }
            if (r5 == 0) goto L_0x01bf
            com.google.android.gms.googlehelp.OfflineSuggestion r4 = r4.f59967a     // Catch:{ IllegalStateException -> 0x021b }
            r3.add(r4)     // Catch:{ IllegalStateException -> 0x021b }
            goto L_0x01bf
        L_0x01d5:
            com.google.android.gms.googlehelp.GoogleHelp r0 = r8.f59965a     // Catch:{ IllegalStateException -> 0x021b }
            r0.f390770t = r3     // Catch:{ IllegalStateException -> 0x021b }
            goto L_0x01f3
        L_0x01da:
            com.google.common.p4541l.C59337t.m92222b(r9)     // Catch:{ IllegalStateException -> 0x021b }
            r4.close()     // Catch:{ IOException -> 0x01e1 }
            goto L_0x01f2
        L_0x01e1:
            r4 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.feedback.C101246o.f282539z     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IllegalStateException -> 0x021b }
            r5.mo56378ag(r7, r1)     // Catch:{ IllegalStateException -> 0x021b }
            r7 = 19922(0x4dd2, float:2.7917E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r7)).mo56386p(r0)     // Catch:{ IllegalStateException -> 0x021b }
        L_0x01f2:
            throw r3     // Catch:{ IllegalStateException -> 0x021b }
        L_0x01f3:
            com.google.android.gms.googlehelp.GoogleHelp r0 = r8.f59965a     // Catch:{ IllegalStateException -> 0x021b }
            android.content.Intent r0 = r0.mo119806a()     // Catch:{ IllegalStateException -> 0x021b }
            int r3 = r2.f252708t     // Catch:{ IllegalStateException -> 0x021b }
            if (r3 == 0) goto L_0x0202
            java.lang.String r4 = "EXTRA_OPEN_TO_CONTACT_OPTION"
            r0.putExtra(r4, r3)     // Catch:{ IllegalStateException -> 0x021b }
        L_0x0202:
            r3 = 131072(0x20000, float:1.83671E-40)
            r0.addFlags(r3)     // Catch:{ IllegalStateException -> 0x021b }
            android.app.Activity r3 = r2.f282541B     // Catch:{ IllegalStateException -> 0x021b }
            java.lang.String r4 = "FeedbackHelper needs activity context for launching Help, had %s"
            android.content.Context r5 = r2.f282540A     // Catch:{ IllegalStateException -> 0x021b }
            com.google.common.base.C58838bb.m90867b(r3, r4, r5)     // Catch:{ IllegalStateException -> 0x021b }
            com.google.android.gms.googlehelp.g r4 = new com.google.android.gms.googlehelp.g     // Catch:{ IllegalStateException -> 0x021b }
            r4.<init>(r3)     // Catch:{ IllegalStateException -> 0x021b }
            r4.mo119820c(r0)     // Catch:{ IllegalStateException -> 0x021b }
            goto L_0x023c
        L_0x0219:
            r14 = move-exception
            goto L_0x024a
        L_0x021b:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.feedback.C101246o.f282539z     // Catch:{ all -> 0x0219 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0219 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0219 }
            r3.mo56378ag(r4, r1)     // Catch:{ all -> 0x0219 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0219 }
            com.google.common.f.x r0 = r3.mo56382g(r0)     // Catch:{ all -> 0x0219 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0219 }
            r1 = 19927(0x4dd7, float:2.7924E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0219 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = "#startHelpActivity failed."
            r0.mo56386p(r1)     // Catch:{ all -> 0x0219 }
        L_0x023c:
            r2.mo92190h()
        L_0x023f:
            r14.mo92199h()
            com.google.android.apps.gsa.staticplugins.feedback.d r14 = r13.f282512c
            java.util.concurrent.atomic.AtomicBoolean r14 = r14.f282523c
            r14.set(r6)
            return
        L_0x024a:
            goto L_0x024c
        L_0x024b:
            throw r14
        L_0x024c:
            goto L_0x024b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.feedback.C101229a.mo92183a(com.google.android.apps.gsa.staticplugins.feedback.service.d):void");
    }
}
