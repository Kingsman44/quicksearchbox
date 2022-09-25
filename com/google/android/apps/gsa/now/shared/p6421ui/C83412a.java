package com.google.android.apps.gsa.now.shared.p6421ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C1877c;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.a */
/* compiled from: PG */
public final class C83412a extends FrameLayout {

    /* renamed from: a */
    public final FrameLayout f227366a;

    /* renamed from: b */
    public final int f227367b;

    /* renamed from: c */
    private final View f227368c;

    /* renamed from: d */
    private final Paint f227369d;

    /* renamed from: e */
    private final int f227370e;

    /* renamed from: f */
    private final FrameLayout.LayoutParams f227371f;

    /* renamed from: g */
    private final FrameLayout.LayoutParams f227372g;

    /* renamed from: h */
    private final int f227373h;

    /* renamed from: i */
    private int f227374i = -1;

    /* renamed from: j */
    private int f227375j = -1;

    /* renamed from: k */
    private boolean f227376k;

    /* renamed from: l */
    private boolean f227377l;

    /* renamed from: m */
    private boolean f227378m;

    /* renamed from: n */
    private int f227379n = 1;

    /* renamed from: o */
    private int f227380o = 1;

    /* renamed from: p */
    private int f227381p = 1;

    public C83412a(Context context) {
        super(context);
        setId(R.id.card_module_container);
        View view = new View(context);
        this.f227368c = view;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f227366a = frameLayout;
        Paint paint = new Paint(1);
        this.f227369d = paint;
        paint.setColor(-3355444);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) context.getResources().getDimensionPixelSize(R.dimen.card_stroke_width));
        setWillNotDraw(false);
        this.f227370e = context.getResources().getDimensionPixelOffset(R.dimen.card_top_margin);
        this.f227373h = context.getResources().getDimensionPixelSize(R.dimen.gestalt_card_horizontal_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lotic_card_side_margin);
        int a = C90686c.m148055a(context, 4) + dimensionPixelSize + dimensionPixelSize;
        this.f227367b = a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.f227371f = layoutParams2;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        this.f227372g = layoutParams3;
        view.setLayoutParams(layoutParams2);
        frameLayout.setLayoutParams(layoutParams3);
        addView(view);
        addView(frameLayout);
    }

    /* renamed from: a */
    public static C83412a m132796a(Context context, View view) {
        C83412a aVar = new C83412a(context);
        aVar.mo76744c(view);
        return aVar;
    }

    /* renamed from: j */
    private final Rect m132797j() {
        Rect rect = new Rect();
        Drawable background = this.f227368c.getBackground();
        if (background instanceof NinePatchDrawable) {
            ((NinePatchDrawable) background).getPadding(rect);
            return rect;
        }
        int i = this.f227381p;
        if (i == 0) {
            throw null;
        } else if (i != 2) {
            return rect;
        } else {
            int i2 = this.f227379n;
            if (i2 == 0) {
                throw null;
            } else if (i2 == 5) {
                return rect;
            } else {
                Drawable k = m132798k();
                if (k instanceof NinePatchDrawable) {
                    k.getPadding(rect);
                    return rect;
                }
                int dimension = (int) getResources().getDimension(R.dimen.generic_card_side_padding);
                return new Rect(dimension, 0, dimension, 0);
            }
        }
    }

    /* renamed from: k */
    private final Drawable m132798k() {
        int i;
        Context context = getContext();
        if (this.f227377l) {
            i = this.f227378m ? R.drawable.discover_card_background_dark_whole : R.drawable.dark_patch_c8_b11;
        } else {
            i = this.f227378m ? R.drawable.discover_card_background_whole : R.drawable.patch_equal_c8_b11;
        }
        return C1877c.m5125a(context, i);
    }

    /* renamed from: c */
    public final void mo76744c(View view) {
        this.f227366a.removeAllViews();
        if (view != null) {
            this.f227366a.addView(view);
        }
    }

    /* renamed from: d */
    public final void mo76745d(boolean z) {
        if (this.f227377l != z) {
            this.f227377l = z;
            m132799l();
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f227376k) {
            int i = this.f227379n;
            if (i == 0) {
                throw null;
            } else if (i != 5) {
                int i2 = this.f227373h + m132797j().left;
                canvas.drawLine((float) i2, (float) this.f227368c.getHeight(), (float) (this.f227366a.getWidth() + i2), (float) this.f227368c.getHeight(), this.f227369d);
            }
        }
    }

    /* renamed from: e */
    public final void mo76747e(boolean z) {
        if (this.f227378m != z) {
            this.f227378m = z;
            m132799l();
        }
    }

    /* renamed from: f */
    public final void mo76748f(boolean z) {
        if (this.f227376k != z) {
            this.f227376k = z;
            invalidate();
        }
    }

    /* renamed from: i */
    public final void mo76751i(int i) {
        mo76750h(3, i, 2);
    }

    public final void setClipChildren(boolean z) {
        super.setClipChildren(z);
        this.f227366a.setClipChildren(z);
        if (!z) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x012d  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m132799l() {
        /*
            r15 = this;
            int r0 = r15.f227380o
            r1 = 0
            if (r0 == 0) goto L_0x0130
            r2 = 1
            r3 = 2
            r4 = -1
            r5 = 0
            if (r0 != r3) goto L_0x0012
            android.view.View r0 = r15.f227368c
            r0.setBackgroundColor(r5)
            goto L_0x00aa
        L_0x0012:
            int r0 = r15.f227379n
            if (r0 == 0) goto L_0x012f
            if (r0 == r2) goto L_0x00aa
            int r0 = r0 + r4
            switch(r0) {
                case 1: goto L_0x0082;
                case 2: goto L_0x0059;
                case 3: goto L_0x0030;
                case 4: goto L_0x0029;
                case 5: goto L_0x001e;
                case 6: goto L_0x0030;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x00aa
        L_0x001e:
            android.view.View r0 = r15.f227368c
            android.graphics.drawable.Drawable r6 = r15.m132798k()
            r0.setBackground(r6)
            goto L_0x00aa
        L_0x0029:
            android.view.View r0 = r15.f227368c
            r0.setBackgroundColor(r5)
            goto L_0x00aa
        L_0x0030:
            android.view.View r0 = r15.f227368c
            android.content.Context r6 = r15.getContext()
            boolean r7 = r15.f227377l
            if (r7 == 0) goto L_0x0046
            boolean r7 = r15.f227378m
            if (r7 == 0) goto L_0x0042
            r7 = 2131231773(0x7f08041d, float:1.8079636E38)
            goto L_0x0051
        L_0x0042:
            r7 = 2131231733(0x7f0803f5, float:1.8079555E38)
            goto L_0x0051
        L_0x0046:
            boolean r7 = r15.f227378m
            if (r7 == 0) goto L_0x004e
            r7 = 2131231772(0x7f08041c, float:1.8079634E38)
            goto L_0x0051
        L_0x004e:
            r7 = 2131233715(0x7f080bb3, float:1.8083575E38)
        L_0x0051:
            android.graphics.drawable.Drawable r6 = androidx.core.content.C1877c.m5125a(r6, r7)
            r0.setBackground(r6)
            goto L_0x00aa
        L_0x0059:
            android.view.View r0 = r15.f227368c
            android.content.Context r6 = r15.getContext()
            boolean r7 = r15.f227377l
            if (r7 == 0) goto L_0x006f
            boolean r7 = r15.f227378m
            if (r7 == 0) goto L_0x006b
            r7 = 2131231774(0x7f08041e, float:1.8079639E38)
            goto L_0x007a
        L_0x006b:
            r7 = 2131231734(0x7f0803f6, float:1.8079557E38)
            goto L_0x007a
        L_0x006f:
            boolean r7 = r15.f227378m
            if (r7 == 0) goto L_0x0077
            r7 = 2131231777(0x7f080421, float:1.8079645E38)
            goto L_0x007a
        L_0x0077:
            r7 = 2131233716(0x7f080bb4, float:1.8083577E38)
        L_0x007a:
            android.graphics.drawable.Drawable r6 = androidx.core.content.C1877c.m5125a(r6, r7)
            r0.setBackground(r6)
            goto L_0x00aa
        L_0x0082:
            android.view.View r0 = r15.f227368c
            android.content.Context r6 = r15.getContext()
            boolean r7 = r15.f227377l
            if (r7 == 0) goto L_0x0098
            boolean r7 = r15.f227378m
            if (r7 == 0) goto L_0x0094
            r7 = 2131231775(0x7f08041f, float:1.807964E38)
            goto L_0x00a3
        L_0x0094:
            r7 = 2131231735(0x7f0803f7, float:1.807956E38)
            goto L_0x00a3
        L_0x0098:
            boolean r7 = r15.f227378m
            if (r7 == 0) goto L_0x00a0
            r7 = 2131231778(0x7f080422, float:1.8079647E38)
            goto L_0x00a3
        L_0x00a0:
            r7 = 2131233717(0x7f080bb5, float:1.808358E38)
        L_0x00a3:
            android.graphics.drawable.Drawable r6 = androidx.core.content.C1877c.m5125a(r6, r7)
            r0.setBackground(r6)
        L_0x00aa:
            android.graphics.Rect r0 = r15.m132797j()
            r6 = -1069547520(0xffffffffc0400000, float:-3.0)
            android.content.Context r7 = r15.getContext()
            float r6 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r6, r7)
            int r6 = (int) r6
            int r7 = r15.f227373h
            int r8 = r15.f227379n
            if (r8 == 0) goto L_0x012e
            r9 = 5
            r10 = 3
            if (r8 == r9) goto L_0x00cd
            int r8 = r15.f227381p
            if (r8 == 0) goto L_0x00cc
            if (r8 != r10) goto L_0x00ca
            goto L_0x00cd
        L_0x00ca:
            r8 = r7
            goto L_0x00cf
        L_0x00cc:
            throw r1
        L_0x00cd:
            r7 = 0
            r8 = 0
        L_0x00cf:
            boolean r9 = r15.f227378m
            if (r9 == 0) goto L_0x00d9
            int r6 = r15.f227375j
            if (r6 != r4) goto L_0x00e2
            r6 = 0
            goto L_0x00e2
        L_0x00d9:
            int r9 = r15.f227375j
            int r6 = r6 + r9
            if (r6 != r4) goto L_0x00e1
            int r6 = r15.f227370e
            goto L_0x00e2
        L_0x00e1:
            r6 = r9
        L_0x00e2:
            int r9 = r15.f227374i
            if (r9 != r4) goto L_0x00e7
            r9 = 0
        L_0x00e7:
            int r11 = r0.top
            int r12 = r0.bottom
            int r13 = r15.f227379n
            int r14 = r13 + -1
            if (r13 == 0) goto L_0x012d
            if (r14 == r2) goto L_0x00fe
            if (r14 == r3) goto L_0x00fd
            if (r14 == r10) goto L_0x00fc
            r1 = 6
            if (r14 == r1) goto L_0x00fd
            r5 = r9
            goto L_0x00fe
        L_0x00fc:
            r5 = r9
        L_0x00fd:
            r6 = 0
        L_0x00fe:
            android.widget.FrameLayout$LayoutParams r1 = r15.f227371f
            int r2 = r15.f227374i
            if (r2 != r4) goto L_0x0106
            r2 = r5
            goto L_0x0108
        L_0x0106:
            int r2 = r5 - r12
        L_0x0108:
            r1.setMargins(r7, r6, r8, r2)
            android.widget.FrameLayout$LayoutParams r1 = r15.f227372g
            int r2 = r0.left
            int r7 = r7 + r2
            int r6 = r6 + r11
            int r0 = r0.right
            int r8 = r8 + r0
            int r0 = r15.f227374i
            if (r0 != r4) goto L_0x011a
            int r5 = r5 + r12
            goto L_0x011b
        L_0x011a:
            int r5 = r5 - r12
        L_0x011b:
            r1.setMargins(r7, r6, r8, r5)
            android.widget.FrameLayout r0 = r15.f227366a
            android.widget.FrameLayout$LayoutParams r1 = r15.f227372g
            r0.setLayoutParams(r1)
            android.view.View r0 = r15.f227368c
            android.widget.FrameLayout$LayoutParams r1 = r15.f227371f
            r0.setLayoutParams(r1)
            return
        L_0x012d:
            throw r1
        L_0x012e:
            throw r1
        L_0x012f:
            throw r1
        L_0x0130:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.now.shared.p6421ui.C83412a.m132799l():void");
    }

    /* renamed from: b */
    public final void mo76743b(int i) {
        this.f227374i = i;
        int i2 = this.f227379n;
        if (i2 == 0) {
            throw null;
        } else if (i2 != 1) {
            m132799l();
        }
    }

    /* renamed from: g */
    public final void mo76749g(int i) {
        this.f227375j = i;
        int i2 = this.f227379n;
        if (i2 == 0) {
            throw null;
        } else if (i2 != 1) {
            m132799l();
        }
    }

    /* renamed from: h */
    public final void mo76750h(int i, int i2, int i3) {
        int i4 = this.f227379n;
        if (i2 == 0) {
            throw null;
        } else if (i2 != i4 || i != this.f227380o || i3 != this.f227381p) {
            boolean z = true;
            if (i == 3) {
                if (i3 == 3) {
                    z = false;
                }
                i = 3;
            }
            C58838bb.m90884s(z, "Card borders not allowed on stream-aligned content. Update either Decoration or Alignment.");
            this.f227381p = i3;
            this.f227379n = i2;
            this.f227380o = i;
            m132799l();
            invalidate();
        }
    }
}
