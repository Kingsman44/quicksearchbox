package com.google.android.apps.gsa.staticplugins.actions.modularanswer.results;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55082fe;
import com.google.p4152bb.p4153a.C55090fm;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.p4152bb.p4153a.C55208jw;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55305nl;
import com.google.p4152bb.p4153a.C55314nu;
import com.google.p4152bb.p4153a.C55315nv;
import com.google.p4152bb.p4153a.C55316nw;
import com.google.p4152bb.p4153a.C55317nx;
import com.google.p4152bb.p4153a.C55327og;
import com.google.p4152bb.p4153a.C55328oh;
import com.google.p4152bb.p4153a.C55329oi;
import com.google.p4152bb.p4153a.C55330oj;
import com.google.p4152bb.p4153a.C55341ou;
import com.google.p4152bb.p4153a.C55342ov;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;

/* compiled from: PG */
public class NotificationClientResult extends Result {
    public static final Parcelable.Creator CREATOR = new C93414d();

    /* renamed from: a */
    private final C58485gu f260541a;

    /* renamed from: b */
    private final String f260542b;

    /* renamed from: c */
    private final C55305nl f260543c;

    /* renamed from: d */
    private final C55328oh f260544d;

    public NotificationClientResult(int i, List list, String str, C55305nl nlVar, C55328oh ohVar) {
        super(i);
        this.f260541a = C58485gu.m89842j(list);
        this.f260542b = str;
        this.f260543c = nlVar;
        this.f260544d = ohVar;
    }

    /* renamed from: a */
    public final C55240la mo87671a() {
        Object obj;
        C55305nl nlVar = this.f260543c;
        if (nlVar == null || nlVar.f145692b.size() <= 0) {
            return null;
        }
        C55240la laVar = (C55240la) this.f260543c.f145692b.get(0);
        C62940bt r2 = C62942bv.checkIsLite(C55208jw.f145316z);
        laVar.mo58887l(r2);
        Object l = laVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj = r2.f169969b;
        } else {
            obj = r2.mo58889c(l);
        }
        if (!((C55208jw) obj).f145337t.isEmpty()) {
            return (C55240la) this.f260543c.f145692b.get(0);
        }
        return null;
    }

    /* renamed from: b */
    public final C55330oj mo87672b(boolean z) {
        C55327og ogVar = this.f260544d.f145767a;
        if (ogVar == null) {
            ogVar = C55327og.f145758d;
        }
        C55329oi oiVar = (C55329oi) C55330oj.f145769e.createBuilder();
        int i = this.f260545e;
        oiVar.copyOnWrite();
        C55330oj ojVar = (C55330oj) oiVar.instance;
        ojVar.f145771a |= 1;
        ojVar.f145772b = i;
        oiVar.mo58885m(C55328oh.f145765c, C55328oh.f145764b);
        C55305nl nlVar = this.f260543c;
        if (nlVar != null) {
            oiVar.mo54242b(nlVar);
        }
        if (z) {
            C58485gu guVar = this.f260541a;
            if (guVar != null && !guVar.isEmpty()) {
                C55341ou ouVar = (C55341ou) C55342ov.f145806b.createBuilder();
                ouVar.mo54245a(this.f260541a);
                C55316nw nwVar = (C55316nw) C55317nx.f145731c.createBuilder();
                int i2 = ogVar.f145760a;
                nwVar.copyOnWrite();
                C55317nx nxVar = (C55317nx) nwVar.instance;
                nxVar.f145733a |= 1;
                nxVar.f145734b = i2;
                nwVar.mo58885m(C55342ov.f145807c, (C55342ov) ouVar.build());
                oiVar.mo54241a((C55317nx) nwVar.build());
            }
            String str = this.f260542b;
            if (str != null && !str.isEmpty()) {
                C55082fe feVar = C55082fe.f144912z;
                C55090fm fmVar = (C55090fm) C55093fp.f144965l.createBuilder();
                String str2 = this.f260542b;
                fmVar.copyOnWrite();
                C55093fp fpVar = (C55093fp) fmVar.instance;
                str2.getClass();
                fpVar.f144967a |= 1;
                fpVar.f144968b = str2;
                fmVar.mo54192c(feVar);
                C55093fp fpVar2 = (C55093fp) fmVar.build();
                C55314nu nuVar = (C55314nu) C55315nv.f145726b.createBuilder();
                nuVar.copyOnWrite();
                C55315nv nvVar = (C55315nv) nuVar.instance;
                fpVar2.getClass();
                nvVar.mo54240a();
                nvVar.f145729a.add(fpVar2);
                C55316nw nwVar2 = (C55316nw) C55317nx.f145731c.createBuilder();
                int i3 = ogVar.f145761b;
                nwVar2.copyOnWrite();
                C55317nx nxVar2 = (C55317nx) nwVar2.instance;
                nxVar2.f145733a |= 1;
                nxVar2.f145734b = i3;
                nwVar2.mo58885m(C55315nv.f145727c, (C55315nv) nuVar.build());
                oiVar.mo54241a((C55317nx) nwVar2.build());
            }
        }
        return (C55330oj) oiVar.build();
    }

    /* renamed from: c */
    public final Object mo87673c(C93416f fVar) {
        C58976aa aaVar = C58975e.f156826a;
        return fVar.mo87619e();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f260545e);
        parcel.writeStringList(this.f260541a);
        parcel.writeString(this.f260542b);
        ProtoLiteParcelable.m147140k(this.f260543c, parcel);
        ProtoLiteParcelable.m147140k(this.f260544d, parcel);
    }

    public NotificationClientResult(Parcel parcel) {
        super(parcel);
        this.f260541a = C58485gu.m89842j(parcel.createStringArrayList());
        this.f260542b = parcel.readString();
        this.f260543c = (C55305nl) ProtoLiteParcelable.m147134e(parcel.createByteArray(), C55305nl.f145689r.getParserForType());
        this.f260544d = (C55328oh) ProtoLiteParcelable.m147136g(parcel, C55328oh.f145764b);
    }
}
