package com.google.android.libraries.notifications.data;

import com.google.android.libraries.notifications.C29986f;

/* renamed from: com.google.android.libraries.notifications.data.a */
/* compiled from: PG */
public final class C29787a {

    /* renamed from: a */
    public Long f80713a;

    /* renamed from: b */
    public String f80714b;

    /* renamed from: c */
    public Long f80715c;

    /* renamed from: d */
    public Long f80716d;

    /* renamed from: e */
    public Long f80717e;

    /* renamed from: f */
    public Long f80718f;

    /* renamed from: g */
    public String f80719g;

    /* renamed from: h */
    public String f80720h;

    /* renamed from: i */
    private String f80721i;

    /* renamed from: j */
    private C29986f f80722j;

    /* renamed from: k */
    private int f80723k;

    /* renamed from: l */
    private byte f80724l;

    public C29787a() {
    }

    public C29787a(C29820k kVar) {
        C29788b bVar = (C29788b) kVar;
        this.f80713a = bVar.f80725a;
        this.f80721i = bVar.f80726b;
        this.f80714b = bVar.f80727c;
        this.f80715c = bVar.f80728d;
        this.f80716d = bVar.f80729e;
        this.f80722j = bVar.f80730f;
        this.f80717e = bVar.f80731g;
        this.f80723k = bVar.f80732h;
        this.f80718f = bVar.f80733i;
        this.f80719g = bVar.f80734j;
        this.f80720h = bVar.f80735k;
        this.f80724l = 1;
    }

    /* renamed from: a */
    public final C29820k mo34995a() {
        String str;
        Long l;
        Long l2;
        C29986f fVar;
        Long l3;
        Long l4;
        String str2;
        String str3;
        if (this.f80724l == 1 && (str = this.f80721i) != null && (l = this.f80715c) != null && (l2 = this.f80716d) != null && (fVar = this.f80722j) != null && (l3 = this.f80717e) != null && (l4 = this.f80718f) != null && (str2 = this.f80719g) != null && (str3 = this.f80720h) != null) {
            return new C29788b(this.f80713a, str, this.f80714b, l, l2, fVar, l3, this.f80723k, l4, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f80721i == null) {
            sb.append(" accountName");
        }
        if (this.f80715c == null) {
            sb.append(" syncVersion");
        }
        if (this.f80716d == null) {
            sb.append(" pageVersion");
        }
        if (this.f80722j == null) {
            sb.append(" registrationStatus");
        }
        if (this.f80717e == null) {
            sb.append(" lastRegistrationTimeMs");
        }
        if (this.f80724l == 0) {
            sb.append(" lastRegistrationRequestHash");
        }
        if (this.f80718f == null) {
            sb.append(" firstRegistrationVersion");
        }
        if (this.f80719g == null) {
            sb.append(" internalTargetId");
        }
        if (this.f80720h == null) {
            sb.append(" representativeTargetId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo34996b(String str) {
        if (str != null) {
            this.f80721i = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: c */
    public final void mo34997c(String str) {
        if (str != null) {
            this.f80719g = str;
            return;
        }
        throw new NullPointerException("Null internalTargetId");
    }

    /* renamed from: d */
    public final void mo34998d(int i) {
        this.f80723k = i;
        this.f80724l = 1;
    }

    /* renamed from: e */
    public final void mo34999e(C29986f fVar) {
        if (fVar != null) {
            this.f80722j = fVar;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    /* renamed from: f */
    public final void mo35000f(String str) {
        if (str != null) {
            this.f80720h = str;
            return;
        }
        throw new NullPointerException("Null representativeTargetId");
    }
}
