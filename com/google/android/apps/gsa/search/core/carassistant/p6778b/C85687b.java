package com.google.android.apps.gsa.search.core.carassistant.p6778b;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.b.b */
/* compiled from: PG */
public final /* synthetic */ class C85687b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C85694i f231717a;

    /* renamed from: b */
    public final /* synthetic */ int f231718b;

    public /* synthetic */ C85687b(int i, C85694i iVar) {
        this.f231718b = i;
        this.f231717a = iVar;
    }

    public final Object apply(Object obj) {
        int i = this.f231718b;
        C85694i iVar = this.f231717a;
        C85690e eVar = (C85690e) ((C85692g) obj).toBuilder();
        iVar.getClass();
        eVar.copyOnWrite();
        C85692g gVar = (C85692g) eVar.instance;
        C62995dn dnVar = gVar.f231727b;
        if (!dnVar.f170058b) {
            gVar.f231727b = dnVar.mo58980a();
        }
        gVar.f231727b.put(Integer.valueOf(i), iVar);
        return (C85692g) eVar.build();
    }
}
