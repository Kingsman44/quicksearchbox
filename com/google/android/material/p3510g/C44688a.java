package com.google.android.material.p3510g;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.C1940f;
import androidx.core.graphics.C1941g;
import androidx.core.p098j.p100b.C2034a;

/* renamed from: com.google.android.material.g.a */
/* compiled from: PG */
public final class C44688a {
    /* renamed from: a */
    public static TimeInterpolator m79217a(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!m79220d(valueOf, "cubic-bezier") && !m79220d(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (m79220d(valueOf, "cubic-bezier")) {
                String[] split = m79219c(valueOf, "cubic-bezier").split(",");
                int length = split.length;
                if (length == 4) {
                    return C2034a.m5471c(m79218b(split, 0), m79218b(split, 1), m79218b(split, 2), m79218b(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + length);
            } else if (m79220d(valueOf, "path")) {
                String c = m79219c(valueOf, "path");
                Path path = new Path();
                C1940f[] a = C1941g.m5255a(c);
                if (a != null) {
                    try {
                        C1940f.m5253a(a, path);
                    } catch (RuntimeException e) {
                        throw new RuntimeException("Error in parsing ".concat(String.valueOf(c)), e);
                    }
                } else {
                    path = null;
                }
                return C2034a.m5469a(path);
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(valueOf)));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    /* renamed from: b */
    private static float m79218b(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: c */
    private static String m79219c(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: d */
    private static boolean m79220d(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }
}
