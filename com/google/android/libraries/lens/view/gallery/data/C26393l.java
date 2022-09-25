package com.google.android.libraries.lens.view.gallery.data;

import android.net.Uri;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.lens.view.p2078at.C25513as;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.android.libraries.lens.view.p2096f.C25806i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.l */
/* compiled from: PG */
public final class C26393l {

    /* renamed from: a */
    public static final C58974d f71804a = C58974d.m91135i("GalleryLiveDataManager");

    /* renamed from: b */
    public final C25758g f71805b = new C25758g(C58836b.f156633a);

    /* renamed from: c */
    public final Executor f71806c;

    /* renamed from: d */
    public final C60887da f71807d;

    /* renamed from: e */
    public C25758g f71808e;

    /* renamed from: f */
    public C60870cx f71809f;

    /* renamed from: g */
    public C60870cx f71810g;

    /* renamed from: h */
    public final C26398q f71811h;

    /* renamed from: i */
    private final C26385d f71812i;

    /* renamed from: j */
    private GalleryContentObserver f71813j;

    public C26393l(C26398q qVar, C26385d dVar, C60887da daVar, C60887da daVar2) {
        this.f71811h = qVar;
        this.f71812i = dVar;
        this.f71807d = daVar2;
        this.f71806c = C25806i.m47612a(daVar);
    }

    /* renamed from: a */
    public final synchronized C25758g mo31594a(C26406y yVar) {
        if (this.f71808e == null) {
            this.f71808e = new C25758g(yVar);
        }
        return this.f71808e;
    }

    /* renamed from: b */
    public final GalleryContentObserver mo31595b() {
        if (this.f71813j == null) {
            C26385d dVar = this.f71812i;
            C26386e eVar = new C26386e(this);
            C47770dh dhVar = (C47770dh) dVar.f71791a.mo17428b();
            dhVar.getClass();
            Executor executor = (Executor) dVar.f71792b.mo17428b();
            executor.getClass();
            Uri uri = (Uri) dVar.f71793c.mo17428b();
            uri.getClass();
            C46877q qVar = (C46877q) dVar.f71794d.mo17428b();
            qVar.getClass();
            C25513as asVar = (C25513as) dVar.f71795e.mo17428b();
            asVar.getClass();
            this.f71813j = new GalleryContentObserver(eVar, dhVar, executor, uri, qVar, asVar);
        }
        return this.f71813j;
    }

    /* renamed from: c */
    public final C26406y mo31596c() {
        return (C26406y) mo31594a(C26406y.f71843c).mo3842a();
    }

    /* renamed from: d */
    public final C60870cx mo31597d() {
        C26390i iVar = new C26390i(this);
        return C60856cj.m92905n(C47810es.m84965e(iVar), this.f71806c);
    }

    /* renamed from: e */
    public final void mo31598e() {
        Executor executor = this.f71806c;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C26389h(this)))));
    }

    /* renamed from: f */
    public final void mo31599f(C2391v vVar, C2333ah ahVar) {
        C19559g.m37304c();
        mo31597d();
        mo31594a(C26406y.f71843c).mo5704e(vVar, ahVar);
        mo31595b().mo31575a(vVar.getLifecycle());
    }
}
