package com.google.ads.interactivemedia.p367v3.impl.data;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstructionPurpose;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.bk */
/* compiled from: PG */
public abstract class C6745bk {
    public abstract C6745bk attached(boolean z);

    public abstract C6745bk bounds(C6726as asVar);

    public abstract C6746bl build();

    public abstract C6745bk detailedReason(String str);

    public abstract C6745bk hidden(boolean z);

    public abstract C6745bk purpose(FriendlyObstructionPurpose friendlyObstructionPurpose);

    public abstract C6745bk type(String str);

    public C6745bk view(View view) {
        return attached(C2043bi.m5569aw(view)).bounds(C6726as.builder().locationOnScreenOfView(view).build()).hidden(!view.isShown()).type(view.getClass().getCanonicalName());
    }
}
