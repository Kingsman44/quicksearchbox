package com.google.android.apps.gsa.search.shared.actions.modular;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.util.C87487i;
import com.google.android.apps.gsa.search.shared.actions.util.C87494p;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55240la;
import com.google.p4152bb.p4153a.C55244le;
import com.google.p4152bb.p4153a.C55253ln;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.util.List;

/* compiled from: PG */
public class ModularActionMatchingProviderInfo extends MatchingProviderInfo {
    public static final Parcelable.Creator CREATOR = new C87468g();

    /* renamed from: a */
    public C55240la f236115a;

    /* renamed from: b */
    public C55240la f236116b;

    /* renamed from: c */
    public C55240la f236117c;

    /* renamed from: d */
    public C55240la f236118d;

    /* renamed from: e */
    public C55240la f236119e;

    /* renamed from: f */
    public C55240la f236120f;

    /* renamed from: g */
    public C87487i f236121g;

    public ModularActionMatchingProviderInfo(Parcel parcel) {
        super(parcel);
        this.f236115a = m141652j(parcel);
        this.f236116b = m141652j(parcel);
        this.f236117c = m141652j(parcel);
        this.f236118d = m141652j(parcel);
        this.f236119e = m141652j(parcel);
        this.f236120f = m141652j(parcel);
    }

    /* renamed from: a */
    protected static C87429c m141651a(MatchingProviderInfo matchingProviderInfo, C55134hc hcVar) {
        C58838bb.m90883r(matchingProviderInfo.f236270h.mo81484i());
        C55361pn d = matchingProviderInfo.mo81433d();
        if (d == null) {
            return C87429c.f236122a;
        }
        C55133hb hbVar = C55133hb.NONE;
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        int ordinal = a.ordinal();
        if (ordinal == 2) {
            return new C87429c(d.f145869b);
        }
        if (ordinal != 3) {
            return C87429c.f236122a;
        }
        String c = C87494p.m142026c(d);
        return c == null ? C87429c.f236122a : new C87429c(c);
    }

    /* renamed from: j */
    private static C55240la m141652j(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return null;
        }
        try {
            return (C55240la) C62942bv.parseFrom((C62942bv) C55240la.f145449k, createByteArray, C62921ba.m95368a());
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: k */
    private static void m141653k(C55240la laVar, Parcel parcel) {
        parcel.writeByteArray(laVar != null ? laVar.toByteArray() : null);
    }

    /* renamed from: b */
    public final C55253ln mo81239b() {
        C87487i iVar = this.f236121g;
        if (iVar == null) {
            return null;
        }
        return (C55253ln) iVar.mo81480d();
    }

    /* renamed from: c */
    public final void mo81240c(List list) {
        List list2;
        if (list == null) {
            this.f236121g = null;
            return;
        }
        C87487i iVar = this.f236121g;
        if (!(iVar == null || (list2 = iVar.f236312a) == null || list2.size() != list.size())) {
            int i = 0;
            while (i < list2.size()) {
                C55253ln lnVar = (C55253ln) list2.get(i);
                C55253ln lnVar2 = (C55253ln) list.get(i);
                if (((C55240la) lnVar.f145510b.get(0)).equals((C55240la) lnVar2.f145510b.get(0))) {
                    C55244le leVar = lnVar.f145511c;
                    if (leVar == null) {
                        leVar = C55244le.f145466h;
                    }
                    C55244le leVar2 = lnVar2.f145511c;
                    if (leVar2 == null) {
                        leVar2 = C55244le.f145466h;
                    }
                    if (leVar.equals(leVar2)) {
                        C55244le leVar3 = lnVar.f145512d;
                        if (leVar3 == null) {
                            leVar3 = C55244le.f145466h;
                        }
                        C55244le leVar4 = lnVar2.f145512d;
                        if (leVar4 == null) {
                            leVar4 = C55244le.f145466h;
                        }
                        if (leVar3.equals(leVar4)) {
                            i++;
                        }
                    }
                }
            }
            return;
        }
        this.f236121g = new C87487i(list, (C55373pz) null, (C55373pz) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C87487i.m142004h(this.f236270h, parcel);
        m141653k(this.f236115a, parcel);
        m141653k(this.f236116b, parcel);
        m141653k(this.f236117c, parcel);
        m141653k(this.f236118d, parcel);
        m141653k(this.f236119e, parcel);
        m141653k(this.f236120f, parcel);
    }

    public ModularActionMatchingProviderInfo(MatchingProviderInfo matchingProviderInfo, C55240la laVar, C55240la laVar2, C55240la laVar3, C55240la laVar4, C55240la laVar5, C55240la laVar6) {
        super(matchingProviderInfo);
        this.f236115a = laVar;
        this.f236116b = laVar2;
        this.f236117c = laVar3;
        this.f236118d = laVar4;
        this.f236119e = laVar5;
        this.f236120f = laVar6;
    }
}
