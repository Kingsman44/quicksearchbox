package com.google.android.apps.gsa.staticplugins.p7611bv;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84827a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89995ba;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p10923ac.p10947c.C147202d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4895aw.p4902b.C64024cg;
import com.google.protos.p5126n.C65605b;
import java.util.ArrayList;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.ac */
/* compiled from: PG */
public final /* synthetic */ class C97273ac implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C97276af f271681a;

    public /* synthetic */ C97273ac(C97276af afVar) {
        this.f271681a = afVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        int length;
        C97276af afVar = this.f271681a;
        ((C59052c) ((C59052c) C97276af.f271682a.mo56224b()).mo56372aa(20924)).mo56386p("Reading YouTube deletion data");
        Account[] r = afVar.f271685f.mo79684r();
        if (r == null || (length = r.length) == 0) {
            ((C59052c) ((C59052c) C97276af.f271682a.mo56224b()).mo56372aa(20925)).mo56386p("There is no logged in account in AGSA.");
            return C60856cj.m92900i(new C84827a(5, C58833ax.m90834k(-1L)));
        } else if (((long) length) > ((C86124t) afVar.f271683b.mo27525b()).mo79743a(C89995ba.f246762j)) {
            ((C59052c) ((C59052c) C97276af.f271682a.mo56224b()).mo56372aa(20926)).mo56386p("There are too many logged in accounts in AGSA.");
            return C60856cj.m92900i(new C84827a(6, C58833ax.m90834k(-1L)));
        } else {
            ArrayList arrayList = new ArrayList();
            for (Account account : r) {
                C60870cx g = C60922j.m93044g(afVar.mo90618c(((C147202d) afVar.f271684c.mo27525b()).mo124029a(account, 756, C65605b.f178309b), (byte[]) null), new C97274ad(), C60826bg.f164896a);
                C90476a aVar = C91018d.f254254a;
                arrayList.add(g);
                if (((C86124t) afVar.f271683b.mo27525b()).mo79746e(C89995ba.f246758f)) {
                    arrayList.add(C60922j.m93044g(afVar.mo90618c(((C147202d) afVar.f271684c.mo27525b()).mo124029a(account, 553, C64024cg.f173127c), Integer.toString(29).getBytes(StandardCharsets.UTF_8)), new C97275ae(), C60826bg.f164896a));
                }
            }
            return C60856cj.m92894c(arrayList).mo57334a(new C97271aa(arrayList), C60826bg.f164896a);
        }
    }
}
