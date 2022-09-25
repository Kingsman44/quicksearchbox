package androidx.customview.p103b;

import android.graphics.Rect;
import androidx.core.p098j.p099a.C1991k;
import java.util.Comparator;

/* renamed from: androidx.customview.b.c */
/* compiled from: PG */
final class C2145c implements Comparator {

    /* renamed from: a */
    private final Rect f6087a = new Rect();

    /* renamed from: b */
    private final Rect f6088b = new Rect();

    /* renamed from: c */
    private final boolean f6089c;

    public C2145c(boolean z) {
        this.f6089c = z;
    }

    public final int compare(Object obj, Object obj2) {
        Rect rect = this.f6087a;
        Rect rect2 = this.f6088b;
        ((C1991k) obj).f5921a.getBoundsInScreen(rect);
        ((C1991k) obj2).f5921a.getBoundsInScreen(rect2);
        if (rect.top < rect2.top) {
            return -1;
        }
        if (rect.top > rect2.top) {
            return 1;
        }
        if (rect.left < rect2.left) {
            if (this.f6089c) {
                return 1;
            }
            return -1;
        } else if (rect.left > rect2.left) {
            if (this.f6089c) {
                return -1;
            }
            return 1;
        } else if (rect.bottom < rect2.bottom) {
            return -1;
        } else {
            if (rect.bottom > rect2.bottom) {
                return 1;
            }
            if (rect.right < rect2.right) {
                if (this.f6089c) {
                    return 1;
                }
                return -1;
            } else if (rect.right <= rect2.right) {
                return 0;
            } else {
                if (this.f6089c) {
                    return -1;
                }
                return 1;
            }
        }
    }
}
