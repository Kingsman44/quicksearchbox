package com.google.android.libraries.lens.view.gallery.data;

import android.net.Uri;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import androidx.p060c.C0979i;
import com.google.android.libraries.lens.view.p2078at.C25501ag;
import com.google.android.libraries.lens.view.p2078at.C25513as;
import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.dataservice.C46783d;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class GalleryContentObserver {

    /* renamed from: a */
    public final C25513as f71772a;

    /* renamed from: b */
    public final Set f71773b = new C0979i(0);

    /* renamed from: c */
    public C58833ax f71774c = C58836b.f156633a;

    /* renamed from: d */
    private final C47770dh f71775d;

    /* renamed from: e */
    private final Executor f71776e;

    /* renamed from: f */
    private final Uri f71777f;

    /* renamed from: g */
    private final C46877q f71778g;

    /* renamed from: h */
    private C46783d f71779h;

    /* renamed from: i */
    private final C26386e f71780i;

    public GalleryContentObserver(C26386e eVar, C47770dh dhVar, Executor executor, Uri uri, C46877q qVar, C25513as asVar) {
        this.f71780i = eVar;
        this.f71775d = dhVar;
        this.f71776e = executor;
        this.f71777f = uri;
        this.f71778g = qVar;
        this.f71772a = asVar;
    }

    /* renamed from: a */
    public final void mo31575a(final C2384o oVar) {
        C19559g.m37304c();
        if (oVar.mo5789a() != C2383n.DESTROYED) {
            oVar.mo5790b(new C2376g() {
                /* renamed from: gV */
                public final void mo3520gV(C2391v vVar) {
                    GalleryContentObserver galleryContentObserver = GalleryContentObserver.this;
                    C2384o oVar = oVar;
                    C19559g.m37304c();
                    galleryContentObserver.f71773b.add(oVar);
                }

                /* renamed from: gW */
                public final void mo3521gW(C2391v vVar) {
                    GalleryContentObserver galleryContentObserver = GalleryContentObserver.this;
                    C2384o oVar = oVar;
                    C19559g.m37304c();
                    galleryContentObserver.f71773b.remove(oVar);
                }

                /* renamed from: gX */
                public final /* synthetic */ void mo3522gX(C2391v vVar) {
                }

                /* renamed from: gY */
                public final void mo3523gY(C2391v vVar) {
                    GalleryContentObserver galleryContentObserver = GalleryContentObserver.this;
                    C19559g.m37304c();
                    if (!galleryContentObserver.f71774c.mo56113h() || !((Boolean) galleryContentObserver.f71774c.mo56107c()).booleanValue()) {
                        C25513as asVar = galleryContentObserver.f71772a;
                        boolean a = asVar.mo30543a(C25501ag.m46966a(asVar.f69476b));
                        if (a) {
                            if (!galleryContentObserver.f71774c.mo56113h()) {
                                galleryContentObserver.mo31577c();
                            } else if (!((Boolean) galleryContentObserver.f71774c.mo56107c()).booleanValue()) {
                                galleryContentObserver.mo31576b();
                                galleryContentObserver.mo31577c();
                            }
                        }
                        galleryContentObserver.f71774c = C58833ax.m90834k(Boolean.valueOf(a));
                    }
                }

                /* renamed from: gZ */
                public final /* synthetic */ void mo3524gZ(C2391v vVar) {
                }

                /* renamed from: ha */
                public final /* synthetic */ void mo3525ha(C2391v vVar) {
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo31576b() {
        C19559g.m37304c();
        C26386e eVar = this.f71780i;
        boolean isEmpty = this.f71773b.isEmpty();
        C26393l lVar = eVar.f71796a;
        Executor executor = lVar.f71806c;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C26387f(lVar, !isEmpty)))));
        C46783d dVar = this.f71779h;
        if (this.f71773b.isEmpty() && dVar != null) {
            this.f71778g.mo50876f(dVar);
            this.f71779h = null;
            this.f71774c = C58836b.f156633a;
        }
    }

    /* renamed from: c */
    public final void mo31577c() {
        C19559g.m37304c();
        if (this.f71779h == null) {
            C26384c cVar = new C26384c(this, this.f71775d, this.f71776e);
            this.f71778g.mo50875e(this.f71777f, true, cVar);
            this.f71779h = cVar;
        }
    }
}
