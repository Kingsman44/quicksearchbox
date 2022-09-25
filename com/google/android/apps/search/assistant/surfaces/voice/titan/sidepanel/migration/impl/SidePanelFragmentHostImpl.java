package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.migration.impl;

import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public final class SidePanelFragmentHostImpl implements C2376g {

    /* renamed from: a */
    public static final C59071e f353663a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.migration.impl.SidePanelFragmentHostImpl");

    /* renamed from: b */
    public final C128649c f353664b;

    /* renamed from: c */
    public final C2384o f353665c;

    /* renamed from: d */
    public final FrameLayout f353666d;

    public SidePanelFragmentHostImpl(Window window, FrameLayout frameLayout, C2384o oVar) {
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        this.f353666d = frameLayout2;
        frameLayout2.setId(R.id.assistant_side_panel_fragment_root_id);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        C128649c cVar = new C128649c();
        cVar.mo51130t(window, frameLayout2, frameLayout2.getContext());
        this.f353664b = cVar;
        this.f353665c = oVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f353664b.mo19987jP((Bundle) null);
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        this.f353664b.mo51129jQ();
        this.f353665c.mo5791c(this);
    }

    /* renamed from: gX */
    public final void mo3522gX(C2391v vVar) {
        this.f353664b.mo51126e();
    }

    /* renamed from: gY */
    public final void mo3523gY(C2391v vVar) {
        this.f353664b.mo51127f();
    }

    /* renamed from: gZ */
    public final void mo3524gZ(C2391v vVar) {
        this.f353664b.mo51128g();
    }

    /* renamed from: ha */
    public final void mo3525ha(C2391v vVar) {
        this.f353664b.mo22016h();
    }
}
