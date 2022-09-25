package com.google.android.libraries.p11016ak.p11019c;

import android.content.Context;
import com.google.android.libraries.p11016ak.C147620aa;
import com.google.android.libraries.p11016ak.C147621ab;
import com.google.android.libraries.p11016ak.C147628ai;
import com.google.android.libraries.p11016ak.C147631b;
import com.google.android.libraries.p11016ak.C147702d;
import com.google.android.libraries.p11016ak.C147724f;
import com.google.android.libraries.p11016ak.C147730l;
import com.google.android.libraries.p11016ak.C147743y;
import com.google.android.libraries.p11016ak.p11018b.C147634c;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147637a;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147638b;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147644h;
import com.google.android.libraries.p11016ak.p11019c.p11021b.C147653ag;
import com.google.android.libraries.p11016ak.p11019c.p11021b.C147655c;
import com.google.android.libraries.p11016ak.p11019c.p11021b.C147657e;
import com.google.android.libraries.p11016ak.p11019c.p11021b.C147670r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import p5285d.p5290b.p5291a.p5292a.C68193f;
import p5285d.p5290b.p5291a.p5292a.C68209v;

/* renamed from: com.google.android.libraries.ak.c.m */
/* compiled from: PG */
public final class C147689m implements C147621ab {

    /* renamed from: a */
    public C68193f f398568a;

    /* renamed from: b */
    public C58833ax f398569b = C58836b.f156633a;

    /* renamed from: c */
    public final C58881cr f398570c;

    /* renamed from: d */
    public final SettableFuture f398571d = new SettableFuture();

    /* renamed from: e */
    private C147644h f398572e = new C147644h();

    /* renamed from: f */
    private final C147743y f398573f;

    /* renamed from: g */
    private final C147620aa f398574g;

    /* renamed from: h */
    private final C147634c f398575h;

    /* renamed from: i */
    private final ScheduledExecutorService f398576i;

    /* renamed from: j */
    private final C68209v f398577j;

    /* renamed from: k */
    private final Context f398578k;

    /* renamed from: l */
    private String f398579l;

    /* renamed from: m */
    private final C58881cr f398580m;

    /* renamed from: n */
    private C147637a f398581n;

    public C147689m(C147743y yVar, C147620aa aaVar, C147634c cVar, ScheduledExecutorService scheduledExecutorService, C68209v vVar, Context context) {
        this.f398573f = yVar;
        this.f398574g = aaVar;
        this.f398575h = cVar;
        this.f398576i = scheduledExecutorService;
        this.f398577j = vVar;
        this.f398580m = new C147683g(this);
        this.f398570c = new C147684h(this);
        this.f398578k = context;
    }

    /* renamed from: i */
    private final boolean m240751i() {
        if (!this.f398569b.mo56113h()) {
            return false;
        }
        C60870cx cxVar = (C60870cx) this.f398569b.mo56107c();
        if (!cxVar.isDone()) {
            return false;
        }
        try {
            cxVar.get();
            return true;
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C147631b mo124377a() {
        C58838bb.m90884s(this.f398571d.isDone(), "Uninitialized.");
        try {
            return ((C147638b) C60856cj.m92909r(this.f398571d)).mo124386a();
        } catch (Exception unused) {
            return C147631b.f398465c;
        }
    }

    /* renamed from: b */
    public final C58833ax mo124378b() {
        if (!m240751i()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(this.f398579l);
    }

    /* renamed from: c */
    public final C60870cx mo124379c(int i, int i2) {
        C58838bb.m90884s(m240751i(), "Uninitialized.");
        boolean z = true;
        C58838bb.m90871f(i >= 0 && i < this.f398568a.f184520f.size(), "Bad paragraph index: %s", i);
        if (i2 < 0) {
            z = false;
        }
        C58838bb.m90869d(z, "byteOffset can't be negative.");
        return C60922j.m93045h(this.f398571d, C47810es.m84966f(new C147686j(i, i2)), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo124380d(int i) {
        C58838bb.m90884s(m240751i(), "Uninitialized.");
        boolean z = false;
        if (i >= 0 && i < this.f398568a.f184520f.size()) {
            z = true;
        }
        C58838bb.m90871f(z, "Bad paragraph index: %s", i);
        SettableFuture settableFuture = this.f398571d;
        C147687k kVar = new C147687k(i);
        return C60922j.m93045h(settableFuture, C47810es.m84966f(kVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C68193f mo124381e() {
        C58838bb.m90884s(m240751i(), "Uninitialized.");
        return this.f398568a;
    }

    /* renamed from: f */
    public final C147637a mo124417f() {
        C147620aa aaVar = this.f398574g;
        int a = C147730l.m240804a(aaVar.f398446k);
        return (a != 0 && a == 4) ? new C147655c(this.f398573f) : new C147697u(aaVar, this.f398573f, this.f398579l, this.f398577j, this.f398576i, this.f398575h, this.f398572e);
    }

    /* renamed from: g */
    public final C60870cx mo124418g() {
        C147620aa aaVar = this.f398574g;
        int b = C147724f.m240801b(aaVar.f398445j);
        if (b == 0 || b != 4) {
            return C60856cj.m92900i(new C147701y(aaVar, this.f398576i, this.f398572e, this.f398575h, this.f398573f, this.f398579l, this.f398577j, this.f398568a));
        }
        C147644h hVar = this.f398572e;
        Context context = this.f398578k;
        C68193f fVar = this.f398568a;
        C147743y yVar = this.f398573f;
        C60870cx a = C147653ag.m240729a(context);
        C147670r rVar = new C147670r(fVar, yVar);
        return C60922j.m93044g(C60922j.m93045h(a, C47810es.m84966f(rVar), C60826bg.f164896a), new C147657e(hVar, fVar), C60826bg.f164896a);
    }

    /* renamed from: h */
    public final synchronized C60870cx mo124419h(C147702d dVar) {
        if (this.f398569b.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("Already initialized or initialization in progress."));
        }
        C147620aa aaVar = this.f398574g;
        int a = C147730l.m240804a(aaVar.f398446k);
        if (a != 0) {
            if (a == 4) {
                int b = C147724f.m240801b(aaVar.f398445j);
                if (b != 0) {
                    if (b == 4) {
                        C147628ai aiVar = this.f398573f.f398678a;
                        if (aiVar == null) {
                            aiVar = C147628ai.f398454d;
                        }
                        if (aiVar.f398456a == 2) {
                        }
                    }
                }
                return C60856cj.m92899h(new IllegalArgumentException("On-device metadata mode is allowed only with on-device synthesis and raw text input. Make sure you have set AUDIO_SYNTHESIS_MODE_LOCAL and that the provided input is a raw text."));
            }
        }
        this.f398579l = UUID.randomUUID().toString();
        this.f398572e = new C147644h();
        C147637a f = ((C147683g) this.f398580m).f398561a.mo124417f();
        this.f398581n = f;
        C60870cx a2 = f.mo124385a(dVar);
        this.f398569b = C58833ax.m90834k(a2);
        C60845bz n = C47810es.m84974n(new C147688l(this));
        C60856cj.m92911t(a2, C47810es.m84974n(n), C60826bg.f164896a);
        C147685i iVar = new C147685i(this);
        return C60922j.m93045h(a2, C47810es.m84966f(iVar), C60826bg.f164896a);
    }
}
