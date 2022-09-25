package androidx.p197u;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: androidx.u.c */
/* compiled from: PG */
final class C4218c extends Property {

    /* renamed from: a */
    private final Rect f13653a = new Rect();

    public C4218c(Class cls) {
        super(cls, "boundsOrigin");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f13653a);
        return new PointF((float) this.f13653a.left, (float) this.f13653a.top);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.f13653a);
        this.f13653a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.f13653a);
    }
}
