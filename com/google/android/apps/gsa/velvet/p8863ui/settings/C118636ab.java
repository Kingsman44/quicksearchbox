package com.google.android.apps.gsa.velvet.p8863ui.settings;

import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139143g;
import com.google.android.apps.search.googleapp.settingsui.p10482a.C139146j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.ab */
/* compiled from: PG */
public final class C118636ab {

    /* renamed from: a */
    public final C139146j f330970a;

    /* renamed from: b */
    private final C86034c f330971b;

    /* renamed from: c */
    private final Executor f330972c;

    public C118636ab(Executor executor, C86034c cVar, C139146j jVar) {
        this.f330972c = executor;
        this.f330971b = cVar;
        this.f330970a = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo103830a(C139143g gVar) {
        return C47633f.m84733g(this.f330971b.mo79697b()).mo51515h(new C118635aa(this, gVar), this.f330972c);
    }
}
