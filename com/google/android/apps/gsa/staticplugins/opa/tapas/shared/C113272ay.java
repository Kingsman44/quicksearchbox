package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112560o;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3781ad.p3789d.p3791b.C48740v;
import com.google.assistant.p3858ar.p3859a.C49714d;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56339j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ay */
/* compiled from: PG */
final class C113272ay extends C113404eo {

    /* renamed from: a */
    public String f313659a;

    /* renamed from: b */
    public String f313660b;

    /* renamed from: c */
    public C60870cx f313661c;

    /* renamed from: d */
    public C112560o f313662d;

    /* renamed from: e */
    private long f313663e;

    /* renamed from: f */
    private C19167ba f313664f;

    /* renamed from: g */
    private Optional f313665g = Optional.empty();

    /* renamed from: h */
    private long f313666h;

    /* renamed from: i */
    private long f313667i;

    /* renamed from: j */
    private C56339j f313668j;

    /* renamed from: k */
    private C51331dt f313669k;

    /* renamed from: l */
    private C48674ai f313670l;

    /* renamed from: m */
    private Optional f313671m = Optional.empty();

    /* renamed from: n */
    private Optional f313672n = Optional.empty();

    /* renamed from: o */
    private Optional f313673o = Optional.empty();

    /* renamed from: p */
    private Optional f313674p = Optional.empty();

    /* renamed from: q */
    private byte f313675q;

    public C113272ay() {
    }

    /* renamed from: a */
    public final C113405ep mo100001a() {
        if (this.f313675q != 7 || this.f313659a == null || this.f313664f == null || this.f313660b == null || this.f313661c == null || this.f313668j == null || this.f313669k == null || this.f313670l == null || this.f313662d == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f313675q & 1) == 0) {
                sb.append(" requestId");
            }
            if (this.f313659a == null) {
                sb.append(" prefix");
            }
            if (this.f313664f == null) {
                sb.append(" configFlags");
            }
            if ((this.f313675q & 2) == 0) {
                sb.append(" timestampMsec");
            }
            if ((this.f313675q & 4) == 0) {
                sb.append(" timestampMsecSinceEpoch");
            }
            if (this.f313660b == null) {
                sb.append(" shortcutPackage");
            }
            if (this.f313661c == null) {
                sb.append(" reflectionEventPullFuture");
            }
            if (this.f313668j == null) {
                sb.append(" ctrStat");
            }
            if (this.f313669k == null) {
                sb.append(" triggerTrustLevel");
            }
            if (this.f313670l == null) {
                sb.append(" surfaceType");
            }
            if (this.f313662d == null) {
                sb.append(" cache");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C113273az azVar = r2;
        C113273az azVar2 = new C113273az(this.f313663e, this.f313659a, this.f313664f, this.f313665g, this.f313666h, this.f313667i, this.f313660b, this.f313661c, this.f313668j, this.f313669k, this.f313670l, this.f313671m, this.f313672n, this.f313673o, this.f313674p, this.f313662d);
        return azVar;
    }

    /* renamed from: b */
    public final void mo100002b(C19167ba baVar) {
        if (baVar != null) {
            this.f313664f = baVar;
            return;
        }
        throw new NullPointerException("Null configFlags");
    }

    /* renamed from: c */
    public final void mo100003c(C56339j jVar) {
        if (jVar != null) {
            this.f313668j = jVar;
            return;
        }
        throw new NullPointerException("Null ctrStat");
    }

    /* renamed from: d */
    public final void mo100004d(C113408es esVar) {
        this.f313665g = Optional.m71637of(esVar);
    }

    /* renamed from: e */
    public final void mo100005e(C49714d dVar) {
        this.f313673o = Optional.m71637of(dVar);
    }

    /* renamed from: f */
    public final void mo100006f(long j) {
        this.f313671m = Optional.m71637of(Long.valueOf(j));
    }

    /* renamed from: g */
    public final void mo100007g(C48740v vVar) {
        this.f313674p = Optional.m71637of(vVar);
    }

    /* renamed from: h */
    public final void mo100008h(String str) {
        if (str != null) {
            this.f313659a = str;
            return;
        }
        throw new NullPointerException("Null prefix");
    }

    /* renamed from: i */
    public final void mo100009i(Optional optional) {
        if (optional != null) {
            this.f313672n = optional;
            return;
        }
        throw new NullPointerException("Null previousQuery");
    }

    /* renamed from: j */
    public final void mo100010j(C60870cx cxVar) {
        if (cxVar != null) {
            this.f313661c = cxVar;
            return;
        }
        throw new NullPointerException("Null reflectionEventPullFuture");
    }

    /* renamed from: k */
    public final void mo100011k(long j) {
        this.f313663e = j;
        this.f313675q = (byte) (this.f313675q | 1);
    }

    /* renamed from: l */
    public final void mo100012l(C48674ai aiVar) {
        if (aiVar != null) {
            this.f313670l = aiVar;
            return;
        }
        throw new NullPointerException("Null surfaceType");
    }

    /* renamed from: m */
    public final void mo100013m(long j) {
        this.f313666h = j;
        this.f313675q = (byte) (this.f313675q | 2);
    }

    /* renamed from: n */
    public final void mo100014n(long j) {
        this.f313667i = j;
        this.f313675q = (byte) (this.f313675q | 4);
    }

    /* renamed from: o */
    public final void mo100015o(C51331dt dtVar) {
        if (dtVar != null) {
            this.f313669k = dtVar;
            return;
        }
        throw new NullPointerException("Null triggerTrustLevel");
    }

    public C113272ay(C113405ep epVar) {
        C113273az azVar = (C113273az) epVar;
        this.f313663e = azVar.f313676a;
        this.f313659a = azVar.f313677b;
        this.f313664f = azVar.f313678c;
        this.f313665g = azVar.f313679d;
        this.f313666h = azVar.f313680e;
        this.f313667i = azVar.f313681f;
        this.f313660b = azVar.f313682g;
        this.f313661c = azVar.f313683h;
        this.f313668j = azVar.f313684i;
        this.f313669k = azVar.f313685j;
        this.f313670l = azVar.f313686k;
        this.f313671m = azVar.f313687l;
        this.f313672n = azVar.f313688m;
        this.f313673o = azVar.f313689n;
        this.f313674p = azVar.f313690o;
        this.f313662d = azVar.f313691p;
        this.f313675q = 7;
    }
}
