package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import android.content.pm.ShortcutInfo;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.al */
/* compiled from: PG */
public final /* synthetic */ class C111435al implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111442as f310018a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310019b;

    /* renamed from: c */
    public final /* synthetic */ Map f310020c;

    public /* synthetic */ C111435al(C111442as asVar, C113405ep epVar, Map map) {
        this.f310018a = asVar;
        this.f310019b = epVar;
        this.f310020c = map;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111442as asVar = this.f310018a;
        C113405ep epVar = this.f310019b;
        Map map = this.f310020c;
        Map.Entry entry = (Map.Entry) obj;
        ShortcutInfo shortcutInfo = (ShortcutInfo) entry.getKey();
        C111444b bVar = (C111444b) entry.getValue();
        if (asVar.f310034c.mo79746e(C90063do.f249487eU)) {
            return ((C113167by) asVar.f310039h.mo27525b()).mo99893a("extractSuggestion", new C111425ab(asVar, epVar, shortcutInfo, bVar, map));
        }
        return C60856cj.m92900i(asVar.mo99150m(epVar, shortcutInfo, bVar.mo99152b(), bVar.mo99153c().doubleValue(), map));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
