package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.p4715m.p4716a.p4720b.p4721a.C62684l;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.x */
/* compiled from: PG */
public final /* synthetic */ class C110394x implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110318ad f307673a;

    /* renamed from: b */
    public final /* synthetic */ C62684l f307674b;

    public /* synthetic */ C110394x(C110318ad adVar, C62684l lVar) {
        this.f307673a = adVar;
        this.f307674b = lVar;
    }

    /* JADX WARNING: type inference failed for: r10v11, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "json exception"
            java.lang.String r1 = "BDClient"
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.ad r2 = r9.f307673a
            com.google.m.a.b.a.l r3 = r9.f307674b
            com.google.m.a.b.a.t r10 = (com.google.p4715m.p4716a.p4720b.p4721a.C62692t) r10
            if (r10 == 0) goto L_0x0029
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.m.a.b.a.k r3 = (com.google.p4715m.p4716a.p4720b.p4721a.C62683k) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.m.a.b.a.l r4 = (com.google.p4715m.p4716a.p4720b.p4721a.C62684l) r4
            r4.f169240d = r10
            int r10 = r4.f169237a
            r10 = r10 | 32
            r4.f169237a = r10
            com.google.protobuf.bv r10 = r3.build()
            r3 = r10
            com.google.m.a.b.a.l r3 = (com.google.p4715m.p4716a.p4720b.p4721a.C62684l) r3
            goto L_0x002b
        L_0x0029:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x002b:
            org.json.JSONArray r10 = new org.json.JSONArray
            r10.<init>()
            int r4 = r3.f169238b     // Catch:{ JSONException -> 0x007c }
            r5 = 0
            r10.put(r5, r4)     // Catch:{ JSONException -> 0x007c }
            int r4 = r3.f169239c     // Catch:{ JSONException -> 0x007c }
            r6 = 1
            r10.put(r6, r4)     // Catch:{ JSONException -> 0x007c }
            int r4 = r3.f169242f     // Catch:{ JSONException -> 0x007c }
            r7 = 9
            r10.put(r7, r4)     // Catch:{ JSONException -> 0x007c }
            com.google.m.a.b.a.t r4 = r3.f169240d     // Catch:{ JSONException -> 0x007c }
            if (r4 != 0) goto L_0x0049
            com.google.m.a.b.a.t r4 = com.google.p4715m.p4716a.p4720b.p4721a.C62692t.f169255d     // Catch:{ JSONException -> 0x007c }
        L_0x0049:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x007c }
            r7.<init>()     // Catch:{ JSONException -> 0x007c }
            java.lang.String r8 = r4.f169258b     // Catch:{ JSONException -> 0x0059 }
            r7.put(r5, r8)     // Catch:{ JSONException -> 0x0059 }
            java.lang.String r4 = r4.f169259c     // Catch:{ JSONException -> 0x0059 }
            r7.put(r6, r4)     // Catch:{ JSONException -> 0x0059 }
            goto L_0x006a
        L_0x0059:
            r4 = move-exception
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110318ad.f307474a     // Catch:{ JSONException -> 0x007c }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ JSONException -> 0x007c }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ JSONException -> 0x007c }
            r5.mo56378ag(r6, r1)     // Catch:{ JSONException -> 0x007c }
            r6 = 25844(0x64f4, float:3.6215E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r6)).mo56386p(r0)     // Catch:{ JSONException -> 0x007c }
        L_0x006a:
            r4 = 5
            r10.put(r4, r7)     // Catch:{ JSONException -> 0x007c }
            boolean r4 = r3.f169241e     // Catch:{ JSONException -> 0x007c }
            r5 = 6
            r10.put(r5, r4)     // Catch:{ JSONException -> 0x007c }
            boolean r3 = r3.f169243g     // Catch:{ JSONException -> 0x007c }
            r4 = 10
            r10.put(r4, r3)     // Catch:{ JSONException -> 0x007c }
            goto L_0x008d
        L_0x007c:
            r3 = move-exception
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110318ad.f307474a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r1)
            r1 = 25843(0x64f3, float:3.6214E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r1)).mo56386p(r0)
        L_0x008d:
            java.lang.String r10 = r10.toString()
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f307475b
            com.google.android.apps.gsa.shared.m.h r1 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247056U
            java.lang.String r0 = r0.mo79758x(r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "proto"
            android.net.Uri$Builder r0 = r0.appendEncodedPath(r1)
            java.lang.String r1 = "f.req"
            android.net.Uri$Builder r10 = r0.appendQueryParameter(r1, r10)
            java.lang.String r0 = "rt"
            java.lang.String r1 = "b"
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r0, r1)
            android.net.Uri r10 = r10.build()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.util.concurrent.cx r10 = r2.mo98569b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110394x.mo17879a(java.lang.Object):java.lang.Object");
    }
}
