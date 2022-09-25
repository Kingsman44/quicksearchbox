package com.google.android.play.core.p3534f;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.p3534f.p3536b.C45090c;
import com.google.android.play.core.p3538g.C45138ax;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.f.s */
/* compiled from: PG */
public final class C45111s {

    /* renamed from: a */
    public static final AtomicReference f117782a = new AtomicReference((Object) null);

    /* renamed from: b */
    public final C45097e f117783b;

    /* renamed from: c */
    public final C45081a f117784c;

    /* renamed from: d */
    private final C45138ax f117785d;

    /* renamed from: e */
    private final Set f117786e = new HashSet();

    private C45111s(Context context) {
        try {
            C45097e eVar = new C45097e(context);
            this.f117783b = eVar;
            this.f117784c = new C45081a(eVar);
            this.f117785d = new C45138ax(context);
        } catch (PackageManager.NameNotFoundException e) {
            throw new C45090c((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043 A[LOOP:1: B:10:0x0043->B:13:0x004e, LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m80290c(android.content.Context r8, boolean r9) {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = f117782a
            com.google.android.play.core.f.s r1 = new com.google.android.play.core.f.s
            r1.<init>(r8)
        L_0x0007:
            r2 = 0
            boolean r3 = r0.compareAndSet(r2, r1)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0019
        L_0x0012:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0007
            r0 = 0
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r1 = f117782a
            java.lang.Object r1 = r1.get()
            com.google.android.play.core.f.s r1 = (com.google.android.play.core.p3534f.C45111s) r1
            if (r0 == 0) goto L_0x005c
            com.google.android.play.core.g.k r0 = com.google.android.play.core.p3538g.C45176k.f117918a
            com.google.android.play.core.f.a.c r0 = new com.google.android.play.core.f.a.c
            java.util.concurrent.Executor r3 = com.google.android.play.core.p3534f.C45096d.m80265a()
            com.google.android.play.core.f.a.e r6 = new com.google.android.play.core.f.a.e
            com.google.android.play.core.f.e r7 = r1.f117783b
            r6.<init>(r8, r7)
            com.google.android.play.core.f.e r7 = r1.f117783b
            r0.<init>(r8, r3, r6, r7)
            java.util.concurrent.atomic.AtomicReference r3 = com.google.android.play.core.p3538g.C45176k.f117919b
            r3.set(r0)
            com.google.android.play.core.f.p r0 = new com.google.android.play.core.f.p
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicReference r3 = com.google.android.play.core.p3538g.C45178m.f117921a
        L_0x0043:
            boolean r6 = r3.compareAndSet(r2, r0)
            if (r6 == 0) goto L_0x004a
            goto L_0x0050
        L_0x004a:
            java.lang.Object r6 = r3.get()
            if (r6 == 0) goto L_0x0043
        L_0x0050:
            java.util.concurrent.Executor r0 = com.google.android.play.core.p3534f.C45096d.m80265a()
            com.google.android.play.core.f.o r2 = new com.google.android.play.core.f.o
            r2.<init>(r8)
            r0.execute(r2)
        L_0x005c:
            r1.m80291d(r8, r9)     // Catch:{ Exception -> 0x0060 }
            return r5
        L_0x0060:
            r8 = move-exception
            java.lang.String r9 = "SplitCompat"
            java.lang.String r0 = "Error installing additional splits"
            android.util.Log.e(r9, r0, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3534f.C45111s.m80290c(android.content.Context, boolean):boolean");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x03d1 */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03b3 A[SYNTHETIC, Splitter:B:148:0x03b3] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m80291d(android.content.Context r19, boolean r20) {
        /*
            r18 = this;
            r1 = r18
            monitor-enter(r18)
            if (r20 == 0) goto L_0x000b
            com.google.android.play.core.f.e r0 = r1.f117783b     // Catch:{ all -> 0x0460 }
            r0.mo48936j()     // Catch:{ all -> 0x0460 }
            goto L_0x0017
        L_0x000b:
            java.util.concurrent.Executor r0 = com.google.android.play.core.p3534f.C45096d.m80265a()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.q r2 = new com.google.android.play.core.f.q     // Catch:{ all -> 0x0460 }
            r2.<init>(r1)     // Catch:{ all -> 0x0460 }
            r0.execute(r2)     // Catch:{ all -> 0x0460 }
        L_0x0017:
            java.lang.String r2 = r19.getPackageName()     // Catch:{ all -> 0x0460 }
            r3 = 0
            r4 = 1
            android.content.pm.PackageManager r0 = r19.getPackageManager()     // Catch:{ NameNotFoundException -> 0x044d }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch:{ NameNotFoundException -> 0x044d }
            java.lang.String[] r5 = r0.splitNames     // Catch:{ NameNotFoundException -> 0x044d }
            if (r5 != 0) goto L_0x002f
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x044d }
            r0.<init>()     // Catch:{ NameNotFoundException -> 0x044d }
            goto L_0x0035
        L_0x002f:
            java.lang.String[] r0 = r0.splitNames     // Catch:{ NameNotFoundException -> 0x044d }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ NameNotFoundException -> 0x044d }
        L_0x0035:
            com.google.android.play.core.f.e r2 = r1.f117783b     // Catch:{ all -> 0x0460 }
            java.util.Set r2 = r2.mo48935i()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.g.ax r5 = r1.f117785d     // Catch:{ all -> 0x0460 }
            java.util.Set r5 = r5.mo48975b()     // Catch:{ all -> 0x0460 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            r6.<init>()     // Catch:{ all -> 0x0460 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x0460 }
        L_0x004a:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0460 }
            if (r8 == 0) goto L_0x0071
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.t r8 = (com.google.android.play.core.p3534f.C45112t) r8     // Catch:{ all -> 0x0460 }
            java.lang.String r8 = r8.mo48920b()     // Catch:{ all -> 0x0460 }
            boolean r9 = r0.contains(r8)     // Catch:{ all -> 0x0460 }
            if (r9 != 0) goto L_0x006a
            java.lang.String r9 = com.google.android.play.core.p3538g.C45181p.m80433b(r8)     // Catch:{ all -> 0x0460 }
            boolean r9 = r5.contains(r9)     // Catch:{ all -> 0x0460 }
            if (r9 == 0) goto L_0x004a
        L_0x006a:
            r6.add(r8)     // Catch:{ all -> 0x0460 }
            r7.remove()     // Catch:{ all -> 0x0460 }
            goto L_0x004a
        L_0x0071:
            if (r20 == 0) goto L_0x0077
            r1.mo48944b(r6)     // Catch:{ all -> 0x0460 }
            goto L_0x0089
        L_0x0077:
            boolean r5 = r6.isEmpty()     // Catch:{ all -> 0x0460 }
            if (r5 != 0) goto L_0x0089
            java.util.concurrent.Executor r5 = com.google.android.play.core.p3534f.C45096d.m80265a()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.r r7 = new com.google.android.play.core.f.r     // Catch:{ all -> 0x0460 }
            r7.<init>(r1, r6)     // Catch:{ all -> 0x0460 }
            r5.execute(r7)     // Catch:{ all -> 0x0460 }
        L_0x0089:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            r5.<init>()     // Catch:{ all -> 0x0460 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x0460 }
        L_0x0092:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0460 }
            if (r7 == 0) goto L_0x00ac
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.t r7 = (com.google.android.play.core.p3534f.C45112t) r7     // Catch:{ all -> 0x0460 }
            java.lang.String r7 = r7.mo48920b()     // Catch:{ all -> 0x0460 }
            boolean r8 = com.google.android.play.core.p3538g.C45181p.m80435f(r7)     // Catch:{ all -> 0x0460 }
            if (r8 != 0) goto L_0x0092
            r5.add(r7)     // Catch:{ all -> 0x0460 }
            goto L_0x0092
        L_0x00ac:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0460 }
        L_0x00b0:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x0460 }
            if (r6 == 0) goto L_0x00c6
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x0460 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0460 }
            boolean r7 = com.google.android.play.core.p3538g.C45181p.m80435f(r6)     // Catch:{ all -> 0x0460 }
            if (r7 != 0) goto L_0x00b0
            r5.add(r6)     // Catch:{ all -> 0x0460 }
            goto L_0x00b0
        L_0x00c6:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            int r6 = r2.size()     // Catch:{ all -> 0x0460 }
            r0.<init>(r6)     // Catch:{ all -> 0x0460 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0460 }
        L_0x00d3:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0460 }
            if (r6 == 0) goto L_0x00fb
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.t r6 = (com.google.android.play.core.p3534f.C45112t) r6     // Catch:{ all -> 0x0460 }
            java.lang.String r7 = r6.mo48920b()     // Catch:{ all -> 0x0460 }
            boolean r7 = com.google.android.play.core.p3538g.C45181p.m80434e(r7)     // Catch:{ all -> 0x0460 }
            if (r7 != 0) goto L_0x00f7
            java.lang.String r7 = r6.mo48920b()     // Catch:{ all -> 0x0460 }
            java.lang.String r7 = com.google.android.play.core.p3538g.C45181p.m80433b(r7)     // Catch:{ all -> 0x0460 }
            boolean r7 = r5.contains(r7)     // Catch:{ all -> 0x0460 }
            if (r7 == 0) goto L_0x00d3
        L_0x00f7:
            r0.add(r6)     // Catch:{ all -> 0x0460 }
            goto L_0x00d3
        L_0x00fb:
            com.google.android.play.core.f.n r2 = new com.google.android.play.core.f.n     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.e r5 = r1.f117783b     // Catch:{ all -> 0x0460 }
            r2.<init>(r5)     // Catch:{ all -> 0x0460 }
            java.lang.ClassLoader r5 = r19.getClassLoader()     // Catch:{ all -> 0x0460 }
            r7 = 3
            if (r20 == 0) goto L_0x022d
            java.lang.String r9 = "SplitCompat"
            java.lang.String r10 = "NativeLibraryExtractor: synchronizing native libraries"
            android.util.Log.d(r9, r10)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.e r9 = r2.f117776a     // Catch:{ all -> 0x0460 }
            java.util.Set r9 = r9.mo48935i()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.e r10 = r2.f117776a     // Catch:{ all -> 0x0460 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0460 }
            r11.<init>()     // Catch:{ all -> 0x0460 }
            java.io.File r10 = r10.mo48929b()     // Catch:{ all -> 0x0460 }
            java.io.File[] r10 = r10.listFiles()     // Catch:{ all -> 0x0460 }
            if (r10 == 0) goto L_0x013d
            int r12 = r10.length     // Catch:{ all -> 0x0460 }
            r13 = 0
        L_0x0129:
            if (r13 >= r12) goto L_0x013d
            r14 = r10[r13]     // Catch:{ all -> 0x0460 }
            boolean r15 = r14.isDirectory()     // Catch:{ all -> 0x0460 }
            if (r15 == 0) goto L_0x013a
            java.lang.String r14 = r14.getName()     // Catch:{ all -> 0x0460 }
            r11.add(r14)     // Catch:{ all -> 0x0460 }
        L_0x013a:
            int r13 = r13 + 1
            goto L_0x0129
        L_0x013d:
            java.util.Iterator r10 = r11.iterator()     // Catch:{ all -> 0x0460 }
        L_0x0141:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x0460 }
            if (r11 == 0) goto L_0x0181
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x0460 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0460 }
            java.util.Iterator r12 = r9.iterator()     // Catch:{ all -> 0x0460 }
        L_0x0151:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0460 }
            if (r13 == 0) goto L_0x0168
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.t r13 = (com.google.android.play.core.p3534f.C45112t) r13     // Catch:{ all -> 0x0460 }
            java.lang.String r13 = r13.mo48920b()     // Catch:{ all -> 0x0460 }
            boolean r13 = r13.equals(r11)     // Catch:{ all -> 0x0460 }
            if (r13 == 0) goto L_0x0151
            goto L_0x0141
        L_0x0168:
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ all -> 0x0460 }
            r12[r3] = r11     // Catch:{ all -> 0x0460 }
            java.lang.String r13 = "SplitCompat"
            java.lang.String r14 = "NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting"
            java.lang.String r12 = java.lang.String.format(r14, r12)     // Catch:{ all -> 0x0460 }
            android.util.Log.i(r13, r12)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.e r12 = r2.f117776a     // Catch:{ all -> 0x0460 }
            java.io.File r11 = r12.mo48930c(r11)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.p3534f.C45097e.m80268k(r11)     // Catch:{ all -> 0x0460 }
            goto L_0x0141
        L_0x0181:
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            r10.<init>()     // Catch:{ all -> 0x0460 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0460 }
        L_0x018a:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0460 }
            if (r11 == 0) goto L_0x0229
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.t r11 = (com.google.android.play.core.p3534f.C45112t) r11     // Catch:{ all -> 0x0460 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            r12.<init>()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.i r13 = new com.google.android.play.core.f.i     // Catch:{ all -> 0x0460 }
            r13.<init>(r2, r12, r11)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.p3534f.C45106n.m80288a(r11, r13)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.e r13 = r2.f117776a     // Catch:{ all -> 0x0460 }
            java.lang.String r14 = r11.mo48920b()     // Catch:{ all -> 0x0460 }
            java.util.HashSet r15 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            r15.<init>()     // Catch:{ all -> 0x0460 }
            java.io.File r13 = r13.mo48930c(r14)     // Catch:{ all -> 0x0460 }
            java.io.File[] r13 = r13.listFiles()     // Catch:{ all -> 0x0460 }
            if (r13 == 0) goto L_0x01ca
            int r14 = r13.length     // Catch:{ all -> 0x0460 }
            r6 = 0
        L_0x01ba:
            if (r6 >= r14) goto L_0x01ca
            r8 = r13[r6]     // Catch:{ all -> 0x0460 }
            boolean r16 = r8.isFile()     // Catch:{ all -> 0x0460 }
            if (r16 == 0) goto L_0x01c7
            r15.add(r8)     // Catch:{ all -> 0x0460 }
        L_0x01c7:
            int r6 = r6 + 1
            goto L_0x01ba
        L_0x01ca:
            java.util.Iterator r6 = r15.iterator()     // Catch:{ all -> 0x0460 }
        L_0x01ce:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0460 }
            if (r8 == 0) goto L_0x0224
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0460 }
            java.io.File r8 = (java.io.File) r8     // Catch:{ all -> 0x0460 }
            boolean r13 = r12.contains(r8)     // Catch:{ all -> 0x0460 }
            if (r13 != 0) goto L_0x01ce
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0460 }
            java.lang.String r14 = r8.getAbsolutePath()     // Catch:{ all -> 0x0460 }
            r13[r3] = r14     // Catch:{ all -> 0x0460 }
            java.lang.String r14 = r11.mo48920b()     // Catch:{ all -> 0x0460 }
            r13[r4] = r14     // Catch:{ all -> 0x0460 }
            java.io.File r14 = r11.mo48919a()     // Catch:{ all -> 0x0460 }
            java.lang.String r14 = r14.getAbsolutePath()     // Catch:{ all -> 0x0460 }
            r15 = 2
            r13[r15] = r14     // Catch:{ all -> 0x0460 }
            java.lang.String r14 = "SplitCompat"
            java.lang.String r15 = "NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing"
            java.lang.String r13 = java.lang.String.format(r15, r13)     // Catch:{ all -> 0x0460 }
            android.util.Log.i(r14, r13)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.e r13 = r2.f117776a     // Catch:{ all -> 0x0460 }
            java.io.File r14 = r8.getParentFile()     // Catch:{ all -> 0x0460 }
            java.io.File r14 = r14.getParentFile()     // Catch:{ all -> 0x0460 }
            java.io.File r13 = r13.mo48929b()     // Catch:{ all -> 0x0460 }
            boolean r13 = r14.equals(r13)     // Catch:{ all -> 0x0460 }
            if (r13 == 0) goto L_0x021c
            com.google.android.play.core.p3534f.C45097e.m80268k(r8)     // Catch:{ all -> 0x0460 }
            goto L_0x01ce
        L_0x021c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0460 }
            java.lang.String r2 = "File to remove is not a native library"
            r0.<init>(r2)     // Catch:{ all -> 0x0460 }
            throw r0     // Catch:{ all -> 0x0460 }
        L_0x0224:
            r10.addAll(r12)     // Catch:{ all -> 0x0460 }
            goto L_0x018a
        L_0x0229:
            com.google.android.play.core.p3534f.p3536b.C45089b.m80255a(r5, r10)     // Catch:{ all -> 0x0460 }
            goto L_0x0260
        L_0x022d:
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0460 }
        L_0x0231:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0460 }
            if (r8 == 0) goto L_0x0260
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.t r8 = (com.google.android.play.core.p3534f.C45112t) r8     // Catch:{ all -> 0x0460 }
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0460 }
            r9.<init>(r4)     // Catch:{ all -> 0x0460 }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            r10.<init>()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.h r11 = new com.google.android.play.core.f.h     // Catch:{ all -> 0x0460 }
            r11.<init>(r2, r8, r10, r9)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.p3534f.C45106n.m80288a(r8, r11)     // Catch:{ all -> 0x0460 }
            boolean r8 = r9.get()     // Catch:{ all -> 0x0460 }
            if (r4 == r8) goto L_0x0256
            r10 = 0
        L_0x0256:
            if (r10 != 0) goto L_0x025c
            r6.remove()     // Catch:{ all -> 0x0460 }
            goto L_0x0231
        L_0x025c:
            com.google.android.play.core.p3534f.p3536b.C45089b.m80255a(r5, r10)     // Catch:{ all -> 0x0460 }
            goto L_0x0231
        L_0x0260:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            r2.<init>()     // Catch:{ all -> 0x0460 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0460 }
        L_0x0269:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0460 }
            if (r8 == 0) goto L_0x03d2
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.t r8 = (com.google.android.play.core.p3534f.C45112t) r8     // Catch:{ all -> 0x0460 }
            java.util.zip.ZipFile r9 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x03ae }
            java.io.File r10 = r8.mo48919a()     // Catch:{ IOException -> 0x03ae }
            r9.<init>(r10)     // Catch:{ IOException -> 0x03ae }
            java.lang.String r10 = "classes.dex"
            java.util.zip.ZipEntry r10 = r9.getEntry(r10)     // Catch:{ IOException -> 0x03aa }
            r9.close()     // Catch:{ IOException -> 0x03aa }
            if (r10 == 0) goto L_0x039c
            com.google.android.play.core.f.e r9 = r1.f117783b     // Catch:{ all -> 0x0460 }
            java.lang.String r10 = r8.mo48920b()     // Catch:{ all -> 0x0460 }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x0460 }
            java.io.File r9 = r9.mo48934g()     // Catch:{ all -> 0x0460 }
            java.lang.String r12 = "dex"
            r11.<init>(r9, r12)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.p3534f.C45097e.m80271n(r11)     // Catch:{ all -> 0x0460 }
            java.io.File r9 = com.google.android.play.core.p3534f.C45097e.m80266a(r11, r10)     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.p3534f.C45097e.m80271n(r9)     // Catch:{ all -> 0x0460 }
            java.io.File r10 = r8.mo48919a()     // Catch:{ all -> 0x0460 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0460 }
            r11.<init>()     // Catch:{ all -> 0x0460 }
            java.lang.Object r12 = com.google.android.play.core.p3534f.p3536b.C45088a.m80254a(r5)     // Catch:{ all -> 0x0460 }
            java.lang.String r13 = "dexElements"
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            com.google.android.play.core.f.c.a r13 = com.google.android.play.core.p3534f.p3537c.C45094c.m80260a(r12, r13, r14)     // Catch:{ all -> 0x0460 }
            java.lang.Object r14 = r13.mo48927c()     // Catch:{ all -> 0x0460 }
            java.lang.Object[] r14 = (java.lang.Object[]) r14     // Catch:{ all -> 0x0460 }
            java.util.List r14 = java.util.Arrays.asList(r14)     // Catch:{ all -> 0x0460 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0460 }
            r15.<init>()     // Catch:{ all -> 0x0460 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0460 }
        L_0x02cc:
            boolean r16 = r14.hasNext()     // Catch:{ all -> 0x0460 }
            if (r16 == 0) goto L_0x02eb
            java.lang.Object r4 = r14.next()     // Catch:{ all -> 0x0460 }
            java.lang.String r3 = "path"
            java.lang.Class<java.io.File> r7 = java.io.File.class
            com.google.android.play.core.f.c.b r3 = com.google.android.play.core.p3534f.p3537c.C45094c.m80261b(r4, r3, r7)     // Catch:{ all -> 0x0460 }
            java.lang.Object r3 = r3.mo48927c()     // Catch:{ all -> 0x0460 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0460 }
            r15.add(r3)     // Catch:{ all -> 0x0460 }
            r3 = 0
            r4 = 1
            r7 = 3
            goto L_0x02cc
        L_0x02eb:
            boolean r3 = r15.contains(r10)     // Catch:{ all -> 0x0460 }
            if (r3 == 0) goto L_0x02f3
            goto L_0x039c
        L_0x02f3:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0460 }
            java.util.Set r4 = java.util.Collections.singleton(r10)     // Catch:{ all -> 0x0460 }
            r3.<init>(r4)     // Catch:{ all -> 0x0460 }
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r7 = 3
            java.lang.Class[] r10 = new java.lang.Class[r7]     // Catch:{ all -> 0x0460 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r14 = 0
            r10[r14] = r7     // Catch:{ all -> 0x0460 }
            java.lang.Class<java.io.File> r7 = java.io.File.class
            r14 = 1
            r10[r14] = r7     // Catch:{ all -> 0x0460 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r14 = 2
            r10[r14] = r7     // Catch:{ all -> 0x0460 }
            java.lang.String r7 = "makePathElements"
            java.lang.Class r14 = r12.getClass()     // Catch:{ all -> 0x0460 }
            java.lang.reflect.Method r10 = com.google.android.play.core.p3534f.p3537c.C45094c.m80263d(r14, r7, r10)     // Catch:{ all -> 0x0460 }
            r14 = 3
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0382 }
            r17 = 0
            r15[r17] = r3     // Catch:{ Exception -> 0x0382 }
            r3 = 1
            r15[r3] = r9     // Catch:{ Exception -> 0x0382 }
            r3 = 2
            r15[r3] = r11     // Catch:{ Exception -> 0x0382 }
            java.lang.Object r3 = r10.invoke(r12, r15)     // Catch:{ Exception -> 0x0382 }
            java.lang.Object r3 = r4.cast(r3)     // Catch:{ Exception -> 0x0382 }
            java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch:{ all -> 0x0460 }
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ all -> 0x0460 }
            r13.mo48926b(r3)     // Catch:{ all -> 0x0460 }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x0460 }
            if (r3 != 0) goto L_0x0380
            com.google.android.play.core.f.b.c r0 = new com.google.android.play.core.f.b.c     // Catch:{ all -> 0x0460 }
            java.lang.String r2 = "DexPathList.makeDexElement failed"
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0460 }
            int r2 = r11.size()     // Catch:{ all -> 0x0460 }
            r3 = 0
        L_0x034a:
            if (r3 >= r2) goto L_0x0374
            java.lang.Object r4 = r11.get(r3)     // Catch:{ all -> 0x0460 }
            java.io.IOException r4 = (java.io.IOException) r4     // Catch:{ all -> 0x0460 }
            java.lang.String r5 = "SplitCompat"
            java.lang.String r6 = "DexPathList.makeDexElement failed"
            android.util.Log.e(r5, r6, r4)     // Catch:{ all -> 0x0460 }
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0371 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r7 = 0
            r6[r7] = r5     // Catch:{ Exception -> 0x0371 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r8 = "addSuppressed"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r8, r6)     // Catch:{ Exception -> 0x0371 }
            r6 = 1
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0371 }
            r8[r7] = r4     // Catch:{ Exception -> 0x0371 }
            r5.invoke(r0, r8)     // Catch:{ Exception -> 0x0371 }
        L_0x0371:
            int r3 = r3 + 1
            goto L_0x034a
        L_0x0374:
            java.lang.String r2 = "dexElementsSuppressedExceptions"
            java.lang.Class<java.io.IOException> r3 = java.io.IOException.class
            com.google.android.play.core.f.c.a r2 = com.google.android.play.core.p3534f.p3537c.C45094c.m80260a(r12, r2, r3)     // Catch:{ all -> 0x0460 }
            r2.mo48926b(r11)     // Catch:{ all -> 0x0460 }
            throw r0     // Catch:{ all -> 0x0460 }
        L_0x0380:
            r3 = 2
            goto L_0x039e
        L_0x0382:
            r0 = move-exception
            com.google.android.play.core.f.c.d r2 = new com.google.android.play.core.f.c.d     // Catch:{ all -> 0x0460 }
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0460 }
            r4 = 0
            r3[r4] = r7     // Catch:{ all -> 0x0460 }
            java.lang.Class r4 = r12.getClass()     // Catch:{ all -> 0x0460 }
            r5 = 1
            r3[r5] = r4     // Catch:{ all -> 0x0460 }
            java.lang.String r4 = "Failed to invoke method %s on an object of type %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0460 }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0460 }
            throw r2     // Catch:{ all -> 0x0460 }
        L_0x039c:
            r3 = 2
            r14 = 3
        L_0x039e:
            java.io.File r4 = r8.mo48919a()     // Catch:{ all -> 0x0460 }
            r2.add(r4)     // Catch:{ all -> 0x0460 }
            r3 = 0
            r4 = 1
            r7 = 3
            goto L_0x0269
        L_0x03aa:
            r0 = move-exception
            r2 = r0
            r6 = r9
            goto L_0x03b1
        L_0x03ae:
            r0 = move-exception
            r2 = r0
            r6 = 0
        L_0x03b1:
            if (r6 == 0) goto L_0x03d1
            r6.close()     // Catch:{ IOException -> 0x03b7 }
            goto L_0x03d1
        L_0x03b7:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x03d1 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r0[r5] = r4     // Catch:{ Exception -> 0x03d1 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r6, r0)     // Catch:{ Exception -> 0x03d1 }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x03d1 }
            r4[r5] = r3     // Catch:{ Exception -> 0x03d1 }
            r0.invoke(r2, r4)     // Catch:{ Exception -> 0x03d1 }
        L_0x03d1:
            throw r2     // Catch:{ all -> 0x0460 }
        L_0x03d2:
            com.google.android.play.core.f.a r3 = r1.f117784c     // Catch:{ all -> 0x0460 }
            r4 = r19
            r3.mo48913a(r4, r2)     // Catch:{ all -> 0x0460 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0460 }
            r3.<init>()     // Catch:{ all -> 0x0460 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0460 }
        L_0x03e2:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0460 }
            if (r4 == 0) goto L_0x043f
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0460 }
            com.google.android.play.core.f.t r4 = (com.google.android.play.core.p3534f.C45112t) r4     // Catch:{ all -> 0x0460 }
            java.io.File r5 = r4.mo48919a()     // Catch:{ all -> 0x0460 }
            boolean r5 = r2.contains(r5)     // Catch:{ all -> 0x0460 }
            if (r5 == 0) goto L_0x041f
            java.lang.String r5 = r4.mo48920b()     // Catch:{ all -> 0x0460 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0460 }
            r6.<init>()     // Catch:{ all -> 0x0460 }
            java.lang.String r7 = "Split '"
            r6.append(r7)     // Catch:{ all -> 0x0460 }
            r6.append(r5)     // Catch:{ all -> 0x0460 }
            java.lang.String r5 = "' installation emulated"
            r6.append(r5)     // Catch:{ all -> 0x0460 }
            java.lang.String r5 = "SplitCompat"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0460 }
            android.util.Log.d(r5, r6)     // Catch:{ all -> 0x0460 }
            java.lang.String r4 = r4.mo48920b()     // Catch:{ all -> 0x0460 }
            r3.add(r4)     // Catch:{ all -> 0x0460 }
            goto L_0x03e2
        L_0x041f:
            java.lang.String r4 = r4.mo48920b()     // Catch:{ all -> 0x0460 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0460 }
            r5.<init>()     // Catch:{ all -> 0x0460 }
            java.lang.String r6 = "Split '"
            r5.append(r6)     // Catch:{ all -> 0x0460 }
            r5.append(r4)     // Catch:{ all -> 0x0460 }
            java.lang.String r4 = "' installation not emulated."
            r5.append(r4)     // Catch:{ all -> 0x0460 }
            java.lang.String r4 = "SplitCompat"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0460 }
            android.util.Log.d(r4, r5)     // Catch:{ all -> 0x0460 }
            goto L_0x03e2
        L_0x043f:
            java.util.Set r2 = r1.f117786e     // Catch:{ all -> 0x0460 }
            monitor-enter(r2)     // Catch:{ all -> 0x0460 }
            java.util.Set r0 = r1.f117786e     // Catch:{ all -> 0x044a }
            r0.addAll(r3)     // Catch:{ all -> 0x044a }
            monitor-exit(r2)     // Catch:{ all -> 0x044a }
            monitor-exit(r18)
            return
        L_0x044a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x044a }
            throw r0     // Catch:{ all -> 0x0460 }
        L_0x044d:
            r0 = move-exception
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0460 }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0460 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x0460 }
            java.lang.String r2 = "Cannot load data for application '%s'"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ all -> 0x0460 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0460 }
            throw r3     // Catch:{ all -> 0x0460 }
        L_0x0460:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x0464
        L_0x0463:
            throw r0
        L_0x0464:
            goto L_0x0463
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3534f.C45111s.m80291d(android.content.Context, boolean):void");
    }

    /* renamed from: a */
    public final Set mo48943a() {
        HashSet hashSet;
        synchronized (this.f117786e) {
            hashSet = new HashSet(this.f117786e);
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo48944b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C45097e.m80268k(this.f117783b.mo48933f((String) it.next()));
        }
        C45138ax axVar = this.f117785d;
        synchronized (C45138ax.class) {
            axVar.mo48974a().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }
}
