package com.google.android.apps.gsa.staticplugins.opa.p8595v;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90142u;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107510ad;
import com.google.common.p4522b.C58466gb;
import com.google.common.p4522b.C58468gd;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C59770f;
import com.google.protobuf.C62971cq;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.v.b */
/* compiled from: PG */
public final class C113898b {

    /* renamed from: a */
    public static final C58468gd f315353a;

    /* renamed from: b */
    private static final C58495hd f315354b;

    /* renamed from: c */
    private final C86124t f315355c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C113919w.NO_CONNECTIVITY, C89849ae.OPA_ENDSTATE_FAILURE_NO_CONNECTIVITY);
        gzVar.mo55429h(C113919w.RECOGNITION_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_NO_CONNECTIVITY);
        gzVar.mo55429h(C113919w.UNRELIABLE_NETWORK, C89849ae.OPA_ENDSTATE_FAILURE_UNRELIABLE_NETWORK);
        gzVar.mo55429h(C113919w.SERVER_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_SERVER_ERROR);
        gzVar.mo55429h(C113919w.S3_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_S3_ERROR);
        gzVar.mo55429h(C113919w.GENERIC_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_ERROR);
        gzVar.mo55429h(C113919w.GENERIC_GSA_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_GSA_ERROR);
        gzVar.mo55429h(C113919w.OPA_SSC_USER_DISCONNECT, C89849ae.OPA_ENDSTATE_FAILURE_OPA_SSC_USER_DISCONNECT);
        gzVar.mo55429h(C113919w.CANCELED, C89849ae.OPA_ENDSTATE_CANCEL_UNKNOWN);
        gzVar.mo55429h(C113919w.GRAPH_FAILURE, C89849ae.OPA_ENDSTATE_FAILURE_GRAPH_FAILURE);
        gzVar.mo55429h(C113919w.CLIENT_OP_CORE_DISMISS_ASSISTANT, C89849ae.OPA_ENDSTATE_SUCCESS);
        f315354b = gzVar.mo55427f(false);
        C58466gb gbVar = new C58466gb();
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_CANCEL_NEW_HOTWORD, C89849ae.OPA_ENDSTATE_CANCEL_NEW_HOTWORD);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_NO_CONNECTIVITY, C89849ae.OPA_ENDSTATE_FAILURE_NO_CONNECTIVITY);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_UNRELIABLE_NETWORK, C89849ae.OPA_ENDSTATE_FAILURE_UNRELIABLE_NETWORK);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_CANCEL_USER_ERROR, C89849ae.OPA_ENDSTATE_CANCEL_USER_ERROR);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_RECOGNIZER_NO_MATCH_FROM_NETWORK, C89849ae.OPA_ENDSTATE_FAILURE_RECOGNIZER_NO_MATCH_FROM_NETWORK);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_MISSING_LANGUAGE_PACK, C89849ae.OPA_ENDSTATE_FAILURE_MISSING_LANGUAGE_PACK);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_GENERIC_GSA_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_GSA_ERROR);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_SERVER_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_SERVER_ERROR);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_S3_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_S3_ERROR);
        gbVar.mo55364d(C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_GENERIC_ERROR, C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_ERROR);
        f315353a = gbVar.mo55363c();
    }

    public C113898b(C86124t tVar) {
        this.f315355c = tVar;
    }

    /* renamed from: a */
    public final C89849ae mo100757a(C107510ad adVar) {
        C59753ej ejVar = adVar.f299131b;
        if (ejVar == null) {
            ejVar = C59753ej.f161449e;
        }
        int i = ejVar.f161452b;
        C58485gu o = this.f315355c.mo79749o(C90142u.f251875a);
        int i2 = adVar.f299132c;
        C62971cq<C59770f> cqVar = adVar.f299133d;
        HashSet hashSet = new HashSet();
        int i3 = 8;
        for (C59770f fVar : cqVar) {
            i3 = C90454b.m147151a(fVar.f161505c, fVar.f161504b);
            hashSet.add(Integer.valueOf(i3));
        }
        if (hashSet.size() != 1) {
            Iterator it = o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i3 = C90454b.m147151a(i, i2);
                    break;
                }
                i3 = ((Integer) it.next()).intValue();
                if (hashSet.contains(Integer.valueOf(i3))) {
                    break;
                }
            }
        }
        if (i3 == 1 || i3 == 3) {
            return C89849ae.OPA_ENDSTATE_FAILURE_NO_CONNECTIVITY;
        }
        if (i3 != 4) {
            if (i3 == 9) {
                return C89849ae.OPA_ENDSTATE_FAILURE_UNRELIABLE_NETWORK;
            }
            if (i3 == 10) {
                return C89849ae.OPA_ENDSTATE_CANCEL_USER_ERROR;
            }
        } else if (i == 524293) {
            return C89849ae.OPA_ENDSTATE_FAILURE_RECOGNIZER_NO_MATCH_FROM_NETWORK;
        }
        int i4 = adVar.f299132c;
        if (i4 != 211) {
            if (i4 == 212) {
                return C89849ae.OPA_ENDSTATE_FAILURE_SERVER_ERROR;
            }
            if (i4 != 216) {
                return C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_ERROR;
            }
            return C89849ae.OPA_ENDSTATE_FAILURE_S3_ERROR;
        } else if (i == 458754) {
            return C89849ae.OPA_ENDSTATE_FAILURE_MISSING_LANGUAGE_PACK;
        } else {
            if (i == 524289) {
                return C89849ae.OPA_ENDSTATE_FAILURE_NO_CONNECTIVITY;
            }
            return C89849ae.OPA_ENDSTATE_FAILURE_GENERIC_GSA_ERROR;
        }
    }

    /* renamed from: b */
    public final C89849ae mo100758b(C113919w wVar) {
        C89849ae aeVar = (C89849ae) f315354b.get(wVar);
        if (aeVar != null) {
            return aeVar;
        }
        return (C89849ae) f315353a.get(wVar);
    }
}
