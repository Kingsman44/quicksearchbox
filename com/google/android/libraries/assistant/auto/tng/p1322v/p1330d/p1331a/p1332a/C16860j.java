package com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.p1332a;

import com.google.android.libraries.assistant.auto.tng.common.p897a.C13213i;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1323a.C16833a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1334b.p1335a.C16864a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16867b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1195e.p1196a.C15881b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.d.a.a.j */
/* compiled from: PG */
public final class C16860j implements C16850a {

    /* renamed from: k */
    private static final C59071e f49330k = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.v.d.a.a.j");

    /* renamed from: a */
    public final C13213i f49331a;

    /* renamed from: b */
    public final AccountId f49332b;

    /* renamed from: c */
    public final C16833a f49333c;

    /* renamed from: d */
    public final Executor f49334d;

    /* renamed from: e */
    public final Optional f49335e;

    /* renamed from: f */
    public final Optional f49336f;

    /* renamed from: g */
    public final Optional f49337g;

    /* renamed from: h */
    public final C69464a f49338h;

    /* renamed from: i */
    public final C16864a f49339i;

    /* renamed from: j */
    public final C15881b f49340j;

    /* renamed from: l */
    private final C46723bg f49341l;

    /* renamed from: m */
    private final C69464a f49342m;

    public C16860j(AccountId accountId, C13213i iVar, C16833a aVar, C69464a aVar2, C46723bg bgVar, C16864a aVar3, Executor executor, C15881b bVar, Optional optional, Optional optional2, Optional optional3, C69464a aVar4) {
        this.f49332b = accountId;
        this.f49331a = iVar;
        this.f49333c = aVar;
        this.f49342m = aVar2;
        this.f49341l = bgVar;
        this.f49334d = executor;
        this.f49340j = bVar;
        this.f49339i = aVar3;
        this.f49335e = optional;
        this.f49336f = optional2;
        this.f49337g = optional3;
        this.f49338h = aVar4;
    }

    /* renamed from: a */
    public final C46689ag mo23062a() {
        return new C46719bc(this.f49341l, new C16858h(this), "retrieve_primary_locale");
    }

    /* renamed from: b */
    public final C60870cx mo23063b() {
        C60870cx cxVar;
        C60870cx i = C60856cj.m92900i(Optional.empty());
        if (((Optional) this.f49342m.mo17428b()).isPresent() && !((String) ((Optional) this.f49342m.mo17428b()).get()).isEmpty()) {
            C59104x d = f49330k.mo56226d();
            d.mo56378ag(C58975e.f156826a, "LocaleSettingsService");
            ((C59052c) ((C59052c) d).mo56372aa(46418)).mo56389s("Overriding primary locale with value %s", ((Optional) this.f49342m.mo17428b()).get());
            String str = (String) ((Optional) this.f49342m.mo17428b()).get();
            C16867b bVar = (C16867b) C16868c.f49349j.createBuilder();
            bVar.copyOnWrite();
            C16868c cVar = (C16868c) bVar.instance;
            str.getClass();
            cVar.f49351a |= 1;
            cVar.f49352b = str;
            bVar.copyOnWrite();
            C16868c cVar2 = (C16868c) bVar.instance;
            cVar2.f49351a |= 2;
            cVar2.f49353c = false;
            C16868c cVar3 = (C16868c) bVar.build();
            C60870cx h = C60922j.m93045h(this.f49331a.mo20979b(this.f49332b), C47810es.m84966f(new C16853c(this, cVar3)), this.f49334d);
            if (this.f49335e.isPresent()) {
                cxVar = C47633f.m84733g(h).mo51516i(new C16854d(this, str, cVar3), this.f49334d).mo51515h(C16855e.f49324a, this.f49334d);
            } else {
                cxVar = C60866ct.f164955a;
            }
            C60856cj.m92911t(h, C47810es.m84974n(new C16859i(this, str)), this.f49334d);
            i = C60922j.m93044g(cxVar, C47810es.m84963c(new C16851a(str)), this.f49334d);
        }
        return C60922j.m93045h(i, C47810es.m84966f(new C16852b(this)), this.f49334d);
    }
}
