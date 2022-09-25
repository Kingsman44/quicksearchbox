package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.p450a.C8934b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;

/* compiled from: PG */
public class ClientRegistrationConfig extends AbstractBundleable {
    public static final Parcelable.Creator CREATOR = new C142655a(ClientRegistrationConfig.class);

    /* renamed from: a */
    public int f387098a;

    /* renamed from: b */
    public int f387099b;

    /* renamed from: c */
    public ArrayList f387100c;

    /* renamed from: d */
    public ArrayList f387101d;

    /* renamed from: e */
    public String f387102e;

    /* renamed from: f */
    public String f387103f;

    /* renamed from: g */
    public C8934b f387104g = C8934b.f30977a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117436a(Bundle bundle) {
        this.f387098a = bundle.getInt("API_VERSION");
        this.f387099b = bundle.getInt("UI_MODE");
        this.f387100c = bundle.getStringArrayList("APP_WHITELIST");
        this.f387101d = bundle.getStringArrayList("PH_TOKEN");
        this.f387102e = bundle.getString("CAR_MANUFACTURER");
        this.f387103f = bundle.getString("CAR_MODEL");
        this.f387104g = C8934b.f30977a;
        byte[] byteArray = bundle.getByteArray("FEATURE_FLAGS");
        if (byteArray != null) {
            try {
                this.f387104g = (C8934b) C62942bv.parseFrom((C62942bv) C8934b.f30977a, byteArray, C62921ba.m95368a());
            } catch (C62974ct e) {
                throw new IllegalArgumentException("Error parsing GearheadFeatureFlags", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo117437b(Bundle bundle) {
        bundle.putInt("API_VERSION", this.f387098a);
        bundle.putInt("UI_MODE", this.f387099b);
        bundle.putStringArrayList("APP_WHITELIST", this.f387100c);
        bundle.putStringArrayList("PH_TOKEN", this.f387101d);
        bundle.putString("CAR_MANUFACTURER", this.f387102e);
        bundle.putString("CAR_MODEL", this.f387103f);
        bundle.putByteArray("FEATURE_FLAGS", this.f387104g.toByteArray());
    }
}
