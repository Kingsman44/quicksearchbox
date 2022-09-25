package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.PeopleKitPerson;
import com.google.android.libraries.social.populous.IdentityInfo;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.PersonMetadata;
import com.google.android.libraries.social.populous.core.SourceIdentity;

/* compiled from: PG */
public final class PopulousPerson implements PeopleKitPerson {
    public static final Parcelable.Creator CREATOR = new C42129w();

    /* renamed from: a */
    private Person f110119a;

    /* renamed from: b */
    private String f110120b;

    /* renamed from: c */
    private String f110121c;

    /* renamed from: d */
    private String f110122d;

    public PopulousPerson(Parcel parcel) {
        this.f110119a = (Person) parcel.readParcelable(Person.class.getClassLoader());
        this.f110121c = parcel.readString();
        this.f110122d = parcel.readString();
        this.f110120b = parcel.readString();
    }

    /* renamed from: a */
    public final Object mo44403a() {
        return this.f110119a;
    }

    /* renamed from: b */
    public final String mo44404b() {
        return this.f110121c;
    }

    /* renamed from: c */
    public final String mo44405c() {
        return this.f110122d;
    }

    /* renamed from: d */
    public final String mo44406d() {
        return this.f110120b;
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PeopleKitPerson) {
            PeopleKitPerson peopleKitPerson = (PeopleKitPerson) obj;
            if (!TextUtils.equals(this.f110121c, peopleKitPerson.mo44404b()) || !TextUtils.equals(this.f110122d, peopleKitPerson.mo44405c()) || !TextUtils.equals(this.f110120b, peopleKitPerson.mo44406d())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String str = this.f110121c;
        String str2 = this.f110122d;
        String str3 = this.f110120b;
        return str + ":" + str2 + ":" + str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f110119a, i);
        parcel.writeString(this.f110121c);
        parcel.writeString(this.f110122d);
        parcel.writeString(this.f110120b);
    }

    public PopulousPerson(C42130x xVar) {
        Person person = xVar.f110200a;
        if (person != null) {
            this.f110119a = person;
            PersonMetadata personMetadata = person.f110365a;
            if (personMetadata.mo44797a() != null) {
                IdentityInfo a = personMetadata.mo44797a();
                if (a.f110364b == null) {
                    a.f110364b = (SourceIdentity[]) a.mo44793a().toArray(new SourceIdentity[0]);
                }
                for (SourceIdentity sourceIdentity : a.f110364b) {
                    if (sourceIdentity.mo45060c() == 3) {
                        this.f110120b = sourceIdentity.mo45059b();
                    } else if (sourceIdentity.mo45060c() == 10 || sourceIdentity.mo45060c() == 14) {
                        this.f110121c = sourceIdentity.mo45059b();
                        this.f110122d = sourceIdentity.mo45058a();
                    }
                }
                return;
            }
            return;
        }
        this.f110121c = xVar.f110201b;
        this.f110122d = xVar.f110202c;
    }
}
