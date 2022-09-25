package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.a */
/* compiled from: PG */
public final /* synthetic */ class C112989a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C113023i f313117a;

    public /* synthetic */ C112989a(C113023i iVar) {
        this.f313117a = iVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C113415ez ezVar = (C113415ez) obj;
        boolean b = this.f313117a.mo99820b(ezVar);
        if (!b) {
            C59104x d = C113023i.f313208a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SuggestionSectionSorter");
            ((C59052c) ((C59052c) d).mo56372aa(27894)).mo56359L("The entry %s (group=%d, type=%d) is not supported", ezVar.mo100199L(), Integer.valueOf(ezVar.mo100204d()), Integer.valueOf(ezVar.mo100206f()));
        }
        return b;
    }
}
