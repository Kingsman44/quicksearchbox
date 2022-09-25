package com.google.android.libraries.lens.common.text.selection.p2009ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p060c.C0977g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.common.p2002e.C24107a;
import com.google.android.libraries.lens.common.p2002e.C24108b;
import com.google.android.libraries.lens.common.text.selection.p2009ui.p2010a.C24154a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView */
/* compiled from: PG */
public final class TextSelectionView extends FrameLayout implements C24108b {

    /* renamed from: s */
    public static final /* synthetic */ int f65945s = 0;

    /* renamed from: A */
    private final C24168i f65946A;

    /* renamed from: B */
    private final C24168i f65947B;

    /* renamed from: a */
    public final float f65948a;

    /* renamed from: b */
    public final C24179t f65949b;

    /* renamed from: c */
    public boolean f65950c;

    /* renamed from: d */
    public final FrameLayout f65951d;

    /* renamed from: e */
    final FrameLayout f65952e;

    /* renamed from: f */
    public final FrameLayout f65953f;

    /* renamed from: g */
    public final int f65954g;

    /* renamed from: h */
    public C24171l f65955h;

    /* renamed from: i */
    public C24171l f65956i;

    /* renamed from: j */
    public float f65957j;

    /* renamed from: k */
    public final PointF f65958k;

    /* renamed from: l */
    public final C24163d f65959l;

    /* renamed from: m */
    public boolean f65960m;

    /* renamed from: n */
    public boolean f65961n;

    /* renamed from: o */
    public final Map f65962o;

    /* renamed from: p */
    public C24154a f65963p;

    /* renamed from: q */
    public int f65964q;

    /* renamed from: r */
    public int f65965r;

    /* renamed from: t */
    private final PointF f65966t;

    /* renamed from: u */
    private final C24171l f65967u;

    /* renamed from: v */
    private final C24171l f65968v;

    /* renamed from: w */
    private final C24171l f65969w;

    /* renamed from: x */
    private final C24171l f65970x;

    /* renamed from: y */
    private final C24171l f65971y;

    /* renamed from: z */
    private final C24171l f65972z;

    static {
        C58974d.m91135i("TextSelectionView");
    }

    public TextSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final View mo29503a() {
        return this;
    }

    /* renamed from: b */
    public final C24107a mo29504b() {
        return C24107a.TEXT;
    }

    /* renamed from: c */
    public final C58485gu mo29563c() {
        return C58485gu.m89848p(this.f65968v, this.f65970x, this.f65972z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fe, code lost:
        if (r0.f66087e.f65963p.mo29577g(r2, r6, 4) != false) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo29505d(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.f65950c
            r1 = 0
            if (r0 == 0) goto L_0x0007
            goto L_0x0134
        L_0x0007:
            int r0 = r11.getActionMasked()
            if (r0 != 0) goto L_0x001e
            android.graphics.PointF r0 = r10.f65966t
            float r2 = r11.getX()
            int r2 = (int) r2
            float r2 = (float) r2
            float r3 = r11.getY()
            int r3 = (int) r3
            float r3 = (float) r3
            r0.set(r2, r3)
        L_0x001e:
            com.google.android.libraries.lens.common.text.selection.ui.t r0 = r10.f65949b
            int r2 = com.google.android.libraries.lens.common.text.selection.p2009ui.C24179t.f66082f
            r11.getActionMasked()
            r11.getPointerCount()
            r11.getX()
            r11.getY()
            r11.getRawX()
            r11.getRawY()
            int r2 = r11.getPointerCount()
            r3 = 3
            r4 = 1
            if (r2 <= r4) goto L_0x004d
            r0.mo29642b()
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r11)
            r11.setAction(r3)
            android.view.GestureDetector r0 = r0.f66083a
            r0.onTouchEvent(r11)
            goto L_0x0134
        L_0x004d:
            int r2 = r11.getActionMasked()
            r5 = 2
            if (r2 != 0) goto L_0x0111
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r2 = r0.f66087e
            com.google.android.libraries.lens.common.text.selection.ui.a.a r2 = r2.f65963p
            if (r2 == 0) goto L_0x0105
            float r2 = r11.getX()
            int r2 = (int) r2
            float r6 = r11.getY()
            int r6 = (int) r6
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r11)
            r0.f66086d = r7
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.l r7 = r7.f65955h
            boolean r7 = r7.mo29634i(r2, r6)
            if (r7 == 0) goto L_0x00ae
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r3 = r0.f66087e
            boolean r3 = r3.f65960m
            if (r3 == 0) goto L_0x0081
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r3 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.l r3 = r3.f65955h
            r3.mo29633h(r1)
        L_0x0081:
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.l r7 = r7.f65955h
            r7.mo29629d(r3)
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66087e
            com.google.android.libraries.lens.common.text.selection.ui.a.a r7 = r7.f65963p
            int r8 = r3.x
            int r9 = r3.y
            boolean r7 = r7.mo29577g(r8, r9, r5)
            if (r7 == 0) goto L_0x0103
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.l r7 = r7.f65955h
            android.graphics.Point r7 = r7.mo29626a(r2, r6)
            r0.mo29641a(r7)
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.d r7 = r7.f65959l
            r7.mo29598a(r2, r6, r3)
            goto L_0x0100
        L_0x00ae:
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r5 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.l r5 = r5.f65956i
            boolean r5 = r5.mo29634i(r2, r6)
            if (r5 == 0) goto L_0x00f5
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r5 = r0.f66087e
            boolean r5 = r5.f65960m
            if (r5 == 0) goto L_0x00c5
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r5 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.l r5 = r5.f65956i
            r5.mo29633h(r1)
        L_0x00c5:
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.l r7 = r7.f65956i
            r7.mo29629d(r5)
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66087e
            com.google.android.libraries.lens.common.text.selection.ui.a.a r7 = r7.f65963p
            int r8 = r5.x
            int r9 = r5.y
            boolean r7 = r7.mo29577g(r8, r9, r3)
            if (r7 == 0) goto L_0x0103
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.l r7 = r7.f65956i
            android.graphics.Point r7 = r7.mo29626a(r2, r6)
            r0.mo29641a(r7)
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r7 = r0.f66085c
            com.google.android.libraries.lens.common.text.selection.ui.d r7 = r7.f65959l
            r7.mo29598a(r2, r6, r5)
            r0.mo29643c(r3)
            goto L_0x0103
        L_0x00f5:
            com.google.android.libraries.lens.common.text.selection.ui.TextSelectionView r3 = r0.f66087e
            com.google.android.libraries.lens.common.text.selection.ui.a.a r3 = r3.f65963p
            r5 = 4
            boolean r2 = r3.mo29577g(r2, r6, r5)
            if (r2 == 0) goto L_0x0105
        L_0x0100:
            r0.mo29643c(r5)
        L_0x0103:
            r2 = 1
            goto L_0x0106
        L_0x0105:
            r2 = 0
        L_0x0106:
            android.view.GestureDetector r0 = r0.f66083a
            boolean r11 = r0.onTouchEvent(r11)
            if (r2 != 0) goto L_0x011f
            if (r11 == 0) goto L_0x0134
            goto L_0x011f
        L_0x0111:
            if (r2 != r5) goto L_0x0121
            android.view.GestureDetector r2 = r0.f66083a
            boolean r11 = r2.onTouchEvent(r11)
            if (r11 != 0) goto L_0x011f
            boolean r11 = r0.f66084b
            if (r11 == 0) goto L_0x0134
        L_0x011f:
            r1 = 1
            goto L_0x0134
        L_0x0121:
            if (r2 == r4) goto L_0x0125
            if (r2 != r3) goto L_0x0134
        L_0x0125:
            android.view.GestureDetector r2 = r0.f66083a
            boolean r11 = r2.onTouchEvent(r11)
            boolean r0 = r0.mo29642b()
            if (r11 != 0) goto L_0x011f
            if (r0 == 0) goto L_0x0134
            goto L_0x011f
        L_0x0134:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.common.text.selection.p2009ui.TextSelectionView.mo29505d(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public final C58485gu mo29564e() {
        return C58485gu.m89848p(this.f65967u, this.f65969w, this.f65971y);
    }

    /* renamed from: g */
    public final void mo29566g() {
        C24179t tVar = this.f65949b;
        int i = C24179t.f66082f;
        tVar.mo29642b();
        this.f65951d.removeAllViews();
        this.f65962o.clear();
        this.f65955h.mo29633h(false);
        this.f65956i.mo29633h(false);
        this.f65964q = 2;
        this.f65965r = 2;
        mo29565f();
        mo29568i();
    }

    /* renamed from: h */
    public final void mo29567h(float f) {
        this.f65946A.f66044a = f;
        this.f65947B.f66044a = f;
        C58485gu e = mo29564e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            ((C24171l) e.get(i)).mo29632g(f);
        }
        C58485gu c = mo29563c();
        int size2 = c.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C24171l) c.get(i2)).mo29632g(f);
        }
        this.f65959l.mo29599b(f);
    }

    /* renamed from: i */
    public final void mo29568i() {
        C58480gp e = C58485gu.m89837e();
        C58833ax b = this.f65955h.mo29627b();
        C58833ax b2 = this.f65956i.mo29627b();
        if (b.mo56113h()) {
            e.mo55395g((Rect) b.mo56107c());
        }
        if (b2.mo56113h()) {
            e.mo55395g((Rect) b2.mo56107c());
        }
        this.f65952e.setSystemGestureExclusionRects(e.mo55394f());
    }

    /* renamed from: j */
    public final void mo29569j(int i) {
        if (this.f65961n) {
            this.f65952e.performHapticFeedback(i);
        }
    }

    public TextSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextSelectionView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29565f() {
        /*
            r6 = this;
            int r0 = r6.f65964q
            int r1 = r0 + -2
            r2 = 0
            if (r0 == 0) goto L_0x0071
            r0 = 2
            r3 = -1
            r4 = 1
            if (r1 == r3) goto L_0x001b
            if (r1 == 0) goto L_0x001b
            if (r1 == r4) goto L_0x0016
            if (r1 == r0) goto L_0x0013
            goto L_0x001f
        L_0x0013:
            com.google.android.libraries.lens.common.text.selection.ui.l r1 = r6.f65971y
            goto L_0x0018
        L_0x0016:
            com.google.android.libraries.lens.common.text.selection.ui.l r1 = r6.f65969w
        L_0x0018:
            r6.f65955h = r1
            goto L_0x001f
        L_0x001b:
            com.google.android.libraries.lens.common.text.selection.ui.l r1 = r6.f65967u
            r6.f65955h = r1
        L_0x001f:
            int r1 = r6.f65965r
            int r5 = r1 + -2
            if (r1 == 0) goto L_0x0070
            if (r5 == r3) goto L_0x0034
            if (r5 == 0) goto L_0x0034
            if (r5 == r4) goto L_0x0031
            if (r5 == r0) goto L_0x002e
            goto L_0x0038
        L_0x002e:
            com.google.android.libraries.lens.common.text.selection.ui.l r0 = r6.f65972z
            goto L_0x0036
        L_0x0031:
            com.google.android.libraries.lens.common.text.selection.ui.l r0 = r6.f65970x
            goto L_0x0036
        L_0x0034:
            com.google.android.libraries.lens.common.text.selection.ui.l r0 = r6.f65968v
        L_0x0036:
            r6.f65956i = r0
        L_0x0038:
            com.google.common.b.gu r0 = r6.mo29564e()
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L_0x0042:
            if (r3 >= r1) goto L_0x0054
            java.lang.Object r4 = r0.get(r3)
            com.google.android.libraries.lens.common.text.selection.ui.l r4 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24171l) r4
            com.google.android.libraries.lens.common.text.selection.ui.l r5 = r6.f65955h
            if (r4 == r5) goto L_0x0051
            r4.mo29633h(r2)
        L_0x0051:
            int r3 = r3 + 1
            goto L_0x0042
        L_0x0054:
            com.google.common.b.gu r0 = r6.mo29563c()
            int r1 = r0.size()
            r3 = 0
        L_0x005d:
            if (r3 >= r1) goto L_0x006f
            java.lang.Object r4 = r0.get(r3)
            com.google.android.libraries.lens.common.text.selection.ui.l r4 = (com.google.android.libraries.lens.common.text.selection.p2009ui.C24171l) r4
            com.google.android.libraries.lens.common.text.selection.ui.l r5 = r6.f65956i
            if (r4 == r5) goto L_0x006c
            r4.mo29633h(r2)
        L_0x006c:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x006f:
            return
        L_0x0070:
            throw r2
        L_0x0071:
            goto L_0x0073
        L_0x0072:
            throw r2
        L_0x0073:
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.common.text.selection.p2009ui.TextSelectionView.mo29565f():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextSelectionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = context;
        this.f65966t = new PointF();
        this.f65964q = 2;
        this.f65965r = 2;
        this.f65957j = 1.0f;
        this.f65958k = new PointF(0.0f, 0.0f);
        this.f65962o = new C0977g();
        Resources resources = context.getResources();
        this.f65954g = resources.getColor(R.color.lens_text_highlights_color_opaque);
        this.f65949b = new C24179t(this, this, context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f65951d = frameLayout;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setAlpha(0.37f);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f65952e = frameLayout2;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        FrameLayout frameLayout3 = new FrameLayout(context2);
        this.f65953f = frameLayout3;
        frameLayout3.setLayoutParams(layoutParams);
        frameLayout3.setClipChildren(false);
        frameLayout3.setClipToPadding(false);
        frameLayout3.setVisibility(8);
        addView(frameLayout);
        addView(frameLayout2);
        addView(frameLayout3);
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.lens_highlight_elevation, typedValue, true);
        this.f65948a = typedValue.getFloat();
        C24168i iVar = new C24168i(resources.getDimensionPixelSize(R.dimen.lens_teardrop_rotation_margin_min), resources.getDimensionPixelSize(R.dimen.lens_teardrop_rotation_margin_max), this);
        this.f65946A = iVar;
        C24168i iVar2 = new C24168i(resources.getDimensionPixelSize(R.dimen.lens_hotspot_margin_min), resources.getDimensionPixelSize(R.dimen.lens_hotspot_margin_max), this);
        this.f65947B = iVar2;
        C58485gu guVar = C24176q.f66060a;
        Context context3 = getContext();
        LayoutInflater layoutInflater = (LayoutInflater) context2.getSystemService("layout_inflater");
        FrameLayout frameLayout4 = frameLayout2;
        C24168i iVar3 = iVar;
        C24171l a = C24176q.m44990a(C24176q.f66064e, context3, layoutInflater, frameLayout4, iVar3, iVar2);
        this.f65967u = a;
        C24171l lVar = a;
        C24171l a2 = C24176q.m44990a(C24176q.f66066g, context3, layoutInflater, frameLayout4, iVar3, iVar2);
        this.f65968v = a2;
        FrameLayout frameLayout5 = frameLayout3;
        C24171l lVar2 = a2;
        C24168i iVar4 = iVar2;
        this.f65969w = C24176q.m44990a(C24176q.f66066g, context3, layoutInflater, frameLayout4, iVar3, iVar4);
        this.f65970x = C24176q.m44990a(C24176q.f66064e, context3, layoutInflater, frameLayout4, iVar3, iVar4);
        this.f65971y = C24176q.m44990a(C24176q.f66067h, context3, layoutInflater, frameLayout4, iVar3, iVar4);
        this.f65972z = C24176q.m44990a(C24176q.f66065f, context3, layoutInflater, frameLayout4, iVar3, iVar4);
        this.f65955h = lVar;
        this.f65956i = lVar2;
        C24163d dVar = new C24163d(context2);
        this.f65959l = dVar;
        dVar.f66023a = iVar;
        dVar.f66024b = iVar2;
        dVar.setLayoutParams(layoutParams);
        frameLayout5.addView(dVar);
        setLayoutDirection(0);
    }
}
