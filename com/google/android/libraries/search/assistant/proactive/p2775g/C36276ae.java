package com.google.android.libraries.search.assistant.proactive.p2775g;

import com.google.assistant.p3803ag.p3809c.C49074fm;
import com.google.assistant.p3803ag.p3809c.C49076fo;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.ae */
/* compiled from: PG */
public final /* synthetic */ class C36276ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C36279ah f94757a;

    /* renamed from: b */
    public final /* synthetic */ int f94758b;

    public /* synthetic */ C36276ae(C36279ah ahVar, int i) {
        this.f94757a = ahVar;
        this.f94758b = i;
    }

    public final Object apply(Object obj) {
        C49074fm fmVar;
        C36279ah ahVar = this.f94757a;
        int i = this.f94758b;
        C49076fo foVar = (C49076fo) obj;
        if (foVar != null) {
            fmVar = (C49074fm) foVar.toBuilder();
        } else {
            fmVar = (C49074fm) C49076fo.f126934b.createBuilder();
        }
        fmVar.mo53218a(i, ahVar.f94760a.mo26870b());
        return (C49076fo) fmVar.build();
    }
}
