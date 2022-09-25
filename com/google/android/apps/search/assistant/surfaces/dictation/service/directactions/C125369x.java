package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.C125346x;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.x */
/* compiled from: PG */
public final /* synthetic */ class C125369x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125314ab f345778a;

    /* renamed from: b */
    public final /* synthetic */ C125346x f345779b;

    public /* synthetic */ C125369x(C125314ab abVar, C125346x xVar) {
        this.f345778a = abVar;
        this.f345779b = xVar;
    }

    public final void accept(Object obj) {
        C125314ab abVar = this.f345778a;
        Throwable th = (Throwable) obj;
        abVar.f345688a.mo117175b().mo117159k(this.f345779b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
