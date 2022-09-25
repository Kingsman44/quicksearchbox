package com.google.android.apps.search.assistant.verticals.ambient.trigger.location;

import android.content.Intent;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.location.p */
/* compiled from: PG */
public final /* synthetic */ class C131804p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ Intent f359998a;

    public /* synthetic */ C131804p(Intent intent) {
        this.f359998a = intent;
    }

    public final C60870cx apply(Object obj) {
        C131790bc bcVar = (C131790bc) obj;
        String g = C58837ba.m90858g(this.f359998a.getDataString());
        if (g.isEmpty()) {
            return C60856cj.m92900i(false);
        }
        C47633f g2 = C47633f.m84733g(bcVar.f359976c.mo50215b(bcVar.f359975b));
        Objects.requireNonNull(g);
        return g2.mo51515h(new C131785ay(g), bcVar.f359978e);
    }
}
