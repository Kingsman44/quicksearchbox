package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.databinding.C0118a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26658s;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26681b;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26703c;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26706d;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26718e;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26721h;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26732aa;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26735ad;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26736ae;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26737af;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26739ah;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26740ai;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26741aj;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26756h;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26760l;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26763o;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26764p;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26767s;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26772x;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26778ac;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.t */
/* compiled from: PG */
public final class C26701t implements C26739ah {

    /* renamed from: a */
    public static final C59071e f72779a = C59071e.m91332i("com.google.android.libraries.lens.view.h.b.b.t");

    /* renamed from: b */
    public static final Duration f72780b = Duration.ofSeconds(15);

    /* renamed from: A */
    public int f72781A = 2;

    /* renamed from: B */
    private final C26764p f72782B;

    /* renamed from: C */
    private final C26735ad f72783C;

    /* renamed from: D */
    private C58485gu f72784D;

    /* renamed from: E */
    private C26763o f72785E;

    /* renamed from: F */
    private C26684c f72786F;

    /* renamed from: G */
    private Surface f72787G;

    /* renamed from: H */
    private final CameraCaptureSession.StateCallback f72788H;

    /* renamed from: I */
    private final CameraCaptureSession.CaptureCallback f72789I;

    /* renamed from: c */
    public final Handler f72790c;

    /* renamed from: d */
    public final C26740ai f72791d = C26741aj.m49441h();

    /* renamed from: e */
    public final C26703c f72792e;

    /* renamed from: f */
    public final C26772x f72793f;

    /* renamed from: g */
    public CameraCharacteristics f72794g;

    /* renamed from: h */
    public CameraDevice f72795h;

    /* renamed from: i */
    public C26732aa f72796i;

    /* renamed from: j */
    public CameraCaptureSession f72797j;

    /* renamed from: k */
    public Size f72798k;

    /* renamed from: l */
    public C26736ae f72799l;

    /* renamed from: m */
    public Timer f72800m = null;

    /* renamed from: n */
    public TimerTask f72801n = null;

    /* renamed from: o */
    public boolean f72802o;

    /* renamed from: p */
    public C58833ax f72803p;

    /* renamed from: q */
    public C58833ax f72804q;

    /* renamed from: r */
    public C58833ax f72805r;

    /* renamed from: s */
    public C58833ax f72806s;

    /* renamed from: t */
    public float f72807t;

    /* renamed from: u */
    public float f72808u;

    /* renamed from: v */
    public C58833ax f72809v;

    /* renamed from: w */
    public final CameraDevice.StateCallback f72810w;

    /* renamed from: x */
    final C26681b f72811x;

    /* renamed from: y */
    public final C26658s f72812y;

    /* renamed from: z */
    public C26778ac f72813z;

    public C26701t(C26772x xVar, C26764p pVar, C26658s sVar, C26735ad adVar) {
        C58836b bVar = C58836b.f156633a;
        this.f72803p = bVar;
        this.f72804q = bVar;
        this.f72805r = bVar;
        this.f72806s = bVar;
        this.f72807t = 1.0f;
        this.f72809v = bVar;
        this.f72810w = new C26692k(this);
        this.f72788H = new C26694m(this);
        this.f72789I = new C26695n(this);
        C26696o oVar = new C26696o(this);
        this.f72811x = oVar;
        this.f72793f = xVar;
        this.f72782B = pVar;
        this.f72812y = sVar;
        this.f72783C = adVar;
        Handler a = C26718e.m49396a();
        this.f72790c = a;
        this.f72792e = C26706d.m49349a(oVar, a);
    }

    /* renamed from: a */
    public final void mo32005a() {
        this.f72796i = null;
        this.f72785E = null;
        this.f72786F = null;
        CameraCaptureSession cameraCaptureSession = this.f72797j;
        if (cameraCaptureSession != null) {
            this.f72797j = null;
            cameraCaptureSession.close();
        }
        CameraDevice cameraDevice = this.f72795h;
        this.f72795h = null;
        if (cameraDevice != null) {
            cameraDevice.close();
        }
        mo32007e();
        Surface surface = this.f72787G;
        if (surface != null) {
            surface.release();
            this.f72787G = null;
        }
        C26736ae aeVar = this.f72799l;
        if (aeVar != null) {
            aeVar.release();
            this.f72799l.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            this.f72799l = null;
        }
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("LensCamera2");
        C26721h.m49398b(eVar, this.f72790c);
        try {
            C26721h.m49397a(this.f72790c, new C26689h(this, eVar), Duration.ofSeconds(1));
        } catch (Exception e) {
            C0118a.m110r(f72779a.mo56225c(), "Exception while waiting for camera thread", 49099, e, C58979ad.MEDIUM);
        }
    }

    /* renamed from: d */
    public final String mo31974d() {
        return "LensCamera2";
    }

    /* renamed from: e */
    public final void mo32007e() {
        TimerTask timerTask = this.f72801n;
        if (timerTask != null) {
            timerTask.cancel();
            this.f72801n = null;
        }
        Timer timer = this.f72800m;
        if (timer != null) {
            timer.cancel();
            this.f72800m = null;
        }
    }

    /* renamed from: f */
    public final void mo32008f(String str) {
        if (!mo32012p()) {
            C59052c cVar = (C59052c) f72779a.mo56226d();
            cVar.mo56378ag(C38505d.f101864b, 153018740);
            ((C59052c) cVar.mo56372aa(49102)).mo56389s("%s called off camera thread", str);
        }
    }

    /* renamed from: g */
    public final void mo32009g(Exception exc) {
        if (this.f72781A == 1) {
            this.f72792e.mo32016d(exc);
        }
    }

    /* renamed from: h */
    public final void mo32010h() {
        boolean z;
        Float f;
        C26684c cVar = this.f72786F;
        if (cVar != null && this.f72797j != null) {
            try {
                C26741aj a = this.f72791d.mo32065a();
                cVar.f72757c.f72754a.set(CaptureRequest.CONTROL_AF_MODE, 4);
                int[] iArr = (int[]) cVar.f72755a.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
                if (iArr != null) {
                    int length = iArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (iArr[i] == 1) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                z = false;
                if (z) {
                    cVar.f72757c.f72754a.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                }
                cVar.f72756b.mo31942g(z);
                boolean f2 = a.mo32074f();
                Boolean bool = (Boolean) cVar.f72755a.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                if (bool != null) {
                    if (bool.booleanValue()) {
                        int i2 = true != f2 ? 0 : 2;
                        cVar.f72757c.f72754a.set(CaptureRequest.FLASH_MODE, Integer.valueOf(i2));
                    }
                }
                Range b = a.mo32070b();
                Range[] rangeArr = (Range[]) cVar.f72755a.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null) {
                    C58485gu l = C58485gu.m89844l(rangeArr);
                    cVar.f72756b.mo31938c(l);
                    Range a2 = C26767s.m49568a(l, ((Integer) b.getLower()).intValue(), ((Integer) b.getUpper()).intValue());
                    if (a2 != null) {
                        cVar.f72757c.f72754a.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a2);
                        cVar.f72756b.mo31939d(a2);
                    }
                }
                float a3 = a.mo32069a();
                if (a3 >= 1.0f) {
                    Rect rect = (Rect) cVar.f72755a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    if (!(rect == null || (f = (Float) cVar.f72755a.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) == null)) {
                        float floatValue = Float.valueOf(Math.min(f.floatValue(), a3)).floatValue();
                        int width = rect.width();
                        int height = rect.height();
                        float f3 = (float) width;
                        int i3 = (int) ((f3 - (f3 / floatValue)) / 2.0f);
                        float f4 = (float) height;
                        int i4 = (int) ((f4 - (f4 / floatValue)) / 2.0f);
                        cVar.f72757c.f72754a.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i3, i4, width - i3, height - i4));
                    }
                }
                C58833ax e = a.mo32073e();
                boolean g = a.mo32075g();
                if (e.mo56113h()) {
                    cVar.f72757c.f72754a.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{(MeteringRectangle) e.mo56107c()});
                    if (g) {
                        cVar.f72757c.f72754a.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{(MeteringRectangle) e.mo56107c()});
                    }
                }
                CaptureRequest build = cVar.f72757c.f72754a.build();
                CameraCaptureSession cameraCaptureSession = this.f72797j;
                cameraCaptureSession.getClass();
                cameraCaptureSession.setRepeatingRequest(build, this.f72789I, this.f72790c);
                this.f72792e.mo32015b();
            } catch (CameraAccessException e2) {
                ((C59052c) ((C59052c) ((C59052c) f72779a.mo56225c()).mo56382g(e2)).mo56372aa(49106)).mo56386p("Failed to update repeating request.");
            }
        }
    }

    /* renamed from: i */
    public final void mo31979i(boolean z) {
        this.f72790c.post(new C26688g(this, z));
    }

    /* renamed from: j */
    public final void mo31980j(float f) {
        this.f72790c.post(new C26687f(this, f));
    }

    /* renamed from: k */
    public final void mo32011k() {
        C26763o oVar;
        C26778ac acVar = this.f72813z;
        if (acVar != null && (oVar = this.f72785E) != null) {
            acVar.f72961a.mo32153v(oVar);
        }
    }

    /* renamed from: l */
    public final void mo31982l(C26778ac acVar) {
        this.f72790c.post(new C26685d(this, acVar));
    }

    /* renamed from: m */
    public final /* synthetic */ void mo31983m() {
    }

    /* renamed from: n */
    public final void mo31984n(PointF pointF) {
        this.f72790c.post(new C26686e(this, pointF));
    }

    /* renamed from: o */
    public final void mo31985o(int i) {
        this.f72790c.post(new C26691j(this, i));
    }

    /* renamed from: p */
    public final boolean mo32012p() {
        return Looper.myLooper() == this.f72790c.getLooper();
    }

    /* renamed from: q */
    public final void mo32013q(MeteringRectangle meteringRectangle) {
        ((C26760l) this.f72791d).f72927a = C58833ax.m90834k(meteringRectangle);
        C26740ai aiVar = this.f72791d;
        CameraCharacteristics cameraCharacteristics = this.f72794g;
        cameraCharacteristics.getClass();
        aiVar.mo32067c(C26682a.m49309i(cameraCharacteristics));
        mo32010h();
    }

    /* renamed from: b */
    public final void mo32006b() {
        this.f72797j = null;
        if (this.f72798k == null || this.f72784D == null) {
            CameraCharacteristics cameraCharacteristics = this.f72794g;
            cameraCharacteristics.getClass();
            C58485gu l = C58485gu.m89844l(C26682a.m49311k(cameraCharacteristics));
            this.f72784D = l;
            this.f72798k = C26735ad.m49424a(l, this.f72783C.mo32057b());
        }
        Size size = this.f72798k;
        size.getClass();
        this.f72799l = C26737af.m49428a(size, new C26690i(this), this.f72790c);
        C26756h hVar = new C26756h();
        CameraCharacteristics cameraCharacteristics2 = this.f72794g;
        cameraCharacteristics2.getClass();
        hVar.mo32094d(C26682a.m49303c(cameraCharacteristics2));
        CameraCharacteristics cameraCharacteristics3 = this.f72794g;
        cameraCharacteristics3.getClass();
        hVar.mo32093c(C26682a.m49302b(cameraCharacteristics3));
        Size size2 = this.f72798k;
        size2.getClass();
        hVar.f72896a = size2;
        C58485gu guVar = this.f72784D;
        guVar.getClass();
        hVar.f72897b = guVar;
        hVar.mo32092b(this.f72793f.mo32142f());
        C26736ae aeVar = this.f72799l;
        aeVar.getClass();
        hVar.f72898c = aeVar;
        this.f72785E = hVar.mo32091a();
        mo32011k();
        C26764p pVar = this.f72782B;
        C58485gu guVar2 = this.f72784D;
        guVar2.getClass();
        pVar.mo31937b(guVar2);
        C26764p pVar2 = this.f72782B;
        Size size3 = this.f72798k;
        size3.getClass();
        pVar2.mo31943h(size3);
        C26764p pVar3 = this.f72782B;
        String e = this.f72793f.mo32141e();
        e.getClass();
        pVar3.mo31941f(e);
        this.f72782B.mo31948m(true != this.f72793f.mo32142f() ? 3 : 2);
        this.f72782B.mo31936a();
        ArrayList arrayList = new ArrayList();
        C26736ae aeVar2 = this.f72799l;
        aeVar2.getClass();
        Surface surface = new Surface(aeVar2);
        this.f72787G = surface;
        arrayList.add(surface);
        CameraDevice cameraDevice = this.f72795h;
        cameraDevice.getClass();
        try {
            cameraDevice.createCaptureSession(arrayList, this.f72788H, this.f72790c);
            CameraCharacteristics b = this.f72793f.mo32138b();
            b.getClass();
            Surface surface2 = this.f72787G;
            surface2.getClass();
            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(1);
            createCaptureRequest.addTarget(surface2);
            this.f72786F = new C26684c(b, new C26683b(createCaptureRequest), this.f72782B);
        } catch (CameraAccessException e2) {
            ((C59052c) ((C59052c) ((C59052c) f72779a.mo56226d()).mo56382g(e2)).mo56372aa(49094)).mo56386p("Failed to create camera capture session.");
            mo32005a();
            mo32009g(e2);
        }
    }
}
