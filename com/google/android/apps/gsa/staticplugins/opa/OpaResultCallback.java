package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;

/* compiled from: PG */
public class OpaResultCallback implements Parcelable, C91096f {
    public static final Parcelable.Creator CREATOR = new C109715mt();

    /* renamed from: a */
    final int f295673a;

    /* renamed from: b */
    final Bundle f295674b;

    public OpaResultCallback(int i, Bundle bundle) {
        this.f295673a = i;
        this.f295674b = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (!(context instanceof C109716mu)) {
            return false;
        }
        ((C109716mu) context).mo95148A(this.f295673a, i, intent, this.f295674b);
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f295673a);
        parcel.writeBundle(this.f295674b);
    }
}
