package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.search.shared.contact.C87512aa;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.grammar.pumpkin.C66528t;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.w */
/* compiled from: PG */
public final class C98553w extends C66528t {

    /* renamed from: a */
    private static final C59071e f275203a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.w");

    /* renamed from: b */
    private final C87512aa f275204b;

    public C98553w(C87512aa aaVar) {
        this.f275204b = aaVar;
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f275204b.mo81619d(str)) {
            return C98555y.m163249a(str);
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final String mo59674b(String str) {
        if (this.f275204b.mo81619d(str)) {
            String b = this.f275204b.mo81617b(str);
            C58976aa aaVar = C58975e.f156826a;
            if (b != null) {
                return b;
            }
        }
        C59104x d = f275203a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PumpkinRelationshipVali");
        ((C59052c) ((C59052c) d).mo56372aa(30808)).mo56389s("%s is not a valid relationship name.", str);
        int i = C90755l.f253831a;
        return str;
    }
}
