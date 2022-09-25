package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.common.p4526f.C59052c;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.av */
/* compiled from: PG */
public final /* synthetic */ class C100910av implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C100911aw f281931a;

    /* renamed from: b */
    public final /* synthetic */ String f281932b;

    /* renamed from: c */
    public final /* synthetic */ C65753ak f281933c;

    public /* synthetic */ C100910av(C100911aw awVar, String str, C65753ak akVar) {
        this.f281931a = awVar;
        this.f281932b = str;
        this.f281933c = akVar;
    }

    public final void run() {
        C100911aw awVar = this.f281931a;
        try {
            ((C100719ab) awVar.f281936c.mo27525b()).mo92026j(this.f281932b, new C100909au(awVar, this.f281933c));
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C100911aw.f281934a.mo56225c()).mo56382g(th)).mo56372aa(19720)).mo56386p("Error clearing cache");
        }
    }
}
