package com.google.android.libraries.social.peoplekit.configs;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.p3269d.p3270a.C41930e;
import com.google.android.libraries.social.p3269d.p3270a.C41937l;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;

/* compiled from: PG */
public final class PeopleKitConfigImpl implements PeopleKitConfig {
    public static final Parcelable.Creator CREATOR = new C42143c();

    /* renamed from: A */
    private final String f110232A;

    /* renamed from: B */
    private final boolean f110233B;

    /* renamed from: a */
    public final String f110234a;

    /* renamed from: b */
    public final String f110235b;

    /* renamed from: c */
    public final C41937l f110236c;

    /* renamed from: d */
    public final PeopleKitVisualElementPath f110237d;

    /* renamed from: e */
    public final String f110238e;

    /* renamed from: f */
    public final String f110239f;

    /* renamed from: g */
    public final int f110240g;

    /* renamed from: h */
    public final boolean f110241h;

    /* renamed from: i */
    public final boolean f110242i;

    /* renamed from: j */
    public final boolean f110243j;

    /* renamed from: k */
    public final boolean f110244k;

    /* renamed from: l */
    public final boolean f110245l;

    /* renamed from: m */
    public final boolean f110246m;

    /* renamed from: n */
    public final boolean f110247n;

    /* renamed from: o */
    public final boolean f110248o;

    /* renamed from: p */
    public final boolean f110249p;

    /* renamed from: q */
    public final boolean f110250q;

    /* renamed from: r */
    public final boolean f110251r;

    /* renamed from: s */
    public final boolean f110252s;

    /* renamed from: t */
    public final boolean f110253t;

    /* renamed from: u */
    public final boolean f110254u;

    /* renamed from: v */
    public final boolean f110255v;

    /* renamed from: w */
    public final boolean f110256w;

    /* renamed from: x */
    public final boolean f110257x;

    /* renamed from: y */
    public final boolean f110258y;

    /* renamed from: z */
    public final int f110259z;

    public PeopleKitConfigImpl(Parcel parcel) {
        this.f110234a = parcel.readString();
        this.f110235b = parcel.readString();
        this.f110259z = C41930e.m73457a(parcel.readInt());
        this.f110236c = C41937l.m73460a(parcel.readInt());
        this.f110237d = (PeopleKitVisualElementPath) parcel.readParcelable(PeopleKitVisualElementPath.class.getClassLoader());
        if (parcel.readInt() != 0) {
            this.f110238e = parcel.readString();
        } else {
            this.f110238e = null;
        }
        this.f110239f = parcel.readString();
        this.f110240g = parcel.readInt();
        boolean z = true;
        this.f110241h = parcel.readInt() != 0;
        this.f110242i = parcel.readInt() != 0;
        this.f110243j = parcel.readInt() != 0;
        this.f110244k = parcel.readInt() != 0;
        this.f110245l = parcel.readInt() != 0;
        this.f110246m = parcel.readInt() != 0;
        this.f110247n = parcel.readInt() != 0;
        this.f110248o = parcel.readInt() != 0;
        this.f110249p = parcel.readInt() != 0;
        this.f110250q = parcel.readInt() != 0;
        this.f110233B = parcel.readInt() != 0;
        this.f110251r = parcel.readInt() != 0;
        this.f110252s = parcel.readInt() != 0;
        this.f110253t = parcel.readInt() != 0;
        this.f110254u = parcel.readInt() != 0;
        this.f110255v = parcel.readInt() != 0;
        this.f110256w = parcel.readInt() != 0;
        this.f110257x = parcel.readInt() != 0;
        this.f110258y = parcel.readInt() == 0 ? false : z;
        this.f110232A = parcel.readString();
    }

    /* renamed from: a */
    public final PeopleKitVisualElementPath mo44756a() {
        return this.f110237d;
    }

    /* renamed from: b */
    public final C41937l mo44757b() {
        return this.f110236c;
    }

    /* renamed from: c */
    public final String mo44758c() {
        return this.f110234a;
    }

    /* renamed from: d */
    public final String mo44759d() {
        return this.f110235b;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo44760e() {
        return this.f110239f;
    }

    /* renamed from: f */
    public final boolean mo44761f() {
        return this.f110255v;
    }

    /* renamed from: g */
    public final boolean mo44762g() {
        return this.f110256w;
    }

    /* renamed from: h */
    public final boolean mo44763h() {
        return this.f110233B;
    }

    /* renamed from: i */
    public final boolean mo44764i() {
        return this.f110250q;
    }

    /* renamed from: j */
    public final int mo44765j() {
        return this.f110259z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110234a);
        parcel.writeString(this.f110235b);
        int i2 = this.f110259z;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            parcel.writeInt(this.f110236c.f109467ap);
            parcel.writeParcelable(this.f110237d, 0);
            boolean z = !TextUtils.isEmpty(this.f110238e);
            parcel.writeInt(z ? 1 : 0);
            if (z) {
                parcel.writeString(this.f110238e);
            }
            parcel.writeString(this.f110239f);
            parcel.writeInt(this.f110240g);
            parcel.writeInt(this.f110241h ? 1 : 0);
            parcel.writeInt(this.f110242i ? 1 : 0);
            parcel.writeInt(this.f110243j ? 1 : 0);
            parcel.writeInt(this.f110244k ? 1 : 0);
            parcel.writeInt(this.f110245l ? 1 : 0);
            parcel.writeInt(this.f110246m ? 1 : 0);
            parcel.writeInt(this.f110247n ? 1 : 0);
            parcel.writeInt(this.f110248o ? 1 : 0);
            parcel.writeInt(this.f110249p ? 1 : 0);
            parcel.writeInt(this.f110250q ? 1 : 0);
            parcel.writeInt(this.f110233B ? 1 : 0);
            parcel.writeInt(this.f110251r ? 1 : 0);
            parcel.writeInt(this.f110252s ? 1 : 0);
            parcel.writeInt(this.f110253t ? 1 : 0);
            parcel.writeInt(this.f110254u ? 1 : 0);
            parcel.writeInt(this.f110255v ? 1 : 0);
            parcel.writeInt(this.f110256w ? 1 : 0);
            parcel.writeInt(this.f110257x ? 1 : 0);
            parcel.writeInt(this.f110258y ? 1 : 0);
            parcel.writeString(this.f110232A);
            return;
        }
        throw null;
    }

    public PeopleKitConfigImpl(C42144d dVar) {
        this.f110234a = dVar.f110308a;
        this.f110235b = null;
        this.f110259z = dVar.f110318k;
        this.f110236c = dVar.f110309b;
        PeopleKitVisualElementPath peopleKitVisualElementPath = dVar.f110310c;
        this.f110237d = peopleKitVisualElementPath == null ? new PeopleKitVisualElementPath() : peopleKitVisualElementPath;
        this.f110238e = null;
        this.f110239f = null;
        this.f110240g = 0;
        this.f110241h = false;
        this.f110242i = dVar.f110311d;
        this.f110243j = false;
        this.f110244k = false;
        this.f110245l = false;
        this.f110246m = dVar.f110312e;
        this.f110247n = dVar.f110313f;
        this.f110248o = dVar.f110314g;
        this.f110249p = true;
        this.f110250q = dVar.f110315h;
        this.f110233B = false;
        this.f110251r = dVar.f110316i;
        this.f110252s = dVar.f110317j;
        this.f110253t = true;
        this.f110254u = false;
        this.f110255v = false;
        this.f110256w = false;
        this.f110257x = false;
        this.f110258y = false;
        this.f110232A = BuildConfig.FLAVOR;
    }
}
