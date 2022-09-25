package com.google.android.apps.gsa.speech.audio;

import com.google.android.libraries.gsa.p1876k.C22862b;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.speech.audio.b */
/* compiled from: PG */
public final /* synthetic */ class C92158b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ String f256934a;

    /* renamed from: b */
    public final /* synthetic */ File f256935b;

    public /* synthetic */ C92158b(String str, File file) {
        this.f256934a = str;
        this.f256935b = file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r2 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r2 != null) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f256934a
            java.io.File r1 = r7.f256935b
            r2 = 0
            r3 = 1
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0024 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0024 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0024 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0024 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0024 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0024 }
            r4.writeUTF(r0)     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r4.close()
            goto L_0x004a
        L_0x001c:
            r2 = r4
            goto L_0x0047
        L_0x001f:
            r0 = move-exception
            r2 = r4
            goto L_0x0025
        L_0x0022:
            goto L_0x0047
        L_0x0024:
            r0 = move-exception
        L_0x0025:
            r3 = 0
            com.google.common.f.e r1 = com.google.android.apps.gsa.speech.audio.C92195f.f257041a     // Catch:{ all -> 0x0022 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x0022 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0022 }
            com.google.common.f.x r0 = r1.mo56382g(r0)     // Catch:{ all -> 0x0022 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0022 }
            r1 = 12030(0x2efe, float:1.6858E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0022 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0022 }
            java.lang.String r1 = "write failed"
            r0.mo56386p(r1)     // Catch:{ all -> 0x0022 }
            if (r2 == 0) goto L_0x004a
        L_0x0043:
            r2.close()
            goto L_0x004a
        L_0x0047:
            if (r2 == 0) goto L_0x004a
            goto L_0x0043
        L_0x004a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.C92158b.mo17947a():java.lang.Object");
    }
}
