package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class CredentialManagerInvocationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144097c();

    /* renamed from: a */
    public final CredentialManagerAccount f390373a;

    /* renamed from: b */
    public final CallerInfo f390374b;

    public CredentialManagerInvocationParams(CredentialManagerAccount credentialManagerAccount, CallerInfo callerInfo) {
        C143919bh.m233958a(credentialManagerAccount);
        this.f390373a = credentialManagerAccount;
        this.f390374b = callerInfo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CredentialManagerInvocationParams)) {
            return false;
        }
        CredentialManagerInvocationParams credentialManagerInvocationParams = (CredentialManagerInvocationParams) obj;
        CallerInfo callerInfo = credentialManagerInvocationParams.f390374b;
        if (((callerInfo != null || this.f390374b != null) && (callerInfo == null || !callerInfo.equals(this.f390374b))) || !credentialManagerInvocationParams.f390373a.equals(this.f390373a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390373a, this.f390374b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f390373a, i);
        C143947c.m234105x(parcel, 2, this.f390374b, i);
        C143947c.m234083b(parcel, a);
    }
}
