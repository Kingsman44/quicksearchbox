package com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.search.googleapp.search.voicesearch.p10468b.C138717c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.a.n */
/* compiled from: PG */
public final class C138880n {

    /* renamed from: a */
    public final C46723bg f377755a;

    /* renamed from: b */
    public final C46778cv f377756b;

    /* renamed from: c */
    public final Executor f377757c;

    /* renamed from: d */
    public final C138717c f377758d;

    /* renamed from: e */
    public final Resources f377759e;

    /* renamed from: f */
    private final C42876ab f377760f;

    public C138880n(C46723bg bgVar, Executor executor, C46778cv cvVar, C138717c cVar, Context context, C42876ab abVar) {
        this.f377755a = bgVar;
        this.f377756b = cvVar;
        this.f377757c = executor;
        this.f377758d = cVar;
        this.f377759e = context.getResources();
        this.f377760f = abVar;
    }

    /* renamed from: a */
    public final C60870cx mo114610a() {
        return C47633f.m84733g(this.f377760f.mo46042d()).mo51515h(C138877k.f377751a, this.f377757c);
    }

    /* renamed from: b */
    public final C60870cx mo114611b(boolean z) {
        C60870cx a = this.f377760f.mo46039a(new C138875i(z), this.f377757c);
        this.f377756b.mo50787a(a, "is_auto_switch_enabled_key");
        return a;
    }
}
