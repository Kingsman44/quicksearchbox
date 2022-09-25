package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8746n.p8749c;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C16994a;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17035ab;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17039af;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17043aj;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.n.c.a */
/* compiled from: PG */
final class C117013a extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C117016d f324842a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117013a(C117016d dVar) {
        super("sb.v.u.LiteSuggestSourc", "initializing", 1, 8);
        this.f324842a = dVar;
    }

    public final void run() {
        C117016d dVar = this.f324842a;
        C17043aj ajVar = (C17043aj) C17044ak.f49650c.createBuilder();
        C17035ab a = C16994a.m34087a(dVar.f324852g);
        a.copyOnWrite();
        C17036ac acVar = (C17036ac) a.instance;
        C17036ac acVar2 = C17036ac.f49640d;
        acVar.f49642a |= 2;
        acVar.f49644c = "*";
        ajVar.copyOnWrite();
        C17044ak akVar = (C17044ak) ajVar.instance;
        C17036ac acVar3 = (C17036ac) a.build();
        acVar3.getClass();
        akVar.f49653b = acVar3;
        akVar.f49652a |= 1;
        C17044ak akVar2 = (C17044ak) ajVar.build();
        C17039af afVar = (C17039af) dVar.f324850e.mo27525b();
        if (afVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        dVar.f324848c.mo85142g(afVar.mo23172b(akVar2), new C117015c(dVar));
    }
}
