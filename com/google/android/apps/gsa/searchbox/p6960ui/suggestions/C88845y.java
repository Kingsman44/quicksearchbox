package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88804ao;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.y */
/* compiled from: PG */
public final class C88845y implements C89200e {

    /* renamed from: a */
    private static final C59071e f240543a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.suggestions.y");

    /* renamed from: b */
    private final ViewGroup f240544b;

    /* renamed from: c */
    private final Map f240545c = new HashMap();

    /* renamed from: d */
    private Map f240546d;

    public C88845y(ViewGroup viewGroup) {
        this.f240544b = viewGroup;
    }

    /* renamed from: a */
    public final C88803an mo82629a(int i) {
        Map map = this.f240545c;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) map.get(valueOf);
        if (list != null && !list.isEmpty()) {
            return (C88803an) list.remove(list.size() - 1);
        }
        Map map2 = this.f240546d;
        if (map2 == null) {
            return null;
        }
        C88804ao aoVar = (C88804ao) map2.get(valueOf);
        if (aoVar != null) {
            C88803an a = aoVar.mo82344a(i, this.f240544b);
            if (a == null) {
                C59104x d = f240543a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "sb.u.SugViewPool");
                ((C59052c) ((C59052c) d).mo56372aa(9986)).mo56387q("Erred while creating suggestion view for type: %d", i);
                return null;
            }
            a.mo82585s().setId(View.generateViewId());
            return a;
        }
        C58976aa aaVar = C58975e.f156826a;
        return null;
    }

    /* renamed from: b */
    public final void mo82630b(List list) {
        this.f240546d = new HashMap();
        C58801sm G = ((C58485gu) list).listIterator(0);
        while (G.hasNext()) {
            C88804ao aoVar = (C88804ao) G.next();
            for (Integer intValue : aoVar.mo82345b()) {
                int intValue2 = intValue.intValue();
                Map map = this.f240546d;
                Integer valueOf = Integer.valueOf(intValue2);
                if (map.containsKey(valueOf)) {
                    C58976aa aaVar = C58975e.f156826a;
                }
                this.f240546d.put(valueOf, aoVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo82631c(C88803an anVar) {
        if (!this.f240545c.containsKey(Integer.valueOf(anVar.mo82584r()))) {
            this.f240545c.put(Integer.valueOf(anVar.mo82584r()), new ArrayList());
        }
        ((List) this.f240545c.get(Integer.valueOf(anVar.mo82584r()))).add(anVar);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        mo82630b(((C88715p) obj).f239931c);
    }
}
