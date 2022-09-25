package com.google.android.libraries.geller.p1816d;

import android.view.contentcapture.DataShareRequest;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.geller.d.a */
/* compiled from: PG */
public final class C21769a extends C21772d {

    /* renamed from: a */
    public final DataShareRequest f60076a;

    /* renamed from: b */
    public final MessageLite f60077b;

    public C21769a(DataShareRequest dataShareRequest, MessageLite messageLite) {
        this.f60076a = dataShareRequest;
        if (messageLite != null) {
            this.f60077b = messageLite;
            return;
        }
        throw new NullPointerException("Null data");
    }

    /* renamed from: a */
    public final DataShareRequest mo27100a() {
        return this.f60076a;
    }

    /* renamed from: b */
    public final MessageLite mo27101b() {
        return this.f60077b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21772d) {
            C21772d dVar = (C21772d) obj;
            return this.f60076a.equals(dVar.mo27100a()) && this.f60077b.equals(dVar.mo27101b());
        }
    }

    public final int hashCode() {
        return ((this.f60076a.hashCode() ^ 1000003) * 1000003) ^ this.f60077b.hashCode();
    }

    public final String toString() {
        String obj = this.f60076a.toString();
        String obj2 = this.f60077b.toString();
        return "ShareDataParams{request=" + obj + ", data=" + obj2 + "}";
    }
}
