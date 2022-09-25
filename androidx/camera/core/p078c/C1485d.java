package androidx.camera.core.p078c;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.core.c.d */
/* compiled from: PG */
public final /* synthetic */ class C1485d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1488g f4082a;

    public /* synthetic */ C1485d(C1488g gVar) {
        this.f4082a = gVar;
    }

    public final void run() {
        C1488g gVar = this.f4082a;
        C1496o oVar = gVar.f4093g;
        if (oVar != null) {
            new AtomicReference();
            synchronized (oVar.f4111a) {
            }
            gVar.f4093g = null;
        }
    }
}
