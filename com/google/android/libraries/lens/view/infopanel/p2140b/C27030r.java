package com.google.android.libraries.lens.view.infopanel.p2140b;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21247aq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.lens.p4702h.p4703a.p4704a.C62367d;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.r */
/* compiled from: PG */
final class C27030r implements C21247aq {

    /* renamed from: a */
    final /* synthetic */ C27031s f73677a;

    /* renamed from: b */
    private final C62367d f73678b;

    public C27030r(C27031s sVar, C62367d dVar) {
        this.f73677a = sVar;
        this.f73678b = dVar;
    }

    /* renamed from: a */
    public final void mo25924a(View view, View view2) {
        C27031s sVar = this.f73677a;
        C62367d dVar = this.f73678b;
        if (view2 == null) {
            ((C58970a) ((C58970a) C27031s.f73679a.mo56226d()).mo56372aa(49571)).mo56386p("Received null view for Elements VE logging.");
            return;
        }
        int i = (dVar.f168368a & 2) != 0 ? dVar.f168370c : -1;
        for (C27026n o : sVar.f73680b) {
            o.mo32365o(view2, new C27010a(dVar.f168369b, i));
        }
    }
}
