package android.support.p031v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C2383n;

/* renamed from: android.support.v4.app.FragmentState */
/* compiled from: PG */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0206by();

    /* renamed from: a */
    final String f677a;

    /* renamed from: b */
    final String f678b;

    /* renamed from: c */
    final boolean f679c;

    /* renamed from: d */
    final int f680d;

    /* renamed from: e */
    final int f681e;

    /* renamed from: f */
    final String f682f;

    /* renamed from: g */
    final boolean f683g;

    /* renamed from: h */
    final boolean f684h;

    /* renamed from: i */
    final boolean f685i;

    /* renamed from: j */
    final Bundle f686j;

    /* renamed from: k */
    final boolean f687k;

    /* renamed from: l */
    final int f688l;

    /* renamed from: m */
    Bundle f689m;

    public FragmentState(Parcel parcel) {
        this.f677a = parcel.readString();
        this.f678b = parcel.readString();
        boolean z = true;
        this.f679c = parcel.readInt() != 0;
        this.f680d = parcel.readInt();
        this.f681e = parcel.readInt();
        this.f682f = parcel.readString();
        this.f683g = parcel.readInt() != 0;
        this.f684h = parcel.readInt() != 0;
        this.f685i = parcel.readInt() != 0;
        this.f686j = parcel.readBundle();
        this.f687k = parcel.readInt() == 0 ? false : z;
        this.f689m = parcel.readBundle();
        this.f688l = parcel.readInt();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Fragment mo500a(C0173as asVar, ClassLoader classLoader) {
        Fragment a = asVar.mo586a(classLoader, this.f677a);
        Bundle bundle = this.f686j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(this.f686j);
        a.mWho = this.f678b;
        a.mFromLayout = this.f679c;
        a.mRestored = true;
        a.mFragmentId = this.f680d;
        a.mContainerId = this.f681e;
        a.mTag = this.f682f;
        a.mRetainInstance = this.f683g;
        a.mRemoving = this.f684h;
        a.mDetached = this.f685i;
        a.mHidden = this.f687k;
        a.mMaxState = C2383n.values()[this.f688l];
        Bundle bundle2 = this.f689m;
        if (bundle2 != null) {
            a.mSavedFragmentState = bundle2;
        } else {
            a.mSavedFragmentState = new Bundle();
        }
        return a;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f677a);
        sb.append(" (");
        sb.append(this.f678b);
        sb.append(")}:");
        if (this.f679c) {
            sb.append(" fromLayout");
        }
        if (this.f681e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f681e));
        }
        String str = this.f682f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f682f);
        }
        if (this.f683g) {
            sb.append(" retainInstance");
        }
        if (this.f684h) {
            sb.append(" removing");
        }
        if (this.f685i) {
            sb.append(" detached");
        }
        if (this.f687k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f677a);
        parcel.writeString(this.f678b);
        parcel.writeInt(this.f679c ? 1 : 0);
        parcel.writeInt(this.f680d);
        parcel.writeInt(this.f681e);
        parcel.writeString(this.f682f);
        parcel.writeInt(this.f683g ? 1 : 0);
        parcel.writeInt(this.f684h ? 1 : 0);
        parcel.writeInt(this.f685i ? 1 : 0);
        parcel.writeBundle(this.f686j);
        parcel.writeInt(this.f687k ? 1 : 0);
        parcel.writeBundle(this.f689m);
        parcel.writeInt(this.f688l);
    }

    public FragmentState(Fragment fragment) {
        this.f677a = fragment.getClass().getName();
        this.f678b = fragment.mWho;
        this.f679c = fragment.mFromLayout;
        this.f680d = fragment.mFragmentId;
        this.f681e = fragment.mContainerId;
        this.f682f = fragment.mTag;
        this.f683g = fragment.mRetainInstance;
        this.f684h = fragment.mRemoving;
        this.f685i = fragment.mDetached;
        this.f686j = fragment.mArguments;
        this.f687k = fragment.mHidden;
        this.f688l = fragment.mMaxState.ordinal();
    }
}
