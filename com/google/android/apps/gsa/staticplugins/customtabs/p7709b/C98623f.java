package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.android.libraries.p1703d.C20665u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.f */
/* compiled from: PG */
public final /* synthetic */ class C98623f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98634q f275457a;

    public /* synthetic */ C98623f(C98634q qVar) {
        this.f275457a = qVar;
    }

    public final C60870cx apply(Object obj) {
        C20665u uVar = this.f275457a.f275477h;
        if (((Boolean) obj).booleanValue() && uVar != null) {
            return C60856cj.m92900i(uVar);
        }
        C59104x c = C98634q.f275470a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CustomTabsController");
        ((C59052c) ((C59052c) c).mo56372aa(19143)).mo56386p("CCT connection not established");
        return C60856cj.m92899h(new C98629l());
    }
}
