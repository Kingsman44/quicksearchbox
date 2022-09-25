package com.google.android.gms.contextmanager.fence.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.contextmanager.fence.internal.r */
/* compiled from: PG */
public final class C144050r implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        ContextFenceRegistrationStub contextFenceRegistrationStub = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        String str = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 3:
                    contextFenceRegistrationStub = (ContextFenceRegistrationStub) C143946b.m234063l(parcel2, readInt, ContextFenceRegistrationStub.CREATOR);
                    break;
                case 4:
                    iBinder = C143946b.m234062k(parcel2, readInt);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) C143946b.m234063l(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 6:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 7:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 8:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new UpdateFenceOperation(i, contextFenceRegistrationStub, iBinder, pendingIntent, str, j, j2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateFenceOperation[i];
    }
}
