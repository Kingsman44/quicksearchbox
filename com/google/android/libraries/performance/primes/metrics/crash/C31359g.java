package com.google.android.libraries.performance.primes.metrics.crash;

import java.lang.Thread;

/* renamed from: com.google.android.libraries.performance.primes.metrics.crash.g */
/* compiled from: PG */
final class C31359g implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ C31360h f84426a;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f84427b;

    public C31359g(C31360h hVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f84426a = hVar;
        this.f84427b = uncaughtExceptionHandler;
    }

    /* JADX WARNING: type inference failed for: r2v47, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03b7, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03b8, code lost:
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03f0, code lost:
        r5.uncaughtException(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2 = new java.lang.Throwable[r12];
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00fe */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03b7 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r21, java.lang.Throwable r22) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            com.google.android.libraries.performance.primes.metrics.crash.h r4 = r1.f84426a     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.lang.String r5 = r21.getName()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.lang.Class r6 = r22.getClass()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.lang.Throwable r7 = r22.getCause()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
        L_0x0018:
            if (r7 == 0) goto L_0x002d
            java.lang.Throwable r8 = r7.getCause()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            if (r7 == r8) goto L_0x002d
            java.lang.Class r6 = r7.getClass()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.lang.Throwable r7 = r7.getCause()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            goto L_0x0018
        L_0x002d:
            com.google.common.o.l.al r7 = com.google.common.p4552o.p4566l.C60120al.f162592f     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.common.o.l.ag r7 = (com.google.common.p4552o.p4566l.C60115ag) r7     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.common.o.l.af r8 = com.google.common.p4552o.p4566l.C60114af.f162573f     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.common.o.l.ac r8 = (com.google.common.p4552o.p4566l.C60111ac) r8     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.common.o.l.af r9 = (com.google.common.p4552o.p4566l.C60114af) r9     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            int r10 = r9.f162575a     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r11 = 1
            r10 = r10 | r11
            r9.f162575a = r10     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.lang.String r10 = ""
            r9.f162576b = r10     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r7.copyOnWrite()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.common.o.l.al r9 = (com.google.common.p4552o.p4566l.C60120al) r9     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.common.o.l.af r8 = (com.google.common.p4552o.p4566l.C60114af) r8     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r8.getClass()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r9.f162597d = r8     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            int r8 = r9.f162594a     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r8 = r8 | r11
            r9.f162594a = r8     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.util.IdentityHashMap r8 = new java.util.IdentityHashMap     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r8.<init>()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r9.<init>()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.util.ArrayDeque r10 = new java.util.ArrayDeque     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r10.<init>()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r10.add(r3)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r8.put(r3, r13)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.common.o.l.aj r13 = com.google.common.p4552o.p4568n.C60287a.m92558a(r22)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r9.add(r13)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
        L_0x0086:
            boolean r13 = r10.isEmpty()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r14 = 2
            if (r13 != 0) goto L_0x015a
            java.lang.Object r13 = r10.remove()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Throwable r13 = (java.lang.Throwable) r13     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Object r15 = r8.get(r13)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Object r15 = p3186j$.util.Objects.requireNonNull(r15)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r15 = r15.intValue()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Throwable r16 = r13.getCause()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r16 == 0) goto L_0x00e8
            java.lang.Throwable r11 = r13.getCause()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            boolean r17 = r8.containsKey(r11)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r17 != 0) goto L_0x00c8
            int r17 = r8.size()     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r8.put(r11, r12)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            com.google.common.o.l.aj r12 = com.google.common.p4552o.p4568n.C60287a.m92558a(r11)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r9.add(r12)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
            r10.add(r11)     // Catch:{ Exception -> 0x03c3, all -> 0x03bf }
        L_0x00c8:
            java.lang.Object r12 = r9.get(r15)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.aj r12 = (com.google.common.p4552o.p4566l.C60118aj) r12     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Object r11 = r8.get(r11)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r11 = r11.intValue()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r12.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r12 = r12.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ak r12 = (com.google.common.p4552o.p4566l.C60119ak) r12     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ak r17 = com.google.common.p4552o.p4566l.C60119ak.f162585e     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r2 = r12.f162587a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2 = r2 | r14
            r12.f162587a = r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r12.f162589c = r11     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x00e8:
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r11 = "getSuppressed"
            r12 = 0
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x00fe, all -> 0x03b7 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r11, r14)     // Catch:{ Exception -> 0x00fe, all -> 0x03b7 }
            java.lang.Object[] r11 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00fe, all -> 0x03b7 }
            java.lang.Object r2 = r2.invoke(r13, r11)     // Catch:{ Exception -> 0x00fd, all -> 0x03b7 }
            java.lang.Throwable[] r2 = (java.lang.Throwable[]) r2     // Catch:{ Exception -> 0x00fd, all -> 0x03b7 }
            r12 = 0
            goto L_0x0100
        L_0x00fd:
            r12 = 0
        L_0x00fe:
            java.lang.Throwable[] r2 = new java.lang.Throwable[r12]     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x0100:
            int r11 = r2.length     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r13 = 0
        L_0x0102:
            if (r13 >= r11) goto L_0x0155
            r14 = r2[r13]     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            boolean r17 = r8.containsKey(r14)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r17 != 0) goto L_0x0121
            int r17 = r8.size()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.put(r14, r12)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.aj r12 = com.google.common.p4552o.p4568n.C60287a.m92558a(r14)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r9.add(r12)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r10.add(r14)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x0121:
            java.lang.Object r12 = r9.get(r15)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.aj r12 = (com.google.common.p4552o.p4566l.C60118aj) r12     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Object r14 = r8.get(r14)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r12.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r12 = r12.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ak r12 = (com.google.common.p4552o.p4566l.C60119ak) r12     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ak r17 = com.google.common.p4552o.p4566l.C60119ak.f162585e     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r17 = r2
            com.google.protobuf.ch r2 = r12.f162590d     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            boolean r18 = r2.mo58948c()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r18 != 0) goto L_0x014a
            com.google.protobuf.ch r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r2)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r12.f162590d = r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x014a:
            com.google.protobuf.ch r2 = r12.f162590d     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2.mo58916g(r14)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r13 = r13 + 1
            r2 = r17
            r12 = 0
            goto L_0x0102
        L_0x0155:
            r2 = r21
            r11 = 1
            goto L_0x0086
        L_0x015a:
            com.google.common.o.l.ai r2 = com.google.common.p4552o.p4566l.C60117ai.f162581b     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ah r2 = (com.google.common.p4552o.p4566l.C60116ah) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r8 = r9.size()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r12 = 0
        L_0x0167:
            if (r12 >= r8) goto L_0x018a
            java.lang.Object r10 = r9.get(r12)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.aj r10 = (com.google.common.p4552o.p4566l.C60118aj) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r11 = r2.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ai r11 = (com.google.common.p4552o.p4566l.C60117ai) r11     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ak r10 = (com.google.common.p4552o.p4566l.C60119ak) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r10.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11.mo57068a()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.cq r11 = r11.f162583a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11.add(r10)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r12 = r12 + 1
            goto L_0x0167
        L_0x018a:
            r7.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r8 = (com.google.common.p4552o.p4566l.C60120al) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ai r2 = (com.google.common.p4552o.p4566l.C60117ai) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.f162596c = r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2 = 4
            r8.f162595b = r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            dagger.a r8 = r4.f84431d     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x01ab:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r9 == 0) goto L_0x0324
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.android.libraries.performance.primes.metrics.crash.n r9 = (com.google.android.libraries.performance.primes.metrics.crash.C31366n) r9     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r10 = (com.google.common.p4552o.p4566l.C60120al) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r10 = r10.f162597d     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r10 != 0) goto L_0x01c1
            com.google.common.o.l.af r10 = com.google.common.p4552o.p4566l.C60114af.f162573f     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x01c1:
            int r11 = r10.f162575a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11 = r11 & r14
            if (r11 == 0) goto L_0x0201
            java.lang.String r11 = r10.f162577c     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.String r12 = r9.mo37073a()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r11 != 0) goto L_0x0201
            com.google.protobuf.bn r10 = r10.toBuilder()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ac r10 = (com.google.common.p4552o.p4566l.C60111ac) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r10.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r11 = (com.google.common.p4552o.p4566l.C60114af) r11     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r12.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r13 = r11.f162575a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r13 = r13 | r14
            r11.f162575a = r13     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11.f162577c = r12     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r10 = (com.google.common.p4552o.p4566l.C60114af) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r7.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r11 = r7.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r11 = (com.google.common.p4552o.p4566l.C60120al) r11     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r10.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11.f162597d = r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r10 = r11.f162594a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r12 = 1
            r10 = r10 | r12
            r11.f162594a = r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x0201:
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r10 = (com.google.common.p4552o.p4566l.C60120al) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r11 = r10.f162595b     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r11 != r2) goto L_0x02bc
            java.lang.Object r10 = r10.f162596c     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ai r10 = (com.google.common.p4552o.p4566l.C60117ai) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11 = 0
            r12 = 0
        L_0x020f:
            com.google.protobuf.cq r13 = r10.f162583a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r13 = r13.size()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r12 >= r13) goto L_0x029d
            com.google.protobuf.cq r13 = r10.f162583a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ak r13 = (com.google.common.p4552o.p4566l.C60119ak) r13     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r15 = r13.f162588b     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r15 != 0) goto L_0x0225
            com.google.common.o.l.af r15 = com.google.common.p4552o.p4566l.C60114af.f162573f     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x0225:
            int r2 = r15.f162575a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0292
            java.lang.String r2 = r15.f162577c     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.String r14 = r9.mo37073a()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            boolean r2 = r2.equals(r14)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r2 != 0) goto L_0x0292
            if (r11 != 0) goto L_0x023f
            com.google.protobuf.bn r2 = r10.toBuilder()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11 = r2
            com.google.common.o.l.ah r11 = (com.google.common.p4552o.p4566l.C60116ah) r11     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
        L_0x023f:
            com.google.protobuf.bn r2 = r13.toBuilder()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.aj r2 = (com.google.common.p4552o.p4566l.C60118aj) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bn r13 = r15.toBuilder()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ac r13 = (com.google.common.p4552o.p4566l.C60111ac) r13     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r13.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r15 = r13.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r15 = (com.google.common.p4552o.p4566l.C60114af) r15     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r14.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r19 = r8
            int r8 = r15.f162575a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r18 = 2
            r8 = r8 | 2
            r15.f162575a = r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r15.f162577c = r14     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r8 = r13.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r8 = (com.google.common.p4552o.p4566l.C60114af) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r13 = r2.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ak r13 = (com.google.common.p4552o.p4566l.C60119ak) r13     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r13.f162588b = r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r8 = r13.f162587a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r14 = 1
            r8 = r8 | r14
            r13.f162587a = r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ak r2 = (com.google.common.p4552o.p4566l.C60119ak) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r8 = r11.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ai r8 = (com.google.common.p4552o.p4566l.C60117ai) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.mo57068a()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.cq r8 = r8.f162583a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.set(r12, r2)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            goto L_0x0295
        L_0x0292:
            r19 = r8
            r14 = 1
        L_0x0295:
            int r12 = r12 + 1
            r8 = r19
            r2 = 4
            r14 = 2
            goto L_0x020f
        L_0x029d:
            r19 = r8
            r14 = 1
            if (r11 == 0) goto L_0x02b8
            com.google.protobuf.bv r2 = r11.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ai r2 = (com.google.common.p4552o.p4566l.C60117ai) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r7.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r8 = (com.google.common.p4552o.p4566l.C60120al) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.f162596c = r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2 = 4
            r8.f162595b = r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            goto L_0x031f
        L_0x02b8:
            r8 = r19
            r2 = 4
            goto L_0x0321
        L_0x02bc:
            r19 = r8
            r14 = 1
            r12 = 0
        L_0x02c0:
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r8 = (com.google.common.p4552o.p4566l.C60120al) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.cq r8 = r8.f162598e     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r8 = r8.size()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r12 >= r8) goto L_0x031f
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r8 = (com.google.common.p4552o.p4566l.C60120al) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.cq r8 = r8.f162598e     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Object r8 = r8.get(r12)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r8 = (com.google.common.p4552o.p4566l.C60114af) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r10 = r8.f162575a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11 = 2
            r10 = r10 & r11
            if (r10 == 0) goto L_0x031b
            java.lang.String r10 = r8.f162577c     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.String r11 = r9.mo37073a()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r10 != 0) goto L_0x031b
            com.google.protobuf.bn r8 = r8.toBuilder()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.ac r8 = (com.google.common.p4552o.p4566l.C60111ac) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r10 = (com.google.common.p4552o.p4566l.C60114af) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r11.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r13 = r10.f162575a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r15 = 2
            r13 = r13 | r15
            r10.f162575a = r13     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r10.f162577c = r11     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.af r8 = (com.google.common.p4552o.p4566l.C60114af) r8     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r7.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r10 = (com.google.common.p4552o.p4566l.C60120al) r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r10.mo57069a()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.cq r10 = r10.f162598e     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r10.set(r12, r8)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            goto L_0x031c
        L_0x031b:
            r15 = 2
        L_0x031c:
            int r12 = r12 + 1
            goto L_0x02c0
        L_0x031f:
            r8 = r19
        L_0x0321:
            r14 = 2
            goto L_0x01ab
        L_0x0324:
            r14 = 1
            r15 = 2
            j.a.i.b.a.de r8 = r4.mo37070f()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r9 = r8.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            j.a.i.b.a.dg r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg) r9     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            j.a.i.b.a.dg r10 = p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg.f190307j     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r5.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r10 = r9.f190309a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r10 = r10 | 8
            r9.f190309a = r10     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r9.f190313e = r5     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Class r5 = r22.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Class<java.lang.OutOfMemoryError> r9 = java.lang.OutOfMemoryError.class
            if (r5 != r9) goto L_0x0348
            r11 = 3
            goto L_0x0367
        L_0x0348:
            java.lang.Class<java.lang.NullPointerException> r9 = java.lang.NullPointerException.class
            boolean r9 = r9.isAssignableFrom(r5)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r9 == 0) goto L_0x0352
            r11 = 2
            goto L_0x0367
        L_0x0352:
            java.lang.Class<java.lang.RuntimeException> r9 = java.lang.RuntimeException.class
            boolean r9 = r9.isAssignableFrom(r5)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r9 == 0) goto L_0x035c
            r11 = 4
            goto L_0x0367
        L_0x035c:
            java.lang.Class<java.lang.Error> r2 = java.lang.Error.class
            boolean r2 = r2.isAssignableFrom(r5)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            if (r2 == 0) goto L_0x0366
            r11 = 5
            goto L_0x0367
        L_0x0366:
            r11 = 1
        L_0x0367:
            r8.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            j.a.i.b.a.dg r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r11 = r11 + -1
            r2.f190314f = r11     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r5 = r2.f190309a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r5 = r5 | 16
            r2.f190309a = r5     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r2 = r8.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            j.a.i.b.a.dg r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r6.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r5 = r2.f190309a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r5 = r5 | 128(0x80, float:1.794E-43)
            r2.f190309a = r5     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2.f190315g = r6     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r2 = r7.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.common.o.l.al r2 = (com.google.common.p4552o.p4566l.C60120al) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r5 = r8.instance     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            j.a.i.b.a.dg r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg) r5     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2.getClass()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r5.f190316h = r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r2 = r5.f190309a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r2 = r2 | 256(0x100, float:3.59E-43)
            r5.f190309a = r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            int r2 = com.google.apps.tiktok.tracing.C47865y.f123933a     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            com.google.protobuf.bv r2 = r8.build()     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            j.a.i.b.a.dg r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71278dg) r2     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            r4.mo37071g(r2)     // Catch:{ Exception -> 0x03bb, all -> 0x03b7 }
            java.lang.Thread$UncaughtExceptionHandler r2 = r1.f84427b
            if (r2 == 0) goto L_0x03e9
            r4 = r21
            r2.uncaughtException(r4, r3)
            return
        L_0x03b7:
            r0 = move-exception
            r4 = r21
            goto L_0x03c1
        L_0x03bb:
            r0 = move-exception
            r4 = r21
            goto L_0x03c5
        L_0x03bf:
            r0 = move-exception
            r4 = r2
        L_0x03c1:
            r2 = r0
            goto L_0x03ec
        L_0x03c3:
            r0 = move-exception
            r4 = r2
        L_0x03c5:
            r2 = r0
            com.google.common.f.e r5 = com.google.android.libraries.performance.primes.metrics.crash.C31360h.f84428a     // Catch:{ all -> 0x03ea }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x03ea }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x03ea }
            com.google.common.f.x r2 = r5.mo56382g(r2)     // Catch:{ all -> 0x03ea }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x03ea }
            r5 = 50373(0xc4c5, float:7.0588E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r5)     // Catch:{ all -> 0x03ea }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x03ea }
            java.lang.String r5 = "Failed to record crash."
            r2.mo56386p(r5)     // Catch:{ all -> 0x03ea }
            java.lang.Thread$UncaughtExceptionHandler r2 = r1.f84427b
            if (r2 == 0) goto L_0x03e9
            r2.uncaughtException(r4, r3)
        L_0x03e9:
            return
        L_0x03ea:
            r0 = move-exception
            goto L_0x03c1
        L_0x03ec:
            java.lang.Thread$UncaughtExceptionHandler r5 = r1.f84427b
            if (r5 == 0) goto L_0x03f3
            r5.uncaughtException(r4, r3)
        L_0x03f3:
            goto L_0x03f5
        L_0x03f4:
            throw r2
        L_0x03f5:
            goto L_0x03f4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.crash.C31359g.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
