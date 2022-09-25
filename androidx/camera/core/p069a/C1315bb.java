package androidx.camera.core.p069a;

import androidx.p104d.p105a.C2164c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.camera.core.a.bb */
/* compiled from: PG */
public final /* synthetic */ class C1315bb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f3781a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f3782b;

    public /* synthetic */ C1315bb(C60870cx cxVar, C2164c cVar) {
        this.f3781a = cxVar;
        this.f3782b = cVar;
    }

    public final void run() {
        C60870cx cxVar = this.f3781a;
        C2164c cVar = this.f3782b;
        if (!cxVar.isDone()) {
            cVar.mo5439d(new TimeoutException("Cannot complete surfaceList within 5000"));
            cxVar.cancel(true);
        }
    }
}
