package com.google.android.libraries.lens.view.filters.translation;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25986j;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58833ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56299cz;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56301da;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56302db;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56304dd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.br */
/* compiled from: PG */
final class C26080br implements C25986j {

    /* renamed from: a */
    private final C26079bq f70891a;

    public C26080br(AccountId accountId) {
        C26079bq bqVar = new C26079bq();
        C68324h.m98669f(bqVar);
        C47247a.m84047b(bqVar, accountId);
        this.f70891a = bqVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Fragment mo31044a() {
        return this.f70891a;
    }

    /* renamed from: b */
    public final void mo31045b(C56304dd ddVar) {
        C26104co f = this.f70891a.mo17754z();
        for (C56302db dbVar : ddVar.f150052a) {
            C56306df a = C56306df.m87964a(dbVar.f150048d);
            if (a == null) {
                a = C56306df.UNKNOWN_FILTER_TYPE;
            }
            if (a == C56306df.TRANSLATE && dbVar.f150046b == 4) {
                C56301da daVar = (C56301da) dbVar.f150047c;
                if ((daVar.f150039a & 4) != 0) {
                    C26059ax axVar = f.f70933p;
                    C56299cz a2 = C56299cz.m87961a(daVar.f150042d);
                    if (a2 == null) {
                        a2 = C56299cz.UNKNOWN;
                    }
                    axVar.f70791E = C58833ax.m90833j(a2);
                } else {
                    f.f70933p.f70791E = C58833ax.m90833j((Object) null);
                }
                if (daVar.f150041c || daVar.f150040b.isEmpty()) {
                    f.f70933p.mo31257l((Locale) null);
                    return;
                }
                Locale forLanguageTag = Locale.forLanguageTag(daVar.f150040b);
                if (forLanguageTag.getLanguage().isEmpty()) {
                    f.f70933p.mo31257l((Locale) null);
                    return;
                } else {
                    f.f70933p.mo31257l(forLanguageTag);
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        this.f70891a.mo17754z().mo30427c(eVar);
    }

    /* renamed from: d */
    public final void mo31046d() {
        this.f70891a.mo17754z().f70918a.mo31302e();
    }

    /* renamed from: e */
    public final void mo31047e() {
        this.f70891a.mo17754z().f70918a.mo31303f();
    }
}
