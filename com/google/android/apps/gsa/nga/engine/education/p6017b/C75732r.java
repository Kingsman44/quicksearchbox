package com.google.android.apps.gsa.nga.engine.education.p6017b;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.common.p4522b.C58528ij;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b.r */
/* compiled from: PG */
public final /* synthetic */ class C75732r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C75706ac f210201a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210202b;

    /* renamed from: c */
    public final /* synthetic */ C58528ij f210203c;

    public /* synthetic */ C75732r(C75706ac acVar, Locale locale, C58528ij ijVar) {
        this.f210201a = acVar;
        this.f210202b = locale;
        this.f210203c = ijVar;
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
        String str;
        C75706ac acVar = this.f210201a;
        Locale locale = this.f210202b;
        C58528ij ijVar = this.f210203c;
        C75650ai aiVar = (C75650ai) obj;
        if (aiVar.mo71799c().mo71780b() == 1) {
            str = aiVar.mo71799c().mo71796c();
        } else {
            str = acVar.f210155f.mo75121a(locale).getString(aiVar.mo71799c().mo71779a(), new Object[0]);
        }
        return !ijVar.contains(str);
    }
}
