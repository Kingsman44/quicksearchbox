package com.google.android.libraries.lens.sdk.avs.data;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.lens.sdk.avs.data.s */
/* compiled from: PG */
public final class C24884s {

    /* renamed from: a */
    public final Bundle f67965a;

    public C24884s() {
        this.f67965a = new Bundle();
    }

    public C24884s(Bundle bundle) {
        this.f67965a = bundle;
    }

    /* renamed from: a */
    public final AppFlowEvent[] mo30113a() {
        Parcelable[] parcelableArray = this.f67965a.getParcelableArray("app_flow_events");
        if (parcelableArray == null) {
            return null;
        }
        AppFlowEvent[] appFlowEventArr = new AppFlowEvent[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            appFlowEventArr[i] = (AppFlowEvent) parcelableArray[i];
        }
        return appFlowEventArr;
    }

    /* renamed from: b */
    public final void mo30114b(String str) {
        this.f67965a.putString("session_id", str);
    }
}
