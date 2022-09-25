package com.google.android.apps.gsa.nga.engine.p6140t;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6140t.p6141a.C77955b;
import com.google.android.apps.gsa.nga.engine.p6140t.p6141a.C77957d;
import com.google.android.apps.gsa.nga.engine.p6140t.p6141a.C77959f;
import com.google.android.apps.gsa.nga.engine.p6140t.p6141a.C77961h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79356f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.mdi.p2211c.p2212a.C28604g;
import com.google.android.libraries.mdi.p2211c.p2212a.C28607j;
import com.google.android.libraries.mdi.p2211c.p2212a.C28608k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.nga.engine.t.d */
/* compiled from: PG */
public final class C77964d extends C79356f implements C77962b {

    /* renamed from: a */
    private final C28607j f214716a;

    /* renamed from: b */
    private final C28607j f214717b;

    /* renamed from: c */
    private final C28607j f214718c;

    /* renamed from: d */
    private final C28607j f214719d;

    /* renamed from: e */
    private final C91142g f214720e;

    /* renamed from: f */
    private final C81252aq f214721f;

    /* renamed from: g */
    private final C76092h f214722g;

    public C77964d(Context context, C77961h hVar, C77955b bVar, C77959f fVar, C77957d dVar, C91142g gVar, C81252aq aqVar, C76092h hVar2, C79359i iVar) {
        super(iVar);
        this.f214722g = hVar2;
        this.f214716a = new C28607j(new C28604g(context, "WebCache", hVar));
        this.f214717b = new C28607j(new C28604g(context, "AppsCache", bVar));
        this.f214718c = new C28607j(new C28604g(context, "GmmCache", fVar));
        this.f214719d = new C28607j(new C28604g(context, "ContactsCache", dVar));
        this.f214720e = gVar;
        this.f214721f = aqVar;
    }

    /* renamed from: a */
    public final C58485gu mo71200a() {
        if (!mo72924e()) {
            return C58485gu.m89845m();
        }
        try {
            return this.f214717b.mo34280a();
        } catch (C28608k unused) {
            return C58485gu.m89845m();
        }
    }

    /* renamed from: b */
    public final C58485gu mo72922b() {
        if (!mo72925g()) {
            return C58485gu.m89845m();
        }
        try {
            return this.f214719d.mo34280a();
        } catch (C28608k unused) {
            return C58485gu.m89845m();
        }
    }

    /* renamed from: d */
    public final C58485gu mo72923d() {
        if (!mo72926j()) {
            return C58485gu.m89845m();
        }
        try {
            return this.f214716a.mo34280a();
        } catch (C28608k unused) {
            return C58485gu.m89845m();
        }
    }

    /* renamed from: e */
    public final boolean mo72924e() {
        return this.f214720e.mo85405j(C90126fx.f251266fa) && this.f214720e.mo85405j(C90126fx.f251209eW) && this.f214721f.mo74957r();
    }

    /* renamed from: g */
    public final boolean mo72925g() {
        return this.f214720e.mo85405j(C90126fx.f251266fa) && this.f214720e.mo85405j(C90126fx.f251210eX) && this.f214721f.mo74957r();
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        if (!this.f214722g.mo72021b().mo72042g()) {
            return false;
        }
        if (mo72924e() || mo72926j()) {
            return true;
        }
        return (this.f214720e.mo85405j(C90126fx.f251266fa) && this.f214720e.mo85405j(C90126fx.f251211eY) && this.f214721f.mo74957r()) || mo72925g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return C60922j.m93044g(C60856cj.m92907p(this.f214717b.mo34281b(), this.f214716a.mo34281b(), this.f214718c.mo34281b(), this.f214719d.mo34281b()), C77963c.f214715a, C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return C118826c.f331423b;
    }

    /* renamed from: j */
    public final boolean mo72926j() {
        boolean r = this.f214721f.mo74957r();
        boolean x = this.f214721f.mo74963x();
        if (this.f214720e.mo85405j(C90126fx.f251266fa)) {
            return (this.f214720e.mo85405j(C90126fx.f251212eZ) || this.f214720e.mo85405j(C90126fx.f251267fb)) && r && x;
        }
        return false;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "GenericIcingCache";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 24;
    }
}
