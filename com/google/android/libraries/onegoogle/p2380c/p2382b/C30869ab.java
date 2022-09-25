package com.google.android.libraries.onegoogle.p2380c.p2382b;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28353e;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;
import com.google.android.libraries.onegoogle.p2380c.p2382b.p2383a.C30862a;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.c.b.ab */
/* compiled from: PG */
public final class C30869ab implements C30897z {

    /* renamed from: a */
    private final C28421h f83251a;

    /* renamed from: b */
    private final C30879h f83252b;

    /* renamed from: c */
    private final C58833ax f83253c;

    public C30869ab(C30158c cVar, C30253a aVar, C30313v vVar, C28421h hVar, C58833ax axVar) {
        this.f83251a = hVar;
        this.f83253c = axVar;
        this.f83252b = new C30879h(this, new C30868aa(this, hVar), cVar, aVar, vVar);
    }

    /* renamed from: a */
    public final void mo35821a(View view, int i) {
        C19559g.m37304c();
        C30879h hVar = this.f83252b;
        C30878g gVar = new C30878g(hVar, view, i);
        view.addOnAttachStateChangeListener(gVar);
        hVar.mo36570b(view, i, C30281j.m56319c(((C30306o) hVar.f83274a).f81934a.f81883d));
        if (C2043bi.m5569aw(view)) {
            gVar.onViewAttachedToWindow(view);
        }
    }

    /* renamed from: b */
    public final void mo35822b(View view, int i) {
        C19559g.m37304c();
        this.f83251a.mo33881b().mo33801b(view, mo36554g(i));
    }

    /* renamed from: c */
    public final void mo35823c(View view, int i) {
        C19559g.m37304c();
        this.f83251a.mo33881b().mo33802c(view, mo36554g(i));
    }

    /* renamed from: d */
    public final void mo35824d(View view, int i, C28353e eVar) {
        C19559g.m37304c();
        C28306ab b = this.f83251a.mo33881b();
        C28313c g = mo36554g(i);
        g.mo33858f(eVar);
        b.mo33801b(view, g);
    }

    /* renamed from: e */
    public final void mo35825e(View view) {
        C19559g.m37304c();
        this.f83251a.mo33881b();
        C28306ab.m52929e(view);
    }

    /* renamed from: f */
    public final void mo35826f(C28440j jVar, View view) {
        if (this.f83253c.mo56113h()) {
            jVar.mo33895b(((C30862a) this.f83253c.mo56107c()).mo36552b());
        }
        C30871ad.m57643a(this.f83251a.mo33880a(), jVar, view);
    }

    /* renamed from: g */
    public final C28313c mo36554g(int i) {
        C28313c a = this.f83251a.mo33882c().mo33805a(C28427h.m53115a(i));
        if (this.f83253c.mo56113h()) {
            a.mo33858f(((C30862a) this.f83253c.mo56107c()).mo36551a());
        }
        return a;
    }
}
