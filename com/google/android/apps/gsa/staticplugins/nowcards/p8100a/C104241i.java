package com.google.android.apps.gsa.staticplugins.nowcards.p8100a;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.shared.util.C91962am;
import com.google.android.apps.gsa.sidekick.shared.util.C91975az;
import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.android.apps.gsa.sidekick.shared.util.C91985d;
import com.google.android.apps.gsa.sidekick.shared.util.C91988g;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104308aj;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104310al;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9196ce;
import com.google.android.apps.p489g.p494d.C9199ch;
import com.google.android.apps.p489g.p494d.C9216cy;
import com.google.android.apps.p489g.p494d.C9217cz;
import com.google.android.apps.p489g.p494d.C9269m;
import com.google.android.apps.p489g.p494d.C9270n;
import com.google.android.apps.p489g.p494d.C9273q;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7779jq;
import com.google.p375ai.p378b.C7947pw;
import com.google.p375ai.p378b.C8086v;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.a.i */
/* compiled from: PG */
public final class C104241i extends C104310al {
    public C104241i(C7718hj hjVar, CardRenderingContext cardRenderingContext, C89291a aVar, C104308aj ajVar) {
        super(hjVar, cardRenderingContext, aVar, ajVar);
    }

    /* renamed from: B */
    public static String m172221B(Context context, C7718hj hjVar, long j) {
        ArrayList arrayList = new ArrayList();
        C7947pw pwVar = hjVar.f26979t;
        if (pwVar == null) {
            pwVar = C7947pw.f27896j;
        }
        CharSequence a = C91975az.m150931a(context, pwVar, j);
        if (!TextUtils.isEmpty(a)) {
            arrayList.add(a);
        }
        if (!arrayList.isEmpty()) {
            return C91985d.m150958e(arrayList).toString();
        }
        return null;
    }

    /* renamed from: D */
    private static C9278v m172222D(C7718hj hjVar) {
        C7708h c = C91978bb.m150937c(hjVar, C7681g.LIST_CARD_SHOW_MORE, new C7681g[0]);
        if (c == null || (c.f26896a & 2) == 0) {
            return null;
        }
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C9277u uVar = C9277u.PRIMARY_ACTION;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32196c = uVar.f32164ay;
        vVar.f32192a |= 1;
        qVar.copyOnWrite();
        C9278v vVar2 = (C9278v) qVar.instance;
        hjVar.getClass();
        vVar2.f32174H = hjVar;
        vVar2.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        C9141ad g = C91988g.m150970g(C91962am.m150919a("com.google.android.googlequicksearchbox.MY_REMINDERS"), C7681g.LIST_CARD_SHOW_MORE);
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        g.getClass();
        vVar3.f32169C = g;
        vVar3.f32192a |= 67108864;
        C9216cy cyVar = (C9216cy) C9217cz.f31853i.createBuilder();
        String str = c.f26898c;
        cyVar.copyOnWrite();
        C9217cz czVar = (C9217cz) cyVar.instance;
        str.getClass();
        czVar.f31855a |= 1;
        czVar.f31856b = str;
        qVar.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar.instance;
        C9217cz czVar2 = (C9217cz) cyVar.build();
        czVar2.getClass();
        vVar4.f32198e = czVar2;
        vVar4.f32192a |= 4;
        return (C9278v) qVar.build();
    }

    /* renamed from: A */
    public final C7779jq mo94022A(C7718hj hjVar) {
        if ((hjVar.f26955a & 65536) == 0) {
            return null;
        }
        C7779jq jqVar = hjVar.f26980u;
        return jqVar == null ? C7779jq.f27232e : jqVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r7.contains(r4.f27290e) == false) goto L_0x005f;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.p489g.p494d.C9278v[] mo94023C(android.content.Context r7, com.google.p375ai.p378b.C7718hj r8) {
        /*
            r6 = this;
            com.google.ai.b.hj r0 = r6.mo94031b()
            if (r0 == 0) goto L_0x0008
            r7 = 0
            return r7
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.ai.b.pw r1 = r8.f26979t
            if (r1 != 0) goto L_0x0013
            com.google.ai.b.pw r1 = com.google.p375ai.p378b.C7947pw.f27896j
        L_0x0013:
            com.google.ai.b.g r2 = com.google.p375ai.p378b.C7681g.DETAILS
            com.google.android.apps.g.d.ac r3 = com.google.android.apps.p489g.p494d.C9140ac.REMINDER_EDIT
            r4 = 2131232963(0x7f0808c3, float:1.808205E38)
            com.google.android.apps.g.d.ad r2 = com.google.android.apps.gsa.sidekick.shared.util.C91988g.m150965b(r3, r2, r4)
            com.google.android.apps.gsa.staticplugins.nowcards.i.a.a r3 = new com.google.android.apps.gsa.staticplugins.nowcards.i.a.a
            java.lang.String r4 = r1.f27900c
            r3.<init>(r7, r4)
            com.google.android.apps.gsa.staticplugins.nowcards.base.aj r4 = r6.f290136g
            com.google.android.libraries.f.a.h r4 = r4.f290147c
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = m172221B(r7, r8, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 != 0) goto L_0x0039
            r3.f292494a = r7
        L_0x0039:
            int r4 = r1.f27898a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r1.f27901d
            r3.f292496c = r4
        L_0x0043:
            com.google.ai.b.kp r4 = r1.f27904g
            if (r4 != 0) goto L_0x0049
            com.google.ai.b.kp r4 = com.google.p375ai.p378b.C7805kp.f27284h
        L_0x0049:
            int r4 = r4.f27286a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0081
            if (r7 == 0) goto L_0x005f
            com.google.ai.b.kp r4 = r1.f27904g
            if (r4 != 0) goto L_0x0057
            com.google.ai.b.kp r4 = com.google.p375ai.p378b.C7805kp.f27284h
        L_0x0057:
            java.lang.String r4 = r4.f27290e
            boolean r7 = r7.contains(r4)
            if (r7 != 0) goto L_0x0081
        L_0x005f:
            com.google.android.apps.gsa.staticplugins.nowcards.i.a.c r7 = new com.google.android.apps.gsa.staticplugins.nowcards.i.a.c
            r7.<init>()
            com.google.ai.b.la r4 = com.google.p375ai.p378b.C7817la.TEXTLINE
            com.google.ai.b.kp r1 = r1.f27904g
            if (r1 != 0) goto L_0x006c
            com.google.ai.b.kp r1 = com.google.p375ai.p378b.C7805kp.f27284h
        L_0x006c:
            java.lang.String r1 = r1.f27290e
            com.google.android.libraries.gsa.m.a.a r5 = new com.google.android.libraries.gsa.m.a.a
            r5.<init>(r4)
            r5.mo28283c(r1)
            java.util.List r1 = r7.f292502a
            r1.add(r5)
            java.util.List r7 = r7.mo94438b()
            r3.f292495b = r7
        L_0x0081:
            r3.mo94436b(r2, r8)
            com.google.android.apps.g.d.v r7 = r3.mo94435a()
            r0.add(r7)
            r7 = 0
            com.google.android.apps.g.d.v[] r7 = new com.google.android.apps.p489g.p494d.C9278v[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            com.google.android.apps.g.d.v[] r7 = (com.google.android.apps.p489g.p494d.C9278v[]) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowcards.p8100a.C104241i.mo94023C(android.content.Context, com.google.ai.b.hj):com.google.android.apps.g.d.v[]");
    }

    /* renamed from: a */
    public final C9270n mo94024a(Context context) {
        C9270n a = this.f290164i.mo94086a(context);
        if (a == null) {
            return null;
        }
        C9269m mVar = (C9269m) a.toBuilder();
        mVar.copyOnWrite();
        C9270n nVar = (C9270n) mVar.instance;
        nVar.f32074a |= 1;
        nVar.f32076c = true;
        return (C9270n) mVar.build();
    }

    /* renamed from: p */
    public final ViewGroup mo86101p() {
        if (!this.f290136g.f290146b) {
            return null;
        }
        mo86081c();
        return null;
    }

    /* renamed from: v */
    public final C9278v mo94011v(Context context, List list) {
        C9278v D = m172222D(this.f290132c);
        if (D != null) {
            return D;
        }
        return this.f290164i.mo94088c(context, list);
    }

    /* renamed from: w */
    public final C9278v mo94012w(Context context) {
        C7718hj hjVar = this.f290132c;
        C7708h c = C91978bb.m150937c(hjVar, C7681g.SNOOZE_REMINDER, new C7681g[0]);
        if (c == null) {
            return m172222D(this.f290132c);
        }
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C9277u uVar = C9277u.PRIMARY_ACTION;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32196c = uVar.f32164ay;
        vVar.f32192a |= 1;
        qVar.copyOnWrite();
        C9278v vVar2 = (C9278v) qVar.instance;
        hjVar.getClass();
        vVar2.f32174H = hjVar;
        vVar2.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        C9141ad b = C91988g.m150965b(C9140ac.REMINDER_SNOOZE, C7681g.SNOOZE_REMINDER, R.drawable.quantum_ic_access_time_white_24);
        qVar.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar.instance;
        b.getClass();
        vVar3.f32169C = b;
        vVar3.f32192a |= 67108864;
        C9216cy cyVar = (C9216cy) C9217cz.f31853i.createBuilder();
        String str = c.f26898c;
        cyVar.copyOnWrite();
        C9217cz czVar = (C9217cz) cyVar.instance;
        str.getClass();
        czVar.f31855a |= 1;
        czVar.f31856b = str;
        qVar.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar.instance;
        C9217cz czVar2 = (C9217cz) cyVar.build();
        czVar2.getClass();
        vVar4.f32198e = czVar2;
        vVar4.f32192a |= 4;
        return (C9278v) qVar.build();
    }

    /* renamed from: x */
    public final C9278v mo94013x(Context context, C7718hj hjVar) {
        C7947pw pwVar = hjVar.f26979t;
        if (pwVar == null) {
            pwVar = C7947pw.f27896j;
        }
        C21378h hVar = this.f290136g.f290147c;
        String B = m172221B(context, hjVar, System.currentTimeMillis());
        String str = pwVar.f27900c;
        C9196ce ceVar = (C9196ce) C9199ch.f31764g.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            ceVar.copyOnWrite();
            C9199ch chVar = (C9199ch) ceVar.instance;
            str.getClass();
            chVar.f31766a |= 1;
            chVar.f31767b = str;
        }
        if (!TextUtils.isEmpty(B)) {
            ceVar.copyOnWrite();
            C9199ch chVar2 = (C9199ch) ceVar.instance;
            B.getClass();
            C62971cq cqVar = chVar2.f31768c;
            if (!cqVar.mo58948c()) {
                chVar2.f31768c = C62942bv.mutableCopy(cqVar);
            }
            chVar2.f31768c.add(B);
        }
        C9273q qVar = (C9273q) C9278v.f32165Z.createBuilder();
        C9277u uVar = C9277u.PERSONAL_ITEM_ROW;
        qVar.copyOnWrite();
        C9278v vVar = (C9278v) qVar.instance;
        vVar.f32196c = uVar.f32164ay;
        vVar.f32192a |= 1;
        qVar.copyOnWrite();
        C9278v vVar2 = (C9278v) qVar.instance;
        C9199ch chVar3 = (C9199ch) ceVar.build();
        chVar3.getClass();
        vVar2.f32205l = chVar3;
        vVar2.f32192a |= 512;
        C9273q qVar2 = (C9273q) ((C9278v) qVar.build()).toBuilder();
        C9141ad b = C91988g.m150965b(C9140ac.REMINDER_EDIT, C7681g.DETAILS, 0);
        qVar2.copyOnWrite();
        C9278v vVar3 = (C9278v) qVar2.instance;
        b.getClass();
        vVar3.f32169C = b;
        vVar3.f32192a |= 67108864;
        qVar2.copyOnWrite();
        C9278v vVar4 = (C9278v) qVar2.instance;
        hjVar.getClass();
        vVar4.f32174H = hjVar;
        vVar4.f32192a |= LinearLayoutManager.INVALID_OFFSET;
        return (C9278v) qVar2.build();
    }

    /* renamed from: z */
    public final String mo94015z() {
        if (!(this.f290132c == null || (this.f290132c.f26955a & 65536) == 0)) {
            C7779jq jqVar = this.f290132c.f26980u;
            if (jqVar == null) {
                jqVar = C7779jq.f27232e;
            }
            C8086v vVar = jqVar.f27236c;
            if (vVar == null) {
                vVar = C8086v.f28444c;
            }
            if ((vVar.f28446a & 1) != 0) {
                return vVar.f28447b;
            }
        }
        return null;
    }

    public C104241i(C7718hj hjVar, C7718hj[] hjVarArr, CardRenderingContext cardRenderingContext, C89291a aVar, C104308aj ajVar) {
        super(hjVar, hjVarArr, cardRenderingContext, aVar, -1, ajVar);
    }
}
