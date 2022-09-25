package androidx.camera.core.p069a;

import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.a.co */
/* compiled from: PG */
public abstract class C1355co {
    /* renamed from: e */
    public static C1354cn m3697e(C1314ba baVar) {
        C1380g gVar = new C1380g();
        if (baVar != null) {
            gVar.f3886a = baVar;
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                gVar.f3887b = emptyList;
                gVar.f3888c = -1;
                return gVar;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }
        throw new NullPointerException("Null surface");
    }

    /* renamed from: a */
    public abstract int mo4235a();

    /* renamed from: b */
    public abstract C1314ba mo4236b();

    /* renamed from: c */
    public abstract String mo4237c();

    /* renamed from: d */
    public abstract List mo4238d();
}
