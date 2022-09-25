package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100751q;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.r */
/* compiled from: PG */
public final /* synthetic */ class C100879r implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C100862aj f281867a;

    /* renamed from: b */
    public final /* synthetic */ boolean f281868b;

    public /* synthetic */ C100879r(C100862aj ajVar, boolean z) {
        this.f281867a = ajVar;
        this.f281868b = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C100862aj ajVar = this.f281867a;
        boolean z = this.f281868b;
        String F = ((C86054o) ajVar.f281835c.mo27525b()).mo79659F();
        if (TextUtils.isEmpty(F)) {
            return C60856cj.m92899h(new IllegalArgumentException("Speech Personalization setting is not allowed to show for signed-out users."));
        }
        return ((C100719ab) ajVar.f281836d.mo27525b()).mo92025i(F, new C100751q(z));
    }
}
