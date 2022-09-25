package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.c */
/* compiled from: PG */
public final /* synthetic */ class C101052c implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101058i f282190a;

    public /* synthetic */ C101052c(C101058i iVar) {
        this.f282190a = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101058i iVar = this.f282190a;
        if (!((Optional) iVar.f282206d.mo27525b()).isPresent()) {
            return C60856cj.m92899h(new IllegalStateException("TrainingCacheEntryPoint cannot be absent"));
        }
        Account a = ((C86054o) iVar.f282204b.mo27525b()).mo79668a();
        if (a == null || TextUtils.isEmpty(a.name)) {
            return C60866ct.f164955a;
        }
        C60870cx a2 = ((C101071v) iVar.f282205c.mo27525b()).mo92135a(a);
        C60870cx c = ((C100719ab) iVar.f282207e.mo27525b()).mo92019c(a.name);
        return C60856cj.m92895d(a2, c).mo57335b(new C101055f(iVar, a2, c, a), iVar.f282208f);
    }
}
