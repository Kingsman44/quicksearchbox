package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.j */
/* compiled from: PG */
public final /* synthetic */ class C98627j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C98634q f275462a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f275463b;

    public /* synthetic */ C98627j(C98634q qVar, C60870cx cxVar) {
        this.f275462a = qVar;
        this.f275463b = cxVar;
    }

    public final void run() {
        C98634q qVar = this.f275462a;
        if (this.f275463b.cancel(true)) {
            C59104x c = C98634q.f275470a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CustomTabsController");
            ((C59052c) ((C59052c) c).mo56372aa(19144)).mo56388r("Connection to CCT service exceeded the timeout: %d ms", C98634q.f275471b);
            qVar.mo91234f();
        }
    }
}
