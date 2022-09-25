package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80407g;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80447h;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80472k;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.q */
/* compiled from: PG */
public final /* synthetic */ class C78965q implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C78968t f217202a;

    /* renamed from: b */
    public final /* synthetic */ String f217203b;

    /* renamed from: c */
    public final /* synthetic */ List f217204c;

    /* renamed from: d */
    public final /* synthetic */ C74965n f217205d;

    public /* synthetic */ C78965q(C78968t tVar, String str, List list, C74965n nVar) {
        this.f217202a = tVar;
        this.f217203b = str;
        this.f217204c = list;
        this.f217205d = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58485gu guVar;
        C78968t tVar = this.f217202a;
        String str = this.f217203b;
        List list = this.f217204c;
        C74965n nVar = this.f217205d;
        Optional optional = (Optional) obj;
        Optional o = nVar.mo71340o();
        if (o.isEmpty()) {
            ((C58970a) ((C58970a) C78968t.f217213a.mo56225c()).mo56372aa(5461)).mo56386p("Cannot get foreground package.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        Optional o2 = nVar.mo71340o();
        if (o2.isEmpty()) {
            ((C58970a) ((C58970a) C78968t.f217213a.mo56225c()).mo56372aa(5459)).mo56386p("Cannot get foreground package.");
            guVar = C58485gu.m89845m();
        } else {
            C83320io k = nVar.mo71336k();
            C58528ij ijVar = (C58528ij) Stream.CC.concat(Collection.EL.stream(tVar.f217217e).filter(new C78962n((String) o2.get())), Collection.EL.stream(tVar.f217216d)).filter(new C78963o(tVar)).collect(C58370cn.f155947b);
            ijVar.size();
            guVar = (C58485gu) Collection.EL.stream(ijVar).flatMap(new C78966r(tVar, k, str, list, o2, optional)).flatMap(C78967s.f217212a).collect(C58370cn.f155946a);
        }
        if (guVar.isEmpty()) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C76455a aVar = tVar.f217219g;
        C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
        C80407g gVar = (C80407g) C80447h.f220803d.createBuilder();
        String str2 = (String) o.get();
        gVar.copyOnWrite();
        C80447h hVar = (C80447h) gVar.instance;
        str2.getClass();
        hVar.f220805a |= 1;
        hVar.f220806b = str2;
        boolean j = tVar.f217215c.mo85405j(C90126fx.f251036bI);
        gVar.copyOnWrite();
        C80447h hVar2 = (C80447h) gVar.instance;
        hVar2.f220805a |= 2;
        hVar2.f220807c = j;
        C80447h hVar3 = (C80447h) gVar.build();
        kVar.copyOnWrite();
        C80136bn bnVar = (C80136bn) kVar.instance;
        hVar3.getClass();
        bnVar.f219918b = hVar3;
        bnVar.f219917a = 29;
        return tVar.f217214b.mo28209i(aVar.mo72193d((C80136bn) kVar.build(), Optional.empty()), "[NGA] AppSearchIntentGenerator.generateSync", new C78964p(o, guVar));
    }
}
