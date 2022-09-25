package com.google.android.libraries.assistant.pcp.p1569i;

import com.google.android.libraries.assistant.contexttrigger.C17737g;
import com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18581b;
import com.google.android.libraries.assistant.pcp.p1546d.C18575c;
import com.google.android.libraries.assistant.pcp.p1555f.C18677a;
import com.google.android.libraries.assistant.pcp.p1557g.C18767f;
import com.google.android.libraries.assistant.pcp.p1557g.C18768g;
import com.google.android.libraries.assistant.pcp.p1570j.p1571a.C18795c;
import com.google.android.libraries.assistant.pcp.p1578m.C18960aa;
import com.google.android.libraries.assistant.pcp.p1578m.C18962ac;
import com.google.android.libraries.assistant.pcp.p1578m.C18964ae;
import com.google.android.libraries.assistant.pcp.p1578m.C18975e;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import com.google.android.libraries.assistant.pcp.p1578m.C18987q;
import com.google.android.libraries.assistant.pcp.p1578m.C18989s;
import com.google.android.libraries.assistant.pcp.p1578m.C18991u;
import com.google.android.libraries.assistant.pcp.p1578m.C18993w;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3807b.p3808a.C48904f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48923y;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.i.b */
/* compiled from: PG */
public final class C18779b implements C17737g {

    /* renamed from: a */
    public static final C59071e f52894a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.i.b");

    /* renamed from: b */
    public final C18677a f52895b;

    /* renamed from: c */
    private final C18795c f52896c;

    /* renamed from: d */
    private final C18768g f52897d;

    /* renamed from: e */
    private final Executor f52898e;

    /* renamed from: f */
    private final C18581b f52899f;

    public C18779b(C18581b bVar, C18677a aVar, C18795c cVar, C18768g gVar, Executor executor) {
        this.f52899f = bVar;
        this.f52895b = aVar;
        this.f52896c = cVar;
        this.f52897d = gVar;
        this.f52898e = executor;
    }

    /* renamed from: a */
    public final void mo23454a(C48923y yVar) {
        Object obj;
        int i;
        C18960aa aaVar;
        C18991u uVar;
        C48904f fVar = yVar.f126604c;
        if (fVar == null) {
            fVar = C48904f.f126552a;
        }
        C62940bt r0 = C62942bv.checkIsLite(C18975e.f53305d);
        fVar.mo58887l(r0);
        if (!fVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x c = f52894a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PCP.v2CtfListener");
            ((C59052c) ((C59052c) c).mo56372aa(47353)).mo56386p("Could not find CTF event inside ContextTriggerResult.payload .");
            return;
        }
        C62940bt r02 = C62942bv.checkIsLite(C18975e.f53305d);
        fVar.mo58887l(r02);
        Object l = fVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C18975e eVar = (C18975e) obj;
        new C18767f(this.f52897d, C58485gu.m89845m());
        int i2 = eVar.f53307a;
        switch (i2) {
            case 0:
                i = 8;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 == 0) {
            C18795c cVar = this.f52896c;
            if (i2 == 1) {
                C18962ac acVar = (C18962ac) eVar.f53308b;
            } else {
                C18962ac acVar2 = C18962ac.f53286a;
            }
            C46459k.m82829b(cVar.mo24136d(), "Failed to push StructuredDataStartEvent.", new Object[0]);
        } else if (i3 == 1) {
            C18795c cVar2 = this.f52896c;
            if (i2 == 2) {
                C18964ae aeVar = (C18964ae) eVar.f53308b;
            } else {
                C18964ae aeVar2 = C18964ae.f53288a;
            }
            C46459k.m82829b(cVar2.mo24137e(), "Failed to push StructuredDataStopEvent.", new Object[0]);
        } else if (i3 == 2) {
            if (i2 == 3) {
                aaVar = (C18960aa) eVar.f53308b;
            } else {
                aaVar = C18960aa.f53280d;
            }
            C18677a aVar = this.f52895b;
            int i4 = aaVar.f53283b;
            C18981k kVar = C18981k.UNKNOWN;
            String str = aaVar.f53282a;
            int i5 = aaVar.f53284c;
            C46459k.m82829b(aVar.mo24101a(), "Failed to push StructuredDataRefreshEvent.", new Object[0]);
        } else if (i3 == 3) {
            C18795c cVar3 = this.f52896c;
            if (i2 == 4) {
                C18993w wVar = (C18993w) eVar.f53308b;
            } else {
                C18993w wVar2 = C18993w.f53364a;
            }
            C46459k.m82829b(cVar3.mo24135c(), "Failed to push RenderedDataShowEvent.", new Object[0]);
        } else if (i3 == 4) {
            C18795c cVar4 = this.f52896c;
            if (i2 == 5) {
                C18987q qVar = (C18987q) eVar.f53308b;
            } else {
                C18987q qVar2 = C18987q.f53351a;
            }
            C46459k.m82829b(cVar4.mo24134b(), "Failed to push RenderedDataHideEvent.", new Object[0]);
        } else if (i3 == 5) {
            if (i2 == 6) {
                uVar = (C18991u) eVar.f53308b;
            } else {
                uVar = C18991u.f53360b;
            }
            C18581b bVar = this.f52899f;
            C18989s sVar = uVar.f53362a;
            if (sVar == null) {
                sVar = C18989s.f53353f;
            }
            C18575c cVar5 = new C18575c(sVar.f53356b);
            C18989s sVar2 = uVar.f53362a;
            if (sVar2 == null) {
                sVar2 = C18989s.f53353f;
            }
            C46459k.m82829b(C60922j.m93045h(bVar.mo24076a(cVar5, sVar2.f53357c), C47810es.m84966f(new C18778a(this, uVar)), this.f52898e), "Failed to push RenderedDataRefreshEvent.", new Object[0]);
        } else if (i3 == 7) {
            C59104x c2 = f52894a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "PCP.v2CtfListener");
            ((C59052c) ((C59052c) c2).mo56372aa(47352)).mo56386p("CTF event type missing inside payload.");
        }
    }
}
