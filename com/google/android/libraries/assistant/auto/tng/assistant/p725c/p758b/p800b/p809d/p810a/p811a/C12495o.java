package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13059e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60901do;
import com.google.p4449cd.p4456g.C57996c;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.o */
/* compiled from: PG */
final class C12495o implements C12488h {

    /* renamed from: a */
    public final C13059e f39394a;

    /* renamed from: b */
    public final C12502v f39395b;

    /* renamed from: c */
    public C2164c f39396c;

    /* renamed from: d */
    public C57996c f39397d;

    /* renamed from: e */
    public boolean f39398e = false;

    /* renamed from: f */
    final /* synthetic */ C12496p f39399f;

    /* renamed from: g */
    private final C60870cx f39400g;

    public C12495o(C12496p pVar, C13059e eVar, C12502v vVar) {
        this.f39399f = pVar;
        this.f39394a = eVar;
        this.f39395b = vVar;
        this.f39400g = C2169h.m6027a(new C12491k(this));
    }

    /* renamed from: g */
    private final void m28593g(Runnable runnable, Throwable th) {
        this.f39399f.f39402b.execute(C47810es.m84977q(new C12494n(this, runnable, th)));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        this.f39399f.f39402b.execute(C47810es.m84977q(new C12493m(this, (MessageLite) obj)));
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f39399f.f39402b.execute(C47810es.m84977q(new C12489i(this, cVar)));
    }

    /* renamed from: e */
    public final C60870cx mo20633e() {
        return this.f39400g;
    }

    /* renamed from: f */
    public final void mo20634f() {
        m28593g(new C12492l(this), (Throwable) null);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        m28593g(C60901do.f165001a, (Throwable) null);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        m28593g(C60901do.f165001a, th);
    }
}
