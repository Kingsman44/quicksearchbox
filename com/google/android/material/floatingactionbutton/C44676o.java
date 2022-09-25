package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.floatingactionbutton.o */
/* compiled from: PG */
final class C44676o extends C44664c {

    /* renamed from: d */
    final /* synthetic */ ExtendedFloatingActionButton f116457d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44676o(ExtendedFloatingActionButton extendedFloatingActionButton, C44657a aVar) {
        super(extendedFloatingActionButton, aVar);
        this.f116457d = extendedFloatingActionButton;
    }

    /* renamed from: f */
    public final void mo47940f() {
        this.f116426b.f116382a = null;
        this.f116457d.f116350l = 0;
    }

    /* renamed from: g */
    public final void mo47941g(Animator animator) {
        C44657a aVar = this.f116426b;
        aVar.mo47923a();
        aVar.f116382a = animator;
        this.f116457d.setVisibility(0);
        this.f116457d.f116350l = 2;
    }

    /* renamed from: h */
    public final int mo47942h() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    /* renamed from: i */
    public final void mo47943i() {
        this.f116457d.setVisibility(0);
        this.f116457d.setAlpha(1.0f);
        this.f116457d.setScaleY(1.0f);
        this.f116457d.setScaleX(1.0f);
    }

    /* renamed from: j */
    public final boolean mo47944j() {
        return this.f116457d.mo32798e();
    }

    /* renamed from: k */
    public final void mo47945k() {
    }
}
