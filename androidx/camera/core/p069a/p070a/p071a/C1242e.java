package androidx.camera.core.p069a.p070a.p071a;

import android.os.Handler;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.Callable;

/* renamed from: androidx.camera.core.a.a.a.e */
/* compiled from: PG */
final class C1242e implements C2166e {

    /* renamed from: a */
    final /* synthetic */ Handler f3631a;

    /* renamed from: b */
    final /* synthetic */ Callable f3632b;

    /* renamed from: c */
    final /* synthetic */ C1243f f3633c;

    public C1242e(C1243f fVar, Handler handler, Callable callable) {
        this.f3633c = fVar;
        this.f3631a = handler;
        this.f3632b = callable;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        cVar.mo5436a(new C1241d(this), C1238a.m3410a());
        this.f3633c.f3634a.set(cVar);
        return "HandlerScheduledFuture-".concat(String.valueOf(this.f3632b.toString()));
    }
}
