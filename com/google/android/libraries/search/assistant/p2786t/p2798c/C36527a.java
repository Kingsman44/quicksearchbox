package com.google.android.libraries.search.assistant.p2786t.p2798c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a */
/* compiled from: PG */
public final class C36527a extends C36604g {

    /* renamed from: a */
    public final C36603f f95302a;

    /* renamed from: b */
    public final C58485gu f95303b;

    public C36527a(C36603f fVar, C58485gu guVar) {
        if (fVar != null) {
            this.f95302a = fVar;
            if (guVar != null) {
                this.f95303b = guVar;
                return;
            }
            throw new NullPointerException("Null notifications");
        }
        throw new NullPointerException("Null event");
    }

    /* renamed from: a */
    public final C36603f mo40208a() {
        return this.f95302a;
    }

    /* renamed from: b */
    public final C58485gu mo40209b() {
        return this.f95303b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36604g) {
            C36604g gVar = (C36604g) obj;
            return this.f95302a.equals(gVar.mo40208a()) && C58597ky.m90218i(this.f95303b, gVar.mo40209b());
        }
    }

    public final int hashCode() {
        return ((this.f95302a.hashCode() ^ 1000003) * 1000003) ^ this.f95303b.hashCode();
    }

    public final String toString() {
        String obj = this.f95302a.toString();
        String obj2 = this.f95303b.toString();
        return "NotificationListenerEventData{event=" + obj + ", notifications=" + obj2 + "}";
    }
}
