package com.facebook.litho;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.facebook.litho.ap */
/* compiled from: PG */
public final class C6105ap {

    /* renamed from: a */
    public static final Object f18035a = new Object();

    /* renamed from: b */
    public static final Map f18036b = new HashMap(4);

    /* renamed from: c */
    private static final WeakHashMap f18037c = new WeakHashMap();

    /* renamed from: d */
    private static final WeakHashMap f18038d = new WeakHashMap();

    /* renamed from: e */
    private static C6104ao f18039e;

    /* renamed from: a */
    public static void m15885a(Context context) {
        synchronized (f18035a) {
            f18038d.put(context, true);
            m15887c(context);
        }
    }

    /* renamed from: b */
    public static void m15886b(Context context) {
        synchronized (f18035a) {
            f18038d.remove(context);
            m15888d(context);
        }
    }

    /* renamed from: c */
    static void m15887c(Context context) {
        synchronized (f18035a) {
            if (f18036b.containsKey(context)) {
                throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    /* renamed from: d */
    static void m15888d(Context context) {
        synchronized (f18035a) {
            Map map = f18036b;
            map.remove(context);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Context context2 = (Context) ((Map.Entry) it.next()).getKey();
                while (true) {
                    if (context2 instanceof ContextWrapper) {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                        if (context2 == context) {
                            it.remove();
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            f18037c.put(C6107ar.m15892a(context), true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        return r5;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.litho.C6236ej m15889e(android.content.Context r5, com.facebook.litho.C6091ab r6) {
        /*
            int r0 = r6.mo12793K()
            r1 = 0
            if (r0 == 0) goto L_0x0063
            java.lang.Object r0 = f18035a
            monitor-enter(r0)
            java.util.Map r2 = f18036b     // Catch:{ all -> 0x0060 }
            java.lang.Object r3 = r2.get(r5)     // Catch:{ all -> 0x0060 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0060 }
            if (r3 != 0) goto L_0x0049
            android.content.Context r3 = com.facebook.litho.C6107ar.m15892a(r5)     // Catch:{ all -> 0x0060 }
            java.util.WeakHashMap r4 = f18037c     // Catch:{ all -> 0x0060 }
            boolean r3 = r4.containsKey(r3)     // Catch:{ all -> 0x0060 }
            if (r3 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return r1
        L_0x0022:
            java.util.WeakHashMap r1 = f18038d     // Catch:{ all -> 0x0060 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            com.facebook.litho.ao r1 = f18039e     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x0041
            com.facebook.litho.ao r1 = new com.facebook.litho.ao     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            f18039e = r1     // Catch:{ all -> 0x0060 }
            android.content.Context r1 = r5.getApplicationContext()     // Catch:{ all -> 0x0060 }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0060 }
            com.facebook.litho.ao r3 = f18039e     // Catch:{ all -> 0x0060 }
            r1.registerActivityLifecycleCallbacks(r3)     // Catch:{ all -> 0x0060 }
        L_0x0041:
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch:{ all -> 0x0060 }
            r3.<init>()     // Catch:{ all -> 0x0060 }
            r2.put(r5, r3)     // Catch:{ all -> 0x0060 }
        L_0x0049:
            int r5 = r6.f17990y     // Catch:{ all -> 0x0060 }
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x0060 }
            com.facebook.litho.ej r5 = (com.facebook.litho.C6236ej) r5     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x005e
            boolean r5 = com.facebook.litho.p325d.C6180a.f18234a     // Catch:{ all -> 0x0060 }
            com.facebook.litho.ej r5 = r6.mo12794M()     // Catch:{ all -> 0x0060 }
            int r6 = r6.f17990y     // Catch:{ all -> 0x0060 }
            r3.put(r6, r5)     // Catch:{ all -> 0x0060 }
        L_0x005e:
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return r5
        L_0x0060:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r5
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6105ap.m15889e(android.content.Context, com.facebook.litho.ab):com.facebook.litho.ej");
    }
}
