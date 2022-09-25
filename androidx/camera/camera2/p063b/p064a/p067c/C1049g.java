package androidx.camera.camera2.p063b.p064a.p067c;

import androidx.camera.camera2.p063b.p064a.p066b.C1013ac;
import androidx.camera.camera2.p063b.p064a.p066b.C1025j;
import androidx.camera.camera2.p063b.p064a.p066b.C1040y;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1347cg;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.a.c.g */
/* compiled from: PG */
public final class C1049g {

    /* renamed from: a */
    private final boolean f3177a;

    /* renamed from: b */
    private final boolean f3178b;

    /* renamed from: c */
    private final boolean f3179c;

    public C1049g(C1347cg cgVar, C1347cg cgVar2) {
        this.f3177a = cgVar2.mo4226b(C1013ac.class);
        this.f3178b = cgVar.mo4226b(C1040y.class);
        this.f3179c = cgVar.mo4226b(C1025j.class);
    }

    /* renamed from: a */
    public final void mo3779a(List list) {
        if (mo3780b() && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C1314ba) it.next()).mo4177c();
            }
            C1477bw.m3978a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }

    /* renamed from: b */
    public final boolean mo3780b() {
        return this.f3177a || this.f3178b || this.f3179c;
    }
}
