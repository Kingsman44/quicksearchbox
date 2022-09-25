package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.validity.C124169r;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3803ag.p3809c.C48948av;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48965bl;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.assistant.p3803ag.p3809c.C49155y;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3994s.p3995a.C53132co;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69256v;
import p5304e.p5305a.p5306a.p5431u.p5434b.C69258x;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ch */
/* compiled from: PG */
public final class C124109ch {

    /* renamed from: a */
    private final C60950i f342773a;

    /* renamed from: b */
    private final C124100bz f342774b;

    public C124109ch(C60950i iVar, C124100bz bzVar) {
        this.f342773a = iVar;
        this.f342774b = bzVar;
    }

    /* renamed from: a */
    public static C48952az m203531a(Instant instant, C69258x xVar) {
        C69256v vVar = xVar.f185382b;
        if (vVar == null) {
            vVar = C69256v.f185374d;
        }
        C48948av avVar = (C48948av) C48952az.f126657c.createBuilder();
        C48965bl blVar = (C48965bl) C48971br.f126689d.createBuilder();
        C49155y yVar = (C49155y) C49156z.f127111d.createBuilder();
        C63042fg c = C62950b.m95472c(instant.minus(Duration.ofSeconds((long) vVar.f185377b)));
        yVar.copyOnWrite();
        C49156z zVar = (C49156z) yVar.instance;
        c.getClass();
        zVar.f127114b = c;
        zVar.f127113a |= 1;
        C63042fg c2 = C62950b.m95472c(instant.plus(Duration.ofSeconds((long) vVar.f185378c)));
        yVar.copyOnWrite();
        C49156z zVar2 = (C49156z) yVar.instance;
        c2.getClass();
        zVar2.f127115c = c2;
        zVar2.f127113a |= 2;
        blVar.copyOnWrite();
        C48971br brVar = (C48971br) blVar.instance;
        C49156z zVar3 = (C49156z) yVar.build();
        zVar3.getClass();
        brVar.f126692b = zVar3;
        brVar.f126691a = 1;
        avVar.copyOnWrite();
        C48952az azVar = (C48952az) avVar.instance;
        C48971br brVar2 = (C48971br) blVar.build();
        brVar2.getClass();
        azVar.f126660b = brVar2;
        azVar.f126659a = 1;
        return (C48952az) avVar.build();
    }

    /* renamed from: b */
    public final void mo106289b(int i, Context context, AccountId accountId, String str, C58480gp gpVar, C42847bf bfVar) {
        mo106290c(i, context, accountId, str, this.f342773a.mo57444a(), gpVar, bfVar);
    }

    /* renamed from: c */
    public final void mo106290c(int i, Context context, AccountId accountId, String str, Instant instant, C58480gp gpVar, C42847bf bfVar) {
        int i2 = i;
        C42847bf bfVar2 = bfVar;
        C58485gu b = C124086bm.m203508a(context, accountId).mo106279b(i2);
        int size = b.size();
        for (int i3 = 0; i3 < size; i3++) {
            C53306j jVar = (C53306j) b.get(i3);
            Optional g = C124048ad.m203471a(context, accountId).mo106254g(jVar, i2);
            long epochMilli = this.f342773a.mo57444a().toEpochMilli();
            if (!g.isPresent() || (((C69258x) g.get()).f185381a & 1) == 0) {
                bfVar2.mo45931c("ClientProactiveData", C123611ad.m202942a(jVar, i, str, false, (C53132co) null, (C48952az) null, epochMilli), 5);
            } else {
                C48952az a = m203531a(instant, (C69258x) g.get());
                String str2 = str;
                gpVar.mo55395g(C124169r.m203613h(Optional.m71637of(accountId), str2, i2, jVar.f139793X, a));
                bfVar2.mo45931c("ClientProactiveData", C123611ad.m202942a(jVar, i, str2, false, (C53132co) null, a, epochMilli), 5);
            }
            this.f342774b.mo106283b(i2, jVar.f139793X);
        }
    }
}
