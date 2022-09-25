package com.google.android.libraries.web.base;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.coordinator.C43730b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.q */
/* compiled from: PG */
public final class C43266q {

    /* renamed from: a */
    public final C43269t f113082a;

    /* renamed from: b */
    public final C28306ab f113083b;

    /* renamed from: c */
    private final Fragment f113084c;

    /* renamed from: d */
    private final C43730b f113085d;

    public C43266q(C43269t tVar, Fragment fragment, C43730b bVar, C28306ab abVar) {
        C69664n.m101061g(tVar, "info");
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f113082a = tVar;
        this.f113084c = fragment;
        this.f113085d = bVar;
        this.f113083b = abVar;
        bVar.mo46766a();
    }

    /* renamed from: a */
    public final Fragment mo46379a() {
        Fragment b = this.f113084c.getChildFragmentManager().f634a.mo670b(R.id.webx_coordinator_fragment_root);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("No content fragment is set. Make sure you called WebCoordinatorFragment#setContentFragment.");
    }

    /* renamed from: b */
    public final void mo46380b(Fragment fragment) {
        FragmentManager childFragmentManager = this.f113084c.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "fragment.childFragmentManager");
        C0154a aVar = new C0154a(childFragmentManager);
        aVar.mo689v(R.id.webx_coordinator_fragment_root, fragment, (String) null);
        aVar.mo509f();
    }
}
