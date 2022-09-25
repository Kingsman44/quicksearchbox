package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100741g;
import com.google.android.gms.learning.internal.C144772d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.i */
/* compiled from: PG */
public final /* synthetic */ class C100804i implements C100741g {

    /* renamed from: a */
    public final /* synthetic */ GsaExampleStoreService f281738a;

    /* renamed from: b */
    public final /* synthetic */ String f281739b;

    /* renamed from: c */
    public final /* synthetic */ C100801f f281740c;

    /* renamed from: d */
    public final /* synthetic */ C144772d f281741d;

    public /* synthetic */ C100804i(GsaExampleStoreService gsaExampleStoreService, String str, C144772d dVar, C100801f fVar) {
        this.f281738a = gsaExampleStoreService;
        this.f281739b = str;
        this.f281741d = dVar;
        this.f281740c = fVar;
    }

    /* renamed from: a */
    public final void mo92032a(Object obj) {
        GsaExampleStoreService gsaExampleStoreService = this.f281738a;
        String str = this.f281739b;
        C144772d dVar = this.f281741d;
        C100801f fVar = this.f281740c;
        if (!((Boolean) obj).booleanValue()) {
            C59104x d = GsaExampleStoreService.f281713a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GsaExamplesService");
            ((C59052c) ((C59052c) d).mo56372aa(19509)).mo56389s("Failed to initialize example store iterator for collection: %s", str);
            dVar.mo120205b("Adapter init failed");
            gsaExampleStoreService.f281717e.mo92059a(str, 4);
            int i = C90755l.f253831a;
            return;
        }
        C59104x b = GsaExampleStoreService.f281713a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaExamplesService");
        ((C59052c) ((C59052c) b).mo56372aa(19508)).mo56389s("Successfully started the query for collection: %s", str);
        dVar.mo120204a(fVar);
        gsaExampleStoreService.f281717e.mo92060b(str);
    }
}
