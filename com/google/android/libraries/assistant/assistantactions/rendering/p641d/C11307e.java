package com.google.android.libraries.assistant.assistantactions.rendering.p641d;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.BidiFormatter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.TypedValue;
import androidx.core.content.C1882h;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.alh;
import com.google.assistant.p3897e.p3921j.alj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.TimeZone;
import p001a.p002a.p003a.p004a.p005a.p006a.C0002b;
import p001a.p002a.p003a.p004a.p005a.p006a.C0004d;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.d.e */
/* compiled from: PG */
public final class C11307e {

    /* renamed from: a */
    private static final C59071e f36750a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.d.e");

    /* renamed from: b */
    private static final TimeZone f36751b = DesugarTimeZone.getTimeZone("UTC");

    /* renamed from: a */
    public static int m26908a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        ((C59052c) ((C59052c) f36750a.mo56225c()).mo56372aa(43302)).mo56387q("Failed to resolve color value from attribute: %d", i);
        return 0;
    }

    /* renamed from: b */
    public static int m26909b(Context context, int i, int[] iArr) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            if (typedValue.type != 3) {
                return m26908a(context, i);
            }
            ColorStateList d = C1882h.m5138d(context, typedValue.resourceId);
            if (d != null) {
                return d.getColorForState(iArr, 0);
            }
        }
        ((C59052c) ((C59052c) f36750a.mo56225c()).mo56372aa(43303)).mo56387q("Failed to resolve color value from attribute: %d", i);
        return 0;
    }

    /* renamed from: c */
    public static SpannableString m26910c(alf alf) {
        SpannableString spannableString = new SpannableString(alf.f135317b);
        for (alh alh : alf.f135318c) {
            if ((alh.f135321a & 4) != 0) {
                int max = Math.max(alh.f135322b, 0);
                int i = alh.f135323c;
                int min = i != 0 ? Math.min(i, spannableString.length()) : spannableString.length();
                alj alj = alh.f135324d;
                if (alj == null) {
                    alj = alj.f135325f;
                }
                if ((alj.f135327a & 2) != 0) {
                    C0002b bVar = alj.f135329c;
                    if (bVar == null) {
                        bVar = C0002b.f0f;
                    }
                    spannableString.setSpan(new ForegroundColorSpan(Color.argb((int) (((bVar.f2a & 8) != 0 ? bVar.f6e : 1.0f) * 255.0f), (int) (bVar.f3b * 255.0f), (int) (bVar.f4c * 255.0f), (int) (bVar.f5d * 255.0f))), max, min, 0);
                }
                if ((alj.f135327a & 1) != 0) {
                    int a = C0004d.m0a(alj.f135328b);
                    if (a == 0) {
                        a = 1;
                    }
                    spannableString.setSpan(new StyleSpan(a + -1 != 3 ? 0 : 1), max, min, 0);
                }
                if ((alj.f135327a & 4) != 0) {
                    spannableString.setSpan(new AbsoluteSizeSpan((int) alj.f135330d, true), max, min, 0);
                }
            }
        }
        return spannableString;
    }

    /* renamed from: d */
    public static C58833ax m26911d(Context context, C51098gh ghVar) {
        if (ghVar.f133012b != 1) {
            return C58836b.f156633a;
        }
        C51058ev evVar = (C51058ev) ghVar.f133013c;
        if ((evVar.f132943a & 32) == 0) {
            return m26916i(context, evVar);
        }
        try {
            Intent parseUri = Intent.parseUri(evVar.f132949g, 0);
            if ((evVar.f132943a & 1) != 0) {
                parseUri.setPackage(evVar.f132944b);
            }
            return C58833ax.m90834k(parseUri);
        } catch (URISyntaxException unused) {
            return m26916i(context, evVar);
        }
    }

    /* renamed from: e */
    public static CharSequence m26912e(C52460so soVar, Locale locale, Resources resources) {
        long j = soVar.f137717b;
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        if (j2 > 0) {
            return TextUtils.expandTemplate(m26915h(resources, 3), new CharSequence[]{String.format(locale, "%02d", new Object[]{Long.valueOf(j2)}), String.format(locale, "%02d", new Object[]{Long.valueOf(j4)}), String.format(locale, "%02d", new Object[]{Long.valueOf(j5)})});
        } else if (j4 > 0) {
            return TextUtils.expandTemplate(m26915h(resources, 2), new CharSequence[]{String.format(locale, "%02d", new Object[]{Long.valueOf(j4)}), String.format(locale, "%02d", new Object[]{Long.valueOf(j5)})});
        } else {
            return TextUtils.expandTemplate(m26915h(resources, 1), new CharSequence[]{String.format(locale, "%02d", new Object[]{Long.valueOf(j5)})});
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.text.SpannableString, android.text.Spannable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m26913f(com.google.assistant.p3897e.p3921j.C52403ql r7, java.util.Locale r8) {
        /*
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r1 = 0
            r2 = 0
            r3 = 0
            int r4 = r7.f137515b
            int r5 = r7.f137516c
            r0 = r6
            r0.set(r1, r2, r3, r4, r5)
            java.util.TimeZone r7 = f36751b
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e.m26913f(com.google.assistant.e.j.ql, java.util.Locale):java.lang.CharSequence");
    }

    /* renamed from: g */
    public static boolean m26914g(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: h */
    public static CharSequence m26915h(Resources resources, int i) {
        BidiFormatter instance = BidiFormatter.getInstance(false);
        String unicodeWrap = instance.unicodeWrap(resources.getString(R.string.fluid_action_hours_label));
        String unicodeWrap2 = instance.unicodeWrap(resources.getString(R.string.fluid_action_minutes_label));
        String unicodeWrap3 = instance.unicodeWrap(resources.getString(R.string.fluid_action_seconds_label));
        int i2 = i - 1;
        if (i2 == 0) {
            return TextUtils.expandTemplate("^1^2", new CharSequence[]{instance.unicodeWrap("^1"), m26917j(unicodeWrap3, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans"))});
        } else if (i2 != 1) {
            return TextUtils.expandTemplate("^1^4 ^2^5 ^3^6", new CharSequence[]{instance.unicodeWrap("^1"), instance.unicodeWrap("^2"), instance.unicodeWrap("^3"), m26917j(unicodeWrap, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans")), m26917j(unicodeWrap2, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans")), m26917j(unicodeWrap3, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans"))});
        } else {
            return TextUtils.expandTemplate("^1^3 ^2^4", new CharSequence[]{instance.unicodeWrap("^1"), instance.unicodeWrap("^2"), m26917j(unicodeWrap2, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans")), m26917j(unicodeWrap3, new RelativeSizeSpan(0.3846f), new TypefaceSpan("@font/google_sans"))});
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.getPackageManager().getLaunchIntentForPackage(r2.f132944b);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.common.base.C58833ax m26916i(android.content.Context r1, com.google.assistant.p3897e.p3902c.p3907c.C51058ev r2) {
        /*
            int r0 = r2.f132943a
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0017
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = r2.f132944b
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r2)
            if (r1 == 0) goto L_0x0017
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            return r1
        L_0x0017:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e.m26916i(android.content.Context, com.google.assistant.e.c.c.ev):com.google.common.base.ax");
    }

    /* renamed from: j */
    private static CharSequence m26917j(CharSequence charSequence, Object... objArr) {
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        for (int i = 0; i < 2; i++) {
            valueOf.setSpan(objArr[i], 0, valueOf.length(), 33);
        }
        return valueOf;
    }
}
