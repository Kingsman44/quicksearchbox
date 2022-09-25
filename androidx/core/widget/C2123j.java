package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.j */
/* compiled from: PG */
public final class C2123j {

    /* renamed from: a */
    public final EdgeEffect f6083a;

    @Deprecated
    public C2123j(Context context) {
        this.f6083a = new EdgeEffect(context);
    }

    /* renamed from: a */
    public static float m5886a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2122i.m5883a(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static EdgeEffect m5888c(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2122i.m5885c(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    @Deprecated
    /* renamed from: d */
    public final boolean mo5363d() {
        this.f6083a.onRelease();
        return this.f6083a.isFinished();
    }

    /* renamed from: b */
    public static float m5887b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2122i.m5884b(edgeEffect, f, f2);
        }
        C2121h.m5882a(edgeEffect, f, f2);
        return f;
    }
}
