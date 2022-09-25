package com.android.recurrencepicker;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.TimeFormatException;
import com.android.p256b.C5033s;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.android.recurrencepicker.k */
/* compiled from: PG */
public final class C5487k {

    /* renamed from: a */
    private static int[] f16630a;

    /* renamed from: b */
    private static String[][] f16631b;

    /* renamed from: a */
    public static String m14198a(Resources resources, C5033s sVar) {
        int i;
        Resources resources2 = resources;
        C5033s sVar2 = sVar;
        StringBuilder sb = new StringBuilder();
        if (sVar2.f15890e != null) {
            try {
                Time time = new Time();
                time.parse(sVar2.f15890e);
                sb.append(resources2.getString(R.string.endByDate, new Object[]{DateUtils.formatDateTime((Context) null, time.toMillis(false), C89885b.S3REQUEST_VALUE)}));
            } catch (TimeFormatException unused) {
            }
        }
        int i2 = sVar2.f15891f;
        if (i2 > 0) {
            sb.append(resources2.getQuantityString(R.plurals.endByCount, i2, new Object[]{Integer.valueOf(i2)}));
        }
        String sb2 = sb.toString();
        int i3 = sVar2.f15892g;
        if (i3 <= 1) {
            i3 = 1;
        }
        if (!m14202e(sVar)) {
            int i4 = sVar2.f15889d;
            int i5 = 4;
            if (i4 != 4) {
                if (i4 == 5) {
                    if (i4 == 5 && sVar2.f15902q == 5) {
                        int i6 = 0;
                        while (i6 < 5) {
                            int i7 = sVar2.f15900o[i6];
                            if (!(i7 == 65536 || i7 == 4194304)) {
                                i6++;
                            }
                        }
                        return String.valueOf(resources2.getString(R.string.every_weekday)).concat(sb2);
                    }
                    int i8 = sVar2.f15902q;
                    if (i8 > 0) {
                        return String.valueOf(resources2.getQuantityString(R.plurals.weekly, i3, new Object[]{Integer.valueOf(i3), m14201d(i8, sVar2.f15900o)})).concat(sb2);
                    }
                    Time time2 = sVar2.f15888c;
                    return String.valueOf(resources2.getString(R.string.weekly_simple)).concat(sb2);
                } else if (i4 == 6) {
                    String quantityString = resources2.getQuantityString(R.plurals.monthly_interval, i3, new Object[]{Integer.valueOf(i3)});
                    int i9 = sVar2.f15889d;
                    if (i9 == 6) {
                        if (sVar2.f15902q == 1 && sVar2.f15904s == 0 && ((i = sVar2.f15901p[0]) > 0 || i == -1)) {
                            int c = C5033s.m13828c(sVar2.f15900o[0]);
                            int[] iArr = f16630a;
                            if (iArr == null) {
                                iArr = new int[7];
                                f16630a = iArr;
                                iArr[0] = R.array.repeat_by_nth_sun;
                                iArr[1] = R.array.repeat_by_nth_mon;
                                iArr[2] = R.array.repeat_by_nth_tues;
                                iArr[3] = R.array.repeat_by_nth_wed;
                                iArr[4] = R.array.repeat_by_nth_thurs;
                                iArr[5] = R.array.repeat_by_nth_fri;
                                iArr[6] = R.array.repeat_by_nth_sat;
                            }
                            if (f16631b == null) {
                                f16631b = new String[7][];
                            }
                            String[][] strArr = f16631b;
                            if (strArr[c] == null) {
                                strArr[c] = resources2.getStringArray(iArr[c]);
                            }
                            int i10 = sVar2.f15901p[0] - 1;
                            if (i10 != -2) {
                                i5 = i10;
                            }
                            return quantityString + " (" + f16631b[c][i5] + ")" + sb2;
                        }
                        i9 = 6;
                    }
                    if (i9 != 6 || sVar2.f15904s != 1 || sVar2.f15902q != 0 || sVar2.f15903r[0] != -1) {
                        return String.valueOf(quantityString).concat(sb2);
                    }
                    return quantityString + " (" + resources2.getString(R.string.recurrence_month_pattern_last_day) + ")" + sb2;
                } else if (i4 != 7) {
                    return null;
                } else {
                    return String.valueOf(resources2.getQuantityString(R.plurals.yearly_interval_plain, i3, new Object[]{Integer.valueOf(i3)})).concat(sb2);
                }
            }
        }
        return String.valueOf(resources2.getQuantityString(R.plurals.daily, i3, new Object[]{Integer.valueOf(i3)})).concat(sb2);
    }

    /* renamed from: b */
    public static String m14199b(C5033s sVar, Resources resources) {
        if (sVar.f15889d != 5) {
            return null;
        }
        if (m14202e(sVar)) {
            return resources.getString(R.string.every_day);
        }
        return resources.getString(R.string.every_week, new Object[]{m14201d(sVar.f15902q, sVar.f15900o)});
    }

    /* renamed from: c */
    private static int m14200c(int i) {
        if (i == 65536) {
            return 1;
        }
        if (i == 131072) {
            return 2;
        }
        if (i == 262144) {
            return 3;
        }
        if (i == 524288) {
            return 4;
        }
        if (i == 1048576) {
            return 5;
        }
        if (i == 2097152) {
            return 6;
        }
        if (i == 4194304) {
            return 7;
        }
        throw new IllegalArgumentException("bad day argument: " + i);
    }

    /* renamed from: d */
    private static String m14201d(int i, int[] iArr) {
        int i2 = i == 1 ? 10 : 20;
        StringBuilder sb = new StringBuilder();
        int i3 = i - 1;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(DateUtils.getDayOfWeekString(m14200c(iArr[i4]), i2));
            sb.append(", ");
        }
        sb.append(DateUtils.getDayOfWeekString(m14200c(iArr[i3]), i2));
        return sb.toString();
    }

    /* renamed from: e */
    private static boolean m14202e(C5033s sVar) {
        int i = sVar.f15889d;
        if (i != 4) {
            return i == 5 && sVar.f15892g <= 1 && sVar.f15902q == 7;
        }
        return true;
    }
}
