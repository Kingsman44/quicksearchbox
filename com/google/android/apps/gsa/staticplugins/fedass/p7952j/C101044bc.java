package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.bc */
/* compiled from: PG */
public final /* synthetic */ class C101044bc implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C101050bi f282170a;

    public /* synthetic */ C101044bc(C101050bi biVar) {
        this.f282170a = biVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C101050bi biVar = this.f282170a;
        String F = ((C86054o) biVar.f282185b.mo27525b()).mo79659F();
        if (TextUtils.isEmpty(F)) {
            return C60866ct.f164955a;
        }
        C60870cx b = biVar.mo92132b("fedass_policy_config_group");
        C60870cx a = biVar.mo92131a();
        C60870cx c = ((C100719ab) biVar.f282187d.mo27525b()).mo92019c(F);
        return C60856cj.m92895d(b, a, c).mo57335b(new C101046be(biVar, b, a, c, F), C60826bg.f164896a);
    }
}
