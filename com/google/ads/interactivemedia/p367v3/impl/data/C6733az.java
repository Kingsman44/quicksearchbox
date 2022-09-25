package com.google.ads.interactivemedia.p367v3.impl.data;

import android.view.View;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstructionPurpose;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.az */
/* compiled from: PG */
public abstract class C6733az implements FriendlyObstruction {
    public static C6732ay builder() {
        return new C6774v();
    }

    public abstract String detailedReason();

    public String getDetailedReason() {
        return detailedReason();
    }

    public FriendlyObstructionPurpose getPurpose() {
        return purpose();
    }

    public View getView() {
        return view();
    }

    public abstract FriendlyObstructionPurpose purpose();

    public abstract View view();
}
