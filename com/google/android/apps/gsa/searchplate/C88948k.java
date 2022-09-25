package com.google.android.apps.gsa.searchplate;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6963a.C88896f;
import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.C90740ax;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.logoview.LogoView;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.searchplate.k */
/* compiled from: PG */
public final class C88948k extends C88896f {

    /* renamed from: a */
    public final LogoView f240958a;

    /* renamed from: b */
    public int f240959b;

    /* renamed from: c */
    public boolean f240960c;

    /* renamed from: d */
    final RelativeLayout.LayoutParams f240961d;

    /* renamed from: e */
    final RelativeLayout.LayoutParams f240962e;

    /* renamed from: f */
    final RelativeLayout.LayoutParams f240963f;

    /* renamed from: g */
    final RelativeLayout.LayoutParams f240964g;

    /* renamed from: h */
    final RelativeLayout.LayoutParams f240965h;

    /* renamed from: i */
    final RelativeLayout.LayoutParams f240966i;

    /* renamed from: j */
    final RelativeLayout.LayoutParams f240967j;

    /* renamed from: k */
    final RelativeLayout.LayoutParams f240968k;

    /* renamed from: l */
    final RelativeLayout.LayoutParams f240969l;

    /* renamed from: m */
    public C88893c f240970m;

    /* renamed from: n */
    private int f240971n;

    /* renamed from: o */
    private boolean f240972o;

    /* renamed from: p */
    private boolean f240973p;

    /* renamed from: q */
    private boolean f240974q;

    /* renamed from: r */
    private RelativeLayout.LayoutParams f240975r;

    /* renamed from: s */
    private C88911am f240976s;

    /* renamed from: t */
    private final C88947j f240977t;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r0 != 11) goto L_0x0063;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m144570i() {
        /*
            r9 = this;
            boolean r0 = r9.f240972o
            r1 = 5
            r2 = 7
            r3 = 2
            r4 = 0
            r5 = 4
            r6 = 1
            if (r0 == 0) goto L_0x000c
            r0 = 5
            goto L_0x0028
        L_0x000c:
            int r0 = r9.f240959b
            if (r0 == r6) goto L_0x0027
            if (r0 == r3) goto L_0x0027
            r7 = 3
            if (r0 == r7) goto L_0x0025
            if (r0 == r5) goto L_0x0023
            if (r0 == r1) goto L_0x0021
            r7 = 9
            if (r0 == r7) goto L_0x001f
            r0 = 0
            goto L_0x0028
        L_0x001f:
            int r0 = r9.f240971n
        L_0x0021:
            r0 = 7
            goto L_0x0028
        L_0x0023:
            r0 = 4
            goto L_0x0028
        L_0x0025:
            r0 = 2
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            boolean r7 = r9.f240973p
            if (r7 != 0) goto L_0x0030
            boolean r7 = r9.f240974q
            if (r7 == 0) goto L_0x0035
        L_0x0030:
            if (r0 == r2) goto L_0x0034
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r0 = 4
        L_0x0035:
            if (r0 != 0) goto L_0x003d
            com.google.android.libraries.gsa.logoview.LogoView r0 = r9.f240958a
            com.google.android.libraries.gsa.logoview.ak r0 = r0.f63000g
            int r0 = r0.f63060j
        L_0x003d:
            com.google.android.libraries.gsa.logoview.LogoView r7 = r9.f240958a
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2132085942(0x7f150cb6, float:1.9812097E38)
            java.lang.String r8 = r7.getString(r8)
            if (r0 == r6) goto L_0x006d
            if (r0 == r3) goto L_0x0065
            if (r0 == r5) goto L_0x006d
            if (r0 == r1) goto L_0x0065
            r1 = 6
            if (r0 == r1) goto L_0x005c
            if (r0 == r2) goto L_0x005c
            r1 = 11
            if (r0 == r1) goto L_0x0065
            goto L_0x0063
        L_0x005c:
            r1 = 2132093613(0x7f152aad, float:1.9827656E38)
            java.lang.String r8 = r7.getString(r1)
        L_0x0063:
            r6 = 0
            goto L_0x0074
        L_0x0065:
            r1 = 2132093612(0x7f152aac, float:1.9827654E38)
            java.lang.String r8 = r7.getString(r1)
            goto L_0x0074
        L_0x006d:
            r1 = 2132093611(0x7f152aab, float:1.9827652E38)
            java.lang.String r8 = r7.getString(r1)
        L_0x0074:
            com.google.android.libraries.gsa.logoview.LogoView r1 = r9.f240958a
            r1.setKeepScreenOn(r6)
            com.google.android.libraries.gsa.logoview.LogoView r1 = r9.f240958a
            r1.mo28225e(r0, r4)
            com.google.android.libraries.gsa.logoview.LogoView r0 = r9.f240958a
            r0.setContentDescription(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchplate.C88948k.m144570i():void");
    }

    /* renamed from: l */
    private final void m144571l(int i) {
        if (SearchPlate.m144343A(i)) {
            this.f240975r.removeRule(10);
            if ((i & C89885b.NOW_VALUE) != 0) {
                this.f240975r.addRule(3, R.id.language_spinner_nudge);
            } else {
                this.f240975r.addRule(3, R.id.voice_search_language_spinner_container);
            }
        }
    }

    /* renamed from: m */
    private final boolean m144572m() {
        return this.f240958a.getResources().getConfiguration().orientation == 1;
    }

    /* renamed from: b */
    public final void mo81838b() {
        this.f240958a.setAlpha(1.0f);
    }

    /* renamed from: c */
    public final void mo82744c(C88893c cVar) {
        this.f240970m = cVar;
    }

    /* renamed from: d */
    public final void mo82745d(int i, String str, String str2) {
        boolean z = true;
        this.f240972o = (i & 16) != 0;
        this.f240974q = (i & 8192) != 0;
        if ((i & 64) == 0) {
            z = false;
        }
        this.f240960c = z;
        m144570i();
    }

    /* renamed from: e */
    public final void mo82746e(double d) {
    }

    /* renamed from: f */
    public final void mo82747f(boolean z) {
        this.f240973p = z;
        m144570i();
    }

    /* renamed from: g */
    public final void mo82748g(int i) {
        this.f240959b = i;
        m144570i();
    }

    /* renamed from: h */
    public final void mo82749h(C90740ax axVar) {
        if (this.f240976s == null) {
            this.f240976s = new C88911am();
        }
        C88911am amVar = this.f240976s;
        amVar.f240858a = axVar;
        this.f240958a.f63000g.mo28247c(amVar, 2);
    }

    public C88948k(LogoView logoView) {
        boolean z;
        LogoView logoView2 = logoView;
        this.f240958a = logoView2;
        C88947j jVar = new C88947j();
        this.f240977t = jVar;
        logoView2.f63002i = new C88945h(this);
        C88945h hVar = logoView2.f63002i;
        if (hVar != null) {
            if (logoView2.f63000g.f63060j == 6) {
                z = true;
                if (logoView2.f62998e == 255 && logoView2.f62999f == 0) {
                    z = false;
                }
            } else {
                z = logoView2.f62996c.isStarted();
            }
            hVar.mo82832a(z);
        }
        logoView2.f63000g.mo28247c(jVar, 5);
        Resources resources = logoView.getResources();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.voice_input_logo_view_size), resources.getDimensionPixelSize(R.dimen.voice_input_logo_view_size));
        this.f240961d = layoutParams;
        layoutParams.addRule(14);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.voice_input_logo_view_size), resources.getDimensionPixelSize(R.dimen.voice_input_logo_view_size));
        this.f240962e = layoutParams2;
        layoutParams2.addRule(14);
        layoutParams2.addRule(3, R.id.opa_assistant_logo);
        C88939k.m144551g(layoutParams2, 0, resources.getDimensionPixelSize(R.dimen.logo_view_assistant_style_top_margin), 0, 0);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.logo_view_size_with_assistant_logo_and_nudge), resources.getDimensionPixelSize(R.dimen.logo_view_size_with_assistant_logo_and_nudge));
        this.f240963f = layoutParams3;
        layoutParams3.addRule(14);
        layoutParams3.addRule(3, R.id.opa_assistant_logo);
        C88939k.m144551g(layoutParams3, 0, resources.getDimensionPixelSize(R.dimen.logo_view_assistant_style_top_margin), 0, 0);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.voice_result_logo_view_size), resources.getDimensionPixelSize(R.dimen.voice_result_logo_view_size));
        this.f240964g = layoutParams4;
        layoutParams4.addRule(15);
        layoutParams4.addRule(21);
        C88939k.m144551g(layoutParams4, 0, 0, resources.getDimensionPixelSize(R.dimen.logo_margin), 0);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.logo_view_size), resources.getDimensionPixelSize(R.dimen.logo_view_size));
        this.f240966i = layoutParams5;
        layoutParams5.addRule(15);
        layoutParams5.addRule(21);
        C88939k.m144551g(layoutParams5, 0, 0, resources.getDimensionPixelSize(R.dimen.logo_margin), 0);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.logo_view_size), resources.getDimensionPixelSize(R.dimen.logo_view_size));
        this.f240965h = layoutParams6;
        layoutParams6.addRule(10);
        layoutParams6.addRule(21);
        C88939k.m144551g(layoutParams6, 0, resources.getDimensionPixelSize(R.dimen.logo_margin), resources.getDimensionPixelSize(R.dimen.logo_margin), 0);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.logo_view_size_with_assistant_logo_and_nudge), resources.getDimensionPixelSize(R.dimen.logo_view_size_with_assistant_logo_and_nudge));
        this.f240967j = layoutParams7;
        layoutParams7.addRule(14);
        layoutParams7.addRule(10);
        C88939k.m144551g(layoutParams7, 0, resources.getDimensionPixelSize(R.dimen.logo_view_classic_with_animation_top_margin), 0, 0);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.logo_view_size_with_assistant_logo_and_nudge), resources.getDimensionPixelSize(R.dimen.logo_view_size_with_assistant_logo_and_nudge));
        this.f240969l = layoutParams8;
        layoutParams8.addRule(14);
        layoutParams8.addRule(3, R.id.opa_assistant_logo);
        C88939k.m144551g(layoutParams8, 0, resources.getDimensionPixelSize(R.dimen.logo_view_assistant_style_with_animation_top_margin), 0, 0);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.logo_view_size_with_assistant_logo_and_nudge), resources.getDimensionPixelSize(R.dimen.logo_view_size_with_assistant_logo_and_nudge));
        this.f240968k = layoutParams9;
        layoutParams9.addRule(14);
        layoutParams9.addRule(10);
        C88939k.m144551g(layoutParams9, 0, resources.getDimensionPixelSize(R.dimen.logo_view_full_screen_voice_plate_top_margin), 0, 0);
        logoView2.setOnClickListener(new C89943l(new C88946i(this)));
        C28292j jVar2 = new C28292j(96087);
        jVar2.mo33795i(5);
        C28295m.m52919e(logoView2, jVar2);
    }

    /* renamed from: a */
    public final void mo81837a(int i, int i2, boolean z) {
        this.f240971n = i;
        if (i == 2) {
            this.f240959b = 1;
            m144570i();
        } else if (i != 4) {
            if (i == 5) {
                if ((i2 & 4) != 0) {
                    this.f240974q = true;
                }
                this.f240959b = 5;
                m144570i();
            } else if (i == 6) {
                this.f240959b = 2;
                m144570i();
            } else if (i == 7) {
                this.f240959b = 5;
                m144570i();
            }
        } else if ((i2 & 4) != 0) {
            this.f240974q = true;
        }
        this.f240958a.setBackground((Drawable) null);
        RelativeLayout.LayoutParams layoutParams = this.f240975r;
        if (i != 2) {
            this.f240975r = i == 7 ? this.f240965h : (i == 6 || i == 5) ? this.f240966i : this.f240964g;
        } else if (SearchPlate.m144361w(i2) && m144572m()) {
            this.f240975r = this.f240968k;
            m144571l(i2);
        } else if (SearchPlate.m144360v(i2) && m144572m()) {
            this.f240975r = this.f240969l;
        } else if (SearchPlate.m144362x(i2)) {
            this.f240975r = this.f240967j;
            m144571l(i2);
        } else if ((i2 & 16) != 0) {
            this.f240975r = (m144572m() || (i2 & 2048) == 0) ? this.f240962e : this.f240963f;
        } else {
            this.f240975r = this.f240961d;
            m144571l(i2);
        }
        RelativeLayout.LayoutParams layoutParams2 = this.f240975r;
        if (layoutParams != layoutParams2) {
            this.f240958a.setLayoutParams(layoutParams2);
            if (SearchPlate.m144362x(i2) || (SearchPlate.m144360v(i2) && m144572m())) {
                this.f240958a.mo28223c(54.0f, 54.0f);
            }
            if (!z) {
                this.f240958a.setAlpha(0.0f);
            }
        }
    }
}
