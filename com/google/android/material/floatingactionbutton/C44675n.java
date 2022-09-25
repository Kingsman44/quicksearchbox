package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.floatingactionbutton.n */
/* compiled from: PG */
final class C44675n extends C44664c {

    /* renamed from: d */
    final /* synthetic */ ExtendedFloatingActionButton f116455d;

    /* renamed from: e */
    private boolean f116456e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44675n(ExtendedFloatingActionButton extendedFloatingActionButton, C44657a aVar) {
        super(extendedFloatingActionButton, aVar);
        this.f116455d = extendedFloatingActionButton;
    }

    /* renamed from: e */
    public final void mo47939e() {
        this.f116426b.f116382a = null;
        this.f116456e = true;
    }

    /* renamed from: f */
    public final void mo47940f() {
        this.f116426b.f116382a = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f116455d;
        extendedFloatingActionButton.f116350l = 0;
        if (!this.f116456e) {
            extendedFloatingActionButton.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final void mo47941g(Animator animator) {
        C44657a aVar = this.f116426b;
        aVar.mo47923a();
        aVar.f116382a = animator;
        this.f116456e = false;
        this.f116455d.setVisibility(0);
        this.f116455d.f116350l = 1;
    }

    /* renamed from: h */
    public final int mo47942h() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    /* renamed from: i */
    public final void mo47943i() {
        this.f116455d.setVisibility(8);
    }

    /* renamed from: j */
    public final boolean mo47944j() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f116455d;
        int visibility = extendedFloatingActionButton.getVisibility();
        int i = extendedFloatingActionButton.f116350l;
        return visibility == 0 ? i == 1 : i != 2;
    }

    /* renamed from: k */
    public final void mo47945k() {
    }
}
