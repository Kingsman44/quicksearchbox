package com.airbnb.lottie;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView;

/* renamed from: com.airbnb.lottie.i */
/* compiled from: PG */
final class C4962i implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LottieAnimationView.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LottieAnimationView.SavedState[i];
    }
}
