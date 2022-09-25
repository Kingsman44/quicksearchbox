package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class RegisterDistributedServiceAvailabilityCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146256bs();

    /* renamed from: a */
    public C146215ae f395037a;

    /* renamed from: b */
    public String f395038b;

    /* renamed from: c */
    public C146286v f395039c;

    public RegisterDistributedServiceAvailabilityCallbackParams() {
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RegisterDistributedServiceAvailabilityCallbackParams(android.os.IBinder r4, java.lang.String r5, android.os.IBinder r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0005
            r1 = r0
            goto L_0x0017
        L_0x0005:
            java.lang.String r1 = "com.google.android.gms.usonia.directory.internal.IUsoniaStatusCallback"
            android.os.IInterface r1 = r4.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.usonia.directory.internal.C146215ae
            if (r2 == 0) goto L_0x0012
            com.google.android.gms.usonia.directory.internal.ae r1 = (com.google.android.gms.usonia.directory.internal.C146215ae) r1
            goto L_0x0017
        L_0x0012:
            com.google.android.gms.usonia.directory.internal.ac r1 = new com.google.android.gms.usonia.directory.internal.ac
            r1.<init>(r4)
        L_0x0017:
            if (r6 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.usonia.directory.internal.IDistributedServiceAvailabilityCallback"
            android.os.IInterface r4 = r6.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.usonia.directory.internal.C146286v
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.usonia.directory.internal.v r0 = (com.google.android.gms.usonia.directory.internal.C146286v) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.usonia.directory.internal.t r0 = new com.google.android.gms.usonia.directory.internal.t
            r0.<init>(r6)
        L_0x002d:
            r3.<init>()
            r3.f395037a = r1
            r3.f395038b = r5
            r3.f395039c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.usonia.directory.internal.RegisterDistributedServiceAvailabilityCallbackParams.<init>(android.os.IBinder, java.lang.String, android.os.IBinder):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterDistributedServiceAvailabilityCallbackParams) {
            RegisterDistributedServiceAvailabilityCallbackParams registerDistributedServiceAvailabilityCallbackParams = (RegisterDistributedServiceAvailabilityCallbackParams) obj;
            return C143912ba.m233950b(this.f395037a, registerDistributedServiceAvailabilityCallbackParams.f395037a) && C143912ba.m233950b(this.f395038b, registerDistributedServiceAvailabilityCallbackParams.f395038b) && C143912ba.m233950b(this.f395039c, registerDistributedServiceAvailabilityCallbackParams.f395039c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395037a, this.f395038b, this.f395039c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234098q(parcel, 1, this.f395037a.asBinder());
        C143947c.m234106y(parcel, 2, this.f395038b);
        C143947c.m234098q(parcel, 3, this.f395039c.asBinder());
        C143947c.m234083b(parcel, a);
    }
}
