package com.google.android.apps.gsa.staticplugins.bubble.p7591i;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.i.a */
/* compiled from: PG */
public final class C97025a extends C97040c {

    /* renamed from: a */
    private final C88473w f271150a;

    /* renamed from: b */
    private final C63088z f271151b;

    public C97025a(C88473w wVar, C63088z zVar) {
        if (wVar != null) {
            this.f271150a = wVar;
            if (zVar != null) {
                this.f271151b = zVar;
                return;
            }
            throw new NullPointerException("Null bubbleId");
        }
        throw new NullPointerException("Null bubbleType");
    }

    /* renamed from: a */
    public final C88473w mo90392a() {
        return this.f271150a;
    }

    /* renamed from: b */
    public final C63088z mo90393b() {
        return this.f271151b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C97040c) {
            C97040c cVar = (C97040c) obj;
            return this.f271150a.equals(cVar.mo90392a()) && this.f271151b.equals(cVar.mo90393b());
        }
    }

    public final int hashCode() {
        return ((this.f271150a.hashCode() ^ 1000003) * 1000003) ^ this.f271151b.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f271150a.f239171d);
        String obj = this.f271151b.toString();
        return "BubbleId{bubbleType=" + num + ", bubbleId=" + obj + "}";
    }
}
