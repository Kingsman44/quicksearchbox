package android.support.p031v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C2383n;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.BackStackRecordState */
/* compiled from: PG */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0181b();

    /* renamed from: a */
    final int[] f601a;

    /* renamed from: b */
    final ArrayList f602b;

    /* renamed from: c */
    final int[] f603c;

    /* renamed from: d */
    final int[] f604d;

    /* renamed from: e */
    final int f605e;

    /* renamed from: f */
    final String f606f;

    /* renamed from: g */
    final int f607g;

    /* renamed from: h */
    final int f608h;

    /* renamed from: i */
    final CharSequence f609i;

    /* renamed from: j */
    final int f610j;

    /* renamed from: k */
    final CharSequence f611k;

    /* renamed from: l */
    final ArrayList f612l;

    /* renamed from: m */
    final ArrayList f613m;

    /* renamed from: n */
    final boolean f614n;

    public BackStackRecordState(Parcel parcel) {
        this.f601a = parcel.createIntArray();
        this.f602b = parcel.createStringArrayList();
        this.f603c = parcel.createIntArray();
        this.f604d = parcel.createIntArray();
        this.f605e = parcel.readInt();
        this.f606f = parcel.readString();
        this.f607g = parcel.readInt();
        this.f608h = parcel.readInt();
        this.f609i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f610j = parcel.readInt();
        this.f611k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f612l = parcel.createStringArrayList();
        this.f613m = parcel.createStringArrayList();
        this.f614n = parcel.readInt() != 0;
    }

    /* renamed from: a */
    public final void mo233a(C0154a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f601a;
            boolean z = true;
            if (i < iArr.length) {
                C0212cd cdVar = new C0212cd();
                int i3 = i + 1;
                cdVar.f800a = iArr[i];
                if (FragmentManager.m246Z(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f601a[i3]);
                }
                cdVar.f807h = C2383n.values()[this.f603c[i2]];
                cdVar.f808i = C2383n.values()[this.f604d[i2]];
                int[] iArr2 = this.f601a;
                int i4 = i3 + 1;
                if (iArr2[i3] == 0) {
                    z = false;
                }
                cdVar.f802c = z;
                int i5 = i4 + 1;
                int i6 = iArr2[i4];
                cdVar.f803d = i6;
                int i7 = i5 + 1;
                int i8 = iArr2[i5];
                cdVar.f804e = i8;
                int i9 = i7 + 1;
                int i10 = iArr2[i7];
                cdVar.f805f = i10;
                int i11 = iArr2[i9];
                cdVar.f806g = i11;
                aVar.f810f = i6;
                aVar.f811g = i8;
                aVar.f812h = i10;
                aVar.f813i = i11;
                aVar.mo684q(cdVar);
                i2++;
                i = i9 + 1;
            } else {
                aVar.f814j = this.f605e;
                aVar.f817m = this.f606f;
                aVar.f815k = true;
                aVar.f818n = this.f608h;
                aVar.f819o = this.f609i;
                aVar.f820p = this.f610j;
                aVar.f821q = this.f611k;
                aVar.f822r = this.f612l;
                aVar.f823s = this.f613m;
                aVar.f824t = this.f614n;
                return;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f601a);
        parcel.writeStringList(this.f602b);
        parcel.writeIntArray(this.f603c);
        parcel.writeIntArray(this.f604d);
        parcel.writeInt(this.f605e);
        parcel.writeString(this.f606f);
        parcel.writeInt(this.f607g);
        parcel.writeInt(this.f608h);
        TextUtils.writeToParcel(this.f609i, parcel, 0);
        parcel.writeInt(this.f610j);
        TextUtils.writeToParcel(this.f611k, parcel, 0);
        parcel.writeStringList(this.f612l);
        parcel.writeStringList(this.f613m);
        parcel.writeInt(this.f614n ? 1 : 0);
    }

    public BackStackRecordState(C0154a aVar) {
        int size = aVar.f809e.size();
        this.f601a = new int[(size * 6)];
        if (aVar.f815k) {
            this.f602b = new ArrayList(size);
            this.f603c = new int[size];
            this.f604d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0212cd cdVar = (C0212cd) aVar.f809e.get(i);
                int i3 = i2 + 1;
                this.f601a[i2] = cdVar.f800a;
                ArrayList arrayList = this.f602b;
                Fragment fragment = cdVar.f801b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f601a;
                int i4 = i3 + 1;
                iArr[i3] = cdVar.f802c;
                int i5 = i4 + 1;
                iArr[i4] = cdVar.f803d;
                int i6 = i5 + 1;
                iArr[i5] = cdVar.f804e;
                int i7 = i6 + 1;
                iArr[i6] = cdVar.f805f;
                iArr[i7] = cdVar.f806g;
                this.f603c[i] = cdVar.f807h.ordinal();
                this.f604d[i] = cdVar.f808i.ordinal();
                i++;
                i2 = i7 + 1;
            }
            this.f605e = aVar.f814j;
            this.f606f = aVar.f817m;
            this.f607g = aVar.f692c;
            this.f608h = aVar.f818n;
            this.f609i = aVar.f819o;
            this.f610j = aVar.f820p;
            this.f611k = aVar.f821q;
            this.f612l = aVar.f822r;
            this.f613m = aVar.f823s;
            this.f614n = aVar.f824t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
}
