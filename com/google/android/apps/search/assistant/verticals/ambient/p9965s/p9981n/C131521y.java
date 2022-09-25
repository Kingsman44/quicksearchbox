package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import com.google.common.base.C58817ah;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58148f;
import java.util.concurrent.ConcurrentLinkedQueue;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.y */
/* compiled from: PG */
public final /* synthetic */ class C131521y implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ConcurrentLinkedQueue f359382a;

    /* renamed from: b */
    public final /* synthetic */ String f359383b;

    /* renamed from: c */
    public final /* synthetic */ C58148f f359384c;

    /* renamed from: d */
    public final /* synthetic */ String f359385d;

    /* renamed from: e */
    public final /* synthetic */ Optional f359386e;

    public /* synthetic */ C131521y(ConcurrentLinkedQueue concurrentLinkedQueue, String str, C58148f fVar, String str2, Optional optional) {
        this.f359382a = concurrentLinkedQueue;
        this.f359383b = str;
        this.f359384c = fVar;
        this.f359385d = str2;
        this.f359386e = optional;
    }

    public final Object apply(Object obj) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f359382a;
        String str = this.f359383b;
        C58148f fVar = this.f359384c;
        String str2 = this.f359385d;
        Optional optional = this.f359386e;
        if (((Boolean) obj).booleanValue()) {
            return Optional.m71637of(new C131433a(fVar, str, str2, (Instant) optional.get()));
        }
        concurrentLinkedQueue.add(str);
        return Optional.empty();
    }
}
