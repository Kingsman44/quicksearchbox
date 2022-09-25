package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: PG */
public class CarAssistantEvent extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(CarAssistantEvent.class);

    /* renamed from: a */
    public int f387090a;

    /* renamed from: b */
    public long f387091b;

    /* renamed from: c */
    public int f387092c;

    /* renamed from: d */
    public Bundle f387093d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        this.f387090a = bundle.getInt("EVENT_TYPE");
        this.f387091b = bundle.getLong("GENERATED_MILLIS");
        this.f387092c = bundle.getInt("VOICE_PLATE_INFO");
        this.f387093d = bundle.getBundle("CUSTOM_PAYLOAD");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putInt("EVENT_TYPE", this.f387090a);
        bundle.putLong("GENERATED_MILLIS", this.f387091b);
        bundle.putInt("VOICE_PLATE_INFO", this.f387092c);
        bundle.putBundle("CUSTOM_PAYLOAD", this.f387093d);
    }
}
