package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.mediarouter.app.ai */
/* compiled from: PG */
final class C3763ai {
    /* renamed from: a */
    static float m10920a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    /* renamed from: b */
    static int m10921b(Context context) {
        int f = m10925f(context, R.attr.mediaRouteTheme);
        return f == 0 ? m10923d(context) : f;
    }

    /* renamed from: c */
    static int m10922c(Context context, int i) {
        if (C1924a.m5182a(-1, m10924e(context, i, R.attr.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    /* renamed from: d */
    public static int m10923d(Context context) {
        TypedValue typedValue = new TypedValue();
        return (!context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) || typedValue.data == 0) ? m10922c(context, 0) == -570425344 ? 2132150847 : 2132150844 : m10922c(context, 0) == -570425344 ? 2132150845 : 2132150846;
    }

    /* renamed from: e */
    public static int m10924e(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    /* renamed from: f */
    static int m10925f(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    /* renamed from: g */
    static void m10926g(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int c = m10922c(context, 0);
        if (Color.alpha(c) != 255) {
            c = C1924a.m5188g(c, ((Integer) view.getTag()).intValue());
        }
        if (mediaRouteVolumeSlider.f12071a != c) {
            if (Color.alpha(c) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #".concat(String.valueOf(Integer.toHexString(c))));
            }
            mediaRouteVolumeSlider.f12071a = c;
        }
        if (mediaRouteVolumeSlider.f12072b != c) {
            if (Color.alpha(c) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #".concat(String.valueOf(Integer.toHexString(c))));
            }
            mediaRouteVolumeSlider.f12072b = c;
        }
    }

    /* renamed from: h */
    static Context m10927h(Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m10925f(context, true != z ? R.attr.dialogTheme : R.attr.alertDialogTheme));
        return m10925f(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, m10923d(contextThemeWrapper)) : contextThemeWrapper;
    }
}
