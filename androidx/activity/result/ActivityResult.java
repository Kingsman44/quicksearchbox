package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0807a();

    /* renamed from: a */
    public final int f2755a;

    /* renamed from: b */
    public final Intent f2756b;

    public ActivityResult(int i, Intent intent) {
        this.f2755a = i;
        this.f2756b = intent;
    }

    public ActivityResult(Parcel parcel) {
        this.f2755a = parcel.readInt();
        this.f2756b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f2755a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2756b);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2755a);
        parcel.writeInt(this.f2756b == null ? 0 : 1);
        Intent intent = this.f2756b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
