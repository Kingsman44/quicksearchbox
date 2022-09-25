package com.google.android.apps.search.assistant.verticals.p9880a.p9891g;

import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51676ah;
import com.google.assistant.p3897e.p3921j.C51677ai;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52804f;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.g.b */
/* compiled from: PG */
public final /* synthetic */ class C130393b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130394c f357329a;

    /* renamed from: b */
    public final /* synthetic */ C18100a f357330b;

    public /* synthetic */ C130393b(C130394c cVar, C18100a aVar) {
        this.f357329a = cVar;
        this.f357330b = aVar;
    }

    public final Object apply(Object obj) {
        C130394c cVar = this.f357329a;
        C18100a aVar = this.f357330b;
        Bundle bundle = (Bundle) obj;
        cVar.f357334d.mo106971a();
        try {
            C52813ac acVar = (C52813ac) aVar.mo23589c(bundle);
            C51676ah ahVar = (C51676ah) C51677ai.f135125a.createBuilder();
            ahVar.mo58885m(C48775a.f126215g, acVar);
            return C36180b.m64577a("app_control_result", "assistant.api.client_op.AppControlResult", ahVar.build());
        } catch (C52802d e) {
            return C36180b.m64579c(C52235kf.UNKNOWN, C58837ba.m90858g(e.getMessage()));
        } catch (C52804f e2) {
            return C36180b.m64579c(C52235kf.UNKNOWN, e2.f138531a.toString());
        }
    }
}
