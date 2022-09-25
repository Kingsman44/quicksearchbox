package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p417d.p418a.C8586m;
import com.google.p395al.p417d.p418a.C8588o;

/* renamed from: com.google.android.apps.gsa.search.core.p.be */
/* compiled from: PG */
final class C86222be extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ C8586m f232998a;

    /* renamed from: b */
    final /* synthetic */ C86224bg f232999b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86222be(C86224bg bgVar, C8586m mVar) {
        super("onLocationPromptMetadata", 2, 0);
        this.f232999b = bgVar;
        this.f232998a = mVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C86224bg.f233001i.mo56225c()).mo56382g(th)).mo56372aa(7756)).mo56386p("Failed to check whether to disable classic location prompting.");
        this.f232999b.f233010k.mo79920ak();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C8586m mVar;
        if (((Boolean) obj).booleanValue() || (mVar = this.f232998a) == null || (mVar.f29716a & 2) == 0) {
            this.f232999b.f233010k.mo79920ak();
            return;
        }
        C86246cb cbVar = this.f232999b.f233010k;
        C8588o oVar = mVar.f29718c;
        if (oVar == null) {
            oVar = C8588o.f29719c;
        }
        cbVar.mo79919aj(oVar);
    }
}
