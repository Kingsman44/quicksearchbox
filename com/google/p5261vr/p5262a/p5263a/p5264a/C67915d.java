package com.google.p5261vr.p5262a.p5263a.p5264a;

import com.google.common.p4575r.C60755l;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.vr.a.a.a.d */
/* compiled from: PG */
final class C67915d extends C67922k {

    /* renamed from: a */
    private final MessageLite f184092a;

    public C67915d(MessageLite messageLite) {
        this.f184092a = messageLite;
    }

    /* renamed from: a */
    public final C60755l mo60053a() {
        return null;
    }

    /* renamed from: b */
    public final MessageLite mo60054b() {
        return this.f184092a;
    }

    /* renamed from: c */
    public final String mo60055c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C67922k) {
            C67922k kVar = (C67922k) obj;
            return this.f184092a.equals(kVar.mo60054b()) && kVar.mo60053a() == null && kVar.mo60055c() == null;
        }
    }

    public final int hashCode() {
        return (this.f184092a.hashCode() ^ 1000003) * -721379959;
    }

    public final String toString() {
        String obj = this.f184092a.toString();
        return "Event{data=" + obj + ", experimentIds=null, mendelPackage=null}";
    }
}
