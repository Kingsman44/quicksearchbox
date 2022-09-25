package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14746p;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14495li;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15390r;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.e */
/* compiled from: PG */
public final /* synthetic */ class C109628e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C109636m f305302a;

    /* renamed from: b */
    public final /* synthetic */ C15390r f305303b;

    public /* synthetic */ C109628e(C109636m mVar, C15390r rVar) {
        this.f305302a = mVar;
        this.f305303b = rVar;
    }

    public final Object call() {
        C109636m mVar = this.f305302a;
        C15390r rVar = this.f305303b;
        if (mVar.f305324h != C14495li.STATUS_RUNNING) {
            C59104x d = C109636m.f305314a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.FrameworkCntr");
            ((C59052c) ((C59052c) d).mo56372aa(24825)).mo56389s("stopMorris called when Morris Framework is not running. morrisStatus=%s", mVar.f305324h);
            mVar.f305320d.mo21428b(C37182a.f98006eZ.mo40805c(C62722b.FAILED_PRECONDITION), mVar.f305321e.mo21608v());
            mVar.f305321e.mo21609w();
            return false;
        }
        mVar.f305320d.mo21430d(C37182a.f98002eV.mo40813g(), mVar.f305321e.mo21608v());
        mVar.mo97931m(C14746p.m31070c(), rVar);
        mVar.f305318b.mo97934c();
        mVar.f305324h = C14495li.STATUS_STOPPED;
        mVar.f305320d.mo21430d(C37182a.f98003eW.mo40813g(), mVar.f305321e.mo21608v());
        mVar.f305322f.sendBroadcast(C109636m.m182435a("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STOPPED"));
        return true;
    }
}
