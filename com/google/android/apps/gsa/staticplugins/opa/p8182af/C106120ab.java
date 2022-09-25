package com.google.android.apps.gsa.staticplugins.opa.p8182af;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90044cw;
import com.google.assistant.p3861at.acz;
import com.google.common.p4522b.C58495hd;
import java.util.Locale;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.af.ab */
/* compiled from: PG */
final class C106120ab extends k {

    /* renamed from: a */
    final /* synthetic */ String f296138a;

    /* renamed from: b */
    final /* synthetic */ C106122ad f296139b;

    public C106120ab(C106122ad adVar, String str) {
        this.f296139b = adVar;
        this.f296138a = str;
    }

    /* renamed from: gn */
    public final void mo95294gn(Throwable th) {
        this.f296139b.f296151h = false;
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo95295go(Object obj) {
        acz acz = (acz) obj;
        C106122ad adVar = this.f296139b;
        adVar.f296151h = false;
        adVar.f296146c.f(adVar.f296149f.name, Locale.forLanguageTag(this.f296138a));
        C106122ad adVar2 = this.f296139b;
        String str = this.f296138a;
        C87565h hVar = new C87565h(adVar2.f296150g.getIntent().getExtras());
        if (adVar2.f296145b.mo79745c(C90044cw.f248739n).contains(str)) {
            hVar.f236545ap = true;
        }
        if (adVar2.f296145b.mo79746e(C90044cw.f248740o)) {
            C58495hd r = adVar2.f296145b.mo79752r(C90044cw.f248735j);
            String x = adVar2.f296145b.mo79758x(C90044cw.f248729d);
            hVar.f236560f = 3;
            hVar.f236568n = (String) Map.EL.getOrDefault(r, str, x);
        } else {
            hVar.f236560f = 2;
        }
        adVar2.f296150g.finish();
        ((C87568k) adVar2.f296153j.mo56107c()).mo81689c(adVar2.f296144a, hVar.mo81685a(), 268435456);
    }
}
