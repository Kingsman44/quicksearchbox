package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29330dn;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60140be;
import com.google.common.p4552o.p4566l.C60141bf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.e.h */
/* compiled from: PG */
public final /* synthetic */ class C29041h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29042i f78833a;

    /* renamed from: b */
    public final /* synthetic */ int f78834b;

    public /* synthetic */ C29041h(C29042i iVar, int i) {
        this.f78833a = iVar;
        this.f78834b = i;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C29042i iVar = this.f78833a;
        int i = this.f78834b;
        ArrayList arrayList = new ArrayList();
        for (C28816c cVar : (List) obj) {
            C29392ep b = cVar.mo34484b();
            C29334dr a = cVar.mo34483a();
            if (a != null) {
                C60125aq aqVar = (C60125aq) C60126ar.f162612j.createBuilder();
                String str = b.f79682b;
                aqVar.copyOnWrite();
                C60126ar arVar = (C60126ar) aqVar.instance;
                str.getClass();
                arVar.f162614a |= 1;
                arVar.f162615b = str;
                String str2 = b.f79683c;
                aqVar.copyOnWrite();
                C60126ar arVar2 = (C60126ar) aqVar.instance;
                str2.getClass();
                arVar2.f162614a |= 4;
                arVar2.f162617d = str2;
                int i2 = a.f79503e;
                aqVar.copyOnWrite();
                C60126ar arVar3 = (C60126ar) aqVar.instance;
                arVar3.f162614a |= 2;
                arVar3.f162616c = i2;
                int size = a.f79512n.size();
                aqVar.copyOnWrite();
                C60126ar arVar4 = (C60126ar) aqVar.instance;
                arVar4.f162614a |= 8;
                arVar4.f162618e = size;
                int i3 = 0;
                for (C29328dl i4 : a.f79512n) {
                    if (C29099m.m54013i(i4)) {
                        i3++;
                    }
                }
                aqVar.copyOnWrite();
                C60126ar arVar5 = (C60126ar) aqVar.instance;
                arVar5.f162614a |= 16;
                arVar5.f162619f = i3;
                boolean isEmpty = b.f79684d.isEmpty();
                aqVar.copyOnWrite();
                C60126ar arVar6 = (C60126ar) aqVar.instance;
                arVar6.f162614a |= 32;
                arVar6.f162620g = !isEmpty;
                long j = a.f79516r;
                aqVar.copyOnWrite();
                C60126ar arVar7 = (C60126ar) aqVar.instance;
                arVar7.f162614a |= 64;
                arVar7.f162621h = j;
                String str3 = a.f79517s;
                aqVar.copyOnWrite();
                C60126ar arVar8 = (C60126ar) aqVar.instance;
                str3.getClass();
                arVar8.f162614a |= 128;
                arVar8.f162622i = str3;
                C60126ar arVar9 = (C60126ar) aqVar.build();
                C60140be beVar = (C60140be) C60141bf.f162684f.createBuilder();
                beVar.copyOnWrite();
                C60141bf bfVar = (C60141bf) beVar.instance;
                bfVar.f162686a |= 8;
                bfVar.f162690e = i;
                C29330dn dnVar = a.f79500b;
                if (dnVar == null) {
                    dnVar = C29330dn.f79488g;
                }
                if ((dnVar.f79490a & 2) != 0) {
                    C29330dn dnVar2 = a.f79500b;
                    if (dnVar2 == null) {
                        dnVar2 = C29330dn.f79488g;
                    }
                    long j2 = dnVar2.f79492c;
                    beVar.copyOnWrite();
                    C60141bf bfVar2 = (C60141bf) beVar.instance;
                    bfVar2.f162686a |= 2;
                    bfVar2.f162688c = j2 / 1000;
                } else {
                    beVar.copyOnWrite();
                    C60141bf bfVar3 = (C60141bf) beVar.instance;
                    bfVar3.f162686a |= 2;
                    bfVar3.f162688c = -1;
                }
                if (b.f79685e) {
                    beVar.copyOnWrite();
                    C60141bf bfVar4 = (C60141bf) beVar.instance;
                    bfVar4.f162687b = 1;
                    bfVar4.f162686a = 1 | bfVar4.f162686a;
                    C29330dn dnVar3 = a.f79500b;
                    if (((dnVar3 == null ? C29330dn.f79488g : dnVar3).f79490a & 4) != 0) {
                        if (dnVar3 == null) {
                            dnVar3 = C29330dn.f79488g;
                        }
                        long j3 = dnVar3.f79493d;
                        beVar.copyOnWrite();
                        C60141bf bfVar5 = (C60141bf) beVar.instance;
                        bfVar5.f162686a |= 4;
                        bfVar5.f162689d = j3 / 1000;
                    } else {
                        beVar.copyOnWrite();
                        C60141bf bfVar6 = (C60141bf) beVar.instance;
                        bfVar6.f162686a |= 4;
                        bfVar6.f162689d = -1;
                    }
                    cxVar = C60856cj.m92900i((C60141bf) beVar.build());
                } else {
                    beVar.copyOnWrite();
                    C60141bf bfVar7 = (C60141bf) beVar.instance;
                    bfVar7.f162686a |= 4;
                    bfVar7.f162689d = -1;
                    cxVar = C60922j.m93044g(iVar.f78835a.mo34583f(a), C47810es.m84963c(new C29039f(beVar)), iVar.f78838d);
                }
                arrayList.add(C60922j.m93044g(cxVar, C47810es.m84963c(new C29038e(arVar9)), iVar.f78838d));
            }
        }
        return C60856cj.m92896e(arrayList);
    }
}
