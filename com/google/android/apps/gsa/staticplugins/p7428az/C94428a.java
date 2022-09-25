package com.google.android.apps.gsa.staticplugins.p7428az;

import android.text.TextUtils;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6552ap.C84718a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.gms.analytics.C142698e;
import com.google.android.gms.analytics.C142767t;
import com.google.android.gms.analytics.C142769v;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.libraries.gcoreclient.p1751b.p1752a.C21449a;
import com.google.android.libraries.gcoreclient.p1751b.p1752a.C21450b;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.az.a */
/* compiled from: PG */
public final class C94428a extends C86734a implements C84718a {

    /* renamed from: a */
    private static final C59071e f264004a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.az.a");

    /* renamed from: b */
    private final C86124t f264005b;

    /* renamed from: c */
    private final Map f264006c = new WeakHashMap();

    /* renamed from: f */
    private final C21449a f264007f;

    public C94428a(C86124t tVar, C21449a aVar) {
        super(C118575h.GOOGLE_ANALYTICS, "googleanalytics");
        this.f264005b = tVar;
        this.f264007f = aVar;
    }

    /* renamed from: c */
    private final void m155755c(String str, String str2, String str3, C58833ax axVar) {
        C142769v vVar;
        if (this.f264005b.mo79746e(C90010bp.f247008t)) {
            if (!TextUtils.isEmpty(str)) {
                C58490gz gzVar = new C58490gz(4);
                gzVar.mo55429h("&t", "event");
                gzVar.mo55429h("&ec", str2);
                gzVar.mo55429h("&ea", str3);
                if (axVar.mo56113h()) {
                    gzVar.mo55429h("&ev", Long.toString(((Long) axVar.mo56107c()).longValue()));
                }
                C58495hd f = gzVar.mo55427f(false);
                C21450b bVar = (C21450b) this.f264006c.get(str);
                if (bVar == null) {
                    C142698e eVar = this.f264007f.f59901a;
                    synchronized (eVar) {
                        vVar = new C142769v(eVar.f387167a, str);
                        vVar.mo117538l();
                    }
                    C21450b bVar2 = new C21450b(vVar);
                    this.f264006c.put(str, bVar2);
                    bVar = bVar2;
                }
                C142769v vVar2 = bVar.f59902a;
                C144006f fVar = vVar2.f387328e.f387340h;
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = vVar2.f387328e.mo117541a().f387207e;
                boolean z2 = vVar2.f387328e.mo117541a().f387206d;
                HashMap hashMap = new HashMap();
                C142769v.m231694c(vVar2.f387411a, hashMap);
                C142769v.m231694c(f, hashMap);
                String str4 = (String) vVar2.f387411a.get("useSecure");
                int i = 1;
                boolean z3 = str4 == null || str4.equalsIgnoreCase("true") || str4.equalsIgnoreCase("yes") || str4.equalsIgnoreCase("1") || (!str4.equalsIgnoreCase("false") && !str4.equalsIgnoreCase("no") && !str4.equalsIgnoreCase("0"));
                for (Map.Entry entry : vVar2.f387412b.entrySet()) {
                    String b = C142769v.m231693b(entry);
                    if (b != null && !hashMap.containsKey(b)) {
                        hashMap.put(b, (String) entry.getValue());
                    }
                }
                vVar2.f387412b.clear();
                String str5 = (String) hashMap.get(C42181t.f110467a);
                if (TextUtils.isEmpty(str5)) {
                    vVar2.f387328e.mo117548h().mo117510c(hashMap, "Missing hit type parameter");
                    return;
                }
                String str6 = (String) hashMap.get("tid");
                if (!TextUtils.isEmpty(str6)) {
                    synchronized (vVar2) {
                        if ("screenview".equalsIgnoreCase(str5) || "pageview".equalsIgnoreCase(str5) || "appview".equalsIgnoreCase(str5) || TextUtils.isEmpty(str5)) {
                            String str7 = (String) vVar2.f387411a.get("&a");
                            C143919bh.m233958a(str7);
                            int parseInt = Integer.parseInt(str7) + 1;
                            if (parseInt < Integer.MAX_VALUE) {
                                i = parseInt;
                            }
                            vVar2.f387411a.put("&a", Integer.toString(i));
                        }
                    }
                    vVar2.f387328e.mo117542b().mo117603c(new C142767t(vVar2, hashMap, str5, currentTimeMillis, z2, z3, str6));
                    return;
                }
                vVar2.f387328e.mo117548h().mo117510c(hashMap, "Missing tracking id parameter");
                return;
            }
            ((C59052c) ((C59052c) f264004a.mo56225c()).mo56372aa(20125)).mo56386p("No Google Analytics tracking ID. Skipping sending Google Analytics data.");
        }
    }

    /* renamed from: a */
    public final void mo78440a(String str, String str2, String str3) {
        m155755c(str, str2, str3, C58836b.f156633a);
    }

    /* renamed from: b */
    public final void mo78441b(String str, String str2, String str3, long j) {
        m155755c(str, str2, str3, C58833ax.m90834k(Long.valueOf(j)));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
