package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77822b;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77826c;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.assistant.soda.s3client.SodaTransportFactory;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.p5218j.p5219a.C66722az;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.v */
/* compiled from: PG */
public final class C77817v {

    /* renamed from: a */
    public static final C58974d f214357a = C58974d.m91136j();

    /* renamed from: b */
    public final C91142g f214358b;

    /* renamed from: c */
    public final C68214a f214359c;

    /* renamed from: d */
    public final C81459h f214360d;

    /* renamed from: e */
    public final C77782bi f214361e;

    /* renamed from: f */
    public final C77826c f214362f;

    /* renamed from: g */
    public final SodaTransportFactory f214363g;

    /* renamed from: h */
    public final Optional f214364h;

    /* renamed from: i */
    public final C77763aq f214365i;

    /* renamed from: j */
    public final AtomicReference f214366j = new AtomicReference();

    /* renamed from: k */
    public final ReadWriteLock f214367k = new ReentrantReadWriteLock();

    /* renamed from: l */
    public final C68214a f214368l;

    /* renamed from: m */
    public Soda f214369m;

    /* renamed from: n */
    private final C77822b f214370n;

    public C77817v(C77763aq aqVar, C91142g gVar, C68214a aVar, C22871g gVar2, C81465n nVar, C77782bi biVar, SodaTransportFactory sodaTransportFactory, Optional optional, C77826c cVar, C68214a aVar2, C77822b bVar) {
        this.f214365i = aqVar;
        this.f214368l = aVar2;
        this.f214370n = bVar;
        this.f214360d = nVar.mo75095b(gVar2, C77813r.f214355a);
        this.f214358b = gVar;
        this.f214359c = aVar;
        this.f214361e = biVar;
        this.f214363g = sodaTransportFactory;
        this.f214364h = optional;
        this.f214362f = cVar;
    }

    /* renamed from: a */
    public final Soda mo72833a() {
        Soda soda = this.f214369m;
        if (soda != null) {
            return soda;
        }
        throw new C77816u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo72834b(C66722az azVar) {
        Lock readLock = this.f214367k.readLock();
        readLock.lock();
        try {
            mo72833a().mo24351r(azVar);
            this.f214370n.mo72830b(azVar);
        } finally {
            readLock.unlock();
        }
    }
}
