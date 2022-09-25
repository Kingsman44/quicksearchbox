package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.populous.core.C42309ch;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
public final class AutoValue_Autocompletion extends C$AutoValue_Autocompletion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42559j();

    /* renamed from: f */
    private static final ClassLoader f110336f = AutoValue_Autocompletion.class.getClassLoader();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoValue_Autocompletion(Parcel parcel) {
        super(C42309ch.values()[parcel.readInt()], C58485gu.m89844l((ContactMethodField[]) C58485gu.m89844l(parcel.readParcelableArray(ContactMethodField.class.getClassLoader())).toArray(new ContactMethodField[0])), parcel.readByte() == 1 ? (Person) parcel.readParcelable(f110336f) : null, parcel.readByte() == 1 ? (Group) parcel.readParcelable(f110336f) : null, parcel.readByte() == 1 ? (C41932g) ProtoParsers.m95521d(parcel, C41932g.f109390d, C62921ba.m95368a()) : null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110319a.ordinal());
        byte b = 0;
        parcel.writeParcelableArray((Parcelable[]) this.f110320b.toArray(new Parcelable[0]), 0);
        parcel.writeByte(this.f110321c == null ? (byte) 0 : 1);
        Person person = this.f110321c;
        if (person != null) {
            parcel.writeParcelable(person, 0);
        }
        parcel.writeByte(this.f110322d == null ? (byte) 0 : 1);
        Group group = this.f110322d;
        if (group != null) {
            parcel.writeParcelable(group, 0);
        }
        if (this.f110323e != null) {
            b = 1;
        }
        parcel.writeByte(b);
        C41932g gVar = this.f110323e;
        if (gVar != null) {
            ProtoParsers.m95530m(parcel, gVar);
        }
    }

    public AutoValue_Autocompletion(C42309ch chVar, C58485gu guVar, Person person, Group group, C41932g gVar) {
        super(chVar, guVar, person, group, gVar);
    }
}
