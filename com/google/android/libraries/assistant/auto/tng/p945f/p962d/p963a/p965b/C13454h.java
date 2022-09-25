package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13461c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13530f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13533i;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13544t;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13545u;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13546v;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b.p966a.p967a.C13443a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b.p970c.C13449a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.C13519e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62963cj;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.h */
/* compiled from: PG */
public final class C13454h implements C13533i {

    /* renamed from: a */
    public static final C59071e f41288a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.d.a.b.h");

    /* renamed from: b */
    public final Executor f41289b;

    /* renamed from: c */
    public final C15481g f41290c;

    /* renamed from: d */
    private final C58459fv f41291d = new C58459fv();

    /* renamed from: e */
    private C13460n f41292e = C13460n.f41305b;

    /* renamed from: f */
    private boolean f41293f = false;

    /* renamed from: g */
    private final C13443a f41294g;

    public C13454h(C13443a aVar, Executor executor, C15481g gVar) {
        this.f41289b = executor;
        this.f41294g = aVar;
        this.f41290c = gVar;
    }

    /* renamed from: b */
    private final void m29712b(C13543s sVar, boolean z) {
        C59071e eVar = f41288a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
        ((C59052c) ((C59052c) b).mo56372aa(44812)).mo56386p("#populateCandidatesWithTriggers");
        if (!this.f41293f) {
            C13460n nVar = (C13460n) ProtoParsers.m95525h(this.f41294g.f41278a, C13460n.f41305b.getParserForType(), R.raw.heuristic_smart_action_templates_pb);
            this.f41292e = nVar;
            if (nVar.f41307a.isEmpty()) {
                C59104x d = eVar.mo56226d();
                d.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
                ((C59052c) ((C59052c) d).mo56372aa(44814)).mo56386p("No candidates populated since the templates are unavailable.");
                return;
            }
        }
        this.f41293f = true;
        if (z) {
            Iterator it = this.f41291d.mo54951D().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C13530f fVar = (C13530f) it.next();
                C13529e a = C13529e.m29814a(fVar.f41478c);
                if (a == null) {
                    a = C13529e.UNRECOGNIZED;
                }
                if (a == C13529e.CALL_SENDER) {
                    this.f41291d.mo54987i(fVar);
                    break;
                }
            }
        }
        for (C13458l lVar : this.f41292e.f41307a) {
            if (z) {
                C13529e a2 = C13529e.m29814a(lVar.f41302b);
                if (a2 == null) {
                    a2 = C13529e.UNRECOGNIZED;
                }
                if (a2 != C13529e.CALL_SENDER) {
                }
            }
            m29713c(lVar, sVar);
        }
        C59104x b2 = f41288a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
        ((C59052c) ((C59052c) b2).mo56372aa(44813)).mo56387q("Populated %d candidates with triggers from templates.", this.f41291d.f155874b);
    }

    /* renamed from: c */
    private final void m29713c(C13458l lVar, C13543s sVar) {
        try {
            C62963cj cjVar = new C62963cj(sVar.f41504d, C13543s.f41498e);
            C13529e a = C13529e.m29814a(lVar.f41302b);
            if (a == null) {
                a = C13529e.UNRECOGNIZED;
            }
            if (!cjVar.contains(a)) {
                C59104x b = f41288a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
                C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(44817);
                C13529e a2 = C13529e.m29814a(lVar.f41302b);
                if (a2 == null) {
                    a2 = C13529e.UNRECOGNIZED;
                }
                cVar.mo56389s("Heuristic smart action type %s not supported", a2);
                return;
            }
            this.f41291d.mo54920x(C13449a.m29710a(lVar, sVar), C13449a.m29711b(lVar));
        } catch (IllegalArgumentException e) {
            C59104x d = f41288a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(44815)).mo56386p("Invalid template skipped.");
        } catch (NoSuchFieldException e2) {
            C59104x d2 = f41288a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e2)).mo56372aa(44816)).mo56386p("ClientInput couldn't be constructed.");
        }
    }

    /* renamed from: a */
    public final C60870cx mo21092a(C13543s sVar) {
        C59071e eVar = f41288a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
        ((C59052c) ((C59052c) b).mo56372aa(44810)).mo56386p("#generate");
        if (!new C62963cj(sVar.f41506g, C13543s.f41499h).contains(C13461c.HEURISTIC)) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HeuristicSmartActionGen");
            ((C59052c) ((C59052c) d).mo56372aa(44811)).mo56386p("HeuristicSmartActionGenerator is disabled.");
            C13544t tVar = (C13544t) C13546v.f41508e.createBuilder();
            tVar.copyOnWrite();
            ((C13546v) tVar.instance).f41511b = C13545u.m29826a(7);
            C13546v vVar = (C13546v) tVar.build();
            this.f41290c.mo22352b(C13519e.m29803a(4, vVar));
            return C60856cj.m92900i(vVar);
        }
        if (!this.f41293f) {
            m29712b(sVar, false);
        } else {
            m29712b(sVar, true);
        }
        C47633f g = C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(this.f41291d.mo54985g()).map(new C13444b(this, sVar)).collect(C58370cn.f155946a)));
        C13442a aVar = new C13442a(this);
        return C60922j.m93044g(g, C47810es.m84963c(aVar), this.f41289b);
    }
}
