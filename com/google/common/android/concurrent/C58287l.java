package com.google.common.android.concurrent;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.p060c.C0979i;
import androidx.savedstate.C4087c;
import java.util.Set;

/* renamed from: com.google.common.android.concurrent.l */
/* compiled from: PG */
public final /* synthetic */ class C58287l implements C4087c {

    /* renamed from: a */
    public final /* synthetic */ C58295t f155831a;

    public /* synthetic */ C58287l(C58295t tVar) {
        this.f155831a = tVar;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        C58295t tVar = this.f155831a;
        Bundle bundle = new Bundle();
        bundle.putString("appVersion", tVar.f155855i);
        int d = tVar.f155847a.mo3725d();
        int[] iArr = new int[d];
        for (int i = 0; i < d; i++) {
            iArr[i] = tVar.f155847a.mo3723c(i);
        }
        bundle.putIntArray("callback_ids", iArr);
        Set set = tVar.f155848b;
        bundle.putParcelableArray("futures", (Parcelable[]) set.toArray(new ParcelableFuture[((C0979i) set).f3101b]));
        return bundle;
    }
}
