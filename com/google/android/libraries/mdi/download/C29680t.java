package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.t */
/* compiled from: PG */
public final class C29680t extends C29653hx {

    /* renamed from: a */
    public final C58833ax f80372a;

    /* renamed from: b */
    public final C58833ax f80373b;

    public C29680t(C58833ax axVar, C58833ax axVar2) {
        this.f80372a = axVar;
        this.f80373b = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo34796a() {
        return this.f80373b;
    }

    /* renamed from: b */
    public final C58833ax mo34797b() {
        return this.f80372a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29653hx) {
            C29653hx hxVar = (C29653hx) obj;
            return this.f80372a.equals(hxVar.mo34797b()) && this.f80373b.equals(hxVar.mo34796a());
        }
    }

    public final int hashCode() {
        return ((this.f80372a.hashCode() ^ 1000003) * 1000003) ^ this.f80373b.hashCode();
    }

    public final String toString() {
        String obj = this.f80372a.toString();
        String obj2 = this.f80373b.toString();
        return "RemoveFileGroupsByFilterRequest{sourceOptional=" + obj + ", accountOptional=" + obj2 + "}";
    }
}
