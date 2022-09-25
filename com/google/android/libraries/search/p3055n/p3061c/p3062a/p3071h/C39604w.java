package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.search.p3055n.p3087j.p3089b.C39802b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4580v.C60945d;
import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.n.c.a.h.w */
/* compiled from: PG */
final class C39604w implements C39802b {

    /* renamed from: a */
    final /* synthetic */ C39605x f104251a;

    /* renamed from: b */
    private final C2164c f104252b;

    /* renamed from: c */
    private boolean f104253c = false;

    public C39604w(C39605x xVar, C2164c cVar) {
        this.f104251a = xVar;
        this.f104252b = cVar;
    }

    /* renamed from: a */
    public final void mo41778a() {
        ((C59052c) ((C59052c) C39605x.f104254a.mo56224b()).mo56372aa(53705)).mo56386p("Got end of audio, but ignoring it since HDM pushes that on its own.");
    }

    /* renamed from: b */
    public final void mo41779b(C63088z zVar, long j, Instant instant) {
        if (!this.f104253c) {
            ((C59052c) ((C59052c) C39605x.f104254a.mo56224b()).mo56372aa(53707)).mo56359L("#onTimestampedAudio size %d, pos %d, time %s", Integer.valueOf(zVar.mo59031d()), Long.valueOf(j), instant);
        }
        this.f104253c = true;
        int d = zVar.mo59031d();
        try {
            ByteBuffer a = this.f104251a.f104270q.mo24395a(d);
            a.put(zVar.mo59174N(), 0, d);
            ByteBuffer a2 = this.f104251a.f104271r.mo24395a(16);
            a2.putLong(Long.reverseBytes(j));
            a2.putLong(Long.reverseBytes(C60945d.m93096a(instant)));
            this.f104251a.f104256c.mo24337i(a, d, a2, a2.capacity());
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C39605x.f104254a.mo56225c()).mo56382g(e)).mo56372aa(53706)).mo56386p("Pushing audio to Soda failed!");
            this.f104252b.mo5439d(e);
        }
    }
}
