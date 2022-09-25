package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9359a;

import androidx.p104d.p105a.C2164c;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.p10879c.C146167c;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.a.t */
/* compiled from: PG */
final class C124292t implements C146167c {

    /* renamed from: a */
    public C2164c f343120a;

    /* renamed from: b */
    private final String f343121b;

    public C124292t(String str) {
        this.f343121b = str;
    }

    /* renamed from: a */
    public final void mo106359a(PeerAddress[] peerAddressArr, PeerAddress[] peerAddressArr2) {
        if (this.f343120a != null) {
            for (PeerAddress peerAddress : peerAddressArr) {
                if (peerAddress.f394833c.equals(this.f343121b)) {
                    C2164c cVar = this.f343120a;
                    cVar.getClass();
                    cVar.mo5437b(peerAddress);
                    return;
                }
            }
        }
    }
}
