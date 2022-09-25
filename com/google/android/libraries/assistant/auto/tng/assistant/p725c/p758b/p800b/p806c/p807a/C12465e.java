package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.p807a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p806c.C12479e;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C12465e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12468h f39349a;

    /* renamed from: b */
    public final /* synthetic */ C12479e f39350b;

    public /* synthetic */ C12465e(C12468h hVar, C12479e eVar) {
        this.f39349a = hVar;
        this.f39350b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C12468h hVar = this.f39349a;
        C12479e eVar = this.f39350b;
        aco aco = (aco) obj;
        C47558bi a = C47831fm.m85006a("MessageInteractionManager.getMessageInteractionResult");
        try {
            C60870cx d = hVar.mo20618d(Optional.m71637of(aco), eVar);
            a.close();
            return d;
        } catch (Throwable th) {
            C12462b.m28552a(th, th);
        }
        throw th;
    }
}
