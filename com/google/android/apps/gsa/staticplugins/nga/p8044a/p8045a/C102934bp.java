package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.bp */
/* compiled from: PG */
public final /* synthetic */ class C102934bp implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102962cq f287432a;

    public /* synthetic */ C102934bp(C102962cq cqVar) {
        this.f287432a = cqVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        ((com.google.android.libraries.gsa.p1876k.C22871g) r12.f287502b.mo27525b()).mo28212l("[NGA]NgaStateCheckerImpl.NgaStateCheckerImpl register live-data", new com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102935bq(r12, ((com.google.android.apps.gsa.assistant.shared.d) r12.f287506f.mo27525b()).a(), r3, ((com.google.android.apps.gsa.assistant.shared.d) r12.f287506f.mo27525b()).c(), ((com.google.android.apps.gsa.assistant.shared.d) r12.f287506f.mo27525b()).b(), ((com.google.android.apps.gsa.shared.p6983ah.C89145b) r12.f287507g.mo27525b()).mo83132f(), ((com.google.android.apps.gsa.shared.p6983ah.C89145b) r12.f287507g.mo27525b()).mo83127a(), ((com.google.android.apps.gsa.shared.p6983ah.C89145b) r12.f287507g.mo27525b()).mo83128b(), ((com.google.android.apps.gsa.shared.p6983ah.C89145b) r12.f287507g.mo27525b()).mo83129c(), ((com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110015b) r12.f287508h.mo27525b()).f306495a, ((com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110016c) r12.f287509i.mo27525b()).f306496a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c9, code lost:
        if (((com.google.android.apps.gsa.shared.p7066m.C90021c) r12.f287504d.mo27525b()).mo79746e(com.google.android.apps.gsa.shared.p7066m.C90126fx.f250996aV) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cb, code lost:
        r0 = r12.f287510j;
        r12.f287525y = new com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102959cn(r12);
        r1 = new android.content.IntentFilter();
        r1.addAction("android.car.projection.extra.ACTION_BEGIN_PROJECTION");
        r1.addAction("android.car.projection.extra.ACTION_END_PROJECTION");
        r1.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STARTED");
        r1.addAction("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STOPPED");
        r0.registerReceiver(r12.f287525y, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.google.android.apps.gsa.staticplugins.nga.a.a.cq r12 = r15.f287432a
            dagger.a r0 = r12.f287503c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.nga.api.bo r0 = (com.google.android.apps.gsa.nga.api.C74714bo) r0
            boolean r0 = r0.mo71081c()
            com.google.android.apps.gsa.staticplugins.nga.a.a.cp r1 = r12.f287483A
            if (r1 != 0) goto L_0x0019
            com.google.android.apps.gsa.staticplugins.nga.a.a.cp r1 = new com.google.android.apps.gsa.staticplugins.nga.a.a.cp
            r1.<init>()
            r12.f287483A = r1
        L_0x0019:
            com.google.android.apps.gsa.staticplugins.nga.a.a.cp r3 = r12.f287483A
            dagger.a r1 = r12.f287502b
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.libraries.gsa.k.g r1 = (com.google.android.libraries.gsa.p1876k.C22871g) r1
            com.google.android.apps.gsa.staticplugins.nga.a.a.cf r2 = new com.google.android.apps.gsa.staticplugins.nga.a.a.cf
            r2.<init>(r3, r0)
            java.lang.String r4 = "[NGA] NgaStateCheckerImpl.updateLifecycleState"
            r1.mo28212l(r4, r2)
            java.lang.Object r1 = r12.f287501a
            monitor-enter(r1)
            if (r0 != 0) goto L_0x0034
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            return
        L_0x0034:
            boolean r0 = r12.f287526z     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x003a
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            return
        L_0x003a:
            r0 = 1
            r12.f287526z = r0     // Catch:{ all -> 0x00f3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            dagger.a r0 = r12.f287502b
            java.lang.Object r0 = r0.mo27525b()
            r13 = r0
            com.google.android.libraries.gsa.k.g r13 = (com.google.android.libraries.gsa.p1876k.C22871g) r13
            dagger.a r0 = r12.f287506f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.assistant.shared.d r0 = (com.google.android.apps.gsa.assistant.shared.d) r0
            androidx.lifecycle.LiveData r2 = r0.a()
            dagger.a r0 = r12.f287506f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.assistant.shared.d r0 = (com.google.android.apps.gsa.assistant.shared.d) r0
            androidx.lifecycle.LiveData r4 = r0.c()
            dagger.a r0 = r12.f287506f
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.assistant.shared.d r0 = (com.google.android.apps.gsa.assistant.shared.d) r0
            androidx.lifecycle.LiveData r5 = r0.b()
            dagger.a r0 = r12.f287507g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.ah.b r0 = (com.google.android.apps.gsa.shared.p6983ah.C89145b) r0
            androidx.lifecycle.LiveData r6 = r0.mo83132f()
            dagger.a r0 = r12.f287507g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.ah.b r0 = (com.google.android.apps.gsa.shared.p6983ah.C89145b) r0
            androidx.lifecycle.LiveData r7 = r0.mo83127a()
            dagger.a r0 = r12.f287507g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.ah.b r0 = (com.google.android.apps.gsa.shared.p6983ah.C89145b) r0
            androidx.lifecycle.LiveData r8 = r0.mo83128b()
            dagger.a r0 = r12.f287507g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.ah.b r0 = (com.google.android.apps.gsa.shared.p6983ah.C89145b) r0
            androidx.lifecycle.LiveData r9 = r0.mo83129c()
            dagger.a r0 = r12.f287508h
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.samson.a.b.b r0 = (com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110015b) r0
            androidx.lifecycle.ag r10 = r0.f306495a
            dagger.a r0 = r12.f287509i
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.samson.a.b.c r0 = (com.google.android.apps.gsa.staticplugins.opa.samson.p8415a.p8417b.C110016c) r0
            androidx.lifecycle.ag r11 = r0.f306496a
            com.google.android.apps.gsa.staticplugins.nga.a.a.bq r14 = new com.google.android.apps.gsa.staticplugins.nga.a.a.bq
            r0 = r14
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "[NGA]NgaStateCheckerImpl.NgaStateCheckerImpl register live-data"
            r13.mo28212l(r0, r14)
            dagger.a r0 = r12.f287504d
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.c r0 = (com.google.android.apps.gsa.shared.p7066m.C90021c) r0
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f250996aV
            boolean r0 = r0.mo79746e(r1)
            if (r0 == 0) goto L_0x00f2
            android.content.Context r0 = r12.f287510j
            com.google.android.apps.gsa.staticplugins.nga.a.a.cn r1 = new com.google.android.apps.gsa.staticplugins.nga.a.a.cn
            r1.<init>(r12)
            r12.f287525y = r1
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r2 = "android.car.projection.extra.ACTION_BEGIN_PROJECTION"
            r1.addAction(r2)
            java.lang.String r2 = "android.car.projection.extra.ACTION_END_PROJECTION"
            r1.addAction(r2)
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STARTED"
            r1.addAction(r2)
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STOPPED"
            r1.addAction(r2)
            android.content.BroadcastReceiver r2 = r12.f287525y
            r0.registerReceiver(r2, r1)
        L_0x00f2:
            return
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a.C102934bp.run():void");
    }
}
