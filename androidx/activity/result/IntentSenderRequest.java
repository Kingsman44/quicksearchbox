package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0822i();

    /* renamed from: a */
    public final IntentSender f2769a;

    /* renamed from: b */
    public final Intent f2770b;

    /* renamed from: c */
    public final int f2771c;

    /* renamed from: d */
    public final int f2772d;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f2769a = intentSender;
        this.f2770b = intent;
        this.f2771c = i;
        this.f2772d = i2;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f2769a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f2770b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f2771c = parcel.readInt();
        this.f2772d = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2769a, i);
        parcel.writeParcelable(this.f2770b, i);
        parcel.writeInt(this.f2771c);
        parcel.writeInt(this.f2772d);
    }
}
