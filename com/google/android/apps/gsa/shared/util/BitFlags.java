package com.google.android.apps.gsa.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.LongSparseArray;
import com.google.common.base.C58838bb;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
public class BitFlags implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91039h();

    /* renamed from: a */
    private final Class f253761a;

    /* renamed from: b */
    public long f253762b;

    /* renamed from: c */
    private final String f253763c;

    /* renamed from: d */
    private LongSparseArray f253764d;

    public BitFlags() {
        this((Class) null, "FLAG_", 0);
    }

    public BitFlags(Class cls, String str, long j) {
        this.f253762b = j;
        this.f253761a = cls;
        this.f253763c = str;
    }

    /* renamed from: f */
    public static boolean m148144f(long j, long j2) {
        return (j & j2) == j2;
    }

    /* renamed from: j */
    private final String m148145j(long j) {
        if (this.f253764d == null) {
            Class cls = this.f253761a;
            LongSparseArray longSparseArray = new LongSparseArray();
            if (cls != null) {
                for (Field field : cls.getDeclaredFields()) {
                    field.setAccessible(true);
                    String name = field.getName();
                    if (name.startsWith(this.f253763c) && Modifier.isStatic(field.getModifiers())) {
                        try {
                            longSparseArray.append(field.getLong((Object) null), name);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            this.f253764d = longSparseArray;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f253764d.size(); i++) {
            long keyAt = this.f253764d.keyAt(i);
            if ((j & keyAt) == keyAt) {
                arrayList.add(((String) this.f253764d.get(keyAt)).substring(this.f253763c.length()).toLowerCase(Locale.US));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList.toString();
        }
        return "[" + Long.toHexString(j) + "]";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80425a() {
    }

    /* renamed from: c */
    public final boolean mo85049c(long j, long j2) {
        C58838bb.m90883r(j >= 0 && j2 >= 0);
        long j3 = this.f253762b;
        long j4 = ((j ^ -1) & j3) | j2;
        if (j3 == j4) {
            return false;
        }
        this.f253762b = j4;
        mo80425a();
        return true;
    }

    /* renamed from: d */
    public final boolean mo85050d() {
        return this.f253762b != 0;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo85052e(long j) {
        return (j & this.f253762b) != 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BitFlags) || this.f253762b != ((BitFlags) obj).f253762b) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo85054g() {
        if (this.f253762b == 0) {
            return false;
        }
        this.f253762b = 0;
        mo80425a();
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f253762b)});
    }

    /* renamed from: i */
    public final void mo85057i(long j) {
        mo85049c((j ^ -1) & this.f253762b, 0);
    }

    public final String toString() {
        return "BitFlags".concat(String.valueOf(m148145j(this.f253762b)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeLong(this.f253762b);
        Class cls = this.f253761a;
        if (cls == null) {
            str = null;
        } else {
            str = cls.getName();
        }
        parcel.writeString(str);
    }

    /* renamed from: b */
    public final String mo85048b() {
        this.f253761a.getClass();
        return m148145j(this.f253762b);
    }

    /* renamed from: h */
    public final boolean mo85055h(long j, boolean z) {
        if (z) {
            return mo85049c(0, j);
        }
        return mo85049c(j, 0);
    }
}
