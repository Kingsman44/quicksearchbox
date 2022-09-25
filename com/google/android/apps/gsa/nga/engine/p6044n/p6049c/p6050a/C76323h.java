package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80472k;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80528y;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80529z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80287ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.h */
/* compiled from: PG */
public final class C76323h implements C76288a {

    /* renamed from: a */
    private final C76455a f211393a;

    public C76323h(C76455a aVar) {
        this.f211393a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80287ai aiVar;
        if (aqVar.f220359a == 16) {
            aiVar = (C80287ai) aqVar.f220360b;
        } else {
            aiVar = C80287ai.f220310f;
        }
        int i = aiVar.f220312a;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0 || (i & 8) == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("Invalid GellerIncrementElementUsedOp passed to executor"));
        }
        C76455a aVar = this.f211393a;
        C80472k kVar = (C80472k) C80136bn.f219915c.createBuilder();
        C80528y yVar = (C80528y) C80529z.f221064f.createBuilder();
        C65753ak b = C65753ak.m96797b(aiVar.f220314c);
        if (b == null) {
            b = C65753ak.UNKNOWN;
        }
        yVar.copyOnWrite();
        C80529z zVar = (C80529z) yVar.instance;
        zVar.f221068c = b.f178757bE;
        zVar.f221066a |= 2;
        String str = aiVar.f220313b;
        yVar.copyOnWrite();
        C80529z zVar2 = (C80529z) yVar.instance;
        str.getClass();
        zVar2.f221066a |= 1;
        zVar2.f221067b = str;
        String str2 = aiVar.f220315d;
        yVar.copyOnWrite();
        C80529z zVar3 = (C80529z) yVar.instance;
        str2.getClass();
        zVar3.f221066a |= 4;
        zVar3.f221069d = str2;
        long j = aiVar.f220316e;
        yVar.copyOnWrite();
        C80529z zVar4 = (C80529z) yVar.instance;
        zVar4.f221066a |= 8;
        zVar4.f221070e = j;
        kVar.copyOnWrite();
        C80136bn bnVar = (C80136bn) kVar.instance;
        C80529z zVar5 = (C80529z) yVar.build();
        zVar5.getClass();
        bnVar.f219918b = zVar5;
        bnVar.f219917a = 10;
        return C118826c.m197213c(aVar.mo72193d((C80136bn) kVar.build(), Optional.empty()));
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60017;
    }
}
