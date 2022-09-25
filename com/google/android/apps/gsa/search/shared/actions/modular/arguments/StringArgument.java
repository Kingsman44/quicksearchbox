package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.common.base.C58837ba;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.p4152bb.p4153a.C55211jz;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55287mu;
import com.google.p4152bb.p4153a.C55290mx;

/* compiled from: PG */
public class StringArgument extends SingleValueArgument {
    public static final Parcelable.Creator CREATOR = new C87462z();

    /* renamed from: i */
    public int f236204i;

    private StringArgument(StringArgument stringArgument, int i) {
        super(stringArgument, (String) stringArgument.f236203n, i);
        this.f236204i = 1;
        this.f236204i = stringArgument.f236204i;
    }

    /* renamed from: c */
    public final C87429c mo81250c(C87449m mVar, C55134hc hcVar, Resources resources) {
        if (mo81263C()) {
            C55133hb a = C55133hb.m87600a(hcVar.f145123c);
            if (a == null) {
                a = C55133hb.NONE;
            }
            if (a == C55133hb.NONE) {
                return new C87429c((String) this.f236203n);
            }
        }
        return C87429c.f236122a;
    }

    /* renamed from: hB */
    public final boolean mo81260hB() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hz */
    public final /* synthetic */ void mo81261hz(Object obj) {
        this.f236203n = C58837ba.m90856e((String) obj);
    }

    /* renamed from: m */
    public final /* synthetic */ Argument mo81278m(int i) {
        return new StringArgument(this, i);
    }

    /* renamed from: n */
    public final C55213ka mo81279n() {
        C55287mu muVar = (C55287mu) C55290mx.f145635e.createBuilder();
        if (mo81263C()) {
            String str = (String) this.f236203n;
            muVar.copyOnWrite();
            C55290mx mxVar = (C55290mx) muVar.instance;
            str.getClass();
            mxVar.f145638a |= 1;
            mxVar.f145639b = str;
        }
        int i = this.f236204i;
        muVar.copyOnWrite();
        C55290mx mxVar2 = (C55290mx) muVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            mxVar2.f145640c = i2;
            mxVar2.f145638a |= 2;
            C55211jz jzVar = (C55211jz) super.mo81279n().toBuilder();
            jzVar.mo58885m(C55290mx.f145636f, (C55290mx) muVar.build());
            return (C55213ka) jzVar.build();
        }
        throw null;
    }

    /* renamed from: p */
    public final Object mo81281p(C87440d dVar) {
        return dVar.mo81367n();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(mo81279n(), parcel);
    }

    public StringArgument(StringArgument stringArgument, String str) {
        super(stringArgument, str, stringArgument.f236140a);
        this.f236204i = 1;
        this.f236204i = stringArgument.f236204i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StringArgument(com.google.p4152bb.p4153a.C55213ka r4) {
        /*
            r3 = this;
            com.google.protobuf.bt r0 = com.google.p4152bb.p4153a.C55290mx.f145636f
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
            com.google.bb.a.mx r0 = (com.google.p4152bb.p4153a.C55290mx) r0
            java.lang.String r0 = r0.f145639b
            r3.<init>(r4, r0)
            r0 = 1
            r3.f236204i = r0
            com.google.protobuf.bt r1 = com.google.p4152bb.p4153a.C55290mx.f145636f
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r4.mo58887l(r1)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r2 = r1.f169971d
            java.lang.Object r4 = r4.mo58854l(r2)
            if (r4 != 0) goto L_0x003a
            java.lang.Object r4 = r1.f169969b
            goto L_0x003e
        L_0x003a:
            java.lang.Object r4 = r1.mo58889c(r4)
        L_0x003e:
            com.google.bb.a.mx r4 = (com.google.p4152bb.p4153a.C55290mx) r4
            int r4 = r4.f145640c
            int r4 = com.google.p4152bb.p4153a.C55289mw.m87654a(r4)
            if (r4 != 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r4
        L_0x004a:
            r3.f236204i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.modular.arguments.StringArgument.<init>(com.google.bb.a.ka):void");
    }
}
