package androidx.camera.core;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.core.ax */
/* compiled from: PG */
public final /* synthetic */ class C1423ax implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f3979a;

    public /* synthetic */ C1423ax(C60870cx cxVar) {
        this.f3979a = cxVar;
    }

    public final void run() {
        C60870cx cxVar = this.f3979a;
        int i = C1470bp.f4052o;
        cxVar.cancel(true);
    }
}
