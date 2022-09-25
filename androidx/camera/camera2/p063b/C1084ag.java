package androidx.camera.camera2.p063b;

import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1366cz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.ag */
/* compiled from: PG */
final class C1084ag {

    /* renamed from: a */
    final /* synthetic */ C1091an f3229a;

    public C1084ag(C1091an anVar) {
        this.f3229a = anVar;
    }

    /* renamed from: a */
    public final void mo3798a(List list) {
        C1131c cVar;
        C1091an anVar = this.f3229a;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1302ap apVar = (C1302ap) it.next();
            C1300an anVar2 = new C1300an(apVar);
            if (apVar.f3751e == 5 && (cVar = apVar.f3755i) != null) {
                anVar2.f3745f = cVar;
            }
            if (Collections.unmodifiableList(apVar.f3749c).isEmpty() && apVar.f3753g) {
                if (!anVar2.f3740a.isEmpty()) {
                    C1477bw.m3983f("Camera2CameraImpl", "The capture config builder already has surface inside.");
                } else {
                    for (C1357cq cqVar : Collections.unmodifiableCollection(anVar.f3242a.mo4267d(C1366cz.f3855a))) {
                        List<C1314ba> unmodifiableList = Collections.unmodifiableList(cqVar.f3847f.f3749c);
                        if (!unmodifiableList.isEmpty()) {
                            for (C1314ba f : unmodifiableList) {
                                anVar2.mo4162f(f);
                            }
                        }
                    }
                    if (anVar2.f3740a.isEmpty()) {
                        C1477bw.m3983f("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                }
            }
            arrayList.add(anVar2.mo4157a());
        }
        anVar.mo3822h("Issue capture request", (Throwable) null);
        anVar.f3248g.mo3928i(arrayList);
    }
}
