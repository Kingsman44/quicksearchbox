package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.content.ContentUris;
import android.provider.ContactsContract;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bu */
/* compiled from: PG */
public final /* synthetic */ class C33026bu implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C33026bu f88442a = new C33026bu();

    private /* synthetic */ C33026bu() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C33027bv.f88444b;
        return ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, ((Long) obj).longValue()).toString();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
