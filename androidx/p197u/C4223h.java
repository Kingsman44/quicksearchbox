package androidx.p197u;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: androidx.u.h */
/* compiled from: PG */
final class C4223h extends Property {
    public C4223h(Class cls) {
        super(cls, "position");
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
        int width = view.getWidth();
        int height = view.getHeight();
        int i = C4211av.f13633b;
        view.setLeftTopRightBottom(round, round2, width + round, height + round2);
    }
}
