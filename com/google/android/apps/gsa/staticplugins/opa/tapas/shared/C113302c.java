package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.p4553a.C59509cf;
import com.google.common.p4552o.p4553a.C59514ck;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c */
/* compiled from: PG */
public final class C113302c extends C113407er {

    /* renamed from: a */
    public Optional f313769a = Optional.empty();

    /* renamed from: b */
    public Optional f313770b = Optional.empty();

    /* renamed from: c */
    public Optional f313771c = Optional.empty();

    /* renamed from: d */
    public Optional f313772d = Optional.empty();

    /* renamed from: e */
    public Optional f313773e = Optional.empty();

    /* renamed from: f */
    public Optional f313774f = Optional.empty();

    /* renamed from: g */
    public Optional f313775g = Optional.empty();

    /* renamed from: h */
    public C58528ij f313776h;

    /* renamed from: i */
    private C113405ep f313777i;

    /* renamed from: j */
    private C58495hd f313778j;

    /* renamed from: k */
    private Optional f313779k = Optional.empty();

    /* renamed from: l */
    private C59514ck f313780l;

    /* renamed from: m */
    private C59509cf f313781m;

    public C113302c() {
    }

    /* renamed from: a */
    public final C113408es mo100091a() {
        if (this.f313777i != null && this.f313778j != null && this.f313780l != null && this.f313781m != null && this.f313776h != null) {
            return new C113276ba(this.f313777i, this.f313778j, this.f313779k, this.f313769a, this.f313770b, this.f313771c, this.f313772d, this.f313773e, this.f313780l, this.f313781m, this.f313774f, this.f313775g, this.f313776h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f313777i == null) {
            sb.append(" originalRequest");
        }
        if (this.f313778j == null) {
            sb.append(" suggestionsByGroup");
        }
        if (this.f313780l == null) {
            sb.append(" mixerResponseLog");
        }
        if (this.f313781m == null) {
            sb.append(" cortexMetadata");
        }
        if (this.f313776h == null) {
            sb.append(" incompleteSourcesBeforeFastTimeout");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo100092b(C59509cf cfVar) {
        if (cfVar != null) {
            this.f313781m = cfVar;
            return;
        }
        throw new NullPointerException("Null cortexMetadata");
    }

    /* renamed from: c */
    public final void mo100093c(C58528ij ijVar) {
        if (ijVar != null) {
            this.f313776h = ijVar;
            return;
        }
        throw new NullPointerException("Null incompleteSourcesBeforeFastTimeout");
    }

    /* renamed from: d */
    public final void mo100094d(C59514ck ckVar) {
        if (ckVar != null) {
            this.f313780l = ckVar;
            return;
        }
        throw new NullPointerException("Null mixerResponseLog");
    }

    /* renamed from: e */
    public final void mo100095e(C113405ep epVar) {
        if (epVar != null) {
            this.f313777i = epVar;
            return;
        }
        throw new NullPointerException("Null originalRequest");
    }

    /* renamed from: f */
    public final void mo100096f(C58495hd hdVar) {
        if (hdVar != null) {
            this.f313778j = hdVar;
            return;
        }
        throw new NullPointerException("Null suggestionsByGroup");
    }

    /* renamed from: g */
    public final void mo100097g(List list) {
        this.f313779k = Optional.m71637of(list);
    }

    public C113302c(C113408es esVar) {
        this.f313777i = esVar.mo100118a();
        this.f313778j = esVar.mo100120c();
        this.f313779k = esVar.mo100132m();
        this.f313769a = esVar.mo100131l();
        this.f313770b = esVar.mo100126h();
        this.f313771c = esVar.mo100133n();
        this.f313772d = esVar.mo100128i();
        this.f313773e = esVar.mo100129j();
        this.f313780l = esVar.mo100124f();
        this.f313781m = esVar.mo100122e();
        this.f313774f = esVar.mo100130k();
        this.f313775g = esVar.mo100125g();
        this.f313776h = esVar.mo100121d();
    }
}
