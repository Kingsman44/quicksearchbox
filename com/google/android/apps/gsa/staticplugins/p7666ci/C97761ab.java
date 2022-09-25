package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.ab */
/* compiled from: PG */
public final /* synthetic */ class C97761ab implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C91006f f272968a;

    public /* synthetic */ C97761ab(C91006f fVar) {
        this.f272968a = fVar;
    }

    public final void accept(Object obj) {
        String str = (String) obj;
        this.f272968a.mo85279c("PCP database Data").mo85276a(C90752i.m148229c(str));
        C59104x b = C97764ae.f272971a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.TngEntryPoint");
        ((C59052c) ((C59052c) b).mo56372aa(30241)).mo56389s("Dumping: %s", str);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
