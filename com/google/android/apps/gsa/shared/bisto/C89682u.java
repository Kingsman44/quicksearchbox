package com.google.android.apps.gsa.shared.bisto;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.p10712d.C142468gl;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.shared.bisto.u */
/* compiled from: PG */
public final class C89682u {

    /* renamed from: b */
    private static final C59071e f242813b = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.u");

    /* renamed from: a */
    public final C89618ap f242814a;

    public C89682u(C89618ap apVar) {
        this.f242814a = apVar;
    }

    /* renamed from: d */
    private static String m146058d(String str, String str2, String str3) {
        return str + "/" + str2 + "/" + str3;
    }

    /* renamed from: a */
    public final C58833ax mo83584a(C142468gl glVar, C124719q qVar, String str) {
        String str2;
        C59071e eVar = f242813b;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DspHotwordModelHelper");
        ((C59052c) ((C59052c) b).mo56372aa(10253)).mo56389s("locale: %s", str);
        if (!C58837ba.m90859h(str)) {
            String str3 = glVar.f386629h;
            if ((glVar.f386622a & 256) != 0) {
                str2 = glVar.f386630i;
            } else {
                str2 = C124719q.CAR_ACCESSORY.equals(qVar) ? "CAPE" : BuildConfig.FLAVOR;
            }
            return mo83585b(str.toString(), str3, str2);
        }
        C59104x c = eVar.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DspHotwordModelHelper");
        ((C59052c) ((C59052c) c).mo56372aa(10254)).mo56386p("primary assistant language not found!");
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C58833ax mo83585b(String str, String str2, String str3) {
        C89618ap apVar = this.f242814a;
        C58976aa aaVar = C58975e.f156826a;
        boolean z = apVar.f242687f;
        C58495hd hdVar = apVar.f242685d;
        String c = C58890d.m90988c(str.replace("_", "-"));
        C58480gp e = C58485gu.m89837e();
        int i = 0;
        String concat = String.valueOf((String) C58869cf.m90937c(C58837ba.m90854c("-")).mo56155i(c).get(0)).concat("-*");
        e.mo55395g(m146058d(c, str2, str3));
        e.mo55395g(m146058d(concat, str2, str3));
        e.mo55395g(m146058d(c, "*", str3));
        e.mo55395g(m146058d(c, str2, "*"));
        e.mo55395g(m146058d(concat, "*", str3));
        e.mo55395g(m146058d(concat, str2, "*"));
        e.mo55395g(m146058d(c, "*", "*"));
        e.mo55395g(m146058d(concat, "*", "*"));
        C58485gu f = e.mo55394f();
        int i2 = ((C58724pq) f).f156474d;
        while (i < i2) {
            String str4 = (String) f.get(i);
            i++;
            if (hdVar.containsKey(str4)) {
                return C58833ax.m90834k((String) hdVar.get(str4));
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final Collection mo83586c(C142468gl glVar) {
        return Arrays.asList(glVar.f386632k.split("\n"));
    }
}
