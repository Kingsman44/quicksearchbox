package com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C13007y;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13829a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.d.a.i */
/* compiled from: PG */
public abstract class C13838i implements C13829a {
    /* renamed from: a */
    public abstract long mo21270a();

    /* renamed from: b */
    public final C60870cx mo21271b() {
        if (!mo21274e()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx b = mo21287f().mo21280c().mo20543b();
        C13836g gVar = C13836g.f42135a;
        return C60922j.m93044g(b, C47810es.m84963c(gVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo21272c() {
        if (!mo21274e()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx b = mo21287f().mo21280c().mo20543b();
        C13835f fVar = C13835f.f42134a;
        return C60922j.m93044g(b, C47810es.m84963c(fVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final Optional mo21273d() {
        C12991i iVar;
        if (mo21274e()) {
            iVar = mo21287f().mo21280c().mo20542a();
        } else {
            iVar = mo21287f().mo21275a().mo20486a();
        }
        C13007y yVar = iVar.f40383b;
        if (yVar == null) {
            yVar = C13007y.f40413d;
        }
        return Optional.m71637of(Long.valueOf(yVar.f40416b));
    }

    /* renamed from: e */
    public final boolean mo21274e() {
        return mo21287f().mo21276b() == 2;
    }

    /* renamed from: f */
    public abstract C13840k mo21287f();
}
