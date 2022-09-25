package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a;

import com.google.android.libraries.assistant.accessory.p618b.C11011p;
import com.google.android.libraries.assistant.accessory.p618b.C11016u;
import com.google.android.libraries.assistant.accessory.p618b.C11017v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.r */
/* compiled from: PG */
public final /* synthetic */ class C94894r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C94868aq f265432a;

    /* renamed from: b */
    public final /* synthetic */ int f265433b;

    public /* synthetic */ C94894r(C94868aq aqVar, int i) {
        this.f265432a = aqVar;
        this.f265433b = i;
    }

    public final void accept(Object obj) {
        C94868aq aqVar = this.f265432a;
        int i = this.f265433b;
        String str = (String) obj;
        C11011p pVar = aqVar.f265295h;
        Integer valueOf = Integer.valueOf(i);
        if (pVar == null) {
            C59104x d = C11017v.f36196a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicatorUtils");
            ((C59052c) ((C59052c) d).mo56372aa(42558)).mo56386p("RemotePeerStateCommunicator is null.");
            return;
        }
        int i2 = valueOf.intValue() != 0 ? 5 : 4;
        int a = pVar.mo19407a();
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        C60856cj.m92911t(pVar.mo19411d(C11017v.m26072a(str, i2, a, valueOf)), new C11016u(), C60826bg.f164896a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
