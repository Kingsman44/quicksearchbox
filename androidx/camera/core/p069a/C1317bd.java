package androidx.camera.core.p069a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.core.a.bd */
/* compiled from: PG */
public final /* synthetic */ class C1317bd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f3786a;

    public /* synthetic */ C1317bd(C60870cx cxVar) {
        this.f3786a = cxVar;
    }

    public final void run() {
        this.f3786a.cancel(true);
    }
}
