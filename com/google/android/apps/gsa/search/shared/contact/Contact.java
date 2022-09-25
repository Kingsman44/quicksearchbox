package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.C90763bg;
import com.google.common.base.C58832aw;
import com.google.p4152bb.p4153a.C55063em;
import com.google.p4152bb.p4153a.C55064en;
import com.google.p4152bb.p4153a.C55065eo;
import com.google.p4152bb.p4153a.C55066ep;
import com.google.p4152bb.p4153a.C55067eq;
import com.google.p4152bb.p4153a.C55068er;
import com.google.p4152bb.p4153a.C55069es;
import com.google.p4152bb.p4153a.C55070et;
import com.google.p4152bb.p4153a.C55071eu;
import com.google.p4152bb.p4153a.C55072ev;
import com.google.p4152bb.p4153a.C55073ew;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55097ft;
import com.google.p4152bb.p4153a.C55111gg;
import com.google.p4152bb.p4153a.C55112gh;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class Contact implements Parcelable, C87521i {
    public static final Parcelable.Creator CREATOR = new C87511a();

    /* renamed from: a */
    public final C87515c f236350a;

    /* renamed from: b */
    public final long f236351b;

    /* renamed from: c */
    public String f236352c;

    /* renamed from: d */
    public String f236353d;

    /* renamed from: e */
    public final String f236354e;

    /* renamed from: f */
    public final String f236355f;

    /* renamed from: g */
    public String f236356g = null;

    /* renamed from: h */
    public String f236357h = null;

    /* renamed from: i */
    public String f236358i;

    /* renamed from: j */
    public Long f236359j;

    /* renamed from: k */
    private final String f236360k;

    public Contact(C87515c cVar, long j, String str, String str2, String str3, String str4) {
        this.f236350a = cVar;
        this.f236351b = j;
        this.f236352c = str;
        this.f236353d = str2;
        this.f236354e = str3;
        this.f236355f = str4;
        if (cVar != C87515c.PHONE_NUMBER || TextUtils.isEmpty(str3)) {
            this.f236360k = null;
        } else {
            this.f236360k = C90763bg.m148261a(str3);
        }
    }

    /* renamed from: b */
    public static Contact m142045b(String str) {
        return new Contact(C87515c.EMAIL, 0, (String) null, (String) null, str, (String) null);
    }

    /* renamed from: c */
    public static Contact m142046c(String str) {
        return new Contact(C87515c.PHONE_NUMBER, 0, (String) null, (String) null, str, (String) null);
    }

    /* renamed from: g */
    public static List m142047g(List list) {
        C87515c cVar;
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Contact contact = (Contact) it.next();
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    arrayList.add(contact);
                    break;
                }
                Contact contact2 = (Contact) arrayList.get(i);
                Contact contact3 = null;
                if (contact2 != null && contact != null && (cVar = contact2.f236350a) == contact.f236350a && (cVar != C87515c.PERSON ? contact2.mo81528k(contact) && (!C87515c.APP_SPECIFIC_ENDPOINT_ID.equals(contact2.f236350a) || TextUtils.equals(contact2.f236356g, contact.f236356g)) : contact.mo81527j() && contact2.mo81527j() && contact2.f236353d.equals(contact.mo81523f()))) {
                    String str5 = contact2.f236357h;
                    if (str5 == null) {
                        str5 = contact.f236357h;
                    }
                    if (!TextUtils.isEmpty(contact2.f236356g)) {
                        str = contact2.f236356g;
                    } else {
                        str = contact.f236356g;
                    }
                    C87515c cVar2 = contact2.f236350a;
                    long j = contact2.f236351b;
                    if (j <= 0) {
                        j = contact.f236351b;
                    }
                    String str6 = contact2.f236352c;
                    if (str6 == null) {
                        str6 = contact.f236352c;
                    }
                    String str7 = str6;
                    if (contact2.mo81527j()) {
                        str2 = contact2.f236353d;
                    } else {
                        str2 = contact.f236353d;
                    }
                    String str8 = str2;
                    if (contact2.mo81529l()) {
                        str3 = contact2.f236354e;
                    } else {
                        str3 = contact.f236354e;
                    }
                    String str9 = str3;
                    if (contact2.f236350a == C87515c.GAIA_ID) {
                        String str10 = contact2.f236355f;
                        if (str10 != null && str10.contains("@")) {
                            str4 = contact2.f236355f;
                            Contact contact4 = new Contact(cVar2, j, str7, str8, str9, str4);
                            contact4.f236357h = str5;
                            contact4.f236356g = str;
                            contact3 = contact4;
                        } else if (!TextUtils.isEmpty(contact.f236355f) && contact.f236355f.contains("@")) {
                            str4 = contact.f236355f;
                            Contact contact42 = new Contact(cVar2, j, str7, str8, str9, str4);
                            contact42.f236357h = str5;
                            contact42.f236356g = str;
                            contact3 = contact42;
                        }
                    }
                    String str11 = contact2.f236355f;
                    str4 = (str11 == null || str11.isEmpty()) ? contact.f236355f : contact2.f236355f;
                    Contact contact422 = new Contact(cVar2, j, str7, str8, str9, str4);
                    contact422.f236357h = str5;
                    contact422.f236356g = str;
                    contact3 = contact422;
                }
                if (contact3 != null) {
                    arrayList.set(i, contact3);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final long mo81518a() {
        return this.f236351b;
    }

    /* renamed from: d */
    public final String mo81519d() {
        String str = this.f236360k;
        return str != null ? str : this.f236354e;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo81521e() {
        return this.f236352c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        if (this.f236351b != contact.f236351b || !TextUtils.equals(this.f236353d, contact.f236353d) || !TextUtils.equals(this.f236354e, contact.f236354e) || !C58832aw.m90831a(this.f236350a, contact.f236350a) || !TextUtils.equals(this.f236356g, contact.f236356g) || !TextUtils.equals(this.f236357h, contact.f236357h)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo81523f() {
        return this.f236353d;
    }

    /* renamed from: h */
    public final void mo81524h(C87514b bVar, C55065eo eoVar) {
        C87515c cVar = C87515c.EMAIL;
        int ordinal = this.f236350a.ordinal();
        if (ordinal == 0) {
            C55066ep epVar = (C55066ep) C55067eq.f144865d.createBuilder();
            String str = this.f236354e;
            epVar.copyOnWrite();
            C55067eq eqVar = (C55067eq) epVar.instance;
            str.getClass();
            eqVar.f144867a = 1 | eqVar.f144867a;
            eqVar.f144868b = str;
            C55097ft b = bVar.mo81622b(this.f236355f);
            if (b != null) {
                epVar.copyOnWrite();
                C55067eq eqVar2 = (C55067eq) epVar.instance;
                eqVar2.f144869c = b;
                eqVar2.f144867a |= 2;
            }
            C55067eq eqVar3 = (C55067eq) epVar.build();
            eoVar.copyOnWrite();
            C55082fe feVar = (C55082fe) eoVar.instance;
            C55082fe feVar2 = C55082fe.f144912z;
            eqVar3.getClass();
            feVar.mo54183b();
            feVar.f144923j.add(eqVar3);
        } else if (ordinal == 1) {
            C55072ev evVar = (C55072ev) C55073ew.f144880e.createBuilder();
            String str2 = this.f236354e;
            evVar.copyOnWrite();
            C55073ew ewVar = (C55073ew) evVar.instance;
            str2.getClass();
            ewVar.f144882a = 1 | ewVar.f144882a;
            ewVar.f144883b = str2;
            C55097ft b2 = bVar.mo81622b(this.f236355f);
            if (b2 != null) {
                evVar.copyOnWrite();
                C55073ew ewVar2 = (C55073ew) evVar.instance;
                ewVar2.f144884c = b2;
                ewVar2.f144882a |= 2;
            }
            eoVar.mo54181e((C55073ew) evVar.build());
        } else if (ordinal == 2) {
            C55070et etVar = (C55070et) C55071eu.f144875d.createBuilder();
            C55111gg ggVar = (C55111gg) C55112gh.f145017p.createBuilder();
            String str3 = this.f236354e;
            ggVar.copyOnWrite();
            C55112gh ghVar = (C55112gh) ggVar.instance;
            str3.getClass();
            ghVar.f145019a |= C89885b.HTTP_VALUE;
            ghVar.f145028j = str3;
            etVar.copyOnWrite();
            C55071eu euVar = (C55071eu) etVar.instance;
            C55112gh ghVar2 = (C55112gh) ggVar.build();
            ghVar2.getClass();
            euVar.f144878b = ghVar2;
            euVar.f144877a = 1 | euVar.f144877a;
            C55097ft b3 = bVar.mo81622b(this.f236355f);
            if (b3 != null) {
                etVar.copyOnWrite();
                C55071eu euVar2 = (C55071eu) etVar.instance;
                euVar2.f144879c = b3;
                euVar2.f144877a |= 2;
            }
            C55071eu euVar3 = (C55071eu) etVar.build();
            eoVar.copyOnWrite();
            C55082fe feVar3 = (C55082fe) eoVar.instance;
            C55082fe feVar4 = C55082fe.f144912z;
            euVar3.getClass();
            C62971cq cqVar = feVar3.f144925l;
            if (!cqVar.mo58948c()) {
                feVar3.f144925l = C62942bv.mutableCopy(cqVar);
            }
            feVar3.f144925l.add(euVar3);
        } else if (ordinal == 3) {
            C55068er erVar = (C55068er) C55069es.f144870d.createBuilder();
            if (!TextUtils.isEmpty(this.f236355f)) {
                String str4 = this.f236355f;
                erVar.copyOnWrite();
                C55069es esVar = (C55069es) erVar.instance;
                str4.getClass();
                esVar.f144872a = 1 | esVar.f144872a;
                esVar.f144873b = str4;
            }
            String str5 = this.f236354e;
            erVar.copyOnWrite();
            C55069es esVar2 = (C55069es) erVar.instance;
            str5.getClass();
            esVar2.f144872a = 2 | esVar2.f144872a;
            esVar2.f144874c = str5;
            C55069es esVar3 = (C55069es) erVar.build();
            eoVar.copyOnWrite();
            C55082fe feVar5 = (C55082fe) eoVar.instance;
            C55082fe feVar6 = C55082fe.f144912z;
            esVar3.getClass();
            C62971cq cqVar2 = feVar5.f144927n;
            if (!cqVar2.mo58948c()) {
                feVar5.f144927n = C62942bv.mutableCopy(cqVar2);
            }
            feVar5.f144927n.add(esVar3);
        } else if (ordinal == 4) {
            C55063em emVar = (C55063em) C55064en.f144858f.createBuilder();
            if (!TextUtils.isEmpty(this.f236355f)) {
                String str6 = this.f236355f;
                emVar.copyOnWrite();
                C55064en enVar = (C55064en) emVar.instance;
                str6.getClass();
                enVar.f144860a |= 8;
                enVar.f144864e = str6;
            }
            String str7 = this.f236354e;
            emVar.copyOnWrite();
            C55064en enVar2 = (C55064en) emVar.instance;
            str7.getClass();
            enVar2.f144860a = 4 | enVar2.f144860a;
            enVar2.f144863d = str7;
            String str8 = this.f236356g;
            if (str8 != null) {
                emVar.copyOnWrite();
                C55064en enVar3 = (C55064en) emVar.instance;
                enVar3.f144860a = 1 | enVar3.f144860a;
                enVar3.f144861b = str8;
            }
            String str9 = this.f236357h;
            if (str9 != null) {
                emVar.copyOnWrite();
                C55064en enVar4 = (C55064en) emVar.instance;
                enVar4.f144860a = 2 | enVar4.f144860a;
                enVar4.f144862c = str9;
            }
            eoVar.mo54179c((C55064en) emVar.build());
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f236351b), this.f236353d, this.f236354e, this.f236350a, this.f236356g, this.f236357h});
    }

    /* renamed from: i */
    public final boolean mo81526i() {
        return !TextUtils.isEmpty(this.f236355f);
    }

    /* renamed from: j */
    public final boolean mo81527j() {
        return !TextUtils.isEmpty(this.f236353d);
    }

    /* renamed from: k */
    public final boolean mo81528k(Contact contact) {
        if (contact == null || this.f236350a != contact.f236350a || !contact.mo81529l() || !mo81529l()) {
            return false;
        }
        if (this.f236350a == C87515c.PHONE_NUMBER) {
            return PhoneNumberUtils.compare(this.f236354e, contact.f236354e);
        }
        return this.f236354e.equals(contact.f236354e);
    }

    /* renamed from: l */
    public final boolean mo81529l() {
        return !TextUtils.isEmpty(this.f236354e);
    }

    public final String toString() {
        long j = this.f236351b;
        String str = this.f236352c;
        String str2 = this.f236353d;
        String valueOf = String.valueOf(this.f236350a);
        String str3 = this.f236354e;
        String str4 = this.f236355f;
        return "Contact : ID = " + j + " : Key = " + str + " : Name = " + str2 + " : Mode = " + valueOf + " : Value = " + str3 + " : Label = " + str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236350a.toString());
        parcel.writeLong(this.f236351b);
        parcel.writeString(this.f236352c);
        parcel.writeString(this.f236353d);
        parcel.writeString(this.f236354e);
        parcel.writeString(this.f236355f);
        parcel.writeString(this.f236356g);
        parcel.writeString(this.f236357h);
    }
}
