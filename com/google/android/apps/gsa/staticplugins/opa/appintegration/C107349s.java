package com.google.android.apps.gsa.staticplugins.opa.appintegration;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.assistant.shared.be;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90721ae;
import com.google.android.apps.gsa.shared.util.p7171i.C91042a;
import com.google.android.apps.gsa.staticplugins.opa.p8363f.C109029a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17872ab;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17880aj;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17924z;
import com.google.assistant.p3897e.p3917i.p3918a.C51456ij;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.s */
/* compiled from: PG */
public final class C107349s implements be {

    /* renamed from: c */
    private static final C59071e f298753c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appintegration.s");

    /* renamed from: d */
    private final C86124t f298754d;

    /* renamed from: e */
    private final C109029a f298755e;

    /* renamed from: f */
    private final C86054o f298756f;

    /* renamed from: g */
    private final C69464a f298757g;

    /* renamed from: h */
    private final C9325m f298758h;

    public C107349s(C86124t tVar, C86054o oVar, C109029a aVar, C69464a aVar2, C9325m mVar) {
        this.f298754d = tVar;
        this.f298756f = oVar;
        this.f298755e = aVar;
        this.f298757g = aVar2;
        this.f298758h = mVar;
    }

    /* renamed from: l */
    public static C58833ax m178237l(String str, String str2) {
        String num = Integer.toString(C91042a.m148717a(str));
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str3 : C58869cf.m90936b(new C58903m(';')).mo56151a().mo56155i(str2)) {
            List i = C58869cf.m90936b(new C58903m(',')).mo56155i(str3);
            if (i.size() != 2) {
                C59104x d = f298753c.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OpaAppIntegUtil");
                ((C59052c) ((C59052c) d).mo56372aa(23682)).mo56389s("Invalid hashed package name and values format: %s", str3);
                return C58836b.f156633a;
            } else if (num.equals(i.get(0))) {
                z = true;
                if (!TextUtils.isEmpty((CharSequence) i.get(1))) {
                    arrayList.addAll(C58869cf.m90936b(new C58903m('|')).mo56151a().mo56155i((CharSequence) i.get(1)));
                }
            }
        }
        return z ? C58833ax.m90834k(arrayList) : C58836b.f156633a;
    }

    /* renamed from: a */
    public final C58833ax mo95950a(C17880aj ajVar) {
        if (!(ajVar == null || (ajVar.f51223a & 64) == 0)) {
            C17872ab abVar = ajVar.f51230h;
            if (abVar == null) {
                abVar = C17872ab.f51209b;
            }
            for (C17924z zVar : abVar.f51211a) {
                int i = zVar.f51350a;
                if (!((i & 1) == 0 || (i & 2) == 0)) {
                    try {
                        if (zVar.f51351b.equals("assistant.api.params.MessagingAppParam")) {
                            return C58833ax.m90834k((C51456ij) C62942bv.parseFrom((C62942bv) C51456ij.f134037d, zVar.f51352c));
                        }
                    } catch (C62974ct unused) {
                        C59104x d = f298753c.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "OpaAppIntegUtil");
                        ((C59052c) ((C59052c) d).mo56372aa(23681)).mo56389s("Invalid protocol buffer for %s", zVar.f51351b);
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final List mo95951b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C58833ax l = m178237l(str, this.f298754d.mo79758x(C90014bt.f247043H));
            if (l.mo56113h()) {
                return (List) l.mo56107c();
            }
        }
        return this.f298754d.mo79745c(C90014bt.f247850z);
    }

    /* renamed from: c */
    public final List mo95952c(String str) {
        C58833ax axVar;
        if (!this.f298758h.mo17534a()) {
            return Collections.emptyList();
        }
        String x = this.f298754d.mo79758x(C90014bt.f247044I);
        if (TextUtils.isEmpty(x)) {
            axVar = C58836b.f156633a;
        } else {
            C58833ax l = m178237l(str, x);
            if (!l.mo56113h()) {
                axVar = C58836b.f156633a;
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str2 : (List) l.mo56107c()) {
                    try {
                        Integer valueOf = Integer.valueOf(Integer.parseInt(str2));
                        if (!arrayList.contains(valueOf)) {
                            arrayList.add(valueOf);
                        }
                    } catch (NumberFormatException unused) {
                        C59104x d = f298753c.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "OpaAppIntegUtil");
                        ((C59052c) ((C59052c) d).mo56372aa(23683)).mo56389s("Invalid voice plate mode format: %s", str2);
                        axVar = C58836b.f156633a;
                    }
                }
                axVar = C58833ax.m90834k(arrayList);
            }
        }
        if (axVar.mo56113h()) {
            return (List) axVar.mo56107c();
        }
        return this.f298754d.mo79749o(C90014bt.f247036A);
    }

    /* renamed from: d */
    public final boolean mo95953d() {
        return mo95961m("com.google.android.apps.maps");
    }

    /* renamed from: e */
    public final boolean mo95954e() {
        List c = mo95952c("com.google.android.apps.maps");
        this.f298756f.mo79668a();
        if (!c.contains(1) || !c.contains(2) || !this.f298755e.mo97405j()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo95955f() {
        C58833ax j = C58833ax.m90833j(this.f298756f.mo79668a());
        if (!this.f298754d.mo79746e(C90014bt.f247334fG)) {
            return false;
        }
        C109029a aVar = this.f298755e;
        C58976aa aaVar = C58975e.f156826a;
        return j.mo56113h() && !aVar.mo97400e() && aVar.mo97402g((Account) j.mo56107c()) == 5 && aVar.f303182a.l() && this.f298758h.mo17534a();
    }

    /* renamed from: g */
    public final boolean mo95956g() {
        this.f298756f.mo79668a();
        return ((Boolean) this.f298757g.mo17428b()).booleanValue() && this.f298755e.mo97405j();
    }

    /* renamed from: h */
    public final boolean mo95957h(String str, byte[] bArr) {
        if (C90721ae.f253799h.contains(str) && bArr != null) {
            try {
                C17880aj ajVar = (C17880aj) C62942bv.parseFrom((C62942bv) C17880aj.f51221i, bArr, C62921ba.f169869a);
                if (ajVar == null || !mo95958i(ajVar)) {
                    return false;
                }
                return true;
            } catch (C62974ct unused) {
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo95958i(C17880aj ajVar) {
        if (ajVar != null) {
            C17872ab abVar = ajVar.f51230h;
            if (abVar == null) {
                abVar = C17872ab.f51209b;
            }
            if (abVar.f51211a.size() > 0) {
                C17872ab abVar2 = ajVar.f51230h;
                if (abVar2 == null) {
                    abVar2 = C17872ab.f51209b;
                }
                if ((((C17924z) abVar2.f51211a.get(0)).f51350a & 1) != 0) {
                    C17872ab abVar3 = ajVar.f51230h;
                    if (abVar3 == null) {
                        abVar3 = C17872ab.f51209b;
                    }
                    if ("assistant.api.params.ImeAppParams".equals(((C17924z) abVar3.f51211a.get(0)).f51351b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo95959j() {
        return this.f298754d.mo79746e(C90014bt.f247092ad);
    }

    /* renamed from: k */
    public final boolean mo95960k() {
        return this.f298754d.mo79746e(C90014bt.f247618kZ);
    }

    /* renamed from: m */
    public final boolean mo95961m(String str) {
        return mo95956g() && mo95952c(str).contains(3);
    }
}
