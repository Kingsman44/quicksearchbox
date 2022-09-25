package androidx.p198v.p199a.p200a;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.p097i.C1969d;

/* renamed from: androidx.v.a.a.j */
/* compiled from: PG */
public final class C4251j {
    /* renamed from: a */
    public static Interpolator m12166a(Context context, int i) {
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, i);
        C1969d.m5306a(loadInterpolator, "Failed to parse interpolator, no start tag found");
        return loadInterpolator;
    }
}
