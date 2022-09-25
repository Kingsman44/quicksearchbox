package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.s */
/* compiled from: PG */
final class C29679s extends C29652hw {

    /* renamed from: a */
    private final String f80368a;

    /* renamed from: b */
    private final C58833ax f80369b;

    /* renamed from: c */
    private final C58833ax f80370c;

    /* renamed from: d */
    private final boolean f80371d;

    public C29679s(String str, C58833ax axVar, C58833ax axVar2, boolean z) {
        this.f80368a = str;
        this.f80369b = axVar;
        this.f80370c = axVar2;
        this.f80371d = z;
    }

    /* renamed from: a */
    public final C58833ax mo34792a() {
        return this.f80369b;
    }

    /* renamed from: b */
    public final C58833ax mo34793b() {
        return this.f80370c;
    }

    /* renamed from: c */
    public final String mo34794c() {
        return this.f80368a;
    }

    /* renamed from: d */
    public final boolean mo34795d() {
        return this.f80371d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29652hw) {
            C29652hw hwVar = (C29652hw) obj;
            return this.f80368a.equals(hwVar.mo34794c()) && this.f80369b.equals(hwVar.mo34792a()) && this.f80370c.equals(hwVar.mo34793b()) && this.f80371d == hwVar.mo34795d();
        }
    }

    public final int hashCode() {
        return ((((((this.f80368a.hashCode() ^ 1000003) * 1000003) ^ this.f80369b.hashCode()) * 1000003) ^ this.f80370c.hashCode()) * 1000003) ^ (true != this.f80371d ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.f80368a;
        String valueOf = String.valueOf(this.f80369b);
        String valueOf2 = String.valueOf(this.f80370c);
        boolean z = this.f80371d;
        return "RemoveFileGroupRequest{groupName=" + str + ", accountOptional=" + valueOf + ", variantIdOptional=" + valueOf2 + ", pendingOnly=" + z + "}";
    }
}
