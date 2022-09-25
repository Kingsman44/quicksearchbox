package com.google.common.p4526f.p4528b.p4530b;

import com.google.common.p4526f.p4528b.C59010ae;
import com.google.common.p4526f.p4528b.C59011af;
import com.google.common.p4526f.p4528b.C59033h;
import com.google.common.p4526f.p4531c.C59053a;
import com.google.common.p4526f.p4531c.C59055c;

/* renamed from: com.google.common.f.b.b.f */
/* compiled from: PG */
public final class C59022f extends C59011af {

    /* renamed from: a */
    private final C59020d f156933a;

    /* renamed from: b */
    private final C59053a f156934b;

    /* renamed from: c */
    private final C59021e f156935c;

    /* renamed from: d */
    private final C59010ae f156936d;

    public C59022f() {
        C59020d dVar = (C59020d) m91251p(C59020d.class, "flogger.backend_factory");
        this.f156933a = dVar == null ? C59023g.f156937a : dVar;
        C59053a aVar = (C59053a) m91251p(C59053a.class, "flogger.logging_context");
        this.f156934b = aVar == null ? C59055c.f156977a : aVar;
        C59021e eVar = (C59021e) m91251p(C59021e.class, "flogger.clock");
        this.f156935c = eVar == null ? C59027k.f156939a : eVar;
        this.f156936d = C59026j.f156938a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        com.google.common.p4526f.p4534f.C59085f.m91354a("cannot call expected no-argument constructor or static method '%s': %s\n", r16, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b A[ExcHandler: Exception (r0v10 'e' java.lang.Exception A[CUSTOM_DECLARE]), PHI: r16 
      PHI: (r16v2 java.lang.String) = (r16v0 java.lang.String), (r16v0 java.lang.String), (r16v0 java.lang.String), (r16v3 java.lang.String), (r16v0 java.lang.String) binds: [B:17:0x0059, B:40:0x00a6, B:41:?, B:32:0x008a, B:21:0x0063] A[DONT_GENERATE, DONT_INLINE], Splitter:B:17:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:17:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m91251p(java.lang.Class r17, java.lang.String r18) {
        /*
            r1 = r17
            r2 = r18
            java.lang.String r3 = "new "
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            java.lang.String r0 = java.lang.System.getProperty(r2, r6)     // Catch:{ SecurityException -> 0x0010 }
            r8 = r0
            goto L_0x001e
        L_0x0010:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r7] = r2
            r0[r5] = r8
            java.lang.String r8 = "cannot read property name %s: %s"
            com.google.common.p4526f.p4534f.C59085f.m91354a(r8, r0)
            r8 = r6
        L_0x001e:
            if (r8 != 0) goto L_0x0023
        L_0x0020:
            r0 = r6
            goto L_0x00d5
        L_0x0023:
            r0 = 35
            int r10 = r8.indexOf(r0)
            r11 = -1
            if (r10 != r11) goto L_0x002e
            r12 = r8
            goto L_0x0033
        L_0x002e:
            java.lang.String r0 = r8.substring(r7, r10)
            r12 = r0
        L_0x0033:
            java.lang.String r13 = "getInstance"
            if (r10 != r11) goto L_0x0039
            r14 = r13
            goto L_0x0040
        L_0x0039:
            int r0 = r10 + 1
            java.lang.String r0 = r8.substring(r0)
            r14 = r0
        L_0x0040:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r15 = "#"
            r0.append(r15)
            r0.append(r14)
            java.lang.String r15 = "()"
            r0.append(r15)
            java.lang.String r16 = r0.toString()
            java.lang.Class r9 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x00bd, Exception -> 0x009b }
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x0071 }
            java.lang.reflect.Method r0 = r9.getMethod(r14, r0)     // Catch:{ NoSuchMethodException -> 0x0071 }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x006e, Exception -> 0x009b }
            java.lang.Object r0 = r0.invoke(r6, r5)     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x006e, Exception -> 0x009b }
            java.lang.Object r0 = r1.cast(r0)     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x006e, Exception -> 0x009b }
            goto L_0x00d5
        L_0x006e:
            r0 = move-exception
            r5 = 1
            goto L_0x00be
        L_0x0071:
            r0 = move-exception
            if (r10 == r11) goto L_0x00a1
            boolean r5 = r14.equals(r13)     // Catch:{  }
            if (r5 != 0) goto L_0x007b
            goto L_0x00a1
        L_0x007b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{  }
            r0.<init>(r3)     // Catch:{  }
            r0.append(r12)     // Catch:{  }
            r0.append(r15)     // Catch:{  }
            java.lang.String r16 = r0.toString()     // Catch:{  }
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x009d, Exception -> 0x009b }
            java.lang.reflect.Constructor r0 = r9.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x009d, Exception -> 0x009b }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x009d, Exception -> 0x009b }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x009d, Exception -> 0x009b }
            java.lang.Object r0 = r1.cast(r0)     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x009d, Exception -> 0x009b }
            goto L_0x00d5
        L_0x009b:
            r0 = move-exception
            goto L_0x00af
        L_0x009d:
            r0 = move-exception
            r3 = 3
            r5 = 1
            goto L_0x00bf
        L_0x00a1:
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{  }
            r3[r7] = r8     // Catch:{  }
            r5 = 1
            r3[r5] = r0     // Catch:{ ClassNotFoundException -> 0x00d2, ClassCastException -> 0x00bd, Exception -> 0x009b }
            java.lang.String r0 = "method '%s' does not exist: %s\n"
            com.google.common.p4526f.p4534f.C59085f.m91354a(r0, r3)     // Catch:{  }
            goto L_0x0020
        L_0x00af:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r3[r7] = r16
            r5 = 1
            r3[r5] = r0
            java.lang.String r0 = "cannot call expected no-argument constructor or static method '%s': %s\n"
            com.google.common.p4526f.p4534f.C59085f.m91354a(r0, r3)
            goto L_0x0020
        L_0x00bd:
            r0 = move-exception
        L_0x00be:
            r3 = 3
        L_0x00bf:
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r7] = r16
            java.lang.String r3 = r17.getName()
            r8[r5] = r3
            r8[r4] = r0
            java.lang.String r0 = "cannot cast result of calling '%s' to '%s': %s\n"
            com.google.common.p4526f.p4534f.C59085f.m91354a(r0, r8)
            goto L_0x0020
        L_0x00d2:
            goto L_0x0020
        L_0x00d5:
            if (r0 == 0) goto L_0x00d8
            return r0
        L_0x00d8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ServiceLoader r3 = java.util.ServiceLoader.load(r17)
            java.util.Iterator r3 = r3.iterator()
        L_0x00e5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00f3
            java.lang.Object r5 = r3.next()
            r0.add(r5)
            goto L_0x00e5
        L_0x00f3:
            int r3 = r0.size()
            if (r3 == 0) goto L_0x0116
            r5 = 1
            if (r3 == r5) goto L_0x0111
            java.io.PrintStream r3 = java.lang.System.err
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r1 = r17.getName()
            r8[r7] = r1
            r8[r5] = r0
            r8[r4] = r2
            java.lang.String r0 = "Multiple implementations of service %s found on the classpath: %s%nEnsure only the service implementation you want to use is included on the classpath or else specify the service class at startup with the '%s' system property. The default implementation will be used instead.%n"
            r3.printf(r0, r8)
            return r6
        L_0x0111:
            java.lang.Object r0 = r0.get(r7)
            return r0
        L_0x0116:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4526f.p4528b.p4530b.C59022f.m91251p(java.lang.Class, java.lang.String):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo56277c() {
        return this.f156935c.mo56290a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C59033h mo56248e(String str) {
        return this.f156933a.mo56289a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C59010ae mo56249h() {
        return this.f156936d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C59053a mo56250j() {
        return this.f156934b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo56251m() {
        String name = getClass().getName();
        String obj = this.f156933a.toString();
        String obj2 = this.f156935c.toString();
        String valueOf = String.valueOf(this.f156934b);
        return "Platform: " + name + "\nBackendFactory: " + obj + "\nClock: " + obj2 + "\nContextDataProvider: " + valueOf + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
