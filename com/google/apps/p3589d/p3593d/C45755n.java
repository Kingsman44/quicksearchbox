package com.google.apps.p3589d.p3593d;

import com.evernote.android.state.BuildConfig;
import com.google.apps.p3589d.p3595f.C45806i;
import com.google.apps.p3589d.p3595f.C45821x;

/* renamed from: com.google.apps.d.d.n */
/* compiled from: PG */
public abstract class C45755n {

    /* renamed from: c */
    public final String f120314c;

    /* renamed from: d */
    public C45763v f120315d;

    /* renamed from: e */
    public C45763v f120316e;

    /* renamed from: f */
    public C45821x f120317f;

    /* renamed from: g */
    public C45732a f120318g;

    /* renamed from: h */
    public final int f120319h;

    protected C45755n(int i, String str) {
        this.f120319h = i;
        this.f120314c = str;
        this.f120317f = C45821x.DEFAULT;
        this.f120315d = null;
        this.f120316e = null;
        this.f120318g = C45732a.f120239a;
    }

    /* renamed from: c */
    public static C45755n m81570c() {
        return new C45733aa(2, BuildConfig.FLAVOR);
    }

    /* renamed from: d */
    public static C45755n m81571d() {
        return new C45733aa(2, "⬚");
    }

    /* renamed from: a */
    public abstract C45755n mo49862a(C45750i iVar);

    /* renamed from: b */
    public final C45755n mo49886b(C45763v vVar, C45763v vVar2) {
        if (vVar == this.f120315d && vVar2 == this.f120316e) {
            return this;
        }
        if (mo49893m()) {
            C45755n e = mo49887e();
            e.f120315d = vVar;
            e.f120316e = vVar2;
            return e;
        }
        throw new AssertionError("Subscripts not allowed for atom type ".concat(C45754m.m81569a(this.f120319h)));
    }

    /* renamed from: e */
    public final C45755n mo49887e() {
        return mo49862a(new C45753l());
    }

    /* renamed from: f */
    public final String mo49888f() {
        return mo49890j() ? C45806i.m81700b(this.f120314c, this.f120317f) : this.f120314c;
    }

    /* renamed from: g */
    public abstract void mo49863g(C45741ai aiVar, C45742aj ajVar);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo49889h(C45741ai aiVar, C45742aj ajVar) {
        aiVar.mo49865a(this);
        C45763v vVar = this.f120315d;
        if (vVar != null) {
            vVar.mo49898g(aiVar, ajVar, this);
        }
        C45763v vVar2 = this.f120316e;
        if (vVar2 != null) {
            vVar2.mo49898g(aiVar, ajVar, this);
        }
    }

    /* renamed from: i */
    public abstract boolean mo49864i();

    /* renamed from: j */
    public final boolean mo49890j() {
        int i = this.f120319h;
        return i == 4 || i == 3;
    }

    /* renamed from: k */
    public final boolean mo49891k() {
        return this.f120319h == 2 && this.f120314c.isEmpty();
    }

    /* renamed from: l */
    public final boolean mo49892l() {
        return this.f120319h == 2 && this.f120314c.equals("′");
    }

    /* renamed from: m */
    public final boolean mo49893m() {
        return this.f120319h + -1 < 21;
    }

    protected C45755n(C45755n nVar, C45750i iVar) {
        this.f120319h = nVar.f120319h;
        this.f120314c = nVar.f120314c;
        this.f120317f = nVar.f120317f;
        this.f120315d = iVar.mo49884b(nVar.f120315d);
        this.f120316e = iVar.mo49884b(nVar.f120316e);
        this.f120318g = nVar.f120318g;
    }
}
