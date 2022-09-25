package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18217au;
import com.google.android.libraries.assistant.gallium.framework.ipc.p1513b.C18287g;

/* renamed from: com.google.android.libraries.assistant.portable.a */
/* compiled from: PG */
public final class C19042a extends C19118z {

    /* renamed from: a */
    private final C18287g f53441a;

    /* renamed from: b */
    private final C18217au f53442b;

    /* renamed from: c */
    private final C19115w f53443c;

    public C19042a(C18287g gVar, C18217au auVar, C19115w wVar) {
        this.f53441a = gVar;
        this.f53442b = auVar;
        this.f53443c = wVar;
    }

    /* renamed from: a */
    public final C18217au mo24263a() {
        return this.f53442b;
    }

    /* renamed from: b */
    public final C18287g mo24264b() {
        return this.f53441a;
    }

    /* renamed from: c */
    public final C19115w mo24265c() {
        return this.f53443c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19118z) {
            C19118z zVar = (C19118z) obj;
            return this.f53441a.equals(zVar.mo24264b()) && this.f53442b.equals(zVar.mo24263a()) && this.f53443c.equals(zVar.mo24265c());
        }
    }

    public final int hashCode() {
        return ((((this.f53441a.hashCode() ^ 1000003) * 1000003) ^ this.f53442b.hashCode()) * 1000003) ^ this.f53443c.hashCode();
    }

    public final String toString() {
        String obj = this.f53441a.toString();
        String obj2 = this.f53442b.toString();
        String obj3 = this.f53443c.toString();
        return "FutureStreamAndSpanScope{getFutureStream=" + obj + ", getSpanScope=" + obj2 + ", cleanupCallback=" + obj3 + "}";
    }
}
