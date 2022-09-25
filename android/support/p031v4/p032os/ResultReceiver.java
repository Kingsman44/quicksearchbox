package android.support.p031v4.p032os;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.ResultReceiver */
/* compiled from: PG */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0335d();

    /* renamed from: a */
    final boolean f1054a = true;

    /* renamed from: b */
    final Handler f1055b;

    /* renamed from: c */
    C0334c f1056c;

    public ResultReceiver(Handler handler) {
        this.f1055b = handler;
    }

    public ResultReceiver(Parcel parcel) {
        C0334c cVar = null;
        this.f1055b = null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            cVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0334c)) ? new C0332a(readStrongBinder) : (C0334c) queryLocalInterface;
        }
        this.f1056c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo806a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo1096b(int i, Bundle bundle) {
        if (this.f1054a) {
            Handler handler = this.f1055b;
            if (handler != null) {
                handler.post(new C0337f(this, i, bundle));
            } else {
                mo806a(i, bundle);
            }
        } else {
            C0334c cVar = this.f1056c;
            if (cVar != null) {
                try {
                    cVar.mo1099a(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f1056c == null) {
                this.f1056c = new C0336e(this);
            }
            parcel.writeStrongBinder(this.f1056c.asBinder());
        }
    }
}
