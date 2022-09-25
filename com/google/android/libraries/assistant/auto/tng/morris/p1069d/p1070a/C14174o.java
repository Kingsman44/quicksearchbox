package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.o */
/* compiled from: PG */
public final /* synthetic */ class C14174o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ long f42937a;

    public /* synthetic */ C14174o(long j) {
        this.f42937a = j;
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
        return messageNotification.mo39549g().isPresent() && ((Long) messageNotification.mo39549g().get()).longValue() > this.f42937a;
    }
}
