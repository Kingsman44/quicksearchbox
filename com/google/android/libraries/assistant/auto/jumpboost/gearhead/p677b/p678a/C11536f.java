package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.p678a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a.C11613n;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.f */
/* compiled from: PG */
public final /* synthetic */ class C11536f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11551u f37424a;

    public /* synthetic */ C11536f(C11551u uVar) {
        this.f37424a = uVar;
    }

    public final Object apply(Object obj) {
        C11551u uVar = this.f37424a;
        Boolean bool = (Boolean) obj;
        if (!((Boolean) uVar.f37448b.mo17428b()).booleanValue() || !bool.booleanValue()) {
            return null;
        }
        if (((Boolean) uVar.f37449c.mo17428b()).booleanValue()) {
            C60870cx a = ((C11613n) uVar.f37450d.mo27525b()).mo20081a();
            C11548r rVar = new C11548r(uVar);
            C46459k.m82829b(C60922j.m93044g(a, C47810es.m84963c(rVar), uVar.f37453g), "Failed to start voiceplate prewarm", new Object[0]);
            return null;
        }
        uVar.mo20049h();
        return null;
    }
}
