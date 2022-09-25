package com.google.android.material.p3505b;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import com.google.android.material.p3512i.C44693c;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.material.b.e */
/* compiled from: PG */
public final class C44535e {
    /* renamed from: a */
    public static int m78718a(int i, int i2) {
        return C1924a.m5189h(i, (Color.alpha(i) * i2) / PrivateKeyType.INVALID);
    }

    /* renamed from: b */
    public static int m78719b(View view, int i) {
        return m78722e(view.getContext(), C44693c.m79227c(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    /* renamed from: c */
    public static int m78720c(Context context, int i, int i2) {
        TypedValue b = C44693c.m79226b(context, i);
        return b != null ? m78722e(context, b) : i2;
    }

    /* renamed from: d */
    public static int m78721d(int i, int i2, float f) {
        return C1924a.m5188g(C1924a.m5189h(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    /* renamed from: e */
    public static int m78722e(Context context, TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return C1878d.m5128a(context, typedValue.resourceId);
        }
        return typedValue.data;
    }

    /* renamed from: f */
    public static boolean m78723f(int i) {
        return i != 0 && C1924a.m5183b(i) > 0.5d;
    }
}
