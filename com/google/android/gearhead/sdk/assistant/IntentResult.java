package com.google.android.gearhead.sdk.assistant;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: PG */
public class IntentResult extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(IntentResult.class);

    /* renamed from: a */
    public int f387113a;

    /* renamed from: b */
    public Intent f387114b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        this.f387113a = bundle.getInt("INTENT_TYPE");
        this.f387114b = (Intent) bundle.getParcelable("INTENT");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putInt("INTENT_TYPE", this.f387113a);
        bundle.putParcelable("INTENT", this.f387114b);
    }
}
