package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90999h;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.l */
/* compiled from: PG */
final class C98445l implements C98358af {

    /* renamed from: a */
    public final int f274836a;

    /* renamed from: b */
    public final List f274837b;

    /* renamed from: c */
    public Integer f274838c;

    /* renamed from: d */
    final /* synthetic */ C98446m f274839d;

    /* renamed from: e */
    private final Object f274840e = new Object();

    /* renamed from: f */
    private String f274841f;

    public C98445l(C98446m mVar, int i, List list) {
        this.f274839d = mVar;
        this.f274836a = i;
        this.f274837b = list;
    }

    /* renamed from: a */
    public final void mo91115a(String str) {
        C98403bx bxVar = (C98403bx) C98409cc.f274719d.createBuilder();
        for (C98400bu buVar : this.f274837b) {
            C98404by byVar = (C98404by) C98405bz.f274704h.createBuilder();
            int i = buVar.f274691b;
            byVar.copyOnWrite();
            C98405bz bzVar = (C98405bz) byVar.instance;
            bzVar.f274706a |= 1;
            bzVar.f274707b = i;
            C98414ch chVar = buVar.f274692c;
            if (chVar == null) {
                chVar = C98414ch.f274733s;
            }
            C98413cg a = C98413cg.m162977a(chVar.f274736b);
            if (a == null) {
                a = C98413cg.REQUEST_TYPE_INVALID;
            }
            byVar.copyOnWrite();
            C98405bz bzVar2 = (C98405bz) byVar.instance;
            bzVar2.f274709d = a.f274731e;
            bzVar2.f274706a |= 4;
            C98414ch chVar2 = buVar.f274692c;
            if (chVar2 == null) {
                chVar2 = C98414ch.f274733s;
            }
            C62961ch chVar3 = chVar2.f274740f;
            byVar.copyOnWrite();
            C98405bz bzVar3 = (C98405bz) byVar.instance;
            C62961ch chVar4 = bzVar3.f274710e;
            if (!chVar4.mo58948c()) {
                bzVar3.f274710e = C62942bv.mutableCopy(chVar4);
            }
            C62947c.addAll((Iterable) chVar3, (List) bzVar3.f274710e);
            C98414ch chVar5 = buVar.f274692c;
            if (chVar5 == null) {
                chVar5 = C98414ch.f274733s;
            }
            C62961ch chVar6 = chVar5.f274748o;
            byVar.copyOnWrite();
            C98405bz bzVar4 = (C98405bz) byVar.instance;
            C62961ch chVar7 = bzVar4.f274711f;
            if (!chVar7.mo58948c()) {
                bzVar4.f274711f = C62942bv.mutableCopy(chVar7);
            }
            C62947c.addAll((Iterable) chVar6, (List) bzVar4.f274711f);
            C98418cl clVar = buVar.f274693d;
            if (clVar == null) {
                clVar = C98418cl.f274760h;
            }
            byVar.copyOnWrite();
            C98405bz bzVar5 = (C98405bz) byVar.instance;
            clVar.getClass();
            bzVar5.f274712g = clVar;
            bzVar5.f274706a |= 8;
            if ((buVar.f274690a & 8) != 0) {
                String str2 = buVar.f274694e;
                byVar.copyOnWrite();
                C98405bz bzVar6 = (C98405bz) byVar.instance;
                str2.getClass();
                bzVar6.f274706a |= 2;
                bzVar6.f274708c = str2;
            }
            C98405bz bzVar7 = (C98405bz) byVar.build();
            bxVar.copyOnWrite();
            C98409cc ccVar = (C98409cc) bxVar.instance;
            bzVar7.getClass();
            C62971cq cqVar = ccVar.f274723b;
            if (!cqVar.mo58948c()) {
                ccVar.f274723b = C62942bv.mutableCopy(cqVar);
            }
            ccVar.f274723b.add(bzVar7);
        }
        C98407ca caVar = (C98407ca) C98408cb.f274714d.createBuilder();
        int i2 = this.f274836a;
        caVar.copyOnWrite();
        C98408cb cbVar = (C98408cb) caVar.instance;
        cbVar.f274716a |= 2;
        cbVar.f274718c = (long) i2;
        Integer num = this.f274838c;
        if (num != null) {
            int intValue = num.intValue();
            caVar.copyOnWrite();
            C98408cb cbVar2 = (C98408cb) caVar.instance;
            cbVar2.f274716a |= 1;
            cbVar2.f274717b = intValue;
        }
        bxVar.copyOnWrite();
        C98409cc ccVar2 = (C98409cc) bxVar.instance;
        C98408cb cbVar3 = (C98408cb) caVar.build();
        cbVar3.getClass();
        ccVar2.f274724c = cbVar3;
        ccVar2.f274722a |= 1;
        C98409cc ccVar3 = (C98409cc) bxVar.build();
        synchronized (this.f274840e) {
            String str3 = this.f274841f;
            if (str3 != null) {
                C90998g gVar = this.f274839d.f274849g;
                C62940bt btVar = C98409cc.f274720e;
                C90999h d = gVar.mo85268d(str);
                d.mo58885m(btVar, ccVar3);
                gVar.mo85267c(str3, (C91000i) d.build());
            } else {
                this.f274841f = this.f274839d.f274849g.mo85269e(str, C98409cc.f274720e, ccVar3);
            }
        }
    }
}
