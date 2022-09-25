package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110981as;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110986ax;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110987ay;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110988az;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111004ba;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111005bb;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111007bd;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111008be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111009bf;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111010bg;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111011bh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111012bi;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111013bj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111022bs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111023bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111024bu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111027bx;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111028by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111029bz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.be */
/* compiled from: PG */
public final /* synthetic */ class C111363be implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111366bh f309870a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f309871b;

    public /* synthetic */ C111363be(C111366bh bhVar, C113405ep epVar) {
        this.f309870a = bhVar;
        this.f309871b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Map map;
        C111366bh bhVar = this.f309870a;
        C113405ep epVar = this.f309871b;
        Map map2 = (Map) obj;
        String trim = epVar.mo100033p().toLowerCase(Locale.getDefault()).trim();
        C111370f fVar = bhVar.f309881f;
        int i = epVar.mo100022f().f53684l;
        C111029bz bzVar = (C111029bz) fVar.f309890a.mo27525b();
        String c = C113190cu.m187215c(trim);
        if (bzVar.f309214a.mo79746e(C90063do.f249279aY)) {
            map = (Map) Collection.EL.stream(bzVar.f309219f.entrySet()).map(new C111027bx(bzVar, c, i)).filter(new C111028by(bzVar)).flatMap(C110981as.f309162a).collect(C58370cn.m89403c(C111022bs.f309205a, C111023bt.f309206a, C111024bu.f309207a));
        } else {
            map = bzVar.f309219f.containsKey(c) ? (Map) Collection.EL.stream((Set) bzVar.f309219f.get(c)).collect(C58370cn.m89403c(C111011bh.f309193a, new C111012bi(bzVar.f309214a.mo79747m(C90063do.f249642r)), C111013bj.f309195a)) : C58729pv.f156485a;
        }
        C58485gu b = bzVar.mo99019b(bzVar.f309214a.mo79746e(C90063do.f249340bg));
        return bhVar.f309876a.mo28209i(C60856cj.m92906o((Iterable) Collection.EL.stream((C58485gu) Collection.EL.stream(((C58495hd) Stream.CC.concat(Collection.EL.stream(((C58495hd) Collection.EL.stream(b).flatMap(new C111005bb(bzVar, c)).collect(C58370cn.m89403c(C111007bd.f309189a, C111023bt.f309206a, C111008be.f309190a))).entrySet()), Collection.EL.stream(((C58495hd) Collection.EL.stream(b).filter(new C110986ax(map)).collect(C58370cn.m89403c(C110987ay.f309170a, new C110988az(map), C111004ba.f309185a))).entrySet())).collect(C58370cn.m89403c(C111009bf.f309191a, C111010bg.f309192a, C111024bu.f309207a))).entrySet()).filter(new C111358b(fVar)).flatMap(new C111367c(fVar, trim, i)).filter(C111368d.f309889a).collect(C58370cn.f155946a)).filter(new C111361bc(bhVar)).map(new C111359ba(bhVar, map2)).collect(C58370cn.f155946a)), "Transform from suggestion list to suggestion response", C111360bb.f309867a);
    }
}
