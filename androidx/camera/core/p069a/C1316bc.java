package androidx.camera.core.p069a;

import androidx.p104d.p105a.C2164c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.a.bc */
/* compiled from: PG */
public final /* synthetic */ class C1316bc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Executor f3783a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f3784b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f3785c;

    public /* synthetic */ C1316bc(Executor executor, C60870cx cxVar, C2164c cVar) {
        this.f3783a = executor;
        this.f3784b = cxVar;
        this.f3785c = cVar;
    }

    public final void run() {
        this.f3783a.execute(new C1315bb(this.f3784b, this.f3785c));
    }
}
