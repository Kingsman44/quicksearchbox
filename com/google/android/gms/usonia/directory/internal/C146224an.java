package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.an */
/* compiled from: PG */
public final /* synthetic */ class C146224an implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143784ce f395071a;

    /* renamed from: b */
    public final /* synthetic */ String f395072b;

    public /* synthetic */ C146224an(C143784ce ceVar, String str) {
        this.f395071a = ceVar;
        this.f395072b = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C143784ce ceVar = this.f395071a;
        String str = this.f395072b;
        int i = C146250bm.f395108a;
        RegisterStateCallbackParams registerStateCallbackParams = new RegisterStateCallbackParams();
        registerStateCallbackParams.f395044a = new C146240bc((C146010af) obj2);
        registerStateCallbackParams.f395045b = str;
        registerStateCallbackParams.f395046c = (C146274j) C146274j.f395120a.mo122833a(ceVar);
        ((C146156b) ((C146269e) obj).mo119451G()).mo122713j(registerStateCallbackParams);
    }
}
