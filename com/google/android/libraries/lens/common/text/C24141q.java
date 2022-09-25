package com.google.android.libraries.lens.common.text;

import android.text.BidiFormatter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.common.text.q */
/* compiled from: PG */
public final class C24141q {

    /* renamed from: a */
    private static final C58528ij f65914a = C58528ij.m90015O(Locale.CHINESE, Locale.SIMPLIFIED_CHINESE, Locale.TRADITIONAL_CHINESE, Locale.JAPANESE, Locale.KOREAN, Locale.forLanguageTag("th"), Locale.forLanguageTag("km"), Locale.forLanguageTag("my"), Locale.forLanguageTag("lo"));

    /* renamed from: a */
    public static String m44839a(C56242aw awVar, C58833ax axVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < awVar.f149801a.size(); i++) {
            sb.append(m44841c((C56235ap) awVar.f149801a.get(i), axVar));
            if (i < awVar.f149801a.size() - 1) {
                sb.append(m44840b());
            }
        }
        return m44844f(sb.toString(), axVar);
    }

    /* renamed from: b */
    public static String m44840b() {
        return String.valueOf(System.lineSeparator()).concat(String.valueOf(System.lineSeparator()));
    }

    /* renamed from: c */
    public static String m44841c(C56235ap apVar, C58833ax axVar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < apVar.f149783b.size(); i++) {
            C56233an anVar = (C56233an) apVar.f149783b.get(i);
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < anVar.f149778b.size(); i2++) {
                C56241av avVar = (C56241av) anVar.f149778b.get(i2);
                sb2.append(avVar.f149795c);
                if (i2 < anVar.f149778b.size() - 1) {
                    sb2.append(m44843e(avVar, axVar));
                }
            }
            sb.append(m44844f(sb2.toString(), axVar));
            if (i < apVar.f149783b.size() - 1 && anVar.f149778b.size() > 0) {
                sb.append(m44843e((C56241av) anVar.f149778b.get(anVar.f149778b.size() - 1), axVar));
            }
        }
        return m44844f(sb.toString(), axVar);
    }

    /* renamed from: d */
    public static String m44842d(Locale locale) {
        return true != f65914a.contains(locale) ? " " : BuildConfig.FLAVOR;
    }

    /* renamed from: e */
    public static String m44843e(C56241av avVar, C58833ax axVar) {
        if ((avVar.f149793a & 2) != 0) {
            return avVar.f149796d;
        }
        return axVar.mo56113h() ? m44842d((Locale) axVar.mo56107c()) : " ";
    }

    /* renamed from: f */
    private static String m44844f(String str, C58833ax axVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (!axVar.mo56113h()) {
            return str;
        }
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale((Locale) axVar.mo56107c()) != 1) {
            z = false;
        }
        BidiFormatter instance = BidiFormatter.getInstance(z);
        if (z) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        return instance.unicodeWrap(str, textDirectionHeuristic);
    }
}
