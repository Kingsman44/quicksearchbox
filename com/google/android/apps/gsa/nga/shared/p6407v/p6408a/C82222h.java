package com.google.android.apps.gsa.nga.shared.p6407v.p6408a;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.assistant.p3745ab.p3771w.C48416c;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.a.h */
/* compiled from: PG */
class C82222h implements Function {
    /* renamed from: a */
    public final C48416c apply(NgaState ngaState) {
        NgaState ngaState2 = NgaState.a;
        int ordinal = ngaState.ordinal();
        if (ordinal == 0) {
            return C48416c.ENABLED_IN_PAUSED_MODE;
        }
        if (ordinal == 1) {
            return C48416c.ENABLED;
        }
        if (ordinal == 2) {
            return C48416c.DISABLED;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ngaState))));
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
