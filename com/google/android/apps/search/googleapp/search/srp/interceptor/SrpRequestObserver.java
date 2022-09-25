package com.google.android.apps.search.googleapp.search.srp.interceptor;

import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3407g.C43773b;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SrpRequestObserver implements C43773b {

    /* renamed from: a */
    private final RequestBlockMixin f375131a;

    /* renamed from: b */
    private final C137876a f375132b;

    public SrpRequestObserver(RequestBlockMixin requestBlockMixin, C137876a aVar, C43262m mVar) {
        C69664n.m101061g(requestBlockMixin, "requestBlockMixin");
        C69664n.m101061g(aVar, "srpRequestMatchers");
        C69664n.m101061g(mVar, "webController");
        this.f375131a = requestBlockMixin;
        this.f375132b = aVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f375131a.mo46747b(R.id.googleapp_allowed_srp_requests, new C137877b(this.f375132b));
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
