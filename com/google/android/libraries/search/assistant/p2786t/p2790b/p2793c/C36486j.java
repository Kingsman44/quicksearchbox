package com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c;

import android.service.notification.StatusBarNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.t.b.c.j */
/* compiled from: PG */
public final /* synthetic */ class C36486j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C36491o f95238a;

    /* renamed from: b */
    public final /* synthetic */ C36484h f95239b;

    public /* synthetic */ C36486j(C36491o oVar, C36484h hVar) {
        this.f95238a = oVar;
        this.f95239b = hVar;
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
        return this.f95239b.f95230a == this.f95238a.f95244a.mo40176b(((StatusBarNotification) obj).getNotification()).isPresent();
    }
}
