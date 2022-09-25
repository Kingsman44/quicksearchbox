package com.google.android.apps.gsa.shared.p6983ah;

import androidx.lifecycle.C2332ag;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.apps.gsa.shared.ah.g */
/* compiled from: PG */
public final class C89150g implements C89145b {

    /* renamed from: h */
    private static final C58528ij f241683h = C58528ij.m90012L(C88079oj.PAUSED, C88079oj.STOPPED, C88079oj.UNKNOWN);

    /* renamed from: i */
    private static final C58528ij f241684i = C58528ij.m90011K(C88079oj.STOPPED, C88079oj.UNKNOWN);

    /* renamed from: a */
    public final C2332ag f241685a = new C2332ag(C88079oj.UNKNOWN);

    /* renamed from: b */
    public boolean f241686b;

    /* renamed from: c */
    public final C2332ag f241687c = new C2332ag();

    /* renamed from: d */
    public final C2332ag f241688d = new C2332ag(C89154k.f241700e);

    /* renamed from: e */
    public C89158o f241689e = C89158o.f241716c;

    /* renamed from: f */
    public C89154k f241690f = C89154k.f241700e;

    /* renamed from: g */
    public final C22871g f241691g;

    /* renamed from: j */
    private final Set f241692j = new CopyOnWriteArraySet();

    /* renamed from: k */
    private final C2332ag f241693k = new C2332ag(false);

    /* renamed from: l */
    private final C2332ag f241694l = new C2332ag();

    /* renamed from: m */
    private final C2332ag f241695m = new C2332ag();

    /* renamed from: n */
    private final C2332ag f241696n = new C2332ag();

    /* renamed from: o */
    private final C2332ag f241697o = new C2332ag(C89158o.f241716c);

    /* renamed from: p */
    private final C2332ag f241698p = new C2332ag();

    public C89150g(C22871g gVar) {
        this.f241691g = gVar;
    }

    /* renamed from: a */
    public final LiveData mo83127a() {
        return this.f241687c;
    }

    /* renamed from: b */
    public final LiveData mo83128b() {
        return this.f241695m;
    }

    /* renamed from: c */
    public final LiveData mo83129c() {
        return this.f241698p;
    }

    /* renamed from: d */
    public final LiveData mo83130d() {
        return this.f241694l;
    }

    /* renamed from: e */
    public final LiveData mo83131e() {
        return this.f241696n;
    }

    /* renamed from: f */
    public final LiveData mo83132f() {
        return this.f241685a;
    }

    /* renamed from: g */
    public final LiveData mo83133g() {
        return this.f241688d;
    }

    /* renamed from: h */
    public final LiveData mo83134h() {
        return this.f241693k;
    }

    /* renamed from: i */
    public final LiveData mo83135i() {
        return this.f241697o;
    }

    /* renamed from: j */
    public final void mo83136j(C89144a aVar) {
        this.f241692j.add(aVar);
    }

    /* renamed from: k */
    public final void mo83137k(boolean z) {
        this.f241698p.mo5708l(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public final void mo83138l() {
        for (C89144a a : this.f241692j) {
            a.mo83126a();
        }
    }

    /* renamed from: m */
    public final void mo83139m(boolean z) {
        this.f241694l.mo5708l(Boolean.valueOf(z));
    }

    /* renamed from: n */
    public final void mo83140n(boolean z) {
        this.f241687c.mo5708l(Boolean.valueOf(z));
        if (z) {
            mo83141o(false);
        }
    }

    /* renamed from: o */
    public final void mo83141o(boolean z) {
        this.f241695m.mo5708l(Boolean.valueOf(z));
    }

    /* renamed from: p */
    public final void mo83142p(boolean z) {
        this.f241696n.mo5708l(Boolean.valueOf(z));
    }

    /* renamed from: q */
    public final void mo83143q(C89158o oVar) {
        this.f241691g.mo28212l("onOpaVisualStateChanged", new C89146c(this, oVar));
    }

    /* renamed from: r */
    public final void mo83144r() {
        C88079oj ojVar = (C88079oj) this.f241685a.mo3842a();
        if (f241683h.contains(ojVar)) {
            this.f241693k.mo5708l(false);
        } else {
            this.f241693k.mo5708l(Boolean.valueOf(this.f241686b));
        }
        if (f241684i.contains(ojVar)) {
            this.f241697o.mo5708l(C89158o.f241716c);
            this.f241688d.mo5708l(C89154k.f241700e);
            return;
        }
        this.f241697o.mo5708l(this.f241689e);
        this.f241688d.mo5708l(this.f241690f);
    }

    /* renamed from: s */
    public final void mo83145s(C58833ax axVar, int i) {
        this.f241691g.mo28212l("onResponseStateUiUpdated", new C89149f(this, i, axVar));
    }
}
