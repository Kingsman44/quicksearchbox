package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class CloudMessagingMessengerCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C143674a();

    /* renamed from: a */
    Messenger f389523a;

    public CloudMessagingMessengerCompat(IBinder iBinder) {
        this.f389523a = new Messenger(iBinder);
    }

    /* renamed from: a */
    public final IBinder mo119030a() {
        Messenger messenger = this.f389523a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo119030a().equals(((CloudMessagingMessengerCompat) obj).mo119030a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return mo119030a().hashCode();
    }

    /* renamed from: b */
    public final void mo119031b(Message message) {
        Messenger messenger = this.f389523a;
        messenger.getClass();
        messenger.send(message);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f389523a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
