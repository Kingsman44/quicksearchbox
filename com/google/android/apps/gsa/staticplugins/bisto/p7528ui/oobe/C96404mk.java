package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mk */
/* compiled from: PG */
public final class C96404mk extends C84036z {

    /* renamed from: a */
    public static final C59071e f269706a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mk");

    /* renamed from: b */
    static final Duration f269707b = Duration.ofSeconds(1);

    /* renamed from: c */
    public final C124550f f269708c;

    /* renamed from: d */
    public final C68214a f269709d;

    /* renamed from: e */
    public final String f269710e;

    /* renamed from: f */
    private final Executor f269711f;

    /* renamed from: g */
    private final C69464a f269712g;

    /* renamed from: h */
    private final C84026u f269713h;

    public C96404mk(Executor executor, C84026u uVar, C69464a aVar, C124550f fVar, C68214a aVar2, C96094ay ayVar) {
        this.f269711f = executor;
        this.f269712g = aVar;
        this.f269713h = uVar;
        this.f269708c = fVar;
        this.f269709d = aVar2;
        String str = ayVar.f269039a;
        str.getClass();
        this.f269710e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        Class<TimeoutException> cls = TimeoutException.class;
        return C58485gu.m89846n(this.f269713h.mo77487a(C60846c.m92878g(C60846c.m92878g(C60922j.m93045h(C60838bs.m92859i(this.f269708c.mo83408n(this.f269710e)), new C96400mg(this), this.f269711f), C124551g.class, new C96401mh(), this.f269711f), cls, new C96402mi(this), this.f269711f), this.f269712g));
    }
}
