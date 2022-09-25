package com.google.android.libraries.web.contrib.googlesignin.internal.weblayer;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.contrib.googlesignin.C43585c;
import com.google.android.libraries.web.contrib.googlesignin.GoogleSignInFeatureContract;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;

/* compiled from: PG */
public final class GoogleAccountWebFragmentObserver implements C43773b {

    /* renamed from: a */
    private final Fragment f113820a;

    /* renamed from: b */
    private final C43585c f113821b;

    public GoogleAccountWebFragmentObserver(Fragment fragment, C44084b bVar) {
        this.f113820a = fragment;
        this.f113821b = (C43585c) bVar.mo47055a(GoogleSignInFeatureContract.class, C43585c.class).orElse(null);
    }

    /* renamed from: g */
    private final C43608b m76966g() {
        return (C43608b) new WebModelProvider(this.f113820a).mo47072a(C43608b.class);
    }

    /* renamed from: gV */
    public final /* synthetic */ void mo3520gV(C2391v vVar) {
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
        m76966g().f113826b = this.f113821b;
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        m76966g().f113826b = null;
    }
}
