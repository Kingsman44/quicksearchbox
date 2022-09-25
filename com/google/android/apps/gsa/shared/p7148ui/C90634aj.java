package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.apps.gsa.shared.util.p7187ui.C91118q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.ui.aj */
/* compiled from: PG */
public class C90634aj extends C90650az implements C91118q {

    /* renamed from: b */
    private static final C59071e f253457b = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.aj");

    /* renamed from: a */
    public boolean f253458a;

    /* renamed from: c */
    private C90700l f253459c;

    /* renamed from: d */
    private C90626ab f253460d;

    /* renamed from: e */
    private boolean f253461e;

    /* renamed from: f */
    private boolean f253462f;

    /* renamed from: g */
    private boolean f253463g;

    public C90634aj(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    @ViewDebug.ExportedProperty(category = "velvet")
    /* renamed from: a */
    public final int mo84903a() {
        return (int) Math.floor((double) (((float) getContentHeight()) * getScale()));
    }

    /* renamed from: b */
    public final void mo84904b(int i) {
        super.scrollTo(getScrollX(), i);
    }

    public final void computeScroll() {
    }

    public final void destroy() {
        if (getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            ((C59052c) ((C59052c) f253457b.mo56226d()).mo56372aa(11242)).mo56389s("Force-detached WebView from previous parent: %s", viewGroup);
            viewGroup.removeView(this);
        }
        this.f253463g = true;
        super.destroy();
    }

    public final void getDrawingRect(Rect rect) {
        super.getDrawingRect(rect);
        if (this.f253459c != null) {
            rect.offset(0, Math.round(getTranslationY()));
            C90700l lVar = this.f253459c;
            rect.top += lVar.f253712a.f253338a;
            int i = rect.bottom;
            int i2 = lVar.f253712a.f253339b;
            rect.bottom = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        C90625aa aaVar;
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (!(parent instanceof ViewGroup)) {
                aaVar = null;
                break;
            } else if (parent instanceof C90625aa) {
                aaVar = (C90625aa) parent;
                break;
            } else {
                parent = parent.getParent();
            }
        }
        if (aaVar != null) {
            this.f253460d = new C90626ab(aaVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f253460d = null;
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f253458a) {
            if ((motionEvent.getSource() & 8194) == 8194 && motionEvent.getActionMasked() == 8) {
                return false;
            }
        } else if (!((motionEvent.getSource() & 8194) == 0 || (motionEvent.getActionMasked() & 8) == 0)) {
            return false;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f253462f = false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f253462f) {
            onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
        }
        C90626ab abVar = this.f253460d;
        if (abVar != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                abVar.f253415c = MotionEvent.obtain(motionEvent);
                abVar.f253416d = motionEvent.getX();
                abVar.f253417e = motionEvent.getY();
                abVar.f253418f = false;
                abVar.f253419g = abVar.f253413a.mo84876b();
            } else if (actionMasked == 1 || actionMasked == 3) {
                abVar.f253419g = false;
                if (abVar.f253414b) {
                    abVar.f253414b = false;
                    abVar.f253413a.mo84875a();
                    MotionEvent motionEvent2 = abVar.f253415c;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                        abVar.f253415c = null;
                    }
                }
            }
        }
        if (!super.onTouchEvent(motionEvent)) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r4 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onWindowFocusChanged(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.isFocused()
            super.onWindowFocusChanged(r4)
            boolean r1 = r3.f253461e
            r2 = 0
            if (r1 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0015
            r3.requestFocus()
            goto L_0x0018
        L_0x0012:
            if (r4 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            r2 = 1
        L_0x0018:
            r3.f253461e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.C90634aj.onWindowFocusChanged(boolean):void");
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        CoScrollContainer coScrollContainer;
        int i9 = i2;
        C90626ab abVar = this.f253460d;
        int i10 = 0;
        if (abVar != null) {
            if (abVar.f253415c == null || !abVar.f253419g) {
                int i11 = i;
            } else {
                if (!abVar.f253414b) {
                    abVar.f253413a.mo84878d();
                    abVar.f253414b = true;
                }
                abVar.f253416d -= (float) i;
                abVar.f253417e -= (float) i9;
                MotionEvent obtain = MotionEvent.obtain(abVar.f253415c.getDownTime(), SystemClock.uptimeMillis(), 2, abVar.f253416d, abVar.f253417e, 0);
                abVar.f253418f = abVar.f253413a.mo84877c();
                obtain.recycle();
            }
            z2 = abVar.f253418f;
            C90700l lVar = this.f253459c;
            if (!(lVar == null || !z2 || (coScrollContainer = lVar.f253712a) == null)) {
                coScrollContainer.f253340c = false;
            }
        } else {
            int i12 = i;
            z2 = false;
        }
        C90700l lVar2 = this.f253459c;
        if (lVar2 != null && !z2) {
            CoScrollContainer coScrollContainer2 = lVar2.f253712a;
            if (coScrollContainer2 != null) {
                i9 = coScrollContainer2.mo84786b(lVar2, i9);
            }
            i10 = i9;
        }
        return super.overScrollBy(i, i10, i3, i4, i5, i6, i7, i8, z);
    }

    public final void scrollTo(int i, int i2) {
        CoScrollContainer coScrollContainer;
        C90700l lVar = this.f253459c;
        if (!(lVar == null || (coScrollContainer = lVar.f253712a) == null)) {
            i2 = coScrollContainer.mo84784a(lVar, i2);
        }
        super.scrollTo(i, i2);
    }

    public final void setFocusable(boolean z) {
        if (!this.f253463g) {
            super.setFocusable(z);
        }
    }

    public final void setFocusableInTouchMode(boolean z) {
        if (!this.f253463g) {
            super.setFocusableInTouchMode(z);
        }
    }

    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C90700l) {
            this.f253459c = (C90700l) layoutParams;
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        this.f253462f = true;
    }

    public final String toString() {
        String azVar = super.toString();
        float translationY = getTranslationY();
        int scrollY = getScrollY();
        String valueOf = String.valueOf(getTag());
        return azVar + "{translation=" + translationY + ";scroll=" + scrollY + "}[" + valueOf + "]";
    }

    public C90634aj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C90634aj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f253458a = false;
        setOverScrollMode(2);
    }
}
