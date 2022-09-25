package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.libraries.p2460r.p2464b.C32050a;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32052b;
import com.google.android.libraries.p2460r.p2464b.p2468d.C32056a;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57448ds;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57454dy;

/* renamed from: com.google.android.libraries.r.c.b.p */
/* compiled from: PG */
public final class C32112p extends FrameLayout {

    /* renamed from: a */
    public final C57448ds f86216a;

    /* renamed from: b */
    public final C32052b f86217b;

    /* renamed from: c */
    public final boolean f86218c;

    /* renamed from: d */
    int f86219d = -1;

    /* renamed from: e */
    int f86220e = -1;

    /* renamed from: f */
    private final int f86221f;

    /* renamed from: g */
    private final Context f86222g;

    /* renamed from: h */
    private final C57454dy f86223h;

    /* renamed from: i */
    private final boolean f86224i;

    /* renamed from: j */
    private final boolean f86225j;

    /* renamed from: k */
    private final C32109m f86226k;

    /* renamed from: l */
    private C32105i f86227l;

    /* renamed from: m */
    private boolean f86228m;

    /* renamed from: n */
    private int f86229n;

    public C32112p(Context context, C57448ds dsVar, C32109m mVar, C32052b bVar, int i, C57454dy dyVar, boolean z) {
        super(context);
        this.f86221f = i;
        this.f86216a = dsVar;
        this.f86217b = bVar;
        this.f86224i = z;
        this.f86222g = context;
        this.f86223h = dyVar;
        this.f86226k = mVar;
        boolean b = C32110n.m59818b(dsVar, i);
        this.f86225j = b;
        boolean a = C32110n.m59817a(dsVar.f153457c);
        this.f86218c = a;
        if (!a || !z) {
            mo37910c(4);
        } else {
            mo37910c(3);
        }
        if (b) {
            super.setOutlineProvider(new C32111o(this));
        } else {
            super.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        setWillNotDraw(false);
    }

    /* renamed from: b */
    public final void mo37909b(Canvas canvas) {
        this.f86228m = true;
        super.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo37910c(int i) {
        C32105i iVar;
        C32105i iVar2 = this.f86227l;
        if (iVar2 != null) {
            iVar2.mo37904f(this);
        }
        C32109m mVar = this.f86226k;
        int i2 = this.f86216a.f153457c;
        boolean booleanValue = ((Boolean) this.f86217b.mo37837a()).booleanValue();
        if (i - 1 != 2) {
            iVar = new C32098b(mVar, i2, booleanValue);
        } else {
            iVar = C32106j.f86205a;
        }
        this.f86227l = iVar;
        iVar.mo37887b(this);
    }

    public final void draw(Canvas canvas) {
        this.f86228m = false;
        this.f86227l.mo37886a(this, canvas);
        C32050a.m59726a(this.f86228m, "View.draw() never called in RoundedCornerWrapperView.draw()", new Object[0]);
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        this.f86227l.mo37888c(this, rect);
        return super.invalidateChildInParent(iArr, rect);
    }

    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        this.f86227l.mo37889d(this, view2);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.f86225j) {
            int width = getWidth();
            int height = getHeight();
            if (width != 0 && height != 0) {
                int a = mo37908a(width, height);
                if (this.f86223h.f153474c > 0) {
                    boolean booleanValue = ((Boolean) this.f86217b.mo37837a()).booleanValue();
                    setForeground(new C32099c(this.f86222g, this.f86223h, C32110n.m59819c((float) a, this.f86216a.f153457c, booleanValue ? 1 : 0), booleanValue));
                }
                this.f86227l.mo37890e(a, ((Boolean) this.f86217b.mo37837a()).booleanValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if ((this.f86227l instanceof C32104h) && isAttachedToWindow() && !isHardwareAccelerated()) {
            mo37910c(4);
        }
        mo37908a(i, i2);
        int i5 = this.f86216a.f153457c;
        ((Boolean) this.f86217b.mo37837a()).booleanValue();
    }

    /* renamed from: a */
    public final int mo37908a(int i, int i2) {
        int i3;
        int i4 = 0;
        if (!this.f86225j || i == 0 || i2 == 0) {
            return 0;
        }
        int i5 = this.f86221f;
        if (i5 > 0) {
            this.f86229n = i5;
            return i5;
        } else if (i == this.f86219d && i2 == this.f86220e) {
            return this.f86229n;
        } else {
            C57448ds dsVar = this.f86216a;
            int i6 = dsVar.f153455a;
            int i7 = i6 != 0 ? i6 != 4 ? i6 != 5 ? i6 != 6 ? 0 : 3 : 2 : 1 : 4;
            int i8 = i7 - 1;
            if (i7 != 0) {
                if (i8 == 0) {
                    if (i6 == 4) {
                        i4 = ((Integer) dsVar.f153456b).intValue();
                    }
                    i4 = (int) C32056a.m59733a((float) i4, this.f86222g);
                } else if (i8 == 1) {
                    if (i6 == 5) {
                        i4 = ((Integer) dsVar.f153456b).intValue();
                    }
                    i4 = (i4 * i2) / 100;
                } else if (i8 == 2) {
                    if (i6 == 6) {
                        i4 = ((Integer) dsVar.f153456b).intValue();
                    }
                    i4 = (i4 * i) / 100;
                }
                C57448ds dsVar2 = this.f86216a;
                int min = Math.min(i2, i);
                int min2 = Math.min(i4, min);
                int i9 = dsVar2.f153457c;
                if (C32110n.m59817a(i9)) {
                    i3 = Math.min(min2, min / 2);
                } else {
                    if ((C32110n.m59820d(2, i9) && C32110n.m59820d(9, i9)) || (C32110n.m59820d(3, i9) && C32110n.m59820d(5, i9))) {
                        min2 = Math.min(min2, i2 / 2);
                    }
                    int i10 = dsVar2.f153457c;
                    i3 = ((!C32110n.m59820d(2, i10) || !C32110n.m59820d(3, i10)) && (!C32110n.m59820d(9, i10) || !C32110n.m59820d(5, i10))) ? min2 : Math.min(min2, i / 2);
                }
                this.f86229n = i3;
                this.f86219d = i;
                this.f86220e = i2;
                return i3;
            }
            throw null;
        }
    }
}
