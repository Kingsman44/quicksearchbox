package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9342a;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124182b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124184c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124186b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.a.j */
/* compiled from: PG */
public final class C124180j implements C124184c {

    /* renamed from: b */
    private static final Duration f342934b = Duration.ofSeconds(5);

    /* renamed from: a */
    public final C124178h f342935a;

    /* renamed from: c */
    private final C60888db f342936c;

    public C124180j(C124178h hVar, C60888db dbVar) {
        this.f342935a = hVar;
        this.f342936c = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo106322a(C124186b bVar, C124182b bVar2, Executor executor) {
        return C60856cj.m92908q(C2169h.m6027a(new C124179i(this, bVar, bVar2, executor)), f342934b.toMillis(), TimeUnit.MILLISECONDS, this.f342936c);
    }
}
