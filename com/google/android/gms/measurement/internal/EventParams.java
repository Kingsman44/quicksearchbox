package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Iterator;

/* compiled from: PG */
public class EventParams extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new C145236ap();

    /* renamed from: a */
    public final Bundle f392535a;

    public EventParams(Bundle bundle) {
        this.f392535a = bundle;
    }

    /* renamed from: a */
    public final Bundle mo120754a() {
        return new Bundle(this.f392535a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Long mo120755b() {
        return Long.valueOf(this.f392535a.getLong("value"));
    }

    public final Iterator iterator() {
        return new C145235ao(this);
    }

    public final String toString() {
        return this.f392535a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234093l(parcel, 2, mo120754a());
        C143947c.m234083b(parcel, a);
    }
}
