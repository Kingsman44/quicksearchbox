package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7947f.C100848a;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132817y;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.gms.learning.internal.C144772d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.n */
/* compiled from: PG */
public final /* synthetic */ class C100809n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ GsaExampleStoreService f281752a;

    /* renamed from: b */
    public final /* synthetic */ String f281753b;

    /* renamed from: c */
    public final /* synthetic */ byte[] f281754c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f281755d;

    /* renamed from: e */
    public final /* synthetic */ C144772d f281756e;

    public /* synthetic */ C100809n(GsaExampleStoreService gsaExampleStoreService, String str, C144772d dVar, byte[] bArr, byte[] bArr2) {
        this.f281752a = gsaExampleStoreService;
        this.f281753b = str;
        this.f281756e = dVar;
        this.f281754c = bArr;
        this.f281755d = bArr2;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        GsaExampleStoreService gsaExampleStoreService = this.f281752a;
        String str = this.f281753b;
        C144772d dVar = this.f281756e;
        byte[] bArr = this.f281754c;
        byte[] bArr2 = this.f281755d;
        C132800h hVar = (C132800h) obj;
        if (hVar.f362334b.isEmpty()) {
            C59104x c = GsaExampleStoreService.f281713a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaExamplesService");
            ((C59052c) ((C59052c) c).mo56372aa(19506)).mo56389s("onStartQuery() failed for collection: [%s]. reason: Sign-out user", str);
            dVar.mo120205b("Sign-out user.");
            gsaExampleStoreService.f281717e.mo92059a(str, 1);
            return C60866ct.f164955a;
        }
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132817y yVar = zVar.f362396b;
        if (yVar == null) {
            yVar = C132817y.f362388d;
        }
        if (yVar.f362391b) {
            C132818z zVar2 = hVar.f362336d;
            if (zVar2 == null) {
                zVar2 = C132818z.f362393h;
            }
            if (zVar2.f362398d) {
                C132798f fVar = hVar.f362335c;
                if (fVar == null) {
                    fVar = C132798f.f362315o;
                }
                if (!fVar.f362320d) {
                    C59104x c2 = GsaExampleStoreService.f281713a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "GsaExamplesService");
                    ((C59052c) ((C59052c) c2).mo56372aa(19505)).mo56389s("onStartQuery() failed for collection: [%s]. Account doesn't allow training.", str);
                    dVar.mo120205b("Restricted account");
                    gsaExampleStoreService.f281717e.mo92059a(str, 3);
                    return C60866ct.f164955a;
                }
                C69464a aVar = (C69464a) gsaExampleStoreService.f281714b.get(str);
                if (aVar != null) {
                    optional = Optional.m71637of((C100848a) aVar.mo17428b());
                } else {
                    optional = Optional.empty();
                }
                if (optional.isPresent()) {
                    C59104x b = GsaExampleStoreService.f281713a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "GsaExamplesService");
                    ((C59052c) ((C59052c) b).mo56372aa(19504)).mo56389s("Adapter found for collection: %s", str);
                    C100801f fVar2 = new C100801f((C100848a) optional.get());
                    return C100742h.m166944c(fVar2.f281731b.mo92066a(str, bArr, bArr2)).mo92033b(Throwable.class, new C100803h(str)).mo92036f(new C100804i(gsaExampleStoreService, str, dVar, fVar2)).f281631a;
                }
                C100742h f = C100742h.m166943a(new C100805j(gsaExampleStoreService, hVar.f362334b, str, bArr, bArr2)).mo92036f(new C100806k(gsaExampleStoreService, str, dVar));
                f.mo92038i(C100807l.f281750a);
                return f.f281631a;
            }
        }
        C59104x c3 = GsaExampleStoreService.f281713a.mo56225c();
        c3.mo56378ag(C58975e.f156826a, "GsaExamplesService");
        ((C59052c) ((C59052c) c3).mo56372aa(19503)).mo56389s("onStartQuery() failed for collection: [%s]. Training flags OFF.", str);
        dVar.mo120205b("Training flags OFF.");
        gsaExampleStoreService.f281717e.mo92059a(str, 2);
        return C60866ct.f164955a;
    }
}
