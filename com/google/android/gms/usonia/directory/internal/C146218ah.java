package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.auth.internal.UnregisterStructureInfoCallbackParams;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.ah */
/* compiled from: PG */
public final /* synthetic */ class C146218ah implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C143784ce f395063a;

    public /* synthetic */ C146218ah(C143784ce ceVar) {
        this.f395063a = ceVar;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C146269e eVar = (C146269e) obj;
        C146265ca caVar = (C146265ca) C146265ca.f395114a.mo122834b(this.f395063a);
        if (caVar == null) {
            ((C146010af) obj2).f394698a.mo122508v(false);
            return;
        }
        UnregisterStructureInfoCallbackParams unregisterStructureInfoCallbackParams = new UnregisterStructureInfoCallbackParams();
        unregisterStructureInfoCallbackParams.f394868a = caVar;
        ((C146156b) eVar.mo119451G()).mo122722s(unregisterStructureInfoCallbackParams);
    }
}
