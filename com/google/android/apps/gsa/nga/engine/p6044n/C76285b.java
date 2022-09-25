package com.google.android.apps.gsa.nga.engine.p6044n;

import com.google.android.apps.gsa.nga.engine.recognition.C77889u;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.b */
/* compiled from: PG */
public final class C76285b extends C76468h {

    /* renamed from: a */
    private final C80401n f211317a;

    /* renamed from: b */
    private final C77889u f211318b;

    public C76285b(C80401n nVar, C77889u uVar) {
        if (nVar != null) {
            this.f211317a = nVar;
            this.f211318b = uVar;
            return;
        }
        throw new NullPointerException("Null response");
    }

    /* renamed from: a */
    public final C77889u mo72152a() {
        return this.f211318b;
    }

    /* renamed from: b */
    public final C80401n mo72153b() {
        return this.f211317a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C76468h) {
            C76468h hVar = (C76468h) obj;
            return this.f211317a.equals(hVar.mo72153b()) && this.f211318b.equals(hVar.mo72152a());
        }
    }

    public final int hashCode() {
        return ((this.f211317a.hashCode() ^ 1000003) * 1000003) ^ this.f211318b.hashCode();
    }

    public final String toString() {
        String obj = this.f211317a.toString();
        String obj2 = this.f211318b.toString();
        return "PendingResponse{response=" + obj + ", originalRecognitionEngine=" + obj2 + "}";
    }
}
