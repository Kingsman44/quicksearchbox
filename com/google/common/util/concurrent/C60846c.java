package com.google.common.util.concurrent;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.c */
/* compiled from: PG */
public abstract class C60846c extends C60837br implements Runnable {

    /* renamed from: a */
    C60870cx f164927a;

    /* renamed from: b */
    Class f164928b;

    /* renamed from: c */
    Object f164929c;

    public C60846c(C60870cx cxVar, Class cls, Object obj) {
        cxVar.getClass();
        this.f164927a = cxVar;
        this.f164928b = cls;
        obj.getClass();
        this.f164929c = obj;
    }

    /* renamed from: g */
    public static C60870cx m92878g(C60870cx cxVar, Class cls, C58817ah ahVar, Executor executor) {
        C60819b bVar = new C60819b(cxVar, cls, ahVar);
        cxVar.mo4106b(bVar, C60895di.m92997c(executor, bVar));
        return bVar;
    }

    /* renamed from: h */
    public static C60870cx m92879h(C60870cx cxVar, Class cls, C60931s sVar, Executor executor) {
        C60791a aVar = new C60791a(cxVar, cls, sVar);
        cxVar.mo4106b(aVar, C60895di.m92997c(executor, aVar));
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        mo57355m(this.f164927a);
        this.f164927a = null;
        this.f164928b = null;
        this.f164929c = null;
    }

    /* renamed from: e */
    public abstract Object mo57250e(Object obj, Throwable th);

    /* renamed from: f */
    public abstract void mo57251f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        String str;
        C60870cx cxVar = this.f164927a;
        Class cls = this.f164928b;
        Object obj = this.f164929c;
        String hT = super.mo45912hT();
        if (cxVar != null) {
            str = "inputFuture=[" + cxVar + "], ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
        } else if (hT != null) {
            return str.concat(hT);
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.common.util.concurrent.cx r0 = r8.f164927a
            java.lang.Class r1 = r8.f164928b
            java.lang.Object r2 = r8.f164929c
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x009c
            boolean r3 = r8.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x009c
        L_0x0022:
            r3 = 0
            r8.f164927a = r3
            boolean r4 = r0 instanceof com.google.common.util.concurrent.p4579a.C60792a     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.common.util.concurrent.a.a r4 = (com.google.common.util.concurrent.p4579a.C60792a) r4     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            java.lang.Throwable r4 = r4.mo57252k()     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003c
            java.lang.Object r5 = com.google.common.util.concurrent.C60856cj.m92909r(r0)     // Catch:{ ExecutionException -> 0x003e, RuntimeException -> 0x003b, Error -> 0x0039 }
            goto L_0x006f
        L_0x0039:
            r4 = move-exception
            goto L_0x003c
        L_0x003b:
            r4 = move-exception
        L_0x003c:
            r5 = r3
            goto L_0x006f
        L_0x003e:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x006d
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Future type "
            r6.<init>(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.String r7 = " threw "
            r6.append(r7)
            java.lang.Class r4 = r4.getClass()
            r6.append(r4)
            java.lang.String r4 = " without a cause"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
        L_0x006d:
            r4 = r5
            goto L_0x003c
        L_0x006f:
            if (r4 != 0) goto L_0x0075
            r8.mo57356n(r5)
            return
        L_0x0075:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x0099
            java.lang.Object r0 = r8.mo57250e(r2, r4)     // Catch:{ all -> 0x0087 }
            r8.f164928b = r3
            r8.f164929c = r3
            r8.mo57251f(r0)
            return
        L_0x0087:
            r0 = move-exception
            com.google.common.util.concurrent.C60896dj.m92998a(r0)     // Catch:{ all -> 0x0093 }
            r8.mo57357o(r0)     // Catch:{ all -> 0x0093 }
            r8.f164928b = r3
            r8.f164929c = r3
            return
        L_0x0093:
            r0 = move-exception
            r8.f164928b = r3
            r8.f164929c = r3
            throw r0
        L_0x0099:
            r8.mo57358p(r0)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60846c.run():void");
    }
}
