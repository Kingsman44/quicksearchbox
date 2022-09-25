package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55197jl;
import com.google.p4152bb.p4153a.C55198jm;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55291my;
import com.google.p4152bb.p4153a.C55292mz;
import com.google.p4152bb.p4153a.C55295nb;
import com.google.p4152bb.p4153a.C55296nc;
import com.google.p4152bb.p4153a.C55374q;
import com.google.p4152bb.p4153a.C55401r;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class TimeDurationArgument extends AbsoluteTimeArgument {
    public static final Parcelable.Creator CREATOR = new C87434ab();

    /* renamed from: i */
    private final int f236205i;

    /* renamed from: j */
    private final C55198jm f236206j;

    private TimeDurationArgument(TimeDurationArgument timeDurationArgument, int i) {
        super(timeDurationArgument, (Long) timeDurationArgument.f236203n, i);
        this.f236205i = timeDurationArgument.f236205i;
        this.f236206j = timeDurationArgument.f236206j;
    }

    /* renamed from: O */
    private final TimeOfDayArgument m141859O() {
        C58838bb.m90883r(m141860Q());
        return (TimeOfDayArgument) this.f236144e.mo81211R(this.f236205i);
    }

    /* renamed from: Q */
    private final boolean m141860Q() {
        int i = this.f236205i;
        return i != -1 && (this.f236144e.mo81211R(i) instanceof TimeOfDayArgument);
    }

    /* renamed from: C */
    public final boolean mo81263C() {
        if (super.mo81263C()) {
            return !m141860Q() || m141859O().mo81263C();
        }
        return false;
    }

    /* renamed from: M */
    public final long mo81336M() {
        C58838bb.m90883r(mo81263C());
        return TimeUnit.MILLISECONDS.toSeconds(((Long) this.f236203n).longValue());
    }

    /* renamed from: N */
    public final boolean mo81337N() {
        C55198jm jmVar = this.f236206j;
        if (jmVar == null) {
            return false;
        }
        int a = C55197jl.m87621a(jmVar.f145282a);
        return (a == 0 || a == 2) && m141860Q();
    }

    /* renamed from: a */
    public final long mo81248a() {
        boolean z = false;
        if (mo81263C() && m141860Q()) {
            z = true;
        }
        C58838bb.m90883r(z);
        TimeOfDayArgument O = m141859O();
        C58838bb.m90883r(O.mo81343R());
        return O.mo81248a() + ((Long) this.f236203n).longValue();
    }

    /* renamed from: b */
    public final long mo81249b(C55401r rVar) {
        return mo81248a();
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        if (mo81263C()) {
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            if (a == C55133hb.TIME_DURATION_SECONDS) {
                return new C87429c(TimeUnit.MILLISECONDS.toSeconds(((Long) this.f236203n).longValue()));
            }
            C55133hb a2 = C55133hb.m87600a(hcVar.f145123c);
            if (a2 == null) {
                a2 = C55133hb.NONE;
            }
            if (a2 == C55133hb.FORMATTED_TIME_DURATION) {
                return new C87429c(C89407a.m145420c(resources, mo81336M(), false));
            }
            if (m141860Q()) {
                TimeOfDayArgument O = m141859O();
                if (O.mo81263C() && O.mo81343R()) {
                    return super.mo81250c(mVar, hcVar, resources);
                }
            }
        }
        return C87429c.f236122a;
    }

    /* renamed from: d */
    public final C55296nc mo81251d() {
        boolean z = false;
        if (mo81263C() && m141860Q()) {
            z = true;
        }
        C58838bb.m90883r(z);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(mo81248a());
        C55295nb nbVar = (C55295nb) C55296nc.f145663e.createBuilder();
        C55374q qVar = (C55374q) C55401r.f145976e.createBuilder();
        int i = instance.get(11);
        qVar.copyOnWrite();
        C55401r rVar = (C55401r) qVar.instance;
        rVar.f145978a |= 1;
        rVar.f145979b = i;
        int i2 = instance.get(12);
        qVar.copyOnWrite();
        C55401r rVar2 = (C55401r) qVar.instance;
        rVar2.f145978a |= 2;
        rVar2.f145980c = i2;
        int i3 = instance.get(13);
        qVar.copyOnWrite();
        C55401r rVar3 = (C55401r) qVar.instance;
        rVar3.f145978a |= 4;
        rVar3.f145981d = i3;
        nbVar.copyOnWrite();
        C55296nc ncVar = (C55296nc) nbVar.instance;
        C55401r rVar4 = (C55401r) qVar.build();
        rVar4.getClass();
        ncVar.f145666b = rVar4;
        ncVar.f145665a = 1 | ncVar.f145665a;
        return (C55296nc) nbVar.build();
    }

    /* renamed from: e */
    public final List mo81252e() {
        return C58485gu.m89845m();
    }

    /* renamed from: f */
    public final void mo81253f(C55296nc ncVar) {
        boolean z = true;
        if (1 != (ncVar.f145665a & 1)) {
            z = false;
        }
        C58838bb.m90868c(z);
        C58838bb.m90883r(m141860Q());
        long a = m141859O().mo81248a();
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(a);
        C55401r rVar = ncVar.f145666b;
        if (rVar == null) {
            rVar = C55401r.f145976e;
        }
        instance.set(11, rVar.f145979b);
        C55401r rVar2 = ncVar.f145666b;
        if (rVar2 == null) {
            rVar2 = C55401r.f145976e;
        }
        instance.set(12, rVar2.f145980c);
        mo81334P(Long.valueOf(instance.getTimeInMillis() - a));
    }

    /* renamed from: g */
    public final boolean mo81254g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo81255h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hA */
    public final boolean mo81259hA(Argument argument) {
        if (!(argument instanceof TimeDurationArgument)) {
            return false;
        }
        TimeDurationArgument timeDurationArgument = (TimeDurationArgument) argument;
        if (!mo81263C() || !m141860Q()) {
            return super.mo81259hA(argument);
        }
        if (!timeDurationArgument.mo81263C() || !timeDurationArgument.m141860Q() || mo81248a() != timeDurationArgument.mo81248a()) {
            return false;
        }
        return true;
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo81256i() {
        C58838bb.m90883r(m141860Q());
        return m141859O().mo81263C() && m141859O().mo81343R();
    }

    /* renamed from: m */
    public final /* synthetic */ Argument mo81278m(int i) {
        return new TimeDurationArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55291my myVar = (C55291my) C55292mz.f145643e.createBuilder();
        if (mo81263C()) {
            long longValue = ((Long) this.f236203n).longValue();
            myVar.copyOnWrite();
            C55292mz mzVar = (C55292mz) myVar.instance;
            mzVar.f145646a |= 1;
            mzVar.f145647b = longValue;
        }
        int i = this.f236205i;
        if (i != -1) {
            myVar.copyOnWrite();
            C55292mz mzVar2 = (C55292mz) myVar.instance;
            mzVar2.f145646a |= 2;
            mzVar2.f145648c = i;
        }
        C55198jm jmVar = this.f236206j;
        myVar.copyOnWrite();
        C55292mz mzVar3 = (C55292mz) myVar.instance;
        jmVar.getClass();
        mzVar3.f145649d = jmVar;
        mzVar3.f145646a |= 16;
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        jzVar.mo58885m(C55292mz.f145644f, (C55292mz) myVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81363j(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
    }

    /* renamed from: y */
    public final void mo81290y(ModularAction modularAction) {
        super.mo81290y(modularAction);
        if (m141860Q()) {
            m141859O().mo81270J(new C87433aa(this));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TimeDurationArgument(com.google.p4152bb.p4153a.C55213ka r4) {
        /*
            r3 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55292mz.f145644f
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
            com.google.bb.a.mz r0 = (com.google.p4152bb.p4153a.C55292mz) r0
            int r1 = r0.f145646a
            r1 = r1 & 1
            if (r1 == 0) goto L_0x0029
            long r1 = r0.f145647b
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            r3.<init>(r4, r1)
            int r4 = r0.f145646a
            r4 = r4 & 2
            if (r4 == 0) goto L_0x0036
            int r4 = r0.f145648c
            goto L_0x0037
        L_0x0036:
            r4 = -1
        L_0x0037:
            r3.f236205i = r4
            com.google.bb.a.jm r4 = r0.f145649d
            if (r4 != 0) goto L_0x003f
            com.google.bb.a.jm r4 = com.google.p4152bb.p4153a.C55198jm.f145280b
        L_0x003f:
            r3.f236206j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument.<init>(com.google.bb.a.ka):void");
    }
}
