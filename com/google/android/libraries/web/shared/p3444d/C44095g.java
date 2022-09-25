package com.google.android.libraries.web.shared.p3444d;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.common.base.C58880cq;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.web.shared.d.g */
/* compiled from: PG */
public final class C44095g {

    /* renamed from: a */
    private final C43269t f114777a;

    /* renamed from: b */
    private final Map f114778b;

    public C44095g(C43269t tVar, Map map) {
        this.f114777a = tVar;
        this.f114778b = map;
    }

    /* renamed from: a */
    public final Object mo47064a(Class cls) {
        C43271v c = this.f114777a.mo46385c();
        String str = true != c.equals(C43271v.WEB_VIEW) ? "weblayer" : "webview";
        C69464a aVar = (C69464a) this.f114778b.get(c);
        if (aVar != null) {
            return aVar.mo17428b();
        }
        throw new NullPointerException(C58880cq.m90965a("No %s found for %s implementation. Did you forget to add necessary WebX modules? If this is a test, make sure you are depending on `//java/com/google/android/libraries/web/%s/testing:robolectric_module` or `:emulator_module`.", cls, c, str));
    }
}
