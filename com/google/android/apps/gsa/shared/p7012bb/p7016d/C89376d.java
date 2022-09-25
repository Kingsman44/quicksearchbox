package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7012bb.p7017e.C89400a;
import com.google.common.p4552o.C59988il;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.d */
/* compiled from: PG */
final class C89376d extends C89382j {

    /* renamed from: a */
    private final C89387o f242318a;

    /* renamed from: b */
    private final C89384l f242319b;

    /* renamed from: c */
    private final Random f242320c;

    /* renamed from: d */
    private final Object f242321d = new Object();

    /* renamed from: e */
    private boolean f242322e = false;

    public C89376d(C89387o oVar, C89384l lVar) {
        Random random = new Random();
        this.f242318a = oVar;
        this.f242319b = lVar;
        this.f242320c = random;
    }

    /* renamed from: a */
    public final void mo54557a(long j) {
        synchronized (this.f242321d) {
            if (!this.f242322e) {
                mo83312b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo83312b() {
        int i;
        C89389q a = this.f242318a.mo83319a();
        C89383k g = this.f242319b.mo83318g();
        if (((C89375c) a).f242316b) {
            int b = g.mo83317b();
            C89386n nVar = this.f242318a.f242362b;
            int nextInt = this.f242320c.nextInt(1000);
            i = 983;
            if (b != 2 ? !(b == 2 || nextInt < nVar.f242359a) : nextInt >= nVar.f242360b) {
                this.f242322e = true;
                return;
            }
        } else {
            i = 880;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a = 2 | ufVar.f164093a;
        ufVar.f164258m = i;
        C59988il a2 = C89400a.m145410a(g, this.f242318a.mo83319a());
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        a2.getClass();
        ufVar2.f164191bs = a2;
        ufVar2.f164252g |= 67108864;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        this.f242322e = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo83299c() {
        synchronized (this.f242321d) {
            if (!this.f242322e) {
                mo83312b();
            }
        }
    }
}
