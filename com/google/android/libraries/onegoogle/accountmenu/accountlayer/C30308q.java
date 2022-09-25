package com.google.android.libraries.onegoogle.accountmenu.accountlayer;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.accountlayer.q */
/* compiled from: PG */
final class C30308q extends C30294c {

    /* renamed from: a */
    private final C30292a f81938a;

    /* renamed from: b */
    private final C30292a f81939b;

    /* renamed from: c */
    private final C30292a f81940c;

    public C30308q(C30292a aVar, C30292a aVar2, C30292a aVar3) {
        this.f81938a = aVar;
        this.f81939b = aVar2;
        this.f81940c = aVar3;
    }

    /* renamed from: a */
    public final C30292a mo35817a() {
        return this.f81940c;
    }

    /* renamed from: b */
    public final C30292a mo35818b() {
        return this.f81938a;
    }

    /* renamed from: c */
    public final C30292a mo35819c() {
        return this.f81939b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30294c) {
            C30294c cVar = (C30294c) obj;
            return this.f81938a.equals(cVar.mo35818b()) && this.f81939b.equals(cVar.mo35819c()) && this.f81940c.equals(cVar.mo35817a());
        }
    }

    public final int hashCode() {
        return ((((this.f81938a.hashCode() ^ 1000003) * 1000003) ^ this.f81939b.hashCode()) * 1000003) ^ this.f81940c.hashCode();
    }

    public final String toString() {
        String obj = this.f81938a.toString();
        String obj2 = this.f81939b.toString();
        String obj3 = this.f81940c.toString();
        return "AccountMenuClickListeners{myAccountClickListener=" + obj + ", useAnotherAccountClickListener=" + obj2 + ", manageAccountsClickListener=" + obj3 + "}";
    }
}
