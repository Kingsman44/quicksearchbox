package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14495li;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15390r;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.d */
/* compiled from: PG */
public final /* synthetic */ class C109627d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C109636m f305299a;

    /* renamed from: b */
    public final /* synthetic */ C14492lf f305300b;

    /* renamed from: c */
    public final /* synthetic */ C15390r f305301c;

    public /* synthetic */ C109627d(C109636m mVar, C14492lf lfVar, C15390r rVar) {
        this.f305299a = mVar;
        this.f305300b = lfVar;
        this.f305301c = rVar;
    }

    public final Object call() {
        C109636m mVar = this.f305299a;
        C14492lf lfVar = this.f305300b;
        C15390r rVar = this.f305301c;
        if (mVar.f305324h == C14495li.STATUS_RUNNING) {
            C59104x d = C109636m.f305314a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.FrameworkCntr");
            ((C59052c) ((C59052c) d).mo56372aa(24824)).mo56386p("startMorris called when Morris Framework is already running.");
            mVar.f305319c.mo21423a(C37182a.f98029ew.mo40805c(C62722b.FAILED_PRECONDITION));
            return false;
        }
        mVar.f305319c.mo21424b(C37182a.f98008eb.mo40813g());
        mVar.f305318b.mo97933b();
        mVar.f305324h = C14495li.STATUS_RUNNING;
        mVar.mo97931m(lfVar, rVar);
        mVar.f305319c.mo21424b(C37182a.f98009ec.mo40813g());
        mVar.f305322f.sendBroadcast(C109636m.m182435a("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STARTED"));
        return true;
    }
}
