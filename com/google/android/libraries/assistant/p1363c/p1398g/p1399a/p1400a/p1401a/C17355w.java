package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

import androidx.media3.common.C2644bf;
import androidx.media3.common.C2646bh;
import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.C17332a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.C17357b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.C17359d;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.protobuf.C63088z;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.w */
/* compiled from: PG */
public final class C17355w implements C17357b {

    /* renamed from: a */
    public final C17333a f50201a;

    /* renamed from: b */
    public final C2646bh f50202b;

    /* renamed from: c */
    public final C46428ao f50203c;

    /* renamed from: d */
    public boolean f50204d = false;

    /* renamed from: e */
    public Optional f50205e = Optional.empty();

    /* renamed from: f */
    private final C17332a f50206f;

    /* renamed from: g */
    private final Executor f50207g;

    /* renamed from: h */
    private final C2644bf f50208h;

    public C17355w(Executor executor, C46428ao aoVar, C17332a aVar, C17333a aVar2, C2646bh bhVar) {
        C17354v vVar = new C17354v(this);
        this.f50208h = vVar;
        this.f50206f = aVar;
        this.f50201a = aVar2;
        this.f50203c = aoVar;
        this.f50202b = bhVar;
        this.f50207g = new C60904dr(executor);
        bhVar.mo6016w(vVar);
    }

    /* renamed from: a */
    public final C60870cx mo23292a(C63088z zVar) {
        C17344l lVar = new C17344l(this, zVar);
        return C60856cj.m92903l(C47810es.m84977q(lVar), this.f50207g);
    }

    /* renamed from: b */
    public final C60870cx mo23293b() {
        C17343k kVar = new C17343k(this);
        return C60856cj.m92903l(C47810es.m84977q(kVar), this.f50207g);
    }

    /* renamed from: c */
    public final C60870cx mo23294c() {
        C17353u uVar = new C17353u(this);
        return C60856cj.m92905n(C47810es.m84965e(uVar), this.f50207g);
    }

    public final void close() {
        mo23297e((Throwable) null, "[close]");
    }

    /* renamed from: d */
    public final C60870cx mo23296d() {
        if (((C17359d) this.f50206f).f50213a) {
            return C60856cj.m92899h(new IllegalStateException("Session already configured to play when ready."));
        }
        C17350r rVar = new C17350r(this);
        return C60856cj.m92903l(C47810es.m84977q(rVar), this.f50207g);
    }

    /* renamed from: e */
    public final void mo23297e(Throwable th, String str) {
        this.f50207g.execute(C47810es.m84977q(new C17352t(this, th)));
    }
}
