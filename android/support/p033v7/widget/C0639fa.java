package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.fa */
/* compiled from: PG */
final class C0639fa {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2404a;

    public C0639fa(RecyclerView recyclerView) {
        this.f2404a = recyclerView;
    }

    /* renamed from: a */
    public final C0673gh mo2865a(int i) {
        C0673gh findViewHolderForPosition = this.f2404a.findViewHolderForPosition(i, true);
        if (findViewHolderForPosition != null && !this.f2404a.mChildHelper.mo2611k(findViewHolderForPosition.itemView)) {
            return findViewHolderForPosition;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2866b(C0776v vVar) {
        int i = vVar.f2668a;
        if (i == 1) {
            RecyclerView recyclerView = this.f2404a;
            recyclerView.mLayout.onItemsAdded(recyclerView, vVar.f2669b, vVar.f2671d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f2404a;
            recyclerView2.mLayout.onItemsRemoved(recyclerView2, vVar.f2669b, vVar.f2671d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f2404a;
            recyclerView3.mLayout.onItemsUpdated(recyclerView3, vVar.f2669b, vVar.f2671d, vVar.f2670c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f2404a;
            recyclerView4.mLayout.onItemsMoved(recyclerView4, vVar.f2669b, vVar.f2671d, 1);
        }
    }

    /* renamed from: c */
    public final void mo2867c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2404a;
        int b = recyclerView.mChildHelper.mo2602b();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < b; i6++) {
            View e = recyclerView.mChildHelper.mo2605e(i6);
            C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(e);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.mFlags |= 2;
                childViewHolderInt.addChangePayload(obj);
                ((C0654fp) e.getLayoutParams()).f2422e = true;
            }
        }
        C0661fw fwVar = recyclerView.mRecycler;
        int size = fwVar.f2433c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C0673gh ghVar = (C0673gh) fwVar.f2433c.get(size);
                if (ghVar != null && (i3 = ghVar.mPosition) >= i && i3 < i5) {
                    ghVar.mFlags |= 2;
                    fwVar.mo3032i(size);
                }
            } else {
                this.f2404a.mItemsChanged = true;
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo2868d(int i, int i2) {
        RecyclerView recyclerView = this.f2404a;
        int b = recyclerView.mChildHelper.mo2602b();
        for (int i3 = 0; i3 < b; i3++) {
            C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo2605e(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                recyclerView.mState.f2461f = true;
            }
        }
        C0661fw fwVar = recyclerView.mRecycler;
        int size = fwVar.f2433c.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0673gh ghVar = (C0673gh) fwVar.f2433c.get(i4);
            if (ghVar != null && ghVar.mPosition >= i) {
                ghVar.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.f2404a.mItemsAddedOrRemoved = true;
    }

    /* renamed from: e */
    public final void mo2869e(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f2404a;
        int b = recyclerView.mChildHelper.mo2602b();
        int i5 = -1;
        int i6 = i < i2 ? -1 : 1;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        for (int i9 = 0; i9 < b; i9++) {
            C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo2605e(i9));
            if (childViewHolderInt != null && (i4 = childViewHolderInt.mPosition) >= i8 && i4 <= i7) {
                if (i4 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i6, false);
                }
                recyclerView.mState.f2461f = true;
            }
        }
        C0661fw fwVar = recyclerView.mRecycler;
        if (i >= i2) {
            i5 = 1;
        }
        int size = fwVar.f2433c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0673gh ghVar = (C0673gh) fwVar.f2433c.get(i10);
            if (ghVar != null && (i3 = ghVar.mPosition) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    ghVar.offsetPosition(i2 - i, false);
                } else {
                    ghVar.offsetPosition(i5, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f2404a.mItemsAddedOrRemoved = true;
    }

    /* renamed from: f */
    public final void mo2870f(int i, int i2) {
        this.f2404a.offsetPositionRecordsForRemove(i, i2, true);
        RecyclerView recyclerView = this.f2404a;
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.f2458c += i2;
    }
}
