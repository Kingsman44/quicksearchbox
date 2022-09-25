package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50704ap;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.w */
/* compiled from: PG */
public final /* synthetic */ class C106843w implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297718a;

    public /* synthetic */ C106843w(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297718a = topLevelRendererHelper;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        Map map = this.f297718a.f297687d;
        C50701am a = C50701am.m85887a(((C50704ap) obj).f131957b);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        return map.containsKey(Integer.valueOf(a.f131953N));
    }
}
