package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.h.p */
/* compiled from: PG */
public final /* synthetic */ class C39597p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39605x f104242a;

    public /* synthetic */ C39597p(C39605x xVar) {
        this.f104242a = xVar;
    }

    public final C60870cx apply(Object obj) {
        C39605x xVar = this.f104242a;
        Exception exc = (Exception) obj;
        if (xVar.f104266m.mo56113h()) {
            ((C59052c) ((C59052c) C39605x.f104254a.mo56226d()).mo56372aa(53719)).mo56386p("Something wrong when opening a listening session. Try to close it!");
            ((C37659hf) xVar.f104266m.mo56107c()).mo41058b();
        }
        xVar.mo41950b(8);
        throw exc;
    }
}
