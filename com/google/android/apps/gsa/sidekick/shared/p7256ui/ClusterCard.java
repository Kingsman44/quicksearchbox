package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.apps.gsa.shared.p7148ui.C90648ax;
import com.google.android.apps.gsa.shared.p7148ui.C90649ay;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.apps.gsa.sidekick.shared.p7239h.C91738a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard */
/* compiled from: PG */
public class ClusterCard extends LinearLayout implements C90648ax {

    /* renamed from: a */
    public static final C59071e f256348a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.ui.ClusterCard");

    /* renamed from: b */
    public long f256349b;

    /* renamed from: c */
    public final C90649ay f256350c;

    /* renamed from: d */
    boolean f256351d;

    /* renamed from: e */
    View f256352e;

    /* renamed from: f */
    View f256353f;

    /* renamed from: g */
    public int f256354g;

    /* renamed from: h */
    public Drawable f256355h;

    /* renamed from: i */
    LayoutTransition f256356i;

    /* renamed from: j */
    public C91738a f256357j;

    /* renamed from: k */
    private final Rect f256358k;

    /* renamed from: l */
    private Paint f256359l;

    /* renamed from: m */
    private final Set f256360m;

    public ClusterCard(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: i */
    private final View m150803i(ViewGroup viewGroup, int i, int i2) {
        View view;
        Rect rect = new Rect(i, i2, i, i2);
        offsetRectIntoDescendantCoords(viewGroup, rect);
        int i3 = rect.left;
        int i4 = rect.top;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                view = null;
                break;
            }
            view = viewGroup.getChildAt(childCount);
            if (view.getVisibility() == 0) {
                view.getHitRect(this.f256358k);
                if (this.f256358k.contains(i3, i4)) {
                    break;
                }
            }
        }
        if (viewGroup == this && (view instanceof ViewGroup)) {
            View i5 = m150803i((ViewGroup) view, i3, i4);
            if (!(i5 == null || i5.findViewById(R.id.carousel) == null)) {
                if (Boolean.TRUE.equals(i5.findViewById(R.id.carousel).getTag(R.id.is_scrollable))) {
                    return null;
                }
            }
            return (i5 == null || !mo84934g(i5)) ? view : i5;
        }
    }

    /* renamed from: j */
    private final void m150804j(View view) {
        if (this.f256360m.add(view) && this.f256360m.size() == 1) {
            m150805k(true);
        }
    }

    /* renamed from: k */
    private final void m150805k(boolean z) {
        if (getParent() instanceof SuggestionGridLayout) {
            SuggestionGridLayout suggestionGridLayout = (SuggestionGridLayout) getParent();
            if (!z) {
                suggestionGridLayout.f253369f.remove(this);
            } else if (!suggestionGridLayout.f253369f.contains(this)) {
                suggestionGridLayout.f253369f.add(this);
            }
            ((SuggestionGridLayout) getParent()).invalidate();
        }
    }

    /* renamed from: l */
    private final boolean m150806l(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while ((parent instanceof View) && parent != this) {
            parent = ((View) parent).getParent();
        }
        if (parent == this) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final View mo84928a(MotionEvent motionEvent) {
        if (this.f256351d) {
            return null;
        }
        double x = (double) motionEvent.getX();
        Double.isNaN(x);
        double y = (double) motionEvent.getY();
        Double.isNaN(y);
        return m150803i(this, (int) (x + 0.5d), (int) (y + 0.5d));
    }

    /* renamed from: b */
    public final void mo84929b(View view) {
        getParent().requestDisallowInterceptTouchEvent(true);
        m150804j(view);
        this.f256351d = true;
        this.f256352e = view;
        this.f256353f = null;
        Drawable background = view.getBackground();
        this.f256355h = background;
        if (background == null || (background instanceof RippleDrawable)) {
            this.f256352e.setBackgroundColor(getResources().getColor(R.color.card_bg));
        }
        invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.apps.gsa.sidekick.shared.cards.a.e} */
    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84930c(android.view.View r13) {
        /*
            r12 = this;
            com.google.android.apps.gsa.sidekick.shared.ui.c r6 = new com.google.android.apps.gsa.sidekick.shared.ui.c
            r6.<init>(r12)
            r4 = r13
        L_0x0006:
            r0 = 2131432591(0x7f0b148f, float:1.8486944E38)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r4 == r12) goto L_0x007f
            android.view.ViewParent r5 = r4.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L_0x0071
            r7 = 0
            r8 = 0
        L_0x0018:
            int r9 = r5.getChildCount()
            if (r7 >= r9) goto L_0x0049
            android.view.View r9 = r5.getChildAt(r7)
            if (r5 != r12) goto L_0x003b
            r10 = 2131432595(0x7f0b1493, float:1.8486952E38)
            java.lang.Object r10 = r9.getTag(r10)
            if (r10 == 0) goto L_0x003b
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Object r11 = r9.getTag(r0)
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x003b
            r10 = 1
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            boolean r9 = r12.mo84934g(r9)
            if (r9 != 0) goto L_0x0044
            if (r10 == 0) goto L_0x0046
        L_0x0044:
            int r8 = r8 + 1
        L_0x0046:
            int r7 = r7 + 1
            goto L_0x0018
        L_0x0049:
            if (r8 != r2) goto L_0x0053
            android.view.ViewParent r0 = r4.getParent()
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            goto L_0x0006
        L_0x0053:
            r7 = 2131430459(0x7f0b0c3b, float:1.848262E38)
            java.lang.Object r5 = r5.getTag(r7)
            boolean r7 = r5 instanceof com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91666e
            if (r7 == 0) goto L_0x0061
            r1 = r5
            com.google.android.apps.gsa.sidekick.shared.cards.a.e r1 = (com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91666e) r1
        L_0x0061:
            if (r1 == 0) goto L_0x007f
            boolean r5 = r1.mo86079a()
            if (r5 == 0) goto L_0x006e
            r5 = 2
            if (r8 != r5) goto L_0x006e
            r5 = 1
            goto L_0x006f
        L_0x006e:
            r5 = 0
        L_0x006f:
            r7 = r1
            goto L_0x0081
        L_0x0071:
            com.google.common.f.e r13 = f256348a
            com.google.common.f.x r13 = r13.mo56225c()
            java.lang.String r0 = "Unable to find the ClusterCard from the View."
            r1 = 11934(0x2e9e, float:1.6723E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x007f:
            r7 = r1
            r5 = 0
        L_0x0081:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r4.setTag(r0, r1)
            r12.m150804j(r4)
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            float r0 = (float) r0
            boolean r1 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148876h(r4)
            if (r1 == 0) goto L_0x00a1
            float r0 = -r0
        L_0x00a1:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            float[] r2 = new float[r2]
            r2[r3] = r0
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r4, r1, r2)
            r0 = 250(0xfa, double:1.235E-321)
            r8.setDuration(r0)
            com.google.android.apps.gsa.sidekick.shared.ui.f r9 = new com.google.android.apps.gsa.sidekick.shared.ui.f
            r0 = r9
            r1 = r12
            r2 = r5
            r3 = r7
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.addListener(r9)
            com.google.android.apps.gsa.sidekick.shared.ui.d r13 = new com.google.android.apps.gsa.sidekick.shared.ui.d
            r13.<init>(r12)
            r8.addUpdateListener(r13)
            r8.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.shared.p7256ui.ClusterCard.mo84930c(android.view.View):void");
    }

    /* renamed from: d */
    public final void mo84931d() {
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        View view;
        super.dispatchDraw(canvas);
        View view2 = this.f256352e;
        if (view2 != null && m150806l((ViewGroup) view2.getParent()) && (view2.getParent() instanceof CardView)) {
            float translationX = view2.getTranslationX();
            if (translationX != 0.0f) {
                canvas.save();
                Rect rect = new Rect(0, view2.getTop(), 0, view2.getBottom());
                offsetDescendantRectToMyCoords((ViewGroup) view2.getParent(), rect);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.lotic_card_side_margin);
                Rect rect2 = new Rect();
                if (translationX > 0.0f) {
                    canvas.clipRect((float) (rect2.left + dimensionPixelSize), (float) (rect.top + rect2.top), translationX + ((float) dimensionPixelSize) + ((float) rect2.left), (float) (rect.bottom - rect2.bottom));
                } else {
                    canvas.clipRect(((((float) getWidth()) + translationX) - ((float) dimensionPixelSize)) - ((float) rect2.right), (float) (rect.top + rect2.top), (float) ((getWidth() - dimensionPixelSize) - rect2.right), (float) (rect.bottom - rect2.bottom));
                }
                canvas.drawPaint(this.f256359l);
                canvas.restore();
            }
        }
        if (this.f256356i.isRunning() && (view = this.f256353f) != null && m150806l((ViewGroup) view.getParent()) && view.getParent() != null && (view.getParent() instanceof CardView)) {
            int i = this.f256354g;
            int height = ((View) view.getParent()).getHeight();
            Rect rect3 = new Rect(0, view.getTop(), 0, view.getBottom());
            offsetDescendantRectToMyCoords((ViewGroup) view.getParent(), rect3);
            rect3.bottom = rect3.top + ((rect3.bottom - rect3.top) - (i - height));
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.lotic_card_side_margin);
            canvas.clipRect(dimensionPixelSize2, rect3.top, getWidth() - dimensionPixelSize2, rect3.bottom);
            canvas.drawPaint(this.f256359l);
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Bundle bundle;
        SparseArray sparseParcelableArray;
        super.dispatchRestoreInstanceState(sparseArray);
        long j = this.f256349b;
        if (j != 0 && (bundle = (Bundle) sparseArray.get((int) j)) != null) {
            onRestoreInstanceState(bundle.getParcelable("ClusterState"));
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                Object tag = childAt.getTag(R.id.view_entry_id);
                if (!(tag == null || (sparseParcelableArray = bundle.getSparseParcelableArray(Long.toString(((Long) tag).longValue()))) == null)) {
                    childAt.restoreHierarchyState(sparseParcelableArray);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        super.dispatchSaveInstanceState(sparseArray);
        if (this.f256349b != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("ClusterState", onSaveInstanceState());
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                Object tag = childAt.getTag(R.id.view_entry_id);
                if (tag != null) {
                    SparseArray sparseArray2 = new SparseArray();
                    childAt.saveHierarchyState(sparseArray2);
                    bundle.putSparseParcelableArray(Long.toString(((Long) tag).longValue()), sparseArray2);
                }
            }
            sparseArray.put((int) this.f256349b, bundle);
        }
    }

    /* renamed from: e */
    public final void mo84932e() {
        if (this.f256359l == null) {
            Paint paint = new Paint();
            this.f256359l = paint;
            paint.setColor(getResources().getColor(R.color.lotic_swipe_background));
        }
        invalidate();
    }

    /* renamed from: f */
    public final void mo84933f(View view) {
        Drawable drawable;
        mo86597h(view);
        this.f256351d = false;
        View view2 = this.f256352e;
        if (!(view2 == null || (drawable = this.f256355h) == null)) {
            view2.setBackground(drawable);
            this.f256355h = null;
        }
        this.f256352e = null;
        invalidate();
    }

    /* renamed from: g */
    public final boolean mo84934g(View view) {
        return Boolean.TRUE.equals(view.getTag(R.id.is_swipeable)) && !Boolean.TRUE.equals(view.getTag(R.id.is_being_removed));
    }

    /* renamed from: h */
    public final void mo86597h(View view) {
        if (this.f256360m.remove(view) && this.f256360m.isEmpty()) {
            m150805k(false);
        }
    }

    public final int indexOfChild(View view) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m150805k(false);
        this.f256352e = null;
        this.f256353f = null;
        this.f256351d = false;
        this.f256357j = null;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f256350c.mo84941a(motionEvent)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f256350c.mo84942b(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public ClusterCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClusterCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f256358k = new Rect();
        this.f256351d = false;
        this.f256360m = new HashSet();
        LayoutTransition layoutTransition = new LayoutTransition();
        this.f256356i = layoutTransition;
        layoutTransition.enableTransitionType(4);
        this.f256356i.setStartDelay(1, 0);
        this.f256356i.setAnimateParentHierarchy(false);
        setLayoutTransition(this.f256356i);
        C90649ay ayVar = new C90649ay(this, context.getResources().getDisplayMetrics().density, (float) ViewConfiguration.get(context).getScaledTouchSlop());
        this.f256350c = ayVar;
        ayVar.f253514f = true;
        ayVar.f253513e = false;
        setWillNotDraw(false);
    }
}
