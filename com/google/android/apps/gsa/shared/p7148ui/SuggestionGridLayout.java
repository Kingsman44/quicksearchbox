package com.google.android.apps.gsa.shared.p7148ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.sidekick.shared.p7256ui.C91946v;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.ui.SuggestionGridLayout */
/* compiled from: PG */
public class SuggestionGridLayout extends ViewGroup {

    /* renamed from: h */
    private static final C59071e f253363h = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.SuggestionGridLayout");

    /* renamed from: a */
    public final int f253364a;

    /* renamed from: b */
    public final Rect f253365b;

    /* renamed from: c */
    public int f253366c;

    /* renamed from: d */
    public final int[] f253367d;

    /* renamed from: e */
    boolean f253368e;

    /* renamed from: f */
    public final ArrayList f253369f;

    /* renamed from: g */
    public boolean f253370g;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: i */
    private final int f253371i;
    @ViewDebug.ExportedProperty(category = "velvet")

    /* renamed from: j */
    private final int f253372j;

    /* renamed from: k */
    private final int f253373k;

    /* renamed from: l */
    private boolean f253374l;

    /* renamed from: m */
    private final int f253375m;

    /* renamed from: n */
    private int f253376n;

    /* renamed from: o */
    private int f253377o;

    /* renamed from: p */
    private final LayoutTransition f253378p;

    /* renamed from: q */
    private final C90649ay f253379q;

    /* renamed from: r */
    private final Resources f253380r;

    /* renamed from: s */
    private final ArrayList f253381s;

    /* renamed from: t */
    private final Set f253382t;

    /* renamed from: u */
    private int f253383u;

    /* renamed from: v */
    private boolean f253384v;

    public SuggestionGridLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public static C90638an m147911a(C90637am amVar) {
        return (C90638an) amVar.f253464a.getLayoutParams();
    }

    /* renamed from: d */
    public static void m147912d(View view, int i) {
        C90638an anVar = (C90638an) view.getLayoutParams();
        if (i != 2 || !anVar.f253482k) {
            view.setLayerType(i, (Paint) null);
        }
    }

    /* renamed from: h */
    private final int m147913h(View view) {
        return this.f253381s.indexOf(C90637am.m147969e(view));
    }

    public final void addView(View view) {
        if (this.f253374l) {
            super.addView(view);
        } else {
            mo84844f(view, -1, -3);
        }
    }

    /* renamed from: b */
    public final void mo84839b(View view) {
        C90637am e = C90637am.m147969e(view);
        if (e != null) {
            mo84840c(e);
        } else {
            ((C59052c) ((C59052c) f253363h.mo56226d()).mo56372aa(11246)).mo56389s("removeGridItem with non-grid item %s", view);
        }
    }

    /* renamed from: c */
    public final void mo84840c(C90637am amVar) {
        if (this.f253369f.remove(amVar.f253464a)) {
            C90649ay ayVar = this.f253379q;
            if (ayVar.f253510b) {
                if (ayVar.f253511c != null) {
                    ayVar.f253509a.mo84931d();
                    ayVar.f253511c.setTranslationX(0.0f);
                    ayVar.f253509a.mo84933f(ayVar.f253511c);
                    ayVar.f253511c = null;
                }
                ayVar.f253510b = false;
            }
        }
        this.f253381s.remove(amVar);
        amVar.f253464a.setTag(R.id.suggestion_grid_layout_grid_item, (Object) null);
        super.removeView(amVar.f253464a);
        this.f253382t.remove(amVar.f253464a);
        View view = amVar.f253465b;
        View view2 = amVar.f253466c;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C90638an) && layoutParams.width == -1;
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C90638an anVar = (C90638an) view.getLayoutParams();
        if (anVar.f253488q == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(anVar.f253488q);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    /* renamed from: e */
    public final void mo84843e(boolean z) {
        setLayoutTransition(z ? this.f253378p : null);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final void mo84844f(View view, int i, int i2) {
        if (view instanceof C91946v) {
            C90649ay ayVar = this.f253379q;
            boolean z = ayVar.f253513e;
            boolean z2 = ayVar.f253514f;
            C90649ay ayVar2 = ((C91946v) view).f256423g;
            ayVar2.f253513e = z;
            ayVar2.f253514f = z2;
        }
        if (i2 < this.f253372j) {
            C90638an layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
            }
            if (!checkLayoutParams(layoutParams)) {
                layoutParams = new C90638an(layoutParams);
            }
            C90638an anVar = (C90638an) layoutParams;
            if (anVar.f253472a == -2) {
                if (C91115n.m148876h(this)) {
                    i2 = 0;
                } else {
                    i2 = this.f253372j - 1;
                }
            }
            if (i2 != -3) {
                anVar.f253472a = i2;
            }
            view.setLayoutParams(anVar);
            C90638an anVar2 = (C90638an) view.getLayoutParams();
            if (!anVar2.f253483l && !anVar2.f253484m) {
                view.setTranslationY(0.0f);
            }
            C90637am amVar = new C90637am(view, this.f253380r, this.f253384v);
            if (C90687h.m148062c(m147911a(amVar).f253489r)) {
                amVar.mo84925f(2);
            }
            C58801sm G = ((C58485gu) amVar.f253467d).listIterator(0);
            while (G.hasNext()) {
                View view2 = (View) G.next();
                if (view2.getLayoutParams() instanceof C90638an) {
                    ((C90638an) view2.getLayoutParams()).f253477f = this.f253383u;
                }
            }
            this.f253383u++;
            if (i < 0 || i >= getChildCount()) {
                this.f253381s.add(amVar);
                try {
                    this.f253374l = true;
                    super.addView(view);
                    this.f253374l = false;
                } catch (Throwable th) {
                    this.f253374l = false;
                    throw th;
                }
            } else {
                int h = m147913h(getChildAt(i));
                int i3 = i;
                while (h < 0 && i3 < getChildCount()) {
                    i3++;
                    h = m147913h(getChildAt(i3));
                }
                if (h >= 0) {
                    this.f253381s.add(h, amVar);
                    try {
                        this.f253374l = true;
                        super.addView(view, i);
                        this.f253374l = false;
                    } catch (Throwable th2) {
                        this.f253374l = false;
                        throw th2;
                    }
                }
            }
        } else {
            throw new RuntimeException("Column exceeds column count.");
        }
    }

    /* renamed from: g */
    public final void mo84845g() {
        if (this.f253384v) {
            this.f253384v = false;
            ArrayList arrayList = this.f253381s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C90637am) arrayList.get(i)).f253469f = false;
            }
            requestLayout();
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C90638an(0);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C90638an(getContext(), attributeSet);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getChildDrawingOrder(int r3, int r4) {
        /*
            r2 = this;
            java.util.ArrayList r0 = r2.f253369f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            return r4
        L_0x0009:
            java.util.ArrayList r0 = r2.f253369f
            int r0 = r0.size()
            int r3 = r3 - r0
            r0 = 0
            if (r4 < r3) goto L_0x0029
            java.util.ArrayList r1 = r2.f253369f
            int r4 = r4 - r3
            java.lang.Object r3 = r1.get(r4)
            android.view.View r3 = (android.view.View) r3
            int r3 = r2.indexOfChild(r3)
            if (r3 < 0) goto L_0x0023
            r0 = 1
        L_0x0023:
            java.lang.String r4 = "Animating view must be in layout"
            com.google.common.base.C58838bb.m90884s(r0, r4)
            return r3
        L_0x0029:
            if (r0 > r4) goto L_0x003c
            android.view.View r3 = r2.getChildAt(r0)
            java.util.ArrayList r1 = r2.f253369f
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0039
            int r4 = r4 + 1
        L_0x0039:
            int r0 = r0 + 1
            goto L_0x0029
        L_0x003c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout.getChildDrawingOrder(int, int):int");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SuggestionGridLayout.class.getCanonicalName());
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f253379q.mo84941a(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = (getMeasuredWidth() - this.f253376n) / 2;
        Arrays.fill(this.f253367d, getPaddingTop());
        int paddingTop = getPaddingTop();
        int size = this.f253381s.size();
        C90637am amVar = null;
        for (int i5 = 0; i5 < size; i5++) {
            C90637am amVar2 = (C90637am) this.f253381s.get(i5);
            if (!amVar2.mo84926g()) {
                C90638an a = m147911a(amVar2);
                if (a.f253476e) {
                    amVar = amVar2;
                } else {
                    int i6 = a.f253472a;
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    int i7 = ((this.f253377o + this.f253373k) * i6) + measuredWidth;
                    if (!a.f253483l) {
                        int[] iArr = this.f253367d;
                        if (iArr[i6] < paddingTop) {
                            iArr[i6] = paddingTop;
                        }
                    }
                    int i8 = this.f253367d[i6] + a.topMargin;
                    int b = amVar2.mo84923b() + i8 + this.f253364a + a.bottomMargin;
                    int i9 = a.f253472a;
                    if (i9 == -1) {
                        Arrays.fill(this.f253367d, b);
                    } else {
                        this.f253367d[i9] = b;
                    }
                    int c = amVar2.mo84924c();
                    amVar2.mo84923b();
                    amVar2.mo84927h(i7, i8, c + i7);
                }
            }
        }
        if (amVar != null) {
            C90638an a2 = m147911a(amVar);
            int i10 = a2.f253472a;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = this.f253367d[i10];
            int i12 = a2.topMargin;
            int measuredHeight = getMeasuredHeight();
            int i13 = a2.bottomMargin;
            int max = Math.max(getPaddingBottom(), amVar.f253468e.bottom);
            int max2 = Math.max(i11 + i12, (((measuredHeight - i13) - max) - amVar.mo84923b()) - this.f253366c);
            int i14 = measuredWidth + ((this.f253377o + this.f253373k) * i10);
            int c2 = amVar.mo84924c();
            amVar.mo84923b();
            amVar.mo84927h(i14, max2, c2 + i14);
        }
        this.f253383u = 0;
        if (this.f253370g) {
            this.f253370g = false;
            mo84843e(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i6 = -1;
        int i7 = this.f253373k * (this.f253372j - 1);
        int i8 = 0;
        if (mode == Integer.MIN_VALUE) {
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            int min = Math.min(this.f253371i, ((size - paddingLeft) - i7) / this.f253372j);
            int i9 = min;
            size = paddingLeft + (this.f253372j * min) + i7;
            i3 = i9;
        } else if (mode == 0) {
            throw new IllegalArgumentException("Cannot measure SuggestionGridLayout with mode UNSPECIFIED");
        } else if (mode != 1073741824) {
            i3 = 0;
            size = 0;
        } else {
            i3 = Math.min(this.f253371i, (((size - getPaddingLeft()) - getPaddingRight()) - i7) / this.f253372j);
        }
        this.f253376n = (this.f253372j * i3) + i7;
        this.f253377o = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f253376n, 1073741824);
        Arrays.fill(this.f253367d, getPaddingTop());
        int size3 = this.f253381s.size();
        int paddingTop = getPaddingTop();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size3) {
            C90637am amVar = (C90637am) this.f253381s.get(i10);
            if (!amVar.mo84926g()) {
                C90638an a = m147911a(amVar);
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i8, i8);
                int i12 = a.f253472a;
                if (i12 != i6) {
                    i8 = i12;
                }
                int i13 = i12 == i6 ? makeMeasureSpec2 : makeMeasureSpec;
                if (i8 == -2) {
                    if (C91115n.m148876h(this)) {
                        i8 = 0;
                    } else {
                        i8 = this.f253372j - 1;
                    }
                }
                if (!a.f253483l) {
                    int[] iArr = this.f253367d;
                    i5 = makeMeasureSpec;
                    if (iArr[i8] < paddingTop) {
                        iArr[i8] = paddingTop;
                    }
                } else {
                    i5 = makeMeasureSpec;
                }
                int i14 = this.f253375m;
                amVar.f253468e.setEmpty();
                Drawable background = amVar.f253464a.getBackground();
                i4 = size2;
                if (background != null) {
                    background.getPadding(amVar.f253468e);
                }
                amVar.f253464a.measure(C90637am.m147968d(i13, amVar.mo84922a()), C90637am.m147968d(makeMeasureSpec3, amVar.f253468e.top + amVar.f253468e.bottom));
                View view = amVar.f253464a;
                C90638an anVar = (C90638an) view.getLayoutParams();
                boolean z = true;
                if (view.getMeasuredHeight() <= i14 && view.getMeasuredWidth() <= i14) {
                    z = false;
                }
                anVar.f253482k = z;
                if (z) {
                    view.setLayerType(0, (Paint) null);
                }
                int[] iArr2 = this.f253367d;
                iArr2[i8] = iArr2[i8] + a.topMargin + amVar.mo84923b() + this.f253364a + a.bottomMargin;
                if (a.f253472a == -1) {
                    int[] iArr3 = this.f253367d;
                    Arrays.fill(iArr3, iArr3[i8]);
                }
                int max = this.f253367d[i8] + Math.max(amVar.f253468e.bottom, getPaddingBottom());
                if (max >= i11) {
                    i11 = max;
                }
            } else {
                i5 = makeMeasureSpec;
                i4 = size2;
            }
            i10++;
            makeMeasureSpec = i5;
            size2 = i4;
            i6 = -1;
            i8 = 0;
        }
        setMeasuredDimension(size, mode2 != 1073741824 ? Math.max(0, (i11 + this.f253366c) - this.f253364a) : size2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f253379q.mo84942b(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void removeAllViews() {
        int size = this.f253381s.size();
        while (true) {
            size--;
            if (size >= 0) {
                C90637am amVar = (C90637am) this.f253381s.get(size);
                if (C90687h.m148061b(m147911a(amVar).f253490s) && amVar.f253464a.getVisibility() == 0) {
                    mo84840c(amVar);
                }
            } else {
                this.f253369f.clear();
                this.f253381s.clear();
                this.f253382t.clear();
                super.removeAllViews();
                return;
            }
        }
    }

    public final void removeView(View view) {
        mo84839b(view);
    }

    public SuggestionGridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C90638an(layoutParams);
    }

    public SuggestionGridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f253365b = new Rect();
        this.f253368e = false;
        this.f253369f = new ArrayList();
        this.f253381s = new ArrayList();
        new ArrayList();
        this.f253382t = new HashSet();
        this.f253383u = 0;
        this.f253384v = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C90629ae.f253429g, i, 0);
        this.f253371i = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE);
        int integer = obtainStyledAttributes.getInteger(0, 1);
        this.f253372j = integer;
        this.f253367d = new int[integer];
        this.f253364a = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f253373k = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        LayoutTransition layoutTransition = getLayoutTransition();
        this.f253378p = layoutTransition;
        if (layoutTransition != null) {
            layoutTransition.enableTransitionType(4);
            layoutTransition.setDuration(100);
            layoutTransition.enableTransitionType(2);
            layoutTransition.enableTransitionType(3);
            int i2 = getContext().getResources().getDisplayMetrics().heightPixels;
            layoutTransition.setAnimator(2, new C90687h(true, i2));
            layoutTransition.setInterpolator(2, new DecelerateInterpolator(2.5f));
            layoutTransition.setAnimator(3, new C90687h(false, i2));
            layoutTransition.setInterpolator(3, new DecelerateInterpolator(1.5f));
            layoutTransition.setAnimateParentHierarchy(false);
        }
        setClipToPadding(false);
        setClipChildren(false);
        setChildrenDrawingOrderEnabled(true);
        this.f253379q = new C90649ay(new C90640ap(this), context.getResources().getDisplayMetrics().density, (float) ViewConfiguration.get(context).getScaledPagingTouchSlop());
        Resources resources = context.getResources();
        this.f253380r = resources;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.f253375m = C60757n.m92746g(2048, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final void addView(View view, int i) {
        if (this.f253374l) {
            super.addView(view, i);
        } else {
            mo84844f(view, i, -3);
        }
    }
}
