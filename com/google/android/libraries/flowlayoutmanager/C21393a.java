package com.google.android.libraries.flowlayoutmanager;

import android.content.res.TypedArray;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: com.google.android.libraries.flowlayoutmanager.a */
/* compiled from: PG */
public final class C21393a {

    /* renamed from: a */
    private static final TypedValue f59813a = new TypedValue();

    /* renamed from: b */
    private static final ThreadLocal f59814b = new ThreadLocal();

    /* renamed from: a */
    public static int m40474a(TypedArray typedArray, String str, int i, boolean z) {
        TypedValue typedValue;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            typedValue = f59813a;
        } else {
            ThreadLocal threadLocal = f59814b;
            TypedValue typedValue2 = (TypedValue) threadLocal.get();
            if (typedValue2 == null) {
                typedValue2 = new TypedValue();
                threadLocal.set(typedValue2);
            }
            typedValue = typedValue2;
        }
        if (typedArray.getValue(i, typedValue)) {
            int i2 = typedValue.type;
            int i3 = 0;
            if (i2 == 4) {
                float f = typedValue.getFloat();
                if (!z || f >= 0.0f) {
                    if (f != 0.0f) {
                        i3 = Float.floatToIntBits(typedValue.getFloat());
                    }
                    if (m40475b(i3)) {
                        return i3;
                    }
                    String positionDescription = typedArray.getPositionDescription();
                    throw new IllegalArgumentException(positionDescription + ": out-of-range float length for " + str);
                }
                String positionDescription2 = typedArray.getPositionDescription();
                throw new IllegalArgumentException(positionDescription2 + ": negative float length not allowed for size attribute " + str);
            } else if (i2 == 5) {
                float dimension = typedValue.getDimension(typedArray.getResources().getDisplayMetrics());
                if (!z || dimension >= 1.0f) {
                    i3 = Math.round(dimension);
                } else if (dimension < 0.0f) {
                    String positionDescription3 = typedArray.getPositionDescription();
                    throw new IllegalArgumentException(positionDescription3 + ": negative dimen length not allowed for size attribute " + str);
                } else if (dimension != 0.0f) {
                    i3 = 1;
                }
                if (i3 >= -16777216 && i3 <= 16777215) {
                    return i3;
                }
                String positionDescription4 = typedArray.getPositionDescription();
                throw new IllegalArgumentException(positionDescription4 + ": out-of-range dimension length for " + str);
            } else if (i2 == 16 || i2 == 17) {
                int i4 = typedValue.data;
                int i5 = i4 & -16777216;
                if (i5 == 2130706432 || (z && i5 == -16777216)) {
                    return i4;
                }
                String positionDescription5 = typedArray.getPositionDescription();
                throw new IllegalArgumentException(positionDescription5 + ": invalid enum value " + i4 + " for " + str);
            } else {
                String positionDescription6 = typedArray.getPositionDescription();
                String valueOf = String.valueOf(typedValue.coerceToString());
                throw new IllegalArgumentException(positionDescription6 + ": unaccepted value for " + str + ": " + valueOf);
            }
        } else {
            String positionDescription7 = typedArray.getPositionDescription();
            throw new IllegalArgumentException(positionDescription7 + ": missing " + str);
        }
    }

    /* renamed from: b */
    public static boolean m40475b(int i) {
        int i2 = i & -16777216;
        return (i2 == Integer.MIN_VALUE || i2 == -16777216 || i2 == 0 || i2 == 2130706432) ? false : true;
    }

    /* renamed from: c */
    public static boolean m40476c(int i) {
        int i2 = i & -16777216;
        return i2 == -16777216 || i2 == 0;
    }

    /* renamed from: d */
    public static int m40477d() {
        int floatToIntBits = Float.floatToIntBits(0.5f);
        if (m40475b(floatToIntBits)) {
            return floatToIntBits;
        }
        throw new IllegalArgumentException("Float length 0.5 out of range or NaN");
    }
}
