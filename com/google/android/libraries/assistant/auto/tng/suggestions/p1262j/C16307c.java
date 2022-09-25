package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import android.content.Intent;
import com.google.android.libraries.assistant.auto.tng.p1098n.p1100b.C15465a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1228e.C16183a;
import com.google.android.libraries.assistant.pcp.p1573k.C18914ac;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.c */
/* compiled from: PG */
public final class C16307c {

    /* renamed from: a */
    public final C16183a f47993a;

    /* renamed from: b */
    public final Executor f47994b;

    /* renamed from: c */
    public final C18914ac f47995c;

    /* renamed from: d */
    private final C32240a f47996d;

    /* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.c$a */
    /* compiled from: PG */
    public interface C16308a {
        /* renamed from: dQ */
        C15465a mo22882dQ();
    }

    public C16307c(C32240a aVar, C16183a aVar2, C18914ac acVar, Executor executor) {
        this.f47996d = aVar;
        this.f47993a = aVar2;
        this.f47995c = acVar;
        this.f47994b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo22881a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            C60870cx a = this.f47996d.f86461a.mo104411a(C16308a.class);
            C16306b bVar = new C16306b(parseUri);
            return C60922j.m93045h(a, C47810es.m84966f(bVar), this.f47994b);
        } catch (URISyntaxException e) {
            return C60856cj.m92899h(e);
        }
    }
}
