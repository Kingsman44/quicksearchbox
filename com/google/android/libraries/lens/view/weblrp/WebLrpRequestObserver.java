package com.google.android.libraries.lens.view.weblrp;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.view.View;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27081h;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25482a;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25487b;
import com.google.android.libraries.lens.view.p2078at.p2079a.C25488c;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.URISyntaxException;

/* compiled from: PG */
public final class WebLrpRequestObserver implements C43773b {

    /* renamed from: a */
    private static final C59071e f76701a = C59071e.m91332i("com.google.android.libraries.lens.view.weblrp.WebLrpRequestObserver");

    /* renamed from: b */
    private final RequestBlockMixin f76702b;

    /* renamed from: c */
    private final Fragment f76703c;

    /* renamed from: d */
    private final C25799b f76704d;

    /* renamed from: e */
    private C28195j f76705e;

    /* renamed from: f */
    private boolean f76706f;

    public WebLrpRequestObserver(RequestBlockMixin requestBlockMixin, C43861g gVar, C25799b bVar) {
        this.f76702b = requestBlockMixin;
        this.f76703c = gVar;
        this.f76704d = bVar;
        Fragment parentFragment = gVar.getParentFragment();
        if (parentFragment instanceof C28191f) {
            C28195j f = ((C28191f) parentFragment).mo17754z();
            this.f76705e = f;
            this.f76706f = f.f76737k.mo31462g(C26239a.ONELRP_PRELOAD_ALLOW_ACCOUNT_REDIRECT);
        }
    }

    /* renamed from: g */
    public final void mo33702g(C43367l lVar) {
        View view;
        C28195j jVar = this.f76705e;
        if (jVar == null || jVar.f76734h.requireView().isShown()) {
            try {
                Intent parseUri = Intent.parseUri(lVar.f113296b, 0);
                View view2 = this.f76703c.getView();
                view2.getClass();
                C47393f.m84236g(new C27081h(parseUri, view2), this.f76703c);
                C28195j jVar2 = this.f76705e;
                if (jVar2 != null && (view = jVar2.f76734h.getView()) != null) {
                    jVar2.f76732f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
                }
            } catch (URISyntaxException e) {
                ((C59052c) ((C59052c) ((C59052c) f76701a.mo56225c()).mo56382g(e)).mo56372aa(50327)).mo56389s("Erroring handling Web LRP click: %s", lVar.f113296b);
            }
        } else {
            ((C59052c) ((C59052c) f76701a.mo56225c()).mo56372aa(50328)).mo56389s("Attempting to handle request while WebView is not visible: %s", lVar.f113296b);
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        RequestBlockMixin requestBlockMixin = this.f76702b;
        requestBlockMixin.mo46747b(R.id.weblrp_request_allow_accounts_redirect, new C25482a(this.f76706f));
        requestBlockMixin.mo46747b(R.id.weblrp_request_allow_lens_accounts_redirect, new C25487b(this.f76706f));
        requestBlockMixin.mo46749d(R.id.weblrp_request_block_all, new C28199m(this));
        if (this.f76704d.mo30941b() || this.f76704d.mo30940a()) {
            this.f76702b.mo46747b(R.id.weblrp_request_allow_bless_authentication, C25488c.f69445a);
        }
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
