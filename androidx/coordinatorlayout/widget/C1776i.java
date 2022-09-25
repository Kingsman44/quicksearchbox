package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.core.p098j.C2043bi;
import java.util.Comparator;

/* renamed from: androidx.coordinatorlayout.widget.i */
/* compiled from: PG */
final class C1776i implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        float b = C2043bi.m5573b((View) obj);
        float b2 = C2043bi.m5573b((View) obj2);
        if (b > b2) {
            return -1;
        }
        return b < b2 ? 1 : 0;
    }
}
