package com.google.android.libraries.web.contrib.contextmenu.internal;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.web.contrib.contextmenu.C43440b;
import com.google.android.libraries.web.contrib.contextmenu.ContextMenuFeatureContract;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;

/* compiled from: PG */
public final class ContextMenuWebFragmentObserver implements C43773b {

    /* renamed from: a */
    public final C43861g f113526a;

    /* renamed from: b */
    public final C43440b f113527b;

    public ContextMenuWebFragmentObserver(C43861g gVar, C44084b bVar) {
        this.f113526a = gVar;
        this.f113527b = (C43440b) bVar.mo47055a(ContextMenuFeatureContract.class, C43440b.class).get();
    }

    /* renamed from: g */
    private final C43461c m76680g() {
        return (C43461c) new WebModelProvider((Fragment) this.f113526a).mo47072a(C43461c.class);
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        new WebModelProvider((Fragment) this.f113526a).mo47072a(C43461c.class);
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
        m76680g().f113533a = new C43455a(this);
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        m76680g().f113533a = null;
    }
}
