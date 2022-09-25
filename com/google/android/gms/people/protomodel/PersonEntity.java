package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator CREATOR = new C145694g();

    /* renamed from: a */
    public final String f393952a;

    /* renamed from: b */
    private final List f393953b;

    /* renamed from: c */
    private final List f393954c;

    /* renamed from: d */
    private final List f393955d;

    /* renamed from: e */
    private final List f393956e;

    /* renamed from: f */
    private final List f393957f;

    /* renamed from: g */
    private List f393958g;

    /* renamed from: h */
    private List f393959h;

    /* renamed from: i */
    private List f393960i;

    /* renamed from: j */
    private List f393961j;

    /* renamed from: k */
    private List f393962k;

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5) {
        this.f393952a = str;
        this.f393953b = list;
        this.f393954c = list2;
        this.f393955d = list3;
        this.f393956e = list4;
        this.f393957f = list5;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: b */
    public final String mo121771b() {
        return this.f393952a;
    }

    /* renamed from: c */
    public final List mo121772c() {
        List list;
        if (this.f393962k == null && (list = this.f393957f) != null) {
            this.f393962k = new ArrayList(list.size());
            for (Birthday add : this.f393957f) {
                this.f393962k.add(add);
            }
        }
        return this.f393962k;
    }

    /* renamed from: d */
    public final List mo121773d() {
        List list;
        if (this.f393960i == null && (list = this.f393955d) != null) {
            this.f393960i = new ArrayList(list.size());
            for (Email add : this.f393955d) {
                this.f393960i.add(add);
            }
        }
        return this.f393960i;
    }

    /* renamed from: e */
    public final List mo121774e() {
        List list;
        if (this.f393958g == null && (list = this.f393953b) != null) {
            this.f393958g = new ArrayList(list.size());
            for (Name add : this.f393953b) {
                this.f393958g.add(add);
            }
        }
        return this.f393958g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        return C143912ba.m233950b(mo121771b(), person.mo121771b()) && C143912ba.m233950b(mo121774e(), person.mo121774e()) && C143912ba.m233950b(mo121776h(), person.mo121776h()) && C143912ba.m233950b(mo121773d(), person.mo121773d()) && C143912ba.m233950b(mo121775g(), person.mo121775g()) && C143912ba.m233950b(mo121772c(), person.mo121772c());
    }

    /* renamed from: f */
    public final boolean mo119346f() {
        throw null;
    }

    /* renamed from: g */
    public final List mo121775g() {
        List list;
        if (this.f393961j == null && (list = this.f393956e) != null) {
            this.f393961j = new ArrayList(list.size());
            for (Phone add : this.f393956e) {
                this.f393961j.add(add);
            }
        }
        return this.f393961j;
    }

    /* renamed from: h */
    public final List mo121776h() {
        List list;
        if (this.f393959h == null && (list = this.f393954c) != null) {
            this.f393959h = new ArrayList(list.size());
            for (Photo add : this.f393954c) {
                this.f393959h.add(add);
            }
        }
        return this.f393959h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo121771b(), mo121774e(), mo121776h(), mo121773d(), mo121775g(), mo121772c()});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f393952a);
        C143947c.m234080C(parcel, 4, mo121774e());
        C143947c.m234080C(parcel, 5, mo121776h());
        C143947c.m234080C(parcel, 9, mo121772c());
        C143947c.m234080C(parcel, 11, mo121773d());
        C143947c.m234080C(parcel, 13, mo121775g());
        C143947c.m234083b(parcel, a);
    }
}
