package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import android.util.Pair;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50704ap;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.e */
/* compiled from: PG */
public final /* synthetic */ class C106825e implements Function {

    /* renamed from: a */
    public final /* synthetic */ TopLevelRendererHelper f297696a;

    public /* synthetic */ C106825e(TopLevelRendererHelper topLevelRendererHelper) {
        this.f297696a = topLevelRendererHelper;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        TopLevelRendererHelper topLevelRendererHelper = this.f297696a;
        C50704ap apVar = (C50704ap) obj;
        u uVar = topLevelRendererHelper.f297689f;
        C50701am a = C50701am.m85887a(apVar.f131957b);
        if (a == null) {
            a = C50701am.UNKNOWN;
        }
        C60870cx f = uVar.f(a);
        C106831k kVar = new C106831k(topLevelRendererHelper, apVar);
        C60870cx g = C60922j.m93044g(f, C47810es.m84963c(kVar), topLevelRendererHelper.f297686c);
        C50701am a2 = C50701am.m85887a(apVar.f131957b);
        if (a2 == null) {
            a2 = C50701am.UNKNOWN;
        }
        return new Pair(a2, g);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
