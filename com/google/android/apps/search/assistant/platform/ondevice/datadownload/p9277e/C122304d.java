package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import android.accounts.Account;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.d */
/* compiled from: PG */
public final /* synthetic */ class C122304d implements Function {

    /* renamed from: a */
    public final /* synthetic */ Account f339153a;

    public /* synthetic */ C122304d(Account account) {
        this.f339153a = account;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((Account) obj).equals(this.f339153a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
