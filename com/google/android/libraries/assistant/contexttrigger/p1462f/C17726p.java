package com.google.android.libraries.assistant.contexttrigger.p1462f;

import com.google.android.libraries.assistant.contexttrigger.p1466j.C17789e;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17793i;
import com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.f.p */
/* compiled from: PG */
public final /* synthetic */ class C17726p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17730t f50933a;

    public /* synthetic */ C17726p(C17730t tVar) {
        this.f50933a = tVar;
    }

    public final C60870cx apply(Object obj) {
        C17730t tVar = this.f50933a;
        C17696ab abVar = (C17696ab) obj;
        if (!abVar.mo23435c().isPresent()) {
            return C60856cj.m92900i(abVar);
        }
        C17793i iVar = tVar.f50940c;
        return C47633f.m84733g(iVar.f51061b.mo46039a(new C17789e(iVar, (C17805u) abVar.mo23435c().get()), iVar.f51063d)).mo51515h(new C17728r(abVar), C60826bg.f164896a);
    }
}
