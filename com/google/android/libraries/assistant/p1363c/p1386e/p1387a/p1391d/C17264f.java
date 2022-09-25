package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1391d;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.p3644h.C47117b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66596bv;
import com.google.speech.p5208h.C66597bw;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66614cl;
import com.google.speech.p5208h.C66615cm;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.c.e.a.d.f */
/* compiled from: PG */
public final class C17264f implements C17266e {

    /* renamed from: a */
    public static final C59071e f50042a = C59071e.m91332i("com.google.android.libraries.assistant.c.e.a.d.f");

    /* renamed from: b */
    public final ScheduledExecutorService f50043b;

    /* renamed from: c */
    public final AccountId f50044c;

    /* renamed from: d */
    public final C47117b f50045d;

    /* renamed from: e */
    public final String f50046e;

    /* renamed from: f */
    public final boolean f50047f;

    /* renamed from: g */
    public final Long f50048g;

    /* renamed from: h */
    private final C46175b f50049h;

    /* renamed from: i */
    private final String f50050i;

    public C17264f(ScheduledExecutorService scheduledExecutorService, AccountId accountId, C47117b bVar, C46175b bVar2, String str, Long l, String str2, boolean z) {
        this.f50043b = scheduledExecutorService;
        this.f50044c = accountId;
        this.f50045d = bVar;
        this.f50049h = bVar2;
        this.f50046e = str;
        this.f50050i = str2;
        this.f50047f = z;
        this.f50048g = l;
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        return C47633f.m84733g(this.f50049h.mo50246c(this.f50044c)).mo51516i(new C17263e(this), this.f50043b).mo51515h(C17262d.f50040a, this.f50043b);
    }

    /* renamed from: b */
    public final C66607ce mo23254b(Optional optional) {
        String str = this.f50050i;
        C66596bv bvVar = (C66596bv) C66597bw.f181154d.createBuilder();
        bvVar.copyOnWrite();
        C66597bw bwVar = (C66597bw) bvVar.instance;
        bwVar.f181156a |= 2;
        bwVar.f181158c = 1;
        bvVar.copyOnWrite();
        C66597bw bwVar2 = (C66597bw) bvVar.instance;
        str.getClass();
        bwVar2.f181156a |= 1;
        bwVar2.f181157b = str;
        C66597bw bwVar3 = (C66597bw) bvVar.build();
        C66614cl clVar = (C66614cl) C66615cm.f181220j.createBuilder();
        clVar.copyOnWrite();
        C66615cm cmVar = (C66615cm) clVar.instance;
        bwVar3.getClass();
        cmVar.f181226d = bwVar3;
        cmVar.f181223a = 1 | cmVar.f181223a;
        clVar.copyOnWrite();
        C66615cm cmVar2 = (C66615cm) clVar.instance;
        bwVar3.getClass();
        cmVar2.f181228f = bwVar3;
        cmVar2.f181223a |= 2;
        optional.ifPresent(new C17261c(this, clVar));
        C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
        cdVar.mo58885m(C66615cm.f181221k, (C66615cm) clVar.build());
        return (C66607ce) cdVar.build();
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo23246c(Consumer consumer) {
        return C60866ct.f164955a;
    }
}
