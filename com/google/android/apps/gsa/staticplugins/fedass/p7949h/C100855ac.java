package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100753s;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.ac */
/* compiled from: PG */
public final /* synthetic */ class C100855ac implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100862aj f281822a;

    /* renamed from: b */
    public final /* synthetic */ boolean f281823b;

    public /* synthetic */ C100855ac(C100862aj ajVar, boolean z) {
        this.f281822a = ajVar;
        this.f281823b = z;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C100862aj ajVar = this.f281822a;
        boolean z = this.f281823b;
        String F = ((C86054o) ajVar.f281835c.mo27525b()).mo79659F();
        if (TextUtils.isEmpty(F)) {
            return C60856cj.m92899h(new IllegalArgumentException("FL setting is not allowed to show for signed-out users."));
        }
        C100719ab abVar = (C100719ab) ajVar.f281836d.mo27525b();
        return abVar.mo92025i(F, new C100753s(abVar, z));
    }
}
