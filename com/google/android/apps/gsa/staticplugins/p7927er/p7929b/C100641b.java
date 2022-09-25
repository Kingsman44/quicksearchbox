package com.google.android.apps.gsa.staticplugins.p7927er.p7929b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.er.b.b */
/* compiled from: PG */
public final /* synthetic */ class C100641b implements C90919bp {

    /* renamed from: a */
    public static final /* synthetic */ C100641b f281435a = new C100641b();

    private /* synthetic */ C100641b() {
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        Exception exc = (Exception) obj;
        C59071e eVar = C100642c.f281436a;
        if (!(exc instanceof RuntimeException)) {
            C59104x c = C100642c.f281436a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WidgetSessionC");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(33903)).mo56386p("Nonfatal exception:");
            return;
        }
        throw new RuntimeException(exc);
    }
}
