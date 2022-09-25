package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.p1201d;

import android.content.Context;
import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.common.p926m.p927a.C13293a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.C16884b;
import com.google.android.libraries.assistant.auto.tng.p894c.p895a.C13194a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15809s;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.C15886a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.f.d.c */
/* compiled from: PG */
public final class C15915c implements C15886a {

    /* renamed from: a */
    public final C13194a f47249a;

    /* renamed from: b */
    public final Context f47250b;

    /* renamed from: c */
    public final C13293a f47251c;

    /* renamed from: d */
    private final Executor f47252d;

    /* renamed from: e */
    private final C16884b f47253e;

    /* renamed from: f */
    private final C13213i f47254f;

    /* renamed from: g */
    private final AccountId f47255g;

    /* renamed from: h */
    private final C16850a f47256h;

    /* renamed from: i */
    private final C58833ax f47257i;

    public C15915c(C16850a aVar, C13293a aVar2, C13213i iVar, AccountId accountId, C13194a aVar3, Context context, C16884b bVar, C58833ax axVar, Executor executor) {
        this.f47251c = aVar2;
        this.f47249a = aVar3;
        this.f47250b = context;
        this.f47253e = bVar;
        this.f47254f = iVar;
        this.f47255g = accountId;
        this.f47252d = executor;
        this.f47256h = aVar;
        this.f47257i = axVar;
    }

    /* renamed from: a */
    public final C15785a mo22600a() {
        return C15809s.f47036a;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C60870cx c = this.f47254f.mo20980c(this.f47255g);
        C60870cx d = this.f47253e.mo23069d();
        C60870cx b = this.f47256h.mo23063b();
        C60870cx cxVar = (C60870cx) this.f47257i.mo56106b(C15913a.f47242a).mo56109e(C60856cj.m92900i(true));
        C60870cx b2 = this.f47253e.mo23067b();
        return C47638k.m84753d(c, d, b, cxVar, b2).mo51520a(new C15914b(this, d, b, cxVar, b2, c), this.f47252d);
    }
}
