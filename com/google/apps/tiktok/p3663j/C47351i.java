package com.google.apps.tiktok.p3663j;

import com.google.apps.tiktok.p3663j.p3670c.C47342e;
import com.google.apps.tiktok.p3663j.p3670c.C47343f;

/* renamed from: com.google.apps.tiktok.j.i */
/* compiled from: PG */
public final class C47351i {

    /* renamed from: a */
    public final C47343f f123074a;

    public C47351i(C47343f fVar) {
        this.f123074a = fVar;
    }

    /* renamed from: a */
    public static C47351i m84169a(String str) {
        C47342e eVar = (C47342e) C47343f.f123055c.createBuilder();
        eVar.copyOnWrite();
        C47343f fVar = (C47343f) eVar.instance;
        str.getClass();
        fVar.f123057a |= 1;
        fVar.f123058b = str;
        return new C47351i((C47343f) eVar.build());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C47351i) && this.f123074a.f123058b.equals(((C47351i) obj).f123074a.f123058b);
    }

    public final int hashCode() {
        return this.f123074a.f123058b.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", new Object[]{this.f123074a.f123058b});
    }
}
