package com.google.android.apps.gsa.nga.shared.p6309ag;

import com.google.android.libraries.mdi.C29690f;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.w */
/* compiled from: PG */
public final /* synthetic */ class C80628w implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80628w f221367a = new C80628w();

    private /* synthetic */ C80628w() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return String.format(Locale.US, "%s build_id=%d", new Object[]{C80627v.WEBREF.name(), Long.valueOf(((C29690f) obj).f80417h)});
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
