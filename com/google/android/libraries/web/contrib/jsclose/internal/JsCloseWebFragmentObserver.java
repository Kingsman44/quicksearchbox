package com.google.android.libraries.web.contrib.jsclose.internal;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.contrib.jsclose.C43671c;
import com.google.android.libraries.web.contrib.jsclose.JsCloseFeatureContract;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;

/* compiled from: PG */
public final class JsCloseWebFragmentObserver implements C43773b {

    /* renamed from: a */
    private final C43861g f113952a;

    /* renamed from: b */
    private final C43671c f113953b;

    public JsCloseWebFragmentObserver(C43861g gVar, C44084b bVar) {
        this.f113952a = gVar;
        this.f113953b = (C43671c) bVar.mo47055a(JsCloseFeatureContract.class, C43671c.class).get();
    }

    /* renamed from: g */
    private final C43673b m77052g() {
        return (C43673b) new WebModelProvider((Fragment) this.f113952a).mo47072a(C43673b.class);
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        new WebModelProvider((Fragment) this.f113952a).mo47072a(C43673b.class);
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
    public final void mo3524gZ(C2391v vVar) {
        C43673b g = m77052g();
        g.f113955a = this.f113953b;
        g.mo46694b();
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        C43673b g = m77052g();
        g.f113955a = null;
        g.mo46694b();
    }
}
