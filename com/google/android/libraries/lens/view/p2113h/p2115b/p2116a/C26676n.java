package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import android.hardware.Camera;
import android.util.Size;
import com.google.android.libraries.lens.view.p2113h.p2115b.C26681b;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26735ad;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26736ae;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26737af;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26740ai;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26756h;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26760l;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26764p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.n */
/* compiled from: PG */
final class C26676n implements C26681b {

    /* renamed from: a */
    final /* synthetic */ C26679q f72723a;

    public C26676n(C26679q qVar) {
        this.f72723a = qVar;
    }

    /* renamed from: a */
    public final void mo31969a() {
        C26679q qVar = this.f72723a;
        int i = qVar.f72752z;
        if (i != 3 && i != 4) {
            try {
                Camera open = Camera.open(qVar.f72735i);
                open.getClass();
                Camera.Parameters parameters = open.getParameters();
                C58485gu d = C26665c.m49276d(parameters);
                C26679q qVar2 = this.f72723a;
                qVar2.f72739m = C26735ad.m49424a(d, qVar2.f72733g.mo32057b());
                C26740ai aiVar = qVar2.f72731e;
                Size size = qVar2.f72739m;
                if (size != null) {
                    ((C26760l) aiVar).f72930d = size;
                    qVar2.f72732f.mo31937b(d);
                    C26764p pVar = qVar2.f72732f;
                    Size size2 = qVar2.f72739m;
                    size2.getClass();
                    pVar.mo31943h(size2);
                    open.setErrorCallback(new C26674l(this.f72723a));
                    open.setAutoFocusMoveCallback(new C26675m(this.f72723a));
                    C26679q qVar3 = this.f72723a;
                    open.setDisplayOrientation(qVar3.f72736j ? 360 - qVar3.mo31972a() : qVar3.mo31972a());
                    C26679q qVar4 = this.f72723a;
                    qVar4.f72738l = open;
                    C26679q qVar5 = this.f72723a;
                    qVar4.f72741o = new C26663a(parameters, qVar5.f72732f);
                    qVar5.mo31975e();
                    Size size3 = qVar5.f72739m;
                    size3.getClass();
                    qVar5.f72740n = C26737af.m49428a(size3, new C26666d(qVar5), qVar5.f72730d);
                    Camera camera = qVar5.f72738l;
                    camera.getClass();
                    camera.setPreviewTexture(qVar5.f72740n);
                    qVar5.f72732f.mo31941f(String.valueOf(qVar5.f72735i));
                    qVar5.f72732f.mo31948m(true != qVar5.f72736j ? 3 : 2);
                    qVar5.f72732f.mo31936a();
                    C26679q qVar6 = this.f72723a;
                    C26756h hVar = new C26756h();
                    hVar.mo32095e(d);
                    hVar.mo32094d(this.f72723a.mo31972a());
                    C26679q qVar7 = this.f72723a;
                    float f = 1.0f;
                    if (qVar7.f72738l != null) {
                        Camera.Parameters b = qVar7.mo31973b();
                        if (b != null) {
                            List<Integer> zoomRatios = b.getZoomRatios();
                            if (zoomRatios != null) {
                                if (!zoomRatios.isEmpty()) {
                                    f = ((float) ((Integer) C58557jl.m90131l(zoomRatios)).intValue()) / 100.0f;
                                }
                            }
                        }
                    }
                    hVar.mo32093c(f);
                    C26679q qVar8 = this.f72723a;
                    Size size4 = qVar8.f72739m;
                    size4.getClass();
                    hVar.f72896a = size4;
                    hVar.mo32092b(qVar8.f72736j);
                    C26736ae aeVar = this.f72723a.f72740n;
                    aeVar.getClass();
                    hVar.f72898c = aeVar;
                    qVar6.f72742p = hVar.mo32091a();
                    this.f72723a.mo31978h();
                    this.f72723a.f72752z = 3;
                    C26679q qVar9 = this.f72723a;
                    qVar9.f72730d.post(C47810es.m84977q(new C26673k(qVar9)));
                    return;
                }
                throw new NullPointerException("Null previewSize");
            } catch (IOException e) {
                throw new RuntimeException("Failed to set preview texture: surface texture is unavailable or unsuitable", e);
            } catch (RuntimeException e2) {
                this.f72723a.f72744r = e2;
            }
        }
    }
}
