package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6307af.C80597h;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.p */
/* compiled from: PG */
public final /* synthetic */ class C78327p implements Function {

    /* renamed from: a */
    public final /* synthetic */ C78335x f215644a;

    /* renamed from: b */
    public final /* synthetic */ Locale f215645b;

    /* renamed from: c */
    public final /* synthetic */ Duration f215646c;

    public /* synthetic */ C78327p(C78335x xVar, Locale locale, Duration duration) {
        this.f215644a = xVar;
        this.f215645b = locale;
        this.f215646c = duration;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C78335x xVar = this.f215644a;
        C80597h hVar = (C80597h) obj;
        C60870cx e = C90877ak.m148471e(xVar.f215661e.mo28202b("[NGA] onSuggestionsForInvocation", new C78325n(hVar, this.f215645b)), this.f215646c.toMillis(), TimeUnit.MILLISECONDS, xVar.f215661e);
        String c = hVar.mo74363c();
        C90875ai.m148465b(C78321j.f215636a, e, xVar.f215661e, "[NGA] collectorTimeout").mo85223a(new C78326o(xVar, c));
        return e;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
