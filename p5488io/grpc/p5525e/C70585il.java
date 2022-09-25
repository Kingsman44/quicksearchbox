package p5488io.grpc.p5525e;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* renamed from: io.grpc.e.il */
/* compiled from: PG */
public final class C70585il implements C70500fh {

    /* renamed from: a */
    public static final RuntimeException f188161a;

    /* renamed from: b */
    private static final Logger f188162b = Logger.getLogger(C70585il.class.getName());

    /* renamed from: c */
    private static final Constructor f188163c;

    /* renamed from: d */
    private static final Method f188164d;

    /* renamed from: e */
    private static final Object[] f188165e = {1L};

    /* renamed from: f */
    private final Object f188166f;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.Class<io.grpc.e.il> r0 = p5488io.grpc.p5525e.C70585il.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f188162b = r0
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x0043 }
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch:{ all -> 0x0043 }
            r4[r1] = r5     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = "add"
            java.lang.reflect.Method r4 = r3.getMethod(r5, r4)     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = "sum"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x0040 }
            r3.getMethod(r5, r6)     // Catch:{ all -> 0x0040 }
            java.lang.reflect.Constructor[] r3 = r3.getConstructors()     // Catch:{ all -> 0x0040 }
            int r5 = r3.length     // Catch:{ all -> 0x0040 }
            r6 = 0
        L_0x002e:
            if (r6 >= r5) goto L_0x003d
            r7 = r3[r6]     // Catch:{ all -> 0x0040 }
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch:{ all -> 0x0040 }
            int r8 = r8.length     // Catch:{ all -> 0x0040 }
            if (r8 != 0) goto L_0x003a
            goto L_0x003e
        L_0x003a:
            int r6 = r6 + 1
            goto L_0x002e
        L_0x003d:
            r7 = r2
        L_0x003e:
            r3 = r2
            goto L_0x0055
        L_0x0040:
            r3 = move-exception
            r10 = r4
            goto L_0x0045
        L_0x0043:
            r3 = move-exception
            r10 = r2
        L_0x0045:
            java.util.logging.Logger r4 = f188162b
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            java.lang.String r6 = "io.grpc.internal.ReflectionLongAdderCounter"
            java.lang.String r7 = "<clinit>"
            java.lang.String r8 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            r9 = r3
            r4.logp(r5, r6, r7, r8, r9)
            r7 = r2
            r4 = r10
        L_0x0055:
            if (r3 != 0) goto L_0x0060
            if (r7 == 0) goto L_0x0060
            f188163c = r7
            f188164d = r4
            f188161a = r2
            goto L_0x006b
        L_0x0060:
            f188163c = r2
            f188164d = r2
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r3)
            f188161a = r2
        L_0x006b:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r1] = r2
            f188165e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70585il.<clinit>():void");
    }

    public C70585il() {
        RuntimeException runtimeException = f188161a;
        if (runtimeException == null) {
            try {
                this.f188166f = f188163c.newInstance(new Object[0]);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            throw runtimeException;
        }
    }

    /* renamed from: a */
    public final void mo62224a() {
        try {
            f188164d.invoke(this.f188166f, f188165e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
