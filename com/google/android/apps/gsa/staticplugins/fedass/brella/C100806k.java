package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100741g;
import com.google.android.gms.learning.internal.C144772d;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.k */
/* compiled from: PG */
public final /* synthetic */ class C100806k implements C100741g {

    /* renamed from: a */
    public final /* synthetic */ GsaExampleStoreService f281747a;

    /* renamed from: b */
    public final /* synthetic */ String f281748b;

    /* renamed from: c */
    public final /* synthetic */ C144772d f281749c;

    public /* synthetic */ C100806k(GsaExampleStoreService gsaExampleStoreService, String str, C144772d dVar) {
        this.f281747a = gsaExampleStoreService;
        this.f281748b = str;
        this.f281749c = dVar;
    }

    /* renamed from: a */
    public final void mo92032a(Object obj) {
        GsaExampleStoreService gsaExampleStoreService = this.f281747a;
        String str = this.f281748b;
        C144772d dVar = this.f281749c;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x c = GsaExampleStoreService.f281713a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaExamplesService");
            ((C59052c) ((C59052c) c).mo56372aa(19511)).mo56389s("Failed to create materializer for [%s] collection", str);
            dVar.mo120205b("Ekho Materializer Error");
            gsaExampleStoreService.f281717e.mo92059a(str, 5);
            return;
        }
        C59104x b = GsaExampleStoreService.f281713a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaExamplesService");
        ((C59052c) ((C59052c) b).mo56372aa(19510)).mo56389s("Successfully created the materializer for collection: %s", str);
        dVar.mo120204a(new C100797b(str, (EkhoMaterializerImpl) optional.get()));
        gsaExampleStoreService.f281717e.mo92060b(str);
    }
}
