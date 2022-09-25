package com.google.android.apps.search.fedora.examplestore;

import com.google.android.apps.search.fedora.p10093b.C132722c;
import com.google.android.apps.search.fedora.p10099e.C132786aq;
import com.google.android.apps.search.fedora.p10099e.C132787ar;
import com.google.android.gms.learning.internal.C144772d;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19405i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.fedora.examplestore.b */
/* compiled from: PG */
public final /* synthetic */ class C132820b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132826h f362406a;

    /* renamed from: b */
    public final /* synthetic */ String f362407b;

    /* renamed from: c */
    public final /* synthetic */ C144772d f362408c;

    public /* synthetic */ C132820b(C132826h hVar, String str, C144772d dVar) {
        this.f362406a = hVar;
        this.f362407b = str;
        this.f362408c = dVar;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C132826h hVar = this.f362406a;
        String str = this.f362407b;
        C144772d dVar = this.f362408c;
        C132787ar arVar = (C132787ar) obj;
        C132786aq aqVar = arVar.f362284b;
        if (aqVar == null) {
            aqVar = C132786aq.f362276d;
        }
        if (!aqVar.f362279b || !arVar.f362286d) {
            C59104x d = C132826h.f362419a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FedExampleStoreDel");
            ((C59052c) ((C59052c) d).mo56372aa(39828)).mo56389s("onStartQuery() failed for collection: [%s]. Training flags OFF.", str);
            dVar.mo120205b("Training flags OFF");
            hVar.f362421c.mo110911b(str, 1);
            return C60866ct.f164955a;
        }
        C69464a aVar = (C69464a) hVar.f362420b.get(str);
        if (aVar != null) {
            optional = Optional.m71637of((C19405i) aVar.mo17428b());
        } else {
            optional = Optional.empty();
        }
        if (!optional.isPresent()) {
            C59104x d2 = C132826h.f362419a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "FedExampleStoreDel");
            ((C59052c) ((C59052c) d2).mo56372aa(39832)).mo56389s("Adapter not found for collection: %s", str);
            dVar.mo120205b("Adapter init failed");
            hVar.f362421c.mo110911b(str, 2);
            return C60866ct.f164955a;
        }
        C59104x b = C132826h.f362419a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedExampleStoreDel");
        ((C59052c) ((C59052c) b).mo56372aa(39831)).mo56389s("Adapter found for collection: %s", str);
        C132830l lVar = new C132830l((C19405i) optional.get(), hVar.f362422d);
        C132722c b2 = C132722c.m215733b(lVar.f362428b.mo24598b());
        return new C132722c(b2.f362147a.mo51513e(Throwable.class, new C132821c(str), hVar.f362422d)).mo110894c(new C132822d(hVar, str, dVar, lVar), hVar.f362422d).f362147a;
    }
}
