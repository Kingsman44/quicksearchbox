package com.google.android.apps.gsa.staticplugins.opa.appintegration.p8293a;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gsa.assistant.shared.be;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6988al.C89193a;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.android.apps.gsa.staticplugins.opa.appintegration.C107349s;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.android.apps.search.assistant.platform.appintegration.p8991c.C119521a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17870a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17897b;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.a.a */
/* compiled from: PG */
public final class C107327a implements C89193a {

    /* renamed from: a */
    private static final C59071e f298674a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.a.a");

    /* renamed from: b */
    private final C86124t f298675b;

    /* renamed from: c */
    private final C58833ax f298676c;

    /* renamed from: d */
    private final bm f298677d;

    /* renamed from: e */
    private final C86054o f298678e;

    /* renamed from: f */
    private final Context f298679f;

    /* renamed from: g */
    private final C69464a f298680g;

    /* renamed from: h */
    private final C58833ax f298681h;

    public C107327a(C86124t tVar, C58833ax axVar, bm bmVar, C86054o oVar, Context context, C69464a aVar, C58833ax axVar2) {
        this.f298675b = tVar;
        this.f298676c = axVar;
        this.f298677d = bmVar;
        this.f298678e = oVar;
        this.f298679f = context;
        this.f298680g = aVar;
        this.f298681h = axVar2;
    }

    /* renamed from: b */
    private final boolean m178163b(String str) {
        this.f298679f.getPackageManager();
        return ((C21560e) this.f298680g.mo17428b()).f59951a.mo119084c(str);
    }

    /* renamed from: a */
    public final String mo19980a(String str, String str2) {
        boolean z;
        int i;
        if (C90771bo.m148273b(this.f298679f, UserHandleCompat.m148154a())) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        C17870a aVar = (C17870a) C17897b.f51274j.createBuilder();
        Account a = this.f298678e.mo79668a();
        boolean z2 = true;
        if (((C90721ae.f253797f.contains(str2) || C90721ae.f253794c.contains(str2)) && this.f298676c.mo56113h() && ((C109029a) this.f298676c.mo56107c()).mo97405j()) || (a != null && this.f298676c.mo56113h() && ((C109029a) this.f298676c.mo56107c()).mo97396a(a))) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(str2) || !"opa_app_integration_data".equals(str) || !z) {
            C58976aa aaVar2 = C58975e.f156826a;
            return null;
        }
        if (this.f298681h.mo56113h()) {
            List c = ((be) this.f298681h.mo56107c()).c(str2);
            aVar.copyOnWrite();
            C17897b bVar = (C17897b) aVar.instance;
            C62961ch chVar = bVar.f51277b;
            if (!chVar.mo58948c()) {
                bVar.f51277b = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) c, (List) bVar.f51277b);
            List b = ((be) this.f298681h.mo56107c()).b(str2);
            aVar.copyOnWrite();
            C17897b bVar2 = (C17897b) aVar.instance;
            C62971cq cqVar = bVar2.f51278c;
            if (!cqVar.mo58948c()) {
                bVar2.f51278c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) b, (List) bVar2.f51278c);
        }
        if (m178163b(str2)) {
            C58976aa aaVar3 = C58975e.f156826a;
            String b2 = this.f298677d.b();
            aVar.copyOnWrite();
            C17897b bVar3 = (C17897b) aVar.instance;
            b2.getClass();
            bVar3.f51276a |= 1;
            bVar3.f51279d = b2;
            Account a2 = this.f298678e.mo79668a();
            if (a2 != null) {
                String str3 = a2.name;
                aVar.copyOnWrite();
                C17897b bVar4 = (C17897b) aVar.instance;
                str3.getClass();
                bVar4.f51276a |= 2;
                bVar4.f51280e = str3;
            }
            if (((C109029a) this.f298676c.mo56107c()).mo97398c() && !this.f298677d.l()) {
                aVar.copyOnWrite();
                C17897b bVar5 = (C17897b) aVar.instance;
                bVar5.f51276a |= 4;
                bVar5.f51281f = true;
            }
        } else {
            C58976aa aaVar4 = C58975e.f156826a;
        }
        this.f298679f.getPackageManager();
        if (!((C21560e) this.f298680g.mo17428b()).f59951a.mo119084c(str2)) {
            C59104x d = f298674a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AppIntegrationPVE");
            ((C59052c) ((C59052c) d).mo56372aa(23689)).mo56386p("maybeAddExperimentIds(): not Google signed app.");
        } else {
            C58833ax l = C107349s.m178237l(str2, this.f298675b.mo79758x(C90014bt.f247849y));
            if (l.mo56113h()) {
                try {
                    for (String parseInt : (List) l.mo56107c()) {
                        int parseInt2 = Integer.parseInt(parseInt);
                        aVar.copyOnWrite();
                        C17897b bVar6 = (C17897b) aVar.instance;
                        C62961ch chVar2 = bVar6.f51282g;
                        if (!chVar2.mo58948c()) {
                            bVar6.f51282g = C62942bv.mutableCopy(chVar2);
                        }
                        bVar6.f51282g.mo58916g(parseInt2);
                    }
                } catch (Exception e) {
                    aVar.copyOnWrite();
                    ((C17897b) aVar.instance).f51282g = C17897b.emptyIntList();
                    C59104x c2 = f298674a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "AppIntegrationPVE");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(23687)).mo56386p("#maybeAddExperimentIds(): failed to parse experiment ids.");
                }
            }
        }
        if (m178163b(str2)) {
            try {
                i = this.f298679f.getPackageManager().getPackageInfo(str2, 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                i = -1;
            }
            boolean a3 = C119521a.m198385a(this.f298675b.mo79758x(C90014bt.f247038C), str2, i);
            C59104x b3 = f298674a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "AppIntegrationPVE");
            ((C59052c) ((C59052c) b3).mo56372aa(23691)).mo56359L("maybeAddIsGrpcSupported %s %d %b", str2, Integer.valueOf(i), Boolean.valueOf(a3));
            if (a3) {
                aVar.copyOnWrite();
                C17897b bVar7 = (C17897b) aVar.instance;
                bVar7.f51276a |= 8;
                bVar7.f51283h = true;
            }
        } else {
            C59104x d2 = f298674a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AppIntegrationPVE");
            ((C59052c) ((C59052c) d2).mo56372aa(23690)).mo56389s("Package %s is not eligible to retrieve Grpc Information", str2);
        }
        if (!m178163b(str2) || !C90721ae.f253797f.contains(str2)) {
            C59104x d3 = f298674a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "AppIntegrationPVE");
            ((C59052c) ((C59052c) d3).mo56372aa(23692)).mo56389s("Package %s is not eligible to retrieve TngMorris Information", str2);
        } else {
            boolean e2 = this.f298675b.mo79746e(C90051dc.f248830al);
            boolean e3 = this.f298675b.mo79746e(C90051dc.f248791Z);
            C59104x b4 = f298674a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "AppIntegrationPVE");
            ((C59052c) ((C59052c) b4).mo56372aa(23693)).mo56359L("maybeAddIsTngMorrisSupported %s: morris=%b, tngMorris=%b", str2, Boolean.valueOf(e2), Boolean.valueOf(e3));
            if (!e3 || !e2) {
                z2 = false;
            }
            aVar.copyOnWrite();
            C17897b bVar8 = (C17897b) aVar.instance;
            bVar8.f51276a |= 16;
            bVar8.f51284i = z2;
        }
        return Base64.encodeToString(((C17897b) aVar.build()).toByteArray(), 0);
    }
}
