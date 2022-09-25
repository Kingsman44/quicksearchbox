package android.support.p031v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p031v4.media.MediaDescriptionCompat;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.RatingCompat;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;

/* renamed from: android.support.v4.media.session.f */
/* compiled from: PG */
public abstract class C0304f extends Binder implements C0306h {
    public C0304f() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i != 1598968902) {
            C0302d dVar = null;
            switch (i) {
                case 1:
                    parcel.readString();
                    Bundle bundle = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = (MediaSessionCompat.ResultReceiverWrapper) C0305g.m834a(parcel, MediaSessionCompat.ResultReceiverWrapper.CREATOR);
                    mo936P();
                    parcel2.writeNoException();
                    break;
                case 2:
                    KeyEvent keyEvent = (KeyEvent) C0305g.m834a(parcel, KeyEvent.CREATOR);
                    boolean R = mo938R();
                    parcel2.writeNoException();
                    parcel2.writeInt(R ? 1 : 0);
                    break;
                case 3:
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0302d)) ? new C0283a(readStrongBinder) : (C0302d) queryLocalInterface;
                    }
                    mo965u(dVar);
                    parcel2.writeNoException();
                    break;
                case 4:
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        dVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof C0302d)) ? new C0283a(readStrongBinder2) : (C0302d) queryLocalInterface2;
                    }
                    mo968x(dVar);
                    parcel2.writeNoException();
                    break;
                case 5:
                    boolean A = mo921A();
                    parcel2.writeNoException();
                    parcel2.writeInt(A ? 1 : 0);
                    break;
                case 6:
                    String l = mo956l();
                    parcel2.writeNoException();
                    parcel2.writeString(l);
                    break;
                case 7:
                    String m = mo957m();
                    parcel2.writeNoException();
                    parcel2.writeString(m);
                    break;
                case 8:
                    PendingIntent e = mo949e();
                    parcel2.writeNoException();
                    C0305g.m835b(parcel2, e);
                    break;
                case 9:
                    long d = mo948d();
                    parcel2.writeNoException();
                    parcel2.writeLong(d);
                    break;
                case 10:
                    ParcelableVolumeInfo i3 = mo953i();
                    parcel2.writeNoException();
                    C0305g.m835b(parcel2, i3);
                    break;
                case 11:
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readString();
                    mo924D();
                    parcel2.writeNoException();
                    break;
                case 12:
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readString();
                    mo943W();
                    parcel2.writeNoException();
                    break;
                case 13:
                    mo962r();
                    parcel2.writeNoException();
                    break;
                case 14:
                    parcel.readString();
                    Bundle bundle2 = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    mo925E();
                    parcel2.writeNoException();
                    break;
                case 15:
                    parcel.readString();
                    Bundle bundle3 = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    mo926F();
                    parcel2.writeNoException();
                    break;
                case 16:
                    Uri uri = (Uri) C0305g.m834a(parcel, Uri.CREATOR);
                    Bundle bundle4 = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    mo927G();
                    parcel2.writeNoException();
                    break;
                case 17:
                    parcel.readLong();
                    mo944X();
                    parcel2.writeNoException();
                    break;
                case 18:
                    mo961q();
                    parcel2.writeNoException();
                    break;
                case 19:
                    mo967w();
                    parcel2.writeNoException();
                    break;
                case 20:
                    mo960p();
                    parcel2.writeNoException();
                    break;
                case 21:
                    mo964t();
                    parcel2.writeNoException();
                    break;
                case 22:
                    mo959o();
                    parcel2.writeNoException();
                    break;
                case 23:
                    mo966v();
                    parcel2.writeNoException();
                    break;
                case 24:
                    parcel.readLong();
                    mo935O();
                    parcel2.writeNoException();
                    break;
                case 25:
                    RatingCompat ratingCompat = (RatingCompat) C0305g.m834a(parcel, RatingCompat.CREATOR);
                    mo931K();
                    parcel2.writeNoException();
                    break;
                case 26:
                    parcel.readString();
                    Bundle bundle5 = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    mo937Q();
                    parcel2.writeNoException();
                    break;
                case 27:
                    MediaMetadataCompat h = mo952h();
                    parcel2.writeNoException();
                    C0305g.m835b(parcel2, h);
                    break;
                case 28:
                    PlaybackStateCompat j = mo954j();
                    parcel2.writeNoException();
                    C0305g.m835b(parcel2, j);
                    break;
                case 29:
                    parcel2.writeNoException();
                    parcel2.writeTypedList(mo958n());
                    break;
                case 30:
                    CharSequence k = mo955k();
                    parcel2.writeNoException();
                    if (k == null) {
                        parcel2.writeInt(0);
                        break;
                    } else {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(k, parcel2, 1);
                        break;
                    }
                case 31:
                    Bundle f = mo950f();
                    parcel2.writeNoException();
                    C0305g.m835b(parcel2, f);
                    break;
                case 32:
                    parcel2.writeNoException();
                    parcel2.writeInt(mo945a());
                    break;
                case 33:
                    mo963s();
                    parcel2.writeNoException();
                    break;
                case 34:
                    parcel.readString();
                    Bundle bundle6 = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    mo928H();
                    parcel2.writeNoException();
                    break;
                case 35:
                    parcel.readString();
                    Bundle bundle7 = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    mo929I();
                    parcel2.writeNoException();
                    break;
                case 36:
                    Uri uri2 = (Uri) C0305g.m834a(parcel, Uri.CREATOR);
                    Bundle bundle8 = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    mo930J();
                    parcel2.writeNoException();
                    break;
                case 37:
                    int b = mo946b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b);
                    break;
                case 38:
                    parcel2.writeNoException();
                    parcel2.writeInt(mo970z() ? 1 : 0);
                    break;
                case 39:
                    parcel.readInt();
                    mo941U();
                    parcel2.writeNoException();
                    break;
                case 40:
                    parcel.readInt();
                    parcel2.writeNoException();
                    break;
                case 41:
                    MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) C0305g.m834a(parcel, MediaDescriptionCompat.CREATOR);
                    mo922B();
                    parcel2.writeNoException();
                    break;
                case 42:
                    MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) C0305g.m834a(parcel, MediaDescriptionCompat.CREATOR);
                    parcel.readInt();
                    mo923C();
                    parcel2.writeNoException();
                    break;
                case 43:
                    MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) C0305g.m834a(parcel, MediaDescriptionCompat.CREATOR);
                    mo933M();
                    parcel2.writeNoException();
                    break;
                case 44:
                    parcel.readInt();
                    mo934N();
                    parcel2.writeNoException();
                    break;
                case 45:
                    parcel2.writeNoException();
                    parcel2.writeInt(mo969y() ? 1 : 0);
                    break;
                case 46:
                    parcel.readInt();
                    mo939S();
                    parcel2.writeNoException();
                    break;
                case 47:
                    int c = mo947c();
                    parcel2.writeNoException();
                    parcel2.writeInt(c);
                    break;
                case 48:
                    parcel.readInt();
                    mo942V();
                    parcel2.writeNoException();
                    break;
                case 49:
                    parcel.readFloat();
                    mo940T();
                    parcel2.writeNoException();
                    break;
                case 50:
                    parcel2.writeNoException();
                    C0305g.m835b(parcel2, mo951g());
                    break;
                case 51:
                    RatingCompat ratingCompat2 = (RatingCompat) C0305g.m834a(parcel, RatingCompat.CREATOR);
                    Bundle bundle9 = (Bundle) C0305g.m834a(parcel, Bundle.CREATOR);
                    mo932L();
                    parcel2.writeNoException();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
        parcel2.writeString("android.support.v4.media.session.IMediaSession");
        return true;
    }
}
