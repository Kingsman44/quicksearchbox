package com.google.p4125ay;

import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.ay.d */
/* compiled from: PG */
public final class C54646d {

    /* renamed from: a */
    static final Map f143468a = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: b */
    static final Collection f143469b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    static final Collection f143470c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    private static final ConditionVariable f143471d = new ConditionVariable();

    /* renamed from: e */
    private static volatile boolean f143472e = false;

    /* renamed from: f */
    private static volatile C54643a f143473f = C54644b.f143467a;

    /* renamed from: g */
    private static volatile C54645c f143474g = null;

    /* renamed from: h */
    private static volatile Thread f143475h = null;

    static {
        new AtomicInteger();
    }

    /* renamed from: a */
    public static List m87514a() {
        return new ArrayList(f143470c);
    }

    /* renamed from: b */
    public static List m87515b() {
        return new ArrayList(f143469b);
    }

    /* renamed from: c */
    public static void m87516c(String str, String... strArr) {
        m87518e(f143473f, str);
    }

    /* renamed from: d */
    public static void m87517d(C54643a aVar) {
        if (aVar == null) {
            aVar = C54644b.f143467a;
        }
        f143473f = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r3 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        java.lang.System.nanoTime();
        r4.mo42407a(r5);
        r0.put(r5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f143468a.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0041, code lost:
        if (java.lang.Thread.holdsLock(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
        r1.block();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m87518e(com.google.p4125ay.C54643a r4, java.lang.String r5) {
        /*
            java.util.Map r0 = f143468a
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0047 }
            android.os.ConditionVariable r1 = (android.os.ConditionVariable) r1     // Catch:{ all -> 0x0047 }
            android.os.ConditionVariable r2 = f143471d     // Catch:{ all -> 0x0047 }
            if (r1 != r2) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x000f:
            if (r1 == 0) goto L_0x0013
            r3 = 1
            goto L_0x001c
        L_0x0013:
            android.os.ConditionVariable r1 = new android.os.ConditionVariable     // Catch:{ all -> 0x0047 }
            r1.<init>()     // Catch:{ all -> 0x0047 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0047 }
            r3 = 0
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x003d
            monitor-enter(r1)
            java.lang.System.nanoTime()     // Catch:{ all -> 0x002e }
            r4.mo42407a(r5)     // Catch:{ all -> 0x002e }
            r0.put(r5, r2)     // Catch:{ all -> 0x002e }
            r1.open()     // Catch:{ all -> 0x003a }
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            goto L_0x003d
        L_0x002e:
            r4 = move-exception
            java.util.Map r0 = f143468a     // Catch:{ all -> 0x0035 }
            r0.remove(r5)     // Catch:{ all -> 0x0035 }
            throw r4     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r4 = move-exception
            r1.open()     // Catch:{ all -> 0x003a }
            throw r4     // Catch:{ all -> 0x003a }
        L_0x003a:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            throw r4
        L_0x003d:
            boolean r4 = java.lang.Thread.holdsLock(r1)
            if (r4 != 0) goto L_0x0046
            r1.block()
        L_0x0046:
            return
        L_0x0047:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4125ay.C54646d.m87518e(com.google.ay.a, java.lang.String):void");
    }
}
