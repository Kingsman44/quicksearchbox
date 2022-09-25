package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17161x;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.j */
/* compiled from: PG */
public final /* synthetic */ class C122310j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f339162a;

    public /* synthetic */ C122310j(Locale locale) {
        this.f339162a = locale;
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
        Locale locale = this.f339162a;
        C58974d dVar = C122314n.f339169a;
        return C17161x.m34312a((String) obj, locale).isPresent();
    }
}
