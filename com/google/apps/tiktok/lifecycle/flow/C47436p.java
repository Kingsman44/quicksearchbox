package com.google.apps.tiktok.lifecycle.flow;

import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.lifecycle.flow.p */
/* compiled from: PG */
final class C47436p {

    /* renamed from: a */
    public final Map f123202a;

    /* renamed from: b */
    public boolean f123203b;

    public C47436p() {
        this((byte[]) null);
    }

    public /* synthetic */ C47436p(byte[] bArr) {
        this.f123202a = new LinkedHashMap();
        this.f123203b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47436p)) {
            return false;
        }
        C47436p pVar = (C47436p) obj;
        return C69664n.m101066l(this.f123202a, pVar.f123202a) && this.f123203b == pVar.f123203b;
    }

    public final int hashCode() {
        return (this.f123202a.hashCode() * 31) + (this.f123203b ? 1 : 0);
    }

    public final String toString() {
        Map map = this.f123202a;
        boolean z = this.f123203b;
        return "StreamMixinState(streamStates=" + map + ", acceptingNewChannels=" + z + ")";
    }
}
