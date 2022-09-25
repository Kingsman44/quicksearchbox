package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p836c;

import android.os.Bundle;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51676ah;
import com.google.assistant.p3897e.p3921j.C51677ai;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52804f;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.c.b */
/* compiled from: PG */
public final /* synthetic */ class C12755b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18100a f39904a;

    public /* synthetic */ C12755b(C18100a aVar) {
        this.f39904a = aVar;
    }

    public final Object apply(Object obj) {
        C18100a aVar = this.f39904a;
        Bundle bundle = (Bundle) obj;
        int i = C12757d.f39906b;
        if (bundle.isEmpty()) {
            return C12788a.m29055b(C52235kf.UNKNOWN, "Result is null.");
        }
        try {
            C52813ac acVar = (C52813ac) aVar.mo23589c(bundle);
            C51676ah ahVar = (C51676ah) C51677ai.f135125a.createBuilder();
            ahVar.mo58885m(C48775a.f126215g, acVar);
            return C12788a.m29054a("app_control_result", "assistant.api.client_op.AppControlResult", ahVar.build());
        } catch (C52802d e) {
            return C12788a.m29055b(C52235kf.UNKNOWN, C58837ba.m90858g(e.getMessage()));
        } catch (C52804f e2) {
            return C12788a.m29055b(C52235kf.UNKNOWN, e2.f138531a.toString());
        }
    }
}
