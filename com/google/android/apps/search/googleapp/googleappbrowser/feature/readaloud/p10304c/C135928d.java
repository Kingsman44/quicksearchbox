package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10304c;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0678gm;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.apps.gsa.h.l.c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.C135676r;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135914g;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a.C135916i;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10303b.C135923f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.dataservice.C46685ac;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.d */
/* compiled from: PG */
public final class C135928d {

    /* renamed from: k */
    private static final C59071e f370200k = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.d");

    /* renamed from: a */
    public final C135676r f370201a;

    /* renamed from: b */
    public final C46801dp f370202b;

    /* renamed from: c */
    public final C135923f f370203c;

    /* renamed from: d */
    public final C135929a f370204d = new C135929a();

    /* renamed from: e */
    public final Fragment f370205e;

    /* renamed from: f */
    public final C43377v f370206f;

    /* renamed from: g */
    public final c f370207g;

    /* renamed from: h */
    public final boolean f370208h;

    /* renamed from: i */
    public final boolean f370209i;

    /* renamed from: j */
    public boolean f370210j;

    /* renamed from: l */
    private final boolean f370211l;

    /* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.c.d$a */
    /* compiled from: PG */
    final class C135929a implements C46792di, C46685ac {
        public C135929a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C135928d.this.mo112628a(C135914g.READABILITY_STATE_NON_READABLE);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C135928d dVar = C135928d.this;
            C135914g a = C135914g.m220526a(((C135916i) obj).f370171b);
            if (a == null) {
                a = C135914g.READABILITY_STATE_UNKNOWN;
            }
            dVar.mo112628a(a);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }

        /* renamed from: d */
        public final void mo50733d() {
        }

        /* renamed from: e */
        public final void mo50734e(Throwable th) {
            C135928d.this.mo112628a(C135914g.READABILITY_STATE_NON_READABLE);
        }

        /* renamed from: f */
        public final void mo50735f() {
        }
    }

    public C135928d(C135676r rVar, C46801dp dpVar, C135923f fVar, Fragment fragment, boolean z, C43377v vVar, c cVar, boolean z2, boolean z3) {
        this.f370201a = rVar;
        this.f370202b = dpVar;
        this.f370203c = fVar;
        this.f370205e = fragment;
        this.f370211l = z;
        this.f370206f = vVar;
        this.f370207g = cVar;
        this.f370208h = z2;
        this.f370209i = z3;
    }

    /* renamed from: b */
    private final void m220549b(int i, boolean z, boolean z2) {
        View requireView = this.f370205e.requireView();
        if (requireView instanceof TextView) {
            TextView textView = (TextView) requireView;
            textView.setEnabled(z2);
            textView.clearAnimation();
            Drawable c = C0678gm.m2375e().mo3100c(this.f370205e.requireContext(), i);
            if (c != null) {
                c.setBounds(new Rect(0, 0, this.f370205e.requireContext().getResources().getDimensionPixelSize(R.dimen.googleapp_browser_size_overflow_item_icon), this.f370205e.requireContext().getResources().getDimensionPixelSize(R.dimen.googleapp_browser_size_overflow_item_icon)));
                textView.setCompoundDrawablesRelative(c, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (z) {
                if (this.f370211l) {
                    textView.startAnimation(AnimationUtils.loadAnimation(this.f370205e.requireContext(), R.anim.googleapp_browser_listen_fade));
                }
            } else if (z2) {
                textView.setCompoundDrawableTintMode(PorterDuff.Mode.DST);
            } else {
                textView.setAlpha(0.3f);
            }
        }
    }

    /* renamed from: a */
    public final void mo112628a(C135914g gVar) {
        ((C59052c) ((C59052c) f370200k.mo56224b()).mo56372aa(40635)).mo56385o(gVar);
        C135914g gVar2 = C135914g.READABILITY_STATE_UNKNOWN;
        int ordinal = gVar.ordinal();
        if (ordinal == 1) {
            this.f370210j = true;
            m220549b(R.drawable.googleapp_browser_readaloud_listen_colorful, false, true);
        } else if (ordinal == 3) {
            this.f370210j = true;
            m220549b(R.drawable.quantum_gm_ic_record_voice_over_vd_theme_24, true, false);
        } else if (ordinal != 4) {
            this.f370210j = true;
            m220549b(R.drawable.quantum_gm_ic_record_voice_over_vd_theme_24, false, false);
        } else {
            this.f370210j = false;
            m220549b(R.drawable.googleapp_browser_readaloud_listen_colorful, false, true);
        }
    }
}
