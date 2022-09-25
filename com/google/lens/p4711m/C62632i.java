package com.google.lens.p4711m;

import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58506ho;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58557jl;
import com.google.lens.p4707j.C62505ea;
import java.util.regex.Pattern;
import p3186j$.util.Objects;

/* renamed from: com.google.lens.m.i */
/* compiled from: PG */
public final class C62632i {

    /* renamed from: a */
    public static final C58528ij f169088a;

    /* renamed from: b */
    public static final C58512hu f169089b;

    /* renamed from: c */
    private static final Pattern f169090c = Pattern.compile("camera", 2);

    /* renamed from: d */
    private static final Pattern f169091d = Pattern.compile("^(android|com\\.android).*", 2);

    /* renamed from: e */
    private static final C58528ij f169092e;

    /* renamed from: f */
    private static final C58528ij f169093f;

    /* renamed from: g */
    private static final C58528ij f169094g;

    /* renamed from: h */
    private static final C58528ij f169095h;

    /* renamed from: i */
    private static final C58528ij f169096i;

    /* renamed from: j */
    private static final C58528ij f169097j;

    /* renamed from: k */
    private static final C58528ij f169098k;

    /* renamed from: l */
    private static final C58528ij f169099l;

    /* renamed from: m */
    private static final C58528ij f169100m;

    /* renamed from: n */
    private static final C58528ij f169101n;

    /* renamed from: o */
    private static final C58528ij f169102o;

    static {
        C58528ij L = C58528ij.m90012L("com.google.android.inputmethod.latin", "com.google.android.inputmethod.latin.dev", "com.google.android.inputmethod.latin.canary");
        f169092e = L;
        C58528ij K = C58528ij.m90011K("com.google.ar.lens", "com.google.ar.lens.dev");
        f169093f = K;
        C58528ij L2 = C58528ij.m90012L("com.google.android.GoogleCamera", "com.google.android.GoogleCameraEng", "com.google.android.apps.googlecamera.fishfood");
        f169094g = L2;
        C58528ij O = C58528ij.m90015O("com.google.android.apps.gmm", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm.dogfood", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps", new String[0]);
        f169095h = O;
        C58528ij N = C58528ij.m90014N("com.google.android.apps.chrome", "com.chrome.dev", "com.chrome.canary", "com.chrome.beta", "com.android.chrome");
        f169096i = N;
        C58526ih ihVar = new C58526ih();
        ihVar.mo55373c("com.google.android.apps.photos");
        ihVar.mo55373c("com.google.android.youtube");
        ihVar.mo55373c("com.google.android.apps.gsa.staticplugins.smartscreenshots");
        ihVar.mo55489i(O);
        ihVar.mo55489i(N);
        f169088a = ihVar.mo55486f();
        C58528ij O2 = C58528ij.m90015O("com.google.android.googlequicksearchbox", "com.google.android.apps.search.googleapp.dev", "com.google.android.apps.search.googleapp.search.dev", "com.google.android.apps.search.niu.dev", "com.google.android.apps.search.googleapp.googleappbrowser", "com.google.android.apps.search.googleapp.googleappbrowser.dev", "com.google.android.apps.search.googleapp.googleappbrowser.smoke");
        f169097j = O2;
        C58528ij K2 = C58528ij.m90011K("com.google.android.apps.translate", "com.google.android.apps.translatedebug");
        f169098k = K2;
        C58528ij N2 = C58528ij.m90014N("com.android.gallery3d", "com.oneplus.gallery", "com.coloros.gallery3d", "com.gallery20", "com.google.android.apps.lens.example");
        f169099l = N2;
        C58528ij K3 = C58528ij.m90011K("com.motorola.screenshoteditor", "com.coloros.screenshot");
        f169100m = K3;
        C58528ij K4 = C58528ij.m90011K("com.google.android.apps.nexuslauncher", "com.google.android.as");
        f169101n = K4;
        C58528ij L3 = C58528ij.m90012L("com.google.android.apps.photos", "962194608", "com.google.photos");
        f169102o = L3;
        C58506ho hoVar = new C58506ho();
        hoVar.mo55456j(C62505ea.ASSISTANT, "com.google.android.apps.gsa.staticplugins.opa");
        hoVar.mo55458l(C62505ea.CAMERA, L2);
        hoVar.mo55458l(C62505ea.CHROMIUM, N);
        hoVar.mo55458l(C62505ea.GALLERY_3P, N2);
        hoVar.mo55458l(C62505ea.GBOARD, L);
        hoVar.mo55458l(C62505ea.GOOGLE_PHOTOS, L3);
        hoVar.mo55458l(C62505ea.LENS_APP, K);
        hoVar.mo55458l(C62505ea.MAPS, O);
        hoVar.mo55456j(C62505ea.MARKETING_DEEPLINK, "com.google.android.apps.gsa.staticplugins.deeplink");
        hoVar.mo55456j(C62505ea.SCREENSHOTS, "com.google.android.apps.gsa.staticplugins.smartscreenshots");
        hoVar.mo55458l(C62505ea.SCREENSHOTS_3P, K3);
        hoVar.mo55456j(C62505ea.SHELL_APP, "com.google.android.apps.search.lens.standalone");
        hoVar.mo55458l(C62505ea.SYSTEM_UI, K4);
        hoVar.mo55458l(C62505ea.TRANSLATE, K2);
        hoVar.mo55458l(C62505ea.XGA, O2);
        hoVar.mo55456j(C62505ea.YOUTUBE, "com.google.android.youtube");
        f169089b = hoVar.mo55453g();
    }

    /* renamed from: a */
    public static C62505ea m94816a(String str) {
        if (C58837ba.m90859h(str)) {
            return C62505ea.SURFACE_UNSPECIFIED;
        }
        C58512hu huVar = f169089b;
        if (huVar.mo55425f().map.containsKey(str)) {
            return (C62505ea) C58557jl.m90133n(huVar.mo55425f().mo55423a(str));
        }
        if (f169090c.matcher(str).find()) {
            return C62505ea.CAMERA;
        }
        if (f169091d.matcher(str).find()) {
            return C62505ea.ANDROID_SYSTEM_APP;
        }
        return C62505ea.SURFACE_UNSPECIFIED;
    }

    /* renamed from: b */
    public static boolean m94817b(C58833ax axVar) {
        return ((Boolean) axVar.mo56106b(C62628e.f169084a).mo56109e(false)).booleanValue();
    }

    /* renamed from: c */
    public static boolean m94818c(C58833ax axVar) {
        return ((Boolean) axVar.mo56106b(C62626c.f169082a).mo56109e(false)).booleanValue();
    }

    /* renamed from: d */
    public static boolean m94819d(C58833ax axVar) {
        C58528ij ijVar = f169094g;
        Objects.requireNonNull(ijVar);
        return ((Boolean) axVar.mo56106b(new C62624a(ijVar)).mo56109e(false)).booleanValue();
    }

    /* renamed from: e */
    public static boolean m94820e(C58833ax axVar) {
        return ((Boolean) axVar.mo56106b(C62627d.f169083a).mo56109e(false)).booleanValue();
    }

    /* renamed from: f */
    public static boolean m94821f(C58833ax axVar) {
        return ((Boolean) axVar.mo56106b(C62631h.f169087a).mo56109e(false)).booleanValue();
    }

    /* renamed from: g */
    public static boolean m94822g(C58833ax axVar) {
        return ((Boolean) axVar.mo56106b(C62629f.f169085a).mo56109e(false)).booleanValue();
    }

    /* renamed from: h */
    public static boolean m94823h(C58833ax axVar) {
        return ((Boolean) axVar.mo56106b(C62630g.f169086a).mo56109e(false)).booleanValue();
    }

    /* renamed from: i */
    public static boolean m94824i(C58833ax axVar) {
        return ((Boolean) axVar.mo56106b(C62625b.f169081a).mo56109e(false)).booleanValue();
    }

    /* renamed from: j */
    public static boolean m94825j(C58833ax axVar) {
        return m94817b(axVar) || m94823h(axVar);
    }
}
