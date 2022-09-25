package com.google.android.apps.gsa.shared.p7066m.p7067a;

import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.android.apps.gsa.shared.p7066m.C90013bs;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90071dw;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90092eq;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.m.a.b */
/* compiled from: PG */
public final class C89961b {

    /* renamed from: a */
    public static final C58495hd f246482a;

    static {
        C58490gz j = C58495hd.m89896j(100);
        C89960a.m146545c(C89968ag.f246520t, new String[]{"com.google.android.apps.googleassistant", "com.google.android.googlequicksearchbox"}, j);
        C89960a.m146543a(C90013bs.f247017a, false, j);
        C89960a.m146545c(C90071dw.f249763h, new String[]{"LENS_SERVICE_SESSION", "LENS_BACKGROUND_SERVICE_SESSION", "SMARTSPACE_GENERIC_UPDATE_SESSION"}, j);
        C89960a.m146545c(C90085ej.f250193bQ, new String[0], j);
        C89960a.m146544b(C90092eq.f250554c.f251802a, "SEkcuPN8qP4", j);
        C89960a.m146543a(C90092eq.f250555d, false, j);
        C89960a.m146543a(C90110fh.f250592Q, true, j);
        C89960a.m146543a(C90110fh.f250609aG, true, j);
        C89960a.m146544b(C90120fr.f250845l.f251802a, "qsb-android-asbl-pb", j);
        C89960a.m146545c(C90120fr.f250786Z, new String[]{"en-US", "en-GB", "en-IN", "en-AU", "en-CA", "es-ES", "de-DE", "fr-FR", "it-IT"}, j);
        C89960a.m146543a(C90120fr.f250791aD, false, j);
        C89960a.m146544b(C90120fr.f250768H.f251802a, "Action", j);
        C89960a.m146543a(C90120fr.f250761A, true, j);
        C89960a.m146545c(C90082eg.f249896aL, new String[]{"en-US", " en-AU", "en-CA", "en-GB", "en-SG", "en-IN", "en-ZA", "en-PH", "en-NZ", "en-IE", "en-PK", "en-MY", "en-HK", "en-KE", "en-DE", "en-BE", "en-BW", "en-MU", "en-NG", "en-TZ", "en-GH", "en-PG", "en-AE", "en-ZM", "en-ID", "en-TH", "en-ZW", "en-MM", "en-NL", "en-NA", "en-SA", "en-UG", "en-MT", "en-SE", "de-AT", "de-CH", "de-DE", "de-LI", "ko-KR"}, j);
        C89960a.m146543a(C90120fr.f250834az, true, j);
        f246482a = j.mo55427f(false);
    }

    /* renamed from: a */
    public static String m146546a(C90129h hVar) {
        Object obj = f246482a.get(Integer.valueOf(hVar.f251802a));
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof String[]) {
            return C58827ar.m90818c(',').mo56097d(Arrays.asList((String[]) obj));
        }
        return hVar.f251803b;
    }

    /* renamed from: b */
    public static boolean m146547b(C90048d dVar) {
        Object obj = f246482a.get(Integer.valueOf(dVar.f248757a));
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return dVar.f248758b;
    }
}
