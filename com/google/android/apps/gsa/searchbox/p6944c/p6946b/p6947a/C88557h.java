package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a;

import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.a.h */
/* compiled from: PG */
final class C88557h extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C88616t f239344a;

    /* renamed from: b */
    final /* synthetic */ C88560k f239345b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88557h(C88560k kVar, C88616t tVar) {
        super("sb.r.CSResFetcher", "fetchingSuggestions", 4);
        this.f239345b = kVar;
        this.f239344a = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r9 = this;
            com.google.android.apps.gsa.searchbox.c.b.a.k r0 = r9.f239345b
            com.google.android.apps.gsa.searchbox.c.a.c r0 = r0.f239353c
            com.google.android.apps.gsa.searchbox.c.t r1 = r9.f239344a
            r0.mo82199s(r1)
            com.google.android.apps.gsa.searchbox.c.b.a.k r0 = r9.f239345b
            com.google.android.apps.gsa.searchbox.c.b.a.a r0 = r0.f239351a
            com.google.android.apps.gsa.searchbox.c.t r1 = r9.f239344a
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.b.gz r2 = r1.f239562g
            r3 = 0
            com.google.common.b.hd r2 = r2.mo55427f(r3)
            com.google.android.apps.gsa.shared.search.Query r4 = r1.f239556a
            com.google.android.apps.gsa.shared.search.Query r2 = r4.mo84282aS(r2)
            java.lang.String r4 = r2.f252770i
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x004c
            r4 = r0
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.j r4 = (com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116924j) r4
            dagger.a r5 = r4.f324632c
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.aa.bh r5 = (com.google.android.apps.gsa.shared.p6968aa.C89037bh) r5
            boolean r5 = r5.mo27385k()
            if (r5 != 0) goto L_0x004c
            boolean r5 = r2.mo84403cj()
            if (r5 != 0) goto L_0x004c
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f324631b
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90091ep.f250545h
            boolean r5 = r5.mo79746e(r6)
            if (r5 != 0) goto L_0x004c
            com.google.android.apps.gsa.search.core.google.b.e r0 = r4.mo103061c(r2, r1)
            goto L_0x0052
        L_0x004c:
            com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.j r0 = (com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116924j) r0
            com.google.android.apps.gsa.search.core.google.b.e r0 = r0.mo103062e(r2)
        L_0x0052:
            if (r0 == 0) goto L_0x0110
            com.google.at.h.d.a.ar r0 = r0.f232188c
            if (r0 == 0) goto L_0x0108
            com.google.android.apps.gsa.searchbox.c.b.a.k r1 = r9.f239345b
            com.google.android.apps.gsa.searchbox.c.b.a.m r1 = r1.f239352b
            com.google.android.libraries.searchbox.root.a r1 = r1.mo82232a(r0, r3)
            com.google.android.apps.gsa.searchbox.c.b.a.k r2 = r9.f239345b
            com.google.android.apps.gsa.searchbox.c.b.a.f r2 = r2.f239354d
            com.google.android.apps.gsa.searchbox.c.t r4 = r9.f239344a
            boolean r5 = r1.f108838c
            if (r5 != 0) goto L_0x006c
            goto L_0x00f2
        L_0x006c:
            android.util.LruCache r5 = r2.f239342i
            if (r5 != 0) goto L_0x0079
            android.util.LruCache r5 = new android.util.LruCache
            r6 = 25
            r5.<init>(r6)
            r2.f239342i = r5
        L_0x0079:
            com.google.at.h.d.a.at r5 = r1.f108840e
            boolean r5 = r5.f142366f
            if (r5 == 0) goto L_0x0086
            int r5 = r2.f239341h
            int r5 = r5 + 1
            r2.f239341h = r5
            goto L_0x0088
        L_0x0086:
            r2.f239341h = r3
        L_0x0088:
            com.google.android.apps.gsa.shared.search.Query r5 = r4.f239556a
            java.lang.String r5 = r5.mo84352bk()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x00b2
            java.lang.String r5 = "web"
            java.lang.String r6 = r4.f239558c
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00b2
            boolean r5 = com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88555f.m143067g(r4)
            if (r5 == 0) goto L_0x00b2
            int r5 = r2.f239341h
            if (r5 == 0) goto L_0x00ac
            int r6 = r2.f239340g
            if (r5 <= r6) goto L_0x00dc
        L_0x00ac:
            com.google.android.apps.gsa.searchbox.c.b.a.r r5 = r2.f239336c
            r5.mo82242k(r4, r0, r1)
            goto L_0x00dc
        L_0x00b2:
            android.os.Bundle r5 = r4.f239561f
            java.lang.String r6 = "cs::on_focus"
            boolean r5 = r5.getBoolean(r6)
            if (r5 != 0) goto L_0x00dc
            android.os.Bundle r5 = r4.f239561f
            java.lang.String r6 = "cs::on_focus_fallback"
            boolean r5 = r5.getBoolean(r6)
            if (r5 != 0) goto L_0x00dc
            android.util.LruCache r5 = r2.f239342i
            if (r5 == 0) goto L_0x00dc
            android.util.Pair r6 = new android.util.Pair
            com.google.android.libraries.f.a r7 = r2.f239334a
            long r7 = r7.mo26871c()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.<init>(r7, r0)
            r5.put(r4, r6)
        L_0x00dc:
            android.util.SparseArray r0 = r2.f239337d
            int r0 = r0.size()
            if (r3 >= r0) goto L_0x00f2
            android.util.SparseArray r0 = r2.f239337d
            java.lang.Object r0 = r0.valueAt(r3)
            com.google.android.apps.gsa.searchbox.c.b.a.l r0 = (com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88561l) r0
            r0.mo82231d()
            int r3 = r3 + 1
            goto L_0x00dc
        L_0x00f2:
            com.google.android.apps.gsa.searchbox.c.t r0 = r9.f239344a
            android.os.Bundle r0 = r0.f239561f
            java.lang.String r2 = "cs::skip_edit"
            boolean r0 = r0.getBoolean(r2)
            if (r0 != 0) goto L_0x0107
            com.google.android.apps.gsa.searchbox.c.b.a.k r0 = r9.f239345b
            com.google.android.apps.gsa.searchbox.c.t r2 = r9.f239344a
            com.google.android.libraries.searchbox.root.a r0 = r0.mo82221b(r2, r1)
            return r0
        L_0x0107:
            return r1
        L_0x0108:
            com.google.android.apps.gsa.searchbox.c.b.a.b r0 = new com.google.android.apps.gsa.searchbox.c.b.a.b
            java.lang.String r1 = "SuggestionResponse.mproto is null."
            r0.<init>(r1)
            throw r0
        L_0x0110:
            com.google.android.apps.gsa.searchbox.c.b.a.b r0 = new com.google.android.apps.gsa.searchbox.c.b.a.b
            java.lang.String r1 = "SuggestionResponse was null."
            r0.<init>(r1)
            goto L_0x0119
        L_0x0118:
            throw r0
        L_0x0119:
            goto L_0x0118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88557h.call():java.lang.Object");
    }
}
