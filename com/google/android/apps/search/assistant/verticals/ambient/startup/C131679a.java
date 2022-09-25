package com.google.android.apps.search.assistant.verticals.ambient.startup;

import android.content.Intent;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131690b;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.startup.a */
/* compiled from: PG */
public final class C131679a implements C47102r {

    /* renamed from: a */
    private static final C59071e f359779a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.ambient.startup.a");

    /* renamed from: b */
    private final C131690b f359780b;

    public C131679a(C131690b bVar) {
        this.f359780b = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        ((C59052c) ((C59052c) f359779a.mo56224b()).mo56372aa(39177)).mo56385o(intent);
        intent.getExtras();
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            return this.f359780b.mo110265b(false);
        }
        return C60856cj.m92899h(new RuntimeException("Unexpected intent."));
    }
}
