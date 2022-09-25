package com.google.android.libraries.search.p3055n.p3087j.p3089b;

import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C67175t;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.j.b.a */
/* compiled from: PG */
public final class C39801a {

    /* renamed from: a */
    private static final C59071e f104661a = C59071e.m91332i("com.google.android.libraries.search.n.j.b.a");

    /* renamed from: b */
    private static final Duration f104662b = Duration.ofMillis(10);

    /* renamed from: c */
    private static final Duration f104663c = Duration.ofNanos(5000000000L);

    /* renamed from: d */
    private static final Duration f104664d = Duration.ofMillis(500);

    /* renamed from: e */
    private final int f104665e;

    /* renamed from: f */
    private final int f104666f;

    /* renamed from: g */
    private final C39802b f104667g;

    /* renamed from: h */
    private final List f104668h = new ArrayList();

    /* renamed from: i */
    private int f104669i = 0;

    /* renamed from: j */
    private final C58872ci f104670j;

    /* renamed from: k */
    private Duration f104671k = Duration.ZERO;

    /* renamed from: l */
    private final C60950i f104672l;

    /* renamed from: m */
    private Optional f104673m = Optional.empty();

    /* renamed from: n */
    private long f104674n = 0;

    /* renamed from: o */
    private boolean f104675o = false;

    public C39801a(C58889cz czVar, C60950i iVar, C67175t tVar, C39802b bVar) {
        this.f104670j = C58872ci.m90947d(czVar);
        this.f104672l = iVar;
        this.f104665e = C19245ah.m36694b(tVar);
        this.f104666f = tVar.f182592c;
        this.f104667g = bVar;
        ((C59052c) ((C59052c) f104661a.mo56224b()).mo56372aa(53867)).mo56386p("Starting to buffer audio.");
    }

    /* renamed from: c */
    private final long m69216c() {
        return (((long) this.f104669i) * 1000000000) / (((long) this.f104665e) * ((long) this.f104666f));
    }

    /* renamed from: d */
    private final void m69217d(C63088z zVar) {
        C58838bb.m90884s(this.f104673m.isPresent(), "Attempting to replay audio without a base timestamp!");
        this.f104667g.mo41779b(zVar, this.f104674n, ((Instant) this.f104673m.get()).plusNanos((this.f104674n * 1000000000) / ((long) this.f104666f)));
        this.f104674n += (long) (zVar.mo59031d() / this.f104665e);
    }

    /* renamed from: e */
    private final void m69218e() {
        if (this.f104673m.isEmpty()) {
            this.f104673m = Optional.m71637of(this.f104672l.mo57444a().minus(Duration.ofNanos(m69216c())));
            ((C59052c) ((C59052c) f104661a.mo56224b()).mo56372aa(53870)).mo56393w("Replaying buffered audio. There were %d chunks and %d bytes", this.f104668h.size(), this.f104669i);
            for (C63088z d : this.f104668h) {
                m69217d(d);
            }
            this.f104668h.clear();
            this.f104669i = 0;
            this.f104671k = Duration.ZERO;
            this.f104670j.mo56160e();
        }
    }

    /* renamed from: a */
    public final void mo42017a(C63088z zVar) {
        C58838bb.m90884s(!this.f104675o, "Cannot push audio if end of audio already received!");
        if (this.f104673m.isEmpty()) {
            this.f104668h.add(zVar);
            this.f104669i += zVar.mo59031d();
            if (this.f104668h.size() == 1) {
                ((C59052c) ((C59052c) f104661a.mo56224b()).mo56372aa(53868)).mo56387q("#pushAudio first buffer: size %d", zVar.mo59031d());
            }
            if (m69216c() >= f104663c.toNanos()) {
                ((C59052c) ((C59052c) f104661a.mo56225c()).mo56372aa(53872)).mo56386p("Too much audio has been buffered! Flushing now.");
            } else {
                Duration ofNanos = Duration.ofNanos(this.f104670j.mo56159b());
                if (ofNanos.compareTo(f104664d) >= 0) {
                    ((C59052c) ((C59052c) f104661a.mo56225c()).mo56372aa(53871)).mo56386p("Buffering has taken too long! Flushing now.");
                } else {
                    boolean isZero = this.f104671k.isZero();
                    Duration minus = ofNanos.minus(this.f104671k);
                    this.f104671k = ofNanos;
                    if (isZero || minus.compareTo(f104662b) < 0) {
                        return;
                    }
                }
            }
            m69218e();
            return;
        }
        m69217d(zVar);
    }

    /* renamed from: b */
    public final void mo42018b() {
        C58838bb.m90884s(!this.f104675o, "Cannot push another end of audio!");
        ((C59052c) ((C59052c) f104661a.mo56224b()).mo56372aa(53869)).mo56386p("#pushEndOfAudio");
        this.f104675o = true;
        m69218e();
        this.f104667g.mo41778a();
    }
}
