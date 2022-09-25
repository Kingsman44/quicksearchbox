package com.google.android.libraries.search.assistant.proactive.p2775g;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49076fo;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.ah */
/* compiled from: PG */
public final class C36279ah implements C36280ai {

    /* renamed from: a */
    public final C21370a f94760a;

    /* renamed from: b */
    private final Uri f94761b;

    /* renamed from: c */
    private final C42880af f94762c;

    /* renamed from: d */
    private final Executor f94763d;

    public C36279ah(Context context, C42880af afVar, C21370a aVar, Executor executor) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("opa");
        a.f111968c = "opa";
        a.mo45821b("NotificationEvents.pb");
        this.f94761b = a.mo45820a();
        this.f94762c = afVar;
        this.f94760a = aVar;
        this.f94763d = executor;
    }

    /* renamed from: c */
    private final C42876ab m64756c() {
        C42880af afVar = this.f94762c;
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(this.f94761b);
        i.mo45967d(C49076fo.f126934b);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: a */
    public final C60870cx mo40087a() {
        C60870cx d = m64756c().mo46042d();
        C36277af afVar = C36277af.f94759a;
        return C60922j.m93044g(d, C47810es.m84963c(afVar), this.f94763d);
    }

    /* renamed from: b */
    public final void mo40088b(int i) {
        m64756c().mo46039a(new C36276ae(this, i), this.f94763d);
    }
}
