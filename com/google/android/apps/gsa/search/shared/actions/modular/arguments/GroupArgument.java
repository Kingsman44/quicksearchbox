package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.actionsui.modular.C93600cx;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C55005ci;
import com.google.p4152bb.p4153a.C55009cm;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55183iy;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55248li;
import com.google.p4152bb.p4153a.C55250lk;
import com.google.p4152bb.p4153a.C55251ll;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import java.util.List;

/* compiled from: PG */
public class GroupArgument extends SingleValueArgument {
    public static final Parcelable.Creator CREATOR = new C87450n();

    /* renamed from: i */
    public final List f236183i;

    /* renamed from: j */
    private final C55183iy f236184j;

    private GroupArgument(GroupArgument groupArgument, int i) {
        super(groupArgument, (Integer) groupArgument.f236203n, i);
        this.f236183i = groupArgument.f236183i;
        this.f236184j = groupArgument.f236184j;
    }

    /* renamed from: g */
    private final C55250lk m141765g() {
        C58838bb.m90883r(mo81263C());
        return (C55250lk) this.f236183i.get(((Integer) this.f236203n).intValue());
    }

    /* renamed from: F */
    public final boolean mo81266F(C55005ci ciVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C55009cm.f144726d);
        ciVar.mo58887l(r0);
        if (!ciVar.f169962ag.mo58857o(r0.f169971d)) {
            return super.mo81266F(ciVar);
        }
        C62940bt r02 = C62942bv.checkIsLite(C55009cm.f144726d);
        ciVar.mo58887l(r02);
        Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C55009cm cmVar = (C55009cm) obj;
        if ((cmVar.f144728a & 1) == 0 || ((Integer) this.f236203n).intValue() != cmVar.f144729b) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public final boolean mo81267G(C93600cx cxVar) {
        if (!mo81263C()) {
            return true;
        }
        for (Integer intValue : m141765g().f145494d) {
            if (!this.f236144e.mo81211R(intValue.intValue()).mo81267G(cxVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo81307a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f236183i.size()) {
            z = true;
        }
        C58838bb.m90868c(z);
        mo81334P(Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = com.google.p4152bb.p4153a.C55182ix.m87618a(r0.f145263a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo81308b() {
        /*
            r2 = this;
            com.google.bb.a.iy r0 = r2.f236184j
            if (r0 == 0) goto L_0x0012
            int r0 = r0.f145263a
            int r0 = com.google.p4152bb.p4153a.C55182ix.m87618a(r0)
            if (r0 != 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            r1 = 3
            if (r0 != r1) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument.mo81308b():boolean");
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        if (mo81263C()) {
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            if (a == C55133hb.NONE) {
                C55250lk g = m141765g();
                if ((g.f145491a & 4) != 0) {
                    C55136he heVar = g.f145493c;
                    if (heVar == null) {
                        heVar = C55136he.f145130j;
                    }
                    return mVar.mo81378a(heVar, this.f236144e, true);
                }
            }
        }
        return C87429c.f236122a;
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* renamed from: m */
    public final Argument mo81278m(int i) {
        return new GroupArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55248li liVar = (C55248li) C55251ll.f145499e.createBuilder();
        List list = this.f236183i;
        liVar.copyOnWrite();
        C55251ll llVar = (C55251ll) liVar.instance;
        llVar.mo54220a();
        C62947c.addAll((Iterable) list, (List) llVar.f145503b);
        C55183iy iyVar = this.f236184j;
        liVar.copyOnWrite();
        C55251ll llVar2 = (C55251ll) liVar.instance;
        iyVar.getClass();
        llVar2.f145505d = iyVar;
        llVar2.f145502a |= 2;
        if (mo81263C()) {
            int intValue = ((Integer) this.f236203n).intValue();
            liVar.copyOnWrite();
            C55251ll llVar3 = (C55251ll) liVar.instance;
            llVar3.f145502a |= 1;
            llVar3.f145504c = intValue;
        }
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        jzVar.mo58885m(C55251ll.f145500f, (C55251ll) liVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81357d(this);
    }

    /* renamed from: r */
    public final List mo81283r() {
        if (!mo81263C()) {
            return C58485gu.m89845m();
        }
        return m141765g().f145494d;
    }

    /* renamed from: s */
    public final List mo81284s() {
        if (!mo81263C()) {
            return C58485gu.m89845m();
        }
        return ((C55250lk) this.f236183i.get(((Integer) this.f236203n).intValue())).f145495e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GroupArgument(com.google.p4152bb.p4153a.C55213ka r4) {
        /*
            r3 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55251ll.f145500f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r1 = r4.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0016
            java.lang.Object r0 = r0.f169969b
            goto L_0x001a
        L_0x0016:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x001a:
            com.google.bb.a.ll r0 = (com.google.p4152bb.p4153a.C55251ll) r0
            int r1 = r0.f145502a
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0029
            int r0 = r0.f145504c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r3.<init>(r4, r0)
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55251ll.f145500f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r4 = r4.mo58854l(r1)
            if (r4 != 0) goto L_0x0043
            java.lang.Object r4 = r0.f169969b
            goto L_0x0047
        L_0x0043:
            java.lang.Object r4 = r0.mo58889c(r4)
        L_0x0047:
            com.google.bb.a.ll r4 = (com.google.p4152bb.p4153a.C55251ll) r4
            com.google.protobuf.cq r0 = r4.f145503b
            r3.f236183i = r0
            com.google.bb.a.iy r4 = r4.f145505d
            if (r4 != 0) goto L_0x0053
            com.google.bb.a.iy r4 = com.google.p4152bb.p4153a.C55183iy.f145261b
        L_0x0053:
            r3.f236184j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.GroupArgument.<init>(com.google.bb.a.ka):void");
    }
}
