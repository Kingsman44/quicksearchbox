package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1146d;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.p705a.C11836c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15658j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.d.e */
/* compiled from: PG */
public final class C15615e implements C15593a {

    /* renamed from: a */
    public static final C59071e f46683a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.c.a.d.e");

    /* renamed from: b */
    public final C69464a f46684b;

    /* renamed from: c */
    public final Executor f46685c;

    /* renamed from: d */
    private final C11836c f46686d;

    public C15615e(C69464a aVar, C11836c cVar, Executor executor) {
        this.f46684b = aVar;
        this.f46686d = cVar;
        this.f46685c = executor;
    }

    /* renamed from: a */
    public final C15668t mo22414a(C15666r rVar) {
        C15611a aVar = new C15611a(this, rVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(aVar), this.f46685c);
        C15658j jVar = new C15658j();
        jVar.f46787a = n;
        return jVar.mo22491a();
    }

    /* renamed from: b */
    public final C60870cx mo22423b() {
        C60870cx c = mo22424c();
        C15613c cVar = C15613c.f46681a;
        return C60922j.m93044g(c, C47810es.m84963c(cVar), this.f46685c);
    }

    /* renamed from: c */
    public final C60870cx mo22424c() {
        C60870cx a = this.f46686d.mo20177a(R.string.offline_help_edu_tts);
        C15614d dVar = C15614d.f46682a;
        return C60922j.m93044g(a, C47810es.m84963c(dVar), this.f46685c);
    }
}
