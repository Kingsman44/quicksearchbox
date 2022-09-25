package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113192cw;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.cb */
/* compiled from: PG */
public final /* synthetic */ class C111041cb implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111053cn f309242a;

    /* renamed from: b */
    public final /* synthetic */ Optional f309243b;

    /* renamed from: c */
    public final /* synthetic */ String f309244c;

    public /* synthetic */ C111041cb(C111053cn cnVar, Optional optional, String str) {
        this.f309242a = cnVar;
        this.f309243b = optional;
        this.f309244c = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58528ij ijVar;
        C111053cn cnVar = this.f309242a;
        Optional optional = this.f309243b;
        String str = this.f309244c;
        C58528ij ijVar2 = (C58528ij) obj;
        ArrayList arrayList = new ArrayList();
        if (cnVar.f309263a.mo79746e(C90063do.f249575gC)) {
            C110972aj ajVar = (C110972aj) cnVar.f309266d.mo27525b();
            ijVar = C58528ij.m90006F((List) Stream.CC.concat(Collection.EL.stream(ajVar.f309146c.mo79745c(C90014bt.f247739mo)), Collection.EL.stream(ajVar.f309146c.mo79745c(C90014bt.f247738mn))).distinct().collect(Collectors.toList()));
        } else {
            ijVar = ijVar2;
        }
        C58800sl lA = ijVar.iterator();
        while (lA.hasNext()) {
            String str2 = (String) lA.next();
            if (str2 != null && ijVar2.contains(str2)) {
                if ((optional.isEmpty() || ((C58528ij) optional.get()).contains(str2)) && cnVar.f309265c.mo99854m(str2)) {
                    C113192cw cwVar = cnVar.f309268f;
                    arrayList.add(cwVar.f313526a.a(str, C65753ak.APP_ACTIONS, str2, C63662ac.f172144a, C49301bt.f127423f));
                }
            }
        }
        return cnVar.f309264b.mo28209i(C60856cj.m92906o(arrayList), BuildConfig.FLAVOR, C111040ca.f309241a);
    }
}
