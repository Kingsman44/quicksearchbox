package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.C90769bm;
import com.google.common.base.C58838bb;
import com.google.p4152bb.p4153a.C55005ci;
import com.google.p4152bb.p4153a.C55020cx;
import com.google.p4152bb.p4153a.C55200jo;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55294na;
import com.google.p4152bb.p4153a.C55296nc;
import com.google.p4152bb.p4153a.C55297nd;
import com.google.p4152bb.p4153a.C55401r;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class TimeOfDayArgument extends AbsoluteTimeArgument {
    public static final Parcelable.Creator CREATOR = new C87436ad();

    /* renamed from: i */
    public final C55200jo f236207i;

    /* renamed from: j */
    public boolean f236208j;

    /* renamed from: k */
    private final List f236209k;

    /* renamed from: l */
    private final int f236210l;

    private TimeOfDayArgument(TimeOfDayArgument timeOfDayArgument, int i) {
        super(timeOfDayArgument, (C55296nc) timeOfDayArgument.f236203n, i);
        this.f236208j = false;
        this.f236209k = timeOfDayArgument.f236209k;
        this.f236207i = timeOfDayArgument.f236207i;
        this.f236210l = timeOfDayArgument.f236210l;
    }

    /* renamed from: B */
    public final boolean mo81262B() {
        return mo81340N() && mo81339M().mo81275j() == 1;
    }

    /* renamed from: C */
    public final boolean mo81263C() {
        if (!super.mo81263C()) {
            return false;
        }
        int i = ((C55296nc) this.f236203n).f145665a;
        return ((i & 1) == 0 && (i & 2) == 0) ? false : true;
    }

    /* renamed from: F */
    public final boolean mo81266F(C55005ci ciVar) {
        Object obj;
        if (ciVar == null) {
            return true;
        }
        C62940bt r1 = C62942bv.checkIsLite(C55020cx.f144753d);
        ciVar.mo58887l(r1);
        if (!ciVar.f169962ag.mo58857o(r1.f169971d)) {
            return super.mo81266F(ciVar);
        }
        if (!this.f236208j) {
            C62940bt r12 = C62942bv.checkIsLite(C55020cx.f144753d);
            ciVar.mo58887l(r12);
            Object l = ciVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l);
            }
            if (((C55020cx) obj).f144755a && mo81275j() != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: M */
    public final DateArgument mo81339M() {
        C58838bb.m90883r(mo81340N());
        return (DateArgument) this.f236144e.mo81211R(this.f236210l);
    }

    /* renamed from: N */
    public final boolean mo81340N() {
        int i = this.f236210l;
        return i != -1 && (this.f236144e.mo81211R(i) instanceof DateArgument);
    }

    /* renamed from: O */
    public final boolean mo81341O() {
        return mo81340N() && mo81339M().mo81263C();
    }

    /* renamed from: Q */
    public final boolean mo81342Q() {
        Object obj;
        if (!this.f236208j) {
            for (C55005ci ciVar : this.f236146g) {
                C62940bt r3 = C62942bv.checkIsLite(C55020cx.f144753d);
                ciVar.mo58887l(r3);
                Object l = ciVar.f169962ag.mo58854l(r3.f169971d);
                if (l == null) {
                    obj = r3.f169969b;
                } else {
                    obj = r3.mo58889c(l);
                }
                if (((C55020cx) obj).f144755a) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: R */
    public final boolean mo81343R() {
        return super.mo81263C() && (((C55296nc) this.f236203n).f145665a & 1) != 0;
    }

    /* renamed from: a */
    public final long mo81248a() {
        C58838bb.m90884s(mo81343R(), "Cannot get time in ms for symbolic time.");
        C55401r rVar = ((C55296nc) this.f236203n).f145666b;
        if (rVar == null) {
            rVar = C55401r.f145976e;
        }
        return mo81249b(rVar);
    }

    /* renamed from: b */
    public final long mo81249b(C55401r rVar) {
        Calendar calendar;
        if (mo81341O()) {
            calendar = mo81339M().mo81293a();
        } else {
            calendar = Calendar.getInstance();
        }
        calendar.set(13, rVar.f145981d);
        calendar.set(12, rVar.f145980c);
        calendar.set(11, rVar.f145979b);
        return calendar.getTimeInMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r0 == 3) goto L_0x003b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c mo81250c(com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m r3, com.google.p4152bb.p4153a.C55134hc r4, android.content.res.Resources r5) {
        /*
            r2 = this;
            boolean r0 = r2.mo81343R()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r2.f236203n
            com.google.bb.a.nc r0 = (com.google.p4152bb.p4153a.C55296nc) r0
            com.google.bb.a.r r0 = r0.f145666b
            if (r0 != 0) goto L_0x0010
            com.google.bb.a.r r0 = com.google.p4152bb.p4153a.C55401r.f145976e
        L_0x0010:
            com.google.bb.a.hb r1 = com.google.p4152bb.p4153a.C55133hb.NONE
            int r1 = r4.f145123c
            com.google.bb.a.hb r1 = com.google.p4152bb.p4153a.C55133hb.m87600a(r1)
            if (r1 != 0) goto L_0x001c
            com.google.bb.a.hb r1 = com.google.p4152bb.p4153a.C55133hb.NONE
        L_0x001c:
            int r1 = r1.ordinal()
            switch(r1) {
                case 32: goto L_0x0048;
                case 33: goto L_0x0040;
                case 34: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0050
        L_0x0024:
            boolean r0 = r2.mo81341O()
            if (r0 != 0) goto L_0x003b
            com.google.bb.a.gy r0 = r4.f145128h
            if (r0 != 0) goto L_0x0030
            com.google.bb.a.gy r0 = com.google.p4152bb.p4153a.C55129gy.f145067c
        L_0x0030:
            int r0 = r0.f145069a
            int r0 = com.google.p4152bb.p4153a.C55126gv.m87598a(r0)
            if (r0 == 0) goto L_0x0050
            r1 = 3
            if (r0 != r1) goto L_0x0050
        L_0x003b:
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r3 = super.mo81250c(r3, r4, r5)
            return r3
        L_0x0040:
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r3 = new com.google.android.apps.gsa.search.shared.actions.modular.a.c
            int r4 = r0.f145980c
            r3.<init>((int) r4)
            return r3
        L_0x0048:
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r3 = new com.google.android.apps.gsa.search.shared.actions.modular.a.c
            int r4 = r0.f145979b
            r3.<init>((int) r4)
            return r3
        L_0x0050:
            boolean r0 = r2.mo81341O()
            if (r0 == 0) goto L_0x005b
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r3 = super.mo81250c(r3, r4, r5)
            return r3
        L_0x005b:
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r3 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c.f236122a
            return r3
        L_0x005e:
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r3 = r2.f236144e
            com.google.android.apps.gsa.search.shared.actions.modular.b r3 = r3.mo81210Q()
            com.google.bb.a.ka r4 = r2.mo81279n()
            r5 = 0
            java.lang.String r0 = "TimeOfDayArguments do not support transformations without a local time."
            r3.mo81395a(r0, r4, r5)
            com.google.android.apps.gsa.search.shared.actions.modular.a.c r3 = com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c.f236122a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument.mo81250c(com.google.android.apps.gsa.search.shared.actions.modular.arguments.m, com.google.bb.a.hc, android.content.res.Resources):com.google.android.apps.gsa.search.shared.actions.modular.a.c");
    }

    /* renamed from: d */
    public final C55296nc mo81251d() {
        return (C55296nc) this.f236203n;
    }

    /* renamed from: e */
    public final List mo81252e() {
        return this.f236209k;
    }

    /* renamed from: f */
    public final void mo81253f(C55296nc ncVar) {
        mo81334P(ncVar);
    }

    /* renamed from: g */
    public final boolean mo81254g() {
        return !this.f236209k.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = com.google.p4152bb.p4153a.C55194ji.m87620a(r0.f145287b);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo81255h() {
        /*
            r2 = this;
            com.google.bb.a.jo r0 = r2.f236207i
            if (r0 == 0) goto L_0x0012
            int r0 = r0.f145287b
            int r0 = com.google.p4152bb.p4153a.C55194ji.m87620a(r0)
            if (r0 != 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            r1 = 2
            if (r0 != r1) goto L_0x0012
            r0 = 1
            return r0
        L_0x0012:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument.mo81255h():boolean");
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo81256i() {
        return true;
    }

    /* renamed from: j */
    public final int mo81275j() {
        int i;
        Object obj;
        if (super.mo81263C() && mo81342Q() && mo81343R() && C90769bm.m148269a(mo81248a())) {
            return 1;
        }
        if (super.mo81263C() && mo81343R() && !C90769bm.m148269a(mo81248a())) {
            long a = mo81248a() - System.currentTimeMillis();
            Iterator it = this.f236146g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = 0;
                    break;
                }
                C55005ci ciVar = (C55005ci) it.next();
                C62940bt r5 = C62942bv.checkIsLite(C55020cx.f144753d);
                ciVar.mo58887l(r5);
                Object l = ciVar.f169962ag.mo58854l(r5.f169971d);
                if (l == null) {
                    obj = r5.f169969b;
                } else {
                    obj = r5.mo58889c(l);
                }
                i = ((C55020cx) obj).f144756b;
                if (i != 0) {
                    break;
                }
            }
            if (a < ((long) i)) {
                return 5;
            }
        }
        return 0;
    }

    /* renamed from: m */
    public final /* synthetic */ Argument mo81278m(int i) {
        return new TimeOfDayArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55294na naVar = (C55294na) C55297nd.f145670f.createBuilder();
        C55296nc ncVar = (C55296nc) this.f236203n;
        naVar.copyOnWrite();
        C55297nd ndVar = (C55297nd) naVar.instance;
        ncVar.getClass();
        ndVar.f145674b = ncVar;
        ndVar.f145673a |= 1;
        List list = this.f236209k;
        naVar.copyOnWrite();
        C55297nd ndVar2 = (C55297nd) naVar.instance;
        ndVar2.mo54234a();
        C62947c.addAll((Iterable) list, (List) ndVar2.f145675c);
        C55200jo joVar = this.f236207i;
        if (joVar != null) {
            naVar.copyOnWrite();
            C55297nd ndVar3 = (C55297nd) naVar.instance;
            ndVar3.f145677e = joVar;
            ndVar3.f145673a |= 4;
        }
        int i = this.f236210l;
        if (i != -1) {
            naVar.copyOnWrite();
            C55297nd ndVar4 = (C55297nd) naVar.instance;
            ndVar4.f145673a |= 2;
            ndVar4.f145676d = i;
        }
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        jzVar.mo58885m(C55297nd.f145671g, (C55297nd) naVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81364k(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
    }

    /* renamed from: y */
    public final void mo81290y(ModularAction modularAction) {
        super.mo81290y(modularAction);
        if (mo81340N()) {
            mo81339M().mo81270J(new C87435ac(this));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TimeOfDayArgument(com.google.p4152bb.p4153a.C55213ka r4) {
        /*
            r3 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55297nd.f145671g
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
            com.google.bb.a.nd r0 = (com.google.p4152bb.p4153a.C55297nd) r0
            com.google.bb.a.nc r0 = r0.f145674b
            if (r0 != 0) goto L_0x0022
            com.google.bb.a.nc r0 = com.google.p4152bb.p4153a.C55296nc.f145663e
        L_0x0022:
            r3.<init>(r4, r0)
            r0 = 0
            r3.f236208j = r0
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55297nd.f145671g
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r4 = r4.mo58854l(r1)
            if (r4 != 0) goto L_0x003e
            java.lang.Object r4 = r0.f169969b
            goto L_0x0042
        L_0x003e:
            java.lang.Object r4 = r0.mo58889c(r4)
        L_0x0042:
            com.google.bb.a.nd r4 = (com.google.p4152bb.p4153a.C55297nd) r4
            com.google.protobuf.cq r0 = r4.f145675c
            r3.f236209k = r0
            int r0 = r4.f145673a
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0055
            com.google.bb.a.jo r0 = r4.f145677e
            if (r0 != 0) goto L_0x0056
            com.google.bb.a.jo r0 = com.google.p4152bb.p4153a.C55200jo.f145284c
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            r3.f236207i = r0
            int r0 = r4.f145673a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0061
            int r4 = r4.f145676d
            goto L_0x0062
        L_0x0061:
            r4 = -1
        L_0x0062:
            r3.f236210l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeOfDayArgument.<init>(com.google.bb.a.ka):void");
    }
}
