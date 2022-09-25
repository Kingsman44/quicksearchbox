package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import android.content.pm.LauncherApps;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.d */
/* compiled from: PG */
public final /* synthetic */ class C116855d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116863l f324320a;

    /* renamed from: b */
    public final /* synthetic */ C41626a f324321b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f324322c;

    /* renamed from: d */
    public final /* synthetic */ C58495hd f324323d;

    public /* synthetic */ C116855d(C116863l lVar, C41626a aVar, C58485gu guVar, C58495hd hdVar) {
        this.f324320a = lVar;
        this.f324321b = aVar;
        this.f324322c = guVar;
        this.f324323d = hdVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116863l lVar = this.f324320a;
        C41626a aVar = this.f324321b;
        C58485gu<RootSuggestion> guVar = this.f324322c;
        C58495hd hdVar = this.f324323d;
        Optional optional = (Optional) obj;
        C58485gu o = lVar.f324337a.mo79749o(C90085ej.f250219bu);
        int sum = Collection.EL.stream(o).mapToInt(C116856e.f324324a).sum();
        int i = 0;
        int i2 = 0;
        for (RootSuggestion rootSuggestion : guVar) {
            if (i >= o.size()) {
                break;
            }
            String d = C116863l.m194167d(rootSuggestion);
            int i3 = sum - i2;
            int intValue = ((Integer) o.get(i)).intValue();
            int a = optional.isPresent() ? lVar.mo103034a(aVar, C116863l.m194168k(lVar.mo103036j(rootSuggestion, (LauncherApps) optional.get(), i3)), intValue) : 0;
            if (a <= 0 && hdVar.containsKey(d) && C116863l.m194170m(hdVar, d)) {
                a = lVar.mo103034a(aVar, C116863l.m194168k(C116869r.m194185a((C49301bt) hdVar.get(d), rootSuggestion, i3)), intValue);
            }
            if (a > 0) {
                i++;
                i2 += a;
            }
        }
        if (i2 > 0) {
            C116863l.m194169l(aVar);
        }
        return aVar;
    }
}
