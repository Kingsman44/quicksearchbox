package com.google.android.apps.search.assistant.platform.p9141h.p9167j;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.search.assistant.platform.p9141h.p9167j.p9168a.C121164a;
import com.google.android.apps.search.assistant.platform.p9141h.p9167j.p9168a.C121166c;
import com.google.android.apps.search.assistant.platform.p9141h.p9167j.p9168a.C121167d;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.platform.h.j.e */
/* compiled from: PG */
public final /* synthetic */ class C121171e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121172f f336668a;

    /* renamed from: b */
    public final /* synthetic */ C121167d f336669b;

    public /* synthetic */ C121171e(C121172f fVar, C121167d dVar) {
        this.f336668a = fVar;
        this.f336669b = dVar;
    }

    public final Object apply(Object obj) {
        C121166c cVar;
        C121172f fVar = this.f336668a;
        C121167d dVar = this.f336669b;
        ((C59052c) ((C59052c) C121172f.f336670a.mo56224b()).mo56372aa(35724)).mo56386p("ScreenContextOptInSettingsDataAgsaSharedPreferencesMigration running now.");
        int i = ((C86338r) fVar.f336671b.mo27525b()).getInt(C90507o.f253020j.concat(String.valueOf((String) obj)), 0);
        C121164a aVar = (C121164a) dVar.toBuilder();
        if (i == -1) {
            cVar = C121166c.REJECTED;
        } else if (i == 1) {
            cVar = C121166c.ACCEPTED;
        } else if (i != 3) {
            cVar = C121166c.UNSPECIFIED;
        } else {
            cVar = C121166c.ACCEPTED_WITH_DONATION;
        }
        aVar.copyOnWrite();
        C121167d dVar2 = (C121167d) aVar.instance;
        dVar2.f336663b = cVar.f336659e;
        dVar2.f336662a |= 1;
        return (C121167d) aVar.build();
    }
}
