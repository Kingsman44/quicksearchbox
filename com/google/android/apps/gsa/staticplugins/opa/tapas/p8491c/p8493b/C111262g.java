package com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8493b;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.viewpager.widget.ViewPager;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111249l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111250m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.tabs.TabLayout;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.c.b.g */
/* compiled from: PG */
public final class C111262g implements C111249l {

    /* renamed from: a */
    public final Context f309608a;

    /* renamed from: b */
    public final C58485gu f309609b;

    /* renamed from: c */
    public final C84469a f309610c;

    /* renamed from: d */
    public WindowManager f309611d;

    /* renamed from: e */
    public ViewGroup f309612e;

    /* renamed from: f */
    public WindowManager.LayoutParams f309613f;

    /* renamed from: g */
    public ViewPager f309614g;

    /* renamed from: h */
    public Button f309615h;

    /* renamed from: i */
    public int f309616i;

    /* renamed from: j */
    public int f309617j;

    /* renamed from: k */
    public int f309618k;

    /* renamed from: l */
    public int f309619l;

    /* renamed from: m */
    private final C86124t f309620m;

    /* renamed from: n */
    private final boolean f309621n;

    /* renamed from: o */
    private final Optional f309622o;

    /* renamed from: p */
    private boolean f309623p = false;

    public C111262g(Context context, C86124t tVar, C58485gu guVar, boolean z, Optional optional, C84469a aVar) {
        this.f309608a = context;
        this.f309620m = tVar;
        this.f309609b = guVar;
        this.f309621n = z;
        this.f309622o = optional;
        this.f309610c = aVar;
    }

    /* renamed from: a */
    public final void mo99078a() {
        Display display;
        boolean e = this.f309620m.mo79746e(C90063do.f249318bK);
        int i = 0;
        if (!e) {
            mo99092c();
        } else if (!this.f309621n) {
            Toast.makeText(this.f309608a, "Google App does not have Overlay permission. Grant this permission and enable the debug panel.", 0).show();
            return;
        } else {
            if (this.f309612e == null && !this.f309622o.isEmpty()) {
                this.f309612e = (ViewGroup) ((C68214a) this.f309622o.get()).mo27525b();
                C111261f fVar = new C111261f();
                C58485gu guVar = this.f309609b;
                int size = guVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C111250m mVar = (C111250m) guVar.get(i2);
                    FrameLayout frameLayout = new FrameLayout(this.f309608a);
                    mVar.mo99082d(frameLayout);
                    String c = mVar.mo99081c();
                    fVar.f309606c.add(frameLayout);
                    fVar.f309607d.add(c);
                }
                ViewPager viewPager = (ViewPager) this.f309612e.findViewById(R.id.debug_panel_view_pager);
                this.f309614g = viewPager;
                viewPager.mo9146k(fVar);
                this.f309614g.mo9137f(new C111259d(this));
                ((TabLayout) this.f309612e.findViewById(R.id.debug_panel_tabs_bar)).mo48419n(this.f309614g, false);
                int dimensionPixelSize = this.f309608a.getResources().getDimensionPixelSize(R.dimen.debug_panel_min_edge_dist);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, C89885b.HTTP_STRING_CONNECTION_GET_INPUT_STREAM_FAILED_VALUE, -3);
                layoutParams.gravity = 49;
                layoutParams.x = 0;
                layoutParams.y = dimensionPixelSize;
                this.f309613f = layoutParams;
                this.f309611d = (WindowManager) Objects.requireNonNull((WindowManager) this.f309608a.getSystemService("window"));
                if (Build.VERSION.SDK_INT <= 30) {
                    display = ((WindowManager) Objects.requireNonNull(this.f309611d)).getDefaultDisplay();
                } else {
                    display = (Display) Objects.requireNonNull(this.f309608a.getDisplay());
                }
                Point point = new Point();
                display.getSize(point);
                this.f309616i = -this.f309608a.getResources().getDimensionPixelSize(R.dimen.debug_panel_start_margin_deficit);
                this.f309617j = (point.x - this.f309608a.getResources().getDimensionPixelOffset(R.dimen.debug_panel_width)) - dimensionPixelSize;
                this.f309618k = dimensionPixelSize;
                this.f309619l = point.y - this.f309608a.getResources().getDimensionPixelOffset(R.dimen.debug_panel_header_height);
                Context context = this.f309608a;
                ViewGroup viewGroup = this.f309612e;
                if (viewGroup != null) {
                    View findViewById = viewGroup.findViewById(R.id.debug_panel_content);
                    ImageView imageView = (ImageView) this.f309612e.findViewById(R.id.debug_panel_expand_collapse);
                    imageView.setOnClickListener(new C111256a(this, findViewById, imageView, context));
                }
                this.f309612e.findViewById(R.id.debug_panel_drag).setOnTouchListener(new C111260e(this));
                Button button = (Button) this.f309612e.findViewById(R.id.copy_btn);
                this.f309615h = button;
                button.setOnClickListener(new C111257b(this));
                this.f309615h.setOnLongClickListener(new C111258c(this));
            }
            if (!this.f309623p && this.f309613f != null) {
                ((WindowManager) Objects.requireNonNull(this.f309611d)).addView((View) Objects.requireNonNull(this.f309612e), this.f309613f);
                this.f309623p = true;
            }
            if (((ViewGroup) Objects.requireNonNull(this.f309612e)).findViewById(R.id.debug_panel_content).getVisibility() == 0) {
                mo99091b();
            }
        }
        ViewGroup viewGroup2 = this.f309612e;
        if (viewGroup2 != null) {
            if (true != e) {
                i = 8;
            }
            viewGroup2.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo99091b() {
        ((C111250m) this.f309609b.get(((ViewPager) Objects.requireNonNull(this.f309614g)).mo9122a())).mo99085g(true);
    }

    /* renamed from: c */
    public final void mo99092c() {
        C58485gu guVar = this.f309609b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            ((C111250m) guVar.get(i)).mo99085g(false);
        }
    }
}
