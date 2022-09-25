package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.nga.engine.education.p6016a.C75650ai;
import com.google.assistant.p3775ac.p3779d.C48468h;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.j */
/* compiled from: PG */
public final /* synthetic */ class C75755j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75688am f210239a;

    /* renamed from: b */
    public final /* synthetic */ Locale f210240b;

    /* renamed from: c */
    public final /* synthetic */ C48468h f210241c;

    public /* synthetic */ C75755j(C75688am amVar, Locale locale, C48468h hVar) {
        this.f210239a = amVar;
        this.f210240b = locale;
        this.f210241c = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f210239a.mo71825a(this.f210240b, (C75650ai) obj, this.f210241c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
