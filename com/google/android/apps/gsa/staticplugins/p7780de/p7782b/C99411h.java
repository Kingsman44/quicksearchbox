package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90197c;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.h */
/* compiled from: PG */
public final /* synthetic */ class C99411h implements C90197c {

    /* renamed from: a */
    public final /* synthetic */ C99403at f278200a;

    public /* synthetic */ C99411h(C99403at atVar) {
        this.f278200a = atVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r0.mo91430r() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r1 != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0178, code lost:
        if (((com.google.common.base.C58833ax) ((com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r0.f278110e.mo91441g()).f63720e).mo56107c() == r7) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017c, code lost:
        r0.mo91427o(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r1 != 10) goto L_0x0168;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83940a(com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n r7) {
        /*
            r6 = this;
            com.google.android.apps.gsa.staticplugins.de.b.at r0 = r6.f278200a
            com.google.android.apps.gsa.staticplugins.de.c.a.b r1 = com.google.android.apps.gsa.staticplugins.p7780de.p7783c.p7784a.C99432b.INVALID_SURFACE
            com.google.android.apps.gsa.shared.monet.b.af.n r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UNKNOWN_TAB
            int r1 = r7.ordinal()
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L_0x0031
            r4 = 2
            if (r1 == r4) goto L_0x002a
            r4 = 4
            if (r1 == r4) goto L_0x003f
            r4 = 7
            if (r1 == r4) goto L_0x001d
            r4 = 10
            if (r1 == r4) goto L_0x003f
            goto L_0x0168
        L_0x001d:
            dagger.a r1 = r0.f278124s
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r1
            boolean r1 = r1.mo78204k()
            goto L_0x003d
        L_0x002a:
            boolean r1 = r0.mo91430r()
            if (r1 == 0) goto L_0x0168
            goto L_0x003f
        L_0x0031:
            dagger.a r1 = r0.f278124s
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r1
            boolean r1 = r1.mo78205l()
        L_0x003d:
            if (r1 == 0) goto L_0x0168
        L_0x003f:
            com.google.android.apps.gsa.shared.monet.b.af.n r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.INTERESTS_TAB
            if (r7 != r1) goto L_0x0056
            dagger.a r1 = r0.f278124s
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r1
            boolean r1 = r1.mo78205l()
            if (r1 == 0) goto L_0x0056
            r0.mo91424l(r3)
            goto L_0x0180
        L_0x0056:
            com.google.android.apps.gsa.shared.monet.b.af.n r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.SEARCH_TAB
            java.lang.String r4 = "getBaseIntent()"
            if (r7 != r1) goto L_0x00ad
            com.google.android.apps.gsa.search.core.y.e.j.a.a r7 = r0.f278115j
            boolean r7 = r7.mo81010i()
            if (r7 != 0) goto L_0x0180
            dagger.a r7 = r0.f278124s
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r7 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r7
            boolean r7 = r7.mo78207n()
            if (r7 == 0) goto L_0x008e
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r7 = r0.f278109d
            com.google.common.util.concurrent.cx r7 = r7.mo79696a()
            com.google.android.libraries.gsa.k.g r1 = r0.f278111f
            com.google.android.apps.gsa.staticplugins.de.b.ac r2 = new com.google.android.apps.gsa.staticplugins.de.b.ac
            r2.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag
            r5.<init>(r7, r1, r4, r2)
            com.google.android.apps.gsa.staticplugins.de.b.ad r7 = new com.google.android.apps.gsa.staticplugins.de.b.ad
            r7.<init>(r0)
            r5.mo85223a(r7)
            goto L_0x0180
        L_0x008e:
            com.google.android.apps.gsa.search.core.y.e.j.a.a r7 = r0.f278115j
            com.google.android.apps.gsa.shared.search.Query r0 = r7.mo81002a()
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84262Z()
            com.google.android.apps.gsa.shared.search.f r0 = r0.mo84480i()
            r1 = 0
            r4 = 524288(0x80000, double:2.590327E-318)
            r0.mo84573e(r1, r4)
            com.google.android.apps.gsa.shared.search.Query r0 = r0.mo84568a()
            r7.mo81006e(r0)
            goto L_0x0180
        L_0x00ad:
            com.google.android.apps.gsa.shared.monet.b.af.n r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.TABS_TAB
            if (r7 != r1) goto L_0x00cd
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r7 = r0.f278109d
            com.google.common.util.concurrent.cx r7 = r7.mo79696a()
            com.google.android.libraries.gsa.k.g r1 = r0.f278111f
            com.google.android.apps.gsa.staticplugins.de.b.ah r2 = new com.google.android.apps.gsa.staticplugins.de.b.ah
            r2.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag
            r5.<init>(r7, r1, r4, r2)
            com.google.android.apps.gsa.staticplugins.de.b.ai r7 = new com.google.android.apps.gsa.staticplugins.de.b.ai
            r7.<init>(r0)
            r5.mo85223a(r7)
            goto L_0x0180
        L_0x00cd:
            com.google.android.apps.gsa.shared.monet.b.af.n r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.COLLECTIONS_TAB
            if (r7 != r1) goto L_0x00fb
            dagger.a r1 = r0.f278124s
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r1 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r1
            boolean r1 = r1.mo78204k()
            if (r1 == 0) goto L_0x00fb
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r7 = r0.f278109d
            com.google.common.util.concurrent.cx r7 = r7.mo79696a()
            com.google.android.libraries.gsa.k.g r1 = r0.f278111f
            com.google.android.apps.gsa.staticplugins.de.b.z r2 = new com.google.android.apps.gsa.staticplugins.de.b.z
            r2.<init>(r0)
            com.google.android.apps.gsa.shared.util.c.ag r5 = new com.google.android.apps.gsa.shared.util.c.ag
            r5.<init>(r7, r1, r4, r2)
            com.google.android.apps.gsa.staticplugins.de.b.aa r7 = new com.google.android.apps.gsa.staticplugins.de.b.aa
            r7.<init>(r0)
            r5.mo85223a(r7)
            goto L_0x0180
        L_0x00fb:
            com.google.android.apps.gsa.shared.monet.b.af.n r1 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.UPDATES_TAB
            if (r7 != r1) goto L_0x0180
            boolean r7 = r0.mo91430r()
            if (r7 != 0) goto L_0x0107
            goto L_0x0180
        L_0x0107:
            com.google.android.apps.gsa.sidekick.shared.c.e r7 = r0.f278123r
            r1 = 101(0x65, float:1.42E-43)
            r7.mo86057v(r1)
            com.google.assistant.s.a.ih r7 = com.google.assistant.p3994s.p3995a.C53287ih.f139693l
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.s.a.hw r7 = (com.google.assistant.p3994s.p3995a.C53275hw) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r1.f139698d = r2
            int r4 = r1.f139695a
            r2 = r2 | r4
            r1.f139695a = r2
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r2 = 9
            r1.f139702h = r2
            int r2 = r1.f139695a
            r2 = r2 | 64
            r1.f139695a = r2
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.assistant.s.a.ih r1 = (com.google.assistant.p3994s.p3995a.C53287ih) r1
            r2 = 12
            r1.f139703i = r2
            int r2 = r1.f139695a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r1.f139695a = r2
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.s.a.ih r7 = (com.google.assistant.p3994s.p3995a.C53287ih) r7
            com.google.android.apps.gsa.search.core.y.e.j.a.a r1 = r0.f278115j
            com.google.android.apps.gsa.shared.search.Query r1 = r1.mo81003b()
            java.lang.String r1 = r1.mo84355bn()
            android.os.Bundle r1 = com.google.android.apps.gsa.search.shared.p6930h.C87566i.m142226A(r1)
            dagger.a r2 = r0.f278122q
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.shared.h.n r2 = (com.google.android.apps.gsa.search.shared.p6930h.C87571n) r2
            android.content.Context r0 = r0.f278121p
            r2.mo81699k(r0, r7, r1)
            return r3
        L_0x0168:
            com.google.android.apps.gsa.staticplugins.de.c.e r1 = r0.f278110e
            com.google.android.libraries.gsa.monet.tools.model.shared.b r1 = r1.mo91441g()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r1 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r1
            java.lang.Object r1 = r1.f63720e
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            java.lang.Object r1 = r1.mo56107c()
            if (r1 == r7) goto L_0x017b
            goto L_0x017c
        L_0x017b:
            r2 = 0
        L_0x017c:
            r0.mo91427o(r7)
            r3 = r2
        L_0x0180:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7780de.p7782b.C99411h.mo83940a(com.google.android.apps.gsa.shared.monet.b.af.n):boolean");
    }
}
