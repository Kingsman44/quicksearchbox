package com.google.android.apps.gsa.staticplugins.p7382aj;

import com.google.android.apps.gsa.shared.p7066m.C89975an;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.aj.a */
/* compiled from: PG */
public final /* synthetic */ class C93877a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C93879b f262186a;

    public /* synthetic */ C93877a(C93879b bVar) {
        this.f262186a = bVar;
    }

    public final void run() {
        try {
            int a = (int) this.f262186a.f262189b.mo79743a(C89975an.f246589a);
            Thread.sleep((long) (a + a));
        } catch (InterruptedException e) {
            ((C59052c) ((C59052c) ((C59052c) C93879b.f262188a.mo56225c()).mo56382g(e)).mo56372aa(19208)).mo56386p("The long running test task was interrupted.");
            Thread.dumpStack();
        }
    }
}
