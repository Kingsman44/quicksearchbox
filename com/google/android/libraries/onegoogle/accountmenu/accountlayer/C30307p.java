package com.google.android.libraries.onegoogle.accountmenu.accountlayer;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.accountlayer.p */
/* compiled from: PG */
public final class C30307p extends C30293b {

    /* renamed from: a */
    public C30292a f81935a;

    /* renamed from: b */
    public C30292a f81936b;

    /* renamed from: c */
    public C30292a f81937c;

    /* renamed from: a */
    public final C30294c mo35816a() {
        C30292a aVar;
        C30292a aVar2;
        C30292a aVar3 = this.f81935a;
        if (aVar3 != null && (aVar = this.f81936b) != null && (aVar2 = this.f81937c) != null) {
            return new C30308q(aVar3, aVar, aVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f81935a == null) {
            sb.append(" myAccountClickListener");
        }
        if (this.f81936b == null) {
            sb.append(" useAnotherAccountClickListener");
        }
        if (this.f81937c == null) {
            sb.append(" manageAccountsClickListener");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
