package android.support.p033v7.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.bt */
/* compiled from: PG */
final class C0550bt {

    /* renamed from: a */
    final C0549bs f2141a = new C0549bs();

    /* renamed from: b */
    final List f2142b = new ArrayList();

    /* renamed from: c */
    final C0637ez f2143c;

    public C0550bt(C0637ez ezVar) {
        this.f2143c = ezVar;
    }

    /* renamed from: m */
    private final int m2032m(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f2143c.f2402a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int a = i - (i2 - this.f2141a.mo2593a(i2));
            if (a == 0) {
                while (this.f2141a.mo2598f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += a;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo2601a() {
        return this.f2143c.f2402a.getChildCount() - this.f2142b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo2602b() {
        return this.f2143c.f2402a.getChildCount();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo2603c(View view) {
        int indexOfChild = this.f2143c.f2402a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f2141a.mo2598f(indexOfChild)) {
            return indexOfChild - this.f2141a.mo2593a(indexOfChild);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final View mo2604d(int i) {
        return this.f2143c.f2402a.getChildAt(m2032m(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final View mo2605e(int i) {
        return this.f2143c.f2402a.getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo2606f(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f2143c.f2402a.getChildCount();
        } else {
            i2 = m2032m(i);
        }
        this.f2141a.mo2595c(i2, z);
        if (z) {
            mo2609i(view);
        }
        C0637ez ezVar = this.f2143c;
        ezVar.f2402a.addView(view, i2);
        RecyclerView recyclerView = ezVar.f2402a;
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        C0640fb fbVar = recyclerView.mAdapter;
        if (!(fbVar == null || childViewHolderInt == null)) {
            fbVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List list = recyclerView.mOnChildAttachStateListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C0655fq) recyclerView.mOnChildAttachStateListeners.get(size)).mo2457a(view);
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo2607g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f2143c.f2402a.getChildCount();
        } else {
            i2 = m2032m(i);
        }
        this.f2141a.mo2595c(i2, z);
        if (z) {
            mo2609i(view);
        }
        C0637ez ezVar = this.f2143c;
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + ezVar.f2402a.exceptionLabel());
            }
        }
        ezVar.f2402a.attachViewToParent(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo2608h(int i) {
        C0673gh childViewHolderInt;
        int m = m2032m(i);
        this.f2141a.mo2599g(m);
        C0637ez ezVar = this.f2143c;
        View childAt = ezVar.f2402a.getChildAt(m);
        if (!(childAt == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) == null)) {
            if (!childViewHolderInt.isTmpDetached() || childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.mFlags |= 256;
            } else {
                throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + ezVar.f2402a.exceptionLabel());
            }
        }
        ezVar.f2402a.detachViewFromParent(m);
    }

    /* renamed from: i */
    public final void mo2609i(View view) {
        this.f2142b.add(view);
        C0637ez ezVar = this.f2143c;
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            RecyclerView recyclerView = ezVar.f2402a;
            int i = childViewHolderInt.mPendingAccessibilityState;
            if (i != -1) {
                childViewHolderInt.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                childViewHolderInt.mWasImportantForAccessibilityBeforeHidden = C2043bi.m5575d(childViewHolderInt.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal$ar$ds(childViewHolderInt, 4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo2610j(int i) {
        int m = m2032m(i);
        View childAt = this.f2143c.f2402a.getChildAt(m);
        if (childAt != null) {
            if (this.f2141a.mo2599g(m)) {
                mo2612l(childAt);
            }
            this.f2143c.mo2863b(m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo2611k(View view) {
        return this.f2142b.contains(view);
    }

    /* renamed from: l */
    public final void mo2612l(View view) {
        if (this.f2142b.remove(view)) {
            this.f2143c.mo2862a(view);
        }
    }

    public final String toString() {
        return this.f2141a.toString() + ", hidden list:" + this.f2142b.size();
    }
}
