package com.google.android.apps.gsa.search.core.p6884y.p6912f;

import com.google.android.apps.gsa.search.core.p6884y.p6885a.C87285b;
import com.google.android.apps.gsa.search.core.p6884y.p6913g.C87378a;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.shared.monet.p7114f.C90325c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91007g;
import com.google.android.libraries.gsa.monet.internal.service.C23003a;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.internal.service.C23018n;
import com.google.android.libraries.gsa.monet.internal.service.C23021q;
import com.google.android.libraries.gsa.monet.internal.service.C23027w;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23061l;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23087a;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23093g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.y.f.d */
/* compiled from: PG */
public final class C87374d implements C91007g {

    /* renamed from: a */
    public static final C59071e f235938a = C59071e.m91332i("com.google.android.apps.gsa.search.core.y.f.d");

    /* renamed from: b */
    public final C68214a f235939b;

    /* renamed from: c */
    public final Map f235940c = new HashMap();

    /* renamed from: d */
    public final C86683e f235941d;

    /* renamed from: e */
    public final C68214a f235942e;

    /* renamed from: f */
    public final C68214a f235943f;

    /* renamed from: g */
    public final C23093g f235944g;

    /* renamed from: h */
    public final long f235945h;

    /* renamed from: i */
    public final C87371a f235946i;

    public C87374d(C68214a aVar, C58833ax axVar, C86683e eVar, C68214a aVar2, C68214a aVar3, C23093g gVar, long j) {
        this.f235939b = aVar;
        this.f235946i = (C87371a) axVar.mo56107c();
        this.f235941d = eVar;
        this.f235942e = aVar2;
        this.f235943f = aVar3;
        this.f235944g = gVar;
        this.f235945h = j;
    }

    /* renamed from: a */
    public static void m141360a(C87285b bVar) {
        C87378a f = bVar.mo80932f();
        if (f.f252256e) {
            f.mo84012d();
        }
        if (f.f252255d) {
            f.mo84013e();
        }
        if (f.f252254c) {
            f.mo84017i();
        }
        C23027w l = bVar.mo80934l();
        l.f63349a.mo28406b();
        C23018n nVar = l.f63350b.f63335a;
        nVar.mo28436e();
        C23078ai aiVar = nVar.f63333b;
        if (aiVar != null) {
            nVar.f63405W.mo28344p(aiVar);
            nVar.f63333b = null;
        }
        ((C23003a) nVar.f63332a).f63273b.mo28730f(new C23093g("SCOPE_ROOT_CLEARED"), false);
        C87378a f2 = bVar.mo80932f();
        if (!f2.f252253b.isEmpty()) {
            ((C59052c) ((C59052c) C90325c.f252252a.mo56226d()).mo56372aa(10764)).mo56389s("%s", new StringBuilder("Observers did not unsubscribe: "));
            f2.f252253b.clear();
        }
        f2.f252257f = true;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MonetServiceHost");
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("MonetClients");
        for (Map.Entry entry : this.f235940c.entrySet()) {
            C91006f e2 = e.mo85281e((Object) null);
            e2.mo85291r((String) entry.getKey());
            C91006f e3 = e2.mo85281e((Object) null);
            e3.mo85291r("Controllers");
            C23021q qVar = ((C87285b) entry.getValue()).mo28503k().f63348a;
            C23087a aVar = new C23087a();
            ArrayList arrayList = new ArrayList(qVar.f63338a.keySet());
            Collections.sort(arrayList);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str = (String) arrayList.get(i);
                C23015k kVar = (C23015k) qVar.f63338a.get(str);
                kVar.getClass();
                C23056g b = kVar.mo28422b();
                kVar.f63312g.mo28469e();
                aVar.mo28530a(new C23061l(str, b));
            }
            for (C23061l lVar : new C23088b(aVar.f63434a)) {
                C91006f e4 = e3.mo85281e((Object) null);
                e4.mo85291r(lVar.f63415a);
                C23056g gVar = lVar.f63416b;
                if (gVar instanceof C91007g) {
                    e4.mo85287n((C91007g) gVar);
                }
            }
        }
    }
}
