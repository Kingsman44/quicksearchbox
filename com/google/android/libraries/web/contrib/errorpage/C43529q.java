package com.google.android.libraries.web.contrib.errorpage;

import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.core.content.C1878d;
import androidx.lifecycle.C2383n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.errorpage.C43531s;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.q */
/* compiled from: PG */
public final class C43529q {

    /* renamed from: a */
    public final C58526ih f113656a = new C58526ih();

    /* renamed from: b */
    public C58528ij f113657b;

    /* renamed from: c */
    public C43516d f113658c;

    /* renamed from: d */
    final /* synthetic */ C43531s f113659d;

    public C43529q(C43531s sVar) {
        this.f113659d = sVar;
    }

    /* renamed from: a */
    public final void mo46586a() {
        C43527o oVar;
        C43531s sVar = this.f113659d;
        if (this.f113657b != null) {
            oVar = new C43527o(this);
        } else {
            C58528ij f = this.f113656a.mo55486f();
            Objects.requireNonNull(f);
            oVar = new C43528p(f);
        }
        C43516d dVar = this.f113658c;
        C58838bb.m90884s(!sVar.f113662b.getLifecycle().mo5789a().mo5788a(C2383n.STARTED), "ErrorPageMixin#subscribe must be called within Fragment#onCreateView.");
        C43525m a = sVar.mo46591a();
        a.f113645a = new C43517e(oVar);
        View findViewById = sVar.mo46592b().requireView().findViewById(R.id.webx_error_container);
        Fragment fragment = sVar.f113662b;
        C43269t tVar = sVar.f113664d;
        C43377v vVar = sVar.f113665e;
        sVar.f113667g = new C43531s.C43532a(fragment, tVar, vVar, sVar.f113666f, oVar, dVar, a, findViewById);
        sVar.f113663c.mo50707a(vVar.mo46469b(), sVar.f113667g);
        sVar.f113662b.getLifecycle().mo5790b(new ErrorPageMixin$1(sVar, a));
        if (sVar.f113664d.mo46385c().equals(C43271v.WEB_LAYER)) {
            findViewById.setOnTouchListener(C43518f.f113638a);
            Integer num = sVar.f113664d.mo46384b().f112968g;
            if (num != null) {
                findViewById.setBackgroundColor(num.intValue());
            } else {
                findViewById.setBackgroundColor(C1878d.m5128a(sVar.f113662b.requireContext(), (sVar.f113662b.requireContext().getResources().getConfiguration().uiMode & 48) == 32 ? R.color.google_dark_default_color_background : R.color.google_default_color_background));
            }
        }
    }

    /* renamed from: b */
    public final void mo46587b(C43514b... bVarArr) {
        C58526ih ihVar = new C58526ih();
        ihVar.mo55488h(bVarArr);
        this.f113657b = ihVar.mo55486f();
    }

    /* renamed from: c */
    public final void mo46588c(Predicate predicate) {
        this.f113659d.mo46591a().f113646b = predicate;
    }

    /* renamed from: d */
    public final void mo46589d(C43507a aVar) {
        this.f113659d.mo46592b().mo17754z().mo46873a(C44082a.f114755a).f113154d = new C43526n(this, aVar);
    }

    /* renamed from: e */
    public final void mo46590e() {
        mo46587b(new C43514b[0]);
    }
}
