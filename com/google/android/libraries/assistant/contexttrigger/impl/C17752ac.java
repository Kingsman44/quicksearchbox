package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.android.libraries.search.location.C38697c;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.ac */
/* compiled from: PG */
public final /* synthetic */ class C17752ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17755af f50982a;

    /* renamed from: b */
    public final /* synthetic */ C48919u f50983b;

    public /* synthetic */ C17752ac(C17755af afVar, C48919u uVar) {
        this.f50982a = afVar;
        this.f50983b = uVar;
    }

    public final C60870cx apply(Object obj) {
        C17755af afVar = this.f50982a;
        C48919u uVar = this.f50983b;
        if (!((C58833ax) obj).mo56113h()) {
            return C60866ct.f164955a;
        }
        C38697c cVar = afVar.f50993d;
        String str = uVar.f126591d;
        C39226b a = C39226b.m68655a(uVar.f126592e);
        if (a == null) {
            a = C39226b.TAG_DO_NOT_USE;
        }
        return cVar.mo41559b("com.google.android.apps.search.assistant.platform.contexttrigger", str, a);
    }
}
