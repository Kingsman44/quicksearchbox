package com.google.android.apps.gsa.p8889z.p8893c.p8901h;

import android.content.Context;
import com.google.android.apps.gsa.p8889z.p8893c.p8896c.C118872a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8082b.C103493b;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c.C103563y;
import com.google.android.libraries.p590as.p591a.C10771e;
import com.google.android.libraries.p590as.p591a.C10772f;
import com.google.android.libraries.p590as.p591a.C10778l;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.common.base.C58833ax;
import com.google.common.p4541l.C59337t;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.recognizer.p5233a.C67451at;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.apps.gsa.z.c.h.j */
/* compiled from: PG */
public final class C118927j implements C57981b {

    /* renamed from: a */
    public final Object f331683a = new Object();

    /* renamed from: b */
    public C118926i f331684b;

    /* renamed from: c */
    private final C37360ay f331685c;

    /* renamed from: d */
    private final C67451at f331686d;

    /* renamed from: e */
    private final C118872a f331687e;

    /* renamed from: f */
    private final C60887da f331688f;

    /* renamed from: g */
    private final Context f331689g;

    /* renamed from: h */
    private final C86124t f331690h;

    /* renamed from: i */
    private InputStream f331691i;

    /* renamed from: j */
    private C60870cx f331692j;

    /* renamed from: k */
    private boolean f331693k = false;

    public C118927j(C37360ay ayVar, C67451at atVar, C118872a aVar, C60887da daVar, Context context, C86124t tVar) {
        this.f331685c = ayVar;
        this.f331686d = atVar;
        this.f331687e = aVar;
        this.f331688f = daVar;
        this.f331689g = context;
        this.f331690h = tVar;
    }

    /* renamed from: c */
    public final void mo104072c(boolean z, Throwable th) {
        synchronized (this.f331683a) {
            this.f331693k = true;
            C59337t.m92221a(this.f331691i);
            C118926i iVar = this.f331684b;
            if (iVar != null) {
                if (th != null) {
                    iVar.mo54585e(th);
                } else {
                    iVar.mo54584d(z);
                }
            }
        }
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C118926i iVar = new C118926i(this, aVar);
        aVar.mo20338d(iVar);
        synchronized (this.f331683a) {
            if (this.f331693k) {
                iVar.mo21018g();
                C57979e eVar = iVar.f155043b;
                return eVar;
            } else if (this.f331684b != null) {
                iVar.mo54585e(new UnsupportedOperationException("AudioStreamSource is an one shot source."));
                C57979e eVar2 = iVar.f155043b;
                return eVar2;
            } else {
                this.f331684b = iVar;
                try {
                    C103493b bVar = ((C103563y) this.f331687e).f288528a.f288523b;
                    int bitCount = Integer.bitCount(this.f331685c.f99229d);
                    C10772f fVar = new C10772f();
                    fVar.mo19257g(this.f331686d);
                    fVar.f35766b = C58833ax.m90834k(Integer.valueOf(this.f331685c.f99228c));
                    fVar.f35767c = C58833ax.m90834k(Integer.valueOf(bitCount));
                    if (this.f331686d == C67451at.OGG_OPUS) {
                        C10778l.m25802a(this.f331689g);
                        fVar.f35765a = C58833ax.m90834k(Integer.valueOf((int) C10771e.m25765b(this.f331690h.mo79743a(C90082eg.f250029cm), bitCount)));
                    }
                    this.f331691i = C10771e.m25768e(bVar, fVar.mo19268j());
                    byte[] h = C10771e.m25771h(this.f331686d);
                    C60870cx b = this.f331688f.mo19399b(new C118924g(this, this.f331691i, h));
                    this.f331692j = b;
                    C60856cj.m92911t(b, new C118925h(this), this.f331688f);
                } catch (IOException e) {
                    mo104072c(false, e);
                }
            }
        }
        return iVar.f155043b;
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        synchronized (this.f331683a) {
            this.f331693k = true;
            C60870cx cxVar = this.f331692j;
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            C118926i iVar = this.f331684b;
            if (iVar != null && iVar.f155044c.get()) {
                this.f331684b.mo21018g();
            }
        }
    }
}
