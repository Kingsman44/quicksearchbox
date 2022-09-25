package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Range;
import android.util.Size;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26658s;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26681b;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26703c;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26706d;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26718e;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26721h;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26723j;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26732aa;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26735ad;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26736ae;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26739ah;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26740ai;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26741aj;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26760l;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26763o;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26764p;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26767s;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26772x;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26778ac;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.q */
/* compiled from: PG */
public final class C26679q implements C26739ah {

    /* renamed from: a */
    public static final C58974d f72726a = C58974d.m91135i("LensCamera1Exp");

    /* renamed from: b */
    public static final Duration f72727b = Duration.ofSeconds(15);

    /* renamed from: c */
    public static final Camera.Area f72728c = new Camera.Area(C26665c.f72705a, 1);

    /* renamed from: A */
    private final C26681b f72729A;

    /* renamed from: d */
    public final Handler f72730d;

    /* renamed from: e */
    public final C26740ai f72731e = C26741aj.m49441h();

    /* renamed from: f */
    public final C26764p f72732f;

    /* renamed from: g */
    public final C26735ad f72733g;

    /* renamed from: h */
    public final C26703c f72734h;

    /* renamed from: i */
    public final int f72735i;

    /* renamed from: j */
    public final boolean f72736j;

    /* renamed from: k */
    public boolean f72737k = false;

    /* renamed from: l */
    public Camera f72738l;

    /* renamed from: m */
    public Size f72739m;

    /* renamed from: n */
    public C26736ae f72740n;

    /* renamed from: o */
    public C26663a f72741o;

    /* renamed from: p */
    public C26763o f72742p;

    /* renamed from: q */
    public C26732aa f72743q;

    /* renamed from: r */
    public Exception f72744r;

    /* renamed from: s */
    public boolean f72745s = false;

    /* renamed from: t */
    public C58833ax f72746t = C58836b.f156633a;

    /* renamed from: u */
    public Timer f72747u = null;

    /* renamed from: v */
    public TimerTask f72748v = null;

    /* renamed from: w */
    public final C26658s f72749w;

    /* renamed from: x */
    public C26778ac f72750x;

    /* renamed from: y */
    public int f72751y = 2;

    /* renamed from: z */
    public int f72752z = 1;

    public C26679q(C26772x xVar, C26764p pVar, C26658s sVar, C26735ad adVar) {
        C26676n nVar = new C26676n(this);
        this.f72729A = nVar;
        boolean f = xVar.mo32142f();
        this.f72736j = f;
        this.f72732f = pVar;
        this.f72749w = sVar;
        this.f72733g = adVar;
        Integer e = C26665c.m49277e(f);
        e.getClass();
        this.f72735i = e.intValue();
        Handler a = C26718e.m49396a();
        this.f72730d = a;
        this.f72734h = C26706d.m49349a(nVar, a);
        this.f72746t = C26665c.m49274b();
    }

    /* renamed from: a */
    public final int mo31972a() {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f72735i, cameraInfo);
        return cameraInfo.orientation;
    }

    /* renamed from: b */
    public final Camera.Parameters mo31973b() {
        C26663a aVar = this.f72741o;
        aVar.getClass();
        return aVar.f72701a;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("LensCamera1Exp");
        C26721h.m49398b(eVar, this.f72730d);
        try {
            C26721h.m49397a(this.f72730d, C47810es.m84977q(new C26671i(this, eVar)), Duration.ofSeconds(1));
        } catch (Exception e) {
            C58970a aVar = (C58970a) f72726a.mo56225c();
            aVar.mo56380ai(C58979ad.MEDIUM);
            ((C58970a) ((C58970a) aVar.mo56382g(e)).mo56372aa(49048)).mo56386p("Exception while waiting for camera thread");
        }
    }

    /* renamed from: d */
    public final String mo31974d() {
        return "LensCamera1Exp";
    }

    /* renamed from: e */
    public final void mo31975e() {
        C26736ae aeVar = this.f72740n;
        if (aeVar != null) {
            aeVar.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            this.f72740n.release();
            this.f72740n = null;
        }
    }

    /* renamed from: f */
    public final void mo31976f() {
        TimerTask timerTask = this.f72748v;
        if (timerTask != null) {
            timerTask.cancel();
            this.f72748v = null;
        }
        Timer timer = this.f72747u;
        if (timer != null) {
            timer.cancel();
            this.f72747u = null;
        }
    }

    /* renamed from: g */
    public final void mo31977g() {
        List<Integer> zoomRatios;
        int i = this.f72752z;
        if (i == 3) {
            this.f72752z = 4;
        } else if (i != 4) {
            return;
        }
        C26663a aVar = this.f72741o;
        aVar.getClass();
        C26741aj a = this.f72731e.mo32065a();
        List<String> supportedFocusModes = aVar.f72701a.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            String str = "continuous-picture";
            if (!supportedFocusModes.contains(str)) {
                str = "auto";
                if (!supportedFocusModes.contains(str)) {
                    str = null;
                }
            }
            if (str != null) {
                aVar.f72701a.setFocusMode(str);
            }
        }
        if (aVar.f72701a.get("phase-af") != null) {
            aVar.f72701a.set("phase-af", "on");
        }
        boolean f = a.mo32074f();
        List<String> supportedFlashModes = aVar.f72701a.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            String str2 = "torch";
            if (!f ? supportedFlashModes.contains("off") : supportedFlashModes.contains(str2)) {
                if (true != f) {
                    str2 = "off";
                }
                aVar.f72701a.setFlashMode(str2);
            }
        }
        Range b = a.mo32070b();
        List<int[]> supportedPreviewFpsRange = aVar.f72701a.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            C58480gp e = C58485gu.m89837e();
            for (int[] next : supportedPreviewFpsRange) {
                e.mo55395g(new Range(Integer.valueOf(next[0]), Integer.valueOf(next[1])));
            }
            C58485gu f2 = e.mo55394f();
            aVar.f72702b.mo31938c(f2);
            Range a2 = C26767s.m49568a(f2, ((Integer) b.getLower()).intValue() * 1000, ((Integer) b.getUpper()).intValue() * 1000);
            if (a2 != null) {
                aVar.f72701a.setPreviewFpsRange(((Integer) a2.getLower()).intValue(), ((Integer) a2.getUpper()).intValue());
                aVar.f72702b.mo31939d(a2);
            }
        }
        Size c = a.mo32071c();
        aVar.f72701a.setPreviewSize(c.getWidth(), c.getHeight());
        float a3 = a.mo32069a();
        if (aVar.f72701a.isZoomSupported() && a3 >= 1.0f && (zoomRatios = aVar.f72701a.getZoomRatios()) != null && !zoomRatios.isEmpty()) {
            int size = zoomRatios.size() - 1;
            float f3 = a3 * 100.0f;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                if (((float) zoomRatios.get(i3).intValue()) >= f3) {
                    break;
                }
                i2 = i3;
            }
            aVar.f72701a.setZoom(i2);
        }
        C58833ax d = a.mo32072d();
        boolean g = a.mo32075g();
        if (d.mo56113h()) {
            aVar.f72701a.setFocusAreas(Arrays.asList(new Camera.Area[]{(Camera.Area) d.mo56107c()}));
            if (g) {
                aVar.f72701a.setMeteringAreas(Arrays.asList(new Camera.Area[]{(Camera.Area) d.mo56107c()}));
            }
        }
        Camera.Parameters parameters = aVar.f72701a;
        try {
            Camera camera = this.f72738l;
            camera.getClass();
            camera.setParameters(parameters);
            if (!this.f72737k) {
                Camera camera2 = this.f72738l;
                camera2.getClass();
                camera2.startPreview();
                this.f72737k = true;
            }
            this.f72734h.mo32015b();
            this.f72744r = null;
        } catch (RuntimeException e2) {
            throw new C26723j("Failed to set camera parameters with ".concat(String.valueOf(parameters.flatten())), e2);
        }
    }

    /* renamed from: h */
    public final void mo31978h() {
        C26763o oVar;
        C26778ac acVar = this.f72750x;
        if (acVar != null && (oVar = this.f72742p) != null) {
            acVar.f72961a.mo32153v(oVar);
        }
    }

    /* renamed from: i */
    public final void mo31979i(boolean z) {
        this.f72730d.post(C47810es.m84977q(new C26670h(this, z)));
    }

    /* renamed from: j */
    public final void mo31980j(float f) {
        this.f72730d.post(C47810es.m84977q(new C26672j(this, f)));
    }

    /* renamed from: k */
    public final void mo31981k() {
        int i = this.f72751y;
        if (i == 1) {
            int i2 = this.f72752z;
            if (i2 == 1) {
                this.f72752z = 2;
                this.f72734h.mo32014a();
            } else if (i2 == 2) {
                m49281q();
            } else if (i2 == 3) {
                try {
                    mo31977g();
                } catch (RuntimeException e) {
                    this.f72744r = e;
                    m49281q();
                }
            }
        } else if (i == 2 && this.f72752z != 1) {
            this.f72734h.mo32015b();
            this.f72744r = null;
            this.f72742p = null;
            this.f72743q = null;
            this.f72737k = false;
            Camera camera = this.f72738l;
            if (camera != null) {
                camera.release();
                this.f72738l = null;
            }
            mo31976f();
            mo31975e();
            this.f72752z = 1;
        }
    }

    /* renamed from: l */
    public final void mo31982l(C26778ac acVar) {
        this.f72730d.post(C47810es.m84977q(new C26667e(this, acVar)));
    }

    /* renamed from: m */
    public final /* synthetic */ void mo31983m() {
    }

    /* renamed from: n */
    public final void mo31984n(PointF pointF) {
        this.f72730d.post(C47810es.m84977q(new C26669g(this, pointF)));
    }

    /* renamed from: o */
    public final void mo31985o(int i) {
        this.f72730d.post(C47810es.m84977q(new C26668f(this, i)));
    }

    /* renamed from: p */
    public final void mo31986p(Camera.Area area) {
        ((C26760l) this.f72731e).f72928b = C58833ax.m90834k(area);
        this.f72731e.mo32067c(C26665c.m49279g(mo31973b()));
        mo31977g();
    }

    /* renamed from: q */
    private final void m49281q() {
        C26703c cVar = this.f72734h;
        Exception exc = this.f72744r;
        exc.getClass();
        cVar.mo32016d(exc);
    }
}
