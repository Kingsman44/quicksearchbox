package androidx.core.p098j;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: androidx.core.j.l */
/* compiled from: PG */
public final class C2097l {
    /* renamed from: a */
    public static int m5777a(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: b */
    public static int m5778b(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: c */
    public static int m5779c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: d */
    public static int m5780d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* renamed from: e */
    static DisplayCutout m5781e(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    /* renamed from: f */
    static List m5782f(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }
}
