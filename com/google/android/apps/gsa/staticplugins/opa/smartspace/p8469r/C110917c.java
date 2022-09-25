package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r;

import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92033ac;
import com.google.android.apps.gsa.smartspace.C92111g;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g.C107061a;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.c */
/* compiled from: PG */
public final class C110917c implements C92033ac {

    /* renamed from: a */
    public static final C58528ij f308973a = C58528ij.m90011K(C50794cr.HOLIDAY_ALARMS, C50794cr.AIR_QUALITY);

    /* renamed from: b */
    private static final C59071e f308974b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.smartspace.r.c");

    /* renamed from: c */
    private final C86124t f308975c;

    /* renamed from: d */
    private final C110925k f308976d;

    public C110917c(C110925k kVar, C86124t tVar) {
        this.f308976d = kVar;
        this.f308975c = tVar;
    }

    /* renamed from: c */
    private static C92113i[] m184662c(C92113i[] iVarArr) {
        return (C92113i[]) DesugarArrays.stream((T[]) iVarArr).filter(C110915a.f308971a).toArray(C110916b.f308972a);
    }

    /* renamed from: a */
    public final C60870cx mo86686a(C92113i[] iVarArr, C58833ax axVar) {
        String str;
        C58976aa aaVar = C58975e.f156826a;
        if (!C107061a.m177776a(this.f308975c)) {
            return C118826c.f331423b;
        }
        C92113i[] c = m184662c(iVarArr);
        for (C92113i iVar : c) {
            C59104x b = f308974b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "OpaSsWdgtHdlr");
            C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(26854);
            C50794cr a = C50794cr.m85938a(iVar.f256820a.f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            cVar.mo56389s("received card type %s ", C92111g.m151146a(a));
        }
        if (!axVar.mo56113h()) {
            C59104x b2 = f308974b.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "OpaSsWdgtHdlr");
            ((C59052c) ((C59052c) b2).mo56372aa(26856)).mo56386p("no chips received");
        } else {
            for (C83802r rVar : (List) axVar.mo56107c()) {
                if (rVar.mo77094d().mo56113h()) {
                    C50701am a2 = C50701am.m85887a(((C50738bc) rVar.mo77094d().mo56107c()).f132040g);
                    if (a2 == null) {
                        a2 = C50701am.UNKNOWN;
                    }
                    str = a2.name();
                } else {
                    str = "invalid";
                }
                C59104x b3 = f308974b.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "OpaSsWdgtHdlr");
                ((C59052c) ((C59052c) b3).mo56372aa(26855)).mo56389s("received chip type %s ", str);
            }
        }
        return this.f308976d.mo98936d(c, (List) axVar.mo56111f());
    }

    /* renamed from: b */
    public final C60870cx mo86687b(C92113i[] iVarArr) {
        if (!C107061a.m177776a(this.f308975c) || !this.f308975c.mo79746e(C90017bw.f247864F)) {
            return C118826c.f331423b;
        }
        return this.f308976d.mo98936d(m184662c(iVarArr), (List) null);
    }
}
