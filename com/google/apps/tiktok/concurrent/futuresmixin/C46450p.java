package com.google.apps.tiktok.concurrent.futuresmixin;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.C4087c;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.concurrent.futuresmixin.p */
/* compiled from: PG */
public final /* synthetic */ class C46450p implements C4087c {

    /* renamed from: a */
    public final /* synthetic */ FuturesMixinViewModel f121552a;

    public /* synthetic */ C46450p(FuturesMixinViewModel futuresMixinViewModel) {
        this.f121552a = futuresMixinViewModel;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        FuturesMixinViewModel futuresMixinViewModel = this.f121552a;
        Bundle bundle = new Bundle();
        Set set = futuresMixinViewModel.f121523c;
        bundle.putParcelableArray("future_wrappers", (Parcelable[]) set.toArray(new ParcelableFuture[set.size()]));
        bundle.putInt("last_process_id", futuresMixinViewModel.f121524d);
        futuresMixinViewModel.f121522b.mo50443f(bundle);
        return bundle;
    }
}
