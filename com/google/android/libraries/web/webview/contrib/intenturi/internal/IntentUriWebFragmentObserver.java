package com.google.android.libraries.web.webview.contrib.intenturi.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.webview.contrib.intenturi.p3477a.C44377c;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class IntentUriWebFragmentObserver implements C43773b {

    /* renamed from: a */
    public static final C59071e f115379a = C59071e.m91331h();

    /* renamed from: b */
    public final C43262m f115380b;

    /* renamed from: c */
    public final C44377c f115381c;

    /* renamed from: d */
    private final RequestBlockMixin f115382d;

    /* renamed from: e */
    private final Fragment f115383e;

    public IntentUriWebFragmentObserver(C43262m mVar, RequestBlockMixin requestBlockMixin, C44377c cVar, Fragment fragment) {
        C69664n.m101061g(mVar, "webController");
        C69664n.m101061g(requestBlockMixin, "requestBlockMixin");
        C69664n.m101061g(cVar, "intentUriResolver");
        C69664n.m101061g(fragment, "fragment");
        this.f115380b = mVar;
        this.f115382d = requestBlockMixin;
        this.f115381c = cVar;
        this.f115383e = fragment;
    }

    /* renamed from: g */
    public final void mo47272g(Intent intent) {
        try {
            C47709i.m84861a(this.f115383e, intent);
        } catch (ActivityNotFoundException unused) {
            C59052c cVar = (C59052c) f115379a.mo56226d();
            cVar.mo56379ah(new C59094n(54222));
            cVar.mo56386p("Unable to launch the intent:// URI");
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f115382d.mo46748c(R.id.webx_intent_uri_requests, C44378a.f115384a, new C44379b(this));
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
