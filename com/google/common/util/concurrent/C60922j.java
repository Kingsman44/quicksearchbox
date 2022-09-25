package com.google.common.util.concurrent;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.j */
/* compiled from: PG */
public abstract class C60922j extends C60837br implements Runnable {

    /* renamed from: a */
    C60870cx f165032a;

    /* renamed from: b */
    Object f165033b;

    public C60922j(C60870cx cxVar, Object obj) {
        cxVar.getClass();
        this.f165032a = cxVar;
        obj.getClass();
        this.f165033b = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        mo57355m(this.f165032a);
        this.f165032a = null;
        this.f165033b = null;
    }

    /* renamed from: e */
    public abstract Object mo57417e(Object obj, Object obj2);

    /* renamed from: f */
    public abstract void mo57418f(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        String str;
        C60870cx cxVar = this.f165032a;
        Object obj = this.f165033b;
        String hT = super.mo45912hT();
        if (cxVar != null) {
            str = "inputFuture=[" + cxVar + "], ";
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        } else if (hT != null) {
            return str.concat(hT);
        } else {
            return null;
        }
    }

    public final void run() {
        C60870cx cxVar = this.f165032a;
        Object obj = this.f165033b;
        boolean z = true;
        boolean isCancelled = isCancelled() | (cxVar == null);
        if (obj != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.f165032a = null;
            if (cxVar.isCancelled()) {
                mo57358p(cxVar);
                return;
            }
            try {
                try {
                    Object e = mo57417e(obj, C60856cj.m92909r(cxVar));
                    this.f165033b = null;
                    mo57418f(e);
                } catch (Throwable th) {
                    this.f165033b = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e2) {
                mo57357o(e2.getCause());
            } catch (RuntimeException e3) {
                mo57357o(e3);
            } catch (Error e4) {
                mo57357o(e4);
            }
        }
    }

    /* renamed from: g */
    public static C60870cx m93044g(C60870cx cxVar, C58817ah ahVar, Executor executor) {
        ahVar.getClass();
        C60921i iVar = new C60921i(cxVar, ahVar);
        cxVar.mo4106b(iVar, C60895di.m92997c(executor, iVar));
        return iVar;
    }

    /* renamed from: h */
    public static C60870cx m93045h(C60870cx cxVar, C60931s sVar, Executor executor) {
        executor.getClass();
        C60920h hVar = new C60920h(cxVar, sVar);
        cxVar.mo4106b(hVar, C60895di.m92997c(executor, hVar));
        return hVar;
    }
}
