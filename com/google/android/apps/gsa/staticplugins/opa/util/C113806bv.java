package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90060dl;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bv */
/* compiled from: PG */
public final class C113806bv {

    /* renamed from: a */
    private final C86124t f315196a;

    /* renamed from: b */
    private final C113807bw f315197b;

    public C113806bv(C86124t tVar, C113807bw bwVar) {
        this.f315196a = tVar;
        this.f315197b = bwVar;
    }

    /* renamed from: a */
    public final Intent mo100655a(Context context, Bundle bundle, int i) {
        if (this.f315196a.mo79746e(C90060dl.f249189a)) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.apps.searchlite.assistant.widgetentry.AssistantActivity");
            intent.setFlags(i);
            intent.putExtras(bundle);
            return intent;
        }
        C87565h hVar = new C87565h(bundle);
        this.f315197b.mo100656a(context, bundle, hVar);
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putAll(hVar.mo81685a());
        Intent s = C87566i.m142320s(context, bundle2, i);
        if (!this.f315196a.mo79746e(C90014bt.f247760nI) && C87566i.m142270aR(bundle2)) {
            s.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.ZeroStateActivity");
        }
        return s;
    }
}
