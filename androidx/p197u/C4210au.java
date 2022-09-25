package androidx.p197u;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: androidx.u.au */
/* compiled from: PG */
final class C4210au extends Property {
    public C4210au(Class cls) {
        super(cls, "clipBounds");
    }

    public final /* synthetic */ Object get(Object obj) {
        return C2043bi.m5587p((View) obj);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C2043bi.m5547aa((View) obj, (Rect) obj2);
    }
}
