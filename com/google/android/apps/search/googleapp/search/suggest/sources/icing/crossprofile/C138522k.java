package com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile;

import android.content.Intent;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.k */
/* compiled from: PG */
public final /* synthetic */ class C138522k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C138523l f376772a;

    /* renamed from: b */
    public final /* synthetic */ Intent f376773b;

    /* renamed from: c */
    public final /* synthetic */ C138030av f376774c;

    public /* synthetic */ C138522k(C138523l lVar, Intent intent, C138030av avVar) {
        this.f376772a = lVar;
        this.f376773b = intent;
        this.f376774c = avVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.l r0 = r9.f376772a
            android.content.Intent r1 = r9.f376773b
            com.google.android.apps.search.googleapp.search.suggest.av r2 = r9.f376774c
            com.google.protobuf.cj r3 = new com.google.protobuf.cj
            com.google.protobuf.ch r4 = r2.f375542e
            com.google.protobuf.ci r5 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r3.<init>(r4, r5)
            com.google.protos.ba.a.b r4 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_WORK_PROFILE_APP
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0091
            com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.p r3 = r0.f376779e     // Catch:{ c -> 0x0071 }
            java.lang.Object r4 = com.google.android.enterprise.connectedapps.C142543ac.f386804a     // Catch:{ c -> 0x0071 }
            com.google.android.enterprise.connectedapps.ap r3 = r3.mo117180d(r4)     // Catch:{ c -> 0x0071 }
            r4 = 1
            com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.n r0 = r0.f376778d     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.i r0 = r0.mo114307a()     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.g r5 = com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138518g.f376764a     // Catch:{ all -> 0x0054 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0054 }
            java.lang.Class<com.google.android.enterprise.connectedapps.internal.Bundler> r6 = com.google.android.enterprise.connectedapps.internal.Bundler.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ all -> 0x0054 }
            r5.<init>(r6)     // Catch:{ all -> 0x0054 }
            com.google.android.enterprise.connectedapps.internal.Bundler r6 = com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138518g.f376765b     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = "intent"
            java.lang.String r8 = "android.content.Intent"
            com.google.android.enterprise.connectedapps.internal.BundlerType r8 = com.google.android.enterprise.connectedapps.internal.BundlerType.m231188a(r8)     // Catch:{ all -> 0x0054 }
            r6.mo86971c(r5, r7, r1, r8)     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.h r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138519h) r0     // Catch:{ all -> 0x0054 }
            com.google.android.enterprise.connectedapps.aq r0 = r0.f376767a     // Catch:{ all -> 0x0054 }
            com.google.android.enterprise.connectedapps.ac r0 = r0.mo117175b()     // Catch:{ all -> 0x0054 }
            r6 = 1391980638012389919(0x13514f03e6f33a1f, double:1.255238906763992E-215)
            r0.mo117150a(r6, r4, r5)     // Catch:{ all -> 0x0054 }
            r3.close()     // Catch:{ c -> 0x0071 }
            return
        L_0x0054:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0059 }
            goto L_0x0070
        L_0x0059:
            r1 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0070 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r6 = 0
            r3[r6] = r5     // Catch:{ Exception -> 0x0070 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r3 = r5.getDeclaredMethod(r7, r3)     // Catch:{ Exception -> 0x0070 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0070 }
            r4[r6] = r1     // Catch:{ Exception -> 0x0070 }
            r3.invoke(r0, r4)     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ c -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            com.google.common.f.a.d r1 = com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138523l.f376775a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            com.google.common.f.x r0 = r1.mo56382g(r0)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 41264(0xa130, float:5.7823E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r1 = "Unable to open work profile app [%s]"
            java.lang.String r2 = r2.f375539b
            r0.mo56389s(r1, r2)
            return
        L_0x0091:
            android.content.Context r0 = r0.f376777c
            com.google.apps.tiktok.tracing.C47810es.m84979s(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.C138522k.run():void");
    }
}
