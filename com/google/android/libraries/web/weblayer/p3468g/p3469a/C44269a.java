package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import com.evernote.android.state.BuildConfig;
import org.chromium.weblayer.C72582ar;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.a */
/* compiled from: PG */
final class C44269a implements BiFunction {

    /* renamed from: a */
    final /* synthetic */ C44280h f115128a;

    public C44269a(C44280h hVar) {
        this.f115128a = hVar;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        C44283k kVar = (C44283k) obj2;
        C69664n.m101061g((C72582ar) obj, "<anonymous parameter 0>");
        C69664n.m101061g(kVar, "pageNavigationInfo");
        if (kVar.f115178i) {
            return kVar;
        }
        this.f115128a.mo47177b(kVar, BuildConfig.FLAVOR);
        return kVar.mo47192a();
    }
}
