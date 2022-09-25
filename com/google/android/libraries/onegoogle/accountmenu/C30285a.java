package com.google.android.libraries.onegoogle.accountmenu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.a */
/* compiled from: PG */
public final /* synthetic */ class C30285a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AccountMenuDiscBinder f81912a;

    /* renamed from: b */
    public final /* synthetic */ String f81913b;

    public /* synthetic */ C30285a(AccountMenuDiscBinder accountMenuDiscBinder, String str) {
        this.f81912a = accountMenuDiscBinder;
        this.f81913b = str;
    }

    public final void run() {
        AccountMenuDiscBinder accountMenuDiscBinder = this.f81912a;
        accountMenuDiscBinder.f81893a.setContentDescription(this.f81913b);
    }
}
