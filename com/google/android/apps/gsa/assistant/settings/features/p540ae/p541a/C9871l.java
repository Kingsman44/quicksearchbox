package com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a;

import com.google.assistant.p3861at.C50263qp;
import com.google.assistant.p3861at.C50264qq;
import com.google.assistant.p3861at.C50265qr;
import com.google.assistant.p3861at.C50266qs;
import com.google.assistant.p3861at.C50268qu;
import com.google.assistant.p3861at.C50286rl;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.a.l */
/* compiled from: PG */
public final /* synthetic */ class C9871l implements Function {

    /* renamed from: a */
    public final /* synthetic */ C9885z f33905a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f33906b;

    public /* synthetic */ C9871l(C9885z zVar, C58495hd hdVar) {
        this.f33905a = zVar;
        this.f33906b = hdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C50268qu quVar;
        C50286rl rlVar;
        C9885z zVar = this.f33905a;
        C58495hd hdVar = this.f33906b;
        C50264qq qqVar = (C50264qq) obj;
        C50266qs qsVar = qqVar.f130715e;
        if (qsVar == null) {
            qsVar = C50266qs.f130716c;
        }
        if (qsVar.f130718a == 1) {
            C50266qs qsVar2 = qqVar.f130715e;
            if (qsVar2 == null) {
                qsVar2 = C50266qs.f130716c;
            }
            if (qsVar2.f130718a == 1) {
                rlVar = C50286rl.m85798a(((Integer) qsVar2.f130719b).intValue());
                if (rlVar == null) {
                    rlVar = C50286rl.PAGE_ID_UNSPECIFIED;
                }
            } else {
                rlVar = C50286rl.PAGE_ID_UNSPECIFIED;
            }
            return (C50264qq) hdVar.get(rlVar);
        }
        C50266qs qsVar3 = qqVar.f130715e;
        if (qsVar3 == null) {
            qsVar3 = C50266qs.f130716c;
        }
        if (qsVar3.f130718a != 7) {
            return null;
        }
        C50263qp qpVar = (C50263qp) C50264qq.f130709f.createBuilder(qqVar);
        String d = zVar.mo18090d(qqVar.f130712b);
        qpVar.copyOnWrite();
        C50264qq qqVar2 = (C50264qq) qpVar.instance;
        d.getClass();
        qqVar2.f130711a = 1 | qqVar2.f130711a;
        qqVar2.f130712b = d;
        String d2 = zVar.mo18090d(qqVar.f130713c);
        qpVar.copyOnWrite();
        C50264qq qqVar3 = (C50264qq) qpVar.instance;
        d2.getClass();
        qqVar3.f130711a |= 2;
        qqVar3.f130713c = d2;
        C50266qs qsVar4 = qqVar.f130715e;
        if (qsVar4 == null) {
            qsVar4 = C50266qs.f130716c;
        }
        C50265qr qrVar = (C50265qr) C50266qs.f130716c.createBuilder(qsVar4);
        C50266qs qsVar5 = qqVar.f130715e;
        if (qsVar5 == null) {
            qsVar5 = C50266qs.f130716c;
        }
        if (qsVar5.f130718a == 7) {
            quVar = (C50268qu) qsVar5.f130719b;
        } else {
            quVar = C50268qu.f130720e;
        }
        C50268qu c = zVar.mo18089c(hdVar, quVar);
        qrVar.copyOnWrite();
        C50266qs qsVar6 = (C50266qs) qrVar.instance;
        c.getClass();
        qsVar6.f130719b = c;
        qsVar6.f130718a = 7;
        qpVar.copyOnWrite();
        C50264qq qqVar4 = (C50264qq) qpVar.instance;
        C50266qs qsVar7 = (C50266qs) qrVar.build();
        qsVar7.getClass();
        qqVar4.f130715e = qsVar7;
        qqVar4.f130711a |= 8;
        return (C50264qq) qpVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
