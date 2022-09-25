package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C1419at;
import androidx.camera.core.C1470bp;
import androidx.camera.core.C1477bw;
import androidx.camera.core.C1506cj;
import androidx.camera.core.p069a.C1311ay;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1320bg;
import androidx.camera.core.p069a.C1356cp;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1379f;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1252a;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import androidx.core.p097i.C1974i;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.di */
/* compiled from: PG */
public final /* synthetic */ class C1167di implements C1252a {

    /* renamed from: a */
    public final /* synthetic */ C1171dm f3417a;

    /* renamed from: b */
    public final /* synthetic */ C1357cq f3418b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f3419c;

    /* renamed from: d */
    public final /* synthetic */ C1189ed f3420d;

    public /* synthetic */ C1167di(C1171dm dmVar, C1357cq cqVar, CameraDevice cameraDevice, C1189ed edVar) {
        this.f3417a = dmVar;
        this.f3418b = cqVar;
        this.f3419c = cameraDevice;
        this.f3420d = edVar;
    }

    /* renamed from: a */
    public final C60870cx mo3782a(Object obj) {
        C60870cx b;
        C1171dm dmVar = this.f3417a;
        C1357cq cqVar = this.f3418b;
        CameraDevice cameraDevice = this.f3419c;
        C1189ed edVar = this.f3420d;
        List list = (List) obj;
        C1477bw.m3978a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + dmVar.f3434k + ")");
        if (dmVar.f3435l == 5) {
            return new C1264m(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        if (list.contains((Object) null)) {
            b = new C1264m(new C1311ay("Surface closed", (C1314ba) cqVar.mo4242b().get(list.indexOf((Object) null))));
        } else {
            try {
                C1320bg.m3528b(dmVar.f3428e);
                for (int i = 0; i < cqVar.mo4242b().size(); i++) {
                    C1314ba baVar = (C1314ba) cqVar.mo4242b().get(i);
                    if (Objects.equals(baVar.f3780s, C1506cj.class)) {
                        new C1379f((Surface) baVar.mo4176b().get(), new Size(baVar.f3778q.getWidth(), baVar.f3778q.getHeight()), baVar.f3779r);
                    } else if (Objects.equals(baVar.f3780s, C1470bp.class)) {
                        new C1379f((Surface) baVar.mo4176b().get(), new Size(baVar.f3778q.getWidth(), baVar.f3778q.getHeight()), baVar.f3779r);
                    } else if (Objects.equals(baVar.f3780s, C1419at.class)) {
                        new C1379f((Surface) baVar.mo4176b().get(), new Size(baVar.f3778q.getWidth(), baVar.f3778q.getHeight()), baVar.f3779r);
                    }
                }
                dmVar.f3435l = 2;
                C1477bw.m3983f("ProcessingCaptureSession", "== initSession (id=" + dmVar.f3434k + ")");
                dmVar.f3431h = dmVar.f3425b.mo4245c();
                C1263l.m3431c(((C1314ba) dmVar.f3431h.mo4242b().get(0)).f3777p).mo4106b(new C1165dg(dmVar), C1238a.m3410a());
                for (C1314ba baVar2 : dmVar.f3431h.mo4242b()) {
                    C1171dm.f3423a.add(baVar2);
                    C1263l.m3431c(baVar2.f3777p).mo4106b(new C1166dh(baVar2), dmVar.f3426c);
                }
                C1356cp cpVar = new C1356cp();
                cpVar.mo4240b(cqVar);
                cpVar.f3831a.clear();
                cpVar.f3832b.f3740a.clear();
                cpVar.mo4240b(dmVar.f3431h);
                C1974i.m5314b(cpVar.mo4241c(), "Cannot transform the SessionConfig");
                b = dmVar.f3427d.mo3921b(cpVar.mo4239a(), cameraDevice, edVar);
                C1263l.m3436h(b, new C1169dk(dmVar), dmVar.f3426c);
            } catch (C1311ay e) {
                return new C1264m(e);
            }
        }
        return b;
    }
}
