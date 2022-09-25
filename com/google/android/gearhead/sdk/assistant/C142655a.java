package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.reflect.Array;

/* renamed from: com.google.android.gearhead.sdk.assistant.a */
/* compiled from: PG */
public final class C142655a implements Parcelable.Creator {

    /* renamed from: a */
    private final Class f387145a;

    public C142655a(Class cls) {
        this.f387145a = cls;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AbstractBundleable abstractBundleable;
        try {
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            if (readBundle.containsKey("BUNDLEABLE_CLASS_NAME")) {
                abstractBundleable = (AbstractBundleable) Class.forName(readBundle.getString("BUNDLEABLE_CLASS_NAME")).getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                abstractBundleable = (AbstractBundleable) this.f387145a.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
            try {
                abstractBundleable.mo117436a(readBundle);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            abstractBundleable = null;
            Log.e("Bundleable", "Failed to instantiate ".concat(String.valueOf(this.f387145a.getSimpleName())), th);
            return abstractBundleable;
        }
        return abstractBundleable;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (AbstractBundleable[]) Array.newInstance(this.f387145a, i);
    }
}
