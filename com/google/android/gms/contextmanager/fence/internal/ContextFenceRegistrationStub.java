package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class ContextFenceRegistrationStub extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144039g();

    /* renamed from: a */
    public final String f390269a;

    /* renamed from: b */
    public ContextFenceStub f390270b;

    /* renamed from: c */
    public final long f390271c;

    public ContextFenceRegistrationStub(String str, ContextFenceStub contextFenceStub, long j) {
        this.f390269a = str;
        this.f390270b = contextFenceStub;
        this.f390271c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextFenceRegistrationStub)) {
            return false;
        }
        ContextFenceRegistrationStub contextFenceRegistrationStub = (ContextFenceRegistrationStub) obj;
        return TextUtils.equals(this.f390269a, contextFenceRegistrationStub.f390269a) && this.f390271c == contextFenceRegistrationStub.f390271c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390269a, Long.valueOf(this.f390271c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f390269a);
        C143947c.m234105x(parcel, 3, this.f390270b, i);
        C143947c.m234090i(parcel, 4, this.f390271c);
        C143947c.m234083b(parcel, a);
    }
}
