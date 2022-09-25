package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8523p;

import android.net.Uri;
import com.google.android.apps.gsa.nga.shared.p6320al.C80884a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.searchbox.shared.suggestion.C41689o;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p.e */
/* compiled from: PG */
public final /* synthetic */ class C111755e implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C111755e f310640a = new C111755e();

    private /* synthetic */ C111755e() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = C111761k.f310647a;
        C41689o oVar = ((C113415ez) obj).mo100209i().f109010d;
        if (oVar == null) {
            oVar = C41689o.f109041e;
        }
        return Uri.parse(C80884a.m128736a(oVar.f109044b));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
