package com.google.android.apps.gsa.p8867w.p8879i.p8880a;

import com.google.p395al.p408c.p414c.p416b.C8506p;
import com.google.p395al.p408c.p414c.p416b.C8508r;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.w.i.a.a */
/* compiled from: PG */
public final /* synthetic */ class C118798a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C118799b f331360a;

    /* renamed from: b */
    public final /* synthetic */ C8506p f331361b;

    public /* synthetic */ C118798a(C118799b bVar, C8506p pVar) {
        this.f331360a = bVar;
        this.f331361b = pVar;
    }

    public final Object call() {
        C118799b bVar = this.f331360a;
        C8506p pVar = this.f331361b;
        String str = pVar.f29513a;
        String str2 = pVar.f29514b;
        bVar.f331362a.edit().putString("selected_search_language", str).putString("hl_parameter", str2).putBoolean("interaction_with_search_language_preference", true).apply();
        String ab = bVar.f331363b.mo83882ab();
        boolean J = bVar.f331363b.mo83847J(ab);
        bVar.f331365d.mo78313d(str2, Locale.getDefault());
        bVar.f331365d.mo78315f((pVar == null || pVar.f29515c.size() == 0) ? null : ((C8508r) pVar.f29515c.get(0)).f29520b);
        if (J && bVar.f331363b.mo83841D(ab) == null && bVar.f331363b.mo83823l()) {
            bVar.f331362a.edit().putInt("hands_free_hotword_retraining_notification_source", 14).apply();
            bVar.f331364c.mo87235i();
        }
        return null;
    }
}
