package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.C125346x;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.w */
/* compiled from: PG */
public final /* synthetic */ class C125368w implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125314ab f345776a;

    /* renamed from: b */
    public final /* synthetic */ C125346x f345777b;

    public /* synthetic */ C125368w(C125314ab abVar, C125346x xVar) {
        this.f345776a = abVar;
        this.f345777b = xVar;
    }

    public final void accept(Object obj) {
        C125314ab abVar = this.f345776a;
        Void voidR = (Void) obj;
        abVar.f345688a.mo117175b().mo117159k(this.f345777b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
