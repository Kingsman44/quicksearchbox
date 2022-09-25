package com.google.android.libraries.lens.view.infopanel;

import android.animation.ValueAnimator;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.infopanel.w */
/* compiled from: PG */
public final class C27207w {

    /* renamed from: a */
    public int f74387a = 0;

    /* renamed from: b */
    public int f74388b = 0;

    /* renamed from: c */
    public boolean f74389c = true;

    /* renamed from: d */
    public final C27206v f74390d;

    /* renamed from: e */
    public String f74391e;

    /* renamed from: f */
    public final int f74392f;

    /* renamed from: g */
    public final C26989ag f74393g;

    /* renamed from: h */
    public final InfoPanelHeader f74394h;

    /* renamed from: i */
    public final C47274n f74395i;

    /* renamed from: j */
    public final C47770dh f74396j;

    /* renamed from: k */
    public final C26960a f74397k;

    /* renamed from: l */
    public final C25989d f74398l;

    /* renamed from: m */
    public ValueAnimator f74399m;

    /* renamed from: n */
    boolean f74400n;

    /* renamed from: o */
    boolean f74401o;

    /* renamed from: p */
    float f74402p = -1.0f;

    /* renamed from: q */
    public int f74403q = 1;

    /* renamed from: r */
    private final float f74404r;

    /* renamed from: s */
    private final int f74405s;

    /* renamed from: t */
    private final int f74406t;

    public C27207w(Fragment fragment, C25989d dVar, InfoPanelHeader infoPanelHeader, C26980p pVar, C26989ag agVar, C47770dh dhVar, C47274n nVar, C28306ab abVar, C28310af afVar, boolean z) {
        this.f74393g = agVar;
        this.f74394h = infoPanelHeader;
        this.f74395i = nVar;
        this.f74396j = dhVar;
        this.f74398l = dVar;
        if (z) {
            this.f74397k = ((MultimodalHeaderView) ((ViewStub) infoPanelHeader.findViewById(R.id.search_bar_stub)).inflate()).mo17754z();
        } else {
            this.f74397k = ((ThumbnailHeaderView) ((ViewStub) infoPanelHeader.findViewById(R.id.thumbnail_header_stub)).inflate()).mo17754z();
        }
        this.f74404r = (infoPanelHeader.getResources().getDimension(R.dimen.lens_info_panel_header_margin) + infoPanelHeader.getResources().getDimension(R.dimen.lens_info_panel_down_caret_width)) - infoPanelHeader.getResources().getDimension(R.dimen.lens_info_panel_header_horizontal_margin);
        C27206v vVar = new C27206v(infoPanelHeader);
        this.f74390d = vVar;
        m50456j();
        this.f74405s = nVar.getResources().getDimensionPixelSize(R.dimen.lens_info_panel_header_margin);
        this.f74406t = nVar.getResources().getDimensionPixelSize(R.dimen.lens_info_panel_header_bottom_margin);
        this.f74392f = (int) C28134w.m52424a(72.0f, nVar);
        agVar.f73599f = vVar.f74378c;
        pVar.f73571e.mo5704e(fragment.getViewLifecycleOwner(), new C27201s(this));
        mo32648c(4);
        abVar.mo33801b(infoPanelHeader, afVar.mo33805a(C28427h.m53115a(107626)));
        abVar.mo33801b(vVar.f74384i, afVar.mo33805a(C28427h.m53115a(107569)));
        abVar.mo33801b(vVar.f74378c, afVar.mo33805a(C28427h.m53115a(107596)));
        abVar.mo33801b(vVar.f74381f, afVar.mo33805a(C28427h.m53115a(51778)));
        abVar.mo33801b(vVar.f74379d, afVar.mo33805a(C28427h.m53115a(109191)));
    }

    /* renamed from: f */
    private static float m50452f(float f, float f2, float f3, float f4, float f5) {
        return f > f5 ? f3 : f < f4 ? f2 : (((f3 - f2) * (f - f4)) / (f5 - f4)) + f2;
    }

    /* renamed from: g */
    private static void m50453g(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: h */
    private static void m50454h(int i, View view, boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (z) {
            layoutParams.rightMargin = i;
        } else {
            layoutParams.leftMargin = i;
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: i */
    private static void m50455i(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32646a(float f) {
        if (f != -1.0f) {
            this.f74402p = f;
            float f2 = m50452f(f, 0.0f, 1.0f, 0.8f, 1.0f);
            this.f74390d.f74381f.setAlpha(1.0f - f2);
            int i = 4;
            int i2 = 0;
            this.f74390d.f74381f.setVisibility(f2 < 1.0f ? 0 : 4);
            this.f74390d.f74379d.setAlpha(f2);
            ImageView imageView = this.f74390d.f74379d;
            if (f2 > 0.0f) {
                i = 0;
            }
            imageView.setVisibility(i);
            if (this.f74401o) {
                this.f74397k.mo32386b(f2);
            }
            int i3 = this.f74388b;
            if (i3 != 0) {
                int i4 = this.f74387a;
                this.f74390d.f74380e.setPadding(0, (int) m50452f(f, 0.0f, (float) i4, ((float) (i3 - i4)) / ((float) i3), 1.0f), 0, 0);
            }
            int f3 = (int) m50452f(f, 0.0f, (float) ((int) C28134w.m52424a((float) (true != this.f74401o ? 24 : 56), this.f74395i)), 0.35f, 0.8f);
            this.f74390d.f74383h.setMinimumHeight(f3);
            C26960a aVar = this.f74397k;
            if (true == this.f74401o) {
                i2 = f3;
            }
            aVar.mo32387c(i2);
            if (this.f74403q == 2) {
                m50453g((int) m50452f(f, C28134w.m52424a((float) (true != this.f74400n ? 10 : 16), this.f74395i), C28134w.m52424a(8.0f, this.f74395i), 0.35f, 0.8f), this.f74390d.f74383h);
                m50455i((int) C28134w.m52424a(8.0f, this.f74395i), this.f74390d.f74383h);
            } else {
                m50453g(this.f74406t, this.f74390d.f74383h);
                m50455i(this.f74405s, this.f74390d.f74383h);
            }
            int f4 = (int) m50452f(f, 0.0f, this.f74404r, 0.35f, 0.8f);
            String str = this.f74391e;
            if (str != null && !str.isEmpty()) {
                C27206v vVar = this.f74390d;
                m50454h(f4, vVar.f74384i, vVar.f74386k);
            }
            if (this.f74403q == 3) {
                C27206v vVar2 = this.f74390d;
                m50454h(f4, vVar2.f74378c, vVar2.f74386k);
            }
            this.f74397k.mo32390f(f4);
        }
    }

    /* renamed from: b */
    public final void mo32647b() {
        this.f74390d.f74385j.setAlpha(1.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f74390d.f74385j.getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = -1;
        layoutParams.height = -2;
    }

    /* renamed from: c */
    public final void mo32648c(int i) {
        this.f74390d.f74380e.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo32649d(boolean z) {
        if (this.f74400n != z) {
            this.f74400n = z;
            mo32646a(this.f74402p);
        }
    }

    /* renamed from: e */
    public final void mo32650e(int i) {
        this.f74403q = i;
        m50456j();
        mo32646a(this.f74402p);
    }

    /* renamed from: j */
    private final void m50456j() {
        int i = this.f74403q;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            this.f74393g.mo32450a(false);
            this.f74390d.f74384i.setVisibility(0);
        } else if (i2 == 1) {
            this.f74393g.mo32450a(false);
            this.f74390d.f74384i.setVisibility(8);
        } else if (i2 == 2) {
            this.f74393g.mo32450a(true);
            this.f74390d.f74384i.setVisibility(8);
        }
    }
}
