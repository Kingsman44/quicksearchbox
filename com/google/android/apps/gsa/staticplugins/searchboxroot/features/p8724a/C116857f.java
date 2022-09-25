package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.f */
/* compiled from: PG */
public final /* synthetic */ class C116857f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116863l f324325a;

    /* renamed from: b */
    public final /* synthetic */ C41626a f324326b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f324327c;

    public /* synthetic */ C116857f(C116863l lVar, C41626a aVar, C58485gu guVar) {
        this.f324325a = lVar;
        this.f324326b = aVar;
        this.f324327c = guVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116863l lVar = this.f324325a;
        C41626a aVar = this.f324326b;
        C58495hd hdVar = (C58495hd) obj;
        Iterator it = this.f324327c.iterator();
        while (true) {
            if (it.hasNext()) {
                RootSuggestion rootSuggestion = (RootSuggestion) it.next();
                String d = C116863l.m194167d(rootSuggestion);
                if (d != null && hdVar.containsKey(d) && C116863l.m194170m(hdVar, d) && lVar.mo103034a(aVar, C116869r.m194185a((C49301bt) hdVar.get(d), rootSuggestion, 0), 10) > 0) {
                    C116863l.m194169l(aVar);
                    break;
                }
            } else {
                break;
            }
        }
        return aVar;
    }
}
