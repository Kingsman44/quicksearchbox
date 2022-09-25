package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.android.apps.gsa.nga.shared.p6349j.C81332a;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51676ah;
import com.google.assistant.p3897e.p3921j.C51677ai;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.q */
/* compiled from: PG */
public final /* synthetic */ class C93227q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93230t f259982a;

    public /* synthetic */ C93227q(C93230t tVar) {
        this.f259982a = tVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93230t tVar = this.f259982a;
        C51676ah ahVar = (C51676ah) C51677ai.f135125a.createBuilder();
        ahVar.mo58885m(C48775a.f126215g, (C52813ac) obj);
        if (tVar.f259988c.mo85405j(C90019by.f248073g)) {
            return tVar.f259987b.mo28209i(((C81332a) tVar.f259986a.get()).mo75001c(), "requestDirectActions", new C93229s(ahVar));
        }
        return C60856cj.m92900i(C22402a.m41821a("app_control_result", "assistant.api.client_op.AppControlResult", ahVar.build()));
    }
}
