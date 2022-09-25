package com.google.android.apps.gsa.staticplugins.customtabs.intent;

import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.C60492rx;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.intent.l */
/* compiled from: PG */
public abstract class C98681l {
    /* renamed from: c */
    public static C98681l m163461c(C60492rx rxVar) {
        boolean z = true;
        C58838bb.m90868c(!C98682m.m163467b(rxVar));
        if (rxVar == C60492rx.MAYBE_CUSTOM_TABS_ONBOARDING_DIALOG_SHOWN) {
            z = false;
        }
        C58838bb.m90868c(z);
        return new C98671b(C58833ax.m90834k(rxVar), C58836b.f156633a);
    }

    /* renamed from: d */
    public static C98681l m163462d() {
        C58836b bVar = C58836b.f156633a;
        return new C98671b(bVar, bVar);
    }

    /* renamed from: e */
    public static C98681l m163463e(C60492rx rxVar, C98572h hVar) {
        C58838bb.m90868c(C98682m.m163467b(rxVar));
        return new C98671b(C58833ax.m90834k(rxVar), C58833ax.m90834k(hVar));
    }

    /* renamed from: a */
    public abstract C58833ax mo91250a();

    /* renamed from: b */
    public abstract C58833ax mo91251b();

    /* renamed from: f */
    public final boolean mo91256f() {
        return mo91251b().mo56113h() && C98682m.m163467b((C60492rx) mo91251b().mo56107c());
    }
}
