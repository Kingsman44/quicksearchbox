package com.google.android.libraries.assistant.auto.tng.gmm.p990b.p991a;

import com.google.android.apps.p453b.p457b.p460b.p462b.C9009i;
import com.google.android.apps.p453b.p457b.p460b.p462b.C9010j;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4813ah.p4814a.p4815a.C63179l;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C13579d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f41576a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f41577b;

    /* renamed from: c */
    public final /* synthetic */ String f41578c;

    /* renamed from: d */
    public final /* synthetic */ boolean f41579d;

    public /* synthetic */ C13579d(C60870cx cxVar, C60870cx cxVar2, String str, boolean z) {
        this.f41576a = cxVar;
        this.f41577b = cxVar2;
        this.f41578c = str;
        this.f41579d = z;
    }

    public final Object call() {
        String str;
        C60870cx cxVar = this.f41576a;
        C60870cx cxVar2 = this.f41577b;
        String str2 = this.f41578c;
        boolean z = this.f41579d;
        C63179l lVar = (C63179l) C60856cj.m92909r(cxVar);
        C46108a aVar = (C46108a) C60856cj.m92909r(cxVar2);
        if (!aVar.mo50210b().f121165j.equals("google")) {
            str = null;
        } else {
            str = aVar.mo50210b().f121157b;
        }
        C9009i iVar = (C9009i) C9010j.f31129g.createBuilder();
        iVar.copyOnWrite();
        C9010j jVar = (C9010j) iVar.instance;
        str2.getClass();
        jVar.f31131a |= 1;
        jVar.f31132b = str2;
        iVar.copyOnWrite();
        C9010j jVar2 = (C9010j) iVar.instance;
        jVar2.f31131a |= 2;
        jVar2.f31133c = 10;
        iVar.copyOnWrite();
        C9010j jVar3 = (C9010j) iVar.instance;
        jVar3.f31131a |= 32;
        jVar3.f31136f = !z;
        if (lVar != null) {
            iVar.copyOnWrite();
            C9010j jVar4 = (C9010j) iVar.instance;
            jVar4.f31134d = lVar;
            jVar4.f31131a |= 8;
        }
        if (str != null) {
            iVar.copyOnWrite();
            C9010j jVar5 = (C9010j) iVar.instance;
            jVar5.f31131a |= 16;
            jVar5.f31135e = str;
        }
        C9010j jVar6 = (C9010j) iVar.build();
        C58976aa aaVar = C58975e.f156826a;
        return jVar6;
    }
}
