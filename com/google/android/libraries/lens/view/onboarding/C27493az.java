package com.google.android.libraries.lens.view.onboarding;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.common.bottompanelscrollview.BottomPanelScrollView;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.p2067ak.C25197ac;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25538u;
import com.google.android.libraries.lens.view.p2078at.C25540w;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.lens.p4711m.C62632i;

/* renamed from: com.google.android.libraries.lens.view.onboarding.az */
/* compiled from: PG */
public final class C27493az extends C27499be {

    /* renamed from: a */
    public final C58833ax f75180a;

    /* renamed from: b */
    public final C25989d f75181b;

    /* renamed from: c */
    public final C27485ar f75182c;

    /* renamed from: d */
    public final C25537t f75183d;

    /* renamed from: e */
    public final C28443m f75184e;

    /* renamed from: f */
    public final C25504aj f75185f;

    /* renamed from: g */
    public final C27232l f75186g;

    /* renamed from: h */
    public final C28448r f75187h;

    /* renamed from: i */
    public final C47770dh f75188i;

    /* renamed from: j */
    public final C25684e f75189j;

    /* renamed from: k */
    public final C28306ab f75190k;

    /* renamed from: m */
    private final C21370a f75191m;

    /* renamed from: n */
    private final C25197ac f75192n;

    /* renamed from: o */
    private final C25540w f75193o;

    /* renamed from: p */
    private int f75194p;

    public C27493az(C58833ax axVar, C21370a aVar, C25989d dVar, C27485ar arVar, C25537t tVar, C28443m mVar, C25197ac acVar, C25504aj ajVar, C27232l lVar, C25540w wVar, C28448r rVar, C47770dh dhVar, C25684e eVar, C28306ab abVar) {
        this.f75180a = axVar;
        this.f75191m = aVar;
        this.f75181b = dVar;
        this.f75182c = arVar;
        this.f75183d = tVar;
        this.f75184e = mVar;
        this.f75192n = acVar;
        this.f75185f = ajVar;
        this.f75186g = lVar;
        this.f75193o = wVar;
        this.f75187h = rVar;
        this.f75188i = dhVar;
        this.f75189j = eVar;
        this.f75190k = abVar;
        arVar.setCancelable(false);
    }

    /* renamed from: a */
    public final void mo33025a(View view, int i) {
        this.f75184e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C47393f.m84237h(new C27483ap(i), view);
        if (mo33028d() && C62632i.m94825j(this.f75186g.mo32701h())) {
            this.f75192n.mo30343c(String.valueOf(this.f75186g.mo32701h().mo56111f()), this.f75186g.mo32694a(), this.f75191m.mo26870b());
        }
    }

    /* renamed from: b */
    public final void mo33026b(BottomPanelScrollView bottomPanelScrollView, boolean z) {
        int i = !z ? R.id.lens_onboarding_more_button : true != mo33027c() ? R.id.lens_onboarding_open_camera_button : R.id.lens_onboarding_open_gallery_button;
        if (i != this.f75194p) {
            this.f75194p = i;
            ViewGroup viewGroup = (ViewGroup) bottomPanelScrollView.findViewById(R.id.lens_warm_welcome_bottom_panel);
            int[] iArr = {R.id.lens_onboarding_open_camera_button, R.id.lens_onboarding_open_gallery_button, R.id.lens_onboarding_more_button};
            int i2 = 0;
            while (i2 < 3) {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    viewGroup.findViewById(i3).setVisibility(i3 == i ? 0 : 8);
                    i2++;
                } else {
                    throw null;
                }
            }
        }
    }

    /* renamed from: c */
    public final boolean mo33027c() {
        return this.f75193o.mo30590a() == C25538u.GALLERY_STARTUP;
    }

    /* renamed from: d */
    public final boolean mo33028d() {
        C58833ax h = this.f75186g.mo32701h();
        if (!this.f75180a.mo56113h() || !this.f75186g.mo32729F((String) this.f75180a.mo56107c())) {
            return false;
        }
        return C62632i.m94825j(h) && this.f75192n.mo30342a(String.valueOf(h.mo56111f()), this.f75186g.mo32694a()) < 0;
    }
}
