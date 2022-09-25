package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62948a;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.bm */
/* compiled from: PG */
public final class C138970bm {

    /* renamed from: d */
    public static final /* synthetic */ int f377944d = 0;

    /* renamed from: a */
    public final C42876ab f377945a;

    /* renamed from: b */
    public final C60887da f377946b;

    /* renamed from: c */
    public final C21370a f377947c;

    /* renamed from: e */
    private final C60887da f377948e;

    /* renamed from: f */
    private final boolean f377949f;

    static {
        C62948a.m95460k(1);
        C62948a.m95456g(1);
    }

    public C138970bm(C42876ab abVar, C60887da daVar, C60887da daVar2, boolean z, C21370a aVar) {
        this.f377946b = daVar;
        this.f377947c = aVar;
        this.f377948e = daVar2;
        this.f377945a = abVar;
        this.f377949f = z;
    }

    /* renamed from: c */
    public static Duration m225783c(C63042fg fgVar, C63042fg fgVar2) {
        C62953e.m95492q(fgVar);
        Duration ofSeconds = Duration.ofSeconds(fgVar.f170154a);
        C62953e.m95492q(fgVar2);
        return ofSeconds.minus(Duration.ofSeconds(fgVar2.f170154a)).abs();
    }

    /* renamed from: a */
    public final C60870cx mo114645a() {
        if (this.f377949f) {
            return C60856cj.m92900i(Optional.m71637of(C62953e.m95484i(this.f377947c.mo26870b())));
        }
        C60870cx b = mo114646b();
        C60870cx d = this.f377945a.mo46042d();
        return C47638k.m84753d(b, d).mo51520a(C47810es.m84978r(new C138969bl(this, b, d)), this.f377948e);
    }

    /* renamed from: b */
    public final C60870cx mo114646b() {
        if (this.f377949f) {
            return C60856cj.m92900i(true);
        }
        C60870cx d = this.f377945a.mo46042d();
        C138967bj bjVar = new C138967bj(this);
        return C60922j.m93044g(d, C47810es.m84963c(bjVar), this.f377948e);
    }
}
