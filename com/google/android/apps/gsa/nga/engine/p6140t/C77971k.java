package com.google.android.apps.gsa.nga.engine.p6140t;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80456d;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.t.k */
/* compiled from: PG */
public final class C77971k extends C79360j implements C77974n, C77973m {

    /* renamed from: a */
    private final C77970j f214731a;

    /* renamed from: b */
    private final C91142g f214732b;

    /* renamed from: c */
    private final C81252aq f214733c;

    /* renamed from: d */
    private final C76092h f214734d;

    /* renamed from: e */
    private final AtomicReference f214735e = new AtomicReference();

    /* renamed from: f */
    private final AtomicReference f214736f = new AtomicReference(Optional.empty());

    public C77971k(C77970j jVar, C91142g gVar, C81252aq aqVar, C76092h hVar, C79359i iVar) {
        super(iVar, hVar, C58528ij.m90012L(Integer.valueOf(C90126fx.f251266fa.f248757a), Integer.valueOf(C90126fx.f251233eu.f248757a), Integer.valueOf(C90126fx.f251234ev.f248757a)));
        this.f214731a = jVar;
        this.f214732b = gVar;
        this.f214733c = aqVar;
        this.f214734d = hVar;
    }

    /* renamed from: e */
    private final boolean m125157e() {
        return this.f214732b.mo85405j(C90126fx.f251266fa) && this.f214732b.mo85405j(C90126fx.f251233eu) && this.f214732b.mo85405j(C90126fx.f251234ev);
    }

    /* renamed from: b */
    public final Optional mo72932b() {
        return mo71201gC() ? Optional.m71637of(this.f214731a) : Optional.empty();
    }

    /* renamed from: d */
    public final void mo72933d(C80456d dVar) {
        Locale locale = (Locale) this.f214735e.get();
        if (locale == null || !mo71201gC()) {
            mo73920X();
            return;
        }
        this.f214731a.mo72930d(dVar, locale);
        dVar.f220822a.size();
    }

    /* renamed from: gB */
    public final boolean mo72819gB() {
        boolean r = this.f214733c.mo74957r();
        Optional d = this.f214734d.mo72021b().mo72038d();
        boolean booleanValue = ((Boolean) this.f214733c.mo74947h(d).orElse(false)).booleanValue();
        boolean x = this.f214733c.mo74963x();
        boolean e = m125157e();
        d.orElse("EMPTY");
        if (!e || !r || !x || !booleanValue) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gD */
    public final boolean mo71822gD() {
        return !this.f214734d.mo72021b().mo72039e().equals((Locale) this.f214735e.get()) || !this.f214734d.mo72021b().mo72038d().equals((Optional) this.f214736f.get());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        Locale e = this.f214734d.mo72021b().mo72039e();
        this.f214735e.set(e);
        this.f214736f.set(this.f214734d.mo72021b().mo72038d());
        return this.f214731a.mo72928b(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        this.f214731a.mo72929c();
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "GmailSubjectCache";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 25;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f214731a);
        String valueOf2 = String.valueOf(this.f214732b);
        String valueOf3 = String.valueOf(this.f214733c);
        String valueOf4 = String.valueOf(this.f214734d);
        boolean e = m125157e();
        String obj = this.f214735e.toString();
        boolean gC = mo71201gC();
        return "GmailSubjectsCacheLifecycleManager{cache=" + valueOf + ", syncedStartupPrefs=" + valueOf2 + ", ngaPreferences=" + valueOf3 + ", ngaConfigurationProvider=" + valueOf4 + ", cachedFlag=" + e + ", cachedLocale=" + obj + ", isEnabled=" + gC + "}";
    }
}
