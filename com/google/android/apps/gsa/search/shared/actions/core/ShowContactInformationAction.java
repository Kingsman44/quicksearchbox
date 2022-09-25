package com.google.android.apps.gsa.search.shared.actions.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.contact.C87515c;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55421x;
import java.util.List;

/* compiled from: PG */
public class ShowContactInformationAction extends CommunicationAction {
    public static final Parcelable.Creator CREATOR = new C87409h();

    /* renamed from: h */
    public Contact f236056h;

    /* renamed from: i */
    public final int f236057i;

    /* renamed from: j */
    public boolean f236058j;

    /* renamed from: k */
    public List f236059k;

    /* renamed from: l */
    public List f236060l;

    /* renamed from: m */
    public List f236061m;

    /* renamed from: n */
    private final String f236062n;

    protected ShowContactInformationAction(Parcel parcel) {
        super(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.f236057i = parcel.readInt();
        this.f236062n = parcel.readString();
        this.f236058j = parcel.readByte() != 1 ? false : true;
        this.f236059k = parcel.readArrayList(classLoader);
        this.f236060l = parcel.readArrayList(classLoader);
        this.f236061m = parcel.readArrayList(classLoader);
    }

    /* renamed from: L */
    public final Object mo81146L(C87407f fVar) {
        return fVar.mo81167l(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return false;
    }

    /* renamed from: N */
    public final CommunicationAction mo81148N(PersonDisambiguation personDisambiguation) {
        return new ShowContactInformationAction(personDisambiguation, this.f236057i, this.f236062n, this.f236058j, this.f236059k, this.f236060l, this.f236061m);
    }

    /* renamed from: O */
    public final C87515c mo81149O() {
        return C87515c.PERSON;
    }

    /* renamed from: Q */
    public final Contact mo81152Q() {
        Contact contact = this.f236056h;
        contact.getClass();
        this.f236056h = null;
        return contact;
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return C55421x.SHOW_CONTACT_INFORMATION;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f236057i);
        parcel.writeString(this.f236062n);
        parcel.writeByte(this.f236058j ? (byte) 1 : 0);
        parcel.writeList(this.f236059k);
        parcel.writeList(this.f236060l);
        parcel.writeList(this.f236061m);
    }

    public ShowContactInformationAction(PersonDisambiguation personDisambiguation, int i, String str, boolean z, List list, List list2, List list3) {
        super(personDisambiguation);
        boolean z2 = true;
        if (!(i == 1 || i == 2 || i == 3)) {
            if (i == 0) {
                i = 0;
            } else {
                z2 = false;
            }
        }
        C58838bb.m90868c(z2);
        this.f236057i = i;
        this.f236062n = str;
        this.f236058j = z;
        this.f236059k = list;
        this.f236060l = list2;
        this.f236061m = list3;
    }
}
