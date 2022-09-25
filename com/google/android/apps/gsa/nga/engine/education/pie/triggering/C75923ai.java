package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81374h;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.common.p4522b.C58471gg;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.ai */
/* compiled from: PG */
public final /* synthetic */ class C75923ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75924aj f210650a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210651b;

    public /* synthetic */ C75923ai(C75924aj ajVar, Locale locale) {
        this.f210650a = ajVar;
        this.f210651b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C75924aj ajVar = this.f210650a;
        Locale locale = this.f210651b;
        C81374h hVar = (C81374h) obj;
        C81515c cVar = ajVar.f210654b;
        return cVar.mo75121a(locale).getString(hVar.mo75027a(), hVar.mo75030d().toArray(C58471gg.f156097c));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
