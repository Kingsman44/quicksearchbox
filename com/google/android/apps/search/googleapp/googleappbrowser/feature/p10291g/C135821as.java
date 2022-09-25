package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import com.google.android.libraries.appactions.serviceengine.api.ExecutionAccessor;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.as */
/* compiled from: PG */
public final /* synthetic */ class C135821as implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C135824av f369943a;

    public /* synthetic */ C135821as(C135824av avVar) {
        this.f369943a = avVar;
    }

    public final C60870cx apply(Object obj) {
        C135824av avVar = this.f369943a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return C60856cj.m92899h(new ArrayIndexOutOfBoundsException("No suggestions generated for this webpage yet."));
        }
        avVar.mo112571b(C37182a.f98140hA.mo40779c());
        return ((ExecutionAccessor) guVar.get(0)).mo124528a();
    }
}
