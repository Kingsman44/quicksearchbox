package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11529h;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b.C11429f;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13336t;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ap */
/* compiled from: PG */
public final class C11494ap implements C11529h {

    /* renamed from: a */
    public static final C59071e f37347a = C59071e.m91331h();

    /* renamed from: b */
    public final AccountId f37348b;

    /* renamed from: c */
    public final C46128f f37349c;

    /* renamed from: d */
    public final C11429f f37350d;

    /* renamed from: e */
    public final C16850a f37351e;

    /* renamed from: f */
    public final Executor f37352f;

    /* renamed from: g */
    public final C69464a f37353g;

    /* renamed from: h */
    public final C69464a f37354h;

    /* renamed from: i */
    public final C69464a f37355i;

    /* renamed from: j */
    public final C69464a f37356j;

    /* renamed from: k */
    public final C58881cr f37357k;

    public C11494ap(AccountId accountId, C46128f fVar, C11429f fVar2, C16850a aVar, Executor executor, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C58881cr crVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(fVar2, "hotwordManager");
        C69664n.m101061g(aVar, "localeSettingsDataService");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(aVar2, "directReplyEnabled");
        C69664n.m101061g(aVar3, "proactiveReadMessageEnabled");
        C69664n.m101061g(aVar4, "mediaRecEnabled");
        C69664n.m101061g(aVar5, "assistantTranscriptionEnabled");
        this.f37348b = accountId;
        this.f37349c = fVar;
        this.f37350d = fVar2;
        this.f37351e = aVar;
        this.f37352f = executor;
        this.f37353g = aVar2;
        this.f37354h = aVar3;
        this.f37355i = aVar4;
        this.f37356j = aVar5;
        this.f37357k = crVar;
    }

    /* renamed from: a */
    public final C60870cx mo20018a(List list) {
        return C13336t.m29581d(list, new C11492an(this), this.f37352f).mo51515h(C11493ao.f37346a, this.f37352f);
    }
}
