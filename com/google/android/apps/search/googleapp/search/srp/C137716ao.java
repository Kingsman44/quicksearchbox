package com.google.android.apps.search.googleapp.search.srp;

import android.net.Uri;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137853b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ao */
/* compiled from: PG */
final class C137716ao implements Predicate {

    /* renamed from: a */
    private final C137853b f374612a;

    /* renamed from: b */
    private boolean f374613b;

    public C137716ao(String str, C137853b bVar) {
        this.f374612a = bVar;
        this.f374613b = bVar.mo114011b(Uri.parse(str));
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

    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        if (this.f374612a.mo114011b(Uri.parse((String) obj))) {
            return false;
        }
        if (!this.f374613b) {
            return true;
        }
        this.f374613b = false;
        return false;
    }
}
