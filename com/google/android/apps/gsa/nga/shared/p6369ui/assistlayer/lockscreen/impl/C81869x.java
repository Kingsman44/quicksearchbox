package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl;

import android.os.IBinder;
import android.os.IInterface;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.x */
/* compiled from: PG */
public final /* synthetic */ class C81869x implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C81869x f223885a = new C81869x();

    private /* synthetic */ C81869x() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.ITransparentUiActivityController");
        return queryLocalInterface instanceof C81851f ? (C81851f) queryLocalInterface : new C81849d(iBinder);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
