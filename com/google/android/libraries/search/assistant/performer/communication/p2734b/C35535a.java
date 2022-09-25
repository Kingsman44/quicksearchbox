package com.google.android.libraries.search.assistant.performer.communication.p2734b;

import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.adm;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.b.a */
/* compiled from: PG */
public final /* synthetic */ class C35535a implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35535a f93316a = new C35535a();

    private /* synthetic */ C35535a() {
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
        int i = C35540f.f93331c;
        C52623yp ypVar = ((adm) obj).f134892b;
        if (ypVar == null) {
            ypVar = C52623yp.f138162g;
        }
        C52627yt ytVar = ypVar.f138165b;
        if (ytVar == null) {
            ytVar = C52627yt.f138176c;
        }
        return ytVar.f138178a.size() > 0;
    }
}
