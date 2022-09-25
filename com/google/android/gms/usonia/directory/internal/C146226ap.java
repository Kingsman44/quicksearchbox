package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.ap */
/* compiled from: PG */
public final /* synthetic */ class C146226ap implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143784ce f395077a;

    /* renamed from: b */
    public final /* synthetic */ String f395078b;

    public /* synthetic */ C146226ap(C143784ce ceVar, String str) {
        this.f395077a = ceVar;
        this.f395078b = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143784ce ceVar = this.f395077a;
        String str = this.f395078b;
        C146269e eVar = (C146269e) obj;
        C146274j jVar = (C146274j) C146274j.f395120a.mo122834b(ceVar);
        if (jVar == null) {
            ((C146010af) obj2).f394698a.mo122508v(false);
            return;
        }
        UnregisterStateCallbackParams unregisterStateCallbackParams = new UnregisterStateCallbackParams();
        unregisterStateCallbackParams.f395058a = new C146240bc((C146010af) obj2);
        unregisterStateCallbackParams.f395059b = str;
        unregisterStateCallbackParams.f395060c = jVar;
        ((C146156b) eVar.mo119451G()).mo122720q(unregisterStateCallbackParams);
    }
}
