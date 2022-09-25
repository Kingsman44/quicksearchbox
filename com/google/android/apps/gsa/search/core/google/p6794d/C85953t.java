package com.google.android.apps.gsa.search.core.google.p6794d;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84548h;
import com.google.android.apps.gsa.search.core.p6513aj.C84551k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89051g;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.apps.gsa.search.core.google.d.t */
/* compiled from: PG */
public final class C85953t implements C85934a, C22868d {

    /* renamed from: a */
    private final C89068x f232448a;

    /* renamed from: b */
    private final C85947n f232449b;

    /* renamed from: c */
    private final C85940g f232450c;

    /* renamed from: d */
    private final C22871g f232451d;

    /* renamed from: e */
    private final String f232452e;

    /* renamed from: f */
    private final C84551k f232453f;

    /* renamed from: g */
    private final AtomicInteger f232454g = new AtomicInteger();

    /* renamed from: h */
    private final int f232455h;

    /* renamed from: i */
    private int f232456i;

    public C85953t(C89068x xVar, C85947n nVar, int i, C22871g gVar, String str, C84551k kVar) {
        this.f232448a = xVar;
        this.f232449b = nVar;
        this.f232450c = new C85940g(xVar);
        this.f232455h = i;
        this.f232451d = gVar;
        this.f232452e = str;
        this.f232453f = kVar;
    }

    /* renamed from: c */
    public final C60870cx mo79586c() {
        this.f232449b.mo79603m(Collections.emptyList());
        this.f232449b.mo79599i();
        this.f232449b.mo79596e(this.f232452e);
        this.f232451d.mo28211k(this.f232448a.mo27472b(), "RawChunkAdapter first chunk", this);
        return this.f232450c;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        this.f232453f.mo78274d();
        this.f232450c.mo57357o(th);
        this.f232449b.mo79594b(th);
    }

    /* renamed from: d */
    public final void mo17702gm(C89051g gVar) {
        try {
            int i = gVar.f241330b;
            if (i == 3) {
                int i2 = this.f232456i;
                if (i2 > this.f232455h) {
                    throw new C90457d(C89885b.GWS_RESPONSE_SIZE_EXCEEDED_VALUE);
                } else if (i2 != 0) {
                    this.f232453f.mo78274d();
                    this.f232450c.mo57356n(C118826c.f331422a);
                    this.f232449b.mo79594b((Throwable) null);
                } else {
                    throw new C90457d(C89885b.GWS_RESPONSE_EMPTY_VALUE);
                }
            } else if (i == 2) {
                mo17701gl(gVar.mo83023d());
            } else {
                int a = gVar.mo83020a();
                this.f232449b.mo79601k(a);
                this.f232456i += a;
                ByteBuffer allocate = ByteBuffer.allocate(a);
                gVar.mo83022c(allocate);
                gVar.mo83024e();
                this.f232453f.mo78273c(new C84548h(allocate.array(), a, this.f232454g.getAndIncrement()));
                this.f232451d.mo28211k(this.f232448a.mo27472b(), "RawChunkAdapter first chunk", this);
            }
        } catch (C90457d e) {
            mo17701gl(e);
        } catch (Error | RuntimeException e2) {
            mo17701gl(e2);
            throw e2;
        }
    }
}
