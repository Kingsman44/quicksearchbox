package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33232j;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.q */
/* compiled from: PG */
public final class C33258q {

    /* renamed from: a */
    public final String f88925a;

    /* renamed from: b */
    public final Optional f88926b;

    /* renamed from: c */
    public final long f88927c;

    /* renamed from: d */
    public final boolean f88928d;

    public C33258q(String str, C52393qb qbVar, boolean z) {
        this.f88925a = str;
        this.f88927c = C33232j.m61629c(qbVar, str);
        this.f88928d = z;
        this.f88926b = Optional.empty();
    }

    public C33258q(String str, C52397qf qfVar, boolean z) {
        this.f88925a = str;
        Optional of = Optional.m71637of(qfVar);
        this.f88926b = of;
        this.f88928d = z;
        if ((((C52397qf) of.get()).f137493a & 2) != 0) {
            C52393qb qbVar = ((C52397qf) of.get()).f137501i;
            this.f88927c = C33232j.m61629c(qbVar == null ? C52393qb.f137479e : qbVar, str);
            return;
        }
        this.f88927c = Instant.now().toEpochMilli();
    }
}
