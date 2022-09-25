package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8259c;

import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123719am;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.assistant.p3860as.C49794h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62909aq;
import com.google.protobuf.C62910ar;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.c.cu */
/* compiled from: PG */
public final /* synthetic */ class C106940cu implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106941cv f297870a;

    public /* synthetic */ C106940cu(C106941cv cvVar) {
        this.f297870a = cvVar;
    }

    public final Object apply(Object obj) {
        C58528ij ijVar;
        C106941cv cvVar = this.f297870a;
        C58485gu guVar = (C58485gu) obj;
        if (!cvVar.f297874b.mo79746e(C90017bw.f247914ac) || guVar == null) {
            return C123777f.f341922a;
        }
        long a = cvVar.f297874b.mo79743a(C90017bw.f247954bP);
        ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23397)).mo56388r("Building client state with maximum of %d requested apps", a);
        C58526ih ihVar = new C58526ih();
        try {
            C58485gu c = C89988b.m146550c(cvVar.f297874b.mo79758x(C90017bw.f247955bQ));
            int size = c.size();
            for (int i = 0; i < size; i++) {
                Long l = (Long) c.get(i);
                C49794h a2 = C49794h.m85713a(l.intValue());
                if (a2 == null) {
                    ((C58970a) ((C58970a) cvVar.f297873a.mo56226d()).mo56372aa(23406)).mo56389s("Failed to get an ApplicationCategory for number: %d", l);
                } else {
                    ihVar.mo55373c(a2);
                }
            }
            ijVar = ihVar.mo55486f();
        } catch (NumberFormatException e) {
            ((C58970a) ((C58970a) ((C58970a) cvVar.f297873a.mo56226d()).mo56382g(e)).mo56372aa(23407)).mo56389s("Invalid category flag value: %s", cvVar.f297874b.mo79758x(C90017bw.f247955bQ));
            ijVar = C58733pz.f156496a;
        }
        C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
        amVar.copyOnWrite();
        C123726at atVar = (C123726at) amVar.instance;
        atVar.f341750e = 1;
        atVar.f341746a |= 4;
        boolean e2 = cvVar.f297874b.mo79746e(C90017bw.f247913ab);
        amVar.copyOnWrite();
        C123726at atVar2 = (C123726at) amVar.instance;
        atVar2.f341746a |= 1;
        atVar2.f341748c = e2;
        int i2 = true != cvVar.f297874b.mo79746e(C90017bw.f248037n) ? 3 : 2;
        amVar.copyOnWrite();
        C123726at atVar3 = (C123726at) amVar.instance;
        atVar3.f341751f = i2 - 1;
        atVar3.f341746a |= 8;
        C62909aq aqVar = (C62909aq) C62910ar.f169858c.createBuilder();
        long a3 = cvVar.f297874b.mo79743a(C90017bw.f247951bM);
        aqVar.copyOnWrite();
        ((C62910ar) aqVar.instance).f169860a = a3;
        amVar.copyOnWrite();
        C123726at atVar4 = (C123726at) amVar.instance;
        C62910ar arVar = (C62910ar) aqVar.build();
        arVar.getClass();
        atVar4.f341752g = arVar;
        atVar4.f341746a |= 16;
        amVar.mo106109a((Iterable) Collection.EL.stream(guVar).peek(new C106927ch(cvVar)).filter(new C106928ci(ijVar)).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C106929cj.f297851a))).limit(a).map(C106930ck.f297852a).collect(C58370cn.f155946a));
        C123726at atVar5 = (C123726at) amVar.build();
        ((C58970a) ((C58970a) cvVar.f297873a.mo56224b()).mo56372aa(23398)).mo56354G("mediaApps: pre-filter:%s, post-filter:%s", Collection.EL.stream(guVar).map(C106931cl.f297853a).collect(Collectors.joining(", ")), Collection.EL.stream(atVar5.f341747b).map(C106937cr.f297867a).collect(Collectors.joining(", ")));
        C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
        eVar.mo58885m(C123726at.f341744i, atVar5);
        return (C123777f) eVar.build();
    }
}
