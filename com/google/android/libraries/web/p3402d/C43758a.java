package com.google.android.libraries.web.p3402d;

import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.p3402d.p3403a.C43762d;
import java.util.Map;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.d.a */
/* compiled from: PG */
public final class C43758a {

    /* renamed from: a */
    public final C43762d f114119a;

    /* renamed from: b */
    private final C43271v f114120b;

    /* renamed from: c */
    private final Map f114121c;

    public C43758a(C43271v vVar, Map map) {
        C69664n.m101061g(vVar, "webImplementation");
        this.f114120b = vVar;
        this.f114121c = map;
        Object obj = map.get(vVar);
        if (obj == null) {
            String str = vVar == C43271v.WEB_LAYER ? "weblayer" : "webview";
            int i = C69649af.f186028a;
            String b = new C69657g(C43762d.class).mo61379b();
            throw new IllegalArgumentException("No " + b + " found for " + vVar + ". If this is a test, make sure you include java/com/google/android/libraries/web/" + str + "/testing:emulator_module or robolectric_module. If this is not a test, make sure you include java/com/google/android/libraries/web/" + str + ":prod_module");
        }
        this.f114119a = (C43762d) ((C69464a) obj).mo17428b();
    }
}
