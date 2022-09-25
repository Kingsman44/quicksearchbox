package com.google.android.apps.gsa.assistant.settings.features.appactions.p570f;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.f.j */
/* compiled from: PG */
public final class C10392j extends C10394l {

    /* renamed from: a */
    public final boolean f35096a;

    /* renamed from: b */
    public final Optional f35097b;

    /* renamed from: c */
    public final Optional f35098c;

    public C10392j(boolean z, Optional optional, Optional optional2) {
        this.f35096a = z;
        if (optional != null) {
            this.f35097b = optional;
            if (optional2 != null) {
                this.f35098c = optional2;
                return;
            }
            throw new NullPointerException("Null removedEntryIdx");
        }
        throw new NullPointerException("Null insertedEntryIdx");
    }

    /* renamed from: a */
    public final Optional mo18465a() {
        return this.f35097b;
    }

    /* renamed from: b */
    public final Optional mo18466b() {
        return this.f35098c;
    }

    /* renamed from: c */
    public final boolean mo18467c() {
        return this.f35096a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10394l) {
            C10394l lVar = (C10394l) obj;
            return this.f35096a == lVar.mo18467c() && this.f35097b.equals(lVar.mo18465a()) && this.f35098c.equals(lVar.mo18466b());
        }
    }

    public final int hashCode() {
        return (((((true != this.f35096a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f35097b.hashCode()) * 1000003) ^ this.f35098c.hashCode();
    }

    public final String toString() {
        boolean z = this.f35096a;
        String obj = this.f35097b.toString();
        String obj2 = this.f35098c.toString();
        return "EntryUpdateResult{needFullRefresh=" + z + ", insertedEntryIdx=" + obj + ", removedEntryIdx=" + obj2 + "}";
    }
}
