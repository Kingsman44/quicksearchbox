package com.google.android.libraries.search.p2904c.p2911c;

import com.google.android.libraries.search.p2904c.C37362b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.c.r */
/* compiled from: PG */
final class C37448r extends C37443m {

    /* renamed from: a */
    public final C37362b f99420a;

    /* renamed from: b */
    public final Executor f99421b;

    public C37448r(C37362b bVar, Executor executor) {
        if (bVar != null) {
            this.f99420a = bVar;
            this.f99421b = executor;
            return;
        }
        throw new NullPointerException("Null audioBytesReceiver");
    }

    /* renamed from: a */
    public final C37362b mo40967a() {
        return this.f99420a;
    }

    /* renamed from: b */
    public final Executor mo40968b() {
        return this.f99421b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37443m) {
            C37443m mVar = (C37443m) obj;
            return this.f99420a.equals(mVar.mo40967a()) && this.f99421b.equals(mVar.mo40968b());
        }
    }

    public final int hashCode() {
        return ((this.f99420a.hashCode() ^ 1000003) * 1000003) ^ this.f99421b.hashCode();
    }

    public final String toString() {
        String obj = this.f99420a.toString();
        String obj2 = this.f99421b.toString();
        return "AudioBytesReceiverData{audioBytesReceiver=" + obj + ", executor=" + obj2 + "}";
    }
}
