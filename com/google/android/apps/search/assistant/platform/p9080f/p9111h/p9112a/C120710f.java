package com.google.android.apps.search.assistant.platform.p9080f.p9111h.p9112a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119880du;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9111h.C120704a;
import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.h.a.f */
/* compiled from: PG */
public final class C120710f implements C120704a {

    /* renamed from: a */
    public static final C59071e f335718a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.h.a.f");

    /* renamed from: b */
    public final String f335719b = Locale.getDefault().toLanguageTag();

    /* renamed from: c */
    public final Optional f335720c;

    /* renamed from: d */
    public final C58485gu f335721d;

    /* renamed from: e */
    private final Executor f335722e;

    /* renamed from: f */
    private final Optional f335723f;

    /* renamed from: g */
    private final C46423aj f335724g;

    public C120710f(Executor executor, C119880du duVar, C120695j jVar, C119935d dVar) {
        Optional optional;
        Optional optional2;
        this.f335722e = executor;
        if ((duVar.f333859a & 1) != 0) {
            optional = Optional.m71637of(duVar.f333860b);
        } else {
            optional = Optional.empty();
        }
        this.f335720c = optional;
        if ((jVar.f335681a & 2) != 0) {
            optional2 = Optional.m71637of(jVar.f335687g);
        } else {
            optional2 = Optional.empty();
        }
        this.f335723f = optional2;
        this.f335721d = C58485gu.m89842j(duVar.f333861c);
        this.f335724g = new C46423aj(new C120709e(dVar, executor), executor);
    }

    /* renamed from: a */
    public final C60870cx mo104902a() {
        C60870cx b = this.f335724g.mo50395b();
        C120707c cVar = new C120707c(this);
        return C60922j.m93045h(b, C47810es.m84966f(cVar), this.f335722e);
    }

    /* renamed from: b */
    public final C60870cx mo104903b() {
        C60870cx b = this.f335724g.mo50395b();
        C120708d dVar = new C120708d(this);
        return C60922j.m93045h(b, C47810es.m84966f(dVar), this.f335722e);
    }

    /* renamed from: c */
    public final C60870cx mo104904c() {
        if (this.f335723f.isPresent()) {
            return C60856cj.m92900i((String) this.f335723f.get());
        }
        return mo104903b();
    }
}
