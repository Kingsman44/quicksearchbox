package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class RegisterStateCallbackParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146258bu();

    /* renamed from: a */
    public C146215ae f395044a;

    /* renamed from: b */
    public String f395045b;

    /* renamed from: c */
    public C146283s f395046c;

    public RegisterStateCallbackParams() {
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RegisterStateCallbackParams(android.os.IBinder r4, java.lang.String r5, android.os.IBinder r6) {
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
            java.lang.String r4 = "com.google.android.gms.usonia.directory.internal.IDirectoryStateCallback"
            android.os.IInterface r4 = r6.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.usonia.directory.internal.C146283s
            if (r0 == 0) goto L_0x0028
            r0 = r4
            com.google.android.gms.usonia.directory.internal.s r0 = (com.google.android.gms.usonia.directory.internal.C146283s) r0
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.usonia.directory.internal.q r0 = new com.google.android.gms.usonia.directory.internal.q
            r0.<init>(r6)
        L_0x002d:
            r3.<init>()
            r3.f395044a = r1
            r3.f395045b = r5
            r3.f395046c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.usonia.directory.internal.RegisterStateCallbackParams.<init>(android.os.IBinder, java.lang.String, android.os.IBinder):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterStateCallbackParams) {
            RegisterStateCallbackParams registerStateCallbackParams = (RegisterStateCallbackParams) obj;
            return C143912ba.m233950b(this.f395044a, registerStateCallbackParams.f395044a) && C143912ba.m233950b(this.f395045b, registerStateCallbackParams.f395045b) && C143912ba.m233950b(this.f395046c, registerStateCallbackParams.f395046c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395044a, this.f395045b, this.f395046c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234098q(parcel, 1, this.f395044a.asBinder());
        C143947c.m234106y(parcel, 2, this.f395045b);
        C143947c.m234098q(parcel, 3, this.f395046c.asBinder());
        C143947c.m234083b(parcel, a);
    }
}
