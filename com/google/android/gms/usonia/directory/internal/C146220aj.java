package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.p10878b.C146156b;

/* renamed from: com.google.android.gms.usonia.directory.internal.aj */
/* compiled from: PG */
public final /* synthetic */ class C146220aj implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f395065a;

    /* renamed from: b */
    public final /* synthetic */ PeerAddress f395066b;

    public /* synthetic */ C146220aj(String str, PeerAddress peerAddress) {
        this.f395065a = str;
        this.f395066b = peerAddress;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f395065a;
        PeerAddress peerAddress = this.f395066b;
        C146245bh bhVar = new C146245bh((C146010af) obj2);
        ResolvePeerAddressParams resolvePeerAddressParams = new ResolvePeerAddressParams();
        resolvePeerAddressParams.f395047a = str;
        resolvePeerAddressParams.f395048b = peerAddress;
        resolvePeerAddressParams.f395049c = bhVar;
        ((C146156b) ((C146269e) obj).mo119451G()).mo122717n(resolvePeerAddressParams);
    }
}
