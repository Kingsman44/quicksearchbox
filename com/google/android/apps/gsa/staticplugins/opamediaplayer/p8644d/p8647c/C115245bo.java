package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.bo */
/* compiled from: PG */
public final /* synthetic */ class C115245bo implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115274cq f319786a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f319787b;

    public /* synthetic */ C115245bo(C115274cq cqVar, Runnable runnable) {
        this.f319786a = cqVar;
        this.f319787b = runnable;
    }

    public final void run() {
        C115274cq cqVar = this.f319786a;
        Runnable runnable = this.f319787b;
        C59104x b = C115274cq.f319847a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageC");
        ((C59052c) ((C59052c) b).mo56372aa(29800)).mo56389s("URL loaded in webview: %s", ((C23251a) cqVar.f319849c.mo102020x()).f63720e);
        runnable.run();
    }
}
