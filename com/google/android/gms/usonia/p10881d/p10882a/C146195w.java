package com.google.android.gms.usonia.p10881d.p10882a;

import androidx.core.p097i.C1967b;
import com.google.android.gms.usonia.PeerAddress;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.gms.usonia.d.a.w */
/* compiled from: PG */
public final /* synthetic */ class C146195w implements C1967b {

    /* renamed from: a */
    public final /* synthetic */ PeerAddress f394998a;

    public /* synthetic */ C146195w(PeerAddress peerAddress) {
        this.f394998a = peerAddress;
    }

    /* renamed from: a */
    public final void mo3353a(Object obj) {
        PeerAddress peerAddress = this.f394998a;
        Integer num = (Integer) obj;
        if (num.intValue() != 0) {
            ((C59052c) ((C59052c) C146197y.f395000a.mo56226d()).mo56372aa(42088)).mo56354G("Failed to unsubscribe from %s. Code: %s", peerAddress.mo122618a(), num);
        }
    }
}
