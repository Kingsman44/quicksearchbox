package androidx.camera.core;

import androidx.camera.core.p069a.C1311ay;
import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;
import androidx.camera.core.p069a.C1360ct;

/* renamed from: androidx.camera.core.cw */
/* compiled from: PG */
public final /* synthetic */ class C1519cw implements C1330bq {

    /* renamed from: a */
    public final /* synthetic */ C1522cz f4188a;

    public /* synthetic */ C1519cw(C1522cz czVar) {
        this.f4188a = czVar;
    }

    /* renamed from: a */
    public final void mo4018a(C1331br brVar) {
        C1473bs bsVar;
        C1522cz czVar = this.f4188a;
        synchronized (czVar.f4191a) {
            if (!czVar.f4192b) {
                try {
                    bsVar = brVar.mo4204g();
                } catch (IllegalStateException e) {
                    C1477bw.m3981d("ProcessingSurfaceTextur", "Failed to acquire next image.", e);
                    bsVar = null;
                }
                if (bsVar != null) {
                    C1472br e2 = bsVar.mo4305e();
                    if (e2 == null) {
                        bsVar.close();
                    } else {
                        Integer num = (Integer) e2.mo4333d().mo4257d(czVar.f4198h);
                        if (num == null) {
                            bsVar.close();
                        } else if (num.intValue() != 0) {
                            new StringBuilder("ImageProxyBundle does not contain this id: ").append(num);
                            C1477bw.m3983f("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: ".concat(num.toString()));
                            bsVar.close();
                        } else {
                            C1360ct ctVar = new C1360ct(bsVar, czVar.f4198h);
                            try {
                                czVar.mo4179e();
                                czVar.f4195e.mo4167g(ctVar);
                                ctVar.mo4250c();
                                czVar.mo4178d();
                            } catch (C1311ay unused) {
                                C1477bw.m3978a("ProcessingSurfaceTextur", "The ProcessingSurface has been closed. Don't process the incoming image.");
                                ctVar.mo4250c();
                            }
                        }
                    }
                }
            }
        }
    }
}
