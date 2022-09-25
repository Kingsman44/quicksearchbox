package com.google.android.libraries.storage.protostore.p3320e;

import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.storage.protostore.e.a */
/* compiled from: PG */
public final class C42992a extends C42993b {

    /* renamed from: a */
    public final MessageLite f112436a;

    /* renamed from: b */
    private final C62921ba f112437b;

    public C42992a(MessageLite messageLite, C62921ba baVar) {
        if (messageLite != null) {
            this.f112436a = messageLite;
            if (baVar != null) {
                this.f112437b = baVar;
                return;
            }
            throw new NullPointerException("Null extensionRegistryLite");
        }
        throw new NullPointerException("Null defaultValue");
    }

    /* renamed from: a */
    public final C62921ba mo46032a() {
        return this.f112437b;
    }

    /* renamed from: b */
    public final MessageLite mo46033b() {
        return this.f112436a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42993b) {
            C42993b bVar = (C42993b) obj;
            return this.f112436a.equals(bVar.mo46033b()) && this.f112437b.equals(bVar.mo46032a());
        }
    }

    public final int hashCode() {
        return ((this.f112436a.hashCode() ^ 1000003) * 1000003) ^ this.f112437b.hashCode();
    }

    public final String toString() {
        String obj = this.f112436a.toString();
        String obj2 = this.f112437b.toString();
        return "ProtoSerializer{defaultValue=" + obj + ", extensionRegistryLite=" + obj2 + "}";
    }
}
