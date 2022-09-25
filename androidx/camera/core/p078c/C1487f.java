package androidx.camera.core.p078c;

import android.graphics.Rect;
import android.view.Surface;
import androidx.camera.core.p069a.C1311ay;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1252a;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import androidx.p104d.p105a.C2168g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.core.c.f */
/* compiled from: PG */
public final /* synthetic */ class C1487f implements C1252a {

    /* renamed from: a */
    public final /* synthetic */ C1488g f4084a;

    /* renamed from: b */
    public final /* synthetic */ Rect f4085b;

    public /* synthetic */ C1487f(C1488g gVar, Rect rect) {
        this.f4084a = gVar;
        this.f4085b = rect;
    }

    /* renamed from: a */
    public final C60870cx mo3782a(Object obj) {
        C1488g gVar = this.f4084a;
        Rect rect = this.f4085b;
        Surface surface = (Surface) obj;
        surface.getClass();
        try {
            gVar.mo4179e();
            C1496o oVar = new C1496o(surface, rect);
            C60870cx cxVar = oVar.f4112b;
            ((C2168g) cxVar).f6144b.mo4106b(new C1484c(gVar), C1238a.m3410a());
            gVar.f4093g = oVar;
            return C1263l.m3430b(oVar);
        } catch (C1311ay e) {
            return new C1264m(e);
        }
    }
}
