package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14692be;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14693bf;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14704e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14722w;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14242bz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14244ca;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14245cb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14246cc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14248ce;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14249cf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14250cg;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14252ci;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14253cj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14254ck;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14256cm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14257cn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14258co;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14259cp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14260cq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14632v;
import p001a.p007b.p011b.p012a.C0025a;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.r */
/* compiled from: PG */
public final class C14973r {

    /* renamed from: a */
    public final C14686az f44937a;

    /* renamed from: b */
    public final C14704e f44938b;

    /* renamed from: c */
    private final C14693bf f44939c;

    /* renamed from: d */
    private final C14722w f44940d;

    public C14973r(C14693bf bfVar, C14686az azVar, C14704e eVar, C14722w wVar) {
        this.f44939c = bfVar;
        this.f44937a = azVar;
        this.f44938b = eVar;
        this.f44940d = wVar;
    }

    /* renamed from: a */
    public final Optional mo21868a(C14324f fVar, C14242bz bzVar, C14749d dVar) {
        C14259cp cpVar;
        C14257cn cnVar;
        C14342fr frVar;
        C14324f fVar2 = fVar;
        C14242bz bzVar2 = C14242bz.UNKNOWN_ICON;
        boolean z = true;
        switch (bzVar.ordinal()) {
            case 0:
            case 9:
                return Optional.empty();
            case 1:
                C14246cc ccVar = (C14246cc) C14260cq.f43137c.createBuilder();
                C14704e eVar = this.f44938b;
                C14244ca caVar = (C14244ca) C14245cb.f43115b.createBuilder();
                C14350fz fzVar = eVar.f44437b;
                caVar.copyOnWrite();
                ((C14245cb) caVar.instance).f43117a = fzVar.getNumber();
                C14245cb cbVar = (C14245cb) caVar.build();
                ccVar.copyOnWrite();
                C14260cq cqVar = (C14260cq) ccVar.instance;
                cbVar.getClass();
                cqVar.f43140b = cbVar;
                cqVar.f43139a = 1;
                return Optional.m71637of((C14260cq) ccVar.build());
            case 2:
                C14246cc ccVar2 = (C14246cc) C14260cq.f43137c.createBuilder();
                C14693bf bfVar = this.f44939c;
                if (!bfVar.f44385g.isPresent() || !bfVar.f44386h.isPresent() || !bfVar.f44387i.isPresent()) {
                    cpVar = C14259cp.f43134b;
                } else {
                    int orElse = bfVar.f44385g.orElse(bfVar.f44386h.orElse(bfVar.f44387i.getAsInt()));
                    if (bfVar.f44395q.indexOfKey(orElse) < 0) {
                        cpVar = C14259cp.f43134b;
                    } else {
                        C14258co coVar = (C14258co) C14259cp.f43134b.createBuilder();
                        int i = ((C14692be) Objects.requireNonNull((C14692be) bfVar.f44395q.get(orElse))).f44378e;
                        coVar.copyOnWrite();
                        ((C14259cp) coVar.instance).f43136a = C14632v.m30647a(i);
                        cpVar = (C14259cp) coVar.build();
                    }
                }
                ccVar2.copyOnWrite();
                C14260cq cqVar2 = (C14260cq) ccVar2.instance;
                cpVar.getClass();
                cqVar2.f43140b = cpVar;
                cqVar2.f43139a = 2;
                return Optional.m71637of((C14260cq) ccVar2.build());
            case 3:
                C14246cc ccVar3 = (C14246cc) C14260cq.f43137c.createBuilder();
                Optional a = dVar.mo21714a(C14984b.m31520r(4));
                if (a.isPresent()) {
                    C14221be beVar = (C14221be) a.get();
                    if (beVar.f43043a == 2) {
                        frVar = (C14342fr) beVar.f43044b;
                    } else {
                        frVar = C14342fr.f43389l;
                    }
                    C14256cm cmVar = (C14256cm) C14257cn.f43130c.createBuilder();
                    String str = frVar.f43391a;
                    cmVar.copyOnWrite();
                    str.getClass();
                    ((C14257cn) cmVar.instance).f43132a = str;
                    String str2 = frVar.f43392b;
                    cmVar.copyOnWrite();
                    str2.getClass();
                    ((C14257cn) cmVar.instance).f43133b = str2;
                    cnVar = (C14257cn) cmVar.build();
                } else {
                    cnVar = C14257cn.f43130c;
                }
                ccVar3.copyOnWrite();
                C14260cq cqVar3 = (C14260cq) ccVar3.instance;
                cnVar.getClass();
                cqVar3.f43140b = cnVar;
                cqVar3.f43139a = 3;
                return Optional.m71637of((C14260cq) ccVar3.build());
            case 4:
                C14246cc ccVar4 = (C14246cc) C14260cq.f43137c.createBuilder();
                C14722w wVar = this.f44940d;
                long f = this.f44937a.f44352b.mo21481f();
                long j = wVar.f44495e.f44393o;
                long j2 = wVar.f44499i;
                boolean z2 = j > j2 && j > wVar.f44500j;
                boolean z3 = f > j2 && f > wVar.f44501k;
                C14249cf cfVar = (C14249cf) C14250cg.f43120c.createBuilder();
                boolean z4 = z2 || z3;
                cfVar.copyOnWrite();
                ((C14250cg) cfVar.instance).f43122a = z4;
                int c = C0025a.m8c(fVar2.f43333b);
                if (c == 0 || c != 7) {
                    z = false;
                }
                cfVar.copyOnWrite();
                ((C14250cg) cfVar.instance).f43123b = z;
                C14250cg cgVar = (C14250cg) cfVar.build();
                ccVar4.copyOnWrite();
                C14260cq cqVar4 = (C14260cq) ccVar4.instance;
                cgVar.getClass();
                cqVar4.f43140b = cgVar;
                cqVar4.f43139a = 4;
                return Optional.m71637of((C14260cq) ccVar4.build());
            case 5:
            case 8:
                C14246cc ccVar5 = (C14246cc) C14260cq.f43137c.createBuilder();
                C14253cj cjVar = (C14253cj) C14254ck.f43126c.createBuilder();
                String str3 = fVar2.f43334c;
                cjVar.copyOnWrite();
                str3.getClass();
                ((C14254ck) cjVar.instance).f43128a = str3;
                C0027c a2 = C0027c.m9a(fVar2.f43332a);
                if (a2 == null) {
                    a2 = C0027c.UNRECOGNIZED;
                }
                boolean equals = a2.equals(C0027c.MICRO);
                cjVar.copyOnWrite();
                ((C14254ck) cjVar.instance).f43129b = equals;
                C14254ck ckVar = (C14254ck) cjVar.build();
                ccVar5.copyOnWrite();
                C14260cq cqVar5 = (C14260cq) ccVar5.instance;
                ckVar.getClass();
                cqVar5.f43140b = ckVar;
                cqVar5.f43139a = 5;
                return Optional.m71637of((C14260cq) ccVar5.build());
            case 6:
                C14246cc ccVar6 = (C14246cc) C14260cq.f43137c.createBuilder();
                C14248ce ceVar = C14248ce.f43118a;
                ccVar6.copyOnWrite();
                C14260cq cqVar6 = (C14260cq) ccVar6.instance;
                ceVar.getClass();
                cqVar6.f43140b = ceVar;
                cqVar6.f43139a = 7;
                return Optional.m71637of((C14260cq) ccVar6.build());
            case 7:
                C14246cc ccVar7 = (C14246cc) C14260cq.f43137c.createBuilder();
                C14252ci ciVar = C14252ci.f43124a;
                ccVar7.copyOnWrite();
                C14260cq cqVar7 = (C14260cq) ccVar7.instance;
                ciVar.getClass();
                cqVar7.f43140b = ciVar;
                cqVar7.f43139a = 8;
                return Optional.m71637of((C14260cq) ccVar7.build());
            default:
                return Optional.empty();
        }
    }
}
