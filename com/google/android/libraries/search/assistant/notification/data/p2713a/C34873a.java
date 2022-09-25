package com.google.android.libraries.search.assistant.notification.data.p2713a;

import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.a.a */
/* compiled from: PG */
public final /* synthetic */ class C34873a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C34873a f92507a = new C34873a();

    private /* synthetic */ C34873a() {
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        MessageNotification messageNotification = (MessageNotification) obj;
        return messageNotification.mo39557n().isPresent() && ((CharSequence) messageNotification.mo39557n().get()).length() > 0;
    }
}
