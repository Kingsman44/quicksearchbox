package android.support.p031v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.p031v4.media.MediaMetadataCompat;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* compiled from: PG */
final class C0283a implements C0302d {

    /* renamed from: a */
    private final IBinder f1011a;

    public C0283a(IBinder iBinder) {
        this.f1011a = iBinder;
    }

    /* renamed from: a */
    public final void mo904a(boolean z) {
        throw null;
    }

    public final IBinder asBinder() {
        return this.f1011a;
    }

    /* renamed from: b */
    public final void mo906b(String str, Bundle bundle) {
        throw null;
    }

    /* renamed from: c */
    public final void mo907c(Bundle bundle) {
        throw null;
    }

    /* renamed from: d */
    public final void mo908d(MediaMetadataCompat mediaMetadataCompat) {
        throw null;
    }

    /* renamed from: e */
    public final void mo909e(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                obtain.writeInt(1);
                playbackStateCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1011a.transact(3, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: f */
    public final void mo910f(List list) {
        throw null;
    }

    /* renamed from: g */
    public final void mo911g(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: h */
    public final void mo912h(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            this.f1011a.transact(9, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: i */
    public final void mo913i() {
        throw null;
    }

    /* renamed from: j */
    public final void mo914j() {
        throw null;
    }

    /* renamed from: k */
    public final void mo915k(int i) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(i);
            this.f1011a.transact(12, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: l */
    public final void mo916l(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw null;
    }
}
