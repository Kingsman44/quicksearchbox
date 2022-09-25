package androidx.p197u;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: androidx.u.f */
/* compiled from: PG */
final class C4221f extends Property {
    public C4221f(Class cls) {
        super(cls, "bottomRight");
    }

    public final /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int left = view.getLeft();
        int top = view.getTop();
        int round = Math.round(pointF.x);
        int round2 = Math.round(pointF.y);
        int i = C4211av.f13633b;
        view.setLeftTopRightBottom(left, top, round, round2);
    }
}
