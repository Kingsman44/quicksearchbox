package com.google.android.apps.search.assistant.platform.ondevice.datadownload;

import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17160w;
import com.google.android.libraries.mdi.C29690f;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.p */
/* compiled from: PG */
public final /* synthetic */ class C122329p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f339198a;

    public /* synthetic */ C122329p(Locale locale) {
        this.f339198a = locale;
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
        return C17160w.m34310a((C29690f) obj, this.f339198a);
    }
}
