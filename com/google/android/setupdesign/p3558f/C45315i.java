package com.google.android.setupdesign.p3558f;

import android.app.Activity;
import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.C45251c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.android.setupcompat.p3550b.C45244a;
import com.google.android.setupcompat.p3550b.C45245b;
import com.google.android.setupcompat.p3550b.C45250g;
import p3186j$.util.Objects;

/* renamed from: com.google.android.setupdesign.f.i */
/* compiled from: PG */
public final class C45315i {

    /* renamed from: a */
    private static final C45245b f118377a = new C45245b("ThemeHelper");

    /* renamed from: a */
    public static boolean m80766a(Context context) {
        return C45240c.m80576m(context);
    }

    /* renamed from: b */
    public static boolean m80767b(Context context) {
        return C45240c.m80577n(context);
    }

    /* renamed from: c */
    public static boolean m80768c(Context context) {
        return C45240c.m80578o(context);
    }

    /* renamed from: d */
    public static boolean m80769d(Context context) {
        return C45240c.m80579p(context);
    }

    /* renamed from: e */
    public static boolean m80770e(Context context) {
        int i;
        if (!C45244a.m80595a()) {
            f118377a.mo49115e("Dynamic color require platform version at least S.");
            return false;
        } else if (!C45240c.m80577n(context)) {
            f118377a.mo49115e("SetupWizard does not support the dynamic color or supporting status unknown.");
            return false;
        } else {
            try {
                Activity a = C45251c.m80608a(context);
                try {
                    boolean b = C45250g.m80606b(C45251c.m80608a(context).getIntent());
                    boolean m = C45240c.m80576m(context);
                    if (b) {
                        i = true != m ? 2132150136 : 2132150135;
                    } else {
                        i = m ? 2132150147 : 2132150148;
                        f118377a.mo49112b("Return ".concat(true != m ? "SudFullDynamicColorTheme_Light" : "SudFullDynamicColorTheme_DayNight"));
                    }
                    C45245b bVar = f118377a;
                    String f = m80771f(context, R.color.sud_dynamic_color_accent_glif_v3_light);
                    String str = "n/a";
                    String f2 = C45244a.m80595a() ? m80771f(context, 17170495) : str;
                    String f3 = m80771f(context, R.color.sud_dynamic_color_accent_glif_v3_dark);
                    if (C45244a.m80595a()) {
                        str = m80771f(context, 17170490);
                    }
                    bVar.mo49111a("Gets the dynamic accentColor: [Light] " + f + ", " + f2 + ", [Dark] " + f3 + ", " + str);
                } catch (IllegalArgumentException e) {
                    f118377a.mo49113c((String) Objects.requireNonNull(e.getMessage()));
                    i = 0;
                }
                if (i != 0) {
                    a.setTheme(i);
                    return true;
                }
                f118377a.mo49115e("Error occurred on getting dynamic color theme.");
                return false;
            } catch (IllegalArgumentException e2) {
                f118377a.mo49113c((String) Objects.requireNonNull(e2.getMessage()));
                return false;
            }
        }
    }

    /* renamed from: f */
    private static String m80771f(Context context, int i) {
        return String.format("#%06X", new Object[]{Integer.valueOf(context.getResources().getColor(i) & 16777215)});
    }
}
