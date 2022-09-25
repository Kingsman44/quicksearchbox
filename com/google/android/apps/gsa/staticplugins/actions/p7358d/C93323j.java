package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.common.base.C58881cr;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.j */
/* compiled from: PG */
public final class C93323j implements C93321h {

    /* renamed from: a */
    private final C58881cr f260278a;

    /* renamed from: b */
    private final C86124t f260279b;

    /* renamed from: c */
    private final EntityArgument f260280c;

    /* renamed from: d */
    private final List f260281d = new ArrayList();

    public C93323j(C58881cr crVar, C86124t tVar, EntityArgument entityArgument) {
        this.f260278a = crVar;
        this.f260279b = tVar;
        this.f260280c = entityArgument;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00a9 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87637a() {
        /*
            r24 = this;
            r1 = r24
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r0 = r1.f260280c
            com.google.bb.a.df r0 = r0.f236166k
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.protobuf.bt r2 = com.google.p4152bb.p4153a.C55027dd.f144768c
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x001f
            java.lang.Object r0 = r2.f169969b
            goto L_0x0023
        L_0x001f:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x0023:
            com.google.bb.a.dd r0 = (com.google.p4152bb.p4153a.C55027dd) r0
            com.google.protobuf.cq r0 = r0.f144770a
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 != 0) goto L_0x0035
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r2 = r0
            com.google.common.base.cr r0 = r1.f260278a
            java.lang.Object r0 = r0.mo6453a()
            r4 = r0
            com.google.android.apps.gsa.staticplugins.eh.a.h r4 = (com.google.android.apps.gsa.staticplugins.p7912eh.p7913a.C100537h) r4
            com.google.android.apps.gsa.search.core.i.t r0 = r1.f260279b
            com.google.android.apps.gsa.shared.m.f r5 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250844k
            long r5 = r0.mo79743a(r5)
            int r0 = (int) r5
            long r5 = (long) r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.f281092d = r2
            com.google.android.apps.gsa.staticplugins.eh.a.f r7 = r4.f281091c
            java.lang.Object r8 = r7.f281082e
            monitor-enter(r8)
            boolean r9 = r7.f281085h     // Catch:{ all -> 0x0121 }
            r10 = 1
            if (r9 != 0) goto L_0x0064
            r7.f281085h = r10     // Catch:{ all -> 0x0121 }
            com.google.android.apps.gsa.shared.util.c.bz r9 = r7.f281079b     // Catch:{ all -> 0x0121 }
            com.google.android.apps.gsa.staticplugins.eh.a.c r11 = new com.google.android.apps.gsa.staticplugins.eh.a.c     // Catch:{ all -> 0x0121 }
            r11.<init>(r7)     // Catch:{ all -> 0x0121 }
            r9.mo85151p(r11)     // Catch:{ all -> 0x0121 }
        L_0x0064:
            monitor-exit(r8)     // Catch:{ all -> 0x0121 }
            com.google.android.apps.gsa.shared.util.c.bz r8 = r7.f281079b
            com.google.android.apps.gsa.staticplugins.eh.a.b r9 = new com.google.android.apps.gsa.staticplugins.eh.a.b
            r9.<init>(r7)
            r11 = 10000(0x2710, double:4.9407E-320)
            r8.mo85150o(r9, r11)
            com.google.android.apps.gsa.staticplugins.eh.a.j r7 = r7.f281081d
            android.content.SharedPreferences r8 = r7.f281098a
            java.lang.String r7 = r7.mo91959a()
            java.lang.String r9 = ""
            java.lang.String r7 = r8.getString(r7, r9)
            r8 = 124(0x7c, float:1.74E-43)
            com.google.android.apps.gsa.shared.util.bc r7 = com.google.android.apps.gsa.shared.util.C90759bc.m148248b(r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.google.common.p4522b.C58570jy.m90163o(r8, r7)
            int r7 = r8.size()
            r9 = 2
            if (r7 < r9) goto L_0x00a9
            java.lang.Object r7 = r8.get(r3)     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x00a9 }
            java.lang.Object r7 = r8.get(r10)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Boolean.parseBoolean(r7)
            java.lang.System.currentTimeMillis()
        L_0x00a9:
            java.util.concurrent.CountDownLatch r7 = r4.f281090b     // Catch:{ InterruptedException -> 0x00af }
            r7.await(r5, r0)     // Catch:{ InterruptedException -> 0x00af }
            goto L_0x00be
        L_0x00af:
            r0 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.p7912eh.p7913a.C100537h.f281089a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "Unexpected InterruptedException while performing cast detection"
            r7 = 33493(0x82d5, float:4.6934E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r7)).mo56386p(r6)
        L_0x00be:
            com.google.android.apps.gsa.staticplugins.eh.a.f r0 = r4.f281091c
            r0.mo91958a()
            java.util.Collection r0 = r4.f281093e
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0120
            java.util.Iterator r0 = r0.iterator()
        L_0x00cf:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0120
            java.lang.Object r4 = r0.next()
            com.google.android.apps.gsa.search.shared.media.u r4 = (com.google.android.apps.gsa.search.shared.media.C87597u) r4
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity r5 = new com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument$Entity
            java.lang.String r12 = r4.f236667b
            java.lang.String r6 = r4.f236666a
            com.google.bb.a.cv[] r7 = new com.google.p4152bb.p4153a.C55018cv[r10]
            com.google.bb.a.cv r8 = com.google.p4152bb.p4153a.C55018cv.COMPANION
            r7[r3] = r8
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            java.util.List r21 = java.util.Arrays.asList(r7)
            r22 = 0
            com.google.android.apps.gsa.search.shared.actions.modular.arguments.EntityArgument r7 = r1.f260280c
            int r23 = r7.mo81277l()
            r11 = r5
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            if (r2 == 0) goto L_0x011a
            java.lang.String r4 = r4.f236667b
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x010f
            goto L_0x011a
        L_0x010f:
            java.util.List r0 = r1.f260281d
            r0.clear()
            java.util.List r0 = r1.f260281d
            r0.add(r5)
            return
        L_0x011a:
            java.util.List r4 = r1.f260281d
            r4.add(r5)
            goto L_0x00cf
        L_0x0120:
            return
        L_0x0121:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0121 }
            goto L_0x0125
        L_0x0124:
            throw r0
        L_0x0125:
            goto L_0x0124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7358d.C93323j.mo87637a():void");
    }

    /* renamed from: b */
    public final void mo87638b() {
        String str;
        if (!this.f260281d.isEmpty()) {
            EntityArgument entityArgument = this.f260280c;
            Disambiguation disambiguation = (Disambiguation) entityArgument.f236203n;
            if (disambiguation == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = disambiguation.f236362a;
            }
            entityArgument.mo81334P(new Disambiguation(str, this.f260281d, false, true));
        }
        this.f260280c.f236167l = false;
    }
}
