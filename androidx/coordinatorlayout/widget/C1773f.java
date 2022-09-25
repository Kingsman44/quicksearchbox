package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.C1767a;

/* renamed from: androidx.coordinatorlayout.widget.f */
/* compiled from: PG */
public final class C1773f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public C1770c f5523a;

    /* renamed from: b */
    boolean f5524b = false;

    /* renamed from: c */
    public int f5525c = 0;

    /* renamed from: d */
    public int f5526d = 0;

    /* renamed from: e */
    public int f5527e = -1;

    /* renamed from: f */
    public int f5528f = -1;

    /* renamed from: g */
    public int f5529g = 0;

    /* renamed from: h */
    public int f5530h = 0;

    /* renamed from: i */
    int f5531i;

    /* renamed from: j */
    int f5532j;

    /* renamed from: k */
    public View f5533k;

    /* renamed from: l */
    public View f5534l;

    /* renamed from: m */
    public boolean f5535m;

    /* renamed from: n */
    public boolean f5536n;

    /* renamed from: o */
    public boolean f5537o;

    /* renamed from: p */
    final Rect f5538p = new Rect();

    /* renamed from: q */
    private boolean f5539q;

    public C1773f(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: a */
    public final void mo4974a(C1770c cVar) {
        C1770c cVar2 = this.f5523a;
        if (cVar2 != cVar) {
            if (cVar2 != null) {
                cVar2.mo4955c();
            }
            this.f5523a = cVar;
            this.f5524b = true;
            if (cVar != null) {
                cVar.mo4953a(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4975b(int i, boolean z) {
        if (i != 0) {
            this.f5539q = z;
        } else {
            this.f5536n = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo4976c(int i) {
        return i != 0 ? this.f5539q : this.f5536n;
    }

    public C1773f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1767a.f5496b);
        this.f5525c = obtainStyledAttributes.getInteger(0, 0);
        this.f5528f = obtainStyledAttributes.getResourceId(1, -1);
        this.f5526d = obtainStyledAttributes.getInteger(2, 0);
        this.f5527e = obtainStyledAttributes.getInteger(6, -1);
        this.f5529g = obtainStyledAttributes.getInt(5, 0);
        this.f5530h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f5524b = hasValue;
        if (hasValue) {
            this.f5523a = CoordinatorLayout.m4840a(context, attributeSet, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        C1770c cVar = this.f5523a;
        if (cVar != null) {
            cVar.mo4953a(this);
        }
    }

    public C1773f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C1773f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C1773f(C1773f fVar) {
        super(fVar);
    }
}
