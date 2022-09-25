package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.p4152bb.p4153a.C55359pl;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55368pu;
import com.google.p4152bb.p4153a.C55370pw;
import com.google.p4152bb.p4153a.C55371px;
import com.google.p4152bb.p4153a.C55372py;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;

/* compiled from: PG */
public class MatchingProviderInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87488j();

    /* renamed from: h */
    public final C87487i f236270h;

    protected MatchingProviderInfo(Parcel parcel) {
        this.f236270h = C87487i.m142003c(parcel, C55361pn.f145866g.getParserForType());
    }

    /* renamed from: d */
    public final C55361pn mo81433d() {
        return (C55361pn) this.f236270h.mo81480d();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo81435e() {
        return this.f236270h.f236312a.isEmpty();
    }

    /* renamed from: f */
    public final boolean mo81436f() {
        if (!this.f236270h.mo81484i()) {
            return false;
        }
        C55361pn d = mo81433d();
        d.getClass();
        C62940bt r1 = C62942bv.checkIsLite(C55359pl.f145864b);
        d.mo58887l(r1);
        return d.f169962ag.mo58857o(r1.f169971d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r6.f236270h;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo81437g() {
        /*
            r6 = this;
            com.google.android.apps.gsa.search.shared.actions.util.i r0 = r6.f236270h
            boolean r0 = r0.mo81484i()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            com.google.android.apps.gsa.search.shared.actions.util.i r0 = r6.f236270h
            r2 = 2
            com.google.bb.a.pw[] r2 = new com.google.p4152bb.p4153a.C55370pw[r2]
            com.google.bb.a.pw r3 = com.google.p4152bb.p4153a.C55370pw.USER_SELECTED
            r2[r1] = r3
            com.google.bb.a.pw r3 = com.google.p4152bb.p4153a.C55370pw.AUTOMATIC
            r4 = 1
            r2[r4] = r3
            int r2 = r0.mo81477a(r2)
            r3 = -1
            if (r2 == r3) goto L_0x002b
            com.google.bb.a.pw[] r3 = new com.google.p4152bb.p4153a.C55370pw[r4]
            com.google.bb.a.pw r5 = com.google.p4152bb.p4153a.C55370pw.AUTOMATIC
            r3[r1] = r5
            int r0 = r0.mo81477a(r3)
            if (r2 != r0) goto L_0x002b
            return r4
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo.mo81437g():boolean");
    }

    /* renamed from: h */
    public final boolean mo81438h() {
        if (this.f236270h.f236312a.size() <= 1 || this.f236270h.mo81484i()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo81439i(C55361pn pnVar, boolean z) {
        if (pnVar != mo81433d() || z != mo81437g()) {
            if (z) {
                this.f236270h.mo81481e(pnVar);
            } else {
                this.f236270h.mo81482f(pnVar);
            }
        }
    }

    public final String toString() {
        if (mo81436f()) {
            return "MatchingProviderInfo{Internal}";
        }
        if (mo81435e()) {
            return "MatchingProviderInfo{No Match}";
        }
        String valueOf = String.valueOf(mo81433d());
        String valueOf2 = String.valueOf(this.f236270h.f236312a);
        return "MatchingProviderInfo{, Preferred Provider = " + valueOf + ", Providers = " + valueOf2 + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87487i.m142004h(this.f236270h, parcel);
    }

    public MatchingProviderInfo(MatchingProviderInfo matchingProviderInfo) {
        this.f236270h = matchingProviderInfo.f236270h.clone();
    }

    public MatchingProviderInfo(List list, C55361pn pnVar, boolean z) {
        C55373pz pzVar;
        C55370pw pwVar;
        if (pnVar != null) {
            C55372py pyVar = (C55372py) C55373pz.f145913d.createBuilder();
            C55368pu puVar = (C55368pu) C55371px.f145907d.createBuilder();
            int indexOf = list.indexOf(pnVar);
            puVar.copyOnWrite();
            C55371px pxVar = (C55371px) puVar.instance;
            pxVar.f145909a |= 1;
            pxVar.f145910b = indexOf;
            if (z) {
                pwVar = C55370pw.AUTOMATIC;
            } else {
                pwVar = C55370pw.USER_SELECTED;
            }
            puVar.copyOnWrite();
            C55371px pxVar2 = (C55371px) puVar.instance;
            pxVar2.f145911c = pwVar.f145906f;
            pxVar2.f145909a |= 4;
            pyVar.mo54253a(puVar);
            pzVar = (C55373pz) pyVar.build();
        } else {
            pzVar = null;
        }
        this.f236270h = new C87487i(list, pzVar, (C55373pz) null);
    }
}
