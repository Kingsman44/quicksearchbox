package androidx.camera.core;

import android.os.Handler;
import androidx.camera.camera2.p068c.C1232h;
import androidx.camera.core.p069a.C1287aa;
import androidx.camera.core.p069a.C1289ac;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1307au;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1348ch;
import androidx.camera.core.p069a.C1367d;
import androidx.camera.core.p069a.C1375dh;
import androidx.camera.core.p073b.C1450m;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.ad */
/* compiled from: PG */
public final class C1403ad implements C1450m {

    /* renamed from: a */
    public static final C1306at f3943a = new C1367d("camerax.core.appConfig.cameraFactoryProvider", C1289ac.class, (Object) null);

    /* renamed from: b */
    public static final C1306at f3944b = new C1367d("camerax.core.appConfig.deviceSurfaceManagerProvider", C1287aa.class, (Object) null);

    /* renamed from: c */
    public static final C1306at f3945c = new C1367d("camerax.core.appConfig.useCaseConfigFactoryProvider", C1375dh.class, (Object) null);

    /* renamed from: d */
    static final C1306at f3946d = new C1367d("camerax.core.appConfig.cameraExecutor", Executor.class, (Object) null);

    /* renamed from: e */
    static final C1306at f3947e = new C1367d("camerax.core.appConfig.schedulerHandler", Handler.class, (Object) null);

    /* renamed from: f */
    static final C1306at f3948f = new C1367d("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, (Object) null);

    /* renamed from: g */
    static final C1306at f3949g = new C1367d("camerax.core.appConfig.availableCamerasLimiter", C1570t.class, (Object) null);

    /* renamed from: h */
    public final C1343cc f3950h;

    public C1403ad(C1343cc ccVar) {
        this.f3950h = ccVar;
    }

    /* renamed from: C */
    public final /* synthetic */ C1307au mo3951C(C1306at atVar) {
        return C1348ch.m3673a(this, atVar);
    }

    /* renamed from: D */
    public final C1308av mo3952D() {
        return this.f3950h;
    }

    /* renamed from: E */
    public final /* synthetic */ Object mo3953E(C1306at atVar) {
        return C1348ch.m3674b(this, atVar);
    }

    /* renamed from: F */
    public final /* synthetic */ Object mo3954F(C1306at atVar, Object obj) {
        return C1348ch.m3675c(this, atVar, obj);
    }

    /* renamed from: G */
    public final /* synthetic */ Object mo3955G(C1306at atVar, C1307au auVar) {
        return C1348ch.m3676d(this, atVar, auVar);
    }

    /* renamed from: g */
    public final /* synthetic */ String mo3957g(String str) {
        throw null;
    }

    /* renamed from: h */
    public final /* synthetic */ Set mo3958h(C1306at atVar) {
        return C1348ch.m3677e(this, atVar);
    }

    /* renamed from: i */
    public final /* synthetic */ Set mo3959i() {
        return C1348ch.m3678f(this);
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo3960j(C1306at atVar) {
        return C1348ch.m3679g(this, atVar);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo3961k(C1232h hVar) {
        C1348ch.m3680h(this, hVar);
    }
}
