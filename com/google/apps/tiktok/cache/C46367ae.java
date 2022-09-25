package com.google.apps.tiktok.cache;

import android.content.Context;
import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60934v;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.cache.ae */
/* compiled from: PG */
public final class C46367ae implements C47352j {

    /* renamed from: a */
    public static final C59071e f121379a = C59071e.m91332i("com.google.apps.tiktok.cache.ae");

    /* renamed from: b */
    public final Context f121380b;

    /* renamed from: c */
    public final Map f121381c;

    /* renamed from: d */
    public final C47151b f121382d;

    /* renamed from: e */
    private final C60887da f121383e;

    public C46367ae(Context context, Map map, C60887da daVar, C47151b bVar) {
        this.f121380b = context;
        this.f121381c = map;
        this.f121383e = daVar;
        this.f121382d = bVar;
    }

    /* renamed from: a */
    private final C60870cx m82669a(C47153d dVar) {
        return this.f121383e.mo19398a(C47810es.m84977q(new C46365ac(this, dVar)));
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        return C60856cj.m92895d(this.f121383e.mo19398a(C47810es.m84977q(new C46364ab(this))), m82669a(C47153d.m83864c(1)), m82669a(C47153d.m83864c(2))).mo57334a(new C60934v((Object) null), this.f121383e);
    }
}
