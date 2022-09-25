package com.google.android.apps.gsa.staticplugins.p7796dh.p7799c;

import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.monet.p7070b.p7106w.C90297b;
import com.google.android.apps.gsa.staticplugins.p7796dh.p7798b.C99535a;
import com.google.android.apps.gsa.staticplugins.p7796dh.p7798b.C99538d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.dh.c.h */
/* compiled from: PG */
public final class C99546h extends C22939d implements C90297b {

    /* renamed from: e */
    private static final C59071e f278519e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dh.c.h");

    /* renamed from: a */
    final ViewTreeObserver.OnScrollChangedListener f278520a = new C99543e(this);

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f278521b = new C99544f(this);

    /* renamed from: c */
    public C60870cx f278522c;

    /* renamed from: d */
    public View f278523d;

    /* renamed from: f */
    private final C99535a f278524f;

    /* renamed from: g */
    private final C99538d f278525g;

    /* renamed from: h */
    private final Context f278526h;

    /* renamed from: i */
    private final C58833ax f278527i;

    /* renamed from: j */
    private final C22871g f278528j;

    /* renamed from: k */
    private final int f278529k;

    /* renamed from: l */
    private View f278530l;

    /* renamed from: m */
    private TextView f278531m;

    /* renamed from: n */
    private View f278532n;

    /* renamed from: o */
    private int f278533o;

    public C99546h(C22945j jVar, C99535a aVar, C99538d dVar, Context context, C58833ax axVar, C22871g gVar) {
        super(jVar);
        this.f278524f = aVar;
        this.f278525g = dVar;
        this.f278526h = context;
        this.f278527i = axVar;
        this.f278528j = gVar;
        this.f278529k = context.getResources().getDimensionPixelSize(R.dimen.searchplatetooltip_top_spacing);
    }

    /* renamed from: j */
    private final void m165116j(String str) {
        this.f278531m.setText(Html.fromHtml(str));
        m165118l(0);
        mo91491e();
        m165117k();
        this.f278522c = this.f278528j.mo28208h("Dismiss search plate tooltip after the timeout", (long) ((Integer) ((C23249a) this.f278525g.mo91484d()).mo28725a()).intValue(), new C99540b(this));
    }

    /* renamed from: k */
    private final void m165117k() {
        C60870cx cxVar = this.f278522c;
        if (cxVar != null) {
            cxVar.cancel(true);
            this.f278522c = null;
        }
    }

    /* renamed from: l */
    private final void m165118l(int i) {
        if (i == 0) {
            Fade fade = new Fade(1);
            fade.setDuration(250);
            fade.setStartDelay(500);
            TransitionManager.beginDelayedTransition((ViewGroup) this.f278530l, fade);
        }
        this.f278531m.setVisibility(i);
        this.f278532n.setVisibility(i);
    }

    /* renamed from: m */
    private final boolean m165119m() {
        return this.f278532n.getVisibility() == 0;
    }

    /* renamed from: a */
    public final void mo83992a() {
        mo91492g(false);
    }

    /* renamed from: b */
    public final void mo83993b(int i) {
        this.f278533o = i;
        if (this.f278527i.mo56113h()) {
            View findViewById = ((Activity) this.f278527i.mo56107c()).getWindow().getDecorView().findViewById(i);
            this.f278523d = findViewById;
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.f278521b);
        }
        mo91492g(((Boolean) ((C23249a) this.f278525g.mo91482b()).mo28725a()).booleanValue());
    }

    /* renamed from: e */
    public final void mo91491e() {
        if (this.f278523d != null && this.f278527i.mo56113h() && m165119m()) {
            int[] iArr = new int[2];
            this.f278523d.getLocationOnScreen(iArr);
            C58976aa aaVar = C58975e.f156826a;
            int[] iArr2 = new int[2];
            ((View) this.f278532n.getParent()).getLocationOnScreen(iArr2);
            this.f278530l.measure(0, 0);
            this.f278532n.setTranslationX((float) ((iArr[0] + ((this.f278523d.getWidth() - this.f278532n.getMeasuredWidth()) / 2)) - iArr2[0]));
            int measuredWidth = this.f278531m.getMeasuredWidth();
            int i = iArr[0];
            int width = this.f278523d.getWidth();
            this.f278531m.setTranslationX((float) Math.max(0, Math.min(((Activity) this.f278527i.mo56107c()).getWindow().getDecorView().getWidth() - measuredWidth, (i + ((width - measuredWidth) / 2)) - iArr2[0])));
            float height = (float) (iArr[1] + this.f278523d.getHeight() + this.f278529k);
            this.f278531m.setTranslationY(height);
            this.f278532n.setTranslationY(height);
        }
    }

    /* renamed from: g */
    public final void mo91492g(boolean z) {
        View view;
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            m165117k();
            View view2 = this.f278523d;
            if (view2 != null) {
                view2.getViewTreeObserver().removeOnScrollChangedListener(this.f278520a);
            }
            if (m165119m()) {
                m165118l(8);
                this.f278524f.mo91486e();
            }
        } else if (this.f278533o != 0 && !m165119m() && (view = this.f278523d) != null) {
            view.getViewTreeObserver().addOnScrollChangedListener(this.f278520a);
            if (this.f278523d.getVisibility() == 0) {
                mo91493h();
            } else {
                this.f278523d.getViewTreeObserver().addOnGlobalLayoutListener(new C99545g(this));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91493h() {
        /*
            r4 = this;
            com.google.android.apps.gsa.staticplugins.dh.b.d r0 = r4.f278525g
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo91483c()
            com.google.android.libraries.gsa.monet.tools.model.shared.a.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a) r0
            java.lang.Object r0 = r0.mo28725a()
            f.a.a.a.t r0 = (p5451f.p5452a.p5453a.p5454a.C69455t) r0
            int r1 = r0.f185863a
            java.lang.String r2 = ""
            r3 = 1
            if (r1 != r3) goto L_0x001a
            java.lang.Object r1 = r0.f185864b
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x002e
            int r1 = r0.f185863a
            if (r1 != r3) goto L_0x002a
            java.lang.Object r0 = r0.f185864b
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x002a:
            r4.m165116j(r2)
            return
        L_0x002e:
            int r1 = r0.f185863a
            r2 = 2
            if (r1 != r2) goto L_0x006a
            android.content.Context r1 = r4.f278526h     // Catch:{ FileNotFoundException -> 0x0055 }
            java.lang.Object r0 = r0.f185864b     // Catch:{ FileNotFoundException -> 0x0055 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ FileNotFoundException -> 0x0055 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ FileNotFoundException -> 0x0055 }
            android.util.Pair r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148303k(r1, r0)     // Catch:{ FileNotFoundException -> 0x0055 }
            java.lang.Object r1 = r0.first     // Catch:{ FileNotFoundException -> 0x0055 }
            android.content.res.Resources r1 = (android.content.res.Resources) r1     // Catch:{ FileNotFoundException -> 0x0055 }
            java.lang.Object r0 = r0.second     // Catch:{ FileNotFoundException -> 0x0055 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ FileNotFoundException -> 0x0055 }
            int r0 = r0.intValue()     // Catch:{ FileNotFoundException -> 0x0055 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ FileNotFoundException -> 0x0055 }
            r4.m165116j(r0)     // Catch:{ FileNotFoundException -> 0x0055 }
            return
        L_0x0055:
            r0 = move-exception
            com.google.common.f.e r1 = f278519e
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "SearchPlateTooltipRndr"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "Cannot find string for uri."
            r3 = 32643(0x7f83, float:4.5743E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7796dh.p7799c.C99546h.mo91493h():void");
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        View inflate = LayoutInflater.from(this.f278526h).inflate(R.layout.searchplatetooltip, (ViewGroup) null, false);
        this.f278530l = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.search_plate_tooltip_body);
        this.f278531m = textView;
        textView.setOnClickListener(new C99541c(this));
        this.f278532n = this.f278530l.findViewById(R.id.search_plate_tooltip_arrow);
        mo28295iC(this.f278530l);
        if (this.f278527i.mo56113h()) {
            ((C23249a) this.f278525g.mo91482b()).mo28726b(new C99542d(this));
        }
    }

    /* renamed from: js */
    public final void mo28301js() {
        m165117k();
    }
}
