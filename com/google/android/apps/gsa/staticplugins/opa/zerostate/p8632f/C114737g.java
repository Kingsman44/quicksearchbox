package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f;

import android.support.p033v7.widget.C0658ft;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1649b.p1650a.C19604a;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19628b;
import com.google.android.libraries.p1649b.p1655f.C19629c;
import com.google.android.libraries.p1649b.p1655f.C19632f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60218r;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.f.g */
/* compiled from: PG */
public final class C114737g {

    /* renamed from: a */
    final C113798bn f318406a;

    /* renamed from: b */
    private ViewGroup f318407b;

    /* renamed from: c */
    private final AtomicBoolean f318408c = new AtomicBoolean(false);

    public C114737g(C22871g gVar) {
        this.f318406a = new C113798bn(gVar);
    }

    /* renamed from: a */
    public final void mo101562a() {
        this.f318406a.mo24920b();
        this.f318408c.set(false);
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: b */
    public final void mo101563b() {
        if (!this.f318408c.get()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f318406a.mo24921c(new C19623a(3), (C19628b) null);
    }

    /* renamed from: c */
    public final void mo101564c(C60218r rVar, ViewGroup viewGroup) {
        this.f318408c.set(false);
        if (rVar == null || viewGroup == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.zero_state_content_view);
        this.f318407b = viewGroup2;
        if (viewGroup2 == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            return;
        }
        C58976aa aaVar3 = C58975e.f156826a;
        this.f318406a.mo100647a(viewGroup2);
        this.f318406a.mo24921c(new C19623a(7), new C19629c(rVar));
        this.f318406a.mo24921c(new C19623a(2), (C19628b) null);
        this.f318408c.set(true);
        mo101565d();
    }

    /* renamed from: d */
    public final void mo101565d() {
        if (!this.f318408c.get()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C113798bn bnVar = this.f318406a;
        C19623a aVar = new C19623a(5);
        ViewGroup viewGroup = this.f318407b;
        viewGroup.getClass();
        int width = viewGroup.getWidth();
        ViewGroup viewGroup2 = this.f318407b;
        viewGroup2.getClass();
        bnVar.mo24921c(aVar, new C19632f(width, viewGroup2.getHeight()));
    }

    /* renamed from: e */
    public final void mo101566e() {
        if (!this.f318408c.get()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f318406a.mo24921c(new C19623a(2), (C19628b) null);
    }

    /* renamed from: f */
    public final C0658ft mo101567f(boolean z) {
        return new C19604a(this.f318406a, true, z);
    }
}
