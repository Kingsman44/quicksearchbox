package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91889m;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.libraries.search.video.thirdparty.C41598ab;
import com.google.android.libraries.search.video.thirdparty.C41599ac;
import com.google.android.libraries.search.video.thirdparty.C41606h;
import com.google.android.libraries.search.video.thirdparty.C41607i;
import com.google.android.libraries.search.video.thirdparty.C41611m;
import com.google.android.libraries.search.video.thirdparty.C41613o;
import com.google.android.libraries.search.video.thirdparty.C41617s;
import com.google.android.libraries.search.video.thirdparty.C41624y;
import dagger.C68214a;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.b */
/* compiled from: PG */
class C105021b implements C91889m, C41606h {

    /* renamed from: a */
    protected final Context f292631a;

    /* renamed from: b */
    protected final C68214a f292632b;

    /* renamed from: c */
    protected C41607i f292633c;

    /* renamed from: d */
    protected final C41613o f292634d;

    /* renamed from: e */
    private final ViewGroup f292635e;

    /* renamed from: f */
    private final C91890n f292636f;

    /* renamed from: g */
    private final Optional f292637g;

    /* renamed from: h */
    private final Optional f292638h;

    /* renamed from: i */
    private final Optional f292639i;

    /* renamed from: j */
    private final Optional f292640j;

    protected C105021b(Context context, C68214a aVar, C41613o oVar, ViewGroup viewGroup, C91890n nVar, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.f292631a = context;
        this.f292632b = aVar;
        this.f292634d = oVar;
        this.f292635e = viewGroup;
        this.f292636f = nVar;
        this.f292637g = optional;
        this.f292638h = optional2;
        this.f292639i = optional3;
        this.f292640j = optional4;
    }

    /* renamed from: a */
    public final void mo86435a() {
        C41607i iVar = this.f292633c;
        if (iVar != null) {
            iVar.mo44172F();
        }
    }

    /* renamed from: b */
    public final void mo86436b() {
        C41607i iVar;
        C41607i iVar2 = this.f292633c;
        if (iVar2 != null) {
            iVar2.mo44170D();
            if (mo94476h() && (iVar = this.f292633c) != null) {
                iVar.mo44174H(Duration.ZERO);
            }
        }
        this.f292636f.mo86447h(5);
    }

    /* renamed from: c */
    public final void mo86437c() {
        C41607i iVar = this.f292633c;
        if (iVar != null) {
            iVar.mo44170D();
            this.f292633c.mo44173G();
        }
        this.f292633c = null;
    }

    /* renamed from: d */
    public final void mo86438d() {
        mo86436b();
    }

    /* renamed from: e */
    public final void mo86439e() {
        if (!this.f292638h.isEmpty()) {
            C41598ab f = C41599ac.m72859f();
            f.mo44154b(false);
            f.mo44156d(true);
            f.mo44157e(true);
            f.mo44155c(this.f292639i.isPresent());
            f.mo44158f(mo94476h());
            C41617s a = C41624y.m72991a(this.f292631a, f.mo44153a());
            a.mo44182b(this.f292635e);
            a.mo44183c();
            if (this.f292640j.isPresent()) {
                a.mo44184d(((Float) this.f292640j.get()).floatValue());
            }
            C41607i a2 = ((C41611m) this.f292632b.mo27525b()).mo44179a(this.f292634d, a);
            if (this.f292637g.isPresent()) {
                C91881e eVar = (C91881e) this.f292637g.get();
                Objects.requireNonNull(a2);
                eVar.mo86416d(new C104999a(a2));
                eVar.mo86417e(this.f292639i.isPresent());
            }
            this.f292633c = a2;
            a2.mo44168B(this);
            if (this.f292637g.isPresent()) {
                C91881e eVar2 = (C91881e) this.f292637g.get();
                eVar2.mo86418f(1);
                a2.mo44168B(eVar2);
            }
            a2.mo44169C(this.f292631a, (String) this.f292638h.get(), Optional.empty(), this.f292639i);
            a.mo44181a(a2);
            if (this.f292637g.isPresent()) {
                ((C91881e) this.f292637g.get()).mo86418f(2);
            }
            mo94475f(a2, a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo94475f(C41607i iVar, C41617s sVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo94476h() {
        return false;
    }

    /* renamed from: hW */
    public void mo44142hW() {
    }

    /* renamed from: i */
    public final void mo44143i(int i) {
        this.f292636f.mo86447h(6);
    }

    /* renamed from: j */
    public void mo44144j(int i) {
    }

    /* renamed from: k */
    public final void mo44145k(int i, C41607i iVar) {
        if (i == 4) {
            this.f292636f.mo86447h(4);
        }
    }
}
