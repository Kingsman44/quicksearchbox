package com.google.android.libraries.lens.view.infopanel;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26968d;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26970f;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27010a;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27025m;
import com.google.android.libraries.lens.view.infopanel.p2140b.C27026n;
import com.google.android.libraries.lens.view.infopanel.p2145f.C27188c;
import com.google.android.libraries.lens.view.infopanel.scrollview.LensResultsNestedScrollView;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.srpx.C28049o;
import com.google.android.libraries.lens.view.weblrp.C28201o;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4566l.C60200dk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
public final class InfoPanelView extends LinearLayout implements C27654a, C27026n {

    /* renamed from: a */
    static final C58485gu f73486a = C58485gu.m89847o(91166, 104379);

    /* renamed from: q */
    public static final /* synthetic */ int f73487q = 0;

    /* renamed from: b */
    public final ArrayList f73488b = new ArrayList();

    /* renamed from: c */
    public C26986ad f73489c;

    /* renamed from: d */
    public boolean f73490d = false;

    /* renamed from: e */
    public C28443m f73491e;

    /* renamed from: f */
    public C27071by f73492f;

    /* renamed from: g */
    public int f73493g;

    /* renamed from: h */
    public LensResultsNestedScrollView f73494h;

    /* renamed from: i */
    public boolean f73495i = true;

    /* renamed from: j */
    public C27070bx f73496j;

    /* renamed from: k */
    int f73497k;

    /* renamed from: l */
    C27188c f73498l;

    /* renamed from: m */
    C58833ax f73499m = C58836b.f156633a;

    /* renamed from: n */
    public int f73500n = 0;

    /* renamed from: o */
    public boolean f73501o;

    /* renamed from: p */
    public C27185f f73502p;

    /* renamed from: r */
    private C26987ae f73503r;

    /* renamed from: s */
    private int f73504s;

    /* renamed from: t */
    private View f73505t;

    /* renamed from: u */
    private boolean f73506u;

    static {
        C58974d.m91135i("InfoPanelView");
    }

    public InfoPanelView(Context context) {
        super(context);
    }

    /* renamed from: w */
    private final int m49952w() {
        return ((ViewGroup) getParent()).getWidth();
    }

    /* renamed from: x */
    private final void m49953x() {
        if (this.f73499m.mo56113h()) {
            this.f73489c.f73587b.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this.f73499m.mo56107c());
            this.f73499m = C58836b.f156633a;
        }
    }

    /* renamed from: y */
    private final void m49954y() {
        LensResultPanelBottomsheetBehavior t = LensResultPanelBottomsheetBehavior.m50197t(this);
        float f = getResources().getConfiguration().orientation == 2 ? 0.35f : 0.2f;
        int i = this.f73500n;
        t.f73748f = f;
        t.f73749g = i;
        t.mo32500v();
    }

    /* renamed from: a */
    public final int mo32352a(int i) {
        View view = this.f73505t;
        return (view == null || !this.f73506u) ? i : i - view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo32353b() {
        int measuredHeight = this.f73489c.f73586a.getMeasuredHeight();
        if (getChildCount() == 0) {
            return measuredHeight;
        }
        C26987ae aeVar = this.f73503r;
        return measuredHeight + aeVar.f73591a + aeVar.f73592b + this.f73489c.f73587b.getMeasuredHeight();
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("InfoPanelView");
        eVar.mo33148e("Items", String.valueOf(this.f73488b.size()));
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        eVar.mo33148e("Size", measuredHeight + " " + measuredWidth);
        int measuredHeight2 = this.f73489c.f73587b.getMeasuredHeight();
        int measuredWidth2 = this.f73489c.f73587b.getMeasuredWidth();
        eVar.mo33148e("Content", measuredHeight2 + " " + measuredWidth2);
    }

    /* renamed from: d */
    public final int mo32354d() {
        return (int) (LensResultPanelBottomsheetBehavior.m50197t(this).f73748f * ((float) mo32355e()));
    }

    /* renamed from: e */
    public final int mo32355e() {
        return ((ViewGroup) getParent()).getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final LensResultsNestedScrollView mo32356f() {
        return (LensResultsNestedScrollView) findViewById(R.id.panel_scroll_view);
    }

    /* renamed from: g */
    public final void mo32357g() {
        ViewGroup viewGroup = this.f73489c.f73587b;
        if (viewGroup.getParent() != null) {
            ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
        }
        this.f73494h.addView(viewGroup);
        this.f73498l.f74315c = viewGroup;
        this.f73489c.f73588c.removeAllViews();
        this.f73489c.f73588c.addView(this.f73494h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo32358h(int i) {
        C58838bb.m90883r(i <= this.f73488b.size());
        ArrayList arrayList = this.f73488b;
        Iterator it = arrayList.subList(i, arrayList.size()).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            C27188c cVar = this.f73498l;
            if (cVar != null) {
                int hashCode = view.hashCode();
                Set set = cVar.f74313a;
                Integer valueOf = Integer.valueOf(hashCode);
                set.remove(valueOf);
                cVar.f74314b.remove(valueOf);
            }
            this.f73489c.f73587b.removeView(view);
            it.remove();
        }
        m49953x();
    }

    /* renamed from: i */
    public final void mo32359i() {
        this.f73489c.f73589d.setVisibility(8);
        this.f73489c.f73589d.mo9692c();
    }

    /* renamed from: j */
    public final void mo32360j() {
        this.f73489c.f73590e.mo48272e();
        this.f73489c.f73590e.setVisibility(8);
    }

    /* renamed from: k */
    public final void mo32361k(C60200dk dkVar) {
        C28443m mVar = this.f73491e;
        if (mVar != null && this.f73495i) {
            mVar.mo33853c(C28442l.m53146l(dkVar), C28485y.m53234a(this.f73489c.f73587b));
        }
    }

    /* renamed from: l */
    public final void mo32362l(View view) {
        C27188c cVar = this.f73498l;
        if (cVar != null) {
            cVar.mo32619b(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo32363m() {
        int i;
        View view;
        if (m49952w() <= 0) {
            this.f73501o = true;
            return;
        }
        this.f73489c.f73586a.measure(View.MeasureSpec.makeMeasureSpec(m49952w(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        C27207w a = this.f73489c.f73586a.mo17754z();
        int i2 = a.f74403q;
        if (i2 == 2) {
            i = a.f74395i.getResources().getDimensionPixelOffset(R.dimen.lens_info_panel_peek_height);
        } else if (i2 == 3) {
            View inflate = LayoutInflater.from(a.f74390d.f74378c.getContext()).inflate(R.layout.latex_title_ghost_textview, a.f74390d.f74378c, false);
            inflate.measure(View.MeasureSpec.makeMeasureSpec(a.f74390d.f74378c.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = a.f74394h.getMeasuredHeight();
            i = (measuredHeight + inflate.getMeasuredHeight()) - a.f74390d.f74378c.getMeasuredHeight();
        } else {
            i = a.f74394h.getMeasuredHeight();
        }
        LensResultPanelBottomsheetBehavior t = LensResultPanelBottomsheetBehavior.m50197t(this);
        int i3 = i + this.f73500n;
        if (t.f73745c != i3) {
            t.f73745c = Math.max(0, i3);
            WeakReference weakReference = t.f73757o;
            if (weakReference != null) {
                t.mo32499u();
                if (t.f73753k == 4 && (view = (View) weakReference.get()) != null) {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo32364n(C26968d dVar) {
        for (C26970f j : this.f73502p.f74309a.f74357u) {
            j.mo30856j(dVar);
        }
    }

    /* renamed from: o */
    public final void mo32365o(View view, C27025m mVar) {
        C27188c cVar = this.f73498l;
        if (cVar != null) {
            cVar.mo32621d(view, mVar);
        }
        if (f73486a.contains(Integer.valueOf(((C27010a) mVar).f73639a))) {
            this.f73489c.f73586a.mo17754z().mo32649d(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LensResultPanelBottomsheetBehavior t = LensResultPanelBottomsheetBehavior.m50197t(this);
        t.f73760r = new C26985ac(this, t);
        m49954y();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m49954y();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C27188c cVar = this.f73498l;
        if (cVar != null) {
            cVar.mo32618a();
        }
        m49953x();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f73489c = new C26986ad(this);
        this.f73503r = new C26987ae(this);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        super.onMeasure(i, i2);
        if (this.f73492f != null && (measuredHeight = (getMeasuredHeight() - this.f73489c.f73586a.getMeasuredHeight()) - this.f73493g) != this.f73504s) {
            C27195m mVar = (C27195m) this.f73492f;
            mVar.f74331C = measuredHeight;
            C28049o b = mVar.mo32624b();
            C28201o d = mVar.mo32625d();
            if (b != null) {
                b.mo17754z().mo33505f(measuredHeight);
            } else if (d != null) {
                d.mo17754z().mo33716b(measuredHeight);
            }
            super.onMeasure(i, i2);
            this.f73504s = measuredHeight;
        }
    }

    /* renamed from: p */
    public final void mo32371p() {
        View findViewById = this.f73489c.f73587b.findViewById(R.id.feedback_banner);
        if (findViewById != null) {
            this.f73489c.f73587b.removeView(findViewById);
            Space space = new Space(getContext());
            space.setLayoutParams(new LinearLayout.LayoutParams(-1, findViewById.getMeasuredHeight()));
            space.setVisibility(4);
            mo32372q(space, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo32372q(View view, boolean z) {
        ViewGroup viewGroup = this.f73489c.f73587b;
        viewGroup.addView(view, viewGroup.getChildCount());
        this.f73505t = view;
        this.f73506u = z;
        this.f73488b.add(view);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:44|45|46|47|48) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00d1 */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0144  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32373r(com.google.android.libraries.lens.view.infopanel.p2138a.p2139a.C26965d r15) {
        /*
            r14 = this;
            com.google.android.libraries.lens.view.infopanel.ad r0 = r14.f73489c
            com.google.android.libraries.lens.view.infopanel.InfoPanelHeader r0 = r0.f73586a
            com.google.android.libraries.lens.view.infopanel.w r0 = r0.mo17754z()
            r1 = 0
            r0.mo32648c(r1)
            java.lang.String r2 = r15.mo32406d()
            r0.f74391e = r2
            com.google.android.libraries.lens.view.infopanel.ag r2 = r0.f74393g
            com.google.at.g.a.a.y r3 = r15.mo32403a()
            com.google.lens.j.da r3 = r3.f141882a
            if (r3 != 0) goto L_0x001e
            com.google.lens.j.da r3 = com.google.lens.p4707j.C62478da.f168682b
        L_0x001e:
            com.google.protobuf.cq r4 = r3.f168684a
            int r4 = r4.size()
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 > r7) goto L_0x003e
            if (r4 != r7) goto L_0x0047
            com.google.protobuf.cq r4 = r3.f168684a
            java.lang.Object r4 = r4.get(r1)
            com.google.lens.j.dw r4 = (com.google.lens.p4707j.C62500dw) r4
            int r4 = r4.f168734b
            int r4 = com.google.lens.p4707j.C62502dy.m94789a(r4)
            if (r4 != 0) goto L_0x003c
            goto L_0x0047
        L_0x003c:
            if (r4 != r5) goto L_0x0047
        L_0x003e:
            android.view.ViewGroup r4 = r2.f73599f
            if (r4 != 0) goto L_0x004a
            com.google.android.libraries.lens.view.education.a.a r2 = r2.f73597d
            r2.mo30918a(r6, r6)
        L_0x0047:
            r2 = 0
            goto L_0x011d
        L_0x004a:
            com.google.android.libraries.lens.view.education.g r8 = r2.f73600g
            if (r8 != 0) goto L_0x0069
            com.google.android.libraries.lens.view.education.j r8 = r2.f73595b
            com.google.android.libraries.lens.view.education.g r4 = r8.mo30930a(r4)
            r2.f73600g = r4
            com.google.android.libraries.lens.view.education.g r4 = r2.f73600g
            if (r4 != 0) goto L_0x0060
            com.google.android.libraries.lens.view.education.a.a r2 = r2.f73597d
            r2.mo30918a(r6, r5)
            goto L_0x0047
        L_0x0060:
            com.google.android.libraries.lens.view.infopanel.af r8 = new com.google.android.libraries.lens.view.infopanel.af
            r8.<init>(r2)
            com.google.android.libraries.lens.view.education.b r4 = (com.google.android.libraries.lens.view.education.C25772b) r4
            r4.f70044c = r8
        L_0x0069:
            r4 = 4
            com.google.protobuf.cq r8 = r3.f168684a     // Catch:{ RuntimeException -> 0x0107 }
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r8)     // Catch:{ RuntimeException -> 0x0107 }
            com.google.android.libraries.lens.view.education.y r9 = com.google.android.libraries.lens.view.education.C25795y.f70074a     // Catch:{ RuntimeException -> 0x0107 }
            j$.util.stream.Stream r8 = r8.filter(r9)     // Catch:{ RuntimeException -> 0x0107 }
            long r8 = r8.count()     // Catch:{ RuntimeException -> 0x0107 }
            int r9 = (int) r8     // Catch:{ RuntimeException -> 0x0107 }
            com.google.protobuf.cq r8 = r3.f168684a     // Catch:{ RuntimeException -> 0x0107 }
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r8)     // Catch:{ RuntimeException -> 0x0107 }
            com.google.android.libraries.lens.view.education.z r10 = com.google.android.libraries.lens.view.education.C25796z.f70075a     // Catch:{ RuntimeException -> 0x0107 }
            j$.util.stream.Stream r8 = r8.filter(r10)     // Catch:{ RuntimeException -> 0x0107 }
            long r10 = r8.count()     // Catch:{ RuntimeException -> 0x0107 }
            int r8 = (int) r10     // Catch:{ RuntimeException -> 0x0107 }
            if (r9 <= 0) goto L_0x0092
            if (r8 <= 0) goto L_0x0092
            r8 = 5
            goto L_0x009f
        L_0x0092:
            if (r9 <= 0) goto L_0x0096
            r8 = 2
            goto L_0x009f
        L_0x0096:
            if (r8 != r7) goto L_0x009a
            r8 = 3
            goto L_0x009f
        L_0x009a:
            if (r8 <= r7) goto L_0x009e
            r8 = 4
            goto L_0x009f
        L_0x009e:
            r8 = 1
        L_0x009f:
            com.google.android.libraries.lens.view.education.g r9 = r2.f73600g     // Catch:{ RuntimeException -> 0x0107 }
            r9.getClass()
            com.google.android.libraries.lens.view.education.b r9 = (com.google.android.libraries.lens.view.education.C25772b) r9     // Catch:{ RuntimeException -> 0x0107 }
            com.google.android.libraries.lens.view.education.a r9 = r9.f70042a     // Catch:{ RuntimeException -> 0x0107 }
            android.view.ViewGroup r9 = r9.f70037a     // Catch:{ RuntimeException -> 0x0107 }
            int r10 = r8 + -1
            if (r10 == r6) goto L_0x00c4
            if (r10 == r5) goto L_0x00bc
            if (r10 == r4) goto L_0x00b4
            r10 = 0
            goto L_0x00cb
        L_0x00b4:
            r10 = 107572(0x1a434, float:1.5074E-40)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x00cb
        L_0x00bc:
            r10 = 107571(0x1a433, float:1.50739E-40)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x0107 }
            goto L_0x00cb
        L_0x00c4:
            r10 = 107570(0x1a432, float:1.50738E-40)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00cb:
            if (r10 == 0) goto L_0x00f2
            com.google.android.libraries.logging.p2185ve.C28306ab.m52929e(r9)     // Catch:{ RuntimeException -> 0x00d1 }
            goto L_0x00df
        L_0x00d1:
            com.google.common.f.a.d r11 = com.google.android.libraries.lens.view.infopanel.C26989ag.f73594a     // Catch:{ RuntimeException -> 0x0107 }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r12 = "Detaching VE from container view failed."
            r13 = 49522(0xc172, float:6.9395E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r13)).mo56386p(r12)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00df:
            com.google.android.libraries.logging.ve.ab r11 = r2.f73598e     // Catch:{ RuntimeException -> 0x0107 }
            com.google.android.libraries.logging.ve.af r12 = r2.f73596c     // Catch:{ RuntimeException -> 0x0107 }
            int r10 = r10.intValue()     // Catch:{ RuntimeException -> 0x0107 }
            com.google.android.libraries.logging.ve.h r10 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r10)     // Catch:{ RuntimeException -> 0x0107 }
            com.google.android.libraries.logging.ve.c r10 = r12.mo33805a(r10)     // Catch:{ RuntimeException -> 0x0107 }
            r11.mo33801b(r9, r10)     // Catch:{ RuntimeException -> 0x0107 }
        L_0x00f2:
            com.google.android.libraries.lens.view.education.a.a r9 = r2.f73597d     // Catch:{ RuntimeException -> 0x0107 }
            r9.mo30919b(r6, r8)     // Catch:{ RuntimeException -> 0x0107 }
            com.google.android.libraries.lens.view.education.g r8 = r2.f73600g     // Catch:{ RuntimeException -> 0x0107 }
            r8.getClass()
            com.google.protobuf.cq r3 = r3.f168684a     // Catch:{ RuntimeException -> 0x0107 }
            java.lang.String r9 = r15.mo32406d()     // Catch:{ RuntimeException -> 0x0107 }
            r8.mo30929b(r3, r9)     // Catch:{ RuntimeException -> 0x0107 }
            r2 = 1
            goto L_0x011d
        L_0x0107:
            r3 = move-exception
            com.google.common.f.a.d r8 = com.google.android.libraries.lens.view.infopanel.C26989ag.f73594a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r9 = "Failed to render LaTeX."
            r10 = 49523(0xc173, float:6.9397E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r8).mo56382g(r3)).mo56372aa(r10)).mo56386p(r9)
            com.google.android.libraries.lens.view.education.a.a r2 = r2.f73597d
            r2.mo30918a(r6, r4)
            goto L_0x0047
        L_0x011d:
            com.google.android.libraries.lens.view.infopanel.a r3 = r0.f74397k
            com.google.android.libraries.lens.view.filters.e.d r4 = r0.f74398l
            com.google.android.libraries.lens.view.filters.e.a.e r4 = r4.mo31203a()
            boolean r4 = r4.mo31193j()
            r3.mo32388d(r4)
            if (r2 != 0) goto L_0x0136
            boolean r3 = r15.mo32410h()
            if (r3 == 0) goto L_0x0136
            r3 = 1
            goto L_0x0137
        L_0x0136:
            r3 = 0
        L_0x0137:
            r0.f74401o = r3
            com.google.android.libraries.lens.view.infopanel.a r4 = r0.f74397k
            r4.mo32392h(r3)
            if (r2 == 0) goto L_0x0144
            r0.mo32650e(r5)
            return
        L_0x0144:
            boolean r2 = r15.mo32410h()
            if (r2 == 0) goto L_0x014e
            r0.mo32650e(r6)
            return
        L_0x014e:
            r0.mo32650e(r7)
            java.lang.String r2 = r0.f74391e
            com.google.at.g.a.a.ab r3 = r15.mo32404b()
            boolean r3 = r3.f141602a
            java.lang.String r4 = "<q>"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L_0x016b
            java.lang.String r4 = "</q>"
            boolean r4 = r2.endsWith(r4)
            if (r4 == 0) goto L_0x016b
            r4 = 1
            goto L_0x016c
        L_0x016b:
            r4 = 0
        L_0x016c:
            if (r4 != 0) goto L_0x0189
            if (r3 == 0) goto L_0x0171
            goto L_0x0189
        L_0x0171:
            com.google.android.libraries.lens.view.infopanel.v r3 = r0.f74390d
            android.widget.TextView r3 = r3.f74376a
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r4)
            com.google.android.libraries.lens.view.infopanel.v r3 = r0.f74390d
            android.widget.TextView r3 = r3.f74376a
            r3.setMaxLines(r6)
            com.google.android.libraries.lens.view.infopanel.v r3 = r0.f74390d
            android.widget.TextView r3 = r3.f74376a
            r3.setText(r2)
            goto L_0x01bd
        L_0x0189:
            com.google.android.libraries.lens.view.infopanel.v r3 = r0.f74390d
            android.widget.TextView r3 = r3.f74376a
            android.text.TextUtils$TruncateAt r6 = android.text.TextUtils.TruncateAt.MIDDLE
            r3.setEllipsize(r6)
            com.google.android.libraries.lens.view.infopanel.v r3 = r0.f74390d
            android.widget.TextView r3 = r3.f74376a
            r3.setMaxLines(r7)
            if (r4 == 0) goto L_0x01a5
            int r3 = r2.length()
            int r3 = r3 + -4
            java.lang.String r2 = r2.substring(r5, r3)
        L_0x01a5:
            com.google.android.libraries.lens.view.infopanel.v r3 = r0.f74390d
            android.widget.TextView r3 = r3.f74376a
            com.google.apps.tiktok.inject.n r4 = r0.f74395i
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r1] = r2
            r2 = 2132088899(0x7f151843, float:1.9818095E38)
            java.lang.String r2 = r4.getString(r2, r5)
            r3.setText(r2)
        L_0x01bd:
            java.lang.String r15 = r15.mo32405c()
            boolean r2 = r15.isEmpty()
            r2 = r2 ^ r7
            if (r2 == 0) goto L_0x01cf
            com.google.android.libraries.lens.view.infopanel.v r3 = r0.f74390d
            android.widget.TextView r3 = r3.f74377b
            r3.setText(r15)
        L_0x01cf:
            com.google.android.libraries.lens.view.infopanel.v r15 = r0.f74390d
            android.widget.TextView r15 = r15.f74377b
            if (r7 == r2) goto L_0x01d7
            r1 = 8
        L_0x01d7:
            r15.setVisibility(r1)
            com.google.android.libraries.lens.view.infopanel.v r15 = r0.f74390d
            android.widget.TextView r15 = r15.f74377b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r1 = -1
            r15.width = r1
            r1 = -2
            r15.height = r1
            com.google.android.libraries.lens.view.infopanel.v r0 = r0.f74390d
            android.widget.TextView r0 = r0.f74377b
            r0.setLayoutParams(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.infopanel.InfoPanelView.mo32373r(com.google.android.libraries.lens.view.infopanel.a.a.d):void");
    }

    /* renamed from: s */
    public final void mo32374s() {
        this.f73489c.f73586a.mo17754z().mo32649d(true);
        this.f73489c.f73590e.setVisibility(0);
        this.f73489c.f73590e.mo48278i();
    }

    /* renamed from: t */
    public final boolean mo32375t() {
        return mo32356f() != null;
    }

    /* renamed from: u */
    public final void mo32376u(LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior, int i) {
        int i2;
        int b = mo32353b();
        int a = mo32352a(b);
        if (i != 3) {
            if (i != 2 || a >= mo32354d()) {
                mo32371p();
                lensResultPanelBottomsheetBehavior.f73750h = true;
                lensResultPanelBottomsheetBehavior.mo32502x(0);
                this.f73490d = false;
                lensResultPanelBottomsheetBehavior.mo32503y(this.f73497k);
            }
            i = 2;
        }
        lensResultPanelBottomsheetBehavior.f73750h = false;
        if (i != 3) {
            C26983aa aaVar = new C26983aa(this, lensResultPanelBottomsheetBehavior);
            this.f73499m = C58833ax.m90834k(aaVar);
            this.f73489c.f73587b.getViewTreeObserver().addOnGlobalLayoutListener(aaVar);
        }
        View findViewById = this.f73489c.f73587b.findViewById(R.id.feedback_banner);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        if (this.f73489c.f73589d.getVisibility() == 0) {
            i2 = this.f73500n;
        } else {
            i2 = this.f73500n + b;
        }
        lensResultPanelBottomsheetBehavior.mo32502x(i2);
        this.f73490d = false;
        lensResultPanelBottomsheetBehavior.mo32503y(this.f73497k);
    }

    /* renamed from: v */
    public final void mo32377v(LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior, int i) {
        if (!C2043bi.m5570ax(this.f73489c.f73587b) || this.f73489c.f73587b.isLayoutRequested()) {
            this.f73490d = true;
            this.f73489c.f73587b.getViewTreeObserver().addOnGlobalLayoutListener(new C27210z(this, lensResultPanelBottomsheetBehavior, i));
            this.f73489c.f73587b.requestLayout();
            return;
        }
        mo32376u(lensResultPanelBottomsheetBehavior, i);
    }

    public InfoPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InfoPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
