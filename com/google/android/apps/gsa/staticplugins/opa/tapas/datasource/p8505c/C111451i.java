package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import android.content.pm.ShortcutInfo;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.i */
/* compiled from: PG */
public final /* synthetic */ class C111451i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111442as f310062a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310063b;

    /* renamed from: c */
    public final /* synthetic */ Map f310064c;

    /* renamed from: d */
    public final /* synthetic */ Map f310065d;

    public /* synthetic */ C111451i(C111442as asVar, C113405ep epVar, Map map, Map map2) {
        this.f310062a = asVar;
        this.f310063b = epVar;
        this.f310064c = map;
        this.f310065d = map2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111442as asVar = this.f310062a;
        C113405ep epVar = this.f310063b;
        Map map = this.f310064c;
        Map map2 = this.f310065d;
        ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
        if (asVar.f310034c.mo79746e(C90063do.f249486eT)) {
            C121537f fVar = C111442as.f310031a;
            C60870cx a = ((C113167by) asVar.f310039h.mo27525b()).mo99893a("getMatchingSuggestion", new C111437an(asVar, shortcutInfo, epVar, map, map2));
            fVar.mo105244m("getMatchingSuggestionLightweight", a);
            return a;
        }
        C121537f fVar2 = C111442as.f310031a;
        C60870cx i = C60856cj.m92900i(asVar.mo99151n(shortcutInfo, epVar, map, map2));
        fVar2.mo105244m("getMatchingSuggestion", i);
        return i;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
