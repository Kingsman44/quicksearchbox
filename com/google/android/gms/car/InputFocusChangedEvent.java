package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class InputFocusChangedEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143156cl();

    /* renamed from: a */
    public final boolean f387993a;

    /* renamed from: b */
    public final boolean f387994b;

    /* renamed from: c */
    public final int f387995c;

    /* renamed from: d */
    public final Rect f387996d;

    public InputFocusChangedEvent(boolean z, boolean z2, int i, Rect rect) {
        this.f387993a = z;
        this.f387994b = z2;
        this.f387995c = i;
        this.f387996d = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputFocusChangedEvent inputFocusChangedEvent = (InputFocusChangedEvent) obj;
        if (this.f387993a == inputFocusChangedEvent.f387993a && this.f387994b == inputFocusChangedEvent.f387994b && this.f387995c == inputFocusChangedEvent.f387995c) {
            return Objects.equals(this.f387996d, inputFocusChangedEvent.f387996d);
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((this.f387993a ? 1 : 0) * true) + (this.f387994b ? 1 : 0)) * 31) + this.f387995c) * 31;
        Rect rect = this.f387996d;
        return i + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.f387993a;
        boolean z2 = this.f387994b;
        int i = this.f387995c;
        String valueOf = String.valueOf(this.f387996d);
        return "InputFocusChangedEvent{focused=" + z + ", inTouchMode=" + z2 + ", direction=" + i + ", focusedRect=" + valueOf + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f387993a);
        C143947c.m234084c(parcel, 2, this.f387994b);
        C143947c.m234089h(parcel, 3, this.f387995c);
        C143947c.m234105x(parcel, 4, this.f387996d, i);
        C143947c.m234083b(parcel, a);
    }
}
