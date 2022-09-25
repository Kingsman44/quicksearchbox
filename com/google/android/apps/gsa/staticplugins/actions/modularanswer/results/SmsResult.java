package com.google.android.apps.gsa.staticplugins.actions.modularanswer.results;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C55065eo;
import com.google.p4152bb.p4153a.C55072ev;
import com.google.p4152bb.p4153a.C55073ew;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55090fm;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55314nu;
import com.google.p4152bb.p4153a.C55315nv;
import com.google.p4152bb.p4153a.C55316nw;
import com.google.p4152bb.p4153a.C55317nx;
import com.google.p4152bb.p4153a.C55329oi;
import com.google.p4152bb.p4153a.C55330oj;
import com.google.p4152bb.p4153a.C55333om;
import com.google.p4152bb.p4153a.C55335oo;
import com.google.p4152bb.p4153a.C55336op;
import com.google.p4152bb.p4153a.C55341ou;
import com.google.p4152bb.p4153a.C55342ov;
import com.google.p4152bb.p4153a.C55343ow;
import com.google.p4152bb.p4153a.C55344ox;
import com.google.protobuf.C62940bt;
import java.util.List;

/* compiled from: PG */
public class SmsResult extends Result {
    public static final Parcelable.Creator CREATOR = new C93417g();

    /* renamed from: a */
    public final Person f260548a;

    /* renamed from: b */
    public final String f260549b;

    /* renamed from: c */
    public final C58485gu f260550c;

    /* renamed from: d */
    public final C58485gu f260551d;

    /* renamed from: f */
    public final long f260552f;

    /* renamed from: g */
    public final int f260553g;

    /* renamed from: h */
    private final String f260554h;

    /* renamed from: i */
    private final C55336op f260555i;

    public SmsResult(int i, Person person, String str, List list, List list2, long j, int i2, String str2, C55336op opVar) {
        super(i);
        this.f260548a = person;
        this.f260549b = str;
        this.f260550c = C58485gu.m89842j(list);
        this.f260551d = C58485gu.m89842j(list2);
        this.f260552f = j;
        this.f260553g = i2;
        this.f260554h = str2;
        this.f260555i = opVar;
    }

    /* renamed from: a */
    public final C55240la mo87671a() {
        return null;
    }

    /* renamed from: b */
    public final C55330oj mo87672b(boolean z) {
        C55335oo ooVar = (C55335oo) this.f260555i.f145793a.get(0);
        C55329oi oiVar = (C55329oi) C55330oj.f145769e.createBuilder();
        int i = this.f260545e;
        oiVar.copyOnWrite();
        C55330oj ojVar = (C55330oj) oiVar.instance;
        ojVar.f145771a |= 1;
        ojVar.f145772b = i;
        C62940bt btVar = C55336op.f145791c;
        C55333om omVar = (C55333om) C55336op.f145790b.createBuilder();
        omVar.copyOnWrite();
        C55336op opVar = (C55336op) omVar.instance;
        ooVar.getClass();
        opVar.mo54244a();
        opVar.f145793a.add(ooVar);
        oiVar.mo58885m(btVar, (C55336op) omVar.build());
        if (z) {
            C55072ev evVar = (C55072ev) C55073ew.f144880e.createBuilder();
            String str = this.f260549b;
            evVar.copyOnWrite();
            C55073ew ewVar = (C55073ew) evVar.instance;
            str.getClass();
            ewVar.f144882a |= 1;
            ewVar.f144883b = str;
            C55065eo eoVar = (C55065eo) C55082fe.f144912z.createBuilder();
            eoVar.mo54181e((C55073ew) evVar.build());
            C55090fm fmVar = (C55090fm) C55093fp.f144965l.createBuilder();
            fmVar.mo54192c((C55082fe) eoVar.build());
            Person person = this.f260548a;
            if (person != null) {
                String str2 = person.f236373d;
                fmVar.copyOnWrite();
                C55093fp fpVar = (C55093fp) fmVar.instance;
                str2.getClass();
                fpVar.f144967a |= 1;
                fpVar.f144968b = str2;
            }
            C55314nu nuVar = (C55314nu) C55315nv.f145726b.createBuilder();
            nuVar.copyOnWrite();
            C55315nv nvVar = (C55315nv) nuVar.instance;
            C55093fp fpVar2 = (C55093fp) fmVar.build();
            fpVar2.getClass();
            nvVar.mo54240a();
            nvVar.f145729a.add(fpVar2);
            C55315nv nvVar2 = (C55315nv) nuVar.build();
            if (this.f260553g == 100) {
                C55316nw nwVar = (C55316nw) C55317nx.f145731c.createBuilder();
                int i2 = ooVar.f145785c;
                nwVar.copyOnWrite();
                C55317nx nxVar = (C55317nx) nwVar.instance;
                nxVar.f145733a |= 1;
                nxVar.f145734b = i2;
                nwVar.mo58885m(C55315nv.f145727c, nvVar2);
                oiVar.mo54241a((C55317nx) nwVar.build());
            } else {
                C55316nw nwVar2 = (C55316nw) C55317nx.f145731c.createBuilder();
                int i3 = ooVar.f145784b;
                nwVar2.copyOnWrite();
                C55317nx nxVar2 = (C55317nx) nwVar2.instance;
                nxVar2.f145733a |= 1;
                nxVar2.f145734b = i3;
                nwVar2.mo58885m(C55315nv.f145727c, nvVar2);
                oiVar.mo54241a((C55317nx) nwVar2.build());
            }
        }
        if (z) {
            C55341ou ouVar = (C55341ou) C55342ov.f145806b.createBuilder();
            ouVar.mo54245a(this.f260550c);
            C55316nw nwVar3 = (C55316nw) C55317nx.f145731c.createBuilder();
            int i4 = ooVar.f145786d;
            nwVar3.copyOnWrite();
            C55317nx nxVar3 = (C55317nx) nwVar3.instance;
            nxVar3.f145733a |= 1;
            nxVar3.f145734b = i4;
            nwVar3.mo58885m(C55342ov.f145807c, (C55342ov) ouVar.build());
            oiVar.mo54241a((C55317nx) nwVar3.build());
        }
        if (z) {
            C55343ow owVar = (C55343ow) C55344ox.f145810c.createBuilder();
            long j = this.f260552f;
            owVar.copyOnWrite();
            C55344ox oxVar = (C55344ox) owVar.instance;
            oxVar.f145813a |= 1;
            oxVar.f145814b = j;
            C55316nw nwVar4 = (C55316nw) C55317nx.f145731c.createBuilder();
            int i5 = ooVar.f145787e;
            nwVar4.copyOnWrite();
            C55317nx nxVar4 = (C55317nx) nwVar4.instance;
            nxVar4.f145733a |= 1;
            nxVar4.f145734b = i5;
            nwVar4.mo58885m(C55344ox.f145811d, (C55344ox) owVar.build());
            oiVar.mo54241a((C55317nx) nwVar4.build());
        }
        C55341ou ouVar2 = (C55341ou) C55342ov.f145806b.createBuilder();
        ouVar2.mo54246b(this.f260554h);
        C55316nw nwVar5 = (C55316nw) C55317nx.f145731c.createBuilder();
        int i6 = ooVar.f145789g;
        nwVar5.copyOnWrite();
        C55317nx nxVar5 = (C55317nx) nwVar5.instance;
        nxVar5.f145733a |= 1;
        nxVar5.f145734b = i6;
        nwVar5.mo58885m(C55342ov.f145807c, (C55342ov) ouVar2.build());
        oiVar.mo54241a((C55317nx) nwVar5.build());
        return (C55330oj) oiVar.build();
    }

    /* renamed from: c */
    public final Object mo87673c(C93416f fVar) {
        return fVar.mo87616b(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260545e);
        parcel.writeValue(this.f260548a);
        parcel.writeString(this.f260549b);
        parcel.writeStringList(this.f260550c);
        parcel.writeStringList(this.f260551d);
        parcel.writeLong(this.f260552f);
        parcel.writeInt(this.f260553g);
        parcel.writeString(this.f260554h);
        ProtoLiteParcelable.m147140k(this.f260555i, parcel);
    }

    public SmsResult(Parcel parcel) {
        super(parcel);
        this.f260548a = (Person) parcel.readValue(Person.class.getClassLoader());
        this.f260549b = parcel.readString();
        this.f260550c = C58485gu.m89842j(parcel.createStringArrayList());
        this.f260551d = C58485gu.m89842j(parcel.createStringArrayList());
        this.f260552f = parcel.readLong();
        this.f260553g = parcel.readInt();
        this.f260554h = parcel.readString();
        this.f260555i = (C55336op) ProtoLiteParcelable.m147136g(parcel, C55336op.f145790b);
    }
}
