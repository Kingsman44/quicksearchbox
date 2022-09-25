package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import android.content.Intent;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.z */
/* compiled from: PG */
public final /* synthetic */ class C11625z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11570ap f37581a;

    /* renamed from: b */
    public final /* synthetic */ Intent f37582b;

    public /* synthetic */ C11625z(C11570ap apVar, Intent intent) {
        this.f37581a = apVar;
        this.f37582b = intent;
    }

    public final C60870cx apply(Object obj) {
        C11570ap apVar = this.f37581a;
        Intent intent = this.f37582b;
        if (((Boolean) obj).booleanValue()) {
            return apVar.f37486d.mo20025b(intent);
        }
        C60870cx a = apVar.mo20063a();
        C11566al alVar = new C11566al(intent);
        return C60922j.m93044g(a, C47810es.m84963c(alVar), apVar.f37484b);
    }
}
