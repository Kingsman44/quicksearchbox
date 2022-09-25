package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.assistant.p3803ag.p3804a.p3806b.C48831l;
import com.google.assistant.p3803ag.p3804a.p3806b.C48832m;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53236gk;
import com.google.assistant.p3994s.p3995a.C53243gr;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.cm */
/* compiled from: PG */
public final class C124114cm {

    /* renamed from: a */
    public final C123623b f342785a;

    /* renamed from: b */
    public final AccountId f342786b;

    /* renamed from: c */
    public final Context f342787c;

    /* renamed from: d */
    public final C130895ag f342788d;

    /* renamed from: e */
    public final C58974d f342789e;

    /* renamed from: f */
    public final Executor f342790f;

    /* renamed from: g */
    public final C124117co f342791g;

    /* renamed from: h */
    private final C60950i f342792h;

    /* renamed from: i */
    private final C124109ch f342793i;

    /* renamed from: j */
    private final C124100bz f342794j;

    /* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.cm$a */
    /* compiled from: PG */
    public interface C124115a {
        /* renamed from: ae */
        C124114cm mo106293ae();
    }

    public C124114cm(C123623b bVar, C60950i iVar, AccountId accountId, Context context, C124109ch chVar, C124100bz bzVar, C124117co coVar, C130895ag agVar, C130603a aVar, Executor executor) {
        this.f342785a = bVar;
        this.f342792h = iVar;
        this.f342786b = accountId;
        this.f342787c = context;
        this.f342793i = chVar;
        this.f342794j = bzVar;
        this.f342788d = agVar;
        this.f342789e = aVar.mo109740b(this);
        this.f342790f = executor;
        this.f342791g = coVar;
    }

    /* renamed from: a */
    public static C124114cm m203535a(Context context, AccountId accountId) {
        return ((C124115a) C47245e.m84045a(context, C124115a.class, accountId)).mo106293ae();
    }

    /* renamed from: c */
    public static Optional m203536c(C48832m mVar) {
        C53243gr grVar = (C53243gr) C53244gs.f139553j.createBuilder();
        int i = mVar.f126342a;
        if ((i & 2) == 0 || (i & 32) == 0) {
            return Optional.empty();
        }
        String str = mVar.f126344c;
        grVar.copyOnWrite();
        C53244gs gsVar = (C53244gs) grVar.instance;
        str.getClass();
        gsVar.f139555a |= 2;
        gsVar.f139557c = str;
        String str2 = mVar.f126348g;
        grVar.copyOnWrite();
        C53244gs gsVar2 = (C53244gs) grVar.instance;
        str2.getClass();
        gsVar2.f139555a |= 64;
        gsVar2.f139562h = str2;
        if ((mVar.f126342a & 8) != 0) {
            String str3 = mVar.f126346e;
            grVar.copyOnWrite();
            C53244gs gsVar3 = (C53244gs) grVar.instance;
            str3.getClass();
            gsVar3.f139555a |= 8;
            gsVar3.f139559e = str3;
        }
        if ((mVar.f126342a & 4) != 0) {
            String str4 = mVar.f126345d;
            grVar.copyOnWrite();
            C53244gs gsVar4 = (C53244gs) grVar.instance;
            str4.getClass();
            gsVar4.f139555a |= 4;
            gsVar4.f139558d = str4;
        }
        int i2 = 1;
        if ((mVar.f126342a & 1) != 0) {
            String str5 = mVar.f126343b;
            grVar.copyOnWrite();
            C53244gs gsVar5 = (C53244gs) grVar.instance;
            str5.getClass();
            gsVar5.f139555a |= 1;
            gsVar5.f139556b = str5;
        }
        if ((mVar.f126342a & 16) != 0) {
            String str6 = mVar.f126347f;
            grVar.copyOnWrite();
            C53244gs gsVar6 = (C53244gs) grVar.instance;
            str6.getClass();
            gsVar6.f139555a |= 32;
            gsVar6.f139561g = str6;
        }
        if ((mVar.f126342a & 64) != 0) {
            int a = C48831l.m85283a(mVar.f126349h);
            if (a != 0) {
                i2 = a;
            }
            C53236gk e = m203537e(i2);
            grVar.copyOnWrite();
            C53244gs gsVar7 = (C53244gs) grVar.instance;
            gsVar7.f139560f = e.f139534d;
            gsVar7.f139555a |= 16;
        }
        return Optional.m71637of((C53244gs) grVar.build());
    }

    /* renamed from: e */
    public static C53236gk m203537e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return C53236gk.UNKNOWN_PRECIPITATION_TYPE;
        }
        if (i2 != 1) {
            return C53236gk.SNOW_PRECIPITATION_TYPE;
        }
        return C53236gk.RAIN_PRECIPITATION_TYPE;
    }

    /* renamed from: b */
    public final C60870cx mo106291b(C53245gt gtVar, byte[] bArr, C58480gp gpVar) {
        Instant a = this.f342792h.mo57444a();
        return this.f342785a.f341550b.mo45937a(new C124111cj(this, C123611ad.m202953l(C58485gu.m89846n(1), C53306j.OPA_SMARTSPACE), a, gtVar, bArr, gpVar));
    }

    /* renamed from: d */
    public final void mo106292d(C53245gt gtVar, byte[] bArr, C42847bf bfVar, C58480gp gpVar) {
        C58970a aVar = (C58970a) ((C58970a) this.f342789e.mo56224b()).mo56372aa(35419);
        C53232gg a = C53232gg.m86789a(gtVar.f139568b);
        if (a == null) {
            a = C53232gg.UNKNOWN;
        }
        aVar.mo56387q("Pcp saved weather source=%d", a.f139522g);
        bfVar.mo45931c("SharedProactiveData", C123611ad.m202943b(1, "weather_current", gtVar, bArr, new byte[0], this.f342792h.mo57444a().toEpochMilli()), 5);
        this.f342794j.mo106284c(1);
        this.f342793i.mo106289b(1, this.f342787c, this.f342786b, "weather_current", gpVar, bfVar);
    }
}
