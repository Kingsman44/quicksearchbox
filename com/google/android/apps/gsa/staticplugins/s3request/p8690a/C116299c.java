package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.search.core.google.p6790a.C85824i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.speech.p7298l.p7299a.C92457a;
import com.google.android.apps.gsa.speech.p7298l.p7299a.C92458b;
import com.google.android.apps.gsa.speech.p7298l.p7299a.C92459c;
import com.google.android.libraries.p3339v.C43205e;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.speech.p5208h.C66660e;
import com.google.speech.p5208h.C66672f;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.c */
/* compiled from: PG */
public final class C116299c extends C68247h {

    /* renamed from: a */
    private final C68283d f322431a;

    /* renamed from: c */
    private final C68283d f322432c;

    /* renamed from: d */
    private final C68283d f322433d;

    public C116299c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C116299c.class), aVar);
        this.f322431a = C68236af.m98549d(dVar);
        this.f322432c = C68236af.m98549d(dVar2);
        this.f322433d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C60870cx cxVar;
        List list = (List) obj;
        Query query = (Query) list.get(1);
        C92459c cVar = (C92459c) list.get(2);
        if (((C92473f) list.get(0)).f258014b != C90536a.ANDROID_TV_SEARCH) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C66660e eVar = (C66660e) C66672f.f181366c.createBuilder();
        if (query.mo84364bx("android.opa.extra.CONVERSATION_DELTA")) {
            try {
                C52079el elVar = (C52079el) ((C52079el) C52081en.f136679i.createBuilder()).mergeFrom(query.mo84439dT(), C62921ba.m95368a());
                if (query.mo84319bD()) {
                    C52091ex exVar = ((C52081en) elVar.instance).f136685e;
                    if (exVar == null) {
                        exVar = C52091ex.f136710b;
                    }
                    C52090ew ewVar = (C52090ew) exVar.toBuilder();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(C60922j.m93044g(C43205e.m76192b(cVar.f257899c.mo121929a()), C92458b.f257896a, C60826bg.f164896a));
                    if (cVar.f257898b.mo56113h()) {
                        arrayList.addAll(((C85824i) cVar.f257898b.mo56107c()).mo79466a());
                    }
                    cxVar = C60856cj.m92892a(arrayList).mo57334a(new C92457a(arrayList, ewVar, elVar, eVar), C60826bg.f164896a);
                } else {
                    eVar.copyOnWrite();
                    C66672f fVar = (C66672f) eVar.instance;
                    C52081en enVar = (C52081en) elVar.build();
                    enVar.getClass();
                    fVar.f181370b = enVar;
                    fVar.f181369a |= 2;
                    cxVar = C60856cj.m92900i((C66672f) eVar.build());
                }
            } catch (C62974ct unused) {
                C59104x d = C92459c.f257897a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AsstInputParamsBldr");
                ((C59052c) ((C59052c) d).mo56372aa(12816)).mo56386p("Unable to parse ConversationDelta included in Query");
            }
            return C60922j.m93044g(cxVar, C116245a.f322335a, C60826bg.f164896a);
        }
        cxVar = C60856cj.m92900i((C66672f) eVar.build());
        return C60922j.m93044g(cxVar, C116245a.f322335a, C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f322431a.mo60297gq(), this.f322432c.mo60297gq(), this.f322433d.mo60297gq());
    }
}
