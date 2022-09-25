package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile;

import com.google.common.base.C58837ba;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.crossprofile.j */
/* compiled from: PG */
public final /* synthetic */ class C125330j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125346x f345710a;

    public /* synthetic */ C125330j(C125346x xVar) {
        this.f345710a = xVar;
    }

    public final void accept(Object obj) {
        this.f345710a.mo106913b(C58837ba.m90858g(((Throwable) obj).getMessage()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
