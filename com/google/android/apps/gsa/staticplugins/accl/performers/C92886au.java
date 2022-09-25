package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.content.ContentUris;
import android.provider.ContactsContract;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.au */
/* compiled from: PG */
public final /* synthetic */ class C92886au implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C92886au f259145a = new C92886au();

    private /* synthetic */ C92886au() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C92887av.f259146a;
        return ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, ((Long) obj).longValue()).toString();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
