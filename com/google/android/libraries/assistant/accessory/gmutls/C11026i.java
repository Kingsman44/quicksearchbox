package com.google.android.libraries.assistant.accessory.gmutls;

import android.os.Build;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4542m.C59344a;

/* renamed from: com.google.android.libraries.assistant.accessory.gmutls.i */
/* compiled from: PG */
public final class C11026i {

    /* renamed from: a */
    private static final C59071e f36226a = C59071e.m91332i("com.google.android.libraries.assistant.accessory.gmutls.i");

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:5|6|(1:8)(2:9|10)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        throw new java.lang.UnsatisfiedLinkError("Couldn't load the native library");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r1 = com.google.common.p4526f.p4527a.C58975e.f156826a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r0 = f36226a.mo56224b();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GmuTlsLibraryLoader");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(42519)).mo56386p("Couldn't load library by name, iterating over known paths.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (m26117b("libgmutlsjni.so") != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26116a() {
        /*
            java.lang.String r0 = "gmutlsjni"
            android.os.SystemClock.elapsedRealtime()
            com.google.common.p4542m.C59344a.m92230a(r0)     // Catch:{ UnsatisfiedLinkError -> 0x000d }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ UnsatisfiedLinkError -> 0x000d }
            return
        L_0x000b:
            r0 = move-exception
            goto L_0x003b
        L_0x000d:
            com.google.common.f.e r0 = f36226a     // Catch:{ all -> 0x000b }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x000b }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x000b }
            java.lang.String r2 = "GmuTlsLibraryLoader"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x000b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x000b }
            r1 = 42519(0xa617, float:5.9582E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x000b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x000b }
            java.lang.String r1 = "Couldn't load library by name, iterating over known paths."
            r0.mo56386p(r1)     // Catch:{ all -> 0x000b }
            java.lang.String r0 = "libgmutlsjni.so"
            boolean r0 = m26117b(r0)     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x0033
            return
        L_0x0033:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
            java.lang.String r1 = "Couldn't load the native library"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.accessory.gmutls.C11026i.m26116a():void");
    }

    /* renamed from: b */
    private static boolean m26117b(String str) {
        try {
            Package packageR = GmuTlsEngine.class.getPackage();
            if (packageR != null) {
                String replace = packageR.getName().replace('.', '/');
                C59344a.m92230a(replace + "/" + str);
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str2 = strArr[i];
                    try {
                        C58976aa aaVar = C58975e.f156826a;
                        C59344a.m92230a("lib/" + str2 + "/" + str);
                        C59104x b = f36226a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "GmuTlsLibraryLoader");
                        ((C59052c) ((C59052c) b).mo56372aa(42524)).mo56354G("Successfully loaded Supported /lib/%s/%s", str2, str);
                        return true;
                    } catch (UnsatisfiedLinkError unused) {
                        i++;
                        C58976aa aaVar2 = C58975e.f156826a;
                    }
                }
                return false;
            }
            throw new UnsatisfiedLinkError("Hey, this package is null, something is off here");
        } catch (UnsatisfiedLinkError unused2) {
            C58976aa aaVar3 = C58975e.f156826a;
        }
    }
}
