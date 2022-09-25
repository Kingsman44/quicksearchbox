package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11675af;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16345as;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16347au;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.C16408a;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.p */
/* compiled from: PG */
public final /* synthetic */ class C16321p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16325t f48012a;

    /* renamed from: b */
    public final /* synthetic */ C11675af f48013b;

    public /* synthetic */ C16321p(C16325t tVar, C11675af afVar) {
        this.f48012a = tVar;
        this.f48013b = afVar;
    }

    public final C60870cx apply(Object obj) {
        C16325t tVar = this.f48012a;
        C11675af afVar = this.f48013b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92899h(new RuntimeException("Failed to register media card display into suggestion service"));
        }
        C16408a aVar = tVar.f48021a;
        C16345as asVar = (C16345as) C16347au.f48122b.createBuilder();
        asVar.mo22888a(C58495hd.m89900n(6, Integer.valueOf(((Long) tVar.f48027g.mo17428b()).intValue())));
        asVar.mo58885m(C11675af.f37664d, afVar);
        return aVar.mo22915a("coolwalk_media_card_display_id", (C16347au) asVar.build());
    }
}
