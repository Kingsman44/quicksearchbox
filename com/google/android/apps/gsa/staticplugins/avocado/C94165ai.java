package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ai */
/* compiled from: PG */
public final /* synthetic */ class C94165ai implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94167ak f263040a;

    /* renamed from: b */
    public final /* synthetic */ C94327n f263041b;

    public /* synthetic */ C94165ai(C94167ak akVar, C94327n nVar) {
        this.f263040a = akVar;
        this.f263041b = nVar;
    }

    public final void run() {
        C94167ak akVar = this.f263040a;
        C94327n nVar = this.f263041b;
        ((C59052c) ((C59052c) C94170an.f263048b.mo56224b()).mo56372aa(14140)).mo56386p("CallBack#onError");
        C94170an anVar = akVar.f263044a;
        anVar.f263052D = nVar;
        ((C59052c) ((C59052c) C94170an.f263048b.mo56224b()).mo56372aa(14217)).mo56386p("# onFailure onFragmentCompleted");
        if (anVar.getActivity() != null) {
            anVar.mo77318iT().mo77312a();
        }
    }
}
