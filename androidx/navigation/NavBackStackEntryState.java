package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C2383n;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3893n();

    /* renamed from: a */
    public final String f12263a;

    /* renamed from: b */
    public final int f12264b;

    /* renamed from: c */
    private final Bundle f12265c;

    /* renamed from: d */
    private final Bundle f12266d;

    public NavBackStackEntryState(Parcel parcel) {
        C69664n.m101061g(parcel, "inParcel");
        String readString = parcel.readString();
        C69664n.m101058d(readString);
        C69664n.m101060f(readString, "inParcel.readString()!!");
        this.f12263a = readString;
        this.f12264b = parcel.readInt();
        this.f12265c = parcel.readBundle(getClass().getClassLoader());
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        C69664n.m101058d(readBundle);
        C69664n.m101060f(readBundle, "inParcel.readBundle(javaClass.classLoader)!!");
        this.f12266d = readBundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "parcel");
        parcel.writeString(this.f12263a);
        parcel.writeInt(this.f12264b);
        parcel.writeBundle(this.f12265c);
        parcel.writeBundle(this.f12266d);
    }

    /* renamed from: a */
    public final C3892m mo8032a(Context context, C3825ax axVar, C2383n nVar, C3810ai aiVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(nVar, "hostLifecycleState");
        Bundle bundle = this.f12265c;
        if (bundle == null) {
            bundle = null;
        } else {
            bundle.setClassLoader(context.getClassLoader());
        }
        return C3887h.m11189a(context, axVar, bundle, nVar, aiVar, this.f12263a, this.f12266d);
    }

    public NavBackStackEntryState(C3892m mVar) {
        C69664n.m101061g(mVar, "entry");
        this.f12263a = mVar.f12480e;
        this.f12264b = mVar.f12477b.f12360i;
        this.f12265c = mVar.f12478c;
        Bundle bundle = new Bundle();
        this.f12266d = bundle;
        C69664n.m101061g(bundle, "outBundle");
        mVar.f12482g.mo8590c(bundle);
    }
}
