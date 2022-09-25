package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91833a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91834b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7251g.C91835c;
import com.google.android.apps.gsa.sidekick.shared.util.C91994m;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104502as;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104503at;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c.C104505av;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.dc */
/* compiled from: PG */
public final /* synthetic */ class C104616dc implements C104655eo {

    /* renamed from: a */
    public final /* synthetic */ C104627dn f291244a;

    /* renamed from: b */
    public final /* synthetic */ Object f291245b;

    public /* synthetic */ C104616dc(C104627dn dnVar, Object obj) {
        this.f291244a = dnVar;
        this.f291245b = obj;
    }

    /* renamed from: a */
    public final void mo94263a() {
        C104627dn dnVar = this.f291244a;
        ((C23193m) dnVar.f291269b.mo94217l()).mo28653g((C23056g) this.f291245b);
        C91833a aVar = dnVar.f291272e;
        long b = C91994m.m150995b(dnVar.f291275h);
        C91834b bVar = (C91834b) C91835c.f256110a.createBuilder();
        C62940bt btVar = C104505av.f290661b;
        C104502as asVar = (C104502as) C104503at.f290655d.createBuilder();
        asVar.copyOnWrite();
        C104503at atVar = (C104503at) asVar.instance;
        atVar.f290657a |= 1;
        atVar.f290658b = true;
        bVar.mo58885m(btVar, (C104503at) asVar.build());
        aVar.mo86311b(b, "FullCardController-vog-dismissed", (C91835c) bVar.build());
    }
}
