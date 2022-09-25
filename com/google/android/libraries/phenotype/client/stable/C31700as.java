package com.google.android.libraries.phenotype.client.stable;

import com.google.android.libraries.phenotype.client.C31655ak;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.android.libraries.storage.protostore.C42881ag;
import com.google.android.libraries.storage.protostore.C42901b;
import com.google.android.libraries.storage.protostore.C42979do;
import com.google.android.libraries.storage.protostore.p3317b.C42904c;
import com.google.android.libraries.storage.protostore.p3318c.C42932a;
import com.google.common.util.concurrent.C60888db;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.phenotype.client.stable.as */
/* compiled from: PG */
public final class C31700as {

    /* renamed from: a */
    public static final C31655ak f85236a = C31655ak.m58992c();

    /* renamed from: b */
    private static final C42904c f85237b = new C42904c(C31741h.f85325b);

    /* renamed from: c */
    private static final Object f85238c = new Object();

    /* renamed from: d */
    private static volatile C42880af f85239d = null;

    /* renamed from: a */
    public static C42876ab m59035a(C31760t tVar) {
        C42877ac i = C42878ad.m75739i();
        C42718e a = C42719f.m75461a(tVar.f85364a);
        C42719f.m75463c("phenotype");
        a.f111968c = "phenotype";
        a.mo45821b("all_accounts.pb");
        i.mo45968e(a.mo45820a());
        i.mo45967d(C31741h.f85325b);
        C42904c cVar = f85237b;
        if (cVar != null) {
            ((C42901b) i).f112235a = cVar;
            i.mo45966c();
            C42878ad a2 = i.mo45964a();
            C42880af afVar = f85239d;
            if (afVar == null) {
                synchronized (f85238c) {
                    afVar = f85239d;
                    if (afVar == null) {
                        C42932a aVar = C42932a.f112315a;
                        HashMap hashMap = new HashMap();
                        C60888db h = tVar.mo37368h();
                        C42813k e = tVar.mo37367e();
                        C42881ag.m75749a(C42979do.f112413a, hashMap);
                        C42880af afVar2 = new C42880af(h, e, aVar, hashMap);
                        f85239d = afVar2;
                        afVar = afVar2;
                    }
                }
            }
            return afVar.mo45979a(a2);
        }
        throw new NullPointerException("Null handler");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r5 != false) goto L_0x0023;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m59036b(java.io.File r7) {
        /*
            boolean r0 = r7.isDirectory()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0023
            java.io.File[] r0 = r7.listFiles()
            int r3 = r0.length
            r4 = 0
            r5 = 1
        L_0x000f:
            if (r4 >= r3) goto L_0x0021
            r6 = r0[r4]
            if (r5 == 0) goto L_0x001d
            boolean r5 = m59036b(r6)
            if (r5 == 0) goto L_0x001d
            r5 = 1
            goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0021:
            if (r5 == 0) goto L_0x002a
        L_0x0023:
            boolean r7 = r7.delete()
            if (r7 == 0) goto L_0x002a
            return r2
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.C31700as.m59036b(java.io.File):boolean");
    }
}
