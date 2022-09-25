package com.google.android.apps.gsa.search.shared.contact;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.p4522b.C58759qy;
import com.google.p4152bb.p4153a.C55090fm;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.p4152bb.p4153a.C55361pn;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
public class PersonDisambiguation extends TwoStepDisambiguation {
    public static final Parcelable.Creator CREATOR = new C87520h();

    /* renamed from: h */
    public Set f236392h;

    /* renamed from: i */
    public C55361pn f236393i;

    /* renamed from: j */
    public String f236394j;

    /* renamed from: k */
    public RelationshipStatus f236395k;

    /* renamed from: l */
    public Map f236396l;

    /* renamed from: m */
    public PersonShortcut f236397m;

    protected PersonDisambiguation(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, classLoader);
        this.f236392h = new HashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f236392h.add(C87515c.m142148a((String) arrayList.get(i)));
        }
        this.f236394j = parcel.readString();
        this.f236395k = (RelationshipStatus) parcel.readParcelable(Relationship.class.getClassLoader());
        EnumMap enumMap = new EnumMap(C87515c.class);
        parcel.readMap(enumMap, classLoader);
        this.f236396l = enumMap;
        this.f236397m = (PersonShortcut) parcel.readParcelable(classLoader);
    }

    /* renamed from: l */
    public final boolean mo81543l() {
        if (this.f236392h.isEmpty() || !mo81544m()) {
            return false;
        }
        if (this.f236412o != null) {
            return true;
        }
        Parcelable parcelable = this.f236364c;
        parcelable.getClass();
        return !mo81582u(parcelable);
    }

    /* renamed from: n */
    public final boolean mo81545n() {
        return this.f236392h.isEmpty() || super.mo81545n();
    }

    /* renamed from: p */
    public final PersonDisambiguation clone() {
        PersonDisambiguation personDisambiguation = new PersonDisambiguation(this.f236392h, this);
        personDisambiguation.f236395k = new RelationshipStatus(this.f236395k);
        return personDisambiguation;
    }

    /* renamed from: q */
    public final C55093fp mo81578q(C87514b bVar, boolean z) {
        if (z || mo81541i()) {
            C55090fm fmVar = (C55090fm) C55093fp.f144965l.createBuilder();
            String str = TextUtils.isEmpty(this.f236394j) ? this.f236362a : this.f236394j;
            fmVar.copyOnWrite();
            C55093fp fpVar = (C55093fp) fmVar.instance;
            str.getClass();
            fpVar.f144967a |= 1;
            fpVar.f144968b = str;
            Contact contact = null;
            if (mo81544m()) {
                Parcelable parcelable = this.f236364c;
                parcelable.getClass();
                Person person = (Person) parcelable;
                if (mo81543l()) {
                    Parcelable parcelable2 = this.f236364c;
                    parcelable2.getClass();
                    Person person2 = (Person) parcelable2;
                    if (mo81583v()) {
                        Parcelable parcelable3 = this.f236412o;
                        parcelable3.getClass();
                        contact = (Contact) parcelable3;
                    }
                }
                fmVar.mo54192c(person.mo81556d(bVar, contact));
            } else if (mo81545n()) {
                for (Person d : this.f236363b) {
                    fmVar.mo54192c(d.mo81556d(bVar, (Contact) null));
                }
            }
            if (this.f236395k.mo81600b()) {
                if (!mo81544m() || !this.f236395k.mo81601c()) {
                    RelationshipStatus relationshipStatus = this.f236395k;
                    if (relationshipStatus.f236410c == null || !relationshipStatus.f236408a || !relationshipStatus.f236409b) {
                        fmVar.copyOnWrite();
                        C55093fp fpVar2 = (C55093fp) fmVar.instance;
                        fpVar2.f144974h = 1;
                        fpVar2.f144967a |= 32;
                    } else {
                        fmVar.copyOnWrite();
                        C55093fp fpVar3 = (C55093fp) fmVar.instance;
                        fpVar3.f144974h = 3;
                        fpVar3.f144967a |= 32;
                    }
                } else {
                    fmVar.copyOnWrite();
                    C55093fp fpVar4 = (C55093fp) fmVar.instance;
                    fpVar4.f144974h = 2;
                    fpVar4.f144967a |= 32;
                }
                fmVar.copyOnWrite();
                C55093fp fpVar5 = (C55093fp) fmVar.instance;
                fpVar5.f144967a |= 16;
                fpVar5.f144973g = true;
                String str2 = this.f236395k.f236410c.f236406b;
                fmVar.copyOnWrite();
                C55093fp fpVar6 = (C55093fp) fmVar.instance;
                str2.getClass();
                fpVar6.f144967a |= 64;
                fpVar6.f144975i = str2;
                String str3 = this.f236395k.f236410c.f236405a;
                fmVar.copyOnWrite();
                C55093fp fpVar7 = (C55093fp) fmVar.instance;
                str3.getClass();
                fpVar7.f144967a |= 128;
                fpVar7.f144976j = str3;
            }
            return (C55093fp) fmVar.build();
        }
        C55090fm fmVar2 = (C55090fm) C55093fp.f144965l.createBuilder();
        fmVar2.copyOnWrite();
        C55093fp fpVar8 = (C55093fp) fmVar2.instance;
        fpVar8.f144967a |= 8;
        fpVar8.f144972f = true;
        return (C55093fp) fmVar2.build();
    }

    /* renamed from: s */
    public final List mo81579r(Person person) {
        Set set = this.f236392h;
        C55361pn pnVar = this.f236393i;
        return person.mo81562k(set, pnVar != null ? new C58759qy(pnVar) : null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo81581t(List list) {
        this.f236412o = null;
        Parcelable parcelable = this.f236364c;
        parcelable.getClass();
        Person person = (Person) parcelable;
        if (list == null || !mo81544m()) {
            this.f236411n = null;
            person.mo81566q();
            return;
        }
        this.f236411n = list;
        if (!list.isEmpty()) {
            Contact contact = person.f236385p;
            if (contact != null) {
                this.f236412o = contact;
            } else if (list.size() == 1) {
                person.mo81567s((Contact) list.get(0));
                this.f236412o = (Contact) list.get(0);
            }
        } else {
            person.mo81566q();
        }
    }

    public final String toString() {
        String twoStepDisambiguation = super.toString();
        String str = this.f236394j;
        String valueOf = String.valueOf(this.f236395k);
        String valueOf2 = String.valueOf(this.f236397m);
        return twoStepDisambiguation + " : LookupName = " + str + " : RelationshipStatus = " + valueOf + " : AppliedPersonShortcut = [ " + valueOf2 + " ]";
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ boolean mo81582u(Parcelable parcelable) {
        Person person = (Person) parcelable;
        return mo81583v();
    }

    /* renamed from: v */
    public final boolean mo81583v() {
        if (this.f236392h.isEmpty()) {
            return false;
        }
        if (this.f236392h.size() != 1 || !this.f236392h.contains(C87515c.PERSON)) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ArrayList arrayList = new ArrayList(this.f236392h.size());
        for (C87515c name : this.f236392h) {
            arrayList.add(name.name());
        }
        parcel.writeList(arrayList);
        parcel.writeString(this.f236394j);
        parcel.writeParcelable(this.f236395k, i);
        parcel.writeMap(this.f236396l);
        parcel.writeParcelable(this.f236397m, 0);
    }

    public PersonDisambiguation(String str, String str2, List list, Set set) {
        super(str, list);
        this.f236392h = set;
        if (!str2.isEmpty()) {
            this.f236394j = str2;
        }
        this.f236395k = new RelationshipStatus();
        mo81533b();
    }

    public PersonDisambiguation(Set set, PersonDisambiguation personDisambiguation) {
        super(personDisambiguation);
        this.f236392h = set;
        this.f236394j = personDisambiguation.f236394j;
        this.f236395k = personDisambiguation.f236395k;
        this.f236396l = personDisambiguation.f236396l;
        this.f236397m = personDisambiguation.f236397m;
    }
}
