package com.google.android.apps.gsa.nga.engine.p6140t;

import com.google.android.apps.gsa.nga.engine.understanding.p6241h.p6242a.C79149g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80454b;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.t.s */
/* compiled from: PG */
public final /* synthetic */ class C77979s implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79149g f214740a;

    /* renamed from: b */
    public final /* synthetic */ Locale f214741b;

    public /* synthetic */ C77979s(C79149g gVar, Locale locale) {
        this.f214740a = gVar;
        this.f214741b = locale;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f214740a.mo73816a(((C80454b) obj).f220819b, this.f214741b);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
