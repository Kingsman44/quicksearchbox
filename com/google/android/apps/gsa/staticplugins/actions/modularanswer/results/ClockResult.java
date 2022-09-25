package com.google.android.apps.gsa.staticplugins.actions.modularanswer.results;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55316nw;
import com.google.p4152bb.p4153a.C55317nx;
import com.google.p4152bb.p4153a.C55329oi;
import com.google.p4152bb.p4153a.C55330oj;
import com.google.p4152bb.p4153a.C55341ou;
import com.google.p4152bb.p4153a.C55342ov;
import com.google.p4152bb.p4153a.C55346oz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class ClockResult extends Result {
    public static final Parcelable.Creator CREATOR = new C93411a();

    /* renamed from: a */
    public final C58485gu f260531a;

    /* renamed from: b */
    public final String f260532b;

    /* renamed from: c */
    public final String f260533c;

    /* renamed from: d */
    public final String f260534d;

    /* renamed from: f */
    private final C55305nl f260535f;

    /* renamed from: g */
    private final C55346oz f260536g;

    /* compiled from: PG */
    public class TimeInfo implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C93412b();

        /* renamed from: a */
        public String f260537a;

        /* renamed from: b */
        public String f260538b;

        public TimeInfo(Parcel parcel) {
            this.f260537a = parcel.readString();
            this.f260538b = parcel.readString();
        }

        public TimeInfo(String str, String str2) {
            this.f260537a = str;
            this.f260538b = str2;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f260537a);
            parcel.writeString(this.f260538b);
        }
    }

    public ClockResult(int i, C55305nl nlVar, C55346oz ozVar, List list, String str, String str2, String str3) {
        super(i);
        this.f260535f = nlVar;
        this.f260536g = ozVar;
        this.f260531a = C58485gu.m89842j(list);
        this.f260532b = str;
        this.f260533c = str2;
        this.f260534d = str3;
    }

    /* renamed from: a */
    public final C55240la mo87671a() {
        C55305nl nlVar = this.f260535f;
        if (nlVar == null || nlVar.f145692b.size() == 0) {
            return null;
        }
        return (C55240la) this.f260535f.f145692b.get(0);
    }

    /* renamed from: b */
    public final C55330oj mo87672b(boolean z) {
        C55329oi oiVar = (C55329oi) C55330oj.f145769e.createBuilder();
        int i = this.f260545e;
        oiVar.copyOnWrite();
        C55330oj ojVar = (C55330oj) oiVar.instance;
        ojVar.f145771a |= 1;
        ojVar.f145772b = i;
        oiVar.mo58885m(C55346oz.f145816h, this.f260536g);
        C55305nl nlVar = this.f260535f;
        if (nlVar != null) {
            oiVar.mo54242b(nlVar);
        }
        C55341ou ouVar = (C55341ou) C55342ov.f145806b.createBuilder();
        C55341ou ouVar2 = (C55341ou) C55342ov.f145806b.createBuilder();
        for (int i2 = 0; i2 < this.f260531a.size(); i2++) {
            TimeInfo timeInfo = (TimeInfo) this.f260531a.get(i2);
            ouVar.mo54246b(timeInfo.f260537a);
            ouVar2.mo54246b(timeInfo.f260538b);
        }
        C55316nw nwVar = (C55316nw) C55317nx.f145731c.createBuilder();
        int i3 = this.f260536g.f145819b;
        nwVar.copyOnWrite();
        C55317nx nxVar = (C55317nx) nwVar.instance;
        nxVar.f145733a |= 1;
        nxVar.f145734b = i3;
        nwVar.mo58885m(C55342ov.f145807c, (C55342ov) ouVar.build());
        oiVar.mo54241a((C55317nx) nwVar.build());
        C55316nw nwVar2 = (C55316nw) C55317nx.f145731c.createBuilder();
        int i4 = this.f260536g.f145820c;
        nwVar2.copyOnWrite();
        C55317nx nxVar2 = (C55317nx) nwVar2.instance;
        nxVar2.f145733a |= 1;
        nxVar2.f145734b = i4;
        nwVar2.mo58885m(C55342ov.f145807c, (C55342ov) ouVar2.build());
        oiVar.mo54241a((C55317nx) nwVar2.build());
        C55341ou ouVar3 = (C55341ou) C55342ov.f145806b.createBuilder();
        ouVar3.mo54246b(this.f260532b);
        C55316nw nwVar3 = (C55316nw) C55317nx.f145731c.createBuilder();
        int i5 = this.f260536g.f145821d;
        nwVar3.copyOnWrite();
        C55317nx nxVar3 = (C55317nx) nwVar3.instance;
        nxVar3.f145733a |= 1;
        nxVar3.f145734b = i5;
        nwVar3.mo58885m(C55342ov.f145807c, (C55342ov) ouVar3.build());
        oiVar.mo54241a((C55317nx) nwVar3.build());
        if (this.f260533c != null) {
            C55341ou ouVar4 = (C55341ou) C55342ov.f145806b.createBuilder();
            ouVar4.mo54246b(this.f260533c);
            C55316nw nwVar4 = (C55316nw) C55317nx.f145731c.createBuilder();
            int i6 = this.f260536g.f145822e;
            nwVar4.copyOnWrite();
            C55317nx nxVar4 = (C55317nx) nwVar4.instance;
            nxVar4.f145733a |= 1;
            nxVar4.f145734b = i6;
            nwVar4.mo58885m(C55342ov.f145807c, (C55342ov) ouVar4.build());
            oiVar.mo54241a((C55317nx) nwVar4.build());
        }
        C55341ou ouVar5 = (C55341ou) C55342ov.f145806b.createBuilder();
        ouVar5.mo54246b(this.f260534d);
        C55316nw nwVar5 = (C55316nw) C55317nx.f145731c.createBuilder();
        int i7 = this.f260536g.f145823f;
        nwVar5.copyOnWrite();
        C55317nx nxVar5 = (C55317nx) nwVar5.instance;
        nxVar5.f145733a |= 1;
        nxVar5.f145734b = i7;
        nwVar5.mo58885m(C55342ov.f145807c, (C55342ov) ouVar5.build());
        oiVar.mo54241a((C55317nx) nwVar5.build());
        return (C55330oj) oiVar.build();
    }

    /* renamed from: c */
    public final Object mo87673c(C93416f fVar) {
        return fVar.mo87615a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260545e);
        ProtoLiteParcelable.m147140k(this.f260535f, parcel);
        ProtoLiteParcelable.m147140k(this.f260536g, parcel);
        parcel.writeTypedList(this.f260531a);
        parcel.writeString(this.f260532b);
        parcel.writeString(this.f260533c);
        parcel.writeString(this.f260534d);
    }

    public ClockResult(Parcel parcel) {
        super(parcel);
        this.f260535f = (C55305nl) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55305nl.f145689r.getParserForType());
        this.f260536g = (C55346oz) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55346oz.f145815g.getParserForType());
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, TimeInfo.CREATOR);
        this.f260531a = C58485gu.m89842j(arrayList);
        this.f260532b = parcel.readString();
        this.f260533c = parcel.readString();
        this.f260534d = parcel.readString();
    }
}
