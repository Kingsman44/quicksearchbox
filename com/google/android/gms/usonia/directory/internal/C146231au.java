package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.au */
/* compiled from: PG */
public final /* synthetic */ class C146231au implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f395086a;

    public /* synthetic */ C146231au(String str) {
        this.f395086a = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f395086a;
        C146244bg bgVar = new C146244bg((C146010af) obj2);
        FetchAllPeerAddressesParams fetchAllPeerAddressesParams = new FetchAllPeerAddressesParams();
        fetchAllPeerAddressesParams.f395024a = str;
        fetchAllPeerAddressesParams.f395025b = bgVar;
        ((C146156b) ((C146269e) obj).mo119451G()).mo122709f(fetchAllPeerAddressesParams);
    }
}
