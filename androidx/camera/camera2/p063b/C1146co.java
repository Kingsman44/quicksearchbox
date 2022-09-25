package androidx.camera.camera2.p063b;

import androidx.camera.camera2.p062a.C0990c;
import androidx.camera.camera2.p062a.C0991d;
import androidx.camera.core.C1477bw;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.camera.camera2.b.co */
/* compiled from: PG */
final class C1146co extends C1173do {

    /* renamed from: a */
    final /* synthetic */ C1147cp f3360a;

    public C1146co(C1147cp cpVar) {
        this.f3360a = cpVar;
    }

    /* renamed from: d */
    public final void mo3919d(C1174dp dpVar) {
        synchronized (this.f3360a.f3361a) {
            if (this.f3360a.f3372l != 1) {
                C1477bw.m3978a("CaptureSession", "onSessionFinished()");
                this.f3360a.mo3927h();
            } else {
                throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C1145cn.m3165a(this.f3360a.f3372l));
            }
        }
    }

    /* renamed from: c */
    public final void mo3918c(C1174dp dpVar) {
        synchronized (this.f3360a.f3361a) {
            int i = this.f3360a.f3372l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 != 0) {
                C1477bw.m3978a("CaptureSession", "CameraCaptureSession.onReady() " + C1145cn.m3165a(this.f3360a.f3372l));
            } else {
                throw new IllegalStateException("onReady() should not be possible in state: " + C1145cn.m3165a(this.f3360a.f3372l));
            }
        }
    }

    /* renamed from: a */
    public final void mo3916a(C1174dp dpVar) {
        synchronized (this.f3360a.f3361a) {
            C1147cp cpVar = this.f3360a;
            int i = cpVar.f3372l;
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 4:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C1145cn.m3165a(this.f3360a.f3372l));
                    case 3:
                    case 5:
                    case 6:
                        cpVar.mo3927h();
                        break;
                    case 7:
                        C1477bw.m3978a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                C1477bw.m3980c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C1145cn.m3165a(this.f3360a.f3372l));
            } else {
                throw null;
            }
        }
    }

    /* renamed from: b */
    public final void mo3917b(C1174dp dpVar) {
        synchronized (this.f3360a.f3361a) {
            C1147cp cpVar = this.f3360a;
            int i = cpVar.f3372l;
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + C1145cn.m3165a(this.f3360a.f3372l));
                    case 3:
                        cpVar.f3372l = 5;
                        cpVar.f3363c = dpVar;
                        if (cpVar.f3364d != null) {
                            C0991d a = cpVar.f3366f.mo3745a();
                            ArrayList arrayList = new ArrayList();
                            Iterator it = a.f3140a.iterator();
                            if (it.hasNext()) {
                                C0990c cVar = (C0990c) it.next();
                                throw null;
                            } else if (!arrayList.isEmpty()) {
                                C1147cp cpVar2 = this.f3360a;
                                cpVar2.mo3931l(cpVar2.mo3924e(arrayList));
                            }
                        }
                        C1477bw.m3978a("CaptureSession", "Attempting to send capture request onConfigured");
                        C1147cp cpVar3 = this.f3360a;
                        cpVar3.mo3932m(cpVar3.f3364d);
                        this.f3360a.mo3929j();
                        break;
                    case 5:
                        cpVar.f3363c = dpVar;
                        break;
                    case 6:
                        dpVar.mo3986n();
                        break;
                }
                C1477bw.m3978a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C1145cn.m3165a(this.f3360a.f3372l));
            } else {
                throw null;
            }
        }
    }
}
