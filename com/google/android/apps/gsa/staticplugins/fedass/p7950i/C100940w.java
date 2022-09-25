package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.w */
/* compiled from: PG */
public final /* synthetic */ class C100940w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100892ad f281985a;

    /* renamed from: b */
    public final /* synthetic */ String f281986b;

    public /* synthetic */ C100940w(C100892ad adVar, String str) {
        this.f281985a = adVar;
        this.f281986b = str;
    }

    public final C60870cx apply(Object obj) {
        C100892ad adVar = this.f281985a;
        String str = this.f281986b;
        C60870cx e = ((C100719ab) adVar.f281887b.mo27525b()).mo92021e(str);
        C100942y yVar = new C100942y((ArrayList) obj, str);
        return C60922j.m93044g(e, C47810es.m84963c(yVar), adVar.f281891f);
    }
}
