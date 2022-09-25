package com.google.android.apps.gsa.staticplugins.opa.p8340bi.p8341a;

import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89134f;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89137i;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89139k;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89141m;
import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89142n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63042fg;
import java.util.List;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71111fc;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71112fd;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71114ff;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71116fh;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71118fj;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71119fk;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bi.a.b */
/* compiled from: PG */
class C108074b implements Function {
    /* renamed from: a */
    public final C71119fk apply(C89142n nVar) {
        C71112fd fdVar = (C71112fd) C71119fk.f189709o.createBuilder();
        if ((nVar.f241660a & 1) != 0) {
            Function function = C108085m.f300656e;
            C89134f a = C89134f.m144998a(nVar.f241661b);
            if (a == null) {
                a = C89134f.UNKNOWN;
            }
            C71111fc a2 = ((C108075c) function).apply(a);
            fdVar.copyOnWrite();
            C71119fk fkVar = (C71119fk) fdVar.instance;
            fkVar.f189713b = a2.f189689y;
            fkVar.f189712a |= 1;
        }
        C62961ch chVar = nVar.f241662c;
        fdVar.copyOnWrite();
        C71119fk fkVar2 = (C71119fk) fdVar.instance;
        C62961ch chVar2 = fkVar2.f189714c;
        if (!chVar2.mo58948c()) {
            fkVar2.f189714c = C62942bv.mutableCopy(chVar2);
        }
        C62947c.addAll((Iterable) chVar, (List) fkVar2.f189714c);
        if ((nVar.f241660a & 2) != 0) {
            String str = nVar.f241663d;
            fdVar.copyOnWrite();
            C71119fk fkVar3 = (C71119fk) fdVar.instance;
            str.getClass();
            fkVar3.f189712a |= 2;
            fkVar3.f189715d = str;
        }
        if ((nVar.f241660a & 4) != 0) {
            String str2 = nVar.f241664e;
            fdVar.copyOnWrite();
            C71119fk fkVar4 = (C71119fk) fdVar.instance;
            str2.getClass();
            fkVar4.f189712a |= 4;
            fkVar4.f189716e = str2;
        }
        if ((nVar.f241660a & 8) != 0) {
            Function function2 = C108085m.f300655d;
            C89139k a3 = C89139k.m145002a(nVar.f241665f);
            if (a3 == null) {
                a3 = C89139k.UNDEFINED;
            }
            C71116fh a4 = ((C108077e) function2).apply(a3);
            fdVar.copyOnWrite();
            C71119fk fkVar5 = (C71119fk) fdVar.instance;
            fkVar5.f189717f = a4.f189703d;
            fkVar5.f189712a |= 8;
        }
        if ((nVar.f241660a & 16) != 0) {
            Function function3 = C108085m.f300653b;
            C89137i a5 = C89137i.m145000a(nVar.f241666g);
            if (a5 == null) {
                a5 = C89137i.UNSPECIFIED;
            }
            C71114ff a6 = ((C108076d) function3).apply(a5);
            fdVar.copyOnWrite();
            C71119fk fkVar6 = (C71119fk) fdVar.instance;
            fkVar6.f189718g = a6.f189697f;
            fkVar6.f189712a |= 16;
        }
        if ((nVar.f241660a & 32) != 0) {
            C63042fg fgVar = nVar.f241667h;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            fdVar.copyOnWrite();
            C71119fk fkVar7 = (C71119fk) fdVar.instance;
            fgVar.getClass();
            fkVar7.f189719h = fgVar;
            fkVar7.f189712a |= 32;
        }
        if ((nVar.f241660a & 64) != 0) {
            Function function4 = C108085m.f300654c;
            C89141m a7 = C89141m.m145004a(nVar.f241668i);
            if (a7 == null) {
                a7 = C89141m.NOTDEFINED;
            }
            C71118fj a8 = ((C108078f) function4).apply(a7);
            fdVar.copyOnWrite();
            C71119fk fkVar8 = (C71119fk) fdVar.instance;
            fkVar8.f189720i = a8.f189708c;
            fkVar8.f189712a |= 64;
        }
        if ((nVar.f241660a & 128) != 0) {
            boolean z = nVar.f241669j;
            fdVar.copyOnWrite();
            C71119fk fkVar9 = (C71119fk) fdVar.instance;
            fkVar9.f189712a |= 128;
            fkVar9.f189721j = z;
        }
        if ((nVar.f241660a & 256) != 0) {
            boolean z2 = nVar.f241670k;
            fdVar.copyOnWrite();
            C71119fk fkVar10 = (C71119fk) fdVar.instance;
            fkVar10.f189712a |= 256;
            fkVar10.f189722k = z2;
        }
        if ((nVar.f241660a & 512) != 0) {
            boolean z3 = nVar.f241671l;
            fdVar.copyOnWrite();
            C71119fk fkVar11 = (C71119fk) fdVar.instance;
            fkVar11.f189712a |= 512;
            fkVar11.f189723l = z3;
        }
        if ((nVar.f241660a & 1024) != 0) {
            boolean z4 = nVar.f241672m;
            fdVar.copyOnWrite();
            C71119fk fkVar12 = (C71119fk) fdVar.instance;
            fkVar12.f189712a |= 1024;
            fkVar12.f189724m = z4;
        }
        return (C71119fk) fdVar.build();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
