package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100747m;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.ab */
/* compiled from: PG */
public final /* synthetic */ class C100854ab implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100862aj f281820a;

    /* renamed from: b */
    public final /* synthetic */ boolean f281821b;

    public /* synthetic */ C100854ab(C100862aj ajVar, boolean z) {
        this.f281820a = ajVar;
        this.f281821b = z;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C100862aj ajVar = this.f281820a;
        boolean z = this.f281821b;
        String F = ((C86054o) ajVar.f281835c.mo27525b()).mo79659F();
        if (TextUtils.isEmpty(F)) {
            return C60856cj.m92899h(new IllegalArgumentException("FL setting is not allowed to show for signed-out users."));
        }
        return ((C100719ab) ajVar.f281836d.mo27525b()).mo92025i(F, new C100747m(z));
    }
}
