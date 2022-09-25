package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8523p;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p.f */
/* compiled from: PG */
public final /* synthetic */ class C111756f implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111761k f310641a;

    public /* synthetic */ C111756f(C111761k kVar) {
        this.f310641a = kVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return (String) Optional.ofNullable(((Uri) Optional.ofNullable((Uri) this.f310641a.f310651d.get((C113415ez) obj)).orElse(Uri.parse(BuildConfig.FLAVOR))).getHost()).orElse(BuildConfig.FLAVOR);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
