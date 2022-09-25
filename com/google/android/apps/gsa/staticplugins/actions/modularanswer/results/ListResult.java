package com.google.android.apps.gsa.staticplugins.actions.modularanswer.results;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55316nw;
import com.google.p4152bb.p4153a.C55317nx;
import com.google.p4152bb.p4153a.C55319nz;
import com.google.p4152bb.p4153a.C55329oi;
import com.google.p4152bb.p4153a.C55330oj;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* compiled from: PG */
public class ListResult extends Result {
    public static final Parcelable.Creator CREATOR = new C93413c();

    /* renamed from: a */
    private final C55317nx f260539a;

    /* renamed from: b */
    private final C55305nl f260540b;

    public ListResult(int i, C55317nx nxVar, C55305nl nlVar) {
        super(i);
        this.f260539a = nxVar;
        this.f260540b = nlVar;
    }

    /* renamed from: a */
    public final C55240la mo87671a() {
        C55305nl nlVar = this.f260540b;
        if (nlVar == null || nlVar.f145692b.size() == 0) {
            return null;
        }
        return (C55240la) this.f260540b.f145692b.get(0);
    }

    /* renamed from: b */
    public final C55330oj mo87672b(boolean z) {
        C55329oi oiVar = (C55329oi) C55330oj.f145769e.createBuilder();
        int i = this.f260545e;
        oiVar.copyOnWrite();
        C55330oj ojVar = (C55330oj) oiVar.instance;
        ojVar.f145771a |= 1;
        ojVar.f145772b = i;
        C55316nw nwVar = (C55316nw) C55317nx.f145731c.createBuilder();
        int i2 = this.f260545e;
        nwVar.copyOnWrite();
        C55317nx nxVar = (C55317nx) nwVar.instance;
        nxVar.f145733a |= 1;
        nxVar.f145734b = i2;
        nwVar.mo58885m(C55319nz.f145737d, mo87678e());
        oiVar.copyOnWrite();
        C55330oj ojVar2 = (C55330oj) oiVar.instance;
        C55317nx nxVar2 = (C55317nx) nwVar.build();
        nxVar2.getClass();
        ojVar2.mo54243a();
        ojVar2.f145773c.add(nxVar2);
        C55305nl nlVar = this.f260540b;
        if (nlVar != null) {
            oiVar.mo54242b(nlVar);
        }
        return (C55330oj) oiVar.build();
    }

    /* renamed from: c */
    public final Object mo87673c(C93416f fVar) {
        return fVar.mo87617c();
    }

    /* renamed from: d */
    public final C58485gu mo87677d() {
        return C58485gu.m89842j(mo87678e().f145740b);
    }

    /* renamed from: e */
    public final C55319nz mo87678e() {
        Object obj;
        C55317nx nxVar = this.f260539a;
        C62940bt r1 = C62942bv.checkIsLite(C55319nz.f145737d);
        nxVar.mo58887l(r1);
        Object l = nxVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        return (C55319nz) obj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260545e);
        ProtoLiteParcelable.m147140k(this.f260539a, parcel);
        ProtoLiteParcelable.m147140k(this.f260540b, parcel);
    }

    public ListResult(Parcel parcel) {
        super(parcel);
        this.f260539a = (C55317nx) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55317nx.f145731c.getParserForType());
        this.f260540b = (C55305nl) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55305nl.f145689r.getParserForType());
    }
}
