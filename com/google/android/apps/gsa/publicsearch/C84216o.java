package com.google.android.apps.gsa.publicsearch;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.apps.gsa.publicsearch.p6481a.C84199a;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p7066m.C90071dw;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import dagger.C68214a;
import java.util.Map;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.publicsearch.o */
/* compiled from: PG */
final class C84216o extends C84204d {

    /* renamed from: a */
    private final C87677ae f229209a;

    /* renamed from: b */
    private final C22871g f229210b;

    /* renamed from: c */
    private final C84213m f229211c;

    public C84216o(C87677ae aeVar, C22871g gVar, C84213m mVar) {
        ((C59052c) ((C59052c) PublicSearchService.f229188a.mo56224b()).mo56372aa(7108)).mo56386p("Creating pss binder().");
        this.f229209a = aeVar;
        this.f229210b = gVar;
        this.f229211c = mVar;
    }

    /* renamed from: a */
    private final boolean m134265a() {
        String[] packagesForUid = this.f229211c.f229202a.getPackageManager().getPackagesForUid(getCallingUid());
        if (packagesForUid == null) {
            return false;
        }
        C84213m mVar = this.f229211c;
        mVar.mo77680b();
        C143701ac acVar = (C143701ac) mVar.f229206e.mo27525b();
        C90476a aVar = C91018d.f254254a;
        return DesugarArrays.stream((T[]) packagesForUid).allMatch(new C84215n(acVar));
    }

    /* renamed from: e */
    public final IBinder mo77677e(String str, IBinder iBinder, Bundle bundle) {
        ((C59052c) ((C59052c) PublicSearchService.f229188a.mo56224b()).mo56372aa(7098)).mo56386p("Calling beginBinderSession().");
        if (!this.f229211c.mo77679a().mo79745c(C90071dw.f249762g).contains(str) || (!PublicSearchService.f229189b.contains(str) && !m134265a())) {
            return null;
        }
        C84213m mVar = this.f229211c;
        mVar.mo77680b();
        Map map = mVar.f229205d;
        if (map != null && map.containsKey(str)) {
            ((C59052c) ((C59052c) PublicSearchService.f229188a.mo56224b()).mo56372aa(7100)).mo56386p("beginBinderSession(): calling binder");
            return ((C84199a) map.get(str)).mo77668a(C58833ax.m90833j(iBinder));
        }
        return null;
    }

    /* renamed from: f */
    public final C84209i mo77678f(String str, C84212l lVar) {
        C84198a aVar;
        ClientConfig clientConfig;
        ((C59052c) ((C59052c) PublicSearchService.f229188a.mo56224b()).mo56372aa(7103)).mo56386p("Calling beginSession().");
        if (!this.f229211c.mo77679a().mo79745c(C90071dw.f249763h).contains(str)) {
            return null;
        }
        if (!PublicSearchService.f229189b.contains(str) && !m134265a()) {
            return null;
        }
        C84213m mVar = this.f229211c;
        mVar.mo77680b();
        C68214a aVar2 = (C68214a) mVar.f229204c.get(str);
        if (aVar2 == null) {
            aVar = null;
        } else {
            aVar = (C84198a) aVar2.mo27525b();
        }
        if (aVar == null) {
            clientConfig = null;
        } else {
            clientConfig = aVar.mo77666a(getCallingUid());
        }
        if (clientConfig == null) {
            ((C59052c) ((C59052c) PublicSearchService.f229188a.mo56226d()).mo56372aa(7105)).mo56386p("Invalid client config. Failed to begin session.");
            return null;
        }
        ((C59052c) ((C59052c) PublicSearchService.f229188a.mo56224b()).mo56372aa(7104)).mo56389s("New PSS started. SessionType: %s", str);
        C84200aa aaVar = new C84200aa(this.f229209a, lVar, clientConfig, this.f229210b);
        aaVar.f229197d.mo28212l("Connect searchServiceClient", new C84224w(aaVar));
        aVar.mo77667b(lVar);
        return aaVar;
    }
}
