package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.C90769bm;
import com.google.p4152bb.p4153a.C55005ci;
import com.google.p4152bb.p4153a.C55020cx;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55222kj;
import com.google.p4152bb.p4153a.C55223kk;
import com.google.p4152bb.p4153a.C55224kl;
import com.google.p4152bb.p4153a.C55225km;
import com.google.p4152bb.p4153a.C55320o;
import com.google.p4152bb.p4153a.C55347p;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import java.util.Calendar;
import java.util.List;

/* compiled from: PG */
public class DateArgument extends SingleValueArgument {
    public static final Parcelable.Creator CREATOR = new C87442f();

    /* renamed from: i */
    private final List f236154i;

    public DateArgument(DateArgument dateArgument, int i) {
        super(dateArgument, (C55347p) dateArgument.f236203n, i);
        this.f236154i = dateArgument.f236154i;
    }

    /* renamed from: C */
    public final boolean mo81263C() {
        if (super.mo81263C()) {
            int i = ((C55347p) this.f236203n).f145826a;
            return ((i & 4) == 0 || (i & 2) == 0 || (i & 1) == 0) ? false : true;
        }
    }

    /* renamed from: a */
    public final Calendar mo81293a() {
        Calendar instance = Calendar.getInstance();
        if (mo81263C()) {
            C55347p pVar = (C55347p) this.f236203n;
            instance.set(pVar.f145827b, pVar.f145828c - 1, pVar.f145829d);
        }
        return instance;
    }

    /* renamed from: b */
    public final void mo81294b(int i, int i2, int i3) {
        C55320o oVar = (C55320o) C55347p.f145824e.createBuilder();
        oVar.copyOnWrite();
        C55347p pVar = (C55347p) oVar.instance;
        pVar.f145826a |= 4;
        pVar.f145829d = i;
        oVar.copyOnWrite();
        C55347p pVar2 = (C55347p) oVar.instance;
        pVar2.f145826a |= 2;
        pVar2.f145828c = i2;
        oVar.copyOnWrite();
        C55347p pVar3 = (C55347p) oVar.instance;
        pVar3.f145826a |= 1;
        pVar3.f145827b = i3;
        mo81334P((C55347p) oVar.build());
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        return C87429c.f236122a;
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* renamed from: j */
    public final int mo81275j() {
        Object obj;
        if (!mo81263C()) {
            return 1;
        }
        for (C55005ci ciVar : this.f236146g) {
            C62940bt r2 = C62942bv.checkIsLite(C55020cx.f144753d);
            ciVar.mo58887l(r2);
            Object l = ciVar.f169962ag.mo58854l(r2.f169971d);
            if (l == null) {
                obj = r2.f169969b;
            } else {
                obj = r2.mo58889c(l);
            }
            if (((C55020cx) obj).f144755a) {
                long timeInMillis = mo81293a().getTimeInMillis();
                return (C90769bm.m148270b(timeInMillis, System.currentTimeMillis()) || timeInMillis > System.currentTimeMillis()) ? 0 : 1;
            }
        }
        return 0;
    }

    /* renamed from: m */
    public final /* synthetic */ Argument mo81278m(int i) {
        return new DateArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55222kj kjVar = (C55222kj) C55225km.f145400e.createBuilder();
        List list = this.f236154i;
        kjVar.copyOnWrite();
        C55225km kmVar = (C55225km) kjVar.instance;
        kmVar.mo54208a();
        C62947c.addAll((Iterable) list, (List) kmVar.f145406d);
        C55347p pVar = (C55347p) this.f236203n;
        if (mo81263C() && pVar != null) {
            C55223kk kkVar = (C55223kk) C55224kl.f145394d.createBuilder();
            kkVar.copyOnWrite();
            C55224kl klVar = (C55224kl) kkVar.instance;
            klVar.f145397b = pVar;
            klVar.f145396a |= 1;
            kjVar.copyOnWrite();
            C55225km kmVar2 = (C55225km) kjVar.instance;
            C55224kl klVar2 = (C55224kl) kkVar.build();
            klVar2.getClass();
            kmVar2.f145405c = klVar2;
            kmVar2.f145403a |= 2;
            kjVar.copyOnWrite();
            C55225km kmVar3 = (C55225km) kjVar.instance;
            kmVar3.f145404b = pVar;
            kmVar3.f145403a |= 1;
        }
        C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
        jzVar.mo58885m(C55225km.f145401f, (C55225km) kjVar.build());
        return (C55213ka) jzVar.build();
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81354a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DateArgument(com.google.p4152bb.p4153a.C55213ka r4) {
        /*
            r3 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55225km.f145401f
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
            com.google.bb.a.km r0 = (com.google.p4152bb.p4153a.C55225km) r0
            int r0 = r0.f145403a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x004b
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55225km.f145401f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r1 = r4.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0038
            java.lang.Object r0 = r0.f169969b
            goto L_0x003c
        L_0x0038:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x003c:
            com.google.bb.a.km r0 = (com.google.p4152bb.p4153a.C55225km) r0
            com.google.bb.a.kl r0 = r0.f145405c
            if (r0 != 0) goto L_0x0044
            com.google.bb.a.kl r0 = com.google.p4152bb.p4153a.C55224kl.f145394d
        L_0x0044:
            com.google.bb.a.p r0 = r0.f145397b
            if (r0 != 0) goto L_0x006d
            com.google.bb.a.p r0 = com.google.p4152bb.p4153a.C55347p.f145824e
            goto L_0x006d
        L_0x004b:
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55225km.f145401f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r1 = r4.f169962ag
            com.google.protobuf.bs r2 = r0.f169971d
            java.lang.Object r1 = r1.mo58854l(r2)
            if (r1 != 0) goto L_0x0061
            java.lang.Object r0 = r0.f169969b
            goto L_0x0065
        L_0x0061:
            java.lang.Object r0 = r0.mo58889c(r1)
        L_0x0065:
            com.google.bb.a.km r0 = (com.google.p4152bb.p4153a.C55225km) r0
            com.google.bb.a.p r0 = r0.f145404b
            if (r0 != 0) goto L_0x006d
            com.google.bb.a.p r0 = com.google.p4152bb.p4153a.C55347p.f145824e
        L_0x006d:
            r3.<init>(r4, r0)
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55225km.f145401f
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r4.mo58887l(r0)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r1 = r0.f169971d
            java.lang.Object r4 = r4.mo58854l(r1)
            if (r4 != 0) goto L_0x0086
            java.lang.Object r4 = r0.f169969b
            goto L_0x008a
        L_0x0086:
            java.lang.Object r4 = r0.mo58889c(r4)
        L_0x008a:
            com.google.bb.a.km r4 = (com.google.p4152bb.p4153a.C55225km) r4
            com.google.protobuf.cq r4 = r4.f145406d
            r3.f236154i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.DateArgument.<init>(com.google.bb.a.ka):void");
    }
}
