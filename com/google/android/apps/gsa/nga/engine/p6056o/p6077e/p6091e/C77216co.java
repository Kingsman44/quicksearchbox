package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74885bc;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3917i.p3918a.C51559me;
import com.google.assistant.p3897e.p3917i.p3918a.C51560mf;
import com.google.assistant.p3897e.p3917i.p3918a.C51561mg;
import com.google.assistant.p3897e.p3917i.p3918a.C51562mh;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.co */
/* compiled from: PG */
public final /* synthetic */ class C77216co implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77217cp f213044a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f213045b;

    public /* synthetic */ C77216co(C77217cp cpVar, C74965n nVar) {
        this.f213044a = cpVar;
        this.f213045b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77217cp cpVar = this.f213044a;
        C74965n nVar = this.f213045b;
        C58485gu b = ((C74885bc) obj).mo71274b();
        if (b.size() != 1) {
            ((C58970a) ((C58970a) C77217cp.f213046a.mo56226d()).mo56372aa(3841)).mo56387q("Found %d stopwatches, can only handle exactly 1.", b.size());
            cpVar.f213047b.mo76648a(nVar.mo71336k(), C82835ce.QUANTIFIERS_NOT_IMPLEMENTED, C83044e.f226656a);
            return C80401n.f220656k;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(23209);
        C51560mf mfVar = (C51560mf) b.get(0);
        C51559me a = C51559me.m86216a(mfVar.f134386c);
        if (a == null) {
            a = C51559me.UNDEFINED;
        }
        if (!a.equals(C51559me.PAUSED) || mfVar.f134388e != 0) {
            C51561mg mgVar = (C51561mg) C51562mh.f134390e.createBuilder();
            mgVar.copyOnWrite();
            C51562mh mhVar = (C51562mh) mgVar.instance;
            mfVar.getClass();
            mhVar.f134394c = mfVar;
            mhVar.f134392a |= 2;
            mgVar.copyOnWrite();
            C51562mh mhVar2 = (C51562mh) mgVar.instance;
            mhVar2.f134392a |= 4;
            mhVar2.f134395d = true;
            C81442m.m129557s(lVar, t.o("stopwatch.RESET_STOPWATCH", (C51562mh) mgVar.build()));
            return (C80401n) lVar.build();
        }
        C51561mg mgVar2 = (C51561mg) C51562mh.f134390e.createBuilder();
        mgVar2.copyOnWrite();
        C51562mh mhVar3 = (C51562mh) mgVar2.instance;
        mfVar.getClass();
        mhVar3.f134394c = mfVar;
        mhVar3.f134392a |= 2;
        mgVar2.copyOnWrite();
        C51562mh mhVar4 = (C51562mh) mgVar2.instance;
        mhVar4.f134392a |= 4;
        mhVar4.f134395d = true;
        C81442m.m129557s(lVar, t.o("stopwatch.SHOW_STOPWATCH", (C51562mh) mgVar2.build()));
        C81442m.m129557s(lVar, t.r(cpVar.f213048c.mo75121a(nVar.mo71342q()).getString(R.string.nga_productivity_stopwatch_reset_already, new Object[0])));
        return (C80401n) lVar.build();
    }
}
