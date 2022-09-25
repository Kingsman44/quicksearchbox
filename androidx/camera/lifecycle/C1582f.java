package androidx.camera.lifecycle;

import androidx.camera.core.C1400aa;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: androidx.camera.lifecycle.f */
/* compiled from: PG */
public final /* synthetic */ class C1582f implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C1584h f4326a;

    /* renamed from: b */
    public final /* synthetic */ C1400aa f4327b;

    public /* synthetic */ C1582f(C1584h hVar, C1400aa aaVar) {
        this.f4326a = hVar;
        this.f4327b = aaVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C1584h hVar = this.f4326a;
        C1400aa aaVar = this.f4327b;
        synchronized (hVar.f4331b) {
            C1263l.m3436h(C1263l.m3434f(C1257f.m3422a(hVar.f4333d), new C1579c(aaVar), C1238a.m3410a()), new C1583g(cVar, aaVar), C1238a.m3410a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }
}
