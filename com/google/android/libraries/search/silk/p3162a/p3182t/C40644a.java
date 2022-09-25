package com.google.android.libraries.search.silk.p3162a.p3182t;

import com.google.android.apps.search.webglide.p10699b.C142170a;
import com.google.android.apps.search.webglide.p10699b.C142173d;
import com.google.android.apps.search.webglide.p10699b.C142181l;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad.C56635e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad.C56636f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad.C56641k;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad.C56642l;

/* renamed from: com.google.android.libraries.search.silk.a.t.a */
/* compiled from: PG */
public final /* synthetic */ class C40644a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C40645b f106656a;

    /* renamed from: b */
    public final /* synthetic */ C56636f f106657b;

    public /* synthetic */ C40644a(C40645b bVar, C56636f fVar) {
        this.f106656a = bVar;
        this.f106657b = fVar;
    }

    public final C60870cx apply(Object obj) {
        C40645b bVar = this.f106656a;
        C56636f fVar = this.f106657b;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92899h(new C41742a(C40645b.f106658a));
        }
        C142170a aVar = (C142170a) C142173d.f385675i.createBuilder();
        for (int i = 0; i < fVar.f151207a.size(); i++) {
            C56642l lVar = (C56642l) fVar.f151207a.get(i);
            C142181l lVar2 = (C142181l) C142185p.f385723l.createBuilder();
            String str = lVar.f151220b;
            lVar2.copyOnWrite();
            C142185p pVar = (C142185p) lVar2.instance;
            str.getClass();
            pVar.f385725a |= 1;
            pVar.f385726b = str;
            String str2 = lVar.f151221c;
            lVar2.copyOnWrite();
            C142185p pVar2 = (C142185p) lVar2.instance;
            str2.getClass();
            pVar2.f385725a |= 8;
            pVar2.f385729e = str2;
            String str3 = lVar.f151222d;
            lVar2.copyOnWrite();
            C142185p pVar3 = (C142185p) lVar2.instance;
            str3.getClass();
            pVar3.f385725a |= 32;
            pVar3.f385731g = str3;
            lVar2.copyOnWrite();
            C142185p pVar4 = (C142185p) lVar2.instance;
            pVar4.f385725a |= 256;
            pVar4.f385735k = i;
            String str4 = lVar.f151223e;
            lVar2.copyOnWrite();
            C142185p pVar5 = (C142185p) lVar2.instance;
            str4.getClass();
            pVar5.f385725a |= 64;
            pVar5.f385732h = str4;
            if ((lVar.f151219a & 16) != 0) {
                C56641k kVar = lVar.f151224f;
                if (kVar == null) {
                    kVar = C56641k.f151212d;
                }
                if ((kVar.f151214a & 1) != 0) {
                    String str5 = kVar.f151215b;
                    lVar2.copyOnWrite();
                    C142185p pVar6 = (C142185p) lVar2.instance;
                    str5.getClass();
                    pVar6.f385725a |= 16;
                    pVar6.f385730f = str5;
                }
                if ((2 & kVar.f151214a) != 0) {
                    String str6 = kVar.f151216c;
                    lVar2.copyOnWrite();
                    C142185p pVar7 = (C142185p) lVar2.instance;
                    str6.getClass();
                    pVar7.f385725a |= 4;
                    pVar7.f385728d = str6;
                }
            }
            aVar.mo117041a((C142185p) lVar2.build());
        }
        C56635e eVar = fVar.f151208b;
        if (eVar == null) {
            eVar = C56635e.f151201b;
        }
        int i2 = eVar.f151203a;
        aVar.copyOnWrite();
        C142173d dVar = (C142173d) aVar.instance;
        dVar.f385677a |= 1;
        dVar.f385679c = i2;
        aVar.copyOnWrite();
        C142173d dVar2 = (C142173d) aVar.instance;
        dVar2.f385683g = 2;
        dVar2.f385677a |= 16;
        try {
            bVar.f106659b.mo41490e((C142173d) aVar.build());
            return C60866ct.f164955a;
        } catch (IllegalStateException unused) {
            return C60856cj.m92899h(new C41742a(C40645b.f106658a));
        }
    }
}
