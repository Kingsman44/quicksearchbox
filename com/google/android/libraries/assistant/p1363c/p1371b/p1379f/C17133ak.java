package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import android.accounts.Account;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.c.b.f.ak */
/* compiled from: PG */
public final /* synthetic */ class C17133ak implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C17133ak f49818a = new C17133ak();

    private /* synthetic */ C17133ak() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Account account = (Account) obj;
        C59071e eVar = C17136an.f49821a;
        return String.format("%s:%s", new Object[]{account.type, account.name});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
