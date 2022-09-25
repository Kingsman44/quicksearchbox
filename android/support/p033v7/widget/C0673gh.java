package android.support.p033v7.widget;

import android.util.Log;
import android.view.View;
import androidx.core.p098j.C2043bi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.gh */
/* compiled from: PG */
public class C0673gh {
    private static final List FULLUPDATE_PAYLOADS = Collections.emptyList();
    public final View itemView;
    public C0640fb mBindingAdapter;
    int mFlags;
    boolean mInChangeScrap = false;
    private int mIsRecyclableCount = 0;
    public long mItemId = -1;
    public int mItemViewType = -1;
    WeakReference mNestedRecyclerView;
    int mOldPosition = -1;
    RecyclerView mOwnerRecyclerView;
    List mPayloads = null;
    int mPendingAccessibilityState = -1;
    int mPosition = -1;
    int mPreLayoutPosition = -1;
    C0661fw mScrapContainer = null;
    C0673gh mShadowedHolder = null;
    C0673gh mShadowingHolder = null;
    List mUnmodifiedPayloads = null;
    public int mWasImportantForAccessibilityBeforeHidden = 0;

    public C0673gh(View view) {
        if (view != null) {
            this.itemView = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    /* access modifiers changed from: package-private */
    public final void addChangePayload(Object obj) {
        if (obj == null) {
            this.mFlags |= 1024;
        } else if ((this.mFlags & 1024) == 0) {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    /* access modifiers changed from: package-private */
    public final void clearPayload() {
        List list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    /* access modifiers changed from: package-private */
    public final void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    /* access modifiers changed from: package-private */
    public final void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionInRecyclerView(this);
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        C0640fb fbVar;
        int adapterPositionInRecyclerView;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (fbVar = recyclerView.mAdapter) == null || (adapterPositionInRecyclerView = recyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
            return -1;
        }
        return fbVar.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
    }

    public final int getLayoutPosition() {
        int i = this.mPreLayoutPosition;
        return i == -1 ? this.mPosition : i;
    }

    @Deprecated
    public final int getPosition() {
        int i = this.mPreLayoutPosition;
        return i == -1 ? this.mPosition : i;
    }

    /* access modifiers changed from: package-private */
    public final List getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) != 0) {
            return FULLUPDATE_PAYLOADS;
        }
        List list = this.mPayloads;
        return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
    }

    /* access modifiers changed from: package-private */
    public final boolean hasAnyOfTheFlags(int i) {
        return (i & this.mFlags) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean isAttachedToTransitionOverlay() {
        return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        return (this.mFlags & 16) == 0 && !C2043bi.m5568av(this.itemView);
    }

    public final boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean isScrap() {
        return this.mScrapContainer != null;
    }

    /* access modifiers changed from: package-private */
    public final boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public final boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    public final boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    /* access modifiers changed from: package-private */
    public final void offsetPosition(int i, boolean z) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        int i2 = this.mPreLayoutPosition;
        if (i2 == -1) {
            i2 = this.mPosition;
            this.mPreLayoutPosition = i2;
        }
        if (z) {
            this.mPreLayoutPosition = i2 + i;
        }
        this.mPosition += i;
        if (this.itemView.getLayoutParams() != null) {
            ((C0654fp) this.itemView.getLayoutParams()).f2422e = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void resetInternal() {
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    /* access modifiers changed from: package-private */
    public final void setFlags(int i, int i2) {
        this.mFlags = (i & i2) | (this.mFlags & (i2 ^ -1));
    }

    public final void setIsRecyclable(boolean z) {
        int i = this.mIsRecyclableCount;
        int i2 = z ? i - 1 : i + 1;
        this.mIsRecyclableCount = i2;
        if (i2 < 0) {
            this.mIsRecyclableCount = 0;
            new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this);
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(toString()));
        } else if (!z && i2 == 1) {
            this.mFlags |= 16;
        } else if (z && i2 == 0) {
            this.mFlags &= -17;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    public String toString() {
        String str;
        if (getClass().isAnonymousClass()) {
            str = "ViewHolder";
        } else {
            str = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(str + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
        if (isScrap()) {
            sb.append(" scrap ");
            sb.append(true != this.mInChangeScrap ? "[attachedScrap]" : "[changeScrap]");
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if ((this.mFlags & 512) != 0 || isInvalid()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }
}
