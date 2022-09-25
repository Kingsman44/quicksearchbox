package com.google.android.apps.gsa.nga.engine.p6142u;

import com.google.android.apps.gsa.nga.engine.p6142u.p6143a.C78006d;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.libraries.p8975g.C119400d;
import com.google.android.libraries.assistant.p1363c.p1382d.C17195a;
import com.google.android.libraries.assistant.p1363c.p1382d.p1384b.C17202d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.u.k */
/* compiled from: PG */
public final class C78016k implements C78007b {

    /* renamed from: a */
    public static final C58974d f214853a = C58974d.m91136j();

    /* renamed from: b */
    public final C79851ai f214854b;

    /* renamed from: c */
    public final C22871g f214855c;

    /* renamed from: d */
    public final C83305i f214856d;

    /* renamed from: e */
    public final C78006d f214857e;

    /* renamed from: f */
    public final C119400d f214858f;

    /* renamed from: g */
    public final Object f214859g = new Object();

    /* renamed from: h */
    public boolean f214860h = false;

    /* renamed from: i */
    public final C17202d f214861i;

    /* renamed from: j */
    private final Optional f214862j;

    /* renamed from: k */
    private final C91142g f214863k;

    /* renamed from: l */
    private final C17195a f214864l;

    public C78016k(C79851ai aiVar, C22871g gVar, C83305i iVar, Optional optional, C78006d dVar, C91142g gVar2, C17195a aVar, C17202d dVar2, C119400d dVar3) {
        this.f214854b = aiVar;
        this.f214855c = gVar;
        this.f214856d = iVar;
        this.f214862j = optional;
        this.f214857e = dVar;
        this.f214863k = gVar2;
        this.f214864l = aVar;
        this.f214861i = dVar2;
        this.f214858f = dVar3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r8.f214863k.mo85405j(com.google.android.apps.gsa.shared.p7066m.C90126fx.f251065bl) == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        com.google.android.apps.gsa.nativecrashreporter.GsaNativeCrashHandler.d.c();
        r0 = r8.f214854b.mo74251b(28);
        r1 = r8.f214855c;
        r2 = com.google.android.apps.gsa.nga.engine.p6142u.C78002a.f214825a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return r8.f214855c.mo28202b("[NGA] NgaNativeLibraryLoaderImpl.loadNativeLibrary", new com.google.android.apps.gsa.nga.engine.p6142u.C78014i(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r1.mo28209i(r8.f214855c.mo28209i(r8.f214855c.mo28205e(r8.f214864l.mo23231a(r2), "[NGA] JniLibraryLoader.load.catching", com.google.android.libraries.assistant.p1363c.p1382d.C17209c.class, new com.google.android.apps.gsa.nga.engine.p6142u.C78010e(r2)), "[NGA] JniLibraryLoader.load", new com.google.android.apps.gsa.nga.engine.p6142u.C78011f(r8, r2)), "[NGA] NgaNativeLibraryLoaderImpl.loadNgaJniLibrary", new com.google.android.apps.gsa.nga.engine.p6142u.C78013h(r8, r0));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo72959a() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f214859g
            monitor-enter(r0)
            boolean r1 = r8.f214860h     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0012
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x006a }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ all -> 0x006a }
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            goto L_0x0069
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            com.google.android.apps.gsa.shared.util.v.g r0 = r8.f214863k
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251065bl
            boolean r0 = r0.mo85405j(r1)
            if (r0 == 0) goto L_0x005c
            com.google.android.apps.gsa.nativecrashreporter.GsaNativeCrashHandler r0 = com.google.android.apps.gsa.nativecrashreporter.GsaNativeCrashHandler.d
            r0.c()
            com.google.android.apps.gsa.nga.engine.x.ai r0 = r8.f214854b
            r1 = 28
            com.google.android.apps.gsa.nga.engine.x.ah r0 = r0.mo74251b(r1)
            com.google.android.libraries.gsa.k.g r1 = r8.f214855c
            com.google.android.libraries.assistant.c.d.a.b r2 = com.google.android.apps.gsa.nga.engine.p6142u.C78002a.f214825a
            com.google.android.libraries.gsa.k.g r3 = r8.f214855c
            com.google.android.libraries.assistant.c.d.a r4 = r8.f214864l
            com.google.common.util.concurrent.cx r4 = r4.mo23231a(r2)
            com.google.android.apps.gsa.nga.engine.u.e r5 = new com.google.android.apps.gsa.nga.engine.u.e
            r5.<init>(r2)
            java.lang.String r6 = "[NGA] JniLibraryLoader.load.catching"
            java.lang.Class<com.google.android.libraries.assistant.c.d.c> r7 = com.google.android.libraries.assistant.p1363c.p1382d.C17209c.class
            com.google.common.util.concurrent.cx r3 = r3.mo28205e(r4, r6, r7, r5)
            com.google.android.libraries.gsa.k.g r4 = r8.f214855c
            com.google.android.apps.gsa.nga.engine.u.f r5 = new com.google.android.apps.gsa.nga.engine.u.f
            r5.<init>(r8, r2)
            java.lang.String r2 = "[NGA] JniLibraryLoader.load"
            com.google.common.util.concurrent.cx r2 = r4.mo28209i(r3, r2, r5)
            com.google.android.apps.gsa.nga.engine.u.h r3 = new com.google.android.apps.gsa.nga.engine.u.h
            r3.<init>(r8, r0)
            java.lang.String r0 = "[NGA] NgaNativeLibraryLoaderImpl.loadNgaJniLibrary"
            com.google.common.util.concurrent.cx r1 = r1.mo28209i(r2, r0, r3)
            goto L_0x0069
        L_0x005c:
            com.google.android.libraries.gsa.k.g r0 = r8.f214855c
            com.google.android.apps.gsa.nga.engine.u.i r1 = new com.google.android.apps.gsa.nga.engine.u.i
            r1.<init>(r8)
            java.lang.String r2 = "[NGA] NgaNativeLibraryLoaderImpl.loadNativeLibrary"
            com.google.common.util.concurrent.cx r1 = r0.mo28202b(r2, r1)
        L_0x0069:
            return r1
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6142u.C78016k.mo72959a():com.google.common.util.concurrent.cx");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0073 */
    @java.lang.Deprecated
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72960b() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f214859g
            monitor-enter(r0)
            boolean r1 = r8.f214860h     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            return
        L_0x0009:
            j$.util.Optional r1 = r8.f214862j     // Catch:{ all -> 0x0076 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x0028
            com.google.common.f.a.d r1 = f214853a     // Catch:{ all -> 0x0076 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0076 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0076 }
            r2 = 3962(0xf7a, float:5.552E-42)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x0076 }
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1     // Catch:{ all -> 0x0076 }
            java.lang.String r2 = "ensureLibrariesLoaded called while embeddedNativeLibraryAvailable is false."
            r1.mo56386p(r2)     // Catch:{ all -> 0x0076 }
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            return
        L_0x0028:
            com.google.android.apps.gsa.shared.s.a.a r1 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ all -> 0x0076 }
            com.google.android.apps.gsa.nga.engine.x.ai r1 = r8.f214854b     // Catch:{ all -> 0x0074 }
            r2 = 28
            com.google.android.apps.gsa.nga.engine.x.ah r1 = r1.mo74251b(r2)     // Catch:{ all -> 0x0074 }
            r2 = 0
            j$.util.Optional r3 = r8.f214862j     // Catch:{ all -> 0x0055 }
            com.google.android.apps.gsa.nga.engine.u.g r4 = com.google.android.apps.gsa.nga.engine.p6142u.C78012g.f214847a     // Catch:{ all -> 0x0055 }
            j$.util.Optional r3 = r3.map(r4)     // Catch:{ all -> 0x0055 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0055 }
            java.lang.Object r3 = r3.orElse(r4)     // Catch:{ all -> 0x0055 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0055 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0055 }
            r8.f214860h = r3     // Catch:{ all -> 0x0055 }
            r8.mo72961c(r2, r3, r2)     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0053
            r1.mo74255b()     // Catch:{ all -> 0x0074 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            return
        L_0x0055:
            r3 = move-exception
            if (r1 == 0) goto L_0x0073
            r1.mo74255b()     // Catch:{ all -> 0x005c }
            goto L_0x0073
        L_0x005c:
            r1 = move-exception
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0073 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r5[r2] = r6     // Catch:{ Exception -> 0x0073 }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x0073 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0073 }
            r4[r2] = r1     // Catch:{ Exception -> 0x0073 }
            r5.invoke(r3, r4)     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            throw r3     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0076 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6142u.C78016k.mo72960b():void");
    }

    /* renamed from: c */
    public final void mo72961c(boolean z, boolean z2, boolean z3) {
        Thread.currentThread().getStackTrace();
        this.f214855c.mo28212l("[NGA] NgaNativeLibraryLoaderImpl.logNgaNativeCodeLoadedEvent", new C78009d(this, z, z2, z3));
    }
}
