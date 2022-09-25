package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9212b;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9179a.C121214b;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9229b.C121483a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.b.f */
/* compiled from: PG */
public final class C121391f implements C121214b {

    /* renamed from: a */
    public static final C59071e f337023a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.b.j.b.f");

    /* renamed from: b */
    public final Context f337024b;

    /* renamed from: c */
    public final Executor f337025c;

    /* renamed from: d */
    public final C60950i f337026d;

    /* renamed from: e */
    public final C42876ab f337027e;

    /* renamed from: f */
    public final C121483a f337028f;

    public C121391f(Context context, Executor executor, C60950i iVar, C42876ab abVar, C121483a aVar) {
        this.f337024b = context;
        this.f337025c = executor;
        this.f337026d = iVar;
        this.f337027e = abVar;
        this.f337028f = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Duration mo105081a() {
        return Duration.ofDays(1);
    }

    /* renamed from: b */
    public final /* synthetic */ Duration mo105082b() {
        return Duration.ofHours(4);
    }

    /* renamed from: c */
    public final boolean mo105083c() {
        return true;
    }

    /* renamed from: d */
    public final C60870cx mo105084d() {
        C60870cx d = this.f337027e.mo46042d();
        C121386a aVar = new C121386a(this);
        return C60922j.m93045h(d, C47810es.m84966f(aVar), this.f337025c);
    }
}
