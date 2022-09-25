package com.google.android.apps.gsa.search.core;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.n */
/* compiled from: PG */
public final /* synthetic */ class C86181n implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C86184o f232878a;

    public /* synthetic */ C86181n(C86184o oVar) {
        this.f232878a = oVar;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "managed"
            com.google.android.apps.gsa.search.core.o r1 = r12.f232878a
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ IOException -> 0x00e2 }
            r2.<init>()     // Catch:{ IOException -> 0x00e2 }
            android.accounts.Account r3 = com.google.android.libraries.storage.p3304a.p3305a.C42714a.f111955a     // Catch:{ IOException -> 0x00e2 }
            r2.add(r3)     // Catch:{ IOException -> 0x00e2 }
            com.google.android.libraries.storage.a.k r3 = r1.f232882c     // Catch:{ IOException -> 0x00e2 }
            android.content.Context r4 = r1.f232880a     // Catch:{ IOException -> 0x00e2 }
            com.google.android.libraries.storage.a.a.e r4 = com.google.android.libraries.storage.p3304a.p3305a.C42719f.m75461a(r4)     // Catch:{ IOException -> 0x00e2 }
            com.google.android.libraries.storage.p3304a.p3305a.C42719f.m75462b(r0)     // Catch:{ IOException -> 0x00e2 }
            r4.f111967b = r0     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r5 = "facs"
            com.google.android.libraries.storage.p3304a.p3305a.C42719f.m75463c(r5)     // Catch:{ IOException -> 0x00e2 }
            r4.f111968c = r5     // Catch:{ IOException -> 0x00e2 }
            android.net.Uri r4 = r4.mo45820a()     // Catch:{ IOException -> 0x00e2 }
            com.google.android.libraries.storage.p3304a.p3305a.C42720g.m75464b(r4)     // Catch:{ q -> 0x00db }
            java.util.List r5 = r4.getPathSegments()     // Catch:{ IOException -> 0x00e2 }
            int r6 = r5.size()     // Catch:{ IOException -> 0x00e2 }
            r7 = 1
            r8 = 2
            r9 = 0
            if (r6 < r8) goto L_0x0038
            r6 = 1
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            java.lang.String r10 = "URI must specify a module"
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00e2 }
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75526a(r6, r10, r11)     // Catch:{ IOException -> 0x00e2 }
            java.lang.Object r6 = r5.get(r9)     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00e2 }
            boolean r0 = r6.equals(r0)     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r6 = "URI must be in 'managed' location"
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00e2 }
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75526a(r0, r6, r10)     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r0 = java.io.File.separator     // Catch:{ IOException -> 0x00e2 }
            java.util.List r5 = r5.subList(r9, r8)     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ IOException -> 0x00e2 }
            android.net.Uri$Builder r4 = r4.buildUpon()     // Catch:{ IOException -> 0x00e2 }
            android.net.Uri$Builder r0 = r4.path(r0)     // Catch:{ IOException -> 0x00e2 }
            android.net.Uri r0 = r0.build()     // Catch:{ IOException -> 0x00e2 }
            com.google.android.apps.gsa.search.core.google.gaia.o r1 = r1.f232881b     // Catch:{ IOException -> 0x00e2 }
            android.accounts.Account[] r1 = r1.mo79684r()     // Catch:{ IOException -> 0x00e2 }
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch:{ IOException -> 0x00e2 }
            r2.addAll(r1)     // Catch:{ IOException -> 0x00e2 }
            if (r3 == 0) goto L_0x0078
            r1 = 1
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            java.lang.String r4 = "Storage must be set"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00e2 }
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75527b(r1, r4, r5)     // Catch:{ IOException -> 0x00e2 }
            if (r0 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r7 = 0
        L_0x0084:
            java.lang.String r1 = "BaseUri must be set"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00e2 }
            com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i.m75527b(r7, r1, r4)     // Catch:{ IOException -> 0x00e2 }
            boolean r1 = r3.mo45894h(r0)     // Catch:{ IOException -> 0x00e2 }
            if (r1 != 0) goto L_0x0092
            goto L_0x00d3
        L_0x0092:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x00e2 }
            r1.<init>()     // Catch:{ IOException -> 0x00e2 }
            java.lang.Iterable r0 = r3.mo45888b(r0)     // Catch:{ IOException -> 0x00e2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x00e2 }
        L_0x009f:
            boolean r4 = r0.hasNext()     // Catch:{ IOException -> 0x00e2 }
            if (r4 == 0) goto L_0x00cd
            java.lang.Object r4 = r0.next()     // Catch:{ IOException -> 0x00e2 }
            android.net.Uri r4 = (android.net.Uri) r4     // Catch:{ IOException -> 0x00e2 }
            java.util.List r5 = r4.getPathSegments()     // Catch:{ IOException -> 0x00e2 }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ IOException -> 0x00e2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00e2 }
            android.accounts.Account r5 = com.google.android.libraries.storage.p3304a.p3305a.C42714a.m75443a(r5)     // Catch:{ IOException -> 0x00e2 }
            boolean r5 = r2.contains(r5)     // Catch:{ IOException -> 0x00e2 }
            if (r5 != 0) goto L_0x009f
            com.google.android.libraries.storage.a.f.p r5 = new com.google.android.libraries.storage.a.f.p     // Catch:{ IOException -> 0x00c8 }
            r5.<init>()     // Catch:{ IOException -> 0x00c8 }
            r3.mo45889c(r4, r5)     // Catch:{ IOException -> 0x00c8 }
            goto L_0x009f
        L_0x00c8:
            r4 = move-exception
            r1.add(r4)     // Catch:{ IOException -> 0x00e2 }
            goto L_0x009f
        L_0x00cd:
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x00e2 }
            if (r0 == 0) goto L_0x00d4
        L_0x00d3:
            return
        L_0x00d4:
            java.lang.String r0 = "Failed to delete one or more account files"
            java.io.IOException r0 = com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42743d.m75522a(r0, r1)     // Catch:{ IOException -> 0x00e2 }
            throw r0     // Catch:{ IOException -> 0x00e2 }
        L_0x00db:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x00e2 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00e2 }
            throw r1     // Catch:{ IOException -> 0x00e2 }
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.C86181n.run():void");
    }
}
