package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.be */
/* compiled from: PG */
final class C115538be extends C23243a {

    /* renamed from: a */
    final /* synthetic */ C115539bf f320475a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115538be(C115539bf bfVar, View view) {
        super(R.id.playback_panel, view);
        this.f320475a = bfVar;
    }

    /* renamed from: c */
    private final void m191657c(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f320475a.f320478c.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.f320475a.f320478c.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        m191657c(this.f320475a.f320476a.getResources().getDimensionPixelSize(R.dimen.omp_playback_panel_height));
        super.mo28675a(dVar);
        C115520an anVar = (C115520an) dVar;
        anVar.f320422v = BottomSheetBehavior.m78767C(anVar.f320409i);
        anVar.f320409i.setOnClickListener(new C115611s(anVar));
        anVar.f320409i.setOnTouchListener(C115831t.f321229a);
        anVar.f320410j.setOnClickListener(new C115833v(anVar));
        anVar.f320422v.mo47508F(new C115516aj(anVar));
        ((C115530ax) anVar.f320402b).f320455c.mo28726b(new C115834w(anVar));
        View findViewById = this.f320475a.mo28297il().findViewById(R.id.mask);
        C115537bd bdVar = new C115537bd(this);
        C115519am amVar = anVar.f320406f;
        amVar.f320385a = findViewById;
        amVar.f320387c = bdVar;
        amVar.f320385a.setOnClickListener(new C115518al(amVar));
    }

    /* renamed from: b */
    public final void mo28676b(C22939d dVar) {
        m191657c(0);
        super.mo28676b(dVar);
    }
}
