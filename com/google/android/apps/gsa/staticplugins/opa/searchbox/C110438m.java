package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.content.Context;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.querybuilderv2.C88667a;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.p3203ui.logging.C41706a;
import com.google.android.libraries.searchbox.p3203ui.logging.ParcelableQueryBuilderTap;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4575r.C60757n;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.m */
/* compiled from: PG */
public final class C110438m extends C110435j {

    /* renamed from: b */
    private final C88667a f307871b;

    public C110438m(Context context, C88667a aVar) {
        super(context);
        this.f307871b = aVar;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 50;
    }

    /* renamed from: k */
    public final void mo82352k(C88803an anVar, Suggestion suggestion) {
        String v = suggestion.mo44269v();
        int length = this.f307866a.mo44287a().length();
        this.f240009o.mo82430c(v);
        this.f307871b.mo82351a(this.f307866a.mo44287a().length() - length);
        C41706a aVar = new C41706a();
        aVar.mo44308d(C60757n.m92752m(suggestion.f108925z));
        aVar.mo44307c(this.f307866a.mo44287a().length() - length);
        aVar.mo44306b(((OpaSuggestionView) anVar).f307806a.f240430a);
        ParcelableQueryBuilderTap a = aVar.mo44305a();
        C88698g gVar = this.f240012r;
        C89205j jVar = gVar.f239815b;
        if (jVar != null) {
            ArrayList t = jVar.mo83180t();
            if (t == null) {
                t = new ArrayList();
                C89205j jVar2 = gVar.f239815b;
                Object obj = jVar2.f241828a;
                if (obj != null) {
                    synchronized (obj) {
                        jVar2.mo83163c().putParcelableArrayList("QUERY_BUILDER_CHIP_TAP", t);
                    }
                } else {
                    jVar2.mo83163c().putParcelableArrayList("QUERY_BUILDER_CHIP_TAP", t);
                }
            }
            t.add(a);
            return;
        }
        C59104x c = C88698g.f239814a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "sb.u.Logging");
        ((C59052c) ((C59052c) c).mo56372aa(9981)).mo56386p("SearchboxStateAccessor is null");
    }
}
