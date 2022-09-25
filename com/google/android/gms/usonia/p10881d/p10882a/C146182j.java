package com.google.android.gms.usonia.p10881d.p10882a;

import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.p10881d.C146200d;
import java.util.Arrays;

/* renamed from: com.google.android.gms.usonia.d.a.j */
/* compiled from: PG */
final class C146182j {

    /* renamed from: a */
    private final PeerAddress f394973a;

    /* renamed from: b */
    private final C146200d f394974b;

    public C146182j(PeerAddress peerAddress, C146200d dVar) {
        this.f394973a = peerAddress;
        this.f394974b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C146182j)) {
            return false;
        }
        C146182j jVar = (C146182j) obj;
        if (!jVar.f394973a.equals(this.f394973a) || !jVar.f394974b.equals(this.f394974b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394973a, this.f394974b});
    }
}
