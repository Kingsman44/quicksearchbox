package androidx.slice.widget;

import androidx.slice.p194a.C4094a;
import java.util.Comparator;

/* renamed from: androidx.slice.widget.ar */
/* compiled from: PG */
final class C4140ar implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = ((C4094a) obj).f13112g;
        int i2 = ((C4094a) obj2).f13112g;
        if (i < 0 && i2 < 0) {
            return 0;
        }
        if (i >= 0) {
            if (i2 >= 0) {
                if (i2 >= i) {
                    return i2 > i ? -1 : 0;
                }
            }
        }
        return 1;
    }
}
