package android.support.p033v7.widget;

import android.view.ViewGroup;
import androidx.core.p094f.C1901n;

/* renamed from: android.support.v7.widget.fb */
/* compiled from: PG */
public abstract class C0640fb {
    public boolean mHasStableIds = false;
    public final C0641fc mObservable = new C0641fc();
    public int mStateRestorationPolicy$ar$edu = 1;

    public final void bindViewHolder(C0673gh ghVar, int i) {
        boolean z = ghVar.mBindingAdapter == null;
        if (z) {
            ghVar.mPosition = i;
            if (this.mHasStableIds) {
                ghVar.mItemId = getItemId(i);
            }
            ghVar.setFlags(1, 519);
            C1901n.m5168a("RV OnBindView");
        }
        ghVar.mBindingAdapter = this;
        ghVar.getUnmodifiedPayloads();
        onBindViewHolder$ar$ds(ghVar, i);
        if (z) {
            ghVar.clearPayload();
            ViewGroup.LayoutParams layoutParams = ghVar.itemView.getLayoutParams();
            if (layoutParams instanceof C0654fp) {
                ((C0654fp) layoutParams).f2422e = true;
            }
            C1901n.m5169b();
        }
    }

    public int findRelativeAdapterPositionIn(C0640fb fbVar, C0673gh ghVar, int i) {
        if (fbVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.mo2881c(i, 1, (Object) null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.mo2882d(i, 1);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.mo2883e(i, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(C0673gh ghVar, int i);

    public void onBindViewHolder$ar$ds(C0673gh ghVar, int i) {
        onBindViewHolder(ghVar, i);
    }

    public abstract C0673gh onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(C0673gh ghVar) {
        return false;
    }

    public void onViewAttachedToWindow(C0673gh ghVar) {
    }

    public void onViewDetachedFromWindow(C0673gh ghVar) {
    }

    public void onViewRecycled(C0673gh ghVar) {
    }

    public final void setHasStableIds(boolean z) {
        if (!this.mObservable.mo2885g()) {
            this.mHasStableIds = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    /* access modifiers changed from: package-private */
    public final boolean canRestoreState() {
        int i = this.mStateRestorationPolicy$ar$edu;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 1 ? i2 != 2 : getItemCount() > 0;
        }
        throw null;
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.mo2881c(i, 1, obj);
    }
}
