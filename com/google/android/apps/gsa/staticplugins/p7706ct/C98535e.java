package com.google.android.apps.gsa.staticplugins.p7706ct;

import com.google.android.apps.gsa.contacts.n;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.grammar.pumpkin.C66528t;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.e */
/* compiled from: PG */
public final class C98535e extends C66528t {

    /* renamed from: b */
    private static final C59071e f275141b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.e");

    /* renamed from: a */
    final n f275142a;

    public C98535e(n nVar) {
        this.f275142a = nVar;
    }

    /* renamed from: a */
    public final float mo59673a(String str) {
        C89949q.m146523g(1199);
        C90748e.m148224b();
        if (str.length() < 3) {
            C58976aa aaVar = C58975e.f156826a;
            return 0.0f;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        boolean e = this.f275142a.e(str);
        C59104x b = f275141b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PumpkinContactsValidato");
        ((C59052c) ((C59052c) b).mo56372aa(30779)).mo56389s("hasMatchingContacts  : %b", Boolean.valueOf(e));
        if (e) {
            return C98555y.m163249a(str);
        }
        return 0.0f;
    }
}
