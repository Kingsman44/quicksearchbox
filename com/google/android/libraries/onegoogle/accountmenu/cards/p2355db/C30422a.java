package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.a */
/* compiled from: PG */
public final class C30422a extends C30425d {

    /* renamed from: a */
    private String f82216a;

    /* renamed from: b */
    private long f82217b;

    /* renamed from: c */
    private int f82218c;

    /* renamed from: d */
    private byte f82219d;

    /* renamed from: e */
    private int f82220e;

    /* renamed from: a */
    public final C30426e mo35990a() {
        String str;
        int i;
        if (this.f82219d == 3 && (str = this.f82216a) != null && (i = this.f82220e) != 0) {
            return new C30423b(str, i, this.f82217b, this.f82218c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f82216a == null) {
            sb.append(" accountIdentifier");
        }
        if (this.f82220e == 0) {
            sb.append(" backupSyncState");
        }
        if ((this.f82219d & 1) == 0) {
            sb.append(" lastDecorationConsumedTime");
        }
        if ((this.f82219d & 2) == 0) {
            sb.append(" totalTimesConsumed");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35991b(String str) {
        if (str != null) {
            this.f82216a = str;
            return;
        }
        throw new NullPointerException("Null accountIdentifier");
    }

    /* renamed from: c */
    public final void mo35992c(int i) {
        if (i != 0) {
            this.f82220e = i;
            return;
        }
        throw new NullPointerException("Null backupSyncState");
    }

    /* renamed from: d */
    public final void mo35993d(long j) {
        this.f82217b = j;
        this.f82219d = (byte) (this.f82219d | 1);
    }

    /* renamed from: e */
    public final void mo35994e(int i) {
        this.f82218c = i;
        this.f82219d = (byte) (this.f82219d | 2);
    }
}
