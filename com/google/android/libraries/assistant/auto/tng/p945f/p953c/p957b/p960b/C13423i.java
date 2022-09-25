package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C13423i implements Function {

    /* renamed from: a */
    public final /* synthetic */ C13426l f41236a;

    /* renamed from: b */
    public final /* synthetic */ BundledMessageNotification f41237b;

    /* renamed from: c */
    public final /* synthetic */ String f41238c;

    /* renamed from: d */
    public final /* synthetic */ String f41239d;

    public /* synthetic */ C13423i(C13426l lVar, BundledMessageNotification bundledMessageNotification, String str, String str2) {
        this.f41236a = lVar;
        this.f41237b = bundledMessageNotification;
        this.f41238c = str;
        this.f41239d = str2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C13426l lVar = this.f41236a;
        return lVar.f41247e.mo57305b(new C13421g(lVar, this.f41237b, (C13425k) obj, this.f41238c, this.f41239d), lVar.f41246d);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
