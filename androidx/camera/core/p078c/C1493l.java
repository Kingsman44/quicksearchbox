package androidx.camera.core.p078c;

import androidx.camera.core.C1538do;
import androidx.camera.core.C1546dw;
import androidx.camera.core.C1547dx;
import androidx.camera.core.p069a.C1312az;
import androidx.camera.core.p069a.p070a.p071a.C1247j;
import androidx.camera.core.p069a.p070a.p072b.C1255d;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.core.c.l */
/* compiled from: PG */
public final class C1493l implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C1547dx f4102a;

    /* renamed from: b */
    final /* synthetic */ C1488g f4103b;

    /* renamed from: c */
    final /* synthetic */ C1488g f4104c;

    /* renamed from: d */
    final /* synthetic */ C1494m f4105d;

    public C1493l(C1494m mVar, C1547dx dxVar, C1488g gVar, C1488g gVar2) {
        this.f4105d = mVar;
        this.f4102a = dxVar;
        this.f4103b = gVar;
        this.f4104c = gVar2;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        this.f4102a.f4253d.mo5439d(new C1312az());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        C1546dw dwVar;
        C1496o oVar = (C1496o) obj;
        oVar.getClass();
        this.f4105d.f4106a.mo4398b();
        this.f4105d.f4106a.mo4397a();
        C1488g gVar = this.f4103b;
        C1547dx dxVar = this.f4102a;
        C1488g gVar2 = this.f4104c;
        ScheduledExecutorService a = C1247j.m3414a();
        C1491j jVar = new C1491j(oVar, gVar, gVar2);
        synchronized (dxVar.f4250a) {
            dxVar.f4257h = jVar;
            dxVar.f4256g = a;
            dwVar = dxVar.f4255f;
        }
        if (dwVar != null) {
            a.execute(new C1538do(jVar, dwVar));
        }
    }
}
