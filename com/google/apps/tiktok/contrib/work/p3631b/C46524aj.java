package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.C4397au;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.contrib.work.b.aj */
/* compiled from: PG */
public final class C46524aj implements C46575i {

    /* renamed from: a */
    public static final C59071e f121667a = C59071e.m91332i("com.google.apps.tiktok.contrib.work.b.aj");

    /* renamed from: b */
    public static final C60845bz f121668b = new C46519ae();

    /* renamed from: c */
    public final Executor f121669c;

    /* renamed from: d */
    public final C46564v f121670d;

    /* renamed from: e */
    public final C60845bz f121671e = new C46522ah();

    /* renamed from: f */
    private final C46325t f121672f;

    /* renamed from: g */
    private final C60845bz f121673g = new C46520af();

    /* renamed from: h */
    private final C60845bz f121674h = new C46521ag();

    /* renamed from: i */
    private final C60845bz f121675i = new C46523ai();

    public C46524aj(C46325t tVar, Executor executor, C46564v vVar) {
        this.f121672f = tVar;
        this.f121669c = executor;
        this.f121670d = vVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C60870cx f = this.f121670d.f121739a.mo50525f(C4397au.m12584a(C58485gu.m89846n("tiktok_account_work")).mo9336b());
        C60870cx e = this.f121672f.mo50285e();
        C60870cx a = C47638k.m84753d(f, e).mo51520a(new C46515aa(e, f), this.f121669c);
        C60845bz bzVar = this.f121673g;
        C60856cj.m92911t(a, C47810es.m84974n(bzVar), this.f121669c);
        C46516ab abVar = new C46516ab(this);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(abVar), this.f121669c);
        C60845bz bzVar2 = this.f121674h;
        C60856cj.m92911t(g, C47810es.m84974n(bzVar2), this.f121669c);
        C46517ac acVar = new C46517ac(this);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(acVar), this.f121669c);
        C60845bz bzVar3 = this.f121675i;
        C60856cj.m92911t(h, C47810es.m84974n(bzVar3), this.f121669c);
        return C47638k.m84753d(g, h).mo51520a(C46518ad.f121666a, this.f121669c);
    }
}
