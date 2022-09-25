package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.r */
/* compiled from: PG */
public final /* synthetic */ class C111414r implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111419w f309974a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f309975b;

    public /* synthetic */ C111414r(C111419w wVar, C113405ep epVar) {
        this.f309974a = wVar;
        this.f309975b = epVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111419w wVar = this.f309974a;
        C113405ep epVar = this.f309975b;
        List list = (List) obj;
        ((C59052c) ((C59052c) C111419w.f309980a.mo56224b()).mo56372aa(27185)).mo56389s("#fetchSuggestionsFromUsageStatsManager('%s')", epVar.mo100033p());
        PackageManager packageManager = wVar.f309983d.getPackageManager();
        if (packageManager == null) {
            C113407er p = C113408es.m187705p();
            p.mo100095e(epVar);
            return C60856cj.m92900i(p.mo100091a());
        }
        Optional map = Optional.ofNullable((Integer) wVar.f309985f.mo99465b(epVar).get(20010)).map(new C111407k(wVar));
        map.ifPresent(C111409m.f309968a);
        int size = list.size();
        return wVar.f309981b.mo28209i(C60856cj.m92906o((C58485gu) Collection.EL.stream(list).filter(new C111410n(wVar.f309982c.mo79745c(C90063do.f249482eP))).flatMap(new C111411o(wVar, packageManager)).map(new C111412p(wVar)).limit((long) ((Integer) map.orElse(Integer.valueOf(size))).intValue()).collect(C58370cn.f155946a)), "convert to tapasSuggestionWrapper", C111413q.f309973a);
    }
}
