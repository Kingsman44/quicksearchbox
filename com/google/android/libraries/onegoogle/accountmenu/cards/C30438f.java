package com.google.android.libraries.onegoogle.accountmenu.cards;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.f */
/* compiled from: PG */
public final class C30438f extends C30352ag {

    /* renamed from: a */
    private final C58833ax f82237a;

    /* renamed from: b */
    private final C58833ax f82238b;

    public C30438f(C58833ax axVar, C58833ax axVar2) {
        this.f82237a = axVar;
        this.f82238b = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo35929a() {
        return this.f82238b;
    }

    /* renamed from: b */
    public final C58833ax mo35930b() {
        return this.f82237a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30352ag) {
            C30352ag agVar = (C30352ag) obj;
            return this.f82237a.equals(agVar.mo35930b()) && this.f82238b.equals(agVar.mo35929a());
        }
    }

    public final int hashCode() {
        return ((this.f82237a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f82237a);
        return "BackupSyncStorageCardsBundle{storageCardRetriever=" + valueOf + ", backupSyncCardRetriever=Optional.absent()}";
    }
}
