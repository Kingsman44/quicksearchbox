package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81966ac;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.y */
/* compiled from: PG */
public final /* synthetic */ class C82109y implements Function {

    /* renamed from: a */
    public final /* synthetic */ C82071az f224473a;

    public /* synthetic */ C82109y(C82071az azVar) {
        this.f224473a = azVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C82071az azVar = this.f224473a;
        return ((C91189au) obj).mo85421i(C81966ac.m130207b(azVar.f224335l.getPackageName(), R.drawable.nga_assist_shelf_pill_background_animated), azVar.f224333j);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
