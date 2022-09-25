package com.google.p4449cd.p4460h.p4461a;

import com.google.android.apps.gsa.shared.p7012bb.p7013a.C89346b;
import com.google.android.apps.gsa.shared.p7012bb.p7015c.C89359a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7159c.C90927bx;
import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4451b.C57938a;
import com.google.p4449cd.p4453d.C57957c;
import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4453d.C57960f;
import com.google.p4449cd.p4454e.C57969i;
import com.google.p4449cd.p4460h.C58003a;
import dagger.p5295b.C68283d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.cd.h.a.t */
/* compiled from: PG */
final class C58033t implements C58003a {

    /* renamed from: a */
    private final C57960f f155146a;

    /* renamed from: b */
    private final C57938a f155147b;

    /* renamed from: c */
    private final C57969i f155148c;

    /* renamed from: d */
    private final long f155149d;

    /* renamed from: e */
    private final C89346b f155150e;

    public C58033t(C89346b bVar, C57960f fVar, C57938a aVar, C57969i iVar, long j) {
        this.f155150e = bVar;
        this.f155146a = fVar;
        this.f155147b = aVar;
        this.f155148c = iVar;
        this.f155149d = j;
    }

    /* renamed from: a */
    public final C60870cx mo54593a(C68283d dVar, long j, TimeUnit timeUnit) {
        C60870cx gq = dVar.mo60297gq();
        C57958d a = C58013ai.m88768a(C58032s.class, C57957c.f154998d, this.f155147b, this.f155149d);
        C58018e c = C58018e.m88773c(new C58027n(a, this.f155148c, new C58032s(gq)), this.f155146a, false);
        if (this.f155146a.mo54569d(c)) {
            try {
                this.f155148c.mo54575e(a);
                C89346b bVar = this.f155150e;
                C89359a aVar = bVar.f242263a;
                C90476a aVar2 = bVar.f242265c;
                bVar.f242264b.mo85114b(new C90927bx(aVar, a), c, timeUnit.toMillis(j));
            } catch (Throwable th) {
                this.f155146a.mo54568c(c);
                C58887cx.m90980g(th);
                throw new RuntimeException(th);
            }
        } else {
            c.cancel(c.f155108a);
        }
        gq.mo4106b(new C58031r(c), C60826bg.f164896a);
        return gq;
    }
}
