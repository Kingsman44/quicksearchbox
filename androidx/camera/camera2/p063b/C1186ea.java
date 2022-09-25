package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p063b.p064a.p065a.C1008m;
import androidx.camera.camera2.p063b.p064a.p067c.C1048f;
import androidx.camera.camera2.p063b.p064a.p067c.C1049g;
import androidx.camera.camera2.p063b.p064a.p067c.C1058p;
import androidx.camera.camera2.p063b.p064a.p067c.C1060r;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1347cg;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.camera2.b.ea */
/* compiled from: PG */
public final class C1186ea extends C1182dx {

    /* renamed from: i */
    C60870cx f3490i;

    /* renamed from: j */
    private final Object f3491j = new Object();

    /* renamed from: k */
    private List f3492k;

    /* renamed from: l */
    private final C1049g f3493l;

    /* renamed from: m */
    private final C1060r f3494m;

    /* renamed from: n */
    private final C1048f f3495n;

    public C1186ea(C1347cg cgVar, C1347cg cgVar2, C1151ct ctVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(ctVar, executor, scheduledExecutorService);
        this.f3493l = new C1049g(cgVar, cgVar2);
        this.f3494m = new C1060r(cgVar);
        this.f3495n = new C1048f(cgVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo4010A(String str) {
        C1477bw.m3978a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final /* synthetic */ void mo4011B() {
        mo4010A("Session call super.close()");
        super.mo3986n();
    }

    /* renamed from: b */
    public final void mo3917b(C1174dp dpVar) {
        C1174dp dpVar2;
        C1174dp dpVar3;
        mo4010A("Session onConfigured()");
        C1048f fVar = this.f3495n;
        List b = this.f3475b.mo3941b();
        List a = this.f3475b.mo3940a();
        if (fVar.mo3778a()) {
            LinkedHashSet<C1174dp> linkedHashSet = new LinkedHashSet<>();
            Iterator it = b.iterator();
            while (it.hasNext() && (dpVar3 = (C1174dp) it.next()) != dpVar) {
                linkedHashSet.add(dpVar3);
            }
            for (C1174dp dpVar4 : linkedHashSet) {
                dpVar4.mo3983k().mo3916a(dpVar4);
            }
        }
        super.mo3917b(dpVar);
        if (fVar.mo3778a()) {
            LinkedHashSet<C1174dp> linkedHashSet2 = new LinkedHashSet<>();
            Iterator it2 = a.iterator();
            while (it2.hasNext() && (dpVar2 = (C1174dp) it2.next()) != dpVar) {
                linkedHashSet2.add(dpVar2);
            }
            for (C1174dp dpVar5 : linkedHashSet2) {
                dpVar5.mo3983k().mo3979g(dpVar5);
            }
        }
    }

    /* renamed from: g */
    public final void mo3979g(C1174dp dpVar) {
        synchronized (this.f3491j) {
            this.f3493l.mo3779a(this.f3492k);
        }
        mo4010A("onClosed()");
        super.mo3979g(dpVar);
    }

    /* renamed from: i */
    public final int mo3981i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int i;
        C1060r rVar = this.f3494m;
        synchronized (rVar.f3197b) {
            if (rVar.f3196a) {
                C1095ar arVar = new C1095ar(Arrays.asList(new CameraCaptureSession.CaptureCallback[]{rVar.f3201f, captureCallback}));
                rVar.f3200e = true;
                captureCallback = arVar;
            }
            i = super.mo3981i(captureRequest, captureCallback);
        }
        return i;
    }

    /* renamed from: m */
    public final C60870cx mo3985m() {
        return C1263l.m3431c(this.f3494m.f3198c);
    }

    /* renamed from: n */
    public final void mo3986n() {
        mo4010A("Session call close()");
        C1060r rVar = this.f3494m;
        synchronized (rVar.f3197b) {
            if (rVar.f3196a && !rVar.f3200e) {
                rVar.f3198c.cancel(true);
            }
        }
        C1263l.m3431c(this.f3494m.f3198c).mo4106b(new C1183dy(this), this.f3476c);
    }

    /* renamed from: r */
    public final C60870cx mo4000r(CameraDevice cameraDevice, C1008m mVar, List list) {
        ArrayList<C1174dp> arrayList;
        C60870cx c;
        synchronized (this.f3491j) {
            C1151ct ctVar = this.f3475b;
            synchronized (ctVar.f3381b) {
                arrayList = new ArrayList<>(ctVar.f3383d);
            }
            C1184dz dzVar = new C1184dz(this);
            ArrayList arrayList2 = new ArrayList();
            for (C1174dp m : arrayList) {
                arrayList2.add(m.mo3985m());
            }
            C60870cx f = C1263l.m3434f(C1257f.m3422a(C1263l.m3432d(arrayList2)), new C1058p(dzVar, cameraDevice, mVar, list), C1238a.m3410a());
            this.f3490i = f;
            c = C1263l.m3431c(f);
        }
        return c;
    }

    /* renamed from: w */
    public final boolean mo4005w() {
        boolean w;
        synchronized (this.f3491j) {
            if (mo4004v()) {
                this.f3493l.mo3779a(this.f3492k);
            } else {
                C60870cx cxVar = this.f3490i;
                if (cxVar != null) {
                    cxVar.cancel(true);
                }
            }
            w = super.mo4005w();
        }
        return w;
    }

    /* renamed from: y */
    public final C60870cx mo4007y(List list) {
        C60870cx y;
        synchronized (this.f3491j) {
            this.f3492k = list;
            y = super.mo4007y(list);
        }
        return y;
    }

    /* renamed from: z */
    public final /* synthetic */ C60870cx mo4012z(CameraDevice cameraDevice, C1008m mVar, List list) {
        return super.mo4000r(cameraDevice, mVar, list);
    }
}
