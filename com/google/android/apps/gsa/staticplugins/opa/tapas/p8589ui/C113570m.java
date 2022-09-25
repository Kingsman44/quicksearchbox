package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.widget.RatingBar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.m */
/* compiled from: PG */
public final /* synthetic */ class C113570m implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C113572o f314462a;

    /* renamed from: b */
    public final /* synthetic */ C113415ez f314463b;

    public /* synthetic */ C113570m(C113572o oVar, C113415ez ezVar) {
        this.f314462a = oVar;
        this.f314463b = ezVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        r9.getClass();
        r9 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80008e) r9.toBuilder();
        r9.copyOnWrite();
        ((com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r9.instance).f219563c = com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i.emptyProtobufList();
        r9.copyOnWrite();
        r0 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r9.instance;
        r0.mo74276a();
        com.google.protobuf.C62947c.addAll((java.lang.Iterable) (com.google.common.p4522b.C58485gu) p3186j$.util.Collection.EL.stream(r9.f219563c).map(new com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8564h.C112599a(r0, r8)).collect(com.google.common.p4522b.C58370cn.f155946a), (java.util.List) r0.f219563c);
        r8 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r9.build();
        r7.mo99591a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7 = java.nio.file.Files.newOutputStream(java.nio.file.Paths.get(r7.f312199b.getDataDir().getAbsoluteFile().toString(), new java.lang.String[]{"modelRequest.bin"}), new java.nio.file.OpenOption[]{java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
        r8.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r8.writeDelimitedTo(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e2, code lost:
        if (r7 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e8, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e9, code lost:
        if (r7 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        java.lang.Throwable.class.getDeclaredMethod("addSuppressed", new java.lang.Class[]{java.lang.Throwable.class}).invoke(r8, new java.lang.Object[]{r7});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
        r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8564h.C112600b.f312198a.mo56225c();
        r8.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "TapasTraningData");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(27755)).mo56389s("Error white writing file %s", r7.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0105 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRatingChanged(android.widget.RatingBar r7, float r8, boolean r9) {
        /*
            r6 = this;
            com.google.android.apps.gsa.staticplugins.opa.tapas.ui.o r9 = r6.f314462a
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r0 = r6.f314463b
            int r1 = r7.getNumStars()
            float r7 = r7.getStepSize()
            r2 = 4
            if (r1 != r2) goto L_0x0123
            r1 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x0017
            goto L_0x0123
        L_0x0017:
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.h.b r7 = r9.f314467d
            int r8 = (int) r8
            r1 = 2
            r3 = 0
            r4 = 1
            if (r8 == r4) goto L_0x002e
            if (r8 == r1) goto L_0x002c
            r5 = 3
            if (r8 == r5) goto L_0x002a
            if (r8 == r2) goto L_0x0028
            r8 = 0
            goto L_0x002f
        L_0x0028:
            r8 = 2
            goto L_0x002f
        L_0x002a:
            r8 = 1
            goto L_0x002f
        L_0x002c:
            r8 = -1
            goto L_0x002f
        L_0x002e:
            r8 = -2
        L_0x002f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw r9 = r9.f314469f
            java.lang.String r9 = r9.mo99627b()
            boolean r2 = r7.mo99592b()
            if (r2 != 0) goto L_0x0041
            goto L_0x00e7
        L_0x0041:
            monitor-enter(r7)
            java.util.Map r2 = r7.f312200c     // Catch:{ all -> 0x0120 }
            boolean r2 = r2.containsKey(r9)     // Catch:{ all -> 0x0120 }
            if (r2 != 0) goto L_0x0068
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8564h.C112600b.f312198a     // Catch:{ all -> 0x0120 }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x0120 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "TapasTraningData"
            r8.mo56378ag(r9, r0)     // Catch:{ all -> 0x0120 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0120 }
            r9 = 27756(0x6c6c, float:3.8894E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r9)     // Catch:{ all -> 0x0120 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0120 }
            java.lang.String r9 = "Model request is not set while attempting to rate a suggestion"
            r8.mo56386p(r9)     // Catch:{ all -> 0x0120 }
            monitor-exit(r7)     // Catch:{ all -> 0x0120 }
            return
        L_0x0068:
            java.util.Map r2 = r7.f312200c     // Catch:{ all -> 0x0120 }
            java.lang.Object r9 = r2.get(r9)     // Catch:{ all -> 0x0120 }
            com.google.android.apps.gsa.nga.engine.y.e.a.i r9 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r9     // Catch:{ all -> 0x0120 }
            monitor-exit(r7)     // Catch:{ all -> 0x0120 }
            r9.getClass()
            com.google.protobuf.cq r2 = r9.f219563c
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.h.a r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.h.a
            r5.<init>(r0, r8)
            j$.util.stream.Stream r8 = r2.map(r5)
            j$.util.stream.Collector r0 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r8 = r8.collect(r0)
            com.google.common.b.gu r8 = (com.google.common.p4522b.C58485gu) r8
            com.google.protobuf.bn r9 = r9.toBuilder()
            com.google.android.apps.gsa.nga.engine.y.e.a.e r9 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80008e) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.apps.gsa.nga.engine.y.e.a.i r0 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r0
            com.google.protobuf.cq r2 = com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i.emptyProtobufList()
            r0.f219563c = r2
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.apps.gsa.nga.engine.y.e.a.i r0 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r0
            r0.mo74276a()
            com.google.protobuf.cq r0 = r0.f219563c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r8, (java.util.List) r0)
            com.google.protobuf.bv r8 = r9.build()
            com.google.android.apps.gsa.nga.engine.y.e.a.i r8 = (com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i) r8
            r7.mo99591a(r8)
            java.nio.file.OpenOption[] r9 = new java.nio.file.OpenOption[r1]
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.CREATE
            r9[r3] = r0
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.APPEND
            r9[r4] = r0
            android.content.Context r7 = r7.f312199b
            java.io.File r7 = r7.getDataDir()
            java.io.File r7 = r7.getAbsoluteFile()
            java.lang.String r7 = r7.toString()
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.String r1 = "modelRequest.bin"
            r0[r3] = r1
            java.nio.file.Path r7 = java.nio.file.Paths.get(r7, r0)
            java.io.OutputStream r7 = java.nio.file.Files.newOutputStream(r7, r9)     // Catch:{ Exception -> 0x0106 }
            r8.getClass()
            r8.writeDelimitedTo(r7)     // Catch:{ all -> 0x00e8 }
            if (r7 == 0) goto L_0x00e7
            r7.close()     // Catch:{ Exception -> 0x0106 }
        L_0x00e7:
            return
        L_0x00e8:
            r8 = move-exception
            if (r7 == 0) goto L_0x0105
            r7.close()     // Catch:{ all -> 0x00ef }
            goto L_0x0105
        L_0x00ef:
            r7 = move-exception
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0105 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r9[r3] = r0     // Catch:{ Exception -> 0x0105 }
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.reflect.Method r9 = r0.getDeclaredMethod(r1, r9)     // Catch:{ Exception -> 0x0105 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0105 }
            r0[r3] = r7     // Catch:{ Exception -> 0x0105 }
            r9.invoke(r8, r0)     // Catch:{ Exception -> 0x0105 }
        L_0x0105:
            throw r8     // Catch:{ Exception -> 0x0106 }
        L_0x0106:
            r7 = move-exception
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8564h.C112600b.f312198a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "TapasTraningData"
            r8.mo56378ag(r9, r0)
            java.lang.String r9 = "Error white writing file %s"
            java.lang.String r7 = r7.getMessage()
            r0 = 27755(0x6c6b, float:3.8893E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r0)).mo56389s(r9, r7)
            return
        L_0x0120:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0120 }
            throw r8
        L_0x0123:
            com.google.common.f.e r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113572o.f314464a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r9 = "SgtSecInnerAdapter"
            r7.mo56378ag(r8, r9)
            java.lang.String r8 = "RatingBar star number is not correct"
            r9 = 27915(0x6d0b, float:3.9117E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113570m.onRatingChanged(android.widget.RatingBar, float, boolean):void");
    }
}
