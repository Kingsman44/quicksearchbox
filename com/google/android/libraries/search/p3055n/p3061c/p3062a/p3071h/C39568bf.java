package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39392ah;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39394aj;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39395ak;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39638t;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39640v;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C67150mx;
import com.google.speech.p5218j.C67152mz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71022bv;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71023bw;

/* renamed from: com.google.android.libraries.search.n.c.a.h.bf */
/* compiled from: PG */
public final /* synthetic */ class C39568bf implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104150a;

    public /* synthetic */ C39568bf(C39580br brVar) {
        this.f104150a = brVar;
    }

    public final C60870cx apply(Object obj) {
        C39580br brVar = this.f104150a;
        C67152mz a = C67152mz.m97427a(((C67150mx) obj).f182527b);
        if (a == null) {
            a = C67152mz.NO_ERROR;
        }
        if (a != C67152mz.NO_ERROR) {
            C59104x c = C39580br.f104168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) c).mo56372aa(53736)).mo56389s("Soda init failed with status: %s", a.name());
            if (((C39583bu) brVar.f104188u.mo56107c()).mo41921c().mo41884c()) {
                C71022bv bvVar = (C71022bv) C71023bw.f189405n.createBuilder();
                bvVar.copyOnWrite();
                C71023bw bwVar = (C71023bw) bvVar.instance;
                bwVar.f189415i = a.f182542l;
                bwVar.f189407a |= 128;
                brVar.mo41914l(C58833ax.m90834k((C71023bw) bvVar.build()), 4);
            }
            brVar.f104177j.set(C39579bq.UNINITIALIZED);
            C39394aj c2 = C39395ak.m68799c();
            C39638t tVar = new C39638t();
            tVar.mo41807b(C39392ah.SODA_INIT_ERROR);
            String name = a.name();
            if (name != null) {
                tVar.f104350a = name;
                ((C39640v) c2).f104354a = C58833ax.m90834k(tVar.mo41806a());
                return C60856cj.m92900i(c2.mo41810a());
            }
            throw new NullPointerException("Null message");
        }
        brVar.f104177j.set(C39579bq.INITIALIZED);
        return brVar.mo41906d();
    }
}
