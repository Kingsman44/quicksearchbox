package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import android.accounts.Account;
import com.google.android.gms.reminders.C145773b;
import com.google.android.gms.reminders.C145778g;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.b */
/* compiled from: PG */
public final /* synthetic */ class C123884b implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123886d f342200a;

    public /* synthetic */ C123884b(C123886d dVar) {
        this.f342200a = dVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return C145778g.m237071a(this.f342200a.f342202b, new C145773b(new Account((String) obj, "com.google")));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
