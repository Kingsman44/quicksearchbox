package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33140a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33142c;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C33037k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C33046t f88469a;

    /* renamed from: b */
    public final /* synthetic */ C33140a f88470b;

    public /* synthetic */ C33037k(C33046t tVar, C33140a aVar) {
        this.f88469a = tVar;
        this.f88470b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C33046t tVar = this.f88469a;
        C33140a aVar = this.f88470b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C33144e eVar = tVar.f88490b;
            eVar.getClass();
            eVar.mo38548a(9);
            return C60856cj.m92900i(Optional.empty());
        }
        String str = (String) optional.get();
        if (str != null) {
            ((C33142c) aVar).f88675b = str;
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(Optional.empty());
        }
        throw new NullPointerException("Null resolvedContactName");
    }
}
