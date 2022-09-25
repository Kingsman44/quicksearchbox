package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1169a.C15763a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.w */
/* compiled from: PG */
final class C14934w implements C15763a {

    /* renamed from: a */
    final /* synthetic */ C14935x f44871a;

    public C14934w(C14935x xVar) {
        this.f44871a = xVar;
    }

    /* renamed from: a */
    public final void mo21857a(String str) {
        if (((str.hashCode() == -1573987054 && str.equals("Morris.DrivingScreen.Suggestions")) ? (char) 0 : 65535) != 0) {
            C59104x c = C14935x.f44872a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.SuggestDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45510)).mo56389s("Received callback for a display(%s) that is not supported.", str);
            return;
        }
        C14935x xVar = this.f44871a;
        C60872cz czVar = xVar.f44880i;
        if (czVar != null) {
            czVar.cancel(true);
            xVar.f44880i = null;
        }
        C60856cj.m92911t(C60922j.m93045h((C60870cx) ((Supplier) this.f44871a.f44877f.mo17428b()).get(), C47810es.m84966f(new C14929r(str)), this.f44871a.f44874c), C47810es.m84974n(new C14933v(this)), this.f44871a.f44874c);
    }
}
