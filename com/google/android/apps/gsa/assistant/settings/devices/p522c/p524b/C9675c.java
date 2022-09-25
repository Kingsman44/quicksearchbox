package com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121132j;
import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121134l;
import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121123a;
import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121124b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.b.c */
/* compiled from: PG */
public final /* synthetic */ class C9675c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f33454a;

    /* renamed from: b */
    public final /* synthetic */ boolean f33455b;

    public /* synthetic */ C9675c(String str, boolean z) {
        this.f33454a = str;
        this.f33455b = z;
    }

    public final void accept(Object obj) {
        String str = this.f33454a;
        boolean z = this.f33455b;
        C121134l lVar = (C121134l) obj;
        ((C58970a) ((C58970a) C9684l.f33469a.mo56224b()).mo56372aa(478)).mo56386p("PR status#updateProtoDataStoreValue: singleton helper is present.");
        C121123a aVar = (C121123a) C121124b.f336563c.createBuilder();
        aVar.copyOnWrite();
        C121124b bVar = (C121124b) aVar.instance;
        bVar.f336565a |= 1;
        bVar.f336566b = z;
        C60922j.m93045h(lVar.f336581b.mo50216c(str), C47810es.m84966f(new C121132j(lVar, (C121124b) aVar.build())), lVar.f336582c);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
