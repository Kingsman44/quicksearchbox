package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.view.translation.Translator;
import androidx.p104d.p105a.C2169h;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.v */
/* compiled from: PG */
public final /* synthetic */ class C113643v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C113620ae f314701a;

    /* renamed from: b */
    public final /* synthetic */ String f314702b;

    public /* synthetic */ C113643v(C113620ae aeVar, String str) {
        this.f314701a = aeVar;
        this.f314702b = str;
    }

    public final C60870cx apply(Object obj) {
        C113620ae aeVar = this.f314701a;
        String str = this.f314702b;
        Translator translator = (Translator) obj;
        if (translator == null || translator.isDestroyed()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C2169h.m6027a(new C113642u(aeVar, str, translator));
    }
}
