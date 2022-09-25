package com.google.android.libraries.lens.view.p2077as;

import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.lens.p4711m.C62632i;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.as.a */
/* compiled from: PG */
public final class C25475a {

    /* renamed from: a */
    private final C26244b f69420a;

    public C25475a(C26244b bVar) {
        this.f69420a = bVar;
    }

    /* renamed from: a */
    public final boolean mo30509a(C27232l lVar, C56280cg cgVar) {
        if (!this.f69420a.mo31462g(C26239a.SELECTION_STATE_ENABLED)) {
            return false;
        }
        if (this.f69420a.mo31462g(C26239a.EDUCATION_SELECTION_STATE_ENABLED)) {
            return C28130s.m52412c(cgVar, C56306df.EDUCATION);
        }
        if (this.f69420a.mo31462g(C26239a.SELECTION_STATE_FOR_TRANSLATE_APP_ENTRY_POINT_DISABLED) && C62632i.m94823h(lVar.mo32701h())) {
            return false;
        }
        if (this.f69420a.mo31462g(C26239a.SELECTION_STATE_IN_TEXT_FILTER_DISABLED) && C28130s.m52412c(cgVar, C56306df.TEXT)) {
            return false;
        }
        if (!this.f69420a.mo31462g(C26239a.SELECTION_STATE_IN_TRANSLATE_FILTER_DISABLED) || !C28130s.m52412c(cgVar, C56306df.TRANSLATE)) {
            return true;
        }
        return false;
    }
}
