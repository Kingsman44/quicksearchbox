package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.assistant.p3775ac.p3779d.C48468h;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.u */
/* compiled from: PG */
public final /* synthetic */ class C75975u implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75688am f210779a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210780b;

    /* renamed from: c */
    public final /* synthetic */ C48468h f210781c;

    public /* synthetic */ C75975u(C75688am amVar, Locale locale, C48468h hVar) {
        this.f210779a = amVar;
        this.f210780b = locale;
        this.f210781c = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f210779a.mo71825a(this.f210780b, (C75650ai) obj, this.f210781c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
