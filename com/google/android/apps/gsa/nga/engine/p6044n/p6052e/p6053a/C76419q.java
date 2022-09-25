package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76435h;
import java.util.Locale;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.q */
/* compiled from: PG */
public final /* synthetic */ class C76419q implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76435h f211561a;

    public /* synthetic */ C76419q(C76435h hVar) {
        this.f211561a = hVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76435h hVar = this.f211561a;
        return Boolean.valueOf(Objects.equals(((String) obj).trim().toUpperCase(Locale.US), (hVar.f211587a == 3 ? (String) hVar.f211588b : BuildConfig.FLAVOR).trim().toUpperCase(Locale.US)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
