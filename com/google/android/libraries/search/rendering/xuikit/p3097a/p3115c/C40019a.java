package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.protobuf.C62917ay;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.a */
/* compiled from: PG */
public final class C40019a extends C40045j {

    /* renamed from: a */
    private final C62917ay f105174a;

    /* renamed from: b */
    private final MessageLite f105175b;

    public C40019a(C62917ay ayVar, MessageLite messageLite) {
        if (ayVar != null) {
            this.f105174a = ayVar;
            if (messageLite != null) {
                this.f105175b = messageLite;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null extension");
    }

    /* renamed from: a */
    public final C62917ay mo42123a() {
        return this.f105174a;
    }

    /* renamed from: b */
    public final MessageLite mo42124b() {
        return this.f105175b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C40045j) {
            C40045j jVar = (C40045j) obj;
            return this.f105174a.equals(jVar.mo42123a()) && this.f105175b.equals(jVar.mo42124b());
        }
    }

    public final int hashCode() {
        return ((this.f105174a.hashCode() ^ 1000003) * 1000003) ^ this.f105175b.hashCode();
    }

    public final String toString() {
        String obj = this.f105174a.toString();
        String obj2 = this.f105175b.toString();
        return "ClientRequestContextExtension{extension=" + obj + ", value=" + obj2 + "}";
    }
}
