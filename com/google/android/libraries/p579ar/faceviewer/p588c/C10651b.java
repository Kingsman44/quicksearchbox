package com.google.android.libraries.p579ar.faceviewer.p588c;

import com.google.p363ad.p364a.C6677ai;

/* renamed from: com.google.android.libraries.ar.faceviewer.c.b */
/* compiled from: PG */
public final class C10651b extends C10656g {

    /* renamed from: a */
    public final C6677ai f35551a;

    /* renamed from: b */
    public final int f35552b;

    public C10651b(C6677ai aiVar, int i) {
        if (aiVar != null) {
            this.f35551a = aiVar;
            this.f35552b = i;
            return;
        }
        throw new NullPointerException("Null experienceRequestProto");
    }

    /* renamed from: a */
    public final C6677ai mo18689a() {
        return this.f35551a;
    }

    /* renamed from: b */
    public final int mo18690b() {
        return this.f35552b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10656g) {
            C10656g gVar = (C10656g) obj;
            return this.f35551a.equals(gVar.mo18689a()) && this.f35552b == gVar.mo18690b();
        }
    }

    public final int hashCode() {
        return ((this.f35551a.hashCode() ^ 1000003) * 1000003) ^ this.f35552b;
    }

    public final String toString() {
        String obj = this.f35551a.toString();
        String str = this.f35552b != 1 ? "DARK" : "LIGHT";
        return "FaceViewerModel{experienceRequestProto=" + obj + ", theme=" + str + "}";
    }
}
