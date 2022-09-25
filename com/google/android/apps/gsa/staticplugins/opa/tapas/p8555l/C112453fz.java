package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112698f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112147n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113295bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58729pv;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fz */
/* compiled from: PG */
public final class C112453fz extends C112147n {

    /* renamed from: a */
    public static final /* synthetic */ int f311970a = 0;

    public C112453fz(C112698f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.OFFLINE_CLIENT_SUPPRESSOR;
    }

    /* renamed from: l */
    public final Map mo99418l(C113405ep epVar, Map map) {
        C113295bt btVar = (C113295bt) map.get(C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY);
        if (btVar == null) {
            return C58729pv.f156485a;
        }
        if (Collection.EL.stream(btVar.f313760a).filter(C112452fy.f311969a).findFirst().isEmpty()) {
            return C58729pv.f156485a;
        }
        HashMap hashMap = new HashMap();
        C58526ih ihVar = new C58526ih();
        for (int i = 0; i < btVar.f313760a.size(); i++) {
            if (((C113415ez) btVar.f313760a.get(i)).mo100211k().equals(C48672ag.OFFLINE_CLIENT)) {
                ihVar.mo55373c(Integer.valueOf(i));
            }
        }
        hashMap.put(C48670ae.SUGGESTION_GROUP_PERSONALIZED_QUERY, ihVar.mo55486f());
        return C58495hd.m89898l(hashMap);
    }
}
