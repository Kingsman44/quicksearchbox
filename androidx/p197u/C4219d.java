package androidx.p197u;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.u.d */
/* compiled from: PG */
final class C4219d extends Property {
    public C4219d(Class cls) {
        super(cls, "topLeft");
    }

    public final /* synthetic */ Object get(Object obj) {
        C4226k kVar = (C4226k) obj;
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C4226k kVar = (C4226k) obj;
        PointF pointF = (PointF) obj2;
        kVar.f13657a = Math.round(pointF.x);
        kVar.f13658b = Math.round(pointF.y);
        int i = kVar.f13661e + 1;
        kVar.f13661e = i;
        if (i == kVar.f13662f) {
            kVar.mo8938a();
        }
    }
}
