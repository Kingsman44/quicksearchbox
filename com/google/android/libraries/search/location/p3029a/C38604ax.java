package com.google.android.libraries.search.location.p3029a;

import com.google.android.libraries.search.location.p3029a.p3030a.C38574c;
import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C38604ax implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38622bn f102036a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f102037b;

    public /* synthetic */ C38604ax(C38622bn bnVar, C58833ax axVar) {
        this.f102036a = bnVar;
        this.f102037b = axVar;
    }

    public final C60870cx apply(Object obj) {
        C38622bn bnVar = this.f102036a;
        C58833ax axVar = this.f102037b;
        C38574c cVar = (C38574c) obj;
        if (cVar == C38574c.CAPABILITY_RESULT_UNABLE_TO_GET_CAPABILITY) {
            bnVar.mo41524d(C37173a.f96790j.mo40779c(), axVar, 7);
            return C47633f.m84733g(C60856cj.m92899h(new C38620bl()));
        }
        boolean z = true;
        bnVar.mo41524d(C37173a.f96790j.mo40779c(), axVar, 1);
        if (cVar != C38574c.CAPABILITY_RESULT_CAPABILITY_IS_PRESENT) {
            z = false;
        }
        return bnVar.mo41521a(z);
    }
}
