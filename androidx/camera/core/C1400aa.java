package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import androidx.camera.core.p069a.C1288ab;
import androidx.camera.core.p069a.C1290ad;
import androidx.camera.core.p069a.C1293ag;
import androidx.camera.core.p069a.C1336bw;
import androidx.camera.core.p069a.C1348ch;
import androidx.camera.core.p069a.C1376di;
import androidx.camera.core.p069a.p070a.C1274e;
import androidx.camera.lifecycle.C1580d;
import androidx.camera.lifecycle.C1584h;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.aa */
/* compiled from: PG */
public final class C1400aa {

    /* renamed from: l */
    private static final Object f3927l = new Object();

    /* renamed from: m */
    private static final SparseArray f3928m = new SparseArray();

    /* renamed from: a */
    public final C1293ag f3929a = new C1293ag();

    /* renamed from: b */
    public final Object f3930b = new Object();

    /* renamed from: c */
    public final C1403ad f3931c;

    /* renamed from: d */
    public final Executor f3932d;

    /* renamed from: e */
    public final Handler f3933e;

    /* renamed from: f */
    public C1290ad f3934f;

    /* renamed from: g */
    public C1288ab f3935g;

    /* renamed from: h */
    public C1376di f3936h;

    /* renamed from: i */
    public Context f3937i;

    /* renamed from: j */
    public final C60870cx f3938j;

    /* renamed from: k */
    public int f3939k;

    /* renamed from: n */
    private final HandlerThread f3940n;

    /* renamed from: o */
    private final Integer f3941o;

    public C1400aa(Context context, C1402ac acVar) {
        Object obj;
        Object obj2;
        C60870cx a;
        boolean z = true;
        this.f3939k = 1;
        if (acVar != null) {
            C1403ad adVar = ((C1580d) acVar).f4324a;
            C1584h hVar = C1584h.f4330a;
            this.f3931c = adVar;
        } else {
            C1402ac b = m3840b(context);
            if (b != null) {
                this.f3931c = b.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        try {
            obj = this.f3931c.f3950h.mo3953E(C1403ad.f3946d);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Executor executor = (Executor) obj;
        try {
            obj2 = this.f3931c.f3950h.mo3953E(C1403ad.f3947e);
        } catch (IllegalArgumentException unused2) {
            obj2 = null;
        }
        Handler handler = (Handler) obj2;
        this.f3932d = executor == null ? new C1567q() : executor;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f3940n = handlerThread;
            handlerThread.start();
            this.f3933e = Handler.createAsync(handlerThread.getLooper());
        } else {
            this.f3940n = null;
            this.f3933e = handler;
        }
        Integer num = (Integer) C1348ch.m3675c(this.f3931c, C1403ad.f3948f, (Object) null);
        this.f3941o = num;
        synchronized (f3927l) {
            if (num != null) {
                C1974i.m5316d(num.intValue(), 3, 6, "minLogLevel");
                SparseArray sparseArray = f3928m;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                if (sparseArray.size() == 0) {
                    C1477bw.f4071a = 3;
                } else if (sparseArray.get(3) != null) {
                    C1477bw.f4071a = 3;
                } else if (sparseArray.get(4) != null) {
                    C1477bw.f4071a = 4;
                } else if (sparseArray.get(5) != null) {
                    C1477bw.f4071a = 5;
                } else if (sparseArray.get(6) != null) {
                    C1477bw.f4071a = 6;
                }
            }
        }
        synchronized (this.f3930b) {
            if (this.f3939k != 1) {
                z = false;
            }
            C1974i.m5315c(z, "CameraX.initInternal() should only be called once per instance");
            this.f3939k = 2;
            a = C2169h.m6027a(new C1576z(this, context));
        }
        this.f3938j = a;
    }

    /* renamed from: b */
    private static C1402ac m3840b(Context context) {
        Application a = C1274e.m3446a(context);
        if (a instanceof C1402ac) {
            return (C1402ac) a;
        }
        try {
            Context b = C1274e.m3447b(context);
            ServiceInfo serviceInfo = b.getPackageManager().getServiceInfo(new ComponentName(b, C1336bw.class), 640);
            String string = serviceInfo.metaData != null ? serviceInfo.metaData.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C1402ac) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            C1477bw.m3980c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            C1477bw.m3981d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo4294a(Executor executor, long j, Context context, C2164c cVar) {
        executor.execute(new C1575y(this, context, executor, cVar, j));
    }
}
