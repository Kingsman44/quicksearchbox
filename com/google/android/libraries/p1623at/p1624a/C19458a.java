package com.google.android.libraries.p1623at.p1624a;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.libraries.p1623at.p1625b.C19468a;
import com.google.android.libraries.p1623at.p1625b.C19471d;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.libraries.at.a.a */
/* compiled from: PG */
public final class C19458a {

    /* renamed from: a */
    static final C19468a f54397a = new C19468a("debug.binder.verification");

    /* renamed from: f */
    private static final Object f54398f = new Object();

    /* renamed from: g */
    private static final C19461d f54399g = new C19461d(new C19465h());

    /* renamed from: b */
    public C19458a f54400b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f54401c;

    /* renamed from: d */
    public volatile boolean f54402d;

    /* renamed from: e */
    public volatile C19460c f54403e;

    /* renamed from: h */
    private Context f54404h;

    /* renamed from: i */
    private final Map f54405i = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: j */
    private final Map f54406j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final ThreadLocal f54407k;

    static {
        C19471d.m37154a(new C19468a("debug.binder.strict_mode"));
    }

    public C19458a() {
        DesugarCollections.synchronizedMap(new HashMap());
        Collections.synchronizedSet(new HashSet());
        this.f54401c = new CopyOnWriteArrayList();
        this.f54407k = new ThreadLocal();
        this.f54403e = new C19467j();
    }

    /* renamed from: a */
    public static C19458a m37144a(Context context) {
        C19458a aVar;
        Context applicationContext = context.getApplicationContext();
        boolean z = false;
        do {
            if (context instanceof C19459b) {
                aVar = ((C19459b) context).mo24650a();
                if (aVar == null) {
                    throw new IllegalStateException("BinderContext must not return null Binder: ".concat(String.valueOf(String.valueOf(context))));
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
            z |= context == applicationContext;
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
                if (context == null) {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else if (!z) {
                context = applicationContext;
                continue;
            } else {
                context = null;
                continue;
            }
        } while (context != null);
        Context applicationContext2 = applicationContext.getApplicationContext();
        if (applicationContext2 instanceof C19464g) {
            return ((C19464g) applicationContext2).mo24650a();
        }
        C19461d dVar = f54399g;
        if (dVar.f54408a == null) {
            synchronized (dVar.f54409b) {
                if (dVar.f54408a == null) {
                    C19458a aVar2 = new C19458a(applicationContext2);
                    C19465h hVar = dVar.f54410c;
                    C19465h.m37151a(aVar2);
                    dVar.f54408a = aVar2;
                }
            }
        }
        return dVar.f54408a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bc, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo24648b(java.lang.Class r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f54404h
            if (r0 == 0) goto L_0x00cd
            com.google.android.libraries.at.a.c r0 = r7.f54403e
            java.lang.Object r0 = r0.mo24651a(r8)
            monitor-enter(r0)
            java.util.Map r1 = r7.f54405i     // Catch:{ all -> 0x00ca }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x001b
            java.lang.Object r8 = f54398f     // Catch:{ all -> 0x00ca }
            if (r1 == r8) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return r1
        L_0x001b:
            java.lang.ThreadLocal r1 = r7.f54407k     // Catch:{ all -> 0x00ca }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00ca }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00ca }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 != 0) goto L_0x003b
            java.lang.ThreadLocal r4 = r7.f54407k     // Catch:{ all -> 0x00ca }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00ca }
            r4.set(r2)     // Catch:{ all -> 0x00ca }
        L_0x003b:
            java.util.concurrent.CopyOnWriteArrayList r2 = r7.f54401c     // Catch:{ all -> 0x00bd }
            int r2 = r2.size()     // Catch:{ all -> 0x00bd }
            r4 = 0
        L_0x0042:
            if (r4 >= r2) goto L_0x0075
            java.util.concurrent.CopyOnWriteArrayList r5 = r7.f54401c     // Catch:{ all -> 0x00bd }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ all -> 0x00bd }
            com.google.android.libraries.at.a.f r5 = (com.google.android.libraries.p1623at.p1624a.C19463f) r5     // Catch:{ all -> 0x00bd }
            r5.mo24652a()     // Catch:{ all -> 0x0073 }
            com.google.android.libraries.at.b.a r5 = f54397a     // Catch:{ all -> 0x00bd }
            boolean r5 = com.google.android.libraries.p1623at.p1625b.C19471d.m37154a(r5)     // Catch:{ all -> 0x00bd }
            if (r5 != 0) goto L_0x0070
            java.util.Map r5 = r7.f54405i     // Catch:{ all -> 0x00bd }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x00bd }
            if (r5 == 0) goto L_0x0070
            java.lang.Object r6 = f54398f     // Catch:{ all -> 0x00bd }
            if (r5 == r6) goto L_0x0070
            if (r1 != 0) goto L_0x006e
            java.lang.ThreadLocal r8 = r7.f54407k     // Catch:{ all -> 0x00ca }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00ca }
            r8.set(r1)     // Catch:{ all -> 0x00ca }
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return r5
        L_0x0070:
            int r4 = r4 + 1
            goto L_0x0042
        L_0x0073:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00bd }
        L_0x0075:
            if (r1 != 0) goto L_0x0080
            java.lang.ThreadLocal r1 = r7.f54407k     // Catch:{ all -> 0x00ca }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00ca }
            r1.set(r2)     // Catch:{ all -> 0x00ca }
        L_0x0080:
            java.util.Map r1 = r7.f54405i     // Catch:{ all -> 0x00ca }
            java.lang.Object r1 = r1.get(r8)     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x00bb
            com.google.android.libraries.at.b.a r2 = f54397a     // Catch:{ all -> 0x00ca }
            boolean r2 = com.google.android.libraries.p1623at.p1625b.C19471d.m37154a(r2)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x00b4
            java.util.Map r2 = r7.f54406j     // Catch:{ all -> 0x00ca }
            boolean r2 = r2.containsKey(r8)     // Catch:{ all -> 0x00ca }
            if (r2 != 0) goto L_0x0099
            goto L_0x00b4
        L_0x0099:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r2.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = "get() called for multibound object: "
            r2.append(r3)     // Catch:{ all -> 0x00ca }
            r2.append(r8)     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x00ca }
            r1.<init>(r8)     // Catch:{ all -> 0x00ca }
            throw r1     // Catch:{ all -> 0x00ca }
        L_0x00b4:
            java.util.Map r2 = r7.f54405i     // Catch:{ all -> 0x00ca }
            java.lang.Object r3 = f54398f     // Catch:{ all -> 0x00ca }
            r2.put(r8, r3)     // Catch:{ all -> 0x00ca }
        L_0x00bb:
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            return r1
        L_0x00bd:
            r8 = move-exception
            if (r1 != 0) goto L_0x00c9
            java.lang.ThreadLocal r1 = r7.f54407k     // Catch:{ all -> 0x00ca }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00ca }
            r1.set(r2)     // Catch:{ all -> 0x00ca }
        L_0x00c9:
            throw r8     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ca }
            throw r8
        L_0x00cd:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Binder not initialized yet."
            r8.<init>(r0)
            goto L_0x00d6
        L_0x00d5:
            throw r8
        L_0x00d6:
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1623at.p1624a.C19458a.mo24648b(java.lang.Class):java.lang.Object");
    }

    /* renamed from: c */
    public final Object mo24649c(Class cls) {
        Object b = mo24648b(cls);
        if (b != null) {
            return b;
        }
        return null;
    }

    public C19458a(Context context) {
        DesugarCollections.synchronizedMap(new HashMap());
        Collections.synchronizedSet(new HashSet());
        this.f54401c = new CopyOnWriteArrayList();
        this.f54407k = new ThreadLocal();
        this.f54403e = new C19467j();
        this.f54404h = context;
        this.f54400b = null;
        context.getClass().getName();
    }
}
