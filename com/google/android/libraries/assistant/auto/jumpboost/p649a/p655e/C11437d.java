package com.google.android.libraries.assistant.auto.jumpboost.p649a.p655e;

import com.google.android.apps.gsa.search.core.carassistant.p6780c.C85700a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.e.d */
/* compiled from: PG */
public final class C11437d implements C15488n {

    /* renamed from: a */
    private static final C59071e f37213a = C59071e.m91331h();

    /* renamed from: b */
    private final C85700a f37214b;

    /* renamed from: c */
    private boolean f37215c;

    /* renamed from: d */
    private boolean f37216d;

    public C11437d(C85700a aVar) {
        C69664n.m101061g(aVar, "carAssistantAppFlowLogger");
        this.f37214b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo19974a(C37254c cVar) {
        C69664n.m101061g(cVar, "eventBuilder");
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        return mo19976c(cVar, empty);
    }

    /* renamed from: b */
    public final C60870cx mo19975b(C37252a aVar, C15474b bVar) {
        C69664n.m101061g(aVar, "eventBuilder");
        C69664n.m101061g(bVar, "autoAppFlowEventMetadata");
        Optional of = Optional.m71637of(bVar);
        C69664n.m101060f(of, "of(autoAppFlowEventMetadata)");
        return mo19976c(aVar, of);
    }

    /* renamed from: c */
    public final C60870cx mo19976c(C37254c cVar, Optional optional) {
        C69664n.m101061g(cVar, "eventBuilder");
        C69664n.m101061g(optional, "autoAppFlowEventMetadataOptional");
        C11435b a = C11438e.m27134a(cVar, optional);
        if (a != null) {
            Object e = cVar.mo40782f().mo40799e().mo56109e(0L);
            C69664n.m101060f(e, "event.build().getElapsedTimeNanos().or(0)");
            long longValue = ((Number) e).longValue();
            C58833ax j = C58833ax.m90833j(a.mo19968b().orElse(null));
            C59687cb cbVar = (C59687cb) a.mo19969c().orElse(null);
            C59052c cVar2 = (C59052c) f37213a.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "CarAsAppFlowDel");
            C89849ae a2 = a.mo19967a();
            Long valueOf = Long.valueOf(longValue);
            cVar2.mo56379ah(new C59094n(43327));
            cVar2.mo56359L("Logging legacy app flow event: %s timestampNanos: %s, overrideAppflowTag: %s", a2, valueOf, j);
            if (!j.mo56113h() && a.mo19970d() != 3 && a.mo19970d() != 1) {
                return C60866ct.f164955a;
            }
            int d = a.mo19970d();
            if (d != 0) {
                int i = d - 1;
                if (i == 0 || i == 1) {
                    this.f37215c = false;
                    this.f37216d = false;
                    this.f37214b.mo79330l(a.mo19967a(), longValue, cbVar, j);
                } else if (i != 2) {
                    if (this.f37215c) {
                        this.f37214b.mo79320b(C89849ae.ASSISTANT_AUTO_END_NO_SPEECH_DETECTED_CANCEL, longValue, cbVar, j);
                    } else if (!this.f37216d) {
                        this.f37214b.mo79320b(a.mo19967a(), longValue, cbVar, j);
                    } else {
                        this.f37214b.mo79320b(C89849ae.ASSISTANT_AUTO_END_TIMEOUT_FAILURE, longValue, cbVar, j);
                    }
                    this.f37215c = false;
                    this.f37216d = false;
                } else {
                    this.f37214b.mo79324f(a.mo19967a(), longValue, cbVar, j);
                    if (a.mo19967a().equals(C89849ae.ASSISTANT_AUTO_NO_SPEECH_DETECTED)) {
                        this.f37215c = true;
                    }
                    if (a.mo19967a().equals(C89849ae.ASSISTANT_AUTO_TIMEOUT_DETECTED)) {
                        this.f37216d = true;
                    }
                }
            } else {
                int d2 = a.mo19970d();
                C11434a.m27121a(d2);
                throw new AssertionError("Unsupported flow event type ".concat(C11434a.m27121a(d2)));
            }
        }
        return C60866ct.f164955a;
    }
}
