package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.bh */
/* compiled from: PG */
public abstract class C146450bh extends C8849b implements C146451bi {
    public C146450bh() {
        super("com.google.android.gms.wearable.internal.IWearableListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 13) {
            MessageEventParcelable messageEventParcelable = (MessageEventParcelable) C8850c.m23492a(parcel, MessageEventParcelable.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
                if (queryLocalInterface instanceof C146446bd) {
                    C146446bd bdVar = (C146446bd) queryLocalInterface;
                }
            }
            enforceNoDataAvail(parcel);
            return true;
        } else if (i != 14) {
            switch (i) {
                case 1:
                    enforceNoDataAvail(parcel);
                    mo123250f((DataHolder) C8850c.m23492a(parcel, DataHolder.CREATOR));
                    return true;
                case 2:
                    enforceNoDataAvail(parcel);
                    mo123251g((MessageEventParcelable) C8850c.m23492a(parcel, MessageEventParcelable.CREATOR));
                    return true;
                case 3:
                    NodeParcelable nodeParcelable = (NodeParcelable) C8850c.m23492a(parcel, NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                case 4:
                    NodeParcelable nodeParcelable2 = (NodeParcelable) C8850c.m23492a(parcel, NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                case 5:
                    parcel.createTypedArrayList(NodeParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                case 6:
                    AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) C8850c.m23492a(parcel, AncsNotificationParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                case 7:
                    ChannelEventParcelable channelEventParcelable = (ChannelEventParcelable) C8850c.m23492a(parcel, ChannelEventParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                case 8:
                    enforceNoDataAvail(parcel);
                    mo123249e((CapabilityInfoParcelable) C8850c.m23492a(parcel, CapabilityInfoParcelable.CREATOR));
                    return true;
                case 9:
                    AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) C8850c.m23492a(parcel, AmsEntityUpdateParcelable.CREATOR);
                    enforceNoDataAvail(parcel);
                    return true;
                default:
                    return false;
            }
        } else {
            ConsentResponse consentResponse = (ConsentResponse) C8850c.m23492a(parcel, ConsentResponse.CREATOR);
            enforceNoDataAvail(parcel);
            return true;
        }
    }
}
