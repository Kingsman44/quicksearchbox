package com.google.android.apps.gsa.smartspace.p7257a;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.assistant.p3886c.C50788cl;
import com.google.assistant.p3886c.C50789cm;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50728m;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.smartspace.a.c */
/* compiled from: PG */
public final /* synthetic */ class C92021c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92113i f256549a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f256550b;

    public /* synthetic */ C92021c(C92113i iVar, C86124t tVar) {
        this.f256549a = iVar;
        this.f256550b = tVar;
    }

    public final Object apply(Object obj) {
        C92113i iVar = this.f256549a;
        C86124t tVar = this.f256550b;
        C58833ax axVar = (C58833ax) obj;
        C50818do doVar = iVar.f256820a;
        C50790cn cnVar = (C50790cn) doVar.toBuilder();
        if (axVar.mo56113h()) {
            C50729n nVar = doVar.f132314k;
            if (nVar == null) {
                nVar = C50729n.f132007g;
            }
            C50728m mVar = (C50728m) nVar.toBuilder();
            C63088z A = C63088z.m96139A((byte[]) axVar.mo56107c());
            mVar.copyOnWrite();
            C50729n nVar2 = (C50729n) mVar.instance;
            nVar2.f132009a |= 16;
            nVar2.f132013e = A;
            C50729n nVar3 = (C50729n) mVar.build();
            cnVar.copyOnWrite();
            C50818do doVar2 = (C50818do) cnVar.instance;
            nVar3.getClass();
            doVar2.f132314k = nVar3;
            doVar2.f132304a |= 512;
        }
        if (tVar.mo79746e(C90017bw.f247910aY)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.ambient.activity.AmbientAssistantFeedbackActivity"));
            String uri = intent.toUri(1);
            C50794cr a = C50794cr.m85938a(((C50818do) cnVar.instance).f132315l);
            if (a == null) {
                a = C50794cr.UNDEFINED;
            }
            Intent p = C92122r.m151194p(uri, a, C50731p.START_ACTIVITY, 4);
            C50788cl clVar = (C50788cl) C50789cm.f132161f.createBuilder();
            clVar.copyOnWrite();
            C50789cm cmVar = (C50789cm) clVar.instance;
            cmVar.f132167e = 3;
            cmVar.f132163a |= 8;
            C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
            C50731p pVar = C50731p.START_ACTIVITY;
            qVar.copyOnWrite();
            C50733r rVar = (C50733r) qVar.instance;
            rVar.f132024b = pVar.f132020d;
            rVar.f132023a |= 1;
            String uri2 = p.toUri(1);
            qVar.copyOnWrite();
            C50733r rVar2 = (C50733r) qVar.instance;
            uri2.getClass();
            rVar2.f132023a |= 2;
            rVar2.f132025c = uri2;
            C50733r rVar3 = (C50733r) qVar.build();
            clVar.copyOnWrite();
            C50789cm cmVar2 = (C50789cm) clVar.instance;
            rVar3.getClass();
            cmVar2.f132165c = rVar3;
            cmVar2.f132163a |= 2;
            cnVar.mo53460b((C50789cm) clVar.build());
        }
        if (tVar.mo79746e(C90017bw.f247870L)) {
            C50794cr a2 = C50794cr.m85938a(iVar.f256820a.f132315l);
            if (a2 == null) {
                a2 = C50794cr.UNDEFINED;
            }
            if (!a2.equals(C50794cr.WEATHER)) {
                C92025g.m151038g(cnVar);
            }
        }
        return C58833ax.m90834k((C50818do) cnVar.build());
    }
}
