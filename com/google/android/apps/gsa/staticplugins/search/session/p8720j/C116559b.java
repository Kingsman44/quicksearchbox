package com.google.android.apps.gsa.staticplugins.search.session.p8720j;

import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7780de.p7782b.C99410g;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116611bv;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116780ib;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.j.b */
/* compiled from: PG */
final class C116559b implements C87138if {

    /* renamed from: a */
    final /* synthetic */ C116560c f323209a;

    /* renamed from: b */
    private Query f323210b = Query.f252741b;

    /* renamed from: c */
    private int f323211c = 0;

    /* renamed from: d */
    private final C99410g f323212d;

    public C116559b(C116560c cVar, C99410g gVar) {
        this.f323209a = cVar;
        this.f323212d = gVar;
    }

    /* renamed from: b */
    private final boolean m193354b() {
        C116560c cVar = this.f323209a;
        C116611bv bvVar = cVar.f323215c;
        return bvVar.f323411a.mo84383cP(cVar.f323213a.f323784p) && bvVar.mo102799k();
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C116780ib.m193928ay(155, 150);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        if (r7.f323784p.mo84383cP(r6.f323210b) == false) goto L_0x0096;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80223d(com.google.android.apps.gsa.search.core.state.C87135ic r7) {
        /*
            r6 = this;
            r0 = 150(0x96, float:2.1E-43)
            boolean r0 = r7.mo80754a(r0)
            if (r0 != 0) goto L_0x0018
            r0 = 155(0x9b, float:2.17E-43)
            boolean r0 = r7.mo80754a(r0)
            if (r0 != 0) goto L_0x0018
            r0 = 184(0xb8, float:2.58E-43)
            boolean r7 = r7.mo80754a(r0)
            if (r7 == 0) goto L_0x0024
        L_0x0018:
            com.google.android.apps.gsa.staticplugins.search.session.j.c r7 = r6.f323209a
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r7 = r7.f323213a
            com.google.android.apps.gsa.shared.search.Query r7 = r7.f323783o
            boolean r0 = r7.mo84403cj()
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            return
        L_0x0025:
            com.google.android.apps.gsa.staticplugins.search.session.j.c r0 = r6.f323209a
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r0 = r0.f323213a
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f323784p
            boolean r0 = r0.mo102879U()
            r2 = 5
            r3 = 2
            if (r0 == 0) goto L_0x003a
            boolean r0 = r7.mo84392cY()
            if (r0 == 0) goto L_0x003a
            goto L_0x0084
        L_0x003a:
            boolean r0 = r7.mo84420dA()
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r7.f252770i
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005a
            com.google.android.apps.gsa.staticplugins.search.session.j.c r0 = r6.f323209a
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r0 = r0.f323213a
            boolean r0 = r0.mo102881W(r7)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r6.m193354b()
            if (r0 != 0) goto L_0x005a
            r3 = 3
            goto L_0x0084
        L_0x005a:
            boolean r7 = r7.mo84369cB()
            if (r7 == 0) goto L_0x006a
            com.google.android.apps.gsa.staticplugins.search.session.j.c r7 = r6.f323209a
            com.google.android.apps.gsa.staticplugins.search.session.state.hd r7 = r7.f323214b
            int r7 = r7.f323886s
            if (r7 != r3) goto L_0x006a
            r3 = 4
            goto L_0x0084
        L_0x006a:
            boolean r7 = r1.mo84385cR()
            r3 = 1
            if (r7 == 0) goto L_0x0077
            boolean r7 = r6.m193354b()
            if (r7 == 0) goto L_0x0084
        L_0x0077:
            boolean r7 = r1.mo84418cy()
            if (r7 != 0) goto L_0x0084
            boolean r7 = r1.mo84339bX()
            if (r7 != 0) goto L_0x0084
            r3 = 5
        L_0x0084:
            int r7 = r6.f323211c
            if (r7 != r3) goto L_0x0096
            com.google.android.apps.gsa.staticplugins.search.session.j.c r7 = r6.f323209a
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r7 = r7.f323213a
            com.google.android.apps.gsa.shared.search.Query r0 = r6.f323210b
            com.google.android.apps.gsa.shared.search.Query r7 = r7.f323784p
            boolean r7 = r7.mo84383cP(r0)
            if (r7 != 0) goto L_0x00d1
        L_0x0096:
            r6.f323211c = r3
            com.google.android.apps.gsa.staticplugins.de.b.g r7 = r6.f323212d
            com.google.android.apps.gsa.staticplugins.de.b.at r7 = r7.f278199a
            com.google.android.apps.gsa.staticplugins.de.c.e r0 = r7.f278110e
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo91444j()
            com.google.android.libraries.gsa.monet.tools.model.shared.b.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a) r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r0.mo28730f(r4, r5)
            if (r3 != r2) goto L_0x00c9
            boolean r0 = r7.mo91431s()
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r7.f278083C
            if (r0 == 0) goto L_0x00c1
            com.google.android.apps.gsa.shared.monet.b.af.n r0 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.SEARCH_TAB
            r7.mo91427o(r0)
            r7.mo91421i()
            goto L_0x00c9
        L_0x00c1:
            com.google.android.apps.gsa.shared.monet.b.af.n r0 = com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n.INTERESTS_TAB
            r7.mo91427o(r0)
            r7.mo91425m()
        L_0x00c9:
            r7.mo91422j()
            com.google.android.apps.gsa.search.core.y.e.i.a r7 = r7.f278127v
            r7.mo80998a()
        L_0x00d1:
            r6.f323210b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.p8720j.C116559b.mo80223d(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
