package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8518n;

import android.content.pm.ShortcutInfo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.n.a */
/* compiled from: PG */
public final /* synthetic */ class C111641a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111643c f310406a;

    public /* synthetic */ C111641a(C111643c cVar) {
        this.f310406a = cVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
        C113414ey q = this.f310406a.mo100187q();
        q.mo100164i(shortcutInfo.getId());
        q.mo100180y(168);
        q.mo100167l(C41669ai.f108954c.intValue());
        q.mo100174s((double) shortcutInfo.getRank());
        return q.mo100156a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
