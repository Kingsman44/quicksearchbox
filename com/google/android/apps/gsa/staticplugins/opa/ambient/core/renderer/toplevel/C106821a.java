package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import android.util.Pair;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.a */
/* compiled from: PG */
public final /* synthetic */ class C106821a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297692a;

    public /* synthetic */ C106821a(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297692a = topLevelRendererHelper;
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
        TopLevelRendererHelper topLevelRendererHelper = this.f297692a;
        Pair pair = (Pair) obj;
        if (pair.first == null) {
            ((C58970a) ((C58970a) topLevelRendererHelper.f297684a.mo56226d()).mo56372aa(23325)).mo56386p("detailsRendererProvider is null, filtering out...");
        }
        return pair.first != null;
    }
}
