package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1061a.p1062a;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p819f.C12610c;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12987e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13006x;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13042d;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.C14009a;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.C14043e;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b.C14016a;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b.C14020e;
import com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b.C14027l;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15488n;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58851bo;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.c */
/* compiled from: PG */
public final class C14012c implements C14016a {

    /* renamed from: a */
    final C14043e f42617a;

    /* renamed from: b */
    private final C60887da f42618b;

    /* renamed from: c */
    private final C14027l f42619c;

    /* renamed from: d */
    private final C32240a f42620d;

    /* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.c$a */
    /* compiled from: PG */
    public interface C14013a {
        /* renamed from: dU */
        C15488n mo21386dU();
    }

    /* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.a.a.c$b */
    /* compiled from: PG */
    public interface C14014b {
        /* renamed from: dq */
        C12610c mo21387dq();
    }

    public C14012c(C14043e eVar, C60887da daVar, C14027l lVar, C32240a aVar) {
        this.f42617a = eVar;
        this.f42618b = daVar;
        this.f42620d = aVar;
        this.f42619c = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo21385a() {
        C14027l lVar = this.f42619c;
        C12987e eVar = (C12987e) C12991i.f40380k.createBuilder();
        C12989g gVar = C12989g.AUTO_PROJECTED;
        eVar.copyOnWrite();
        C12991i iVar = (C12991i) eVar.instance;
        iVar.f40385d = gVar.f40378e;
        iVar.f40382a |= 4;
        C13006x xVar = (C13006x) C13007y.f40413d.createBuilder();
        xVar.copyOnWrite();
        C13007y yVar = (C13007y) xVar.instance;
        yVar.f40415a |= 2;
        yVar.f40417c = "and.gsa.gearhead.news.text";
        long nextLong = C58851bo.f156649a.nextLong();
        xVar.copyOnWrite();
        C13007y yVar2 = (C13007y) xVar.instance;
        yVar2.f40415a |= 1;
        yVar2.f40416b = nextLong;
        C13007y yVar3 = (C13007y) xVar.build();
        eVar.copyOnWrite();
        C12991i iVar2 = (C12991i) eVar.instance;
        yVar3.getClass();
        iVar2.f40383b = yVar3;
        iVar2.f40382a |= 1;
        eVar.mo58885m(C13042d.f40481n, C13042d.f40480m);
        C60870cx g = C60922j.m93044g(this.f42620d.f86461a.mo104411a(C14014b.class), C47810es.m84963c(C14011b.f42616a), this.f42618b);
        C60870cx g2 = C60922j.m93044g(this.f42620d.f86461a.mo104411a(C14013a.class), C47810es.m84963c(C14010a.f42615a), this.f42618b);
        C60887da daVar = this.f42618b;
        C46459k.m82829b(C60922j.m93044g(g, C47810es.m84963c(new C14020e(lVar, (C12991i) eVar.build(), g2, daVar)), daVar), "Failed to send PlayNarrativeNews Request", new Object[0]);
        C14043e eVar2 = this.f42617a;
        return C47633f.m84733g(C2169h.m6027a(new C14009a(eVar2))).mo51517j(5000, TimeUnit.MILLISECONDS, eVar2.f42664c);
    }
}
