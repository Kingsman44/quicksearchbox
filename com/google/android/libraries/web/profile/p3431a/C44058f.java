package com.google.android.libraries.web.profile.p3431a;

import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.profile.Profile;
import java.util.Map;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.profile.a.f */
/* compiled from: PG */
public final class C44058f {

    /* renamed from: a */
    public final C44074i f114721a;

    /* renamed from: b */
    private final Map f114722b;

    public C44058f(Map map, C44074i iVar) {
        C69664n.m101061g(map, "cookieManagerFactories");
        this.f114722b = map;
        this.f114721a = iVar;
    }

    /* renamed from: a */
    public final C44051c mo47021a(C43271v vVar) {
        C69664n.m101061g(vVar, "webImplementation");
        Object obj = this.f114722b.get(vVar);
        if (obj != null) {
            return ((C43985b) ((C69464a) obj).mo17428b()).mo46984a(new C44053d(this, vVar, (C69577g) null));
        }
        String str = vVar == C43271v.WEB_LAYER ? "weblayer" : "webview";
        int i = C69649af.f186028a;
        String b = new C69657g(C43985b.class).mo61379b();
        throw new IllegalArgumentException("No " + b + " found for " + vVar + ". If this is a test, make sure you include java/com/google/android/libraries/web/" + str + "/testing:emulator_module or robolectric_module. If this is not a test, make sure you include java/com/google/android/libraries/web/" + str + ":prod_module");
    }

    /* renamed from: b */
    public final C44051c mo47022b(Profile profile) {
        C69664n.m101061g(profile, "profile");
        Map map = this.f114722b;
        C43271v vVar = profile.f114484b;
        Object obj = map.get(vVar);
        if (obj != null) {
            return ((C43985b) ((C69464a) obj).mo17428b()).mo46984a(new C44057e(profile, (C69577g) null));
        }
        String str = vVar == C43271v.WEB_LAYER ? "weblayer" : "webview";
        int i = C69649af.f186028a;
        String b = new C69657g(C43985b.class).mo61379b();
        throw new IllegalArgumentException("No " + b + " found for " + vVar + ". If this is a test, make sure you include java/com/google/android/libraries/web/" + str + "/testing:emulator_module or robolectric_module. If this is not a test, make sure you include java/com/google/android/libraries/web/" + str + ":prod_module");
    }
}
