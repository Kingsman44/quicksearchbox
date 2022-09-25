package com.google.apps.tiktok.cache;

import android.os.Bundle;
import androidx.savedstate.C4087c;

/* renamed from: com.google.apps.tiktok.cache.q */
/* compiled from: PG */
public final /* synthetic */ class C46402q implements C4087c {

    /* renamed from: a */
    public final /* synthetic */ ParcelableKeyValueStore f121459a;

    public /* synthetic */ C46402q(ParcelableKeyValueStore parcelableKeyValueStore) {
        this.f121459a = parcelableKeyValueStore;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        ParcelableKeyValueStore parcelableKeyValueStore = this.f121459a;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.apps.tiktok.cache.InstanceStateStore", parcelableKeyValueStore);
        return bundle;
    }
}
