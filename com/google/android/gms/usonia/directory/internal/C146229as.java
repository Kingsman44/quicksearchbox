package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.iam.internal.MayAccessServiceOnPeerParams;
import com.google.android.gms.usonia.p10878b.C146156b;
import java.util.List;

/* renamed from: com.google.android.gms.usonia.directory.internal.as */
/* compiled from: PG */
public final /* synthetic */ class C146229as implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ List f395083a;

    /* renamed from: b */
    public final /* synthetic */ PeerAddress f395084b;

    public /* synthetic */ C146229as(List list, PeerAddress peerAddress) {
        this.f395083a = list;
        this.f395084b = peerAddress;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        List list = this.f395083a;
        PeerAddress peerAddress = this.f395084b;
        C146239bb bbVar = new C146239bb((C146010af) obj2);
        MayAccessServiceOnPeerParams mayAccessServiceOnPeerParams = new MayAccessServiceOnPeerParams();
        mayAccessServiceOnPeerParams.f395128b = (String[]) list.toArray(new String[0]);
        mayAccessServiceOnPeerParams.f395127a = peerAddress;
        ((C146156b) ((C146269e) obj).mo119451G()).mo122711h(bbVar, mayAccessServiceOnPeerParams);
    }
}
