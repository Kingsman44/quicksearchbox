package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ks */
/* compiled from: PG */
public final /* synthetic */ class C109356ks implements Function {

    /* renamed from: a */
    public final /* synthetic */ C109351kn f304631a;

    public /* synthetic */ C109356ks(C109351kn knVar) {
        this.f304631a = knVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C109351kn knVar = this.f304631a;
        C109354kq kqVar = (C109354kq) obj;
        if (!knVar.mo97788d()) {
            return knVar.mo97786b(C109339kb.f304560b, kqVar);
        }
        return knVar.mo97785a(true != knVar.mo97788d() ? R.string.opa_offline_turn_on_wifi_settings_card : R.string.opa_offline_select_wifi_network_settings_card, C87739bu.OPEN_WIFI_SETTINGS_BUTTON_TAPPED, kqVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
