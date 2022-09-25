package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import com.google.assistant.p4008y.p4009a.C53608q;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C127702r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127678aa f351577a;

    /* renamed from: b */
    public final /* synthetic */ boolean f351578b;

    /* renamed from: c */
    public final /* synthetic */ Duration f351579c;

    public /* synthetic */ C127702r(C127678aa aaVar, boolean z, Duration duration) {
        this.f351577a = aaVar;
        this.f351578b = z;
        this.f351579c = duration;
    }

    public final C60870cx apply(Object obj) {
        C127678aa aaVar = this.f351577a;
        return C60856cj.m92908q(aaVar.f351517e.f351521d.mo108179a((C53608q) ((C58833ax) obj).mo56107c(), this.f351578b), this.f351579c.toMillis(), TimeUnit.MILLISECONDS, aaVar.f351517e.f351525h);
    }
}
