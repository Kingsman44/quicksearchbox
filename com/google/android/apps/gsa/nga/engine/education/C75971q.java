package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.assistant.p3775ac.p3779d.C48468h;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.q */
/* compiled from: PG */
public final /* synthetic */ class C75971q implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75688am f210773a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210774b;

    /* renamed from: c */
    public final /* synthetic */ C48468h f210775c;

    public /* synthetic */ C75971q(C75688am amVar, Locale locale, C48468h hVar) {
        this.f210773a = amVar;
        this.f210774b = locale;
        this.f210775c = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f210773a.mo71825a(this.f210774b, (C75650ai) obj, this.f210775c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
