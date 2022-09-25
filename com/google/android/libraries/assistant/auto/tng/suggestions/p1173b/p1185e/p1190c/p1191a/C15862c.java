package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1190c.p1191a;

import com.google.android.apps.auto.p450a.p451a.C8863ah;
import com.google.android.apps.auto.p450a.p451a.C8877av;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15803m;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a.C15829o;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.C15838a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1190c.C15859a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.c.a.c */
/* compiled from: PG */
public final class C15862c implements C15859a, C15838a {

    /* renamed from: b */
    private static final C58528ij f47113b = C58528ij.m90011K("com.google.android.apps.maps", "com.google.android.apps.gmm");

    /* renamed from: a */
    public C58833ax f47114a = C58836b.f156633a;

    /* renamed from: c */
    private final C60887da f47115c;

    public C15862c(C60887da daVar) {
        this.f47115c = daVar;
    }

    /* renamed from: a */
    public final C15785a mo22584a() {
        return C15803m.f47033c;
    }

    /* renamed from: b */
    public final C60870cx mo22585b(C15829o oVar) {
        C15861b bVar = new C15861b(this, oVar);
        return C60856cj.m92904m(C47810es.m84978r(bVar), this.f47115c);
    }

    /* renamed from: c */
    public final void mo22594c(C8877av avVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = avVar.f30817b;
        if (this.f47114a.mo56113h() && (avVar.f30816a & 2) != 0) {
            C8863ah ahVar = avVar.f30819d;
            if (ahVar == null) {
                ahVar = C8863ah.f30783c;
            }
            if (f47113b.contains(ahVar.f30785a) && ((Boolean) ((C15829o) this.f47114a.mo56107c()).mo22578a().mo56106b(new C15860a(avVar)).mo56109e(true)).booleanValue()) {
                ((C15829o) this.f47114a.mo56107c()).mo22579b(avVar);
            }
        }
    }
}
