package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124550f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mo */
/* compiled from: PG */
public final class C96408mo extends C84036z {

    /* renamed from: a */
    public static final C59071e f269716a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mo");

    /* renamed from: b */
    static final Duration f269717b = Duration.ofSeconds(1);

    /* renamed from: c */
    public final C68214a f269718c;

    /* renamed from: d */
    private final Executor f269719d;

    /* renamed from: e */
    private final C69464a f269720e;

    /* renamed from: f */
    private final C84026u f269721f;

    /* renamed from: g */
    private final C124550f f269722g;

    /* renamed from: h */
    private final String f269723h;

    public C96408mo(Executor executor, C84026u uVar, C69464a aVar, C124550f fVar, C68214a aVar2, C96094ay ayVar) {
        this.f269719d = executor;
        this.f269720e = aVar;
        this.f269721f = uVar;
        this.f269722g = fVar;
        this.f269718c = aVar2;
        String str = ayVar.f269039a;
        str.getClass();
        this.f269723h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        return C58485gu.m89846n(this.f269721f.mo77487a(C60846c.m92878g(C60838bs.m92859i(this.f269722g.mo83411q(this.f269723h, C96406mm.f269714a, f269717b)), TimeoutException.class, new C96407mn(this), this.f269719d), this.f269720e));
    }
}
