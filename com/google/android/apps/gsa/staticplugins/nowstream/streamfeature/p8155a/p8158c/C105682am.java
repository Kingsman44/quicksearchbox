package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23284h;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.am */
/* compiled from: PG */
final class C105682am implements C23284h {

    /* renamed from: a */
    final /* synthetic */ C105687ar f294820a;

    public C105682am(C105687ar arVar) {
        this.f294820a = arVar;
    }

    /* renamed from: a */
    public final void mo28759a() {
        ((C59052c) ((C59052c) C105687ar.f294829a.mo56226d()).mo56372aa(22406)).mo56386p("onRestoreAborted");
        int i = C90755l.f253831a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28760b(java.util.List r9) {
        /*
            r8 = this;
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r0 = r8.f294820a
            boolean r1 = r0.f294840K
            if (r1 == 0) goto L_0x0007
            return
        L_0x0007:
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b r0 = r0.f294883v
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.EntryTreeNodeParcelableStore r0 = r0.f294784b
            java.util.ArrayList r0 = r0.f295123a
            int r0 = r0.size()
            int r1 = r9.size()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x003c
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar.f294829a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r4 = 22408(0x5788, float:3.14E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.String r4 = "Different sized entryTreeNode vs restored controllers: %d, %d"
            int r5 = r9.size()
            r1.mo56393w(r4, r0, r5)
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r0 = r8.f294820a
            r0.mo94986x(r3)
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r0 = r8.f294820a
            r0.mo94987y(r2)
        L_0x003c:
            r0 = 0
        L_0x003d:
            int r1 = r9.size()
            if (r0 >= r1) goto L_0x0078
            java.lang.Object r1 = r9.get(r0)
            com.google.android.libraries.gsa.monet.service.g r1 = (com.google.android.libraries.gsa.monet.service.C23056g) r1
            boolean r4 = r1 instanceof com.google.android.apps.gsa.sidekick.main.p7205h.C91429k
            if (r4 != 0) goto L_0x004e
            goto L_0x0075
        L_0x004e:
            com.google.android.apps.gsa.sidekick.main.h.k r1 = (com.google.android.apps.gsa.sidekick.main.p7205h.C91429k) r1
            long r4 = r1.mo85781c()
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r6 = r8.f294820a
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b r6 = r6.f294883v
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.EntryTreeNodeParcelableStore r6 = r6.f294784b
            com.google.ai.b.hr r4 = r6.mo95038b(r4)
            if (r4 == 0) goto L_0x0075
            r1.mo85782d(r4)
            boolean r4 = r1 instanceof com.google.android.apps.gsa.sidekick.shared.monet.util.C91856d
            if (r4 == 0) goto L_0x0075
            r4 = r1
            com.google.android.apps.gsa.sidekick.shared.monet.util.d r4 = (com.google.android.apps.gsa.sidekick.shared.monet.util.C91856d) r4
            long r4 = r4.mo86358b()
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r6 = r8.f294820a
            com.google.android.libraries.gsa.monet.service.g r1 = (com.google.android.libraries.gsa.monet.service.C23056g) r1
            r6.mo94971i(r4, r1)
        L_0x0075:
            int r0 = r0 + 1
            goto L_0x003d
        L_0x0078:
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r0 = r8.f294820a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f294877p
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246909E
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x0086
            goto L_0x0149
        L_0x0086:
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.y r0 = new com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.y
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r1 = r8.f294820a
            r0.<init>(r1, r9)
            java.util.List r9 = r0.f294983a
            r9.clear()
            r0.f294984b = r3
        L_0x0094:
            int r9 = r0.f294984b
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r1 = r0.f294985c
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b r1 = r1.f294883v
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.EntryTreeNodeParcelableStore r1 = r1.f294784b
            java.util.ArrayList r1 = r1.f295123a
            int r1 = r1.size()
            if (r9 >= r1) goto L_0x00b9
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r9 = r0.f294985c
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b r9 = r9.f294883v
            int r1 = r0.f294984b
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.datastores.EntryTreeNodeParcelableStore r9 = r9.f294784b
            com.google.ai.b.hr r9 = r9.mo95037a(r1)
            r0.mo86661m(r9)
            int r9 = r0.f294984b
            int r9 = r9 + r2
            r0.f294984b = r9
            goto L_0x0094
        L_0x00b9:
            java.util.List r9 = r0.f294983a
            java.util.Iterator r9 = r9.iterator()
        L_0x00bf:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0149
            java.lang.Object r1 = r9.next()
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.z r1 = (com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105713z) r1
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r4 = r0.f294985c
            com.google.ai.b.hj r5 = r1.mo94957b()
            r4.mo94975m(r5, r3)
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r4 = r0.f294985c
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.b r4 = r4.f294883v
            com.google.android.libraries.gsa.monet.service.g r5 = r1.mo94956a()
            r4.mo85766c(r5)
            com.google.ai.b.hj r4 = r1.mo94957b()
            com.google.ai.b.hr r1 = r1.mo94958c()
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r5 = r0.f294985c
            com.google.android.apps.gsa.search.core.i.t r5 = r5.f294877p
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246911G
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x00bf
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r5 = r0.f294985c
            com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.h r5 = r5.f294870i
            com.google.ai.b.ha r6 = r4.f26972m
            if (r6 != 0) goto L_0x00fd
            com.google.ai.b.ha r6 = com.google.p375ai.p378b.C7709ha.f26910f
        L_0x00fd:
            int r7 = r1.f27010a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x010e
            com.google.ai.b.yk r1 = r1.f27017h
            if (r1 != 0) goto L_0x0109
            com.google.ai.b.yk r1 = com.google.p375ai.p378b.C8178yk.f28736g
        L_0x0109:
            com.google.ai.b.yk r1 = r5.mo86389b(r1, r6)
            goto L_0x011c
        L_0x010e:
            int r1 = r4.f26955a
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x011b
            com.google.ai.b.yk r1 = r4.f26973n
            if (r1 != 0) goto L_0x0109
            com.google.ai.b.yk r1 = com.google.p375ai.p378b.C8178yk.f28736g
            goto L_0x0109
        L_0x011b:
            r1 = 0
        L_0x011c:
            if (r1 == 0) goto L_0x00bf
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r5 = r0.f294985c
            com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.h r6 = r5.f294870i
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.k r5 = r5.f294863b
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r5 = r5.mo95010w()
            java.lang.Object r5 = r5.f63720e
            com.google.common.base.ax r5 = (com.google.common.base.C58833ax) r5
            java.lang.Object r5 = r5.mo56107c()
            com.google.ai.b.xb r5 = (com.google.p375ai.p378b.C8142xb) r5
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r7 = r0.f294985c
            com.google.android.apps.gsa.search.core.i.t r7 = r7.f294877p
            com.google.bv.e.b.b r4 = r6.mo86390c(r4, r5, r7)
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r5 = r0.f294985c
            com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.e r6 = r5.f294871j
            com.google.android.apps.gsa.search.core.i.b r5 = r5.f294872k
            java.lang.String r5 = r5.mo79727b()
            r6.mo86385b(r1, r5, r4, r3)
            goto L_0x00bf
        L_0x0149:
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r9 = r8.f294820a
            r9.mo94986x(r2)
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r9 = r8.f294820a
            r9.mo94987y(r3)
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r9 = r8.f294820a
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.shared.models.k r9 = r9.f294863b
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r9 = r9.mo95013z()
            java.lang.Object r9 = r9.f63720e
            com.google.common.base.ax r9 = (com.google.common.base.C58833ax) r9
            boolean r0 = r9.mo56113h()
            if (r0 == 0) goto L_0x0171
            com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ar r0 = r8.f294820a
            com.google.android.apps.gsa.staticplugins.nowstream.c.i.k r0 = r0.f294882u
            java.lang.Object r9 = r9.mo56107c()
            com.google.common.o.l.t r9 = (com.google.common.p4552o.p4566l.C60220t) r9
            r0.f293994f = r9
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105682am.mo28760b(java.util.List):void");
    }
}
