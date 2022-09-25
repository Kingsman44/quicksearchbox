package com.google.android.apps.gsa.staticplugins.chime;

import android.app.Notification;
import androidx.core.app.C1831r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.v */
/* compiled from: PG */
public final /* synthetic */ class C97740v implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C97740v f272908a = new C97740v();

    private /* synthetic */ C97740v() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Notification.Action action = (Notification.Action) obj;
        return new C1831r(action.icon, action.title, action.actionIntent).mo5008a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
