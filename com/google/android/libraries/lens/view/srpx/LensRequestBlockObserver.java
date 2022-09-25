package com.google.android.libraries.lens.view.srpx;

import android.content.Context;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.widget.Toast;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25488c;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.net.URISyntaxException;

/* compiled from: PG */
public final class LensRequestBlockObserver implements C43773b {

    /* renamed from: a */
    public static final /* synthetic */ int f76282a = 0;

    /* renamed from: b */
    private static final C58974d f76283b = C58974d.m91135i("LensRequestBlock");

    /* renamed from: c */
    private final C28041g f76284c;

    /* renamed from: d */
    private final RequestBlockMixin f76285d;

    /* renamed from: e */
    private final C25537t f76286e;

    /* renamed from: f */
    private final Context f76287f;

    /* renamed from: g */
    private C28050p f76288g;

    public LensRequestBlockObserver(C28041g gVar, C43861g gVar2, RequestBlockMixin requestBlockMixin, C25537t tVar) {
        this.f76284c = gVar;
        this.f76287f = gVar2.getContext();
        this.f76285d = requestBlockMixin;
        this.f76286e = tVar;
        Fragment parentFragment = gVar2.getParentFragment();
        if (parentFragment instanceof C28049o) {
            this.f76288g = ((C28049o) parentFragment).mo17754z();
        }
    }

    /* renamed from: g */
    public final void mo33485g(C43367l lVar) {
        boolean z = false;
        try {
            z = this.f76286e.mo30556f(Intent.parseUri(lVar.f113296b, 0));
        } catch (URISyntaxException e) {
            ((C58970a) ((C58970a) ((C58970a) f76283b.mo56225c()).mo56382g(e)).mo56372aa(50150)).mo56386p("Failed to parse URL for inline SRP");
        }
        C28050p pVar = this.f76288g;
        if (!(pVar == null || pVar.f76341k == null || pVar.f76343m == null || !pVar.f76345o)) {
            pVar.f76339i.mo33853c(C28442l.m53142h().mo33894a(), pVar.f76343m.mo33908b(1L));
        }
        if (!z) {
            Toast.makeText(this.f76287f, "Unable to handle request", 1).show();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        RequestBlockMixin requestBlockMixin = this.f76285d;
        requestBlockMixin.mo46747b(R.id.request_allow_captcha_test, new C28034b(this.f76284c));
        requestBlockMixin.mo46747b(R.id.request_allow_captcha_test_result, new C28037c(this.f76284c));
        requestBlockMixin.mo46747b(R.id.request_allow_captcha_test_pass_redirect, new C28040f(this.f76284c));
        requestBlockMixin.mo46747b(R.id.request_allow_hk_redirect, C28039e.f76314a);
        requestBlockMixin.mo46747b(R.id.request_allow_same_query_redirect, new C28038d(this.f76284c));
        requestBlockMixin.mo46747b(R.id.request_allow_bless_authentication, C25488c.f69445a);
        requestBlockMixin.mo46749d(R.id.request_block_all, new C28029a(this));
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
