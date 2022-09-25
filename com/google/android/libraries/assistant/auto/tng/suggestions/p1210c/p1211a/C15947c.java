package com.google.android.libraries.assistant.auto.tng.suggestions.p1210c.p1211a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16627a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16633ae;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16643h;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16645j;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16659x;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16660y;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16661z;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16685ar;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16694j;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16695k;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16696l;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a.C16697m;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16349aw;
import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C15947c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15948d f47318a;

    public /* synthetic */ C15947c(C15948d dVar) {
        this.f47318a = dVar;
    }

    public final Object apply(Object obj) {
        C16349aw awVar = (C16349aw) obj;
        boolean booleanValue = ((Boolean) this.f47318a.f47323e.mo17428b()).booleanValue();
        if (!awVar.f48130c) {
            return C16685ar.m33751a(booleanValue);
        }
        C58485gu guVar = (C58485gu) Collection.EL.stream(awVar.f48129b).filter(C16694j.f48864a).map(C16695k.f48865a).filter(C16696l.f48866a).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            return C16685ar.m33751a(booleanValue);
        }
        int i = 0;
        if (booleanValue) {
            C16627a aVar = (C16627a) C16662b.f48800l.createBuilder();
            aVar.copyOnWrite();
            C16662b bVar = (C16662b) aVar.instance;
            bVar.f48802a |= 1;
            bVar.f48803b = true;
            C16659x xVar = (C16659x) C16660y.f48794d.createBuilder();
            xVar.copyOnWrite();
            C16660y yVar = (C16660y) xVar.instance;
            yVar.f48796a |= 1;
            yVar.f48798c = true;
            int size = guVar.size();
            while (i < size) {
                C53435nu nuVar = (C53435nu) guVar.get(i);
                C16643h hVar = (C16643h) C16644i.f48739j.createBuilder();
                C16743bd b = C16697m.m33770b(nuVar);
                hVar.copyOnWrite();
                C16644i iVar = (C16644i) hVar.instance;
                C16744be beVar = (C16744be) b.build();
                beVar.getClass();
                iVar.f48748h = beVar;
                iVar.f48741a |= 256;
                hVar.copyOnWrite();
                C16644i iVar2 = (C16644i) hVar.instance;
                iVar2.f48741a |= 128;
                iVar2.f48747g = true;
                String str = nuVar.f140240e;
                hVar.copyOnWrite();
                C16644i iVar3 = (C16644i) hVar.instance;
                str.getClass();
                iVar3.f48741a |= 2;
                iVar3.f48743c = str;
                C16633ae aeVar = (C16633ae) C16636ah.f48726c.createBuilder();
                aeVar.copyOnWrite();
                C16636ah ahVar = (C16636ah) aeVar.instance;
                ahVar.f48729b = 3;
                ahVar.f48728a |= 1;
                hVar.copyOnWrite();
                C16644i iVar4 = (C16644i) hVar.instance;
                C16636ah ahVar2 = (C16636ah) aeVar.build();
                ahVar2.getClass();
                iVar4.f48744d = ahVar2;
                iVar4.f48741a |= 4;
                C16649n a = C16697m.m33769a(nuVar);
                hVar.copyOnWrite();
                C16644i iVar5 = (C16644i) hVar.instance;
                C16654s sVar = (C16654s) a.build();
                sVar.getClass();
                iVar5.f48742b = sVar;
                iVar5.f48741a |= 1;
                xVar.mo22947a((C16644i) hVar.build());
                i++;
            }
            aVar.mo22945d(xVar);
            return (C16662b) aVar.build();
        }
        C16627a aVar2 = (C16627a) C16662b.f48800l.createBuilder();
        aVar2.copyOnWrite();
        C16662b bVar2 = (C16662b) aVar2.instance;
        bVar2.f48802a |= 1;
        bVar2.f48803b = true;
        int size2 = guVar.size();
        while (i < size2) {
            C53435nu nuVar2 = (C53435nu) guVar.get(i);
            C16645j jVar = (C16645j) C16646k.f48751g.createBuilder();
            C16743bd b2 = C16697m.m33770b(nuVar2);
            jVar.copyOnWrite();
            C16646k kVar = (C16646k) jVar.instance;
            C16744be beVar2 = (C16744be) b2.build();
            beVar2.getClass();
            kVar.f48757e = beVar2;
            kVar.f48753a |= 8;
            C16661z zVar = (C16661z) C16632ad.f48719e.createBuilder();
            String str2 = nuVar2.f140240e;
            zVar.copyOnWrite();
            C16632ad adVar = (C16632ad) zVar.instance;
            str2.getClass();
            adVar.f48722b = 1;
            adVar.f48723c = str2;
            jVar.copyOnWrite();
            C16646k kVar2 = (C16646k) jVar.instance;
            C16632ad adVar2 = (C16632ad) zVar.build();
            adVar2.getClass();
            kVar2.f48754b = adVar2;
            kVar2.f48753a |= 1;
            C16649n a2 = C16697m.m33769a(nuVar2);
            jVar.copyOnWrite();
            C16646k kVar3 = (C16646k) jVar.instance;
            C16654s sVar2 = (C16654s) a2.build();
            sVar2.getClass();
            kVar3.f48756d = sVar2;
            kVar3.f48753a |= 4;
            aVar2.mo22942a((C16646k) jVar.build());
            i++;
        }
        return (C16662b) aVar2.build();
    }
}
