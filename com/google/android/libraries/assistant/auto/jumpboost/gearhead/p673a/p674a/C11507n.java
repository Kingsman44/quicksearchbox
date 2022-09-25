package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import android.content.Intent;
import com.google.android.apps.auto.p450a.p451a.C8910ca;
import com.google.android.apps.auto.p450a.p451a.C8913f;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11525d;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11526e;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p676c.C11524a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.n */
/* compiled from: PG */
public final class C11507n implements C11525d, C11526e {

    /* renamed from: a */
    public final Executor f37383a;

    /* renamed from: b */
    public final C68214a f37384b;

    /* renamed from: c */
    public Integer f37385c;

    /* renamed from: d */
    private final Executor f37386d;

    public C11507n(Executor executor, C68214a aVar) {
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(aVar, "callbackStub");
        this.f37383a = executor;
        this.f37384b = aVar;
        this.f37386d = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo20024a() {
        return C60856cj.m92905n(C47810es.m84965e(new C11499f(this)), this.f37386d);
    }

    /* renamed from: b */
    public final C60870cx mo20025b(Intent intent) {
        C69664n.m101061g(intent, "intent");
        return C60856cj.m92905n(C47810es.m84965e(new C11501h(this, intent)), this.f37386d);
    }

    /* renamed from: c */
    public final C60870cx mo20026c() {
        return C60856cj.m92905n(C47810es.m84965e(new C11502i(this)), this.f37386d);
    }

    /* renamed from: d */
    public final C60870cx mo20027d(C8913f fVar) {
        C69664n.m101061g(fVar, "params");
        return C60856cj.m92905n(C47810es.m84965e(new C11504k(this, fVar)), this.f37386d);
    }

    /* renamed from: e */
    public final C60870cx mo20028e(C8910ca caVar) {
        C69664n.m101061g(caVar, "request");
        return C60856cj.m92905n(C47810es.m84965e(new C11505l(this, caVar)), this.f37386d);
    }

    /* renamed from: f */
    public final void mo20029f(int i) {
        C11524a.m27217a(this.f37386d, "Error registering callbacks", new C11503j(this, i));
    }

    /* renamed from: g */
    public final void mo20030g() {
        C11524a.m27217a(this.f37386d, "Error unregistering callbacks", new C11506m(this));
    }
}
