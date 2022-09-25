package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.b.c.j;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.m */
/* compiled from: PG */
public final class C77830m extends C77555ah {

    /* renamed from: a */
    public C58485gu f214382a;

    /* renamed from: b */
    public Optional f214383b = Optional.empty();

    /* renamed from: c */
    public C77556ai f214384c;

    /* renamed from: d */
    public j f214385d;

    /* renamed from: e */
    public Optional f214386e = Optional.empty();

    /* renamed from: f */
    public Optional f214387f = Optional.empty();

    /* renamed from: g */
    public Optional f214388g = Optional.empty();

    /* renamed from: h */
    public Optional f214389h = Optional.empty();

    /* renamed from: i */
    private Instant f214390i;

    /* renamed from: j */
    private Optional f214391j = Optional.empty();

    /* renamed from: k */
    private Optional f214392k = Optional.empty();

    /* renamed from: l */
    private boolean f214393l;

    /* renamed from: m */
    private Optional f214394m = Optional.empty();

    /* renamed from: n */
    private Optional f214395n = Optional.empty();

    /* renamed from: o */
    private C77889u f214396o;

    /* renamed from: p */
    private C77563ap f214397p;

    /* renamed from: q */
    private Optional f214398q = Optional.empty();

    /* renamed from: r */
    private Optional f214399r = Optional.empty();

    /* renamed from: s */
    private Optional f214400s = Optional.empty();

    /* renamed from: t */
    private byte f214401t;

    public C77830m() {
    }

    /* renamed from: a */
    public final C77557aj mo72623a() {
        Instant instant;
        C58485gu guVar;
        C77556ai aiVar;
        j jVar;
        C77889u uVar;
        C77563ap apVar;
        if (this.f214401t != 3 || (instant = this.f214390i) == null || (guVar = this.f214382a) == null || (aiVar = this.f214384c) == null || (jVar = this.f214385d) == null || (uVar = this.f214396o) == null || (apVar = this.f214397p) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f214390i == null) {
                sb.append(" instant");
            }
            if (this.f214382a == null) {
                sb.append(" hypotheses");
            }
            if ((this.f214401t & 1) == 0) {
                sb.append(" initial");
            }
            if ((this.f214401t & 2) == 0) {
                sb.append(" userEndpointingInitiated");
            }
            if (this.f214384c == null) {
                sb.append(" eventType");
            }
            if (this.f214385d == null) {
                sb.append(" candidateIdentifier");
            }
            if (this.f214396o == null) {
                sb.append(" engine");
            }
            if (this.f214397p == null) {
                sb.append(" speakerInfo");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C77866n nVar = r3;
        C77866n nVar2 = new C77866n(instant, this.f214391j, this.f214392k, guVar, this.f214383b, this.f214393l, aiVar, this.f214394m, this.f214395n, jVar, this.f214386e, uVar, this.f214387f, apVar, this.f214398q, this.f214388g, this.f214399r, this.f214400s, this.f214389h);
        return nVar;
    }

    /* renamed from: b */
    public final void mo72624b(Optional optional) {
        if (optional != null) {
            this.f214398q = optional;
            return;
        }
        throw new NullPointerException("Null audioLevelInfoResult");
    }

    /* renamed from: c */
    public final void mo72625c(C77889u uVar) {
        if (uVar != null) {
            this.f214396o = uVar;
            return;
        }
        throw new NullPointerException("Null engine");
    }

    /* renamed from: d */
    public final void mo72626d(C77556ai aiVar) {
        if (aiVar != null) {
            this.f214384c = aiVar;
            return;
        }
        throw new NullPointerException("Null eventType");
    }

    /* renamed from: e */
    public final void mo72627e(Optional optional) {
        if (optional != null) {
            this.f214400s = optional;
            return;
        }
        throw new NullPointerException("Null hotwordValidationResult");
    }

    /* renamed from: f */
    public final void mo72628f(List list) {
        this.f214382a = C58485gu.m89842j(list);
    }

    /* renamed from: g */
    public final void mo72629g(boolean z) {
        this.f214393l = z;
        this.f214401t = (byte) (this.f214401t | 1);
    }

    /* renamed from: h */
    public final void mo72630h(Instant instant) {
        if (instant != null) {
            this.f214390i = instant;
            return;
        }
        throw new NullPointerException("Null instant");
    }

    /* renamed from: i */
    public final void mo72631i(Optional optional) {
        if (optional != null) {
            this.f214395n = optional;
            return;
        }
        throw new NullPointerException("Null magicMicAcousticScore");
    }

    /* renamed from: j */
    public final void mo72632j(Optional optional) {
        if (optional != null) {
            this.f214394m = optional;
            return;
        }
        throw new NullPointerException("Null magicMicScore");
    }

    /* renamed from: k */
    public final void mo72633k(C77563ap apVar) {
        if (apVar != null) {
            this.f214397p = apVar;
            return;
        }
        throw new NullPointerException("Null speakerInfo");
    }

    /* renamed from: l */
    public final void mo72634l(Optional optional) {
        if (optional != null) {
            this.f214391j = optional;
            return;
        }
        throw new NullPointerException("Null speechEndTime");
    }

    /* renamed from: m */
    public final void mo72635m(Optional optional) {
        if (optional != null) {
            this.f214392k = optional;
            return;
        }
        throw new NullPointerException("Null strictSpeechDuration");
    }

    /* renamed from: n */
    public final void mo72636n() {
        this.f214401t = (byte) (this.f214401t | 2);
    }

    public C77830m(C77557aj ajVar) {
        C77866n nVar = (C77866n) ajVar;
        this.f214390i = nVar.f214496a;
        this.f214391j = nVar.f214497b;
        this.f214392k = nVar.f214498c;
        this.f214382a = nVar.f214499d;
        this.f214383b = nVar.f214500e;
        this.f214393l = nVar.f214501f;
        this.f214384c = nVar.f214502g;
        this.f214394m = nVar.f214503h;
        this.f214395n = nVar.f214504i;
        this.f214385d = nVar.f214505j;
        this.f214386e = nVar.f214506k;
        this.f214396o = nVar.f214507l;
        this.f214387f = nVar.f214508m;
        this.f214397p = nVar.f214509n;
        this.f214398q = nVar.f214510o;
        this.f214388g = nVar.f214511p;
        this.f214399r = nVar.f214512q;
        this.f214400s = nVar.f214513r;
        this.f214389h = nVar.f214514s;
        this.f214401t = 3;
    }
}
