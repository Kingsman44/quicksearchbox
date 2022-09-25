package com.android.datetimepicker;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.text.format.Time;
import android.view.View;

/* renamed from: com.android.datetimepicker.e */
/* compiled from: PG */
public final class C5104e {
    /* renamed from: a */
    public static int m13980a(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            default:
                throw new IllegalArgumentException("Argument must be between Calendar.SUNDAY and Calendar.SATURDAY");
        }
    }

    /* renamed from: b */
    public static int m13981b(int i, int i2) {
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 1:
                return i2 % 4 == 0 ? 29 : 28;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default:
                throw new IllegalArgumentException("Invalid Month");
        }
    }

    /* renamed from: c */
    public static int m13982c(int i, int i2) {
        int i3 = 4 - i2;
        if (i3 < 0) {
            i3 += 7;
        }
        Time time = new Time("UTC");
        time.setJulianDay((((i - (2440588 - i3)) / 7) * 7) + 2440585);
        return time.getWeekNumber();
    }

    /* renamed from: d */
    public static ObjectAnimator m13983d(View view, float f, float f2) {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.275f, f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.69f, f2);
        Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4}), PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4})});
        ofPropertyValuesHolder.setDuration(544);
        return ofPropertyValuesHolder;
    }

    /* renamed from: e */
    public static void m13984e(View view, CharSequence charSequence) {
        if (view != null && charSequence != null) {
            view.announceForAccessibility(charSequence);
        }
    }
}
