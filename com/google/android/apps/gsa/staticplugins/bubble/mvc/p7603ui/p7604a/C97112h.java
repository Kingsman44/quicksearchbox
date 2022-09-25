package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import android.content.Context;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90003bi;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97214b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97218f;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97219g;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97040c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10982ad.C147445i;
import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h */
/* compiled from: PG */
public final class C97112h {

    /* renamed from: a */
    public static final C59071e f271332a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.h");

    /* renamed from: b */
    public static final C147454r f271333b = new C147454r(300.0f, 0.7f);

    /* renamed from: c */
    public static final C147454r f271334c = new C147454r(300.0f, 0.6f);

    /* renamed from: d */
    public static final C147454r f271335d = new C147454r(3000.0f, 0.4f);

    /* renamed from: e */
    public final C97124t f271336e;

    /* renamed from: f */
    public final C97040c f271337f;

    /* renamed from: g */
    public final C86124t f271338g;

    /* renamed from: h */
    public final View f271339h;

    /* renamed from: i */
    public final WindowManager f271340i;

    /* renamed from: j */
    public final DisplayManager f271341j;

    /* renamed from: k */
    public final C147445i f271342k;

    /* renamed from: l */
    public final C97106b f271343l;

    /* renamed from: m */
    public int f271344m;

    /* renamed from: n */
    public final boolean f271345n;

    /* renamed from: o */
    public int f271346o = 1;

    /* renamed from: p */
    private final Context f271347p;

    /* renamed from: q */
    private final int f271348q;

    public C97112h(Context context, C97124t tVar, C97040c cVar, C86124t tVar2, View view, C147445i iVar, int i, boolean z) {
        C97106b bVar = new C97106b();
        C147454r rVar = f271335d;
        bVar.f271316b.f397996b = rVar;
        bVar.f271317c.f397996b = rVar;
        this.f271343l = bVar;
        this.f271347p = context;
        this.f271336e = tVar;
        this.f271337f = cVar;
        this.f271338g = tVar2;
        this.f271339h = view;
        this.f271342k = iVar;
        this.f271340i = (WindowManager) context.getSystemService("window");
        this.f271341j = (DisplayManager) context.getSystemService("display");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        this.f271348q = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        this.f271344m = i;
        this.f271345n = z;
    }

    /* renamed from: a */
    public final int mo90492a() {
        int height = this.f271339h.getHeight();
        int i = this.f271344m;
        return height - (i + i);
    }

    /* renamed from: b */
    public final int mo90493b() {
        int width = this.f271339h.getWidth();
        int i = this.f271344m;
        return width - (i + i);
    }

    /* renamed from: c */
    public final RectF mo90494c(C97214b bVar) {
        return C97218f.m160923b(bVar, mo90493b(), mo90492a());
    }

    /* renamed from: d */
    public final C97214b mo90495d(C97214b bVar) {
        return mo90496e(bVar.mo90592a(), bVar.mo90593b());
    }

    /* renamed from: e */
    public final C97214b mo90496e(float f, float f2) {
        C97106b bVar = this.f271343l;
        C147446j jVar = bVar.f271316b;
        float f3 = jVar.f397998d;
        float f4 = jVar.f397999e;
        if (f > (f3 + f4) / 2.0f) {
            f3 = f4;
        }
        C147446j jVar2 = bVar.f271317c;
        float f5 = jVar2.f397998d;
        float f6 = jVar2.f397999e;
        if (f2 < f5) {
            f2 = f5;
        } else if (f2 > f6) {
            f2 = f6;
        }
        return new C97213a(f3, f2);
    }

    /* renamed from: f */
    public final void mo90497f() {
        if (this.f271338g.mo79746e(C90003bi.f246866b)) {
            this.f271336e.mo90509c(this);
        }
    }

    /* renamed from: g */
    public final void mo90498g(C147454r rVar, C97214b bVar) {
        if (!bVar.equals(this.f271343l.mo90473b())) {
            this.f271343l.mo90475d(rVar, bVar);
        }
    }

    /* renamed from: h */
    public final void mo90499h(C97214b bVar) {
        mo90498g(f271334c, bVar);
        if (this.f271338g.mo79746e(C90003bi.f246866b)) {
            C97124t tVar = this.f271336e;
            tVar.mo90507a(this, mo90494c(bVar), C58662ni.m90358q(tVar.f271382a));
        }
    }

    /* renamed from: i */
    public final void mo90500i() {
        DisplayManager displayManager = this.f271341j;
        displayManager.getClass();
        C97214b b = C97219g.m160926b(displayManager);
        View view = this.f271339h;
        view.getClass();
        C97213a aVar = (C97213a) b;
        int width = ((int) aVar.f271607a) - (this.f271339h.getWidth() / 2);
        Context context = this.f271347p;
        context.getClass();
        float dimension = context.getResources().getDimension(R.dimen.snap_rang_padding_bottom);
        int i = this.f271348q;
        int height = this.f271339h.getHeight();
        float f = aVar.f271608b;
        int height2 = this.f271339h.getHeight();
        C97106b bVar = this.f271343l;
        RectF rectF = new RectF((float) (view.getWidth() / 2), (float) (i + (height / 2)), (float) width, (f - ((float) (height2 / 2))) - dimension);
        bVar.f271316b.mo124187m(rectF.left, rectF.right);
        bVar.f271317c.mo124187m(rectF.top, rectF.bottom);
    }
}
