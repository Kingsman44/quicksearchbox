package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: PG */
public class VoiceSessionResult extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(VoiceSessionResult.class);

    /* renamed from: a */
    public int f387143a;

    /* renamed from: b */
    public IntentResult f387144b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        this.f387143a = bundle.getInt("RESULT_TYPE");
        Bundle bundle2 = bundle.getBundle("INTENT_RESULT");
        if (bundle2 != null) {
            IntentResult intentResult = new IntentResult();
            this.f387144b = intentResult;
            intentResult.mo117436a(bundle2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putInt("RESULT_TYPE", this.f387143a);
        if (this.f387144b != null) {
            Bundle bundle2 = new Bundle();
            this.f387144b.mo117437b(bundle2);
            bundle.putBundle("INTENT_RESULT", bundle2);
        }
    }
}
