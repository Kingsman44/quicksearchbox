package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.android.libraries.social.populous.core.C42283bi;
import com.google.android.libraries.social.populous.core.C42304cc;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.EdgeKeyInfo;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58724pq;
import com.google.p4181bi.C55851m;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57887d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p5602o.p5607c.C71942m;

/* compiled from: PG */
public final class Person implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42203bh();

    /* renamed from: a */
    public final PersonMetadata f110365a;

    /* renamed from: b */
    public final C58485gu f110366b;

    /* renamed from: c */
    public final C58485gu f110367c;

    /* renamed from: d */
    public final String f110368d;

    /* renamed from: e */
    public final PersonExtendedData f110369e;

    /* renamed from: f */
    public final C57887d f110370f;

    /* renamed from: g */
    public final C58485gu f110371g;

    /* renamed from: h */
    private final C58485gu f110372h;

    /* renamed from: i */
    private final C58485gu f110373i;

    /* renamed from: j */
    private final C58485gu f110374j;

    /* renamed from: k */
    private final boolean f110375k;

    /* renamed from: l */
    private final C55851m f110376l;

    /* renamed from: m */
    private final C71942m f110377m;

    /* renamed from: n */
    private Email[] f110378n;

    /* renamed from: o */
    private Phone[] f110379o;

    /* renamed from: p */
    private InAppNotificationTarget[] f110380p;

    /* renamed from: q */
    private Name[] f110381q;

    /* renamed from: r */
    private Photo[] f110382r;

    public Person(PersonMetadata personMetadata, List list, List list2, List list3, List list4, List list5, String str, boolean z, PersonExtendedData personExtendedData, C55851m mVar, C57887d dVar, C71942m mVar2) {
        this.f110365a = personMetadata;
        C58485gu j = C58485gu.m89842j(list);
        this.f110366b = j;
        C58485gu j2 = C58485gu.m89842j(list2);
        this.f110372h = j2;
        C58485gu j3 = C58485gu.m89842j(list3);
        this.f110373i = j3;
        this.f110375k = z;
        C58485gu[] guVarArr = {j, j2, j3};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C58485gu guVar = guVarArr[i];
            if (guVar != null) {
                arrayList.addAll(guVar);
            }
        }
        this.f110371g = C58485gu.m89835E(arrayList);
        this.f110368d = str;
        this.f110369e = personExtendedData;
        this.f110376l = mVar;
        this.f110370f = dVar;
        this.f110377m = mVar2;
        this.f110367c = m74033g(C58485gu.m89842j(list4));
        this.f110374j = m74033g(C58485gu.m89842j(list5));
    }

    /* renamed from: g */
    private final C58485gu m74033g(C58485gu guVar) {
        C58485gu guVar2;
        if (!this.f110375k || (guVar2 = this.f110371g) == null || guVar2.isEmpty()) {
            return guVar;
        }
        ContactMethodField contactMethodField = (ContactMethodField) this.f110371g.get(0);
        int i = 0;
        while (i < guVar.size()) {
            C42304cc ccVar = (C42304cc) guVar.get(i);
            PersonFieldMetadata b = contactMethodField.mo44976b();
            PersonFieldMetadata b2 = ccVar.mo44976b();
            int i2 = b.f110804u;
            if (i2 != 1 && (!C42283bi.m74438b(i2, b2.f110804u) || !C58832aw.m90831a(b.f110800q, b2.f110800q))) {
                C58485gu guVar3 = b.f110791h;
                int i3 = ((C58724pq) guVar3).f156474d;
                int i4 = 0;
                while (i4 < i3) {
                    EdgeKeyInfo edgeKeyInfo = (EdgeKeyInfo) guVar3.get(i4);
                    if (!C42283bi.m74438b(edgeKeyInfo.mo45137b(), b2.f110804u) || !C58832aw.m90831a(edgeKeyInfo.mo45136a(), b2.f110800q)) {
                        i4++;
                    }
                }
                i++;
            }
            ArrayList b3 = C58597ky.m90211b(guVar);
            b3.remove(i);
            b3.add(0, ccVar);
            return C58485gu.m89842j(b3);
        }
        return guVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo44830a() {
        return !this.f110367c.isEmpty() ? ((Name) this.f110367c.get(0)).f110777a.toString() : BuildConfig.FLAVOR;
    }

    @Deprecated
    /* renamed from: b */
    public final Email[] mo44831b() {
        if (this.f110378n == null) {
            this.f110378n = (Email[]) this.f110366b.toArray(new Email[0]);
        }
        return this.f110378n;
    }

    @Deprecated
    /* renamed from: c */
    public final InAppNotificationTarget[] mo44832c() {
        if (this.f110380p == null) {
            this.f110380p = (InAppNotificationTarget[]) this.f110373i.toArray(new InAppNotificationTarget[0]);
        }
        return this.f110380p;
    }

    @Deprecated
    /* renamed from: d */
    public final Name[] mo44833d() {
        if (this.f110381q == null) {
            this.f110381q = (Name[]) this.f110367c.toArray(new Name[0]);
        }
        return this.f110381q;
    }

    public final int describeContents() {
        return 0;
    }

    @Deprecated
    /* renamed from: e */
    public final Phone[] mo44835e() {
        if (this.f110379o == null) {
            this.f110379o = (Phone[]) this.f110372h.toArray(new Phone[0]);
        }
        return this.f110379o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return C58832aw.m90831a(this.f110365a, person.f110365a) && C58832aw.m90831a(this.f110366b, person.f110366b) && C58832aw.m90831a(this.f110372h, person.f110372h) && C58832aw.m90831a(this.f110373i, person.f110373i) && C58832aw.m90831a(this.f110367c, person.f110367c) && C58832aw.m90831a(this.f110374j, person.f110374j) && C58832aw.m90831a(this.f110368d, person.f110368d) && this.f110375k == person.f110375k && C58832aw.m90831a(this.f110369e, person.f110369e) && C58832aw.m90831a(this.f110376l, person.f110376l) && C58832aw.m90831a(this.f110370f, person.f110370f) && C58832aw.m90831a(this.f110377m, person.f110377m);
        }
    }

    @Deprecated
    /* renamed from: f */
    public final Photo[] mo44837f() {
        if (this.f110382r == null) {
            this.f110382r = (Photo[]) this.f110374j.toArray(new Photo[0]);
        }
        return this.f110382r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f110365a, this.f110366b, this.f110372h, this.f110373i, this.f110367c, this.f110374j, this.f110368d, Boolean.valueOf(this.f110375k), this.f110369e, this.f110376l, this.f110370f, this.f110377m});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110365a, 0);
        parcel.writeParcelableList(this.f110366b, 0);
        parcel.writeParcelableList(this.f110372h, 0);
        parcel.writeParcelableList(this.f110373i, 0);
        parcel.writeParcelableList(this.f110367c, 0);
        parcel.writeParcelableList(this.f110374j, 0);
        parcel.writeString(this.f110368d);
        parcel.writeInt(this.f110375k ? 1 : 0);
        parcel.writeParcelable(this.f110369e, 0);
        C42162a.m74082f(parcel, this.f110376l);
        C42162a.m74082f(parcel, this.f110370f);
        C42162a.m74082f(parcel, this.f110377m);
    }
}
