package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.p1199b;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15803m;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1197f.C15886a;
import com.google.android.libraries.search.assistant.p2782r.C36379e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.f.b.d */
/* compiled from: PG */
public final class C15906d implements C15886a {

    /* renamed from: a */
    public static final /* synthetic */ int f47228a = 0;

    /* renamed from: b */
    private final C36379e f47229b;

    /* renamed from: c */
    private final Executor f47230c;

    /* renamed from: d */
    private final C69464a f47231d;

    public C15906d(C36379e eVar, Executor executor, C69464a aVar) {
        this.f47229b = eVar;
        this.f47230c = executor;
        this.f47231d = aVar;
    }

    /* renamed from: a */
    public final C15785a mo22600a() {
        return C15803m.f47031a;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        if (!((Boolean) this.f47231d.mo17428b()).booleanValue()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return C47633f.m84733g(this.f47229b.mo21007a()).mo51515h(C15903a.f47225a, this.f47230c).mo51513e(TimeoutException.class, C15904b.f47226a, this.f47230c);
    }
}
