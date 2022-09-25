package com.google.android.apps.gsa.staticplugins.opa.p8622y.p8624b;

import android.content.pm.PackageManager;
import android.os.Process;
import com.google.android.apps.gsa.publicsearch.C84198a;
import com.google.android.apps.gsa.publicsearch.C84212l;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87769cx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87770cy;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87771cz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88245un;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.gms.common.C143701ac;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.y.b.a */
/* compiled from: PG */
public final class C114530a implements C84198a {

    /* renamed from: a */
    private static final C59071e f317612a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.y.b.a");

    /* renamed from: b */
    private static final ClientConfig f317613b;

    /* renamed from: c */
    private final PackageManager f317614c;

    /* renamed from: d */
    private final C68214a f317615d;

    /* renamed from: e */
    private final C68214a f317616e;

    static {
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.REMOTE_SEARCH_SERVICE;
        gVar.f239199a = 0;
        gVar.f239204f = "car_assistant";
        f317613b = new ClientConfig(gVar);
    }

    public C114530a(PackageManager packageManager, C68214a aVar, C68214a aVar2) {
        this.f317614c = packageManager;
        this.f317615d = aVar;
        this.f317616e = aVar2;
    }

    /* renamed from: a */
    public final ClientConfig mo77666a(int i) {
        String str;
        if (i == Process.myUid()) {
            return null;
        }
        String[] packagesForUid = this.f317614c.getPackagesForUid(i);
        PackageManager packageManager = this.f317614c;
        C58485gu guVar = C90721ae.f253797f;
        int i2 = ((C58724pq) guVar).f156474d;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                str = null;
                break;
            }
            str = (String) guVar.get(i3);
            try {
                if (packageManager.getPackageInfo(str, 0).applicationInfo.enabled) {
                    break;
                }
                i3++;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        for (String str2 : packagesForUid) {
            if (C58832aw.m90831a(str2, str) && ((C143701ac) this.f317615d.mo27525b()).mo119084c(str2)) {
                return f317613b;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo77667b(C84212l lVar) {
        long j;
        C86124t tVar = (C86124t) this.f317616e.mo27525b();
        if (tVar.mo79743a(C90086ek.f250476dp) != 0) {
            j = tVar.mo79743a(C90086ek.f250476dp);
        } else {
            j = tVar.mo79743a(C90086ek.f250475do) != 0 ? tVar.mo79743a(C90086ek.f250475do) : 0;
        }
        if (j != 0) {
            try {
                C87770cy cyVar = (C87770cy) C87771cz.f237540b.createBuilder();
                int i = (int) j;
                cyVar.copyOnWrite();
                C87771cz czVar = (C87771cz) cyVar.instance;
                C62961ch chVar = czVar.f237542a;
                if (!chVar.mo58948c()) {
                    czVar.f237542a = C62942bv.mutableCopy(chVar);
                }
                czVar.f237542a.mo58916g(i);
                C88245un unVar = (C88245un) C88246uo.f238696c.createBuilder();
                C88244um umVar = C88244um.COORDINATED_EXPERIMENT_EVENT;
                unVar.copyOnWrite();
                C88246uo uoVar = (C88246uo) unVar.instance;
                uoVar.f238699b = umVar.f238695cJ;
                uoVar.f238698a |= 1;
                unVar.mo58885m(C87769cx.f237539a, (C87771cz) cyVar.build());
                lVar.mo29491e(((C88246uo) unVar.build()).toByteArray(), (SystemParcelableWrapper) null);
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f317612a.mo56225c()).mo56382g(e)).mo56372aa(24499)).mo56386p("Failed to send COORDINATED_EXPERIMENT_EVENT");
            }
        }
    }
}
