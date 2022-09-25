package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.b */
/* compiled from: PG */
final class C30423b extends C30426e {

    /* renamed from: a */
    private final String f82221a;

    /* renamed from: b */
    private final long f82222b;

    /* renamed from: c */
    private final int f82223c;

    /* renamed from: d */
    private final int f82224d;

    public C30423b(String str, int i, long j, int i2) {
        this.f82221a = str;
        this.f82224d = i;
        this.f82222b = j;
        this.f82223c = i2;
    }

    /* renamed from: a */
    public final int mo35995a() {
        return this.f82223c;
    }

    /* renamed from: b */
    public final long mo35996b() {
        return this.f82222b;
    }

    /* renamed from: c */
    public final String mo35997c() {
        return this.f82221a;
    }

    /* renamed from: d */
    public final int mo35998d() {
        return this.f82224d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30426e) {
            C30426e eVar = (C30426e) obj;
            return this.f82221a.equals(eVar.mo35997c()) && this.f82224d == eVar.mo35998d() && this.f82222b == eVar.mo35996b() && this.f82223c == eVar.mo35995a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f82221a.hashCode();
        int i = this.f82224d;
        long j = this.f82222b;
        return ((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f82223c;
    }

    public final String toString() {
        String str;
        String str2 = this.f82221a;
        switch (this.f82224d) {
            case 1:
                str = "INITIAL";
                break;
            case 2:
                str = "OFF";
                break;
            case 3:
                str = "COMPLETE";
                break;
            case 4:
                str = "IN_PROGRESS";
                break;
            case 5:
                str = "PREPARE";
                break;
            case 6:
                str = "FAILURE";
                break;
            case 7:
                str = "NO_CONNECTION";
                break;
            case 8:
                str = "CUSTOM";
                break;
            case 9:
                str = "CUSTOM_FAILURE";
                break;
            case 10:
                str = "CUSTOM_PAUSED";
                break;
            default:
                str = "STORAGE_FAILURE";
                break;
        }
        long j = this.f82222b;
        int i = this.f82223c;
        return "BackupSyncCardDecorationState{accountIdentifier=" + str2 + ", backupSyncState=" + str + ", lastDecorationConsumedTime=" + j + ", totalTimesConsumed=" + i + "}";
    }
}
