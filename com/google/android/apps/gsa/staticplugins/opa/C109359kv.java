package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.kv */
/* compiled from: PG */
public final /* synthetic */ class C109359kv implements Function {

    /* renamed from: a */
    public final /* synthetic */ C109351kn f304634a;

    public /* synthetic */ C109359kv(C109351kn knVar) {
        this.f304634a = knVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        return this.f304634a.mo97785a(R.string.opa_offline_sign_in_to_network_card, C87739bu.SIGN_IN_TO_NETWORK_BUTTON_TAPPED, (C109354kq) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
