package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.ajy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ak */
/* compiled from: PG */
public final /* synthetic */ class C114389ak implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114396ar f317185a;

    /* renamed from: b */
    public final /* synthetic */ aas f317186b;

    public /* synthetic */ C114389ak(C114396ar arVar, aas aas) {
        this.f317185a = arVar;
        this.f317186b = aas;
    }

    public final Object apply(Object obj) {
        C114396ar arVar = this.f317185a;
        aas aas = this.f317186b;
        if (((C58833ax) obj).mo56113h()) {
            return C58836b.f156633a;
        }
        arVar.f317202d.mo101317a(aas, ajy.GCM, C51962fo.DELAYED_SCHEDULING_FAILED, (String) null, 0);
        return C58833ax.m90834k(aas.f134670h);
    }
}
