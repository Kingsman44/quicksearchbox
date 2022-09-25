package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.C36680d;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C36694d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C36701k f95586a;

    /* renamed from: b */
    public final /* synthetic */ List f95587b;

    public /* synthetic */ C36694d(C36701k kVar, List list) {
        this.f95586a = kVar;
        this.f95587b = list;
    }

    public final void accept(Object obj) {
        C60870cx cxVar;
        C36701k kVar = this.f95586a;
        List list = this.f95587b;
        C56002b bVar = (C56002b) obj;
        C36680d dVar = kVar.f95605f;
        bVar.name();
        int ordinal = bVar.ordinal();
        if (ordinal == 5) {
            cxVar = dVar.f95566a.mo40294b("multi_consent_waa_screen_interaction_count_key");
        } else if (ordinal == 11) {
            cxVar = dVar.f95566a.mo40294b("multi_consent_da_screen_interaction_count_key");
        } else if (ordinal == 12) {
            cxVar = dVar.f95566a.mo40294b("multi_consent_dc_screen_interaction_count_key");
        } else {
            throw new IllegalArgumentException("Unknown screen settingSetId: %s".concat(String.valueOf(bVar.name())));
        }
        list.add(dVar.mo40315a(bVar, cxVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
