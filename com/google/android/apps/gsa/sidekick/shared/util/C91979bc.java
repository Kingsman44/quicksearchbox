package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C8110vx;
import com.google.p375ai.p378b.C8117wd;
import com.google.p375ai.p378b.C8118we;
import com.google.p375ai.p378b.C8120wg;
import com.google.p375ai.p378b.C8122wi;
import com.google.p375ai.p378b.C8126wm;
import com.google.p375ai.p378b.C8131wr;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.bc */
/* compiled from: PG */
public final class C91979bc {

    /* renamed from: a */
    public static final int[] f256480a = {45, 90, 105, 120};

    /* renamed from: a */
    public static int m150943a(C8131wr wrVar) {
        int i = -1;
        for (C8120wg wgVar : wrVar.f28591f) {
            if ((wgVar.f28542a & 1) == 0 || wgVar.f28544c <= 0) {
                Iterator it = wgVar.f28543b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!TextUtils.isEmpty((String) it.next())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static String m150944b(Context context, long j) {
        return DateUtils.formatDateTime(context, j * 1000, 524314);
    }

    /* renamed from: c */
    public static String m150945c(Context context, long j) {
        char c;
        long j2 = 1000 * j;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j2);
        m150948f(gregorianCalendar);
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        m150948f(gregorianCalendar2);
        if (gregorianCalendar2.equals(gregorianCalendar)) {
            c = 0;
        } else {
            gregorianCalendar2.roll(6, 1);
            if (gregorianCalendar2.equals(gregorianCalendar)) {
                c = 1;
            } else {
                c = 65534;
                gregorianCalendar2.roll(6, -2);
                if (gregorianCalendar2.equals(gregorianCalendar)) {
                    c = 65535;
                }
            }
        }
        String formatDateTime = DateUtils.formatDateTime(context, j2, 1);
        if (c == 65535) {
            return context.getString(R.string.yesterday_at_time, new Object[]{formatDateTime});
        } else if (c == 0) {
            return context.getString(R.string.today_at_time, new Object[]{formatDateTime});
        } else if (c != 1) {
            return context.getString(R.string.date_at_time, new Object[]{m150944b(context, j), formatDateTime});
        } else {
            return context.getString(R.string.tomorrow_at_time, new Object[]{formatDateTime});
        }
    }

    /* renamed from: d */
    public static String m150946d(Context context, C8131wr wrVar) {
        int i;
        int i2;
        String str;
        C8110vx vxVar = C8110vx.BASKETBALL;
        int a = C8126wm.m22953a(wrVar.f28588c);
        if (a == 0) {
            a = 1;
        }
        int i3 = a - 1;
        String str2 = null;
        if (i3 == 0) {
            C8110vx a2 = C8110vx.m22949a(wrVar.f28587b);
            if (a2 == null) {
                a2 = C8110vx.BASKETBALL;
            }
            if (a2 == C8110vx.CRICKET) {
                return null;
            }
            if (wrVar.f28591f.size() > 0) {
                C8120wg wgVar = (C8120wg) wrVar.f28591f.get(wrVar.f28591f.size() - 1);
                if ((4 & wgVar.f28542a) != 0) {
                    i = wgVar.f28546e;
                } else {
                    i = wrVar.f28591f.size();
                }
                i2 = C8122wi.m22952a(wgVar.f28545d);
                if (i2 == 0) {
                    i2 = 1;
                }
            } else {
                i2 = 1;
                i = 0;
            }
            C8110vx a3 = C8110vx.m22949a(wrVar.f28587b);
            if (a3 == null) {
                a3 = C8110vx.BASKETBALL;
            }
            if (a3 == C8110vx.BASEBALL) {
                if (wrVar.f28591f.size() > 0 && i > 9) {
                    str2 = Integer.toString(i);
                }
            } else if (i2 == 2) {
                int i4 = 0;
                for (C8120wg wgVar2 : wrVar.f28591f) {
                    int a4 = C8122wi.m22952a(wgVar2.f28545d);
                    if (a4 != 0 && a4 == 2) {
                        i4++;
                    }
                }
                str2 = context.getResources().getQuantityString(R.plurals.sports_overtime_period_header, i4, new Object[]{Integer.valueOf(i4)});
            } else if (i2 == 3) {
                str2 = context.getResources().getString(R.string.shootout_abbreviation);
            }
            C8110vx a5 = C8110vx.m22949a(wrVar.f28587b);
            if (a5 == null) {
                a5 = C8110vx.BASKETBALL;
            }
            int i5 = a5 == C8110vx.SOCCER ? R.string.full_time : R.string.final_score;
            if (str2 == null) {
                return context.getResources().getString(i5);
            }
            return C91985d.m150956c(" · ", Arrays.asList(new CharSequence[]{context.getString(i5), str2})).toString();
        } else if (i3 != 1) {
            return null;
        } else {
            C8110vx a6 = C8110vx.m22949a(wrVar.f28587b);
            if (a6 == null) {
                a6 = C8110vx.BASKETBALL;
            }
            if (a6 == C8110vx.CRICKET && (wrVar.f28586a & 8192) != 0) {
                C8118we weVar = wrVar.f28600o;
                if (weVar == null) {
                    weVar = C8118we.f28532g;
                }
                int a7 = C8117wd.m22951a(weVar.f28535b);
                if (a7 == 0) {
                    a7 = 1;
                }
                if (!m150949g(wrVar) && a7 == 2) {
                    return context.getString(R.string.qp_sports_status_in_progress);
                }
                if (a7 == 1) {
                    return BuildConfig.FLAVOR;
                }
            }
            if (!m150949g(wrVar)) {
                return m150945c(context, wrVar.f28589d);
            }
            int a8 = m150943a(wrVar);
            C8120wg wgVar3 = (C8120wg) wrVar.f28591f.get(a8);
            if ((wgVar3.f28542a & 4) != 0) {
                a8 = wgVar3.f28546e;
            }
            String e = m150947e(context, a6, a8, wgVar3, wrVar.f28598m, false);
            if ((wgVar3.f28542a & 1) == 0) {
                return e;
            }
            if (a6 == C8110vx.SOCCER) {
                long j = (long) wgVar3.f28544c;
                if (a8 > 4) {
                    str = context.getString(R.string.soccer_shootout);
                } else {
                    int i6 = f256480a[a8 - 1];
                    long minutes = TimeUnit.SECONDS.toMinutes(j);
                    long j2 = (long) i6;
                    if (minutes > j2) {
                        str = context.getString(R.string.qp_soccer_time_with_extra, new Object[]{Integer.valueOf(i6), Long.valueOf(minutes - j2)});
                    } else {
                        str = context.getString(R.string.qp_soccer_time, new Object[]{Long.valueOf(minutes)});
                    }
                }
            } else {
                str = DateUtils.formatElapsedTime((long) wgVar3.f28544c);
            }
            return context.getString(R.string.qp_sports_in_progress, new Object[]{e, str});
        }
    }

    /* renamed from: e */
    public static String m150947e(Context context, C8110vx vxVar, int i, C8120wg wgVar, boolean z, boolean z2) {
        int i2;
        String[] strArr;
        String[] stringArray;
        C8110vx vxVar2 = C8110vx.BASKETBALL;
        switch (vxVar.ordinal()) {
            case 0:
                if (z) {
                    if (i == 1) {
                        return context.getString(R.string.first_half);
                    }
                    if (i != 2) {
                        return context.getString(R.string.overtime);
                    }
                    return context.getString(R.string.second_half);
                }
                break;
            case 1:
                break;
            case 2:
                if (wgVar.f28543b.size() < 2 || TextUtils.isEmpty((String) wgVar.f28543b.get(1))) {
                    if (z2) {
                        stringArray = context.getResources().getStringArray(R.array.baseball_innings);
                    } else {
                        stringArray = context.getResources().getStringArray(R.array.qp_top_baseball_innings);
                    }
                    i2 = R.string.qp_top_baseball_inning;
                } else {
                    if (z2) {
                        strArr = context.getResources().getStringArray(R.array.baseball_innings);
                    } else {
                        strArr = context.getResources().getStringArray(R.array.qp_bottom_baseball_innings);
                    }
                    i2 = R.string.qp_bottom_baseball_inning;
                }
                if (i <= strArr.length) {
                    return strArr[i - 1];
                }
                return context.getString(i2, new Object[]{Integer.valueOf(i)});
            case 3:
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return context.getString(R.string.overtime);
                        }
                        if (z2) {
                            return context.getString(R.string.third_period);
                        }
                        return context.getString(R.string.third_period_abbrev);
                    } else if (z2) {
                        return context.getString(R.string.second_period);
                    } else {
                        return context.getString(R.string.second_period_abbrev);
                    }
                } else if (z2) {
                    return context.getString(R.string.first_period);
                } else {
                    return context.getString(R.string.first_period_abbrev);
                }
            case 4:
            case 5:
                if (i == 1) {
                    return context.getString(R.string.first_half);
                }
                if (i != 2) {
                    return context.getString(R.string.overtime);
                }
                return context.getString(R.string.second_half);
            case 6:
                if (i == 1) {
                    return context.getString(R.string.cricket_first_innings);
                }
                if (i == 2) {
                    return context.getString(R.string.cricket_second_innings);
                }
                return context.getString(R.string.current_inning, new Object[]{Integer.valueOf(i)});
            default:
                return context.getString(R.string.current_period, new Object[]{Integer.valueOf(i)});
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return context.getString(R.string.overtime);
                    }
                    if (z2) {
                        return context.getString(R.string.fourth_quarter);
                    }
                    return context.getString(R.string.fourth_quarter_abbrev);
                } else if (z2) {
                    return context.getString(R.string.third_quarter);
                } else {
                    return context.getString(R.string.third_quarter_abbrev);
                }
            } else if (z2) {
                return context.getString(R.string.second_quarter);
            } else {
                return context.getString(R.string.second_quarter_abbrev);
            }
        } else if (z2) {
            return context.getString(R.string.first_quarter);
        } else {
            return context.getString(R.string.first_quarter_abbrev);
        }
    }

    /* renamed from: f */
    private static void m150948f(GregorianCalendar gregorianCalendar) {
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
    }

    /* renamed from: g */
    private static boolean m150949g(C8131wr wrVar) {
        int a = m150943a(wrVar);
        return a >= 0 && a < wrVar.f28591f.size();
    }
}
