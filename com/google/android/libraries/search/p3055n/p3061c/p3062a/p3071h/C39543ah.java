package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p2904c.C37657hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.h.ah */
/* compiled from: PG */
public final /* synthetic */ class C39543ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104112a;

    /* renamed from: b */
    public final /* synthetic */ String f104113b;

    public /* synthetic */ C39543ah(C39580br brVar, String str) {
        this.f104112a = brVar;
        this.f104113b = str;
    }

    public final C60870cx apply(Object obj) {
        C39580br brVar = this.f104112a;
        String str = this.f104113b;
        C37657hd hdVar = (C37657hd) obj;
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53754)).mo56354G("stopPushingAudio finished %s, soda state: %s", str, ((C39579bq) brVar.f104177j.get()).name());
        return brVar.mo41905b(str);
    }
}
