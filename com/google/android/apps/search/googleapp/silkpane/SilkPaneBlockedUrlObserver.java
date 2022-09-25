package com.google.android.apps.search.googleapp.silkpane;

import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3407g.C43773b;

/* compiled from: PG */
public final class SilkPaneBlockedUrlObserver implements C43773b {

    /* renamed from: a */
    public final C139795f f378798a;

    /* renamed from: b */
    public final boolean f378799b;

    /* renamed from: c */
    public final boolean f378800c;

    /* renamed from: d */
    public final C136832c f378801d;

    /* renamed from: e */
    private final RequestBlockMixin f378802e;

    public SilkPaneBlockedUrlObserver(RequestBlockMixin requestBlockMixin, C139795f fVar, C136832c cVar, boolean z, boolean z2) {
        this.f378802e = requestBlockMixin;
        this.f378798a = fVar;
        this.f378799b = z;
        this.f378800c = z2;
        this.f378801d = cVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f378802e.mo46748c(R.id.googleapp_silk_pane_blocked_url, new C139287i(this), new C139288j(this));
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
