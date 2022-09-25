package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ej */
/* compiled from: PG */
public final class C108664ej {

    /* renamed from: d */
    private static final C59071e f302227d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ej");

    /* renamed from: a */
    public final List f302228a = new ArrayList();

    /* renamed from: b */
    public final Set f302229b = new HashSet();

    /* renamed from: c */
    public final List f302230c = new ArrayList();

    /* renamed from: e */
    private final C108556ar f302231e;

    public C108664ej(C108556ar arVar) {
        this.f302231e = arVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00b2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97048a(java.util.List r8) {
        /*
            r7 = this;
            java.util.List r0 = r7.f302228a
            r0.clear()
            java.util.List r0 = r7.f302228a
            r0.addAll(r8)
            java.util.Set r8 = r7.f302229b
            r8.clear()
            java.util.Set r8 = r7.f302229b
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ar r0 = r7.f302231e
            java.util.List r1 = r0.f302005m
            r2 = 0
            if (r1 == 0) goto L_0x003c
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.i r0 = r0.f302004l
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r0.mo97107k()
            r0.getClass()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r1.next()
            com.google.assistant.at.ng r3 = (com.google.assistant.p3861at.C50173ng) r3
            java.lang.String r4 = r3.f130422b
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0027
            r2 = r3
        L_0x003c:
            if (r2 == 0) goto L_0x00c3
            int r0 = r2.f130421a
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x00c3
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch:{ IOException -> 0x00b5, IllegalStateException -> 0x00b3 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ IOException -> 0x00b5, IllegalStateException -> 0x00b3 }
            java.lang.String r2 = r2.f130429i     // Catch:{ IOException -> 0x00b5, IllegalStateException -> 0x00b3 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x00b5, IllegalStateException -> 0x00b3 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b5, IllegalStateException -> 0x00b3 }
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x0057
            goto L_0x005a
        L_0x0057:
            r0.beginObject()     // Catch:{ all -> 0x0095 }
        L_0x005a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0091
            java.lang.String r1 = r0.nextName()     // Catch:{ all -> 0x0095 }
            java.lang.String r2 = "mediaInitiationAvailableProvidersMid"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x008d
            com.google.common.b.ih r1 = new com.google.common.b.ih     // Catch:{ all -> 0x0095 }
            r1.<init>()     // Catch:{ all -> 0x0095 }
            r0.beginArray()     // Catch:{ all -> 0x0095 }
        L_0x0074:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x0082
            java.lang.String r2 = r0.nextString()     // Catch:{ all -> 0x0095 }
            r1.mo55373c(r2)     // Catch:{ all -> 0x0095 }
            goto L_0x0074
        L_0x0082:
            r0.endArray()     // Catch:{ all -> 0x0095 }
            com.google.common.b.ij r1 = r1.mo55486f()     // Catch:{ all -> 0x0095 }
            r0.close()     // Catch:{ IOException -> 0x00b5, IllegalStateException -> 0x00b3 }
            goto L_0x00cb
        L_0x008d:
            r0.skipValue()     // Catch:{ all -> 0x0095 }
            goto L_0x005a
        L_0x0091:
            r0.close()     // Catch:{ IOException -> 0x00b5, IllegalStateException -> 0x00b3 }
            goto L_0x00c3
        L_0x0095:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x009a }
            goto L_0x00b2
        L_0x009a:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00b2 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x00b2 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00b2 }
            r2[r5] = r0     // Catch:{ Exception -> 0x00b2 }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x00b2 }
        L_0x00b2:
            throw r1     // Catch:{ IOException -> 0x00b5, IllegalStateException -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            goto L_0x00b6
        L_0x00b5:
            r0 = move-exception
        L_0x00b6:
            com.google.common.f.e r1 = f302227d
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Could not parse JSON attributes of HA device"
            r3 = 24202(0x5e8a, float:3.3914E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x00c3:
            java.util.List r0 = r7.f302228a
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ei r1 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108663ei.f302226a
            java.lang.Iterable r1 = com.google.common.p4522b.C58557jl.m90127h(r0, r1)
        L_0x00cb:
            com.google.common.p4522b.C58557jl.m90136q(r8, r1)
            java.util.List r8 = r7.f302230c
            r8.clear()
            java.util.List r8 = r7.f302230c
            java.util.List r0 = r7.f302228a
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.eg r1 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.eg
            r1.<init>(r7)
            java.lang.Iterable r0 = com.google.common.p4522b.C58557jl.m90124e(r0, r1)
            com.google.common.p4522b.C58557jl.m90136q(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108664ej.mo97048a(java.util.List):void");
    }
}
