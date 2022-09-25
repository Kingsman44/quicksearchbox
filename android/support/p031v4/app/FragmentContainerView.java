package android.support.p031v4.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.p027b.C0124a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5473f.p5475b.C69659i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: android.support.v4.app.FragmentContainerView */
/* compiled from: PG */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    public boolean f619a;

    /* renamed from: b */
    private final List f620b;

    /* renamed from: c */
    private final List f621c;

    /* renamed from: d */
    private View.OnApplyWindowInsetsListener f622d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C69664n.m101061g(context, "context");
        this.f620b = new ArrayList();
        this.f621c = new ArrayList();
        this.f619a = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C69659i) null);
        C69664n.m101061g(context, "context");
    }

    /* renamed from: a */
    private final void m245a(View view) {
        if (this.f621c.contains(view)) {
            this.f620b.add(view);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C69664n.m101061g(view, "child");
        if (FragmentManager.m263g(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C2082cp cpVar;
        int childCount;
        C69664n.m101061g(windowInsets, "insets");
        C2082cp h = C2082cp.m5717h(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f622d;
        if (onApplyWindowInsetsListener != null) {
            C69664n.m101061g(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C69664n.m101060f(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            cpVar = C2082cp.m5717h(onApplyWindowInsets, (View) null);
        } else {
            cpVar = C2043bi.m5507A(this, h);
        }
        if (!cpVar.f5994b.mo5232p() && (childCount = getChildCount()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                C2043bi.m5596y(getChildAt(i), cpVar);
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C69664n.m101061g(canvas, "canvas");
        if (this.f619a) {
            for (View drawChild : this.f620b) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C69664n.m101061g(canvas, "canvas");
        C69664n.m101061g(view, "child");
        if (!this.f619a || this.f620b.isEmpty() || !this.f620b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public final void endViewTransition(View view) {
        C69664n.m101061g(view, "view");
        this.f621c.remove(view);
        if (this.f620b.remove(view)) {
            this.f619a = true;
        }
        super.endViewTransition(view);
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C69664n.m101061g(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i = childCount - 1;
                View childAt = getChildAt(childCount);
                C69664n.m101060f(childAt, "view");
                m245a(childAt);
                if (i < 0) {
                    break;
                }
                childCount = i;
            }
        }
        super.removeAllViewsInLayout();
    }

    public final void removeView(View view) {
        C69664n.m101061g(view, "view");
        m245a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C69664n.m101060f(childAt, "view");
        m245a(childAt);
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        C69664n.m101061g(view, "view");
        m245a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                C69664n.m101060f(childAt, "view");
                m245a(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                C69664n.m101060f(childAt, "view");
                m245a(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C69664n.m101061g(onApplyWindowInsetsListener, "listener");
        this.f622d = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        C69664n.m101061g(view, "view");
        if (view.getParent() == this) {
            this.f621c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C69664n.m101061g(context, "context");
        this.f620b = new ArrayList();
        this.f621c = new ArrayList();
        this.f619a = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0124a.f323b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, C69659i iVar) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(attributeSet, "attrs");
        C69664n.m101061g(fragmentManager, "fm");
        this.f620b = new ArrayList();
        this.f621c = new ArrayList();
        this.f619a = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0124a.f323b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment b = fragmentManager.f634a.mo670b(id);
        if (classAttribute != null && b == null) {
            if (id <= 0) {
                String concat = string != null ? " with tag ".concat(string) : BuildConfig.FLAVOR;
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + concat);
            }
            Fragment a = fragmentManager.mo475h().mo586a(context.getClassLoader(), classAttribute);
            C69664n.m101060f(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attributeSet, (Bundle) null);
            C0154a aVar = new C0154a(fragmentManager);
            aVar.f824t = true;
            a.mContainer = this;
            aVar.mo511h(getId(), a, string, 1);
            aVar.mo510g();
        }
        for (C0209ca caVar : fragmentManager.f634a.mo675g()) {
            Fragment fragment = caVar.f785a;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                caVar.mo661b();
            }
        }
    }
}
