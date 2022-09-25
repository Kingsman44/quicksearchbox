package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ab */
/* compiled from: PG */
public final class C96071ab extends C84036z {

    /* renamed from: a */
    private static final C59071e f268981a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ab");

    /* renamed from: b */
    private final C83893b f268982b;

    /* renamed from: c */
    private final C95299e f268983c;

    /* renamed from: d */
    private final boolean f268984d;

    /* renamed from: e */
    private final List f268985e;

    public C96071ab(C83893b bVar, C95299e eVar, boolean z, C63138d dVar) {
        this.f268982b = bVar;
        this.f268983c = eVar;
        this.f268984d = z;
        this.f268985e = dVar == null ? null : dVar.f170498c;
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        List list;
        if (this.f268984d) {
            C58833ax a = this.f268982b.mo77278a();
            if (!a.mo56113h() || (list = this.f268985e) == null || !list.contains(((Account) a.mo56107c()).name)) {
                C59104x d = f268981a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AccountMismatchSequence");
                ((C59052c) ((C59052c) d).mo56372aa(16941)).mo56386p("Account Mismatch Condition, Fail OOBE");
                C95299e eVar = this.f268983c;
                eVar.f266650e = -4;
                eVar.f266647b.mo57066b("AccountError");
                C58833ax a2 = this.f268982b.mo77278a();
                C96070aa aaVar = new C96070aa();
                String str = a2.mo56113h() ? ((Account) a2.mo56107c()).name : BuildConfig.FLAVOR;
                Bundle bundle = new Bundle();
                bundle.putString("name", str.toString());
                return C58485gu.m89846n(C83875ai.m133540e(aaVar, bundle));
            }
        }
        return C58485gu.m89845m();
    }
}
