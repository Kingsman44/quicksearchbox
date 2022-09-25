package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.p979a;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13499a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13510c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C13506g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13508i f41431a;

    public /* synthetic */ C13506g(C13508i iVar) {
        this.f41431a = iVar;
    }

    public final C60870cx apply(Object obj) {
        C13508i iVar = this.f41431a;
        if (((Boolean) obj).booleanValue()) {
            return iVar.mo21139b();
        }
        C59104x d = C13508i.f41432a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "LocationEtaSelector");
        ((C59052c) ((C59052c) d).mo56372aa(44877)).mo56386p("Permission requesting background location denied");
        C13510c l = C13512e.m29782l();
        ((C13499a) l).f41418k = 2;
        return C60856cj.m92900i(l.mo21131a());
    }
}
