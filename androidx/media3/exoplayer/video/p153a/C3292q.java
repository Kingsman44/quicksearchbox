package androidx.media3.exoplayer.video.p153a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.common.p136b.C2612ak;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.media3.exoplayer.video.a.q */
/* compiled from: PG */
public final class C3292q extends GLSurfaceView {

    /* renamed from: a */
    public final CopyOnWriteArrayList f9906a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Handler f9907b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C3288m f9908c;

    /* renamed from: d */
    public SurfaceTexture f9909d;

    /* renamed from: e */
    public Surface f9910e;

    /* renamed from: f */
    private final SensorManager f9911f;

    /* renamed from: g */
    private final Sensor f9912g;

    /* renamed from: h */
    private final C3280e f9913h;

    /* renamed from: i */
    private final C3294s f9914i;

    /* renamed from: j */
    private boolean f9915j;

    /* renamed from: k */
    private boolean f9916k;

    /* renamed from: l */
    private boolean f9917l;

    public C3292q(Context context) {
        super(context, (AttributeSet) null);
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f9911f = sensorManager;
        int i = C2612ak.f7249a;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f9912g = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C3288m mVar = new C3288m();
        this.f9908c = mVar;
        C3291p pVar = new C3291p(this, mVar);
        C3294s sVar = new C3294s(context, pVar);
        this.f9914i = sVar;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f9913h = new C3280e(windowManager.getDefaultDisplay(), sVar, pVar);
        this.f9915j = true;
        setEGLContextClientVersion(2);
        setRenderer(pVar);
        setOnTouchListener(sVar);
    }

    /* renamed from: a */
    public static void m9544a(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: b */
    private final void m9545b() {
        boolean z = this.f9915j && this.f9916k;
        Sensor sensor = this.f9912g;
        if (sensor != null && z != this.f9917l) {
            if (z) {
                this.f9911f.registerListener(this.f9913h, sensor, 0);
            } else {
                this.f9911f.unregisterListener(this.f9913h);
            }
            this.f9917l = z;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9907b.post(new C3290o(this));
    }

    public final void onPause() {
        this.f9916k = false;
        m9545b();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f9916k = true;
        m9545b();
    }
}
