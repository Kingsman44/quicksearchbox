package com.google.android.apps.gsa.staticplugins.p7426ay;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57004n;
import dagger.C68214a;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.ay.b */
/* compiled from: PG */
public final /* synthetic */ class C94418b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C68214a f263954a;

    /* renamed from: b */
    public final /* synthetic */ Set f263955b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f263956c;

    /* renamed from: d */
    public final /* synthetic */ C57004n f263957d;

    /* renamed from: e */
    public final /* synthetic */ String f263958e;

    /* renamed from: f */
    public final /* synthetic */ C68214a f263959f;

    /* renamed from: g */
    public final /* synthetic */ C68214a f263960g;

    /* renamed from: h */
    public final /* synthetic */ C87841fo f263961h;

    /* renamed from: i */
    public final /* synthetic */ Context f263962i;

    /* renamed from: j */
    public final /* synthetic */ C21370a f263963j;

    public /* synthetic */ C94418b(C68214a aVar, Set set, byte[] bArr, C57004n nVar, String str, C68214a aVar2, C68214a aVar3, C87841fo foVar, Context context, C21370a aVar4) {
        this.f263954a = aVar;
        this.f263955b = set;
        this.f263956c = bArr;
        this.f263957d = nVar;
        this.f263958e = str;
        this.f263959f = aVar2;
        this.f263960g = aVar3;
        this.f263961h = foVar;
        this.f263962i = context;
        this.f263963j = aVar4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0148 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            dagger.a r0 = r12.f263954a
            java.util.Set r1 = r12.f263955b
            byte[] r2 = r12.f263956c
            com.google.bv.d.b.b.n r3 = r12.f263957d
            java.lang.String r4 = r12.f263958e
            dagger.a r5 = r12.f263959f
            dagger.a r6 = r12.f263960g
            com.google.android.apps.gsa.search.shared.service.b.fo r7 = r12.f263961h
            android.content.Context r8 = r12.f263962i
            com.google.android.libraries.f.a r9 = r12.f263963j
            int r10 = r3.f152169a
            r10 = r10 & 8
            if (r10 == 0) goto L_0x0021
            com.google.common.o.l.t r3 = r3.f152174f
            if (r3 != 0) goto L_0x0022
            com.google.common.o.l.t r3 = com.google.common.p4552o.p4566l.C60220t.f162931e
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.preferences.r r6 = (com.google.android.apps.gsa.search.core.preferences.C86338r) r6
            java.lang.String r10 = "record_push_notifications"
            r11 = 0
            boolean r6 = r6.getBoolean(r10, r11)
            if (r6 == 0) goto L_0x0036
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r7)
            goto L_0x0038
        L_0x0036:
            com.google.common.base.b r6 = com.google.common.base.C58836b.f156633a
        L_0x0038:
            java.lang.String r7 = "recordedgcmpush.txt"
            java.io.File r7 = com.google.android.apps.gsa.shared.util.debug.C91026j.m148687b(r8, r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            boolean r1 = r1.contains(r8)
            if (r1 == 0) goto L_0x0162
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.gcm.g r0 = (com.google.android.apps.gsa.gcm.g) r0
            r0.a(r2, r3, r4)
            boolean r0 = r6.mo56113h()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r0 = r6.mo56107c()     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.shared.service.b.fo r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo) r0     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.core.q.d r1 = com.google.android.apps.gsa.search.core.p6819q.C86351d.f233463g     // Catch:{ ct -> 0x0154 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.core.q.c r1 = (com.google.android.apps.gsa.search.core.p6819q.C86350c) r1     // Catch:{ ct -> 0x0154 }
            java.lang.String r3 = r0.f237665b     // Catch:{ ct -> 0x0154 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x0154 }
            com.google.protobuf.bv r4 = r1.instance     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.core.q.d r4 = (com.google.android.apps.gsa.search.core.p6819q.C86351d) r4     // Catch:{ ct -> 0x0154 }
            r3.getClass()     // Catch:{ ct -> 0x0154 }
            int r6 = r4.f233465a     // Catch:{ ct -> 0x0154 }
            r6 = r6 | 4
            r4.f233465a = r6     // Catch:{ ct -> 0x0154 }
            r4.f233468d = r3     // Catch:{ ct -> 0x0154 }
            int r3 = r0.f237664a     // Catch:{ ct -> 0x0154 }
            r3 = r3 & 4
            r4 = 1
            if (r3 == 0) goto L_0x0093
            com.google.protobuf.z r3 = r0.f237667d     // Catch:{ ct -> 0x0154 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x0154 }
            com.google.protobuf.bv r6 = r1.instance     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.core.q.d r6 = (com.google.android.apps.gsa.search.core.p6819q.C86351d) r6     // Catch:{ ct -> 0x0154 }
            r3.getClass()     // Catch:{ ct -> 0x0154 }
            int r8 = r6.f233465a     // Catch:{ ct -> 0x0154 }
            r8 = r8 | r4
            r6.f233465a = r8     // Catch:{ ct -> 0x0154 }
            r6.f233466b = r3     // Catch:{ ct -> 0x0154 }
        L_0x0093:
            int r3 = r0.f237664a     // Catch:{ ct -> 0x0154 }
            r3 = r3 & 8
            r6 = 2
            if (r3 == 0) goto L_0x00ad
            java.lang.String r0 = r0.f237668e     // Catch:{ ct -> 0x0154 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x0154 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.core.q.d r3 = (com.google.android.apps.gsa.search.core.p6819q.C86351d) r3     // Catch:{ ct -> 0x0154 }
            r0.getClass()     // Catch:{ ct -> 0x0154 }
            int r8 = r3.f233465a     // Catch:{ ct -> 0x0154 }
            r8 = r8 | r6
            r3.f233465a = r8     // Catch:{ ct -> 0x0154 }
            r3.f233467c = r0     // Catch:{ ct -> 0x0154 }
        L_0x00ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ct -> 0x0154 }
            r0.<init>()     // Catch:{ ct -> 0x0154 }
            long r8 = r9.mo26870b()     // Catch:{ ct -> 0x0154 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x0154 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.core.q.d r3 = (com.google.android.apps.gsa.search.core.p6819q.C86351d) r3     // Catch:{ ct -> 0x0154 }
            int r10 = r3.f233465a     // Catch:{ ct -> 0x0154 }
            r10 = r10 | 8
            r3.f233465a = r10     // Catch:{ ct -> 0x0154 }
            r3.f233469e = r8     // Catch:{ ct -> 0x0154 }
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r2)     // Catch:{ ct -> 0x0154 }
            r1.copyOnWrite()     // Catch:{ ct -> 0x0154 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.core.q.d r3 = (com.google.android.apps.gsa.search.core.p6819q.C86351d) r3     // Catch:{ ct -> 0x0154 }
            int r8 = r3.f233465a     // Catch:{ ct -> 0x0154 }
            r8 = r8 | 16
            r3.f233465a = r8     // Catch:{ ct -> 0x0154 }
            r3.f233470f = r2     // Catch:{ ct -> 0x0154 }
            java.lang.String r2 = "# Prod compiled Proto:\n"
            r0.append(r2)     // Catch:{ ct -> 0x0154 }
            java.lang.String r2 = new java.lang.String     // Catch:{ ct -> 0x0154 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.search.core.q.d r1 = (com.google.android.apps.gsa.search.core.p6819q.C86351d) r1     // Catch:{ ct -> 0x0154 }
            byte[] r1 = r1.toByteArray()     // Catch:{ ct -> 0x0154 }
            byte[] r1 = android.util.Base64.encode(r1, r6)     // Catch:{ ct -> 0x0154 }
            java.lang.String r3 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ ct -> 0x0154 }
            r2.<init>(r1, r3)     // Catch:{ ct -> 0x0154 }
            r0.append(r2)     // Catch:{ ct -> 0x0154 }
            java.lang.String r1 = "\n\n"
            r0.append(r1)     // Catch:{ ct -> 0x0154 }
            boolean r1 = r7.exists()     // Catch:{ ct -> 0x0154 }
            if (r1 != 0) goto L_0x0109
            java.lang.String r1 = "# For instructions how to use this file: go/ndu-gcm-push\n\n"
            r0.insert(r11, r1)     // Catch:{ ct -> 0x0154 }
        L_0x0109:
            java.lang.Object r1 = r5.mo27525b()     // Catch:{ ct -> 0x0154 }
            com.google.android.apps.gsa.shared.util.debug.j r1 = (com.google.android.apps.gsa.shared.util.debug.C91026j) r1     // Catch:{ ct -> 0x0154 }
            java.lang.String r0 = r0.toString()     // Catch:{ ct -> 0x0154 }
            java.lang.String r1 = "UTF-8"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)     // Catch:{ ct -> 0x0154 }
            byte[] r0 = r0.getBytes(r1)     // Catch:{ ct -> 0x0154 }
            java.lang.Object r1 = com.google.android.apps.gsa.shared.util.debug.C91026j.f254263a     // Catch:{ ct -> 0x0154 }
            monitor-enter(r1)     // Catch:{ ct -> 0x0154 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x014b }
            r2.<init>(r7, r4)     // Catch:{ IOException -> 0x014b }
            r2.write(r0)     // Catch:{ all -> 0x012d }
            r2.close()     // Catch:{ IOException -> 0x014b }
            monitor-exit(r1)     // Catch:{ all -> 0x0149 }
            return
        L_0x012d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0132 }
            goto L_0x0148
        L_0x0132:
            r2 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0148 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r3[r11] = r5     // Catch:{ Exception -> 0x0148 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x0148 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0148 }
            r4[r11] = r2     // Catch:{ Exception -> 0x0148 }
            r3.invoke(r0, r4)     // Catch:{ Exception -> 0x0148 }
        L_0x0148:
            throw r0     // Catch:{ IOException -> 0x014b }
        L_0x0149:
            r0 = move-exception
            goto L_0x0152
        L_0x014b:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0149 }
            r2.<init>(r0)     // Catch:{ all -> 0x0149 }
            throw r2     // Catch:{ all -> 0x0149 }
        L_0x0152:
            monitor-exit(r1)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ ct -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.p7426ay.C94419c.f263964a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Bad push message received over GCM. Not recording it."
            r3 = 19970(0x4e02, float:2.7984E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7426ay.C94418b.run():void");
    }
}
