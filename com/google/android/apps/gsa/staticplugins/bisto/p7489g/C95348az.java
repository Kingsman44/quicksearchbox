package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60267mh;
import com.google.common.p4552o.C60269mj;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.az */
/* compiled from: PG */
public final class C95348az implements AutoCloseable, C89495cg {

    /* renamed from: a */
    private static final C59071e f266775a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.az");

    /* renamed from: b */
    private final C89496ch f266776b;

    /* renamed from: c */
    private final C95307m f266777c;

    /* renamed from: d */
    private final Map f266778d = new HashMap();

    public C95348az(C89496ch chVar, C95307m mVar, C95850a aVar) {
        this.f266776b = chVar;
        this.f266777c = mVar;
        chVar.mo83360B(new C58759qy(6), this);
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    public final void close() {
        this.f266776b.mo83379U(this);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        int i;
        boolean z;
        int i2;
        C124715m j2 = dVar.mo106512j();
        C124715m mVar = C124715m.UNKNOWN_CONNECTIVITY_STATUS;
        int ordinal = j2.ordinal();
        if (ordinal == 1) {
            i = 5;
        } else if (ordinal != 2) {
            i = 3;
            if (ordinal != 3) {
                i = ordinal != 4 ? 1 : 2;
            }
        } else {
            i = 4;
        }
        C60267mh mhVar = (C60267mh) C60269mj.f163056f.createBuilder();
        mhVar.copyOnWrite();
        C60269mj mjVar = (C60269mj) mhVar.instance;
        int i3 = i - 1;
        mjVar.f163060c = i3;
        mjVar.f163058a = 2 | mjVar.f163058a;
        if ("wired".equals(str)) {
            z = C124636bb.OPA_ENABLED.equals(dVar.mo106521s());
        } else {
            z = C124636bb.OPA_ENABLED.equals(dVar.mo106521s()) && C124633az.OOBE_FINISHED.equals(dVar.mo106520r());
        }
        mhVar.copyOnWrite();
        C60269mj mjVar2 = (C60269mj) mhVar.instance;
        mjVar2.f163058a |= 8;
        mjVar2.f163062e = z;
        C95347ay ayVar = (C95347ay) this.f266778d.get(str);
        if (!(ayVar == null || (i2 = ayVar.f266774b) == i)) {
            long j3 = j - ayVar.f266773a;
            if (j3 <= 0) {
                String str2 = "Bad duration : " + Integer.toString(i2 - 1) + " " + Integer.toString(i3) + " " + j3;
                C59104x b = f266775a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoConnectionLogger");
                ((C59052c) ((C59052c) b).mo56372aa(14950)).mo56389s("%s", str2);
            } else {
                mhVar.copyOnWrite();
                C60269mj mjVar3 = (C60269mj) mhVar.instance;
                mjVar3.f163059b = i2 - 1;
                mjVar3.f163058a |= 1;
                mhVar.copyOnWrite();
                C60269mj mjVar4 = (C60269mj) mhVar.instance;
                mjVar4.f163058a = 4 | mjVar4.f163058a;
                mjVar4.f163061d = (int) j3;
            }
        }
        this.f266778d.put(str, new C95347ay(j, i));
        C95307m mVar2 = this.f266777c;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60269mj mjVar5 = (C60269mj) mhVar.build();
        mjVar5.getClass();
        nmVar.f163159m = mjVar5;
        nmVar.f163147a |= 4194304;
        mVar2.mo83545c(nkVar);
    }
}
