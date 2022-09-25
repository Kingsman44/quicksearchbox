package android.support.p031v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.session.b */
/* compiled from: PG */
public abstract class C0300b extends Binder implements C0302d {
    public C0300b() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    mo906b(parcel.readString(), (Bundle) C0301c.m771a(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    mo913i();
                    break;
                case 3:
                    mo909e((PlaybackStateCompat) C0301c.m771a(parcel, PlaybackStateCompat.CREATOR));
                    break;
                case 4:
                    mo908d((MediaMetadataCompat) C0301c.m771a(parcel, MediaMetadataCompat.CREATOR));
                    break;
                case 5:
                    mo910f(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    break;
                case 6:
                    mo911g((CharSequence) C0301c.m771a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                    break;
                case 7:
                    mo907c((Bundle) C0301c.m771a(parcel, Bundle.CREATOR));
                    break;
                case 8:
                    mo916l((ParcelableVolumeInfo) C0301c.m771a(parcel, ParcelableVolumeInfo.CREATOR));
                    break;
                case 9:
                    mo912h(parcel.readInt());
                    break;
                case 10:
                    parcel.readInt();
                    break;
                case 11:
                    mo904a(parcel.readInt() != 0);
                    break;
                case 12:
                    mo915k(parcel.readInt());
                    break;
                case 13:
                    mo914j();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
        parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
    }
}
