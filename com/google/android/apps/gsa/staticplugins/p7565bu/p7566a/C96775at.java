package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.android.libraries.mdi.download.p2248h.p2250b.C29573t;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29575v;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29576w;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.at */
/* compiled from: PG */
public final /* synthetic */ class C96775at implements Function {

    /* renamed from: a */
    public final /* synthetic */ C69464a f270672a;

    /* renamed from: b */
    public final /* synthetic */ Executor f270673b;

    public /* synthetic */ C96775at(C69464a aVar, Executor executor) {
        this.f270672a = aVar;
        this.f270673b = executor;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C29575v vVar;
        C69464a aVar = this.f270672a;
        Executor executor = this.f270673b;
        C29573t c = C29576w.m54562c();
        Objects.requireNonNull(aVar);
        c.f80126b = new C96772aq(aVar);
        c.f80125a = executor;
        if (((C96762ag) obj).mo90343f()) {
            vVar = C29575v.MULTI_VARIANT_USING_GROUP_KEY;
        } else {
            vVar = C29575v.SINGLE_VARIANT;
        }
        vVar.getClass();
        c.f80129e = vVar;
        return c.mo34770a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
