package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ih */
/* compiled from: PG */
public final class C116786ih extends C116780ib {

    /* renamed from: a */
    public Query f323992a = Query.f252741b;

    /* renamed from: b */
    public boolean f323993b = false;

    /* renamed from: c */
    private final C68214a f323994c;

    /* renamed from: d */
    private final C68214a f323995d;

    /* renamed from: e */
    private final C68214a f323996e;

    /* renamed from: f */
    private int f323997f = 1;

    public C116786ih(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        super(aVar, 182);
        this.f323994c = aVar2;
        this.f323995d = aVar3;
        this.f323996e = aVar4;
    }

    /* renamed from: e */
    public final void mo102940e(Query query, boolean z) {
        if (((C116735gk) this.f323995d.mo27525b()).f323784p.mo84383cP(query)) {
            this.f323993b = z;
            if (mo102942i((C116836z) this.f323996e.mo27525b(), (C116611bv) this.f323994c.mo27525b(), (C116735gk) this.f323995d.mo27525b())) {
                mo80591ar();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo102941g() {
        return this.f323997f != 1;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SpinnerState");
        C91005e c = fVar.mo85279c("spinner reason");
        int i = this.f323997f;
        String a = C116785ig.m193938a(i);
        if (i != 0) {
            c.mo85276a(C90752i.m148229c(a));
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo102942i(com.google.android.apps.gsa.staticplugins.search.session.state.C116836z r5, com.google.android.apps.gsa.staticplugins.search.session.state.C116611bv r6, com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk r7) {
        /*
            r4 = this;
            com.google.android.apps.gsa.shared.search.Query r0 = r4.f323992a
            boolean r0 = r0.mo84435dP()
            r1 = 1
            if (r0 == 0) goto L_0x0011
            boolean r5 = r4.f323993b
            if (r1 == r5) goto L_0x000f
        L_0x000d:
            r5 = 1
            goto L_0x0069
        L_0x000f:
            r5 = 6
            goto L_0x0069
        L_0x0011:
            com.google.android.apps.gsa.shared.search.Query r0 = r7.f323784p
            boolean r2 = r0.mo84468dv()
            if (r2 == 0) goto L_0x0061
            boolean r2 = r0.mo84391cX()
            if (r2 == 0) goto L_0x0033
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r2 = r7.f323791w
            boolean r2 = r2.mo102857h()
            if (r2 != 0) goto L_0x0031
            boolean r2 = r5.mo102990U()
            if (r2 != 0) goto L_0x0031
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2 = 2
            goto L_0x0034
        L_0x0031:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0033:
            r2 = 1
        L_0x0034:
            boolean r3 = r0.mo84433dN()
            if (r3 == 0) goto L_0x0053
            boolean r3 = r5.mo102998ac()
            if (r3 == 0) goto L_0x0046
            boolean r5 = r5.mo102996aa()
            if (r5 == 0) goto L_0x0050
        L_0x0046:
            boolean r5 = r7.mo102881W(r0)
            if (r5 != 0) goto L_0x0050
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5 = 3
            goto L_0x0062
        L_0x0050:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x005f
        L_0x0053:
            boolean r5 = r7.mo102874O()
            if (r5 != 0) goto L_0x005d
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5 = 4
            goto L_0x0062
        L_0x005d:
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x005f:
            r5 = r2
            goto L_0x0062
        L_0x0061:
            r5 = 1
        L_0x0062:
            com.google.android.apps.gsa.search.shared.actions.SearchError r6 = r6.f323415e
            if (r6 == 0) goto L_0x0069
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x000d
        L_0x0069:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r6 = r4.f323997f
            r7 = 0
            if (r6 == r1) goto L_0x0072
            r6 = 0
            goto L_0x0073
        L_0x0072:
            r6 = 1
        L_0x0073:
            if (r5 == r1) goto L_0x0077
            r0 = 0
            goto L_0x0078
        L_0x0077:
            r0 = 1
        L_0x0078:
            if (r6 == r0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            r4.f323997f = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116786ih.mo102942i(com.google.android.apps.gsa.staticplugins.search.session.state.z, com.google.android.apps.gsa.staticplugins.search.session.state.bv, com.google.android.apps.gsa.staticplugins.search.session.state.gk):boolean");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f323992a);
        int i = this.f323997f;
        String a = C116785ig.m193938a(i);
        if (i != 0) {
            return "SpinnerState[query=" + valueOf + ", spinner reason=" + a + "]";
        }
        throw null;
    }
}
