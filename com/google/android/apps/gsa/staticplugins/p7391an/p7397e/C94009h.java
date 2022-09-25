package com.google.android.apps.gsa.staticplugins.p7391an.p7397e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.gsa.now.shared.p6421ui.C83423l;
import com.google.android.apps.gsa.now.shared.p6421ui.WebImageView;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.search.doodle.C90496b;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.sidekick.shared.util.C91958ai;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.h */
/* compiled from: PG */
public final class C94009h implements C83423l {

    /* renamed from: a */
    public static final C59071e f262558a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.e.h");

    /* renamed from: b */
    public final DoodleData f262559b;

    /* renamed from: c */
    public final C94015n f262560c;

    /* renamed from: d */
    public final Context f262561d;

    /* renamed from: e */
    public final C91189au f262562e;

    /* renamed from: f */
    public final C90496b f262563f;

    /* renamed from: g */
    public final C22871g f262564g;

    /* renamed from: h */
    public final C22871g f262565h;

    /* renamed from: i */
    public final boolean f262566i;

    /* renamed from: j */
    public C60870cx f262567j;

    /* renamed from: k */
    WebImageView f262568k;

    /* renamed from: l */
    public boolean f262569l = false;

    /* renamed from: m */
    View f262570m;

    /* renamed from: n */
    public int f262571n = 0;

    /* renamed from: o */
    public boolean f262572o;

    /* renamed from: p */
    public boolean f262573p;

    /* renamed from: q */
    C94007f f262574q;

    /* renamed from: r */
    private final Rect f262575r;

    /* renamed from: s */
    private final Point f262576s;

    /* renamed from: t */
    private final int f262577t;

    /* renamed from: u */
    private final boolean f262578u;

    /* renamed from: v */
    private final boolean f262579v;

    /* renamed from: w */
    private ViewGroup f262580w;

    public C94009h(DoodleData doodleData, C94015n nVar, Rect rect, Point point, int i, boolean z, boolean z2, boolean z3, Context context, C91189au auVar, C22871g gVar, C22871g gVar2) {
        this.f262559b = doodleData;
        this.f262560c = nVar;
        this.f262561d = context;
        this.f262575r = rect;
        this.f262576s = point;
        this.f262577t = i;
        this.f262578u = z;
        this.f262566i = z2;
        this.f262579v = z3;
        this.f262562e = auVar;
        this.f262564g = gVar;
        this.f262565h = gVar2;
        this.f262563f = new C90496b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C94007f m155178h(byte[] r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0038
            android.support.rastermill.FrameSequence r4 = android.support.rastermill.FrameSequence.decodeByteArray(r4)     // Catch:{ IllegalArgumentException -> 0x0019, IllegalStateException -> 0x0017, UnsatisfiedLinkError -> 0x0008 }
            goto L_0x002a
        L_0x0008:
            r4 = move-exception
            com.google.common.f.e r1 = f262558a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Error loading rastermill native library"
            r3 = 19375(0x4baf, float:2.715E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r4)).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0029
        L_0x0017:
            r4 = move-exception
            goto L_0x001a
        L_0x0019:
            r4 = move-exception
        L_0x001a:
            com.google.common.f.e r1 = f262558a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Error decoding doodle GIF"
            r3 = 19374(0x4bae, float:2.7149E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r4)).mo56372aa(r3)).mo56386p(r2)
            int r4 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x0029:
            r4 = r0
        L_0x002a:
            if (r4 != 0) goto L_0x002d
            return r0
        L_0x002d:
            com.google.android.apps.gsa.staticplugins.an.e.f r0 = new com.google.android.apps.gsa.staticplugins.an.e.f
            com.google.android.apps.gsa.staticplugins.an.e.g r1 = new com.google.android.apps.gsa.staticplugins.an.e.g
            r1.<init>(r4)
            r0.<init>(r1)
            return r0
        L_0x0038:
            com.google.common.f.e r4 = f262558a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r1 = "null GIF data"
            r2 = 19372(0x4bac, float:2.7146E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r2)).mo56386p(r1)
            int r4 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C94009h.m155178h(byte[]):com.google.android.apps.gsa.staticplugins.an.e.f");
    }

    /* renamed from: i */
    private final int m155179i() {
        if (this.f262566i) {
            return this.f262559b.f252925F;
        }
        return this.f262559b.f252945k;
    }

    /* renamed from: j */
    private final void m155180j(ImageButton imageButton, boolean z) {
        int dimensionPixelSize = this.f262561d.getResources().getDimensionPixelSize(R.dimen.rounded_doodle_button_size);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.addRule(true != z ? 21 : 20);
        layoutParams.addRule(10);
        imageButton.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo76758a(Drawable drawable) {
        if (drawable == null || ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null)) {
            this.f262560c.mo88291b();
        } else if (this.f262568k != null) {
            this.f262571n = this.f262566i ? this.f262559b.f252922C : this.f262559b.f252947m;
            C90496b.m147523c(this.f262570m, this.f262559b);
            this.f262569l = true;
            mo88284g(drawable);
            this.f262560c.mo88297h(this.f262570m, mo88279b());
        }
    }

    /* renamed from: b */
    public final int mo88279b() {
        return this.f262566i ? this.f262559b.f252926G : this.f262559b.f252946l;
    }

    /* renamed from: c */
    public final View mo88280c(View view) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f262561d).inflate(R.layout.now_header_doodle_for_particle_disc, this.f262560c.mo88290a(), false);
        Resources resources = this.f262561d.getResources();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.doodle_image_container);
        this.f262580w = viewGroup2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (this.f262578u) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius((float) resources.getDimensionPixelSize(R.dimen.rounded_doodle_corner_radius));
            gradientDrawable.setColor(m155179i());
            this.f262580w.setBackground(gradientDrawable);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.rounded_doodle_button_inside_edge_margin) + resources.getDimensionPixelSize(R.dimen.rounded_doodle_button_outside_edge_margin) + resources.getDimensionPixelSize(R.dimen.rounded_doodle_button_size);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.rounded_doodle_vertical_padding);
            this.f262580w.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            layoutParams.height = this.f262576s.y + dimensionPixelSize2 + dimensionPixelSize2;
            layoutParams.width = this.f262577t;
            layoutParams.addRule(10);
            layoutParams.addRule(14);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.rounded_doodle_vertical_margin);
            layoutParams.topMargin = this.f262575r.top + dimensionPixelSize3;
            layoutParams.bottomMargin = dimensionPixelSize3;
            this.f262580w.setLayoutParams(layoutParams);
        } else {
            this.f262580w.setBackgroundColor(m155179i());
            this.f262580w.setPadding(this.f262575r.left, 0, this.f262575r.right, 0);
        }
        int argb = Color.argb(0, Color.red(m155179i()), Color.green(m155179i()), Color.blue(m155179i()));
        View findViewById = viewGroup.findViewById(R.id.now_header_doodle_gradient);
        findViewById.getClass();
        if (!this.f262578u) {
            findViewById.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{m155179i(), argb}));
        } else {
            viewGroup.removeView(findViewById);
            layoutParams.addRule(12);
        }
        this.f262580w.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(R.id.doodle_button_container);
        ImageButton imageButton = (ImageButton) relativeLayout.findViewById(R.id.doodle_share_button);
        ImageButton imageButton2 = (ImageButton) relativeLayout.findViewById(R.id.doodle_search_button);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        relativeLayout.setPadding(this.f262575r.left, 0, this.f262575r.right, 0);
        layoutParams2.width = this.f262577t + this.f262575r.left + this.f262575r.right;
        layoutParams2.topMargin = this.f262575r.top + resources.getDimensionPixelSize(true != this.f262578u ? R.dimen.now_header_doodle_button_margin_top : R.dimen.rounded_doodle_vertical_margin);
        if (this.f262579v) {
            layoutParams2.removeRule(10);
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = this.f262561d.getResources().getDimensionPixelSize(R.dimen.rounded_doodle_vertical_margin);
        }
        relativeLayout.setLayoutParams(layoutParams2);
        if (this.f262559b.f252956v) {
            imageButton.setColorFilter(mo88279b());
            imageButton.setOnClickListener(new C94004c(this));
            if (this.f262578u) {
                m155180j(imageButton, false);
            }
            C28292j jVar = new C28292j(7267);
            jVar.mo33795i(5);
            C28295m.m52919e(imageButton, jVar);
        } else {
            imageButton2.setLayoutParams(imageButton.getLayoutParams());
            relativeLayout.removeView(imageButton);
        }
        if (this.f262559b.f252955u) {
            imageButton2.setColorFilter(mo88279b());
            imageButton2.setOnClickListener(new C94005d(this));
            if (this.f262578u) {
                m155180j(imageButton2, true);
            }
            C28292j jVar2 = new C28292j(20971);
            jVar2.mo33795i(5);
            C28295m.m52919e(imageButton2, jVar2);
        } else {
            relativeLayout.removeView(imageButton2);
        }
        ViewGroup viewGroup3 = this.f262580w;
        viewGroup3.getClass();
        viewGroup3.addView(view);
        return viewGroup;
    }

    /* renamed from: d */
    public final void mo88281d() {
        mo88283f();
        C60870cx cxVar = this.f262567j;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f262567j = null;
        }
        WebImageView webImageView = this.f262568k;
        if (webImageView != null && this.f262569l) {
            webImageView.setImageDrawable((Drawable) null);
        }
        C94007f fVar = this.f262574q;
        if (fVar != null) {
            fVar.f262556a.stop();
            fVar.f262556a.destroy();
            this.f262574q = null;
        }
        this.f262571n = 0;
        this.f262573p = true;
    }

    /* renamed from: e */
    public final void mo88282e() {
        String str = this.f262566i ? this.f262559b.f252921B : this.f262559b.f252942h;
        if (TextUtils.isEmpty(str)) {
            str = null;
        } else if (C91958ai.m150914d(str)) {
            str = C91958ai.m150913c(String.format(Locale.US, "w%d-h%d", new Object[]{Integer.valueOf(this.f262576s.x), Integer.valueOf(this.f262576s.y)}), str).toString();
        }
        if (str != null) {
            WebImageView webImageView = new WebImageView(this.f262561d);
            this.f262568k = webImageView;
            webImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            WebImageView webImageView2 = this.f262568k;
            webImageView2.f227358h = this;
            webImageView2.setContentDescription(this.f262559b.f252939e);
            this.f262570m = mo88280c(this.f262568k);
            this.f262569l = false;
            this.f262568k.mo76738i(str, this.f262562e);
        }
    }

    /* renamed from: f */
    public final void mo88283f() {
        C94007f fVar = this.f262574q;
        if (fVar != null) {
            fVar.mo88276a();
        }
        this.f262572o = true;
    }

    /* renamed from: g */
    public final void mo88284g(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Point point = this.f262576s;
        Point point2 = new Point();
        point2.y = point.y;
        point2.x = (int) (((float) point.y) * (((float) intrinsicWidth) / ((float) intrinsicHeight)));
        if (point2.x > point.x) {
            float f = ((float) point.x) / ((float) point2.x);
            point2.y = (int) (((float) point2.y) * f);
            point2.x = (int) (((float) point2.x) * f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(point2.x, point2.y, 81);
        WebImageView webImageView = this.f262568k;
        webImageView.getClass();
        webImageView.setLayoutParams(layoutParams);
    }
}
