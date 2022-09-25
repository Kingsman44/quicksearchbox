package com.google.android.apps.gsa.p8889z.p8893c.p8901h;

import android.content.Context;
import com.google.android.apps.gsa.p8889z.p8893c.p8896c.C118872a;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.android.libraries.p590as.p591a.C10772f;
import com.google.android.libraries.p590as.p591a.C10778l;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.p2951n.C37899a;
import com.google.android.libraries.search.p2904c.p2951n.C37901c;
import com.google.common.base.C58833ax;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.protobuf.C63088z;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.z.c.h.f */
/* compiled from: PG */
public final class C118923f implements C57981b {

    /* renamed from: a */
    public final Object f331663a = new Object();

    /* renamed from: b */
    private final C118872a f331664b;

    /* renamed from: c */
    private final C37360ay f331665c;

    /* renamed from: d */
    private final C67451at f331666d;

    /* renamed from: e */
    private final C67451at f331667e;

    /* renamed from: f */
    private final Context f331668f;

    /* renamed from: g */
    private final C86124t f331669g;

    /* renamed from: h */
    private final byte[] f331670h;

    /* renamed from: i */
    private final C60887da f331671i;

    /* renamed from: j */
    private InputStream f331672j;

    /* renamed from: k */
    private InputStream f331673k;

    /* renamed from: l */
    private C118922e f331674l;

    /* renamed from: m */
    private C60870cx f331675m;

    /* renamed from: n */
    private boolean f331676n = false;

    public C118923f(C118872a aVar, C37360ay ayVar, C67451at atVar, C67451at atVar2, byte[] bArr, C60887da daVar, Context context, C86124t tVar) {
        this.f331664b = aVar;
        this.f331665c = ayVar;
        this.f331666d = atVar;
        this.f331667e = atVar2;
        this.f331670h = bArr;
        this.f331671i = daVar;
        this.f331668f = context;
        this.f331669g = tVar;
    }

    /* renamed from: c */
    public final void mo104069c(boolean z, Throwable th) {
        synchronized (this.f331663a) {
            this.f331676n = true;
            InputStream inputStream = this.f331673k;
            InputStream inputStream2 = this.f331672j;
            C59337t.m92221a(inputStream);
            C59337t.m92221a(inputStream2);
            C118922e eVar = this.f331674l;
            if (eVar != null) {
                if (th != null) {
                    eVar.mo54585e(th);
                } else {
                    eVar.mo54584d(z);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo104070d(InputStream inputStream, byte[] bArr, boolean z) {
        while (true) {
            try {
                int a = C59332o.m92210a(inputStream, bArr, 0, bArr.length);
                if (a > 0) {
                    synchronized (this.f331663a) {
                        C118922e eVar = this.f331674l;
                        if (eVar == null) {
                            break;
                        } else if (!eVar.f155044c.get()) {
                            break;
                        } else if (z) {
                            this.f331674l.mo54583c(C118919a.m197406d(bArr, a));
                        } else {
                            this.f331674l.mo54583c(C118919a.m197404b(bArr, a));
                        }
                    }
                } else {
                    return;
                }
            } catch (C37899a e) {
                throw new C90457d((Throwable) e, (int) C89885b.f246261xed3ed789);
            } catch (C37901c e2) {
                throw new C90457d((Throwable) e2, (int) C89885b.f246259xb3cb106e);
            } catch (IOException e3) {
                throw new C90457d((Throwable) e3, (int) C89885b.AUDIO_DATA_FAILED_READ_LIBRARY_AUDIO_STREAM_SOURCE_VALUE);
            } catch (C90457d e4) {
                mo104069c(false, e4);
                return;
            }
        }
        mo104069c(true, (Throwable) null);
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C118922e eVar = new C118922e(this, aVar);
        aVar.mo20338d(eVar);
        synchronized (this.f331663a) {
            if (this.f331676n) {
                eVar.mo21018g();
                C57979e eVar2 = eVar.f155043b;
                return eVar2;
            } else if (this.f331674l != null) {
                eVar.mo54585e(new UnsupportedOperationException("AudioStreamSource is an one shot source."));
                C57979e eVar3 = eVar.f155043b;
                return eVar3;
            } else {
                this.f331674l = eVar;
                try {
                    InputStream a = this.f331664b.mo91302a();
                    int bitCount = Integer.bitCount(this.f331665c.f99229d);
                    C10772f fVar = new C10772f();
                    fVar.mo19257g(this.f331666d);
                    fVar.f35766b = C58833ax.m90834k(Integer.valueOf(this.f331665c.f99228c));
                    fVar.f35767c = C58833ax.m90834k(Integer.valueOf(bitCount));
                    if (this.f331666d == C67451at.OGG_OPUS) {
                        C10778l.m25802a(this.f331668f);
                        fVar.f35765a = C58833ax.m90834k(Integer.valueOf((int) C10771e.m25765b(this.f331669g.mo79743a(C90082eg.f250029cm), bitCount)));
                    }
                    this.f331673k = C10771e.m25768e(a, fVar.mo19268j());
                    byte[] h = C10771e.m25771h(this.f331666d);
                    InputStream inputStream = this.f331673k;
                    if (this.f331670h != null) {
                        if (this.f331667e == C67451at.OGG_OPUS) {
                            C10778l.m25802a(this.f331668f);
                        }
                        byte[] bArr = this.f331670h;
                        bArr.getClass();
                        InputStream m = C63088z.m96139A(bArr).mo59041m();
                        C10772f fVar2 = new C10772f();
                        fVar2.mo19257g(this.f331667e);
                        fVar2.f35766b = C58833ax.m90834k(Integer.valueOf(this.f331665c.f99228c));
                        fVar2.f35767c = C58833ax.m90834k(Integer.valueOf(Integer.bitCount(this.f331665c.f99229d)));
                        fVar2.f35765a = C58833ax.m90834k(24000);
                        this.f331672j = C10771e.m25768e(m, fVar2.mo19268j());
                        byte[] h2 = C10771e.m25771h(this.f331667e);
                        this.f331675m = this.f331671i.mo19399b(new C118918b(this, this.f331672j, h2, inputStream, h));
                    } else {
                        this.f331675m = this.f331671i.mo19399b(new C118920c(this, inputStream, h));
                    }
                    C60856cj.m92911t(this.f331675m, new C118921d(this), this.f331671i);
                } catch (IOException e) {
                    mo104069c(false, e);
                }
            }
        }
        return eVar.f155043b;
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        synchronized (this.f331663a) {
            this.f331676n = true;
            C60870cx cxVar = this.f331675m;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            C118922e eVar = this.f331674l;
            if (eVar != null && eVar.f155044c.get()) {
                this.f331674l.mo21018g();
            }
        }
    }
}
