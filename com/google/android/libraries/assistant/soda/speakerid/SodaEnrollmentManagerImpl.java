package com.google.android.libraries.assistant.soda.speakerid;

import android.content.Context;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.speech.p5218j.C66781av;
import com.google.speech.p5218j.C66782aw;
import com.google.speech.p5218j.C66825bc;
import com.google.speech.p5218j.C66827be;
import com.google.speech.p5218j.C66828bf;
import com.google.speech.p5218j.C66829bg;
import com.google.speech.p5218j.C66999hh;
import com.google.speech.p5218j.C67118ls;
import com.google.speech.p5218j.C67119lt;
import com.google.speech.p5218j.C67131me;
import com.google.speech.p5218j.C67135mi;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
public final class SodaEnrollmentManagerImpl implements C19362a {

    /* renamed from: a */
    public static final C59071e f54184a = C59071e.m91332i("com.google.android.libraries.assistant.soda.speakerid.SodaEnrollmentManagerImpl");

    /* renamed from: b */
    public final C58833ax f54185b;

    /* renamed from: c */
    public final Map f54186c = new ConcurrentHashMap();

    /* renamed from: d */
    public final AtomicBoolean f54187d = new AtomicBoolean(false);

    /* renamed from: e */
    public final Context f54188e;

    /* renamed from: f */
    public final SodaTransportFactory f54189f;

    /* renamed from: g */
    public final Object f54190g = new Object();

    /* renamed from: h */
    public long f54191h;

    /* renamed from: i */
    public C67131me f54192i = C67131me.f182477b;

    /* renamed from: j */
    private final AtomicInteger f54193j = new AtomicInteger(0);

    /* renamed from: k */
    private final ScheduledExecutorService f54194k;

    /* renamed from: l */
    private final Executor f54195l;

    /* renamed from: m */
    private final C60887da f54196m;

    public SodaEnrollmentManagerImpl(Context context, SodaTransportFactory sodaTransportFactory, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, C60887da daVar, C58833ax axVar) {
        C67135mi miVar = C67135mi.f182484c;
        this.f54188e = context;
        this.f54189f = sodaTransportFactory;
        this.f54194k = scheduledExecutorService;
        this.f54195l = new C60904dr(executorService);
        this.f54196m = daVar;
        this.f54185b = axVar;
    }

    /* renamed from: i */
    private final void m36879i() {
        if (this.f54191h == 0) {
            throw new IllegalStateException("Native object does not exist.");
        }
    }

    private native void nativeDelete(long j);

    private native byte[] nativeGetSpeakerInfo(long j);

    private native void nativeProcessRequest(long j, byte[] bArr);

    /* renamed from: a */
    public final C60870cx mo24500a() {
        m36879i();
        try {
            return C60856cj.m92900i((C67119lt) ((C67118ls) ((C67118ls) C67119lt.f182458b.createBuilder()).mergeFrom(nativeGetSpeakerInfo(this.f54191h), C62921ba.m95368a())).build());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f54184a.mo56226d()).mo56382g(e)).mo56372aa(47790)).mo56386p("Unable to parse EnrollmentInfo.");
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: b */
    public final C60870cx mo24501b(C66999hh hhVar) {
        C60870cx b = this.f54196m.mo19399b(C47810es.m84978r(new C19380g(this)));
        C19381h hVar = new C19381h(this, hhVar);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(hVar), this.f54195l);
        C19382i iVar = C19382i.f54225a;
        return C60922j.m93044g(h, C47810es.m84963c(iVar), this.f54195l);
    }

    /* renamed from: c */
    public final C60870cx mo24502c(C66825bc bcVar) {
        if (!this.f54187d.get()) {
            return C60856cj.m92899h(new IllegalStateException("EnrollmentManager must be configured first. Was init called?"));
        }
        C66828bf bfVar = (C66828bf) C66829bg.f181726e.createBuilder();
        C66782aw h = mo24508h();
        bfVar.copyOnWrite();
        C66829bg bgVar = (C66829bg) bfVar.instance;
        h.getClass();
        bgVar.f181731d = h;
        bgVar.f181728a |= 1;
        bfVar.copyOnWrite();
        C66829bg bgVar2 = (C66829bg) bfVar.instance;
        bcVar.getClass();
        bgVar2.f181730c = bcVar;
        bgVar2.f181729b = 2;
        return C60922j.m93044g(mo24507g((C66829bg) bfVar.build()), C47810es.m84963c(C19378e.f54220a), this.f54195l);
    }

    /* renamed from: d */
    public final C60870cx mo24503d(C66827be beVar) {
        if (!this.f54187d.get()) {
            return C60856cj.m92899h(new IllegalStateException("EnrollmentManager must be configured first. Was init called?"));
        }
        C66828bf bfVar = (C66828bf) C66829bg.f181726e.createBuilder();
        C66782aw h = mo24508h();
        bfVar.copyOnWrite();
        C66829bg bgVar = (C66829bg) bfVar.instance;
        h.getClass();
        bgVar.f181731d = h;
        bgVar.f181728a |= 1;
        bfVar.copyOnWrite();
        C66829bg bgVar2 = (C66829bg) bfVar.instance;
        beVar.getClass();
        bgVar2.f181730c = beVar;
        bgVar2.f181729b = 3;
        return C60922j.m93044g(mo24507g((C66829bg) bfVar.build()), C47810es.m84963c(C19379f.f54221a), this.f54195l);
    }

    /* renamed from: e */
    public final C67131me mo24504e() {
        C67131me meVar;
        synchronized (this.f54190g) {
            meVar = this.f54192i;
        }
        return meVar;
    }

    /* renamed from: f */
    public final boolean mo24505f() {
        return this.f54187d.get();
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        this.f54187d.set(false);
        long j = this.f54191h;
        if (j != 0) {
            nativeDelete(j);
            this.f54191h = 0;
        }
    }

    /* renamed from: g */
    public final C60870cx mo24507g(C66829bg bgVar) {
        m36879i();
        C66782aw awVar = bgVar.f181731d;
        if (awVar == null) {
            awVar = C66782aw.f181618c;
        }
        String str = awVar.f181621b;
        C60870cx q = C60856cj.m92908q(C2169h.m6027a(new C19375b(this, str)), 30, TimeUnit.SECONDS, this.f54194k);
        q.mo4106b(C47810es.m84977q(new C19376c(this, str)), C60826bg.f164896a);
        nativeProcessRequest(this.f54191h, bgVar.toByteArray());
        return q;
    }

    /* renamed from: h */
    public final C66782aw mo24508h() {
        C66781av avVar = (C66781av) C66782aw.f181618c.createBuilder();
        String valueOf = String.valueOf(this.f54193j.incrementAndGet());
        avVar.copyOnWrite();
        C66782aw awVar = (C66782aw) avVar.instance;
        valueOf.getClass();
        awVar.f181620a |= 1;
        awVar.f181621b = valueOf;
        return (C66782aw) avVar.build();
    }

    /* access modifiers changed from: package-private */
    public void handleVoiceMatchManagementUpdate(byte[] bArr) {
        C19377d dVar = new C19377d(this, bArr);
        C60856cj.m92903l(C47810es.m84977q(dVar), this.f54195l);
    }

    public native long nativeConstruct(SodaTransportFactory sodaTransportFactory);
}
