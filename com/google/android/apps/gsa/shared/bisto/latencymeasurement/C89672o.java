package com.google.android.apps.gsa.shared.bisto.latencymeasurement;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.latencymeasurement.o */
/* compiled from: PG */
abstract class C89672o {

    /* renamed from: a */
    private static final C59071e f242789a = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.latencymeasurement.o");

    /* renamed from: b */
    private boolean f242790b;

    /* renamed from: a */
    public abstract String mo83572a();

    /* renamed from: b */
    public abstract void mo83573b();

    /* renamed from: c */
    public final synchronized boolean mo83578c() {
        return this.f242790b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = f242789a.mo56225c();
        r0.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "NativeLibrary");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(10498)).mo56389s("Unable to load %s", mo83572a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0013 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo83579d() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f242790b     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x0008
            monitor-exit(r4)
            return r1
        L_0x0008:
            java.lang.String r0 = r4.mo83572a()     // Catch:{ UnsatisfiedLinkError -> 0x0013 }
            com.google.android.apps.gsa.shared.util.C90727ak.m148184a(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0013 }
            r4.f242790b = r1     // Catch:{ UnsatisfiedLinkError -> 0x0013 }
            monitor-exit(r4)
            return r1
        L_0x0013:
            com.google.common.f.e r0 = f242789a     // Catch:{ all -> 0x002e }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x002e }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "NativeLibrary"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x002e }
            java.lang.String r1 = "Unable to load %s"
            java.lang.String r2 = r4.mo83572a()     // Catch:{ all -> 0x002e }
            r3 = 10498(0x2902, float:1.4711E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r2)     // Catch:{ all -> 0x002e }
            monitor-exit(r4)
            r0 = 0
            return r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.latencymeasurement.C89672o.mo83579d():boolean");
    }
}
