package androidx.p197u;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: androidx.u.g */
/* compiled from: PG */
final class C4222g extends Property {
    public C4222g(Class cls) {
        super(cls, "topLeft");
    }

    public final /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return null;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int round = Math.round(pointF.x);
        int round2 = Math.round(pointF.y);
        int right = view.getRight();
        int bottom = view.getBottom();
        int i = C4211av.f13633b;
        view.setLeftTopRightBottom(round, round2, right, bottom);
    }
}
