package com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e;

import android.content.res.Resources;
import android.text.BidiFormatter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.common.base.C58838bb;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.e.k */
/* compiled from: PG */
public final class C33233k {

    /* renamed from: a */
    private static final TimeZone f88868a = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static CharSequence m61635a(C52460so soVar, Locale locale, Resources resources) {
        long j = soVar.f137717b;
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        if (j2 > 0) {
            return TextUtils.expandTemplate(m61639e(resources, 3), new CharSequence[]{String.format(locale, "%02d", new Object[]{Long.valueOf(j2)}), String.format(locale, "%02d", new Object[]{Long.valueOf(j4)}), String.format(locale, "%02d", new Object[]{Long.valueOf(j5)})});
        } else if (j4 > 0) {
            return TextUtils.expandTemplate(m61639e(resources, 2), new CharSequence[]{String.format(locale, "%02d", new Object[]{Long.valueOf(j4)}), String.format(locale, "%02d", new Object[]{Long.valueOf(j5)})});
        } else {
            return TextUtils.expandTemplate(m61639e(resources, 1), new CharSequence[]{String.format(locale, "%02d", new Object[]{Long.valueOf(j5)})});
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.text.SpannableString, android.text.Spannable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m61636b(com.google.assistant.p3897e.p3921j.C52403ql r7, java.util.Locale r8) {
        /*
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r1 = 0
            r2 = 0
            r3 = 0
            int r4 = r7.f137515b
            int r5 = r7.f137516c
            r0 = r6
            r0.set(r1, r2, r3, r4, r5)
            java.util.TimeZone r7 = f88868a
            r6.setTimeZone(r7)
            java.lang.String r7 = "h:mm a"
            java.lang.String r7 = android.text.format.DateFormat.getBestDateTimePattern(r8, r7)
            r8 = 32
            r0 = 8202(0x200a, float:1.1493E-41)
            java.lang.String r7 = r7.replace(r8, r0)
            r8 = 97
            int r8 = r7.indexOf(r8)
            r0 = -1
            if (r8 == r0) goto L_0x0053
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r7)
            android.text.style.RelativeSizeSpan r7 = new android.text.style.RelativeSizeSpan
            r1 = 1053092427(0x3ec4ea4b, float:0.3846)
            r7.<init>(r1)
            int r1 = r8 + 1
            r2 = 33
            r0.setSpan(r7, r8, r1, r2)
            android.text.style.StyleSpan r7 = new android.text.style.StyleSpan
            r3 = 0
            r7.<init>(r3)
            r0.setSpan(r7, r8, r1, r2)
            android.text.style.TypefaceSpan r7 = new android.text.style.TypefaceSpan
            java.lang.String r3 = "@font/google_sans"
            r7.<init>(r3)
            r0.setSpan(r7, r8, r1, r2)
            r7 = r0
        L_0x0053:
            java.lang.CharSequence r7 = android.text.format.DateFormat.format(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33233k.m61636b(com.google.assistant.e.j.ql, java.util.Locale):java.lang.CharSequence");
    }

    /* renamed from: c */
    public static String m61637c(C52460so soVar, Resources resources) {
        C58838bb.m90868c(soVar.f137717b >= 0);
        long hours = TimeUnit.SECONDS.toHours(soVar.f137717b);
        long minutes = TimeUnit.SECONDS.toMinutes(soVar.f137717b) % 60;
        long j = soVar.f137717b % 60;
        if (hours > 0) {
            return resources.getString(R.string.fa_duration_hours_minutes_seconds, new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(j)});
        } else if (minutes > 0) {
            return resources.getString(R.string.fa_duration_minutes_seconds, new Object[]{Long.valueOf(minutes), Long.valueOf(j)});
        } else {
            return resources.getString(R.string.fa_duration_seconds, new Object[]{Long.valueOf(j)});
        }
    }

    /* renamed from: d */
    public static boolean m61638d(C21370a aVar, long j) {
        long b = aVar.mo26870b();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(b);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static CharSequence m61639e(Resources resources, int i) {
        BidiFormatter instance = BidiFormatter.getInstance(false);
        String unicodeWrap = instance.unicodeWrap(resources.getString(R.string.fa_hour_unit_label));
        String unicodeWrap2 = instance.unicodeWrap(resources.getString(R.string.fa_minute_unit_label));
        String unicodeWrap3 = instance.unicodeWrap(resources.getString(R.string.fa_second_unit_label));
        int i2 = i - 1;
        if (i2 == 0) {
            return TextUtils.expandTemplate("^1^2", new CharSequence[]{instance.unicodeWrap("^1"), m61642h(unicodeWrap3, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans"))});
        } else if (i2 != 1) {
            return TextUtils.expandTemplate("^1^4 ^2^5 ^3^6", new CharSequence[]{instance.unicodeWrap("^1"), instance.unicodeWrap("^2"), instance.unicodeWrap("^3"), m61642h(unicodeWrap, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans")), m61642h(unicodeWrap2, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans")), m61642h(unicodeWrap3, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans"))});
        } else {
            return TextUtils.expandTemplate("^1^3 ^2^4", new CharSequence[]{instance.unicodeWrap("^1"), instance.unicodeWrap("^2"), m61642h(unicodeWrap2, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans")), m61642h(unicodeWrap3, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans"))});
        }
    }

    /* renamed from: f */
    public static String m61640f(int i, int i2, Locale locale) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Calendar instance = Calendar.getInstance(timeZone);
        instance.set(0, 0, 0, i, i2);
        DateFormat timeInstance = DateFormat.getTimeInstance(3, locale);
        timeInstance.setTimeZone(timeZone);
        return timeInstance.format(instance.getTime());
    }

    /* renamed from: g */
    public static String m61641g(int i, int i2, int i3, Locale locale) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Calendar instance = Calendar.getInstance(timeZone);
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, i3);
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        dateInstance.setTimeZone(timeZone);
        return dateInstance.format(instance.getTime());
    }

    /* renamed from: h */
    private static CharSequence m61642h(CharSequence charSequence, Object... objArr) {
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        for (int i = 0; i < 2; i++) {
            valueOf.setSpan(objArr[i], 0, valueOf.length(), 33);
        }
        return valueOf;
    }
}
