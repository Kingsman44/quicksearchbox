package com.google.android.gms.common.util;

import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import java.lang.reflect.Method;

/* renamed from: com.google.android.gms.common.util.r */
/* compiled from: PG */
public final class C144018r {

    /* renamed from: a */
    public static final Method f390252a;

    /* renamed from: b */
    public static final Method f390253b;

    /* renamed from: c */
    private static final Method f390254c;

    /* renamed from: d */
    private static final Method f390255d;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004a */
    static {
        /*
            java.lang.String r0 = "WorkSourceUtil"
            java.lang.String r1 = "add"
            android.os.Process.myUid()
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0017 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0017 }
            r5[r4] = r6     // Catch:{ Exception -> 0x0017 }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r5 = r6.getMethod(r1, r5)     // Catch:{ Exception -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r5 = r2
        L_0x0018:
            f390252a = r5
            r5 = 2
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x002c }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x002c }
            r6[r4] = r7     // Catch:{ Exception -> 0x002c }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch:{ Exception -> 0x002c }
            java.lang.Class<android.os.WorkSource> r7 = android.os.WorkSource.class
            java.lang.reflect.Method r1 = r7.getMethod(r1, r6)     // Catch:{ Exception -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            f390253b = r1
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r6 = "size"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x003a }
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch:{ Exception -> 0x003a }
            goto L_0x003b
        L_0x003a:
            r1 = r2
        L_0x003b:
            f390254c = r1
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x004a }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004a }
            r1[r4] = r6     // Catch:{ Exception -> 0x004a }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.String r7 = "get"
            r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0057 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0057 }
            r1[r4] = r6     // Catch:{ Exception -> 0x0057 }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.String r7 = "getName"
            r6.getMethod(r7, r1)     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r6 = "createWorkChain"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0061 }
            r1.getMethod(r6, r7)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            r1 = move-exception
            java.lang.String r6 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r0, r6, r1)
        L_0x0067:
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x007d }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x007d }
            r5[r4] = r6     // Catch:{ Exception -> 0x007d }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r3] = r6     // Catch:{ Exception -> 0x007d }
            java.lang.String r6 = "addNode"
            r1.getMethod(r6, r5)     // Catch:{ Exception -> 0x007d }
            goto L_0x0083
        L_0x007d:
            r1 = move-exception
            java.lang.String r5 = "Missing WorkChain class"
            android.util.Log.w(r0, r5, r1)
        L_0x0083:
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0090 }
            java.lang.reflect.Method r2 = r0.getMethod(r1, r4)     // Catch:{ Exception -> 0x0090 }
            r2.setAccessible(r3)     // Catch:{ Exception -> 0x0090 }
        L_0x0090:
            f390255d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C144018r.<clinit>():void");
    }

    /* renamed from: a */
    public static boolean m234198a(WorkSource workSource) {
        Method method = f390255d;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                C143919bh.m233958a(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        Method method2 = f390254c;
        if (method2 == null) {
            return true;
        }
        try {
            Object invoke2 = method2.invoke(workSource, new Object[0]);
            C143919bh.m233958a(invoke2);
            if (((Integer) invoke2).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return true;
        }
    }
}
