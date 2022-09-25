package com.google.android.libraries.assistant.auto.tng.media.p1053d.p1057c.p1058a;

import com.google.android.libraries.assistant.auto.tng.common.p933q.p934a.C13317a;
import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1047e.p1048a.C13974a;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.C13990a;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.p1054a.C13991a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.d.c.a.e */
/* compiled from: PG */
public final class C14000e implements C13990a {

    /* renamed from: a */
    public final C13991a f42591a;

    /* renamed from: b */
    public final C13974a f42592b;

    /* renamed from: c */
    public final C69464a f42593c;

    /* renamed from: d */
    public final Executor f42594d;

    /* renamed from: e */
    public final C13317a f42595e;

    /* renamed from: f */
    private final C69464a f42596f;

    /* renamed from: g */
    private final C69464a f42597g;

    /* renamed from: h */
    private final Executor f42598h;

    public C14000e(C13991a aVar, C13974a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, Executor executor, Executor executor2, C13317a aVar6) {
        this.f42591a = aVar;
        this.f42592b = aVar2;
        this.f42593c = aVar3;
        this.f42596f = aVar4;
        this.f42597g = aVar5;
        this.f42594d = executor;
        this.f42598h = executor2;
        this.f42595e = aVar6;
    }

    /* renamed from: a */
    public final C60870cx mo21381a() {
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: b */
    public final C60870cx mo21382b() {
        C60870cx b = ((C46128f) this.f42597g.mo17428b()).mo50215b((AccountId) this.f42596f.mo17428b());
        C13998c cVar = new C13998c(this);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(cVar), this.f42594d);
        C13999d dVar = new C13999d(this);
        return C60922j.m93044g(h, C47810es.m84963c(dVar), this.f42598h);
    }
}
