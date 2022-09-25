package com.google.android.libraries.onegoogle.accountmenu.features;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.f */
/* compiled from: PG */
final class C30602f extends C30629l {

    /* renamed from: a */
    private final C58833ax f82673a;

    /* renamed from: b */
    private final C58833ax f82674b;

    /* renamed from: c */
    private final boolean f82675c;

    public C30602f(C58833ax axVar, C58833ax axVar2, boolean z) {
        this.f82673a = axVar;
        this.f82674b = axVar2;
        this.f82675c = z;
    }

    /* renamed from: a */
    public final C58833ax mo36291a() {
        return this.f82674b;
    }

    /* renamed from: b */
    public final C58833ax mo36292b() {
        return this.f82673a;
    }

    /* renamed from: c */
    public final boolean mo36293c() {
        return this.f82675c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30629l) {
            C30629l lVar = (C30629l) obj;
            return this.f82673a.equals(lVar.mo36292b()) && this.f82674b.equals(lVar.mo36291a()) && this.f82675c == lVar.mo36293c();
        }
    }

    public final int hashCode() {
        return ((((this.f82673a.hashCode() ^ 1000003) * 1000003) ^ this.f82674b.hashCode()) * 1000003) ^ (true != this.f82675c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f82673a);
        String valueOf2 = String.valueOf(this.f82674b);
        boolean z = this.f82675c;
        return "CommonCards{searchHistoryCardsBundle=" + valueOf + ", backupSyncStorageCardsBundle=" + valueOf2 + ", isMinimizable=" + z + "}";
    }
}
