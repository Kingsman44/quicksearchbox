package com.google.android.libraries.onegoogle.popovercontainer;

import android.os.Parcelable;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.$AutoValue_ExpandableDialogView_State  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_ExpandableDialogView_State extends ExpandableDialogView.State {

    /* renamed from: a */
    public final boolean f83537a;

    /* renamed from: b */
    public final Parcelable f83538b;

    public C$AutoValue_ExpandableDialogView_State(boolean z, Parcelable parcelable) {
        this.f83537a = z;
        if (parcelable != null) {
            this.f83538b = parcelable;
            return;
        }
        throw new NullPointerException("Null parentState");
    }

    /* renamed from: a */
    public final Parcelable mo36685a() {
        return this.f83538b;
    }

    /* renamed from: b */
    public final boolean mo36686b() {
        return this.f83537a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExpandableDialogView.State) {
            ExpandableDialogView.State state = (ExpandableDialogView.State) obj;
            return this.f83537a == state.mo36686b() && this.f83538b.equals(state.mo36685a());
        }
    }

    public final int hashCode() {
        return (((true != this.f83537a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f83538b.hashCode();
    }

    public final String toString() {
        boolean z = this.f83537a;
        String obj = this.f83538b.toString();
        return "State{isPortraitInFullScreen=" + z + ", parentState=" + obj + "}";
    }
}
