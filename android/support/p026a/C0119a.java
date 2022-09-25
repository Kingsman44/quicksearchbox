package android.support.p026a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: android.support.a.a */
/* compiled from: PG */
public abstract class C0119a extends Binder implements C0121c {
    public C0119a() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        }
        if (i != 1598968902) {
            switch (i) {
                case 2:
                    mo89b(parcel.readInt(), (Bundle) C0120b.m119a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 3:
                    mo88a(parcel.readString(), (Bundle) C0120b.m119a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    Bundle bundle = (Bundle) C0120b.m119a(parcel, Bundle.CREATOR);
                    mo92e();
                    parcel2.writeNoException();
                    break;
                case 5:
                    parcel.readString();
                    Bundle bundle2 = (Bundle) C0120b.m119a(parcel, Bundle.CREATOR);
                    mo93f();
                    parcel2.writeNoException();
                    break;
                case 6:
                    parcel.readInt();
                    Uri uri = (Uri) C0120b.m119a(parcel, Uri.CREATOR);
                    parcel.readInt();
                    Bundle bundle3 = (Bundle) C0120b.m119a(parcel, Bundle.CREATOR);
                    mo91d();
                    parcel2.writeNoException();
                    break;
                case 7:
                    parcel.readString();
                    Bundle bundle4 = (Bundle) C0120b.m119a(parcel, Bundle.CREATOR);
                    Bundle c = mo90c();
                    parcel2.writeNoException();
                    if (c == null) {
                        parcel2.writeInt(0);
                        break;
                    } else {
                        parcel2.writeInt(1);
                        c.writeToParcel(parcel2, 1);
                        break;
                    }
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
        parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
        return true;
    }
}
