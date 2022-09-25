package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.p450a.p451a.C8882b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public class SupportedVersionInfo extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(SupportedVersionInfo.class);

    /* renamed from: a */
    public int f387127a;

    /* renamed from: b */
    public int f387128b;

    /* renamed from: c */
    public C8882b f387129c = C8882b.f30834g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        this.f387127a = bundle.getInt("MIN_VERSION");
        this.f387128b = bundle.getInt("MAX_VERSION");
        this.f387129c = C8882b.f30834g;
        byte[] byteArray = bundle.getByteArray("FEATURE_FLAGS");
        if (byteArray != null) {
            try {
                this.f387129c = (C8882b) C62942bv.parseFrom((C62942bv) C8882b.f30834g, byteArray, C62921ba.m95368a());
            } catch (C62974ct e) {
                throw new IllegalArgumentException("Error parsing AssistantFeatureFlags", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putInt("MIN_VERSION", this.f387127a);
        bundle.putInt("MAX_VERSION", this.f387128b);
        bundle.putByteArray("FEATURE_FLAGS", this.f387129c.toByteArray());
    }
}
