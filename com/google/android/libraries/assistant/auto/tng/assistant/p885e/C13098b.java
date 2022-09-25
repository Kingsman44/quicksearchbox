package com.google.android.libraries.assistant.auto.tng.assistant.p885e;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.e.b */
/* compiled from: PG */
final class C13098b extends C13101e {

    /* renamed from: a */
    public final Optional f40629a;

    /* renamed from: b */
    public final Optional f40630b;

    /* renamed from: c */
    public final Optional f40631c;

    public C13098b(Optional optional, Optional optional2, Optional optional3) {
        this.f40629a = optional;
        this.f40630b = optional2;
        this.f40631c = optional3;
    }

    /* renamed from: a */
    public final C13100d mo20891a() {
        return new C13081a(this);
    }

    /* renamed from: b */
    public final Optional mo20892b() {
        return this.f40629a;
    }

    /* renamed from: c */
    public final Optional mo20893c() {
        return this.f40630b;
    }

    /* renamed from: d */
    public final Optional mo20894d() {
        return this.f40631c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13101e) {
            C13101e eVar = (C13101e) obj;
            return this.f40629a.equals(eVar.mo20892b()) && this.f40630b.equals(eVar.mo20893c()) && this.f40631c.equals(eVar.mo20894d());
        }
    }

    public final int hashCode() {
        return ((((this.f40629a.hashCode() ^ 1000003) * 1000003) ^ this.f40630b.hashCode()) * 1000003) ^ this.f40631c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f40629a);
        String valueOf2 = String.valueOf(this.f40630b);
        String valueOf3 = String.valueOf(this.f40631c);
        return "RemoteActionsUiResponse{remoteViewsResponse=" + valueOf + ", simpleCollectionResp=" + valueOf2 + ", text=" + valueOf3 + "}";
    }
}
