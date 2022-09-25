package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123719am;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.co */
/* compiled from: PG */
public final /* synthetic */ class C14854co implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C14856cq f44714a;

    public /* synthetic */ C14854co(C14856cq cqVar) {
        this.f44714a = cqVar;
    }

    public final Object apply(Object obj) {
        C14856cq cqVar = this.f44714a;
        C14782b bVar = (C14782b) obj;
        C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
        C62940bt btVar = C123726at.f341744i;
        C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
        amVar.mo106109a(cqVar.mo21779m());
        amVar.copyOnWrite();
        C123726at atVar = (C123726at) amVar.instance;
        atVar.f341750e = 3;
        atVar.f341746a |= 4;
        eVar.mo58885m(btVar, (C123726at) amVar.build());
        return (C123777f) eVar.build();
    }
}
