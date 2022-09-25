package com.google.android.apps.gsa.staticplugins.nowcards.p8100a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.ViewGroup;
import androidx.core.p097i.C1970e;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.sidekick.shared.util.C91988g;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104310al;
import com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104912aj;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9216cy;
import com.google.android.apps.p489g.p494d.C9217cz;
import com.google.android.apps.p489g.p494d.C9223de;
import com.google.android.apps.p489g.p494d.C9224df;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7798ki;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7870n;
import com.google.p375ai.p378b.C7971qt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.a.b */
/* compiled from: PG */
public final class C104234b extends C104310al {

    /* renamed from: j */
    private static final C58495hd f289910j = C58495hd.m89900n(43, Integer.valueOf(R.drawable.ic_reminder));

    /* renamed from: k */
    private final C104912aj f289911k;

    /* renamed from: l */
    private final boolean f289912l;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104234b(com.google.p375ai.p378b.C7718hj r9, com.google.p375ai.p378b.C7718hj[] r10, com.google.android.sidekick.shared.remoteapi.CardRenderingContext r11, com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a r12, com.google.android.apps.gsa.staticplugins.nowcards.p8117g.C104912aj r13, com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj r14, boolean r15) {
        /*
            r8 = this;
            com.google.ai.b.n r0 = r9.f26945Q
            if (r0 != 0) goto L_0x0006
            com.google.ai.b.n r0 = com.google.p375ai.p378b.C7870n.f27557f
        L_0x0006:
            int r1 = r0.f27559a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0010
            int r0 = r0.f27562d
            r6 = r0
            goto L_0x0012
        L_0x0010:
            r0 = -1
            r6 = -1
        L_0x0012:
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f289911k = r13
            r8.f289912l = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8100a.C104234b.<init>(com.google.ai.b.hj, com.google.ai.b.hj[], com.google.android.sidekick.shared.remoteapi.CardRenderingContext, com.google.android.apps.gsa.shared.au.b.a, com.google.android.apps.gsa.staticplugins.nowcards.g.aj, com.google.android.apps.gsa.staticplugins.nowcards.base.aj, boolean):void");
    }

    /* renamed from: B */
    private final C9278v m172204B(Context context) {
        C7971qt qtVar;
        C9141ad adVar;
        String str;
        C7708h c = C91978bb.m150937c(this.f290132c, C7681g.LIST_CARD_SHOW_MORE, new C7681g[0]);
        if (c == null) {
            return null;
        }
        C7870n nVar = this.f290132c.f26945Q;
        if (nVar == null) {
            nVar = C7870n.f27557f;
        }
        if ((nVar.f27559a & 8) != 0) {
            C7870n nVar2 = this.f290132c.f26945Q;
            if (nVar2 == null) {
                nVar2 = C7870n.f27557f;
            }
            qtVar = nVar2.f27563e;
            if (qtVar == null) {
                qtVar = C7971qt.f27997c;
            }
        } else {
            qtVar = null;
        }
        C7718hj hjVar = this.f290132c;
        boolean z = this.f289912l;
        if ((c.f26896a & 64) != 0) {
            C7681g a = C7681g.m22802a(c.f26897b);
            if (a == null) {
                a = C7681g.INVALID;
            }
            if (z) {
                C7799kj kjVar = c.f26903h;
                if (kjVar == null) {
                    kjVar = C7799kj.f27263h;
                }
                int a2 = C7798ki.m22853a(kjVar.f27266b);
                if (a2 != 0 && a2 == 16) {
                    adVar = C91988g.m150970g(new Intent().setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.zerostate.hubs.AgendaHubActivity").setFlags(0).putExtras(new Bundle(0)), a);
                }
            }
            C9223de deVar = (C9223de) C9224df.f31879l.createBuilder();
            deVar.copyOnWrite();
            C9224df dfVar = (C9224df) deVar.instance;
            dfVar.f31881a |= 32;
            dfVar.f31888h = true;
            adVar = C91988g.m150969f(c, (C9224df) deVar.build(), qtVar, a, R.drawable.quantum_ic_arrow_forward_white_24);
        } else {
            adVar = null;
        }
        if (adVar == null) {
            return null;
        }
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C9277u uVar = C9277u.PRIMARY_ACTION;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32196c = uVar.f32164ay;
        vVar.f32192a |= 1;
        C9216cy cyVar = (C9216cy) C9217cz.f31853i.createBuilder();
        if ((c.f26896a & 2) != 0) {
            str = c.f26898c;
        } else {
            str = context.getString(R.string.show_full_agenda);
        }
        cyVar.copyOnWrite();
        C9217cz czVar = (C9217cz) cyVar.instance;
        str.getClass();
        czVar.f31855a |= 1;
        czVar.f31856b = str;
        qVar.copyOnWrite();
        C9278v vVar2 = (C9278v) qVar.instance;
        C9217cz czVar2 = (C9217cz) cyVar.build();
        czVar2.getClass();
        vVar2.f32198e = czVar2;
        vVar2.f32192a |= 4;
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        vVar3.f32169C = adVar;
        vVar3.f32192a |= 67108864;
        qVar.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar.instance;
        hjVar.getClass();
        vVar4.f32174H = hjVar;
        vVar4.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        return (C9278v) qVar.build();
    }

    /* renamed from: p */
    public final ViewGroup mo86101p() {
        boolean z = this.f290136g.f290146b;
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C9278v mo94010u(Context context) {
        C9278v u = super.mo94010u(context);
        if (u == null) {
            return null;
        }
        return u;
    }

    /* renamed from: v */
    public final C9278v mo94011v(Context context, List list) {
        if (this.f290136g.f290146b) {
            return m172204B(context);
        }
        return this.f290164i.mo94088c(context, list);
    }

    /* renamed from: w */
    public final C9278v mo94012w(Context context) {
        if (!this.f290136g.f290146b) {
            return m172204B(context);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9278v mo94013x(android.content.Context r10, com.google.p375ai.p378b.C7718hj r11) {
        /*
            r9 = this;
            int r0 = r11.f26955a
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L_0x000f
            com.google.ai.b.an r0 = r11.f26937I
            if (r0 != 0) goto L_0x0010
            com.google.ai.b.an r0 = com.google.p375ai.p378b.C7526an.f26049l
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            int r2 = r11.f26955a
            r3 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r3
            r3 = 1
            if (r2 == 0) goto L_0x0042
            com.google.android.apps.gsa.staticplugins.nowcards.g.aj r2 = r9.f289911k
            com.google.ai.b.lr r4 = r11.f26984y
            if (r4 != 0) goto L_0x0020
            com.google.ai.b.lr r4 = com.google.p375ai.p378b.C7834lr.f27467c
        L_0x0020:
            com.google.android.sidekick.shared.remoteapi.CardRenderingContext r5 = r9.f290131b
            com.google.android.apps.gsa.staticplugins.nowcards.g.ak r2 = r2.mo94392a(r11, r4, r5)
            com.google.android.apps.g.d.v r2 = r2.mo94013x(r10, r11)
            if (r2 == 0) goto L_0x0042
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.android.apps.g.d.q r2 = (com.google.android.apps.p489g.p494d.C9273q) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            r4.f32178L = r3
            int r5 = r4.f32195b
            r5 = r5 | 8
            r4.f32195b = r5
            goto L_0x0043
        L_0x0042:
            r2 = r1
        L_0x0043:
            if (r2 != 0) goto L_0x0046
            return r1
        L_0x0046:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.g.d.v r4 = (com.google.android.apps.p489g.p494d.C9278v) r4
            com.google.android.apps.g.d.v r5 = com.google.android.apps.p489g.p494d.C9278v.f32165Z
            r11.getClass()
            r4.f32174H = r11
            int r5 = r4.f32192a
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 | r6
            r4.f32192a = r5
            int r4 = r11.f26966g
            com.google.ai.b.ik r4 = com.google.p375ai.p378b.C7746ik.m22834a(r4)
            if (r4 != 0) goto L_0x0065
            com.google.ai.b.ik r4 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x0065:
            com.google.ai.b.g r5 = com.google.p375ai.p378b.C7681g.DETAILS
            com.google.common.b.hd r6 = f289910j
            int r7 = r4.f27108J
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r6.containsKey(r7)
            r8 = 0
            if (r7 == 0) goto L_0x0087
            int r7 = r4.f27108J
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r6.get(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L_0x0088
        L_0x0087:
            r6 = 0
        L_0x0088:
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r0 == 0) goto L_0x00a2
            com.google.android.apps.g.d.ad r10 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150966c(r0, r5, r6)
            if (r10 == 0) goto L_0x011c
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.android.apps.g.d.v r11 = (com.google.android.apps.p489g.p494d.C9278v) r11
            r11.f32169C = r10
            int r10 = r11.f32192a
            r10 = r10 | r7
            r11.f32192a = r10
            goto L_0x011c
        L_0x00a2:
            com.google.ai.b.ik r0 = com.google.p375ai.p378b.C7746ik.REMINDER
            if (r4 != r0) goto L_0x00be
            com.google.android.apps.g.d.ac r10 = com.google.android.apps.p489g.p494d.C9140ac.REMINDER_EDIT
            com.google.android.apps.g.d.ad r10 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150965b(r10, r5, r6)
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.android.apps.g.d.v r11 = (com.google.android.apps.p489g.p494d.C9278v) r11
            r10.getClass()
            r11.f32169C = r10
            int r10 = r11.f32192a
            r10 = r10 | r7
            r11.f32192a = r10
            goto L_0x011c
        L_0x00be:
            com.google.ai.b.g r0 = com.google.p375ai.p378b.C7681g.DETAILS
            com.google.ai.b.g[] r4 = new com.google.p375ai.p378b.C7681g[r8]
            com.google.ai.b.h r11 = com.google.android.apps.gsa.sidekick.shared.util.C91978bb.m150937c(r11, r0, r4)
            if (r11 == 0) goto L_0x0123
            int r0 = r11.f26896a
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0123
            com.google.android.apps.g.d.df r0 = com.google.android.apps.p489g.p494d.C9224df.f31879l
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.g.d.de r0 = (com.google.android.apps.p489g.p494d.C9223de) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.g.d.df r4 = (com.google.android.apps.p489g.p494d.C9224df) r4
            int r8 = r4.f31881a
            r8 = r8 | 32
            r4.f31881a = r8
            r4.f31888h = r3
            java.lang.String r10 = r9.mo94014y(r10)
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L_0x0101
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.g.d.df r3 = (com.google.android.apps.p489g.p494d.C9224df) r3
            r10.getClass()
            int r4 = r3.f31881a
            r4 = r4 | 2
            r3.f31881a = r4
            r3.f31883c = r10
        L_0x0101:
            com.google.protobuf.bv r10 = r0.build()
            com.google.android.apps.g.d.df r10 = (com.google.android.apps.p489g.p494d.C9224df) r10
            com.google.android.apps.g.d.ad r10 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150969f(r11, r10, r1, r5, r6)
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.android.apps.g.d.v r11 = (com.google.android.apps.p489g.p494d.C9278v) r11
            r10.getClass()
            r11.f32169C = r10
            int r10 = r11.f32192a
            r10 = r10 | r7
            r11.f32192a = r10
        L_0x011c:
            com.google.protobuf.bv r10 = r2.build()
            com.google.android.apps.g.d.v r10 = (com.google.android.apps.p489g.p494d.C9278v) r10
            return r10
        L_0x0123:
            com.google.protobuf.bv r10 = r2.build()
            com.google.android.apps.g.d.v r10 = (com.google.android.apps.p489g.p494d.C9278v) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8100a.C104234b.mo94013x(android.content.Context, com.google.ai.b.hj):com.google.android.apps.g.d.v");
    }

    /* renamed from: y */
    public final String mo94014y(Context context) {
        Object obj;
        C1970e c = mo86081c();
        if (c == null || (obj = c.f5888a) == null) {
            return null;
        }
        C7718hj hjVar = (C7718hj) obj;
        if ((hjVar.f26961b & 256) == 0) {
            return null;
        }
        C7870n nVar = hjVar.f26945Q;
        if (nVar == null) {
            nVar = C7870n.f27557f;
        }
        return nVar.f27560b;
    }

    /* renamed from: z */
    public final String mo94015z() {
        Object obj;
        C1970e c = mo86081c();
        if (!(c == null || (obj = c.f5888a) == null)) {
            C7870n nVar = ((C7718hj) obj).f26945Q;
            if (nVar == null) {
                nVar = C7870n.f27557f;
            }
            if ((nVar.f27559a & 2) != 0) {
                return nVar.f27561c;
            }
        }
        return null;
    }
}
