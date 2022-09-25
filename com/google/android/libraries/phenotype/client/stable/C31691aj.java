package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import com.google.android.libraries.phenotype.client.C31676o;
import com.google.p343ac.p352c.p353a.C6656b;
import java.util.Map;

/* renamed from: com.google.android.libraries.phenotype.client.stable.aj */
/* compiled from: PG */
public final class C31691aj {

    /* renamed from: f */
    private static final Object f85212f = new Object();

    /* renamed from: g */
    private static volatile Map f85213g;

    /* renamed from: a */
    public final String f85214a;

    /* renamed from: b */
    public final boolean f85215b;

    /* renamed from: c */
    public final boolean f85216c;

    /* renamed from: d */
    public final boolean f85217d;

    /* renamed from: e */
    public final int f85218e;

    public C31691aj(Context context, C31693al alVar) {
        this.f85214a = alVar.f85222b ? C31676o.m59022d(context, alVar.f85221a) : alVar.f85221a;
        int a = C6656b.m18012a(alVar.f85223c);
        this.f85218e = a == 0 ? 1 : a;
        this.f85215b = alVar.f85226f;
        this.f85216c = alVar.f85224d;
        this.f85217d = alVar.f85225e;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Map m59034a(android.content.Context r13) {
        /*
            java.util.Map r0 = f85213g
            if (r0 != 0) goto L_0x00ad
            java.lang.Object r1 = f85212f
            monitor-enter(r1)
            java.util.Map r0 = f85213g     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x00a8
            com.google.common.b.gz r0 = new com.google.common.b.gz     // Catch:{ all -> 0x00aa }
            r2 = 4
            r0.<init>(r2)     // Catch:{ all -> 0x00aa }
            r2 = 1
            android.content.res.AssetManager r3 = r13.getAssets()     // Catch:{ IOException -> 0x0099 }
            java.lang.String r4 = "phenotype"
            java.lang.String[] r3 = r3.list(r4)     // Catch:{ IOException -> 0x0099 }
            int r4 = r3.length     // Catch:{ IOException -> 0x0099 }
            r5 = 0
            r6 = 0
        L_0x001f:
            if (r6 >= r4) goto L_0x00a1
            r7 = r3[r6]     // Catch:{ IOException -> 0x0099 }
            java.lang.String r8 = "_package_metadata.binarypb"
            boolean r8 = r7.endsWith(r8)     // Catch:{ IOException -> 0x0099 }
            if (r8 != 0) goto L_0x002c
            goto L_0x0096
        L_0x002c:
            android.content.res.AssetManager r8 = r13.getAssets()     // Catch:{ ct -> 0x007f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ct -> 0x007f }
            r9.<init>()     // Catch:{ ct -> 0x007f }
            java.lang.String r10 = "phenotype/"
            r9.append(r10)     // Catch:{ ct -> 0x007f }
            r9.append(r7)     // Catch:{ ct -> 0x007f }
            java.lang.String r9 = r9.toString()     // Catch:{ ct -> 0x007f }
            java.io.InputStream r8 = r8.open(r9)     // Catch:{ ct -> 0x007f }
            com.google.android.libraries.phenotype.client.stable.aj r9 = new com.google.android.libraries.phenotype.client.stable.aj     // Catch:{ all -> 0x0061 }
            com.google.protobuf.ba r10 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0061 }
            com.google.android.libraries.phenotype.client.stable.al r11 = com.google.android.libraries.phenotype.client.stable.C31693al.f85219g     // Catch:{ all -> 0x0061 }
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r11, (java.io.InputStream) r8, (com.google.protobuf.C62921ba) r10)     // Catch:{ all -> 0x0061 }
            com.google.android.libraries.phenotype.client.stable.al r10 = (com.google.android.libraries.phenotype.client.stable.C31693al) r10     // Catch:{ all -> 0x0061 }
            r9.<init>(r13, r10)     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r9.f85214a     // Catch:{ all -> 0x0061 }
            r0.mo55429h(r10, r9)     // Catch:{ all -> 0x0061 }
            if (r8 == 0) goto L_0x0096
            r8.close()     // Catch:{ ct -> 0x007f }
            goto L_0x0096
        L_0x0061:
            r9 = move-exception
            if (r8 == 0) goto L_0x007e
            r8.close()     // Catch:{ all -> 0x0068 }
            goto L_0x007e
        L_0x0068:
            r8 = move-exception
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x007e }
            java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
            r10[r5] = r11     // Catch:{ Exception -> 0x007e }
            java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
            java.lang.String r12 = "addSuppressed"
            java.lang.reflect.Method r10 = r11.getDeclaredMethod(r12, r10)     // Catch:{ Exception -> 0x007e }
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x007e }
            r11[r5] = r8     // Catch:{ Exception -> 0x007e }
            r10.invoke(r9, r11)     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            throw r9     // Catch:{ ct -> 0x007f }
        L_0x007f:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0099 }
            r9.<init>()     // Catch:{ IOException -> 0x0099 }
            java.lang.String r10 = "Unable to read Phenotype PackageMetadata for "
            r9.append(r10)     // Catch:{ IOException -> 0x0099 }
            r9.append(r7)     // Catch:{ IOException -> 0x0099 }
            java.lang.String r7 = "PackageInfo"
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0099 }
            android.util.Log.e(r7, r9, r8)     // Catch:{ IOException -> 0x0099 }
        L_0x0096:
            int r6 = r6 + 1
            goto L_0x001f
        L_0x0099:
            r13 = move-exception
            java.lang.String r3 = "PackageInfo"
            java.lang.String r4 = "Unable to read Phenotype PackageMetadata from assets."
            android.util.Log.e(r3, r4, r13)     // Catch:{ all -> 0x00aa }
        L_0x00a1:
            com.google.common.b.hd r13 = r0.mo55427f(r2)     // Catch:{ all -> 0x00aa }
            f85213g = r13     // Catch:{ all -> 0x00aa }
            r0 = r13
        L_0x00a8:
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            goto L_0x00ad
        L_0x00aa:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            throw r13
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.C31691aj.m59034a(android.content.Context):java.util.Map");
    }
}
