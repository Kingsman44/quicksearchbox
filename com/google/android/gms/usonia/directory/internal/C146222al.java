package com.google.android.gms.usonia.directory.internal;

import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.iam.internal.MayPeerAccessServiceParams;
import com.google.android.gms.usonia.p10878b.C146156b;
import java.util.List;

/* renamed from: com.google.android.gms.usonia.directory.internal.al */
/* compiled from: PG */
public final /* synthetic */ class C146222al implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ List f395068a;

    /* renamed from: b */
    public final /* synthetic */ PeerAddress f395069b;

    public /* synthetic */ C146222al(List list, PeerAddress peerAddress) {
        this.f395068a = list;
        this.f395069b = peerAddress;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        List list = this.f395068a;
        PeerAddress peerAddress = this.f395069b;
        C146249bl blVar = new C146249bl((C146010af) obj2);
        MayPeerAccessServiceParams mayPeerAccessServiceParams = new MayPeerAccessServiceParams();
        mayPeerAccessServiceParams.f395130b = (String[]) list.toArray(new String[0]);
        mayPeerAccessServiceParams.f395129a = peerAddress;
        ((C146156b) ((C146269e) obj).mo119451G()).mo122712i(blVar, mayPeerAccessServiceParams);
    }
}
