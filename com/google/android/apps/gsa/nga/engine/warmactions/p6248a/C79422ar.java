package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.provider.ContactsContract;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C79422ar implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79425au f218075a;

    public /* synthetic */ C79422ar(C79425au auVar) {
        this.f218075a = auVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f218075a.f218082b.a(ContactsContract.Contacts.CONTENT_URI, new String[]{"starred"}, "display_name=?", new String[]{(String) obj}, (String) null);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
