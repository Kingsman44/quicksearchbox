package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.gw */
/* compiled from: PG */
final class C145405gw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f393108a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393109b;

    public C145405gw(C145416hg hgVar, AtomicReference atomicReference) {
        this.f393109b = hgVar;
        this.f393108a = atomicReference;
    }

    public final void run() {
        String str;
        synchronized (this.f393108a) {
            try {
                AtomicReference atomicReference = this.f393108a;
                C145416hg hgVar = this.f393109b;
                C145222ab abVar = hgVar.f393011w.f392937g;
                String e = hgVar.f393011w.mo120969d().mo120874e();
                C145312dk dkVar = C145313dl.f392704K;
                if (e == null) {
                    str = (String) dkVar.mo120854a((Object) null);
                } else {
                    str = (String) dkVar.mo120854a(abVar.f392550a.mo120764a(e, dkVar.f392688a));
                }
                atomicReference.set(str);
                this.f393108a.notify();
            } catch (Throwable th) {
                this.f393108a.notify();
                throw th;
            }
        }
    }
}
