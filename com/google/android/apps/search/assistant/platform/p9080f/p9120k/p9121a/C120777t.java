package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import com.google.android.apps.search.assistant.libraries.p8966e.p8969c.C119344a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9026d.C119717a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C119942a;
import com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9095a.C120541b;
import com.google.android.apps.search.assistant.platform.p9080f.p9120k.C120782c;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.libraries.assistant.p1363c.p1394f.C17298b;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34831e;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36118j;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.assistant.p3897e.p3921j.C52069eb;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.t */
/* compiled from: PG */
public final class C120777t implements C120782c {

    /* renamed from: a */
    public static final C59071e f335897a = C59071e.m91331h();

    /* renamed from: b */
    public final C17298b f335898b;

    /* renamed from: c */
    public final C119717a f335899c;

    /* renamed from: d */
    public final C119942a f335900d;

    /* renamed from: e */
    public final C121011a f335901e;

    /* renamed from: f */
    public final C119834cb f335902f;

    /* renamed from: g */
    public final C120759b f335903g;

    /* renamed from: h */
    public final C71422aw f335904h;

    /* renamed from: i */
    public final boolean f335905i;

    /* renamed from: j */
    public final C69613f f335906j = new C69747m(new C120775r(this));

    /* renamed from: k */
    private final C69613f f335907k = new C69747m(new C120767j(this));

    public C120777t(C17298b bVar, C119717a aVar, C119942a aVar2, C121011a aVar3, C119834cb cbVar, C120759b bVar2, C71422aw awVar, boolean z) {
        C69664n.m101061g(bVar, "opaHandover");
        C69664n.m101061g(aVar, "opaHandoverStreamService");
        C69664n.m101061g(aVar2, "clientExecutionProxy");
        C69664n.m101061g(aVar3, "assistantEligibilityChecker");
        C69664n.m101061g(cbVar, "currentInteractionId");
        C69664n.m101061g(bVar2, "appFlowLogger");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f335898b = bVar;
        this.f335899c = aVar;
        this.f335900d = aVar2;
        this.f335901e = aVar3;
        this.f335902f = cbVar;
        this.f335903g = bVar2;
        this.f335904h = awVar;
        this.f335905i = z;
    }

    /* renamed from: a */
    public final C60870cx mo104925a() {
        C120759b bVar = this.f335903g;
        C37258g gVar = C37176a.f96934bz;
        C69664n.m101060f(gVar, "ASSISTANT_HANDOVER_EXPERIMENT_IDS_FETCH_STARTED");
        bVar.mo104920a(gVar);
        return C71663i.m104692e(this.f335904h, (C71424ay) null, new C120761d(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo104926b() {
        return (C60870cx) this.f335907k.mo5768a();
    }

    /* renamed from: c */
    public final C60870cx mo104927c(C60870cx cxVar, boolean z) {
        C69664n.m101061g(cxVar, "originalResultFuture");
        return C71663i.m104692e(this.f335904h, (C71424ay) null, new C120774q(cxVar, this, z, (C69577g) null), 3);
    }

    /* renamed from: d */
    public final C60870cx mo104928d() {
        C120759b bVar = this.f335903g;
        C37258g gVar = C37176a.f96846aQ;
        C69664n.m101060f(gVar, "ASSISTANT_HANDOVER_SUPPO…_CLIENT_OPS_FETCH_STARTED");
        bVar.mo104920a(gVar);
        return C71663i.m104692e(this.f335904h, (C71424ay) null, new C120776s(this, (C69577g) null), 3);
    }

    /* renamed from: e */
    public final void mo104929e(C120541b bVar) {
        C34831e eVar;
        Object obj;
        C52078ek ekVar;
        C52070ec ecVar;
        C69664n.m101061g(bVar, "executionResult");
        C58485gu<C52083ep> b = bVar.mo104816b();
        C69664n.m101060f(b, "executionResult.ignoredInteractions");
        ArrayList<C52069eb> arrayList = new ArrayList<>(C69540x.m100804k(b, 10));
        for (C52083ep epVar : b) {
            if (epVar.f136692b == 3) {
                ekVar = (C52078ek) epVar.f136693c;
            } else {
                ekVar = C52078ek.f136671f;
            }
            if (ekVar.f136674b == 3) {
                ecVar = (C52070ec) ekVar.f136675c;
            } else {
                ecVar = C52070ec.f136651d;
            }
            C52069eb ebVar = ecVar.f136655c;
            if (ebVar == null) {
                ebVar = C52069eb.f136648b;
            }
            arrayList.add(ebVar);
        }
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C52069eb ebVar2 : arrayList) {
            arrayList2.add(C119344a.f332753b.mo38884e(ebVar2.f136650a));
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            eVar = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Optional) obj).isPresent()) {
                break;
            }
        }
        Optional optional = (Optional) obj;
        C36118j jVar = optional != null ? (C36118j) optional.get() : null;
        if (jVar == null) {
            this.f335903g.mo104922c(C62722b.UNKNOWN);
            return;
        }
        if ((jVar.f94453a & 1) != 0) {
            C34822b bVar2 = jVar.f94455c;
            if (bVar2 == null) {
                bVar2 = C34822b.f92358d;
            }
            eVar = C34830d.m63594a(bVar2);
        }
        this.f335903g.mo104923d(eVar);
    }

    /* renamed from: f */
    public final void mo104930f(boolean z, Throwable th) {
        C37258g gVar;
        C120759b bVar = this.f335903g;
        if (z) {
            gVar = C37176a.f96851aV;
        } else {
            gVar = C37176a.f96850aU;
        }
        C69664n.m101060f(gVar, "if (isFinal) AndroidAppF…_PREFETCH_ORIGINAL_RESULT");
        bVar.mo104920a(gVar);
        if (z) {
            if (th == null) {
                this.f335903g.mo104922c(C62722b.CANCELLED);
            } else {
                this.f335903g.mo104923d(th);
            }
            this.f335899c.mo104486b(new CancellationException("Commit original result."));
        }
    }
}
