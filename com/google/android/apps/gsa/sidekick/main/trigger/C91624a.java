package com.google.android.apps.gsa.sidekick.main.trigger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.a */
/* compiled from: PG */
final class C91624a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TriggerConditionEvaluator.APriori(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TriggerConditionEvaluator.APriori[i];
    }
}
