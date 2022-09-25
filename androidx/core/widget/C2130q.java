package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;

/* renamed from: androidx.core.widget.q */
/* compiled from: PG */
final class C2130q implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new NestedScrollView.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new NestedScrollView.SavedState[i];
    }
}
