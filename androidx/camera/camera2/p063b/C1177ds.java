package androidx.camera.camera2.p063b;

import androidx.camera.camera2.p063b.p064a.C1069l;
import androidx.camera.camera2.p063b.p064a.p065a.C1008m;
import androidx.camera.core.p069a.C1320bg;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.ds */
/* compiled from: PG */
public final /* synthetic */ class C1177ds implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C1182dx f3465a;

    /* renamed from: b */
    public final /* synthetic */ List f3466b;

    /* renamed from: c */
    public final /* synthetic */ C1069l f3467c;

    /* renamed from: d */
    public final /* synthetic */ C1008m f3468d;

    public /* synthetic */ C1177ds(C1182dx dxVar, List list, C1069l lVar, C1008m mVar) {
        this.f3465a = dxVar;
        this.f3466b = list;
        this.f3467c = lVar;
        this.f3468d = mVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        String str;
        C1182dx dxVar = this.f3465a;
        List list = this.f3466b;
        C1069l lVar = this.f3467c;
        C1008m mVar = this.f3468d;
        synchronized (dxVar.f3474a) {
            synchronized (dxVar.f3474a) {
                dxVar.mo4003u();
                C1320bg.m3528b(list);
                dxVar.f3481h = list;
            }
            C1974i.m5315c(dxVar.f3480g == null, "The openCaptureSessionCompleter can only set once!");
            dxVar.f3480g = cVar;
            lVar.f3209a.mo3786a(mVar);
            str = "openCaptureSession[session=" + dxVar + "]";
        }
        return str;
    }
}
