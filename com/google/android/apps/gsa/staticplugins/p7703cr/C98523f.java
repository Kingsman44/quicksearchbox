package com.google.android.apps.gsa.staticplugins.p7703cr;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C89997bc;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.p1646ay.C19602d;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cr.f */
/* compiled from: PG */
public final class C98523f extends C19602d {

    /* renamed from: a */
    static final C58495hd f275097a;

    /* renamed from: b */
    private static final C59071e f275098b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cr.f");

    /* renamed from: c */
    private static final C58528ij f275099c = C58528ij.m90014N("opa_wake_up_with_assistant_enabled", "opa_clock_xpromo_timer_enabled", "opa_clock_xpromo_alarm_enabled", "shell_app_launcher_icon_shortcuts_enabled", "opa_settings_udc_entry_point_enabled");

    /* renamed from: d */
    private static final C58495hd f275100d;

    /* renamed from: e */
    private static final C58528ij f275101e = C58528ij.m90013M("amb_chips_opt_in_value", "lens_oem_availability", "ar_stickers_availability", "google_assistant_plugin_aap_availability");

    /* renamed from: f */
    private final C86124t f275102f;

    /* renamed from: g */
    private final C86338r f275103g;

    /* renamed from: h */
    private final Context f275104h;

    /* renamed from: i */
    private final C69464a f275105i;

    /* renamed from: j */
    private final Map f275106j;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("qsb.superg.animation", "qsb_animation_extension");
        gzVar.mo55429h("nga_enabled", "nga_public_value_extension");
        gzVar.mo55429h("lens_oem_availability", "lens_oem_entry_public_value");
        gzVar.mo55429h("ar_stickers_availability", "ar_stickers_availability_public_value");
        gzVar.mo55429h("opa_deferred_setup_wizard", "opa_deferred_setup_wizard_extension");
        gzVar.mo55429h("opa_setup_availability", "opa_eligibility_public_value");
        gzVar.mo55429h("opa_setup_done", "opa_eligibility_public_value");
        gzVar.mo55429h("opa_app_integration_data", "app_integration_public_value");
        gzVar.mo55429h("amb_chips_opt_in_value", "amb_chips_extension");
        gzVar.mo55429h("google_assistant_plugin_aap_availability", "google_assistant_plugin_public_value_extension");
        if (Build.MODEL.startsWith("Pixel")) {
            gzVar.mo55429h("opa_dreamliner_availability", "opa_dreamliner_availability_extension");
            gzVar.mo55429h("opa_dreamliner_ineligible_account", "opa_dreamliner_availability_extension");
            gzVar.mo55429h("opa_dreamliner_onboarding", "opa_dreamliner_onboarding_extension");
            gzVar.mo55429h("opa_eligibility_for_dreamliner", "opa_eligibility_public_value");
            gzVar.mo55429h("opa_eligibility_for_pixel_tips", "opa_eligibility_public_value");
        }
        f275100d = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("opa_wake_up_with_assistant_deeplink_data_uri", new C98522e(C90014bt.f247814oa));
        gzVar2.mo55429h("shell_app_my_day_shortcut_enabled", new C98520c(C90014bt.f247597kE));
        gzVar2.mo55429h("start_assistant_with_my_day_deeplink_datauri", new C98522e(C90014bt.f247666lU));
        gzVar2.mo55429h("shell_app_explore_shortcut_enabled", new C98520c(C90014bt.f247594kB));
        gzVar2.mo55429h("start_explore_deeplink_datauri", new C98522e(C90014bt.f247667lV));
        gzVar2.mo55429h("shell_app_google_lens_shortcut_enabled", new C98520c(C90014bt.f247595kC));
        gzVar2.mo55429h("start_google_lens_deeplink_datauri", new C98522e(C90014bt.f247668lW));
        gzVar2.mo55429h("shell_app_assistant_settings_shortcut_enabled", new C98520c(C90014bt.f247593kA));
        gzVar2.mo55429h("start_assistant_settings_deeplink_datauri", new C98522e(C90014bt.f247665lT));
        gzVar2.mo55429h("roti_for_chrome_enabled", new C98519b());
        gzVar2.mo55429h("lens_in_pixel_launcher_enabled", new C98520c(C89997bc.f246822s));
        gzVar2.mo55429h("lens_in_pixel_launcher_visible", new C98520c(C89997bc.f246823t));
        f275097a = gzVar2.mo55427f(false);
    }

    public C98523f(C86124t tVar, C86338r rVar, Context context, C69464a aVar, Map map) {
        this.f275102f = tVar;
        this.f275103g = rVar;
        this.f275104h = context;
        this.f275105i = aVar;
        this.f275106j = map;
    }

    /* renamed from: a */
    public final String mo24914a(Uri uri) {
        return "text/plain";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (((com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e) r6.f275105i.mo17428b()).f59951a.mo119084c(r7) == false) goto L_0x004a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor mo24915b(android.net.Uri r7, java.lang.String[] r8) {
        /*
            r6 = this;
            r8 = 22
            com.google.android.apps.gsa.p5846e.C74507e.m120471g(r8)
            r8 = 1
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.String r1 = "value"
            r2 = 0
            r0[r2] = r1
            r1 = 0
            if (r7 != 0) goto L_0x0012
        L_0x0010:
            r3 = r1
            goto L_0x0022
        L_0x0012:
            java.lang.String r3 = r7.getPath()
            if (r3 == 0) goto L_0x0010
            int r4 = r3.length()
            if (r4 <= r8) goto L_0x0010
            java.lang.String r3 = r3.substring(r8)
        L_0x0022:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0029
            return r1
        L_0x0029:
            java.lang.String r4 = "calling_package_name"
            java.lang.String r7 = r7.getQueryParameter(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L_0x004a
            g.a.a r4 = r6.f275105i
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.libraries.gcoreclient.h.c.e r4 = (com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e) r4
            android.content.Context r5 = r6.f275104h
            r5.getPackageManager()
            com.google.android.gms.common.ac r4 = r4.f59951a
            boolean r4 = r4.mo119084c(r7)
            if (r4 != 0) goto L_0x0052
        L_0x004a:
            com.google.common.b.ij r4 = f275101e
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x00b3
        L_0x0052:
            com.google.common.b.hd r4 = f275097a
            boolean r5 = r4.containsKey(r3)
            if (r5 == 0) goto L_0x0067
            java.lang.Object r4 = r4.get(r3)
            com.google.android.apps.gsa.staticplugins.cr.d r4 = (com.google.android.apps.gsa.staticplugins.p7703cr.C98521d) r4
            com.google.android.apps.gsa.search.core.i.t r5 = r6.f275102f
            java.lang.String r4 = r4.mo91159b(r5)
            goto L_0x0068
        L_0x0067:
            r4 = r1
        L_0x0068:
            if (r4 != 0) goto L_0x0087
            com.google.common.b.ij r4 = f275099c
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0086
            com.google.android.apps.gsa.search.core.preferences.r r4 = r6.f275103g
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0086
            com.google.android.apps.gsa.search.core.preferences.r r4 = r6.f275103g     // Catch:{ ClassCastException -> 0x0085 }
            boolean r4 = r4.getBoolean(r3, r2)     // Catch:{ ClassCastException -> 0x0085 }
            java.lang.String r4 = java.lang.Boolean.toString(r4)     // Catch:{ ClassCastException -> 0x0085 }
            goto L_0x0087
        L_0x0085:
        L_0x0086:
            r4 = r1
        L_0x0087:
            if (r4 != 0) goto L_0x00a3
            com.google.common.b.hd r4 = f275100d
            java.lang.Object r4 = r4.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0094
            goto L_0x00a4
        L_0x0094:
            java.util.Map r5 = r6.f275106j
            java.lang.Object r4 = r5.get(r4)
            com.google.android.apps.gsa.shared.al.a r4 = (com.google.android.apps.gsa.shared.p6988al.C89193a) r4
            if (r4 == 0) goto L_0x00a4
            java.lang.String r1 = r4.mo19980a(r3, r7)
            goto L_0x00a4
        L_0x00a3:
            r1 = r4
        L_0x00a4:
            android.database.MatrixCursor r7 = new android.database.MatrixCursor
            r7.<init>(r0)
            if (r1 == 0) goto L_0x00b2
            java.lang.String[] r8 = new java.lang.String[r8]
            r8[r2] = r1
            r7.addRow(r8)
        L_0x00b2:
            return r7
        L_0x00b3:
            com.google.common.f.e r8 = f275098b
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r0 = "query: calling package signature check failed=%s"
            r2 = 30731(0x780b, float:4.3063E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56389s(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7703cr.C98523f.mo24915b(android.net.Uri, java.lang.String[]):android.database.Cursor");
    }
}
