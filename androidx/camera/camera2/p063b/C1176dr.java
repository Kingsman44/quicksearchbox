package androidx.camera.camera2.p063b;

import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1311ay;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.p070a.p072b.C1252a;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.dr */
/* compiled from: PG */
public final /* synthetic */ class C1176dr implements C1252a {

    /* renamed from: a */
    public final /* synthetic */ C1182dx f3463a;

    /* renamed from: b */
    public final /* synthetic */ List f3464b;

    public /* synthetic */ C1176dr(C1182dx dxVar, List list) {
        this.f3463a = dxVar;
        this.f3464b = list;
    }

    /* renamed from: a */
    public final C60870cx mo3782a(Object obj) {
        C1182dx dxVar = this.f3463a;
        List list = this.f3464b;
        List list2 = (List) obj;
        C1477bw.m3978a("SyncCaptureSessionBase", "[" + dxVar + "] getSurface...done");
        if (list2.contains((Object) null)) {
            return new C1264m(new C1311ay("Surface closed", (C1314ba) list.get(list2.indexOf((Object) null))));
        }
        return list2.isEmpty() ? new C1264m(new IllegalArgumentException("Unable to open capture session without surfaces")) : C1263l.m3430b(list2);
    }
}
