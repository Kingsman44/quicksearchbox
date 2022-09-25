package androidx.p197u;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.u.e */
/* compiled from: PG */
final class C4220e extends Property {
    public C4220e(Class cls) {
        super(cls, "bottomRight");
    }

    public final /* synthetic */ Object get(Object obj) {
        C4226k kVar = (C4226k) obj;
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C4226k kVar = (C4226k) obj;
        PointF pointF = (PointF) obj2;
        kVar.f13659c = Math.round(pointF.x);
        kVar.f13660d = Math.round(pointF.y);
        int i = kVar.f13662f + 1;
        kVar.f13662f = i;
        if (kVar.f13661e == i) {
            kVar.mo8938a();
        }
    }
}
